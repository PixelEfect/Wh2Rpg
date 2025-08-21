package com.dd.rpgcardapp

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.dd.rpgcardapp.base.BaseActivity
import com.dd.rpgcardapp.data.Ability
import com.dd.rpgcardapp.data.CommonAbilities
import com.dd.rpgcardapp.data.RareAbilities
import com.dd.rpgcardapp.data.SpecialAbilities
import com.dd.rpgcardapp.databinding.ActivityMyCardSkillsBinding
import com.dd.rpgcardapp.utils.PurchaseManager
import com.dd.rpgcardapp.utils.showAlertDialog
import com.google.android.gms.tasks.Tasks
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.dd.rpgcardapp.utils.dp
import com.dd.rpgcardapp.utils.showAlertDialogWithTiles
import com.google.firebase.firestore.DocumentSnapshot
import kotlin.math.ceil
import kotlin.reflect.KProperty1


class MyCardSkillsActivity : BaseActivity() {

    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String
    private var characterDocId: String? = null
    private var characterRace: String? = null
    private var characterProfession: String? = null
    private var characterName: String? = null
    private lateinit var binding: ActivityMyCardSkillsBinding
    private val abilitiesNames = mutableListOf<String>()
    private val skillsNames = mutableListOf<String>()
    private lateinit var purchaseManager: PurchaseManager
    private var availableAbilities = listOf<PurchaseManager.PurchaseableItem>()
    private var availableSkills = listOf<PurchaseManager.PurchaseableItem>()
    private val abilitiesDisplayNames = mutableListOf<String>()
    private val skillsDisplayNames = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyCardSkillsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableTouchToHideKeyboardAndSystemUI()



        db = Firebase.firestore
        userId = Firebase.auth.currentUser?.uid ?: ""

        // Pobierz ID dokumentu postaci
        characterDocId = intent.getStringExtra("CHARACTER_DOC_ID")
        characterRace = intent.getStringExtra("CHARACTER_RACE")
        characterProfession = intent.getStringExtra("CHARACTER_PROFESSION")
        characterName = intent.getStringExtra("CHARACTER_NAME")

        binding.nameView.text = characterName ?: getString(R.string.default_character_name)

        fetchCharacterAttributes(characterDocId!!)
        fetchCharacterSkills(characterDocId!!)


        purchaseManager = PurchaseManager(this, db, userId, characterDocId!!)

        loadPDAndAllPurchaseableItems()

        binding.exitButton.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        // Obsługa przycisku "Wstecz"
        binding.backButton.setOnClickListener {
            val intent = Intent(this@MyCardSkillsActivity,
                MyCardAttributesActivity::class.java)
            intent.putExtra("CHARACTER_DOC_ID", characterDocId)
            intent.putExtra("CHARACTER_RACE", characterRace)
            intent.putExtra("CHARACTER_PROFESSION", characterProfession)
            intent.putExtra("CHARACTER_NAME", characterName)
            startActivity(intent)
        }

        binding.abilitiesTextView.setOnClickListener {
            if (abilitiesDisplayNames.isNotEmpty()) {
                showAlertDialog(
                    context = this,
                    title = getString(R.string.ability_dialog_title),
                    items = abilitiesDisplayNames
                ) { selectedAbility ->
                    val item = purchaseManager.findItemByDisplayName(
                        selectedAbility,
                        availableAbilities,
                        availableSkills
                    )
                    if (item != null) {
                        showPurchaseConfirmation(item, isAbility = true)
                    }
                }
            }
        }

        binding.skillTextView.setOnClickListener {
            if (skillsDisplayNames.isNotEmpty()) {
                showAlertDialog(
                    context = this,
                    title = getString(R.string.skill_dialog_title),
                    items = skillsDisplayNames
                ) { selectedSkill ->
                    val item = purchaseManager.findItemByDisplayName(
                        selectedSkill,
                        availableAbilities,
                        availableSkills
                    )
                    if (item != null) {
                        showPurchaseConfirmation(item, isAbility = false)
                    }
                }
            }
        }
    }
    private fun showPurchaseConfirmation(item: PurchaseManager.PurchaseableItem, isAbility: Boolean) {
        val sourceInfo = when (item.sourceType) {
            PurchaseManager.SourceType.OPTIONAL -> "Optional"
            PurchaseManager.SourceType.MUST_HAVE -> "Must Have"
            PurchaseManager.SourceType.GROUP -> "Grupa: ${item.groupId}"
        }

        val title = getString(R.string.confirm_purchase_detailed, item.name, sourceInfo)
        val message = if (item.sourceType == PurchaseManager.SourceType.GROUP) {
            "Uwaga: Zakup z grupy spowoduje przeniesienie pozostałych elementów do Optional."
        } else {
            item.description
        }

        showAlertDialogWithTiles(
            context = this,
            title = "$title\n\n$message",
            items = listOf(getString(R.string.yes), getString(R.string.no))
        ) { choice ->
            if (choice == "Tak") {
                handleItemPurchase(item, isAbility)
            }
        }
    }

    private fun handleItemPurchase(item: PurchaseManager.PurchaseableItem, isAbility: Boolean) {
        val currentOwnedPD = binding.ownedPD.text.toString().toIntOrNull() ?: 0
        val currentSpendPD = binding.spendPD.text.toString().toIntOrNull() ?: 0

        purchaseManager.purchaseItem(
            item = item,
            isAbility = isAbility,
            currentOwnedPD = currentOwnedPD,
            currentSpendPD = currentSpendPD,
            onSuccess = {
                // Zaktualizuj UI
                binding.ownedPD.setText((currentOwnedPD - 100).toString())
                binding.spendPD.setText((currentSpendPD + 100).toString())

                // Odśwież dane
                refreshAllData()

                val messageRes = if (isAbility) R.string.ability_purchased else R.string.skill_purchased
                Toast.makeText(this, getString(messageRes, item.name), Toast.LENGTH_SHORT).show()
            },
            onFailure = { error ->
                Toast.makeText(this, error, Toast.LENGTH_SHORT).show()
            }
        )
    }

    private fun refreshAllData() {
        // Wyczyść widoki
        val rareAbilitiesColumn = findViewById<LinearLayout>(R.id.rareAbilitiesColumn)
        rareAbilitiesColumn.removeAllViews()
        val specialAbilitiesColumn = findViewById<LinearLayout>(R.id.specialAbilitiesColumn)
        specialAbilitiesColumn.removeAllViews()
        val skillColumn = findViewById<LinearLayout>(R.id.skillsMainContainer)
        skillColumn.removeAllViews()

        // Odśwież dane
        fetchCharacterAttributes(characterDocId!!)
        fetchCharacterSkills(characterDocId!!)
        loadPDAndAllPurchaseableItems()
    }

    private fun loadPDAndAllPurchaseableItems() {
        if (characterDocId != null) {
            db.collection("users").document(userId)
                .collection("characters").document(characterDocId!!)
                .get()
                .addOnSuccessListener { document ->
                    if (document.exists()) {
                        val PDData = document.data

                        val ownedPD = PDData?.get("ownedPD") as? String ?: "0"
                        val spendPD = (PDData?.get("spendPD") as? Number)?.toInt() ?: 1

                        binding.ownedPD.setText(ownedPD)
                        binding.spendPD.setText(spendPD.toString())

                        val ownedPDValue = ownedPD.toIntOrNull() ?: 0

                        // Załaduj wszystkie dostępne itemy
                        purchaseManager.loadAllPurchaseableItems(
                            onSuccess = { abilities, skills ->
                                availableAbilities = abilities
                                availableSkills = skills

                                val (displayAbilities, displaySkills) = purchaseManager.getAvailableItemsForDisplay(
                                    abilities, skills, ownedPDValue
                                )

                                abilitiesDisplayNames.clear()
                                abilitiesDisplayNames.addAll(displayAbilities)

                                skillsDisplayNames.clear()
                                skillsDisplayNames.addAll(displaySkills)

                                binding.abilitiesTextView.visibility =
                                    if (displayAbilities.isNotEmpty()) View.VISIBLE else View.GONE
                                binding.skillTextView.visibility =
                                    if (displaySkills.isNotEmpty()) View.VISIBLE else View.GONE
                            },
                            onFailure = { exception ->
                                Toast.makeText(this, "Błąd ładowania: ${exception.message}", Toast.LENGTH_SHORT).show()
                            }
                        )

                    } else {
                        println(getString(R.string.document_not_exists))
                    }
                }
                .addOnFailureListener { e ->
                    println(getString(R.string.error_loading_pd, e.toString()))
                }
        }
    }

    private fun fetchCharacterAttributes(characterDocId: String) {
        // Pobieranie danych z dokumentów "base", "obtained", "progression"
        val characterRef = db.collection("users")
            .document(userId)
            .collection("characters")
            .document(characterDocId)

        val attributesRef = characterRef.collection("attributes")
        val abilitiesCommonRef = characterRef.collection("abilities").document("Common")
        val abilitiesRareRef = characterRef.collection("abilities").document("Rare")
        val abilitiesSpecialRef = characterRef.collection("abilities").document("Special")

        // Zadania Firestore
        val baseDocTask = attributesRef.document("base").get()
        val obtainedDocTask = attributesRef.document("obtained").get()
        val abilitiesCommonTask = abilitiesCommonRef.get()
        val abilitiesRareTask = abilitiesRareRef.get()
        val abilitiesSpecialTask = abilitiesSpecialRef.get()

        // Oczekiwanie na wszystkie trzy dokumenty
        Tasks.whenAllSuccess<DocumentSnapshot>(baseDocTask, obtainedDocTask, abilitiesCommonTask, abilitiesRareTask, abilitiesSpecialTask )
            .addOnSuccessListener { documents ->
                val baseDoc = documents[0]
                val obtainedDoc = documents[1]
                val abilitiesCommonDoc = documents[2]
                val abilitiesRareDoc = documents[3]
                val abilitiesSpecialDoc = documents[4]

                val totalAttributes = listOf("Int", "K", "Odp", "Ogd", "SW", "Zr").associateWith { attr ->
                    val base = baseDoc.getLong(attr)?.toInt() ?: 0
                    val obtained = obtainedDoc.getLong(attr)?.toInt() ?: 0
                    base + obtained
                }

                val ownedCommonAbilities = (abilitiesCommonDoc.get("owned") as? List<Map<String, Any>>)
                    ?.mapNotNull { it["name"] as? String } ?: emptyList()
                val commonCounts = ownedCommonAbilities.groupingBy { it }.eachCount()

                for (i in 1..20) {
                    val nameView = findViewById<TextView>(resources.getIdentifier("nameA$i", "id", packageName))
                    val inputView = findViewById<EditText>(resources.getIdentifier("inputA$i", "id", packageName))
                    val progressBar = findViewById<VerticalProgressView>(
                        resources.getIdentifier("a${i}ProgressBar", "id", packageName)
                    )
                    val ability = getAbilityByName(nameView.text.toString())
                    if (ability != null) {
                        val attrValue = totalAttributes[ability.attribute] ?: 0
                        val count = commonCounts[ability.name] ?: 0

                        val finalValue = when (count) {
                            0 -> ceil(attrValue / 2.0).toInt()
                            1 -> attrValue
                            2 -> attrValue + 10
                            else -> attrValue + 20
                        }
                        inputView.setText(finalValue.toString())
                        progressBar?.currentPoints = count.coerceIn(0, 3)
                    } else {
                        inputView.setText("0")
                        progressBar?.currentPoints = 0
                    }
                }

                // === RARE ABILITIES ===
                val ownedRareAbilities = (abilitiesRareDoc.get("owned") as? List<Map<String, Any>>)
                    ?.mapNotNull { it["name"] as? String } ?: emptyList()
                val rareCounts = ownedRareAbilities.groupingBy { it }.eachCount()

                val rareAbilitiesMap = RareAbilities::class.members
                    .filterIsInstance<KProperty1<RareAbilities, Ability>>()
                    .map { it.get(RareAbilities) }
                    .associateBy { it.name }

                val columnB = findViewById<LinearLayout>(R.id.rareAbilitiesColumn)
                var index = 1

                rareCounts.forEach { (abilityName, count) ->
                    val ability = rareAbilitiesMap[abilityName]
                    if (ability != null) {
                        val attribute = ability.attribute
                        val attrValue = totalAttributes[attribute] ?: 0
                        val finalValue = when (count) {
                            0 -> ceil(attrValue / 2.0).toInt()
                            1 -> attrValue
                            2 -> attrValue + 10
                            else -> attrValue + 20
                        }

                        val newRow = layoutInflater.inflate(R.layout.ability_row_template, columnB, false)

                        val inputView = newRow.findViewById<EditText>(R.id.dynamicInput)
                        val progressBar = newRow.findViewById<VerticalProgressView>(R.id.dynamicProgress)
                        val nameView = newRow.findViewById<TextView>(R.id.dynamicName)

                        inputView.id = View.generateViewId()
                        inputView.setText(finalValue.toString())

                        nameView.id = View.generateViewId()
                        nameView.text = ability.name

                        progressBar.id = View.generateViewId()
                        progressBar?.currentPoints = count.coerceIn(0, 3) // Zakładam, że masz metodę setProgress(kropki)

                        columnB.addView(newRow)
                        index++
                    }
                }
                // === SPECIAL ABILITIES ===
                val ownedSpecialAbilities = (abilitiesSpecialDoc.get("owned") as? List<Map<String, Any>>)
                    ?.mapNotNull { it["name"] as? String } ?: emptyList()
                val specialCounts = ownedSpecialAbilities.groupingBy { it }.eachCount()

                val specialAbilitiesMap = SpecialAbilities::class.members
                    .filterIsInstance<KProperty1<SpecialAbilities, Ability>>()
                    .map { it.get(SpecialAbilities) }
                    .associateBy { it.name }

                val columnC = findViewById<LinearLayout>(R.id.specialAbilitiesColumn)
                var indexS = 1

                specialCounts.forEach { (abilityName, count) ->
                    val ability = specialAbilitiesMap[abilityName]
                    if (ability != null) {
                        val attribute = ability.attribute
                        val attrValue = totalAttributes[attribute] ?: 0
                        val finalValue = when (count) {
                            0 -> ceil(attrValue / 2.0).toInt()
                            1 -> attrValue
                            2 -> attrValue + 10
                            else -> attrValue + 20
                        }

                        val newRow = layoutInflater.inflate(R.layout.ability_row_template, columnC, false)

                        val inputView = newRow.findViewById<EditText>(R.id.dynamicInput)
                        val progressBar = newRow.findViewById<VerticalProgressView>(R.id.dynamicProgress)
                        val nameView = newRow.findViewById<TextView>(R.id.dynamicName)

                        inputView.id = View.generateViewId()
                        inputView.setText(finalValue.toString())

                        nameView.id = View.generateViewId()
                        nameView.text = ability.name

                        progressBar.id = View.generateViewId()
                        progressBar?.currentPoints = count.coerceIn(0, 3) // Zakładam, że masz metodę setProgress(kropki)

                        columnC.addView(newRow)
                        indexS++
                    }
                }
            }.addOnFailureListener {
                Toast.makeText(this, getString(R.string.error_loading_data, ""), Toast.LENGTH_SHORT).show()
            }
    }
    fun getAbilityByName(name: String): Ability? {
        val allAbilities = listOf(
            CommonAbilities.charakteryzacja,
            CommonAbilities.dowodzenie,
            CommonAbilities.hazard,
            CommonAbilities.jezdziectwo,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.plywanie,
            CommonAbilities.powozenie,
            CommonAbilities.przekonywanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.targowanie,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wioslarstwo,
            CommonAbilities.wspinaczka,
            CommonAbilities.wycena,
            CommonAbilities.zastraszanie
        )
        return allAbilities.firstOrNull { it.name.equals(name, ignoreCase = true) }
    }

    private fun fetchCharacterSkills(characterDocId: String) {
        val skillTypes = listOf("Common", "Weapon", "Magic", "Rune", "Knight") // Kolejność zgodna z życzeniem

        val typeTitles = mapOf(
            "Common" to getString(R.string.section_abilities),
            "Weapon" to getString(R.string.section_weapon_proficiency),
            "Magic" to getString(R.string.section_magic_abilities),
            "Rune" to getString(R.string.section_rune_knowledge),
            "Knight" to getString(R.string.section_virtues_blessings)
        )

        val characterRef = db.collection("users")
            .document(userId)
            .collection("characters")
            .document(characterDocId)
            .collection("skills")

        val tasks = skillTypes.map { type -> characterRef.document(type).get() }

        Tasks.whenAllSuccess<DocumentSnapshot>(tasks)
            .addOnSuccessListener { documents ->
                for ((index, doc) in documents.withIndex()) {
                    val type = skillTypes[index]
                    val ownedSkills = doc["owned"] as? List<Map<String, Any>> ?: continue

                    val sortedSkills = ownedSkills.sortedBy { it["name"]?.toString() ?: "" }

                    if (sortedSkills.isNotEmpty()) {
                        val sectionTitle = TextView(this).apply {
                            text = typeTitles[type] ?: type
                            setTextAppearance(R.style.DoubleLabelStyle)
                            setPadding(0, 24, 0, 8)
                            gravity = Gravity.CENTER
                        }

                        val sectionContainer = LinearLayout(this).apply {
                            orientation = LinearLayout.VERTICAL
                            layoutParams = LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.MATCH_PARENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                            )
                        }

                        for (skill in sortedSkills) {
                            val skillName = skill["name"] as? String ?: continue
                            val skillDescription = skill["description"] as? String ?: ""

                            val row = LinearLayout(this).apply {
                                layoutParams = LinearLayout.LayoutParams(
                                    LinearLayout.LayoutParams.MATCH_PARENT,
                                    LinearLayout.LayoutParams.WRAP_CONTENT
                                )
                                orientation = LinearLayout.HORIZONTAL
                                setPadding(0, 8.dp, 0, 8.dp)
                            }

                            val nameView = TextView(this).apply {
                                text = skillName
                                layoutParams = LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 2f).apply {
                                    setMargins(0, 0, 10.dp, 0)
                                }
                                setTextAppearance(R.style.DoubleLabelStyle)
                            }

                            val descriptionView = TextView(this).apply {
                                text = skillDescription
                                layoutParams = LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 3f)
                                setTextAppearance(R.style.DoubleLabelStyle)
                            }

                            row.addView(nameView)
                            row.addView(descriptionView)
                            sectionContainer.addView(row)
                        }

                        val skillsMainContainer = findViewById<LinearLayout>(R.id.skillsMainContainer)
                        skillsMainContainer.addView(sectionTitle)
                        skillsMainContainer.addView(sectionContainer)
                    }

                }
            }
            .addOnFailureListener {
                Toast.makeText(this, getString(R.string.error_loading_skills), Toast.LENGTH_SHORT).show()
            }
    }
}





