package com.dd.rpgcardapp.repository

import com.dd.rpgcardapp.data.Profession
import com.dd.rpgcardapp.data.ProfessionPaths
import com.google.android.gms.tasks.Task
import com.google.android.gms.tasks.Tasks
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QuerySnapshot

class ProfessionRepository(private val db: FirebaseFirestore) {

    fun saveNewProfession(
        characterRef: DocumentReference,
        profession: Profession,
        attributesData: Map<String, Int>,
        professionChangeType: ProfessionChangeType, // Nowy parametr
        onSuccess: () -> Unit,
        onFailure: (Exception) -> Unit
    ) {
        // 1. Najpierw sprawdź czy istnieje aktualna profesja do przeniesienia
        moveCurrentProfessionToHistory(characterRef) { success ->
            if (success) {
                // 2. Opróżnij wymagane dokumenty
                clearRequiredDocuments(characterRef) { clearSuccess ->
                    if (clearSuccess) {
                        // 3. Aktualizuj punkty doświadczenia
                        updateExperiencePoints(characterRef, professionChangeType) { pdSuccess ->
                            if (pdSuccess) {
                                // 4. Zapisz nową profesję i związane dane
                                saveNewProfessionData(characterRef, profession, attributesData, onSuccess, onFailure)
                            } else {
                                onFailure(Exception("Błąd przy aktualizacji punktów doświadczenia"))
                            }
                        }
                    } else {
                        onFailure(Exception("Błąd przy opróżnianiu dokumentów"))
                    }
                }
            } else {
                onFailure(Exception("Błąd przy przenoszeniu profesji do historii"))
            }
        }
    }

    private fun updateExperiencePoints(
        characterRef: DocumentReference,
        changeType: ProfessionChangeType,
        callback: (Boolean) -> Unit
    ) {
        characterRef.get()
            .addOnSuccessListener { document ->
                if (document.exists()) {
                    val currentOwnedPD = (document.getString("ownedPD")?.toIntOrNull() ?: 0)
                    val pdCost = when (changeType) {
                        ProfessionChangeType.SLAVE -> 0
                        ProfessionChangeType.COMMON -> 200
                        ProfessionChangeType.EXIT -> 100
                    }

                    val newOwnedPD = maxOf(0, currentOwnedPD - pdCost)

                    // Aktualizuj ownedPD w dokumencie
                    characterRef.update("ownedPD", newOwnedPD.toString())
                        .addOnSuccessListener {
                            callback(true)
                        }
                        .addOnFailureListener {
                            callback(false)
                        }
                } else {
                    callback(false)
                }
            }
            .addOnFailureListener {
                callback(false)
            }
    }

    private fun moveCurrentProfessionToHistory(
        characterRef: DocumentReference,
        callback: (Boolean) -> Unit
    ) {
        // Pobierz aktualną profesję
        characterRef.collection("profession").document("owned").get()
            .addOnSuccessListener { document ->
                if (document.exists() && document.contains("professionName")) {
                    val currentProfessionName = document.getString("professionName")
                    if (!currentProfessionName.isNullOrBlank()) {
                        // Przenieś aktualną profesję do historii
                        addProfessionToHistory(characterRef, currentProfessionName) { historySuccess ->
                            callback(historySuccess)
                        }
                    } else {
                        // Brak aktualnej profesji, kontynuuj
                        callback(true)
                    }
                } else {
                    // Brak dokumentu z profesją, kontynuuj
                    callback(true)
                }
            }
            .addOnFailureListener {
                callback(false)
            }
    }

    private fun addProfessionToHistory(
        characterRef: DocumentReference,
        professionName: String,
        callback: (Boolean) -> Unit
    ) {
        val endedRef = characterRef.collection("profession").document("ended")

        // Pobierz aktualną historię
        endedRef.get()
            .addOnSuccessListener { document ->
                val currentHistory = if (document.exists()) {
                    document.data?.toMutableMap() ?: mutableMapOf()
                } else {
                    mutableMapOf<String, Any>()
                }

                // Znajdź najwyższy indeks
                val maxIndex = currentHistory.keys
                    .mapNotNull { it.toIntOrNull() }
                    .maxOrNull() ?: -1

                val nextIndex = maxIndex + 1

                // Dodaj nową profesję z kolejnym indeksem
                currentHistory[nextIndex.toString()] = professionName

                // Zapisz zaktualizowaną historię
                endedRef.set(currentHistory)
                    .addOnSuccessListener {
                        callback(true)
                    }
                    .addOnFailureListener {
                        callback(false)
                    }
            }
            .addOnFailureListener {
                callback(false)
            }
    }

    private fun clearRequiredDocuments(
        characterRef: DocumentReference,
        callback: (Boolean) -> Unit
    ) {
        val documentsToDelete = mapOf(
            "abilities/MustHave" to emptyMap<String, Any>(),
            "abilities/AbilitiesGroups" to emptyMap<String, Any>(),
            "skills/MustHave" to emptyMap<String, Any>(),
            "skills/SkillsGroups" to emptyMap<String, Any>()
        )

        val tasks = documentsToDelete.map { (path, data) ->
            characterRef.collection(path.substringBefore("/"))
                .document(path.substringAfter("/"))
                .set(data)
        }

        Tasks.whenAllSuccess<Void>(*tasks.toTypedArray())
            .addOnSuccessListener {
                callback(true)
            }
            .addOnFailureListener {
                callback(false)
            }
    }

