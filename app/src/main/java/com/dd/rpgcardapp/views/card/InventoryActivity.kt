package com.dd.rpgcardapp.views.card

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import com.dd.rpgcardapp.views.HomeActivity
import com.dd.rpgcardapp.R
import com.dd.rpgcardapp.base.BaseActivity
import com.dd.rpgcardapp.databinding.ActivityCharacterInventoryBinding
import com.dd.rpgcardapp.utils.SystemUIUtils
import com.dd.rpgcardapp.utils.showAlertDialog
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlin.collections.get

class InventoryActivity : BaseActivity() {

    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String
    private var characterDocId: String? = null
    private var characterRace: String? = null
    private var characterProfession: String? = null
    private var characterName: String? = null

    private lateinit var binding: ActivityCharacterInventoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCharacterInventoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableTouchToHideKeyboardAndSystemUI()

        db = Firebase.firestore
        userId = Firebase.auth.currentUser?.uid ?: ""

        // Get data from Intent
        characterDocId = intent.getStringExtra("CHARACTER_DOC_ID")
        characterRace = intent.getStringExtra("CHARACTER_RACE")
        characterProfession = intent.getStringExtra("CHARACTER_PROFESSION")
        characterName = intent.getStringExtra("CHARACTER_NAME")
        binding.headerLayout.titleTextView.text = characterName ?: getString(R.string.default_character_name)
        setupArmorPickers(binding, this)
        setupUIToHideKeyboard(binding.root)

        loadAllData()
        setupNavigation()
    }

    private fun setupNavigation() {
        binding.descriptionButton.setOnClickListener {
            saveAllData()
            navigateToBackstory()
        }

        binding.skillsButton.setOnClickListener {
            saveAllData()
            navigateToSkills()
        }

        binding.statsButton.setOnClickListener {
            saveAllData()
            navigateToStats()
        }

        binding.headerLayout.exitButton.setOnClickListener {
            saveAllData()
            navigateToHome()
        }
    }

    private fun saveAllData() {
        saveWeaponData()
        saveArmorData()
        saveMoneyData()
        saveInventoryData()
    }

    private fun saveWeaponData() {
        if (characterDocId != null) {
            val weaponData = hashMapOf(
                "weapon1" to hashMapOf(
                    "name" to binding.weapon1Name.text.toString(),
                    "power" to binding.weapon1Power.text.toString(),
                    "information" to binding.weapon1Information.text.toString()
                ),
                "weapon2" to hashMapOf(
                    "name" to binding.weapon2Name.text.toString(),
                    "power" to binding.weapon2Power.text.toString(),
                    "information" to binding.weapon2Information.text.toString()
                ),
                "weapon3" to hashMapOf(
                    "name" to binding.weapon3Name.text.toString(),
                    "power" to binding.weapon3Power.text.toString(),
                    "information" to binding.weapon3Information.text.toString()
                ),
                "weapon4" to hashMapOf(
                    "name" to binding.weapon4Name.text.toString(),
                    "power" to binding.weapon4Power.text.toString(),
                    "information" to binding.weapon4Information.text.toString()
                ),
                "weapon5" to hashMapOf(
                    "name" to binding.weapon5Name.text.toString(),
                    "power" to binding.weapon5Power.text.toString(),
                    "information" to binding.weapon5Information.text.toString()
                )
            )

            db.collection("users").document(userId)
                .collection("characters").document(characterDocId!!)
                .collection("inventory").document("weapon")
                .set(weaponData)
                .addOnSuccessListener {
                    println("Dane broni zostały pomyślnie zapisane!")
                }
                .addOnFailureListener { e ->
                    println("Błąd podczas zapisywania danych broni: $e")
                }
        }
    }

    private fun saveArmorData() {
        if (characterDocId != null) {
            val armorData = hashMapOf(
                "head" to binding.armorNumber1TextView.text.toString(),
                "rightHand" to binding.armorNumber2TextView.text.toString(),
                "leftHand" to binding.armorNumber3TextView.text.toString(),
                "body" to binding.armorNumber4TextView.text.toString(),
                "rightLeg" to binding.armorNumber5TextView.text.toString(),
                "leftLeg" to binding.armorNumber6TextView.text.toString()
            )

            db.collection("users").document(userId)
                .collection("characters").document(characterDocId!!)
                .collection("inventory").document("armor")
                .set(armorData)
                .addOnSuccessListener {
                    println("Dane zbroi zostały pomyślnie zapisane!")
                }
                .addOnFailureListener { e ->
                    println("Błąd podczas zapisywania danych zbroi: $e")
                }
        }
    }

    private fun saveMoneyData() {
        if (characterDocId != null) {
            val moneyData = hashMapOf(
                "gold" to binding.moneyGoldName.text.toString(),
                "silver" to binding.moneySilverName.text.toString(),
                "copper" to binding.moneyCopperName.text.toString()
            )

            db.collection("users").document(userId)
                .collection("characters").document(characterDocId!!)
                .collection("inventory").document("money")
                .set(moneyData)
                .addOnSuccessListener {
                    println("Dane majątku zostały pomyślnie zapisane!")
                }
                .addOnFailureListener { e ->
                    println("Błąd podczas zapisywania danych majątku: $e")
                }
        }
    }

    private fun saveInventoryData() {
        if (characterDocId != null) {
            val inventoryData = hashMapOf(
                "firstInventory" to binding.inputInventory1.text.toString(),
                "secondInventory" to binding.inputInventory2.text.toString()
            )

            db.collection("users").document(userId)
                .collection("characters").document(characterDocId!!)
                .collection("inventory").document("other")
                .set(inventoryData)
                .addOnSuccessListener {
                    println("Dane ekwipunku zostały pomyślnie zapisane!")
                }
                .addOnFailureListener { e ->
                    println("Błąd podczas zapisywania danych ekwipunku: $e")
                }
        }
    }

    private fun loadAllData() {
        loadWeaponData()
        loadArmorData()
        loadMoneyData()
        loadInventoryData()
    }

    private fun loadArmorData() {
        if (characterDocId != null) {
            db.collection("users").document(userId)
                .collection("characters").document(characterDocId!!)
                .collection("inventory").document("armor")
                .get()
                .addOnSuccessListener { document ->
                    if (document.exists()) {
                        val armorData = document.data

                        val armorNumberTextViews = listOf(
                            binding.armorNumber1TextView,
                            binding.armorNumber2TextView,
                            binding.armorNumber3TextView,
                            binding.armorNumber4TextView,
                            binding.armorNumber5TextView,
                            binding.armorNumber6TextView
                        )

                        val armorImageViews = listOf(
                            binding.armorImage1View,
                            binding.armorImage2View,
                            binding.armorImage3View,
                            binding.armorImage4View,
                            binding.armorImage5View,
                            binding.armorImage6View
                        )

                        val armorKeys = listOf("head", "rightHand", "leftHand", "body", "rightLeg", "leftLeg")

                        for (i in armorKeys.indices) {
                            val value = armorData?.get(armorKeys[i]) as? String ?: "0"
                            armorNumberTextViews[i].text = value
                            armorImageViews[i].text = value
                        }

                    } else {
                        println("Dokument 'armor' nie istnieje w inwentarzu.")
                        setInitialArmorValues()
                    }
                }
                .addOnFailureListener { e ->
                    println("Błąd podczas pobierania danych zbroi: $e")
                }
        }
    }

    private fun loadWeaponData() {
        if (characterDocId != null) {
            db.collection("users").document(userId)
                .collection("characters").document(characterDocId!!)
                .collection("inventory").document("weapon")
                .get()
                .addOnSuccessListener { document ->
                    if (document.exists()) {
                        val weaponData = document.data

                        (weaponData?.get("weapon1") as? Map<*, *>)?.let { weapon1 ->
                            binding.weapon1Name.setText(weapon1["name"] as? String ?: "")
                            binding.weapon1Power.setText(weapon1["power"] as? String ?: "")
                            binding.weapon1Information.setText(weapon1["information"] as? String ?: "")
                        }

                        (weaponData?.get("weapon2") as? Map<*, *>)?.let { weapon2 ->
                            binding.weapon2Name.setText(weapon2["name"] as? String ?: "")
                            binding.weapon2Power.setText(weapon2["power"] as? String ?: "")
                            binding.weapon2Information.setText(weapon2["information"] as? String ?: "")
                        }

                        (weaponData?.get("weapon3") as? Map<*, *>)?.let { weapon3 ->
                            binding.weapon3Name.setText(weapon3["name"] as? String ?: "")
                            binding.weapon3Power.setText(weapon3["power"] as? String ?: "")
                            binding.weapon3Information.setText(weapon3["information"] as? String ?: "")
                        }

                        (weaponData?.get("weapon4") as? Map<*, *>)?.let { weapon4 ->
                            binding.weapon4Name.setText(weapon4["name"] as? String ?: "")
                            binding.weapon4Power.setText(weapon4["power"] as? String ?: "")
                            binding.weapon4Information.setText(weapon4["information"] as? String ?: "")
                        }

                        (weaponData?.get("weapon5") as? Map<*, *>)?.let { weapon5 ->
                            binding.weapon5Name.setText(weapon5["name"] as? String ?: "")
                            binding.weapon5Power.setText(weapon5["power"] as? String ?: "")
                            binding.weapon5Information.setText(weapon5["information"] as? String ?: "")
                        }
                    } else {
                        println("Dokument 'weapon' nie istnieje w inwentarzu.")
                    }
                }
                .addOnFailureListener { e ->
                    println("Błąd podczas pobierania danych broni: $e")
                }
        }
    }

    private fun loadMoneyData() {
        if (characterDocId != null) {
            db.collection("users").document(userId)
                .collection("characters").document(characterDocId!!)
                .collection("inventory").document("money")
                .get()
                .addOnSuccessListener { document ->
                    if (document.exists()) {
                        val moneyData = document.data

                        val moneyNumberTextViews = listOf(
                            binding.moneyGoldName,
                            binding.moneySilverName,
                            binding.moneyCopperName,
                        )

                        val moneyKeys = listOf("gold", "silver", "copper")

                        for (i in moneyKeys.indices) {
                            val value = moneyData?.get(moneyKeys[i]) as? String ?: "0"
                            moneyNumberTextViews[i].setText(value)
                        }
                    }
                }
                .addOnFailureListener { e ->
                    println("Błąd podczas pobierania danych majątku: $e")
                }
        }
    }

    private fun loadInventoryData() {
        if (characterDocId != null) {
            db.collection("users").document(userId)
                .collection("characters").document(characterDocId!!)
                .collection("inventory").document("other")
                .get()
                .addOnSuccessListener { document ->
                    if (document.exists()) {
                        val inventoryData = document.data

                        val inventoryNumberTextViews = listOf(
                            binding.inputInventory1,
                            binding.inputInventory2,
                        )

                        val inventoryKeys = listOf("firstInventory", "secondInventory")

                        for (i in inventoryKeys.indices) {
                            val value = inventoryData?.get(inventoryKeys[i]) as? String ?: ""
                            inventoryNumberTextViews[i].setText(value)
                        }
                    }
                }
                .addOnFailureListener { e ->
                    println("Błąd podczas pobierania danych ekwipunku: $e")
                }
        }
    }

    // Armor picker setup
    private fun setupArmorPickers(binding: ActivityCharacterInventoryBinding, context: Context) {
        val options = (0..7).map { it.toString() }

        val pairs = listOf(
            binding.armorNumber1TextView to binding.armorImage1View,
            binding.armorNumber2TextView to binding.armorImage2View,
            binding.armorNumber3TextView to binding.armorImage3View,
            binding.armorNumber4TextView to binding.armorImage4View,
            binding.armorNumber5TextView to binding.armorImage5View,
            binding.armorNumber6TextView to binding.armorImage6View
        )

        pairs.forEach { (selector, target) ->
            selector.setOnClickListener {
                showAlertDialog(
                    context = context,
                    title = "Wybierz wartość",
                    items = options
                ) { selected ->
                    selector.text = selected
                    target.text = selected
                }
            }
        }
    }

    private fun setInitialArmorValues() {
        val armorNumberTextViews = listOf(
            binding.armorNumber1TextView,
            binding.armorNumber2TextView,
            binding.armorNumber3TextView,
            binding.armorNumber4TextView,
            binding.armorNumber5TextView,
            binding.armorNumber6TextView
        )

        val armorImageViews = listOf(
            binding.armorImage1View,
            binding.armorImage2View,
            binding.armorImage3View,
            binding.armorImage4View,
            binding.armorImage5View,
            binding.armorImage6View
        )

        for (i in armorNumberTextViews.indices) {
            armorNumberTextViews[i].text = "0"
            armorImageViews[i].text = "0"
        }
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun setupUIToHideKeyboard(view: View) {
        if (view !is EditText) {
            view.setOnTouchListener { _, _ ->
                val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                currentFocus?.let {
                    imm.hideSoftInputFromWindow(it.windowToken, 0)
                    it.clearFocus()
                }
                SystemUIUtils.hideSystemUI(this)
                false
            }
        }

        if (view is ViewGroup) {
            for (i in 0 until view.childCount) {
                setupUIToHideKeyboard(view.getChildAt(i))
            }
        }
    }

    // Navigation methods
    private fun navigateToBackstory() {
        val intent = Intent(this, BackstoryActivity::class.java).apply {
            putExtra("CHARACTER_DOC_ID", characterDocId)
            putExtra("CHARACTER_RACE", characterRace)
            putExtra("CHARACTER_PROFESSION", characterProfession)
            putExtra("CHARACTER_NAME", characterName)
            TransitionType.FADE
        }
        startActivityWithTransition(intent)
    }

    private fun navigateToSkills() {
        val intent = Intent(this, SkillsActivity::class.java).apply {
            putExtra("CHARACTER_DOC_ID", characterDocId)
            putExtra("CHARACTER_RACE", characterRace)
            putExtra("CHARACTER_PROFESSION", characterProfession)
            putExtra("CHARACTER_NAME", characterName)
            TransitionType.FADE
        }
        startActivityWithTransition(intent)
    }

    private fun navigateToStats() {
        val intent = Intent(this, StatsActivity::class.java).apply {
            putExtra("CHARACTER_DOC_ID", characterDocId)
            putExtra("CHARACTER_RACE", characterRace)
            putExtra("CHARACTER_PROFESSION", characterProfession)
            putExtra("CHARACTER_NAME", characterName)
            TransitionType.FADE
        }
        startActivityWithTransition(intent)
    }

    private fun navigateToHome() {
        startActivityWithTransition(Intent(this, HomeActivity::class.java), TransitionType.FADE)
        finish()
    }
}