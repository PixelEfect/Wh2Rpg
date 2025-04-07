package com.dd.rpgcardapp

import BaseActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.PopupWindow
import android.widget.TextView
import android.widget.Toast
import com.dd.rpgcardapp.data.Ability
import com.dd.rpgcardapp.data.Profession
import com.dd.rpgcardapp.data.ProfessionPaths
import com.dd.rpgcardapp.data.Professions
import com.dd.rpgcardapp.data.Races
import com.dd.rpgcardapp.utils.SystemUIUtils
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import java.text.Collator
import java.util.Locale

class NewCardSkillsAndAbilitiesActivity : BaseActivity() {

    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String
    private var characterDocId: String? = null

    private lateinit var inputWW: TextView
    private lateinit var inputUS: TextView
    private lateinit var inputK: TextView
    private lateinit var inputOdp: TextView
    private lateinit var inputZr: TextView
    private lateinit var inputInt: TextView
    private lateinit var inputSW: TextView
    private lateinit var inputOgd: TextView
    private lateinit var inputA: TextView
    private lateinit var inputZyw: TextView
    private lateinit var inputS: TextView
    private lateinit var inputWt: TextView
    private lateinit var inputSz: TextView
    private lateinit var inputMag: TextView
    private lateinit var inputPO: TextView
    private lateinit var inputPP: TextView
    private lateinit var buttonWW: TextView
    private lateinit var buttonUS: TextView
    private lateinit var buttonK: TextView
    private lateinit var buttonOdp: TextView
    private lateinit var buttonZr: TextView
    private lateinit var buttonInt: TextView
    private lateinit var buttonSW: TextView
    private lateinit var buttonOgd: TextView
    private lateinit var buttonA: TextView
    private lateinit var buttonZyw: TextView
    private lateinit var buttonSz: TextView
    private lateinit var buttonMag: TextView

    private var selectedMainStatButton: TextView? = null
    private val mainStatButtons = mutableMapOf<TextView, Pair<TextView, Int>>() // przycisk -> (TextView input, wartość +5)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_card_skills_and_abilities)

        db = Firebase.firestore
        userId = Firebase.auth.currentUser?.uid ?: ""

        // Pobierz ID dokumentu postaci
        characterDocId = intent.getStringExtra("CHARACTER_DOC_ID")
        val raceName = intent.getStringExtra("CHARACTER_RACE") // Nazwa rasy
        val professionName = intent.getStringExtra("CHARACTER_PROFESSION")

        if (characterDocId == null || raceName == null) {
            Toast.makeText(this, "Błąd: Brak ID postaci lub rasy", Toast.LENGTH_SHORT).show()
            finish()
            return
        }
        initViews()
        professionStatsViews()
        loadAttributes()

        val race = Races.getByName(raceName)



        val professionTextView: TextView = findViewById(R.id.professionsTextView)
        val profession = Professions.professionMap[professionName]

        if (profession != null) {
            professionTextView.text = "Profesja: ${profession.name}"
            assignProfessionStats(profession)
        } else {
            professionTextView.text = "Profesja: Nieznana"
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

    private fun initViews() {
        inputWW = findViewById(R.id.inputWW)
        inputUS = findViewById(R.id.inputUS)
        inputK = findViewById(R.id.inputK)
        inputOdp = findViewById(R.id.inputOdp)
        inputZr = findViewById(R.id.inputZr)
        inputInt = findViewById(R.id.inputInt)
        inputSW = findViewById(R.id.inputSW)
        inputOgd = findViewById(R.id.inputOgd)
        inputA = findViewById(R.id.inputA)
        inputZyw = findViewById(R.id.inputZyw)
        inputS = findViewById(R.id.inputS)
        inputWt = findViewById(R.id.inputWt)
        inputSz = findViewById(R.id.inputSz)
        inputMag = findViewById(R.id.inputMag)
        inputPO = findViewById(R.id.inputPO)
        inputPP = findViewById(R.id.inputPP)
    }

    private fun professionStatsViews() {
        buttonWW = findViewById(R.id.buttonWW)
        buttonUS = findViewById(R.id.buttonUS)
        buttonK = findViewById(R.id.buttonK)
        buttonOdp = findViewById(R.id.buttonOdp)
        buttonZr = findViewById(R.id.buttonZr)
        buttonInt = findViewById(R.id.buttonInt)
        buttonSW = findViewById(R.id.buttonSW)
        buttonOgd = findViewById(R.id.buttonOgd)
        buttonA = findViewById(R.id.buttonA)
        buttonZyw = findViewById(R.id.buttonZyw)
        buttonSz = findViewById(R.id.buttonSz)
        buttonMag = findViewById(R.id.buttonMag)
    }

    private fun assignProfessionStats(profession: Profession) {
        setStatOrHide(buttonWW, profession.ww)
        setStatOrHide(buttonUS, profession.us)
        setStatOrHide(buttonK, profession.k)
        setStatOrHide(buttonOdp, profession.odp)
        setStatOrHide(buttonZr, profession.zr)
        setStatOrHide(buttonInt, profession.int)
        setStatOrHide(buttonSW, profession.sw)
        setStatOrHide(buttonOgd, profession.ogd)
        setStatOrHide(buttonA, profession.a)
        setStatOrHide(buttonZyw, profession.zyw)
        setStatOrHide(buttonSz, profession.sz)
        setStatOrHide(buttonMag, profession.mag)

        mainStatButtons[buttonWW] = inputWW to 5
        mainStatButtons[buttonUS] = inputUS to 5
        mainStatButtons[buttonK] = inputK to 5
        mainStatButtons[buttonOdp] = inputOdp to 5
        mainStatButtons[buttonZr] = inputZr to 5
        mainStatButtons[buttonInt] = inputInt to 5
        mainStatButtons[buttonSW] = inputSW to 5
        mainStatButtons[buttonOgd] = inputOgd to 5

// Zakładamy że buttonA, buttonZyw itd. to +1
        mainStatButtons[buttonA] = inputA to 1
        mainStatButtons[buttonZyw] = inputZyw to 1
        mainStatButtons[buttonSz] = inputSz to 1
        mainStatButtons[buttonMag] = inputMag to 1

        setupButtonClickListeners()
    }

    private fun setStatOrHide(view: TextView, value: Int) {
        if (value == 0) {
            view.visibility = View.GONE
        } else {
            view.text = "+$value"
            view.visibility = View.VISIBLE
        }
    }

    private fun setupButtonClickListeners() {
        mainStatButtons.forEach { (button, pair) ->
            val (inputView, increment) = pair
            button.setOnClickListener {
                if (selectedMainStatButton == button) {
                    // Odznaczenie
                    adjustStat(inputView, -increment)
                    selectedMainStatButton = null
                    button.isSelected = false
                } else {
                    // Odznacz poprzedni
                    selectedMainStatButton?.let {
                        mainStatButtons[it]?.let { (prevInput, prevInc) ->
                            adjustStat(prevInput, -prevInc)
                            it.isSelected = false
                        }
                    }
                    // Zaznaczenie nowego
                    adjustStat(inputView, increment)
                    selectedMainStatButton = button
                    button.isSelected = true
                }
            }
        }
    }

    private fun adjustStat(textView: TextView, delta: Int) {
        val current = textView.text.toString().toIntOrNull() ?: 0
        textView.text = (current + delta).toString()
    }

    private fun loadAttributes() {
        if (userId.isEmpty() || characterDocId.isNullOrEmpty()) {
            Toast.makeText(this, "Błąd: Nie można odczytać statystyk", Toast.LENGTH_SHORT).show()
            return
        }

        db.collection("users").document(userId)
            .collection("characters").document(characterDocId!!)
            .collection("attributes").document("main_attributes")
            .get()
            .addOnSuccessListener { document ->
                if (document != null && document.exists()) {
                    inputWW.text = (document.getLong("WW") ?: 0).toString()
                    inputUS.text = (document.getLong("US") ?: 0).toString()
                    inputK.text = (document.getLong("K") ?: 0).toString()
                    inputOdp.text = (document.getLong("Odp") ?: 0).toString()
                    inputZr.text = (document.getLong("Zr") ?: 0).toString()
                    inputInt.text = (document.getLong("Int") ?: 0).toString()
                    inputSW.text = (document.getLong("SW") ?: 0).toString()
                    inputOgd.text = (document.getLong("Ogd") ?: 0).toString()

                    inputA.text = (document.getLong("A") ?: 0).toString()
                    inputZyw.text = (document.getLong("Zyw") ?: 0).toString()
                    inputS.text = (document.getLong("S") ?: 0).toString()
                    inputWt.text = (document.getLong("Wt") ?: 0).toString()
                    inputSz.text = (document.getLong("Sz") ?: 0).toString()
                    inputMag.text = (document.getLong("Mag") ?: 0).toString()
                    inputPO.text = (document.getLong("PO") ?: 0).toString()
                    inputPP.text = (document.getLong("PP") ?: 0).toString()
                } else {
                    Toast.makeText(this, "Brak zapisanych statystyk", Toast.LENGTH_SHORT).show()
                }
            }
            .addOnFailureListener { e ->
                Toast.makeText(this, "Błąd odczytu: ${e.message}", Toast.LENGTH_SHORT).show()
            }
    }

    // Funkcja do zapisywania profesji do Firestore (można rozbudować, aby zapisać więcej danych)
    private fun saveProfessionToFirestore() {


    }

}