    private fun saveNewProfessionData(
        characterRef: DocumentReference,
        profession: Profession,
        attributesData: Map<String, Int>,
        onSuccess: () -> Unit,
        onFailure: (Exception) -> Unit
    ) {
        val professionData = hashMapOf(
            "professionName" to profession.name
        )

        val tasks = mutableListOf<Task<Void>>()

        // Zapisz nazwę profesji
        tasks.add(characterRef.collection("profession").document("owned").set(professionData))

        // Zapisz atrybuty
        tasks.add(characterRef.collection("attributes").document("progression").set(attributesData))

        // Dodaj ścieżki wyjściowe
        addExitPaths(characterRef, profession, tasks)

        // Pobierz posiadane abilities i skills przed zapisem nowych
        getOwnedAbilitiesAndSkills(characterRef) { ownedAbilities, ownedSkills ->
            // Zapisz nowe abilities i skills
            saveNewAbilitiesAndSkills(characterRef, profession, ownedAbilities, ownedSkills, tasks) {
                // Wykonaj wszystkie zadania
                Tasks.whenAllSuccess<Void>(*tasks.toTypedArray())
                    .addOnSuccessListener {
                        onSuccess()
                    }
                    .addOnFailureListener { e ->
                        onFailure(e)
                    }
            }
        }
    }

    private fun addExitPaths(
        characterRef: DocumentReference,
        profession: Profession,
        tasks: MutableList<Task<Void>>
    ) {
        val professionPaths = ProfessionPaths.paths[profession]
        professionPaths?.exit?.let { exitPaths ->
            val exitPathDataList = exitPaths.map { exitProfession ->
                hashMapOf("name" to exitProfession.name)
            }
            tasks.add(
                characterRef.collection("profession")
                    .document("exitpath")
                    .update("exitPaths", FieldValue.arrayUnion(*exitPathDataList.toTypedArray()))
            )
        }
    }

    private fun getOwnedAbilitiesAndSkills(
        characterRef: DocumentReference,
        callback: (List<Map<String, Any>>, List<Map<String, Any>>) -> Unit
    ) {
        val abilitiesTask = characterRef.collection("abilities").get()
        val skillsTask = characterRef.collection("skills").get()

        Tasks.whenAllSuccess<Any>(abilitiesTask, skillsTask)
            .addOnSuccessListener { results ->
                val abilitiesSnapshot = results[0] as QuerySnapshot
                val skillsSnapshot = results[1] as QuerySnapshot

                val ownedAbilities = mutableListOf<Map<String, Any>>()
                val ownedSkills = mutableListOf<Map<String, Any>>()

                // Pobierz wszystkie abilities
                abilitiesSnapshot.documents.forEach { doc ->
                    val owned = doc.get("owned") as? List<Map<String, Any>> ?: emptyList()
                    ownedAbilities.addAll(owned)
                }

                // Pobierz wszystkie skills
                skillsSnapshot.documents.forEach { doc ->
                    val owned = doc.get("owned") as? List<Map<String, Any>> ?: emptyList()
                    ownedSkills.addAll(owned)
                }

                callback(ownedAbilities, ownedSkills)
            }
            .addOnFailureListener {
                callback(emptyList(), emptyList())
            }
    }

    private fun saveNewAbilitiesAndSkills(
        characterRef: DocumentReference,
        profession: Profession,
        ownedAbilities: List<Map<String, Any>>,
        ownedSkills: List<Map<String, Any>>,
        tasks: MutableList<Task<Void>>,
        callback: () -> Unit
    ) {
        // Sprawdź które abilities można dodać (maksymalnie 3 wystąpienia)
        val abilityCountMap = mutableMapOf<String, Int>()
        ownedAbilities.forEach { ability ->
            val name = ability["name"] as? String ?: ""
            abilityCountMap[name] = (abilityCountMap[name] ?: 0) + 1
        }

        // Sprawdź które skills można dodać (nie mogą się powtarzać)
        val ownedSkillNames = ownedSkills.mapNotNull { it["name"] as? String }.toSet()

        // Przygotuj abilities do zapisania - tylko filtruj MustHave
        val newMustHaveAbilities = profession.abilities.filter { ability ->
            (abilityCountMap[ability.name] ?: 0) < 3
        }

        // Zapisz całe grupy abilities
        val newAbilitiesGroups = profession.optionalAbility.map { group ->
            group.filter { ability ->
                (abilityCountMap[ability.name] ?: 0) < 3
            }
        }.filter { it.isNotEmpty() }

        // Przygotuj skills do zapisania - tylko filtruj MustHave
        val newMustHaveSkills = profession.skills.filter { skill ->
            skill.name !in ownedSkillNames
        }

        // Zapisz całe grupy skills bez filtrowania
        val newSkillsGroups = profession.optionalSkills.map { group ->
            group.filter { skill ->
                skill.name !in ownedSkillNames
            }
        }.filter { it.isNotEmpty() }

        // Walidacja danych przed zapisem
        if (!validateAbilitiesAndSkills(newMustHaveAbilities, newAbilitiesGroups, newMustHaveSkills, newSkillsGroups)) {
            callback() // Przerwij jeśli dane są nieprawidłowe
            return
        }

        // Zapisz abilities - tylko jeśli są jakieś do zapisania
        if (newMustHaveAbilities.isNotEmpty() || newAbilitiesGroups.isNotEmpty()) {
            saveAbilities(characterRef, newMustHaveAbilities, newAbilitiesGroups, tasks)
        }

        // Zapisz skills - tylko jeśli są jakieś do zapisania
        if (newMustHaveSkills.isNotEmpty() || newSkillsGroups.isNotEmpty()) {
            saveSkills(characterRef, newMustHaveSkills, newSkillsGroups, tasks)
        }

        callback()
    }

    private fun validateAbilitiesAndSkills(
        mustHaveAbilities: List<com.dd.rpgcardapp.data.Ability>,
        abilitiesGroups: List<List<com.dd.rpgcardapp.data.Ability>>,
        mustHaveSkills: List<com.dd.rpgcardapp.data.Skill>,
        skillsGroups: List<List<com.dd.rpgcardapp.data.Skill>>
    ): Boolean {
        // Sprawdź czy abilities mają wymagane pola
        mustHaveAbilities.forEach { ability ->
            if (ability.name.isBlank() || ability.attribute.isBlank()) {
                return false
            }
        }

        // Sprawdź grupy abilities
        abilitiesGroups.forEach { group ->
            group.forEach { ability ->
                if (ability.name.isBlank() || ability.attribute.isBlank()) {
                    return false
                }
            }
        }

        // Sprawdź czy skills mają wymagane pola
        mustHaveSkills.forEach { skill ->
            if (skill.name.isBlank() || skill.description.isBlank()) {
                return false
            }
        }

        // Sprawdź grupy skills
        skillsGroups.forEach { group ->
            group.forEach { skill ->
                if (skill.name.isBlank() || skill.description.isBlank()) {
                    return false
                }
            }
        }

        return true
    }

    private fun saveAbilities(
        characterRef: DocumentReference,
        mustHaveAbilities: List<com.dd.rpgcardapp.data.Ability>,
        abilitiesGroups: List<List<com.dd.rpgcardapp.data.Ability>>,
        tasks: MutableList<Task<Void>>
    ) {
        // Zapisz obowiązkowe abilities
        if (mustHaveAbilities.isNotEmpty()) {
            val abilitiesData = hashMapOf(
                "all" to mustHaveAbilities.map { ability ->
                    hashMapOf(
                        "name" to ability.name,
                        "attribute" to ability.attribute
                    )
                }
            )
            tasks.add(characterRef.collection("abilities").document("MustHave").set(abilitiesData))
        }

        // Zapisz grupy abilities do wyboru - UPROSZCZONA WERSJA
        if (abilitiesGroups.isNotEmpty()) {
            // Bezpośrednio zapisz grupy jako group_0, group_1, etc.
            val groupsMap = hashMapOf<String, List<Map<String, String>>>()

            abilitiesGroups.forEachIndexed { index, group ->
                val groupData = group.map { ability ->
                    hashMapOf(
                        "name" to ability.name,
                        "attribute" to ability.attribute
                    )
                }
                groupsMap["group_$index"] = groupData
            }

            tasks.add(characterRef.collection("abilities").document("AbilitiesGroups").set(groupsMap))
        }
    }

    private fun saveSkills(
        characterRef: DocumentReference,
        mustHaveSkills: List<com.dd.rpgcardapp.data.Skill>,
        skillsGroups: List<List<com.dd.rpgcardapp.data.Skill>>,
        tasks: MutableList<Task<Void>>
    ) {
        // Zapisz obowiązkowe skills
        if (mustHaveSkills.isNotEmpty()) {
            val skillsData = hashMapOf(
                "all" to mustHaveSkills.map { skill ->
                    hashMapOf(
                        "name" to skill.name,
                        "description" to skill.description
                    )
                }
            )
            tasks.add(characterRef.collection("skills").document("MustHave").set(skillsData))
        }

        // Zapisz grupy skills do wyboru - UPROSZCZONA WERSJA
        if (skillsGroups.isNotEmpty()) {
            // Bezpośrednio zapisz grupy jako group_0, group_1, etc.
            val groupsMap = hashMapOf<String, List<Map<String, String>>>()

            skillsGroups.forEachIndexed { index, group ->
                val groupData = group.map { skill ->
                    hashMapOf(
                        "name" to skill.name,
                        "description" to skill.description
                    )
                }
                groupsMap["group_$index"] = groupData
            }

            tasks.add(characterRef.collection("skills").document("SkillsGroups").set(groupsMap))
        }
    }
}
