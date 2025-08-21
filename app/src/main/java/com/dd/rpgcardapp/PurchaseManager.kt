package com.dd.rpgcardapp.utils

import android.content.Context
import com.dd.rpgcardapp.R
import com.dd.rpgcardapp.data.Ability
import com.dd.rpgcardapp.data.Skill
import com.dd.rpgcardapp.data.getAbilityCategory
import com.dd.rpgcardapp.data.getSkillCategory
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.WriteBatch

class PurchaseManager(
    private val context: Context,
    private val db: FirebaseFirestore,
    private val userId: String,
    private val characterDocId: String
) {

    data class PurchaseableItem(
        val name: String,
        val description: String,
        val attribute: String? = null,
        val sourceType: SourceType,
        val sourceLocation: String,
        val groupId: String? = null,
        val itemData: Map<String, Any>
    )

    enum class SourceType {
        OPTIONAL,
        MUST_HAVE,
        GROUP
    }

    private val characterRef = db.collection("users")
        .document(userId)
        .collection("characters")
        .document(characterDocId)

    fun loadAllPurchaseableItems(
        onSuccess: (abilities: List<PurchaseableItem>, skills: List<PurchaseableItem>) -> Unit,
        onFailure: (Exception) -> Unit
    ) {
        val abilities = mutableListOf<PurchaseableItem>()
        val skills = mutableListOf<PurchaseableItem>()

        // Pobierz wszystkie źródła równolegle
        val tasks = listOf(
            // Abilities
            characterRef.collection("abilities").document("Optional").get(),
            characterRef.collection("abilities").document("MustHave").get(),
            characterRef.collection("abilities").document("AbilitiesGroups").get(),
            // Skills
            characterRef.collection("skills").document("Optional").get(),
            characterRef.collection("skills").document("MustHave").get(),
            characterRef.collection("skills").document("SkillsGroups").get()
        )

        com.google.android.gms.tasks.Tasks.whenAllSuccess<DocumentSnapshot>(tasks)
            .addOnSuccessListener { documents ->
                try {
                    // Abilities Optional
                    val abilitiesOptional = documents[0]
                    processOptionalItems(abilitiesOptional, abilities, true, SourceType.OPTIONAL)

                    // Abilities MustHave
                    val abilitiesMustHave = documents[1]
                    processOptionalItems(abilitiesMustHave, abilities, true, SourceType.MUST_HAVE)

                    // Abilities Groups
                    val abilitiesGroups = documents[2]
                    processGroupItems(abilitiesGroups, abilities, true)

                    // Skills Optional
                    val skillsOptional = documents[3]
                    processOptionalItems(skillsOptional, skills, false, SourceType.OPTIONAL)

                    // Skills MustHave
                    val skillsMustHave = documents[4]
                    processOptionalItems(skillsMustHave, skills, false, SourceType.MUST_HAVE)

                    // Skills Groups
                    val skillsGroups = documents[5]
                    processGroupItems(skillsGroups, skills, false)

                    onSuccess(abilities, skills)
                } catch (e: Exception) {
                    onFailure(e)
                }
            }
            .addOnFailureListener { exception ->
                onFailure(exception)
            }
    }

    private fun processOptionalItems(
        document: DocumentSnapshot,
        targetList: MutableList<PurchaseableItem>,
        isAbility: Boolean,
        sourceType: SourceType
    ) {
        val all = document["all"] as? List<Map<String, Any>> ?: return

        for (item in all) {
            val name = item["name"] as? String ?: continue
            val description = item["description"] as? String ?: ""
            val attribute = item["attribute"] as? String

            targetList.add(PurchaseableItem(
                name = name,
                description = description,
                attribute = attribute,
                sourceType = sourceType,
                sourceLocation = if (sourceType == SourceType.OPTIONAL) "Optional" else "MustHave",
                itemData = item
            ))
        }
    }

    private fun processGroupItems(
        document: DocumentSnapshot,
        targetList: MutableList<PurchaseableItem>,
        isAbility: Boolean
    ) {
        val data = document.data ?: return

        for ((groupId, groupData) in data) {
            if (groupData is List<*>) {
                val items = groupData as List<Map<String, Any>>
                for (item in items) {
                    val name = item["name"] as? String ?: continue
                    val description = item["description"] as? String ?: ""
                    val attribute = item["attribute"] as? String

                    targetList.add(PurchaseableItem(
                        name = name,
                        description = description,
                        attribute = attribute,
                        sourceType = SourceType.GROUP,
                        sourceLocation = groupId,
                        groupId = groupId,
                        itemData = item
                    ))
                }
            }
        }
    }

    fun purchaseItem(
        item: PurchaseableItem,
        isAbility: Boolean,
        currentOwnedPD: Int,
        currentSpendPD: Int,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        if (currentOwnedPD < 100) {
            onFailure(context.getString(R.string.insufficient_pd))
            return
        }

        // Jeśli to ability, sprawdź czy nie ma już 3 takich samych
        if (isAbility) {
            checkAbilityLimit(item, currentOwnedPD, currentSpendPD, onSuccess, onFailure)
        } else {
            // Dla skills używaj oryginalnej logiki
            when (item.sourceType) {
                SourceType.OPTIONAL -> {
                    handleOptionalPurchase(item, isAbility, currentOwnedPD, currentSpendPD, onSuccess, onFailure)
                }
                SourceType.MUST_HAVE -> {
                    handleMustHavePurchase(item, isAbility, currentOwnedPD, currentSpendPD, onSuccess, onFailure)
                }
                SourceType.GROUP -> {
                    handleGroupPurchase(item, isAbility, currentOwnedPD, currentSpendPD, onSuccess, onFailure)
                }
            }
        }
    }

    private fun checkAbilityLimit(
        item: PurchaseableItem,
        currentOwnedPD: Int,
        currentSpendPD: Int,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        val categoryName = getCategoryName(item, true)
        val categoryDoc = characterRef.collection("abilities").document(categoryName)

        categoryDoc.get()
            .addOnSuccessListener { document ->
                val ownedAbilities = document["owned"] as? List<Map<String, Any>> ?: emptyList()

                // Policz ile razy ta ability już występuje
                val count = ownedAbilities.count {
                    (it["name"] as? String) == item.name &&
                            (it["attribute"] as? String) == item.attribute
                }

                if (count >= 3) {
                    onFailure("Możesz posiadać maksymalnie 3 takie same zdolności")
                    return@addOnSuccessListener
                }

                // Jeśli limit nie został przekroczony, kontynuuj z zakupem
                when (item.sourceType) {
                    SourceType.OPTIONAL -> {
                        handleOptionalPurchaseWithDuplicates(item, true, currentOwnedPD, currentSpendPD, onSuccess, onFailure)
                    }
                    SourceType.MUST_HAVE -> {
                        handleMustHavePurchaseWithDuplicates(item, true, currentOwnedPD, currentSpendPD, onSuccess, onFailure)
                    }
                    SourceType.GROUP -> {
                        handleGroupPurchaseWithDuplicates(item, true, currentOwnedPD, currentSpendPD, onSuccess, onFailure)
                    }
                }
            }
            .addOnFailureListener { exception ->
                onFailure(exception.message ?: context.getString(R.string.error_purchase_failed))
            }
    }

    private fun handleOptionalPurchaseWithDuplicates(
        item: PurchaseableItem,
        isAbility: Boolean,
        currentOwnedPD: Int,
        currentSpendPD: Int,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        val categoryName = getCategoryName(item, isAbility)
        val categoryDoc = characterRef.collection("abilities").document(categoryName)

        categoryDoc.get()
            .addOnSuccessListener { document ->
                val batch = db.batch()

                // Zaktualizuj PD
                updatePDInBatch(batch, currentOwnedPD, currentSpendPD)

                // Usuń z Optional
                val sourceDoc = characterRef.collection("abilities").document(item.sourceLocation)
                batch.update(sourceDoc, "all", FieldValue.arrayRemove(item.itemData))

                // Pobierz aktualną listę owned
                val currentOwned = document["owned"] as? MutableList<Map<String, Any>> ?: mutableListOf()

                // Dodaj nowy item do listy
                currentOwned.add(item.itemData)

                // Zapisz całą zaktualizowaną listę
                batch.update(categoryDoc, "owned", currentOwned)

                commitBatch(batch, onSuccess, onFailure)
            }
            .addOnFailureListener { exception ->
                onFailure(exception.message ?: context.getString(R.string.error_purchase_failed))
            }
    }

    private fun handleMustHavePurchaseWithDuplicates(
        item: PurchaseableItem,
        isAbility: Boolean,
        currentOwnedPD: Int,
        currentSpendPD: Int,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        val categoryName = getCategoryName(item, isAbility)
        val categoryDoc = characterRef.collection("abilities").document(categoryName)

        categoryDoc.get()
            .addOnSuccessListener { document ->
                val batch = db.batch()

                // Zaktualizuj PD
                updatePDInBatch(batch, currentOwnedPD, currentSpendPD)

                // Usuń z MustHave
                val sourceDoc = characterRef.collection("abilities").document(item.sourceLocation)
                batch.update(sourceDoc, "all", FieldValue.arrayRemove(item.itemData))

                // Pobierz aktualną listę owned
                val currentOwned = document["owned"] as? MutableList<Map<String, Any>> ?: mutableListOf()

                // Dodaj nowy item do listy
                currentOwned.add(item.itemData)

                // Zapisz całą zaktualizowaną listę
                batch.update(categoryDoc, "owned", currentOwned)

                commitBatch(batch, onSuccess, onFailure)
            }
            .addOnFailureListener { exception ->
                onFailure(exception.message ?: context.getString(R.string.error_purchase_failed))
            }
    }

    private fun handleGroupPurchaseWithDuplicates(
        item: PurchaseableItem,
        isAbility: Boolean,
        currentOwnedPD: Int,
        currentSpendPD: Int,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        val groupsDoc = characterRef.collection("abilities").document("AbilitiesGroups")
        val categoryName = getCategoryName(item, isAbility)
        val categoryDoc = characterRef.collection("abilities").document(categoryName)

        // Pobierz dane grupy i kategorii równolegle
        val groupTask = groupsDoc.get()
        val categoryTask = categoryDoc.get()

        com.google.android.gms.tasks.Tasks.whenAllSuccess<DocumentSnapshot>(listOf(groupTask, categoryTask))
            .addOnSuccessListener { documents ->
                val groupDocument = documents[0]
                val categoryDocument = documents[1]

                val groupData = groupDocument.data?.get(item.groupId!!) as? List<Map<String, Any>>

                if (groupData == null) {
                    onFailure(context.getString(R.string.group_not_found))
                    return@addOnSuccessListener
                }

                val batch = db.batch()

                // Zaktualizuj PD
                updatePDInBatch(batch, currentOwnedPD, currentSpendPD)

                // Usuń całą grupę
                batch.update(groupsDoc, item.groupId, FieldValue.delete())

                // Pobierz aktualną listę owned i dodaj kupiony item
                val currentOwned = categoryDocument["owned"] as? MutableList<Map<String, Any>> ?: mutableListOf()
                currentOwned.add(item.itemData)
                batch.update(categoryDoc, "owned", currentOwned)

                // Dodaj pozostałe itemy z grupy do Optional
                val remainingItems = groupData.filter { (it["name"] as? String) != item.name }
                if (remainingItems.isNotEmpty()) {
                    val optionalDoc = characterRef.collection("abilities").document("Optional")
                    for (remainingItem in remainingItems) {
                        batch.update(optionalDoc, "all", FieldValue.arrayUnion(remainingItem))
                    }
                }

                commitBatch(batch, onSuccess, onFailure)
            }
            .addOnFailureListener { exception ->
                onFailure(exception.message ?: context.getString(R.string.error_purchase_failed))
            }
    }

    private fun handleOptionalPurchase(
        item: PurchaseableItem,
        isAbility: Boolean,
        currentOwnedPD: Int,
        currentSpendPD: Int,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        val batch = db.batch()

        // Zaktualizuj PD
        updatePDInBatch(batch, currentOwnedPD, currentSpendPD)

        val collectionName = if (isAbility) "abilities" else "skills"
        val sourceDoc = characterRef.collection(collectionName).document(item.sourceLocation)

        // Usuń z Optional
        batch.update(sourceDoc, "all", FieldValue.arrayRemove(item.itemData))

        // Dodaj do odpowiedniej kategorii
        val categoryName = getCategoryName(item, isAbility)
        val categoryDoc = characterRef.collection(collectionName).document(categoryName)
        batch.update(categoryDoc, "owned", FieldValue.arrayUnion(item.itemData))

        commitBatch(batch, onSuccess, onFailure)
    }

    private fun handleMustHavePurchase(
        item: PurchaseableItem,
        isAbility: Boolean,
        currentOwnedPD: Int,
        currentSpendPD: Int,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        val batch = db.batch()

        // Zaktualizuj PD
        updatePDInBatch(batch, currentOwnedPD, currentSpendPD)

        val collectionName = if (isAbility) "abilities" else "skills"
        val sourceDoc = characterRef.collection(collectionName).document(item.sourceLocation)

        // Usuń z MustHave
        batch.update(sourceDoc, "all", FieldValue.arrayRemove(item.itemData))

        // Dodaj do odpowiedniej kategorii
        val categoryName = getCategoryName(item, isAbility)
        val categoryDoc = characterRef.collection(collectionName).document(categoryName)
        batch.update(categoryDoc, "owned", FieldValue.arrayUnion(item.itemData))

        commitBatch(batch, onSuccess, onFailure)
    }

    private fun handleGroupPurchase(
        item: PurchaseableItem,
        isAbility: Boolean,
        currentOwnedPD: Int,
        currentSpendPD: Int,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        val collectionName = if (isAbility) "abilities" else "skills"
        val groupsDocName = if (isAbility) "AbilitiesGroups" else "SkillsGroups"

        // Najpierw pobierz dane grupy
        val groupsDoc = characterRef.collection(collectionName).document(groupsDocName)

        groupsDoc.get()
            .addOnSuccessListener { groupDocument ->
                val groupData = groupDocument.data?.get(item.groupId!!) as? List<Map<String, Any>>

                if (groupData == null) {
                    onFailure(context.getString(R.string.group_not_found))
                    return@addOnSuccessListener
                }

                val batch = db.batch()

                // Zaktualizuj PD
                updatePDInBatch(batch, currentOwnedPD, currentSpendPD)

                // Usuń całą grupę
                batch.update(groupsDoc, item.groupId, FieldValue.delete())

                // Dodaj kupiony item do odpowiedniej kategorii
                val categoryName = getCategoryName(item, isAbility)
                val categoryDoc = characterRef.collection(collectionName).document(categoryName)
                batch.update(categoryDoc, "owned", FieldValue.arrayUnion(item.itemData))

                // Dodaj pozostałe itemy z grupy do Optional
                val remainingItems = groupData.filter { (it["name"] as? String) != item.name }
                if (remainingItems.isNotEmpty()) {
                    val optionalDoc = characterRef.collection(collectionName).document("Optional")
                    for (remainingItem in remainingItems) {
                        batch.update(optionalDoc, "all", FieldValue.arrayUnion(remainingItem))
                    }
                }

                commitBatch(batch, onSuccess, onFailure)
            }
            .addOnFailureListener { exception ->
                onFailure(exception.message ?: context.getString(R.string.error_purchase_failed))
            }
    }

    private fun updatePDInBatch(batch: WriteBatch, currentOwnedPD: Int, currentSpendPD: Int) {
        val newOwnedPD = currentOwnedPD - 100
        val newSpendPD = currentSpendPD + 100

        batch.update(characterRef, mapOf(
            "ownedPD" to newOwnedPD.toString(),
            "spendPD" to newSpendPD
        ))
    }

    private fun getCategoryName(item: PurchaseableItem, isAbility: Boolean): String {
        return if (isAbility) {
            val ability = Ability(item.name, item.attribute ?: "Int")
            getAbilityCategory(ability)
        } else {
            val skill = Skill(item.name, item.description)
            getSkillCategory(skill)
        }
    }

    private fun commitBatch(batch: WriteBatch, onSuccess: () -> Unit, onFailure: (String) -> Unit) {
        batch.commit()
            .addOnSuccessListener {
                onSuccess()
            }
            .addOnFailureListener { exception ->
                onFailure(exception.message ?: context.getString(R.string.error_purchase_failed))
            }
    }

    fun getAvailableItemsForDisplay(
        abilities: List<PurchaseableItem>,
        skills: List<PurchaseableItem>,
        currentPD: Int
    ): Pair<List<String>, List<String>> {
        if (currentPD < 100) return Pair(emptyList(), emptyList())

        val availableAbilities = abilities.map { getDisplayName(it) }
        val availableSkills = skills.map { getDisplayName(it) }

        return Pair(availableAbilities, availableSkills)
    }
    private fun getDisplayName(item: PurchaseableItem): String {
        val suffix = getSourceDisplayName(item)
        return if (suffix.isNotEmpty()) "${item.name} $suffix" else item.name
    }
    private fun getSourceDisplayName(item: PurchaseableItem): String {
        return when (item.sourceType) {
            SourceType.OPTIONAL -> "" // brak oznaczenia
            SourceType.MUST_HAVE -> "*" // gwiazdka
            SourceType.GROUP -> "*${item.groupId?.filter { it.isDigit() } ?: ""}" // tylko cyfry
        }
    }

    fun findItemByDisplayName(
        displayName: String,
        abilities: List<PurchaseableItem>,
        skills: List<PurchaseableItem>
    ): PurchaseableItem? {
        val itemName = displayName.substringBefore(" *").trim()
        return (abilities + skills).find { it.name == itemName }
    }
}