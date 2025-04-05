package com.dd.rpgcardapp

import BaseActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.content.Intent
import android.view.View
import android.view.WindowManager
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.PopupWindow
import androidx.appcompat.widget.PopupMenu
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import android.widget.SeekBar
import androidx.compose.ui.Modifier
import com.dd.rpgcardapp.data.AllStarSigns
import com.dd.rpgcardapp.data.Appearance
import com.dd.rpgcardapp.data.Race
import com.dd.rpgcardapp.data.Races
import com.dd.rpgcardapp.data.GroupRace
import com.dd.rpgcardapp.data.StarSign
import com.dd.rpgcardapp.data.StarSigns
import com.dd.rpgcardapp.utils.SystemUIUtils

class NewCardActivity : BaseActivity() {

    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String

    private lateinit var raceTextView: TextView
    private lateinit var ageSeekBar: SeekBar
    private lateinit var ageTextView: TextView
    private lateinit var sexTextView: TextView
    private lateinit var hairTextView: TextView
    private lateinit var eyesTextView: TextView

    private lateinit var heightSeekBar: SeekBar
    private lateinit var heightTextView: TextView
    private lateinit var weightSeekBar: SeekBar
    private lateinit var weightTextView: TextView


    private lateinit var starSignTextView: TextView

    private var selectedRace: Race = Races.Czlowiek
    private var selectedSex: String = "Mężczyzna" // Domyślna płeć
    private var selectedStarSign: StarSign = StarSigns.bebniarz

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_card)

        db = Firebase.firestore
        userId = Firebase.auth.currentUser?.uid ?: ""

        // Wyszukaj widżety
        raceTextView = findViewById(R.id.inputRaceTextView)
        ageSeekBar = findViewById(R.id.ageSeekBar)
        ageTextView = findViewById(R.id.ageView)
        sexTextView = findViewById(R.id.inputSexTextView)
        hairTextView = findViewById(R.id.inputHairTextView)

        eyesTextView = findViewById(R.id.inputEyesTextView)

        heightSeekBar = findViewById(R.id.heightSeekBar)
        heightTextView = findViewById(R.id.heightView)
        weightSeekBar = findViewById(R.id.weightSeekBar)
        weightTextView = findViewById(R.id.weightView)
        starSignTextView = findViewById(R.id.inputStarSignTextView)

        // Ustaw domyślną rasę (Człowiek) i zakres wieku
        setAgeRange(Races.Czlowiek)
        setWeightRange(Races.Czlowiek)

        raceTextView.text = Races.Czlowiek.name
        sexTextView.text = selectedSex
        starSignTextView.text = "${selectedStarSign.name}"

        raceTextView.setOnClickListener { v ->
            showPopupWindow(v, GroupRace.All.map { it.name }) { selectedRaceName ->
                val foundRace = GroupRace.All.find { it.name == selectedRaceName }
                foundRace?.let {
                    selectedRace = it
                    raceTextView.text = selectedRaceName
                    setAgeRange(it)
                    setWeightRange(it)
                    hairTextView.text = it.hair.first().name
                    eyesTextView.text = it.eyes.first().name
                    setHeightRange(it, selectedSex)
                }
            }
        }

        sexTextView.setOnClickListener { v ->
            showPopupWindow(v, listOf("Mężczyzna", "Kobieta")) { selectedSexValue ->
                selectedSex = selectedSexValue // Modyfikujemy istniejącą zmienną `selectedSex`
                sexTextView.text = selectedSex // Aktualizujemy tekst w TextView
                setHeightRange(selectedRace, selectedSex)
            }
        }

        hairTextView.setOnClickListener { v ->
            // Przekaż odpowiednią listę kolorów włosów powiązaną z wybraną rasą
            showPopupWindow(v, selectedRace.hair.map { it.name }) { selectedHairColor ->
                hairTextView.text = selectedHairColor
            }
        }

        eyesTextView.setOnClickListener { v ->
            // Przekaż odpowiednią listę kolorów włosów powiązaną z wybraną rasą
            showPopupWindow(v, selectedRace.eyes.map { it.name }) { selectedeyesColor ->
                eyesTextView.text = selectedeyesColor
            }
        }


        ageSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                ageTextView.text = "Wiek: ${progress + selectedRace.minAge}"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        weightSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                val weight = (progress * 5) + selectedRace.minWeight
                weightTextView.text = "Waga: $weight"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        // Handle star sign selection via popup
        starSignTextView.setOnClickListener { v ->
            showPopupWindow(v, getStarSignsList().map { it.name }) { selectedStarSignName ->
                val foundStarSign = getStarSignsList().find { it.name == selectedStarSignName }
                foundStarSign?.let {
                    selectedStarSign = it
                    starSignTextView.text = "$selectedStarSignName"
                }
            }
        }

        val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener {
            saveCharacterToFirestore()
        }

        val exitButton = findViewById<Button>(R.id.exitButton)
        exitButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onResume() {
        super.onResume()
        SystemUIUtils.hideSystemUI(this)
    }

    private fun showRacePopupMenu(view: View) {
        val popup = PopupMenu(this, view)
        val races = GroupRace.All
        for (race in races) {
            popup.menu.add(race.name)
        }

        popup.setOnMenuItemClickListener { item ->
            val selectedRaceName = item.title.toString()
            val foundRace = races.find { it.name == selectedRaceName }
            foundRace?.let {
                selectedRace = it
                raceTextView.text = selectedRaceName
                setAgeRange(it)
            }
            true
        }
        popup.setOnDismissListener {
            SystemUIUtils.hideSystemUI(this)
        }
        popup.show()

    }

    private fun showPopupWindow(anchor: View, options: List<String>, onItemSelected: (String) -> Unit) {
        val popupView = layoutInflater.inflate(R.layout.popup_list, null)
        val listView = popupView.findViewById<ListView>(R.id.popupListView)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, options)
        listView.adapter = adapter

        val popupWindow = PopupWindow(popupView, anchor.width, WindowManager.LayoutParams.WRAP_CONTENT, true).apply {
            isOutsideTouchable = true
            isFocusable = true
            elevation = 10f
            setBackgroundDrawable(getDrawable(android.R.color.transparent))
        }

        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = options[position]
            onItemSelected(selectedItem)
            popupWindow.dismiss()
        }

        popupWindow.setOnDismissListener {
            SystemUIUtils.hideSystemUI(this)
        }

        popupWindow.showAsDropDown(anchor)
        anchor.postDelayed({
            SystemUIUtils.hideSystemUI(this)
        }, 1)
    }

    private fun setAgeRange(race: Race) {
        ageSeekBar.max = race.maxAge - race.minAge
        ageSeekBar.progress = race.minAge
        ageTextView.text = "Wiek: ${race.minAge}"
    }

    private fun setWeightRange(race: Race) {
        weightSeekBar.max = (race.maxWeight - race.minWeight)/5
        weightSeekBar.progress = (race.minWeight/5)
        weightTextView.text = "Waga: ${race.minWeight}"
    }

    private fun getStarSignsList(): List<StarSign> {
        return AllStarSigns.All
    }

    private fun showHairColorPopupWindow(anchor: View, availableHairColors: List<Appearance>) {
        val popupView = layoutInflater.inflate(R.layout.popup_list, null)
        val listView = popupView.findViewById<ListView>(R.id.popupListView)

        // Mapujemy kolory włosów do nazw
        val hairColorNames = availableHairColors.map { it.name }

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, hairColorNames)
        listView.adapter = adapter

        val popupWindow = PopupWindow(popupView, anchor.width, WindowManager.LayoutParams.WRAP_CONTENT, true).apply {
            isOutsideTouchable = true
            isFocusable = true
            elevation = 10f
            setBackgroundDrawable(getDrawable(android.R.color.transparent))
        }

        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedHairColor = availableHairColors[position]
            hairTextView.text = selectedHairColor.name
            popupWindow.dismiss()
        }

        popupWindow.setOnDismissListener {
            SystemUIUtils.hideSystemUI(this)
        }

        popupWindow.showAsDropDown(anchor)
        anchor.postDelayed({
            SystemUIUtils.hideSystemUI(this)
        }, 1)
    }

    private fun showEyesColorPopupWindow(anchor: View, availableEyesColors: List<Appearance>) {
        val popupView = layoutInflater.inflate(R.layout.popup_list, null)
        val listView = popupView.findViewById<ListView>(R.id.popupListView)

        // Mapujemy kolory oczu do nazw
        val eyesColorNames = availableEyesColors.map { it.name }

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, eyesColorNames)
        listView.adapter = adapter

        val popupWindow = PopupWindow(popupView, anchor.width, WindowManager.LayoutParams.WRAP_CONTENT, true).apply {
            isOutsideTouchable = true
            isFocusable = true
            elevation = 10f
            setBackgroundDrawable(getDrawable(android.R.color.transparent))
        }

        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedEyesColor = availableEyesColors[position]
            eyesTextView.text = selectedEyesColor.name
            popupWindow.dismiss()
        }

        popupWindow.setOnDismissListener {
            SystemUIUtils.hideSystemUI(this)
        }

        popupWindow.showAsDropDown(anchor)
        anchor.postDelayed({
            SystemUIUtils.hideSystemUI(this)
        }, 1)
    }

    private fun setHeightRange(race: Race, sex: String) {
        var minHeight = race.minHeight
        var maxHeight = minHeight + 20

        if (sex == "Kobieta") {
            minHeight -= 10
            maxHeight -= 10

            // Dodatkowe ograniczenie dla kobiet krasnoludów
            if (race.name.lowercase().contains("krasnolud")) {
                minHeight -= 5  // czyli razem -15
                maxHeight -= 5
            }
        }

        val range = maxHeight - minHeight
        heightSeekBar.max = range
        heightSeekBar.progress = 0
        heightTextView.text = "Wzrost: ${minHeight} cm"

        heightSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                val growth = minHeight + progress
                heightTextView.text = "Wzrost: ${growth} cm"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
    }

    private fun calculateMinHeight(race: Race, sex: String): Int {
        var minHeight = race.minHeight
        if (sex == "Kobieta") {
            minHeight -= 10
            if (race.name.lowercase().contains("krasnolud")) {
                minHeight -= 5
            }
        }
        return minHeight
    }


    private fun saveCharacterToFirestore() {
        val name = findViewById<EditText>(R.id.inputName).text.toString()
        val race = raceTextView.text.toString()
        val age = ageSeekBar.progress + selectedRace.minAge
        val sex = sexTextView.text.toString()
        val eyes = eyesTextView.text.toString()
        val hair = hairTextView.text.toString()
        val growth = heightSeekBar.progress + calculateMinHeight(selectedRace, selectedSex)
        val weight = weightSeekBar.progress + selectedRace.minWeight
        val placeOfBirth = findViewById<EditText>(R.id.inputPlaceOfBirth).text.toString()
        val starSign = selectedStarSign.name
        val specialSigns = findViewById<EditText>(R.id.inputSpecialSigns).text.toString()
        val family = findViewById<EditText>(R.id.inputFamily).text.toString()
        val createdAt = FieldValue.serverTimestamp()

        val characterData = hashMapOf(
            "name" to name,
            "race" to race,
            "age" to age,
            "sex" to sex,
            "eyes" to eyes,
            "hair" to hair,
            "growth" to growth,
            "weight" to weight,
            "placeOfBirth" to placeOfBirth,
            "starSign" to starSign,
            "specialSigns" to specialSigns,
            "family" to family,
            "createdAt" to createdAt,
        )

        if (userId.isEmpty()) {
            Toast.makeText(this, "Błąd: Nie można zapisać postaci", Toast.LENGTH_SHORT).show()
            return
        }

        db.collection("users").document(userId).collection("characters")
            .add(characterData)
            .addOnSuccessListener { documentReference ->
                val documentId = documentReference.id
                Toast.makeText(this, "Karta postaci zapisana!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, StatsFormActivity::class.java).apply {
                    putExtra("CHARACTER_DOC_ID", documentId)
                }
                startActivity(intent)
                finish()
            }
            .addOnFailureListener { e ->
                Toast.makeText(this, "Błąd zapisu: ${e.message}", Toast.LENGTH_SHORT).show()
            }
    }
}