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
import com.dd.rpgcardapp.data.AbilityGroupSimplifier
import com.dd.rpgcardapp.data.Profession
import com.dd.rpgcardapp.data.ProfessionPaths
import com.dd.rpgcardapp.data.Races
import com.dd.rpgcardapp.utils.SystemUIUtils
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import java.text.Collator
import java.util.Locale

class NewCardProfessionsActivity : BaseActivity() {

    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String
    private var characterDocId: String? = null
    private var selectedProfession: Profession? = null

    private lateinit var professionsTextView: TextView
    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_card_professions)

        db = Firebase.firestore
        userId = Firebase.auth.currentUser?.uid ?: ""

        // Pobierz ID dokumentu postaci
        characterDocId = intent.getStringExtra("CHARACTER_DOC_ID")
        val raceName = intent.getStringExtra("CHARACTER_RACE") // Nazwa rasy

        if (characterDocId == null || raceName == null) {
            Toast.makeText(this, "Błąd: Brak ID postaci lub rasy", Toast.LENGTH_SHORT).show()
            finish()
        }

        val race = Races.getByName(raceName)

        if (race != null) {
            // Wyświetl dostępne profesje
            val professionNames = race.startingProfessions.map { it.name }.sortedWith(Collator.getInstance(Locale("pl", "PL")))

            professionsTextView = findViewById(R.id.inputProfessionTextView)
            professionsTextView.setOnClickListener {
                showPopupWindow(professionsTextView, professionNames) { selectedProfessionName ->
                    // Wybór profesji
                    selectedProfession = race.startingProfessions.first { it.name == selectedProfessionName }
                    professionsTextView.text = selectedProfessionName // Ustaw tekst na wybraną profesję
                    selectedProfession?.let { updateProfessionStats(it) }

                    nextButton.isEnabled = true
                }
            }

        } else {
            Toast.makeText(this, "Rasa nieznana", Toast.LENGTH_SHORT).show()
        }

        nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.isEnabled = false
        nextButton.setOnClickListener {
            saveProfessionToFirestore() // Wywołanie zapisu po kliknięciu
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        // Sprawdź, czy wybrana profesja jest dostępna
        if (selectedProfession != null) {
            // Zapisz nazwę wybranej profesji w outState
            outState.putString("selectedProfessionName", selectedProfession!!.name)
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        // Przywrócenie nazwy profesji z zapisanej instancji
        val savedProfessionName = savedInstanceState.getString("selectedProfessionName")

        if (savedProfessionName != null) {
            // Przypisanie nazwy profesji do TextView
            professionsTextView.text = savedProfessionName

            // Wyszukaj profesję na podstawie nazwy i ustaw statystyki
            val raceName = intent.getStringExtra("CHARACTER_RACE")
            val race = Races.getByName(raceName)

            if (race != null) {
                selectedProfession = race.startingProfessions.firstOrNull { it.name == savedProfessionName }
                selectedProfession?.let {
                    updateProfessionStats(it)
                    nextButton.isEnabled = true // Jeśli profesja jest wybrana, włącz przycisk "Next"
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        SystemUIUtils.hideSystemUI(this)
    }

    // Funkcja do zapisywania profesji do Firestore (można rozbudować, aby zapisać więcej danych)
    private fun saveProfessionToFirestore() {
        if (characterDocId == null || selectedProfession == null) {
            Toast.makeText(this, "Brak danych do zapisania", Toast.LENGTH_SHORT).show()
            return
        }
        val professionName = selectedProfession!!.name
        // Można tu zapisać wybraną profesję w Firestore lub na innej stronie
        val professionData = hashMapOf(
            "professionName" to professionName
        )

        db.collection("users").document(userId)
            .collection("characters").document(characterDocId!!)
            .collection("professions").document(professionName)
            .set(professionData)

            .addOnSuccessListener {
                db.collection("users").document(userId)
                    .collection("characters").document(characterDocId!!)
                    .update("progressStage", 4)

                Toast.makeText(this, "Profesja zapisana!", Toast.LENGTH_SHORT).show()
                // Przejście do nowej aktywności z przekazaniem ID dokumentu postaci
                val intent = Intent(this, NewCardSkillsAndAbilitiesActivity::class.java).apply {
                    putExtra("CHARACTER_DOC_ID", characterDocId)  // Przekazanie characterDocId
                    putExtra("CHARACTER_RACE", intent.getStringExtra("CHARACTER_RACE"))
                    putExtra("CHARACTER_PROFESSION", professionName) // Przekazanie nazwy profesji
                }
                startActivity(intent)
                finish()
            }
            .addOnFailureListener { e ->
                Toast.makeText(this, "Błąd zapisu: ${e.message}", Toast.LENGTH_SHORT).show()
            }



        if (userId.isEmpty() || characterDocId.isNullOrEmpty()) {
            Toast.makeText(this, "Błąd: Nie można zapisać statystyk", Toast.LENGTH_SHORT).show()
            return
        }

    }

    fun updateProfessionStats(profession: Profession) {
        // Pobranie referencji do odpowiednich TextView
        val wwTextView = findViewById<TextView>(R.id.inputWW)
        val usTextView = findViewById<TextView>(R.id.inputUS)
        val kTextView = findViewById<TextView>(R.id.inputK)
        val odpTextView = findViewById<TextView>(R.id.inputOdp)
        val zrTextView = findViewById<TextView>(R.id.inputZr)
        val intTextView = findViewById<TextView>(R.id.inputInt)
        val swTextView = findViewById<TextView>(R.id.inputSW)
        val ogdTextView = findViewById<TextView>(R.id.inputOgd)
        val aTextView = findViewById<TextView>(R.id.inputA)
        val zywTextView = findViewById<TextView>(R.id.inputŻyw)
        val szTextView = findViewById<TextView>(R.id.inputSz)
        val magTextView = findViewById<TextView>(R.id.inputMag)

        val abilitiesTextView = findViewById<TextView>(R.id.inputAbilities)
        val skillsTextView = findViewById<TextView>(R.id.inputSkills)

        val entryPathsTextView = findViewById<TextView>(R.id.inputEntryPaths)
        val exitPathsTextView = findViewById<TextView>(R.id.inputExitPaths)

        fun formatStat(value: Int): String {
            return if (value == 0) "-" else value.toString()
        }

        // Ustawianie wartości statystyk w TextView
        wwTextView.text = formatStat(profession.ww)
        usTextView.text = formatStat(profession.us)
        kTextView.text = formatStat(profession.k)
        odpTextView.text = formatStat(profession.odp)
        zrTextView.text = formatStat(profession.zr)
        intTextView.text = formatStat(profession.int)
        swTextView.text = formatStat(profession.sw)
        ogdTextView.text = formatStat(profession.ogd)
        aTextView.text = formatStat(profession.a)
        zywTextView.text = formatStat(profession.zyw)
        szTextView.text = formatStat(profession.sz)
        magTextView.text = formatStat(profession.mag)

        // Zastosowanie mapowania grup umiejętności
        val simplifiedAbilities = profession.abilities.mapNotNull { ability ->
            mapAbilityGroupToText(listOf(ability))
        }

        val fullAbilitiesText = buildString {
            append("Umiejętności: ")
            append(simplifiedAbilities.joinToString(separator = ", "))

            if (profession.optionalAbility.isNotEmpty()) {
                appendLine()
                append("Do wyboru: ")
                append(profession.optionalAbility.joinToString(separator = ", ") { group ->
                    val simplifiedGroup = AbilityGroupSimplifier.simplify(group)
                    if (simplifiedGroup != null) {
                        simplifiedGroup
                    } else {
                        group.joinToString(separator = " lub ") { ability ->
                            ability.name
                        }
                    }
                })
            }
        }

        abilitiesTextView.text = fullAbilitiesText.ifEmpty { "Brak umiejętności" }

        // Wyświetlanie umiejętności
        val fullSkillsText = buildString {
            append("Zdolności: ")
            append(profession.skills.joinToString(separator = ", ") { it.name })

            if (profession.optionalSkills.isNotEmpty()) {
                appendLine()
                append("Do wyboru: ")
                append(profession.optionalSkills.joinToString(separator = ", ") { group ->
                    group.joinToString(separator = " lub ") { it.name }
                })
            }
        }
        skillsTextView.text = fullSkillsText.ifEmpty { "Brak zdolności" }

        val professionPaths = ProfessionPaths.paths[profession]

        // Jeśli istnieją ścieżki dla tej profesji
        if (professionPaths != null) {
            // Łączenie ścieżek wejściowych i ustawianie w TextView
            val entryPathsText = "Ścieżki wejściowe: " + professionPaths.entry.joinToString(separator = ", ") { it.name }
            entryPathsTextView.text = entryPathsText.ifEmpty { "Brak ścieżek wejściowych" }

            // Łączenie ścieżek wyjściowych i ustawianie w TextView
            val exitPathsText = "Ścieżki wyjściowe: " + professionPaths.exit.joinToString(separator = ", ") { it.name }
            exitPathsTextView.text = exitPathsText.ifEmpty { "Brak ścieżek wyjściowych" }
        } else {
            entryPathsTextView.text = "Brak ścieżek wejściowych"
            exitPathsTextView.text = "Brak ścieżek wyjściowych"
        }
    }

    // Funkcja do wyświetlania PopupWindow z listą do wyboru
    private fun showPopupWindow(view: View, items: List<String>, onItemSelected: (String) -> Unit) {
        val context = this
        val listView = ListView(context)
        val adapter = ArrayAdapter(context, android.R.layout.simple_list_item_1, items)
        listView.adapter = adapter

        // Tworzenie PopupWindow
        val popupWindow = PopupWindow(listView, WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT)
        popupWindow.isFocusable = true
        popupWindow.setBackgroundDrawable(getDrawable(android.R.drawable.screen_background_light))

        // Ukrywanie systemowego UI, jak pasek stanu
        popupWindow.setOnDismissListener {
            SystemUIUtils.hideSystemUI(this)
        }

        // Obsługa kliknięcia na element w liście
        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = items[position]
            onItemSelected(selectedItem) // Wywołanie funkcji zwrotnej z wybranym elementem
            popupWindow.dismiss() // Zamknięcie PopupWindow po wyborze
        }

        // Wyświetlanie PopupWindow
        popupWindow.showAsDropDown(view)

        view.postDelayed({
            SystemUIUtils.hideSystemUI(this)
        }, 1)
    }
    fun mapAbilityGroupToText(group: List<Ability>): String? {
        return AbilityGroupSimplifier.simplify(group)
    }
}
