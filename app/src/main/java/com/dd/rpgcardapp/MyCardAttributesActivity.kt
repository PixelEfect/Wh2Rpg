package com.dd.rpgcardapp

import BaseActivity
import android.content.Intent
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.dd.rpgcardapp.data.StatsSkills
import com.dd.rpgcardapp.databinding.ActivityMyCardAttributesBinding
import com.google.android.gms.tasks.Tasks
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

class MyCardAttributesActivity : BaseActivity() {

    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String
    private var characterDocId: String? = null
    private var characterRace: String? = null
    private var characterProfession: String? = null
    private var characterName: String? = null

    // Inicjalizacja ViewBinding
    private lateinit var binding: ActivityMyCardAttributesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyCardAttributesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableTouchToHideKeyboardAndSystemUI()

        db = Firebase.firestore
        userId = Firebase.auth.currentUser?.uid ?: ""

        // Pobranie danych z Intentu
        characterDocId = intent.getStringExtra("CHARACTER_DOC_ID")
        characterRace = intent.getStringExtra("CHARACTER_RACE")
        characterProfession = intent.getStringExtra("CHARACTER_PROFESSION")
        characterName = intent.getStringExtra("CHARACTER_NAME")

        // Użycie danych (np. wyświetlenie w TextView)
        binding.nameTextView.text = "Imię: ${characterName ?: "Brak imienia"}"
        binding.raceTextView.text = "Rasa: ${characterRace ?: "Brak rasy"}"
        binding.professionTextView.text = "Profesja: ${characterProfession ?: "Brak profesji"}"

        // Możesz również dodać logikę do pobrania danych z Firestore, jeśli to potrzebne
        characterDocId?.let { docId ->
            fetchCharacterAttributes(docId)
            fetchCharacterInfo(docId)
        }

        loadSavedImageIfExists()

        binding.buttonEditImage.setOnClickListener {
            openImagePicker()
        }

        binding.exitButton.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }
    }

    private fun loadSavedImageIfExists() {
        val filename = "image_${characterDocId}"
        val file = File(filesDir, filename)
        if (file.exists()) {
            binding.imageView.setImageBitmap(BitmapFactory.decodeFile(file.absolutePath))
        }
    }

    private val pickImageLauncher = registerForActivityResult(
        ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        uri?.let {
            saveImageLocally(it)
        }
    }

    private fun openImagePicker() {
        pickImageLauncher.launch("image/*")
    }

    private fun saveImageLocally(uri: Uri) {
        val filename = "image_${characterDocId}"
        val file = File(filesDir, filename)

        try {
            val inputStream = contentResolver.openInputStream(uri)
            val outputStream = FileOutputStream(file)

            inputStream?.copyTo(outputStream)

            inputStream?.close()
            outputStream.close()

            Toast.makeText(this, "Zapisano obrazek", Toast.LENGTH_SHORT).show()

            // Od razu wczytaj ten obraz do ImageView
            binding.imageView.setImageBitmap(BitmapFactory.decodeFile(file.absolutePath))

        } catch (e: IOException) {
            Toast.makeText(this, "Błąd zapisu: ${e.message}", Toast.LENGTH_LONG).show()
            e.printStackTrace()
        }
    }

    private fun fetchCharacterAttributes(characterDocId: String) {
        // Pobieranie danych z dokumentów "base", "obtained", "progression"
        val characterRef = db.collection("users")
            .document(userId)
            .collection("characters")
            .document(characterDocId)

        val attributesRef = characterRef.collection("attributes")
        val skillsRef = characterRef.collection("skills").document("stats")

        // Zadania Firestore
        val baseDocTask = attributesRef.document("base").get()
        val obtainedDocTask = attributesRef.document("obtained").get()
        val progressionDocTask = attributesRef.document("progression").get()
        val skillsDocTask = skillsRef.get()

        // Oczekiwanie na wszystkie trzy dokumenty
        Tasks.whenAllSuccess<DocumentSnapshot>(baseDocTask, obtainedDocTask, progressionDocTask, skillsDocTask)
            .addOnSuccessListener { documents ->
                val baseDoc = documents[0]
                val obtainedDoc = documents[1]
                val progressionDoc = documents[2]
                val skillsDoc = documents[3]

                // Dokument base
                val baseA = baseDoc.getLong("A")?.toInt() ?: 0
                val baseInt = baseDoc.getLong("Int")?.toInt() ?: 0
                val baseK = baseDoc.getLong("K")?.toInt() ?: 0
                val baseMag = baseDoc.getLong("Mag")?.toInt() ?: 0
                val baseOdp = baseDoc.getLong("Odp")?.toInt() ?: 0
                val baseOgd = baseDoc.getLong("Ogd")?.toInt() ?: 0
                val basePO = baseDoc.getLong("PO")?.toInt() ?: 0
                val basePP = baseDoc.getLong("PP")?.toInt() ?: 0
                val baseSW = baseDoc.getLong("SW")?.toInt() ?: 0
                val baseSz = baseDoc.getLong("Sz")?.toInt() ?: 0
                val baseUS = baseDoc.getLong("US")?.toInt() ?: 0
                val baseWW = baseDoc.getLong("WW")?.toInt() ?: 0
                val baseZr = baseDoc.getLong("Zr")?.toInt() ?: 0
                val baseZyw = baseDoc.getLong("Zyw")?.toInt() ?: 0

                // Dokument obtained
                val obtainedA = obtainedDoc.getLong("A")?.toInt() ?: 0
                val obtainedInt = obtainedDoc.getLong("Int")?.toInt() ?: 0
                val obtainedK = obtainedDoc.getLong("K")?.toInt() ?: 0
                val obtainedMag = obtainedDoc.getLong("Mag")?.toInt() ?: 0
                val obtainedOdp = obtainedDoc.getLong("Odp")?.toInt() ?: 0
                val obtainedOgd = obtainedDoc.getLong("Ogd")?.toInt() ?: 0
                val obtainedPO = obtainedDoc.getLong("PO")?.toInt() ?: 0
                val obtainedPP = obtainedDoc.getLong("PP")?.toInt() ?: 0
                val obtainedSW = obtainedDoc.getLong("SW")?.toInt() ?: 0
                val obtainedSz = obtainedDoc.getLong("Sz")?.toInt() ?: 0
                val obtainedUS = obtainedDoc.getLong("US")?.toInt() ?: 0
                val obtainedWW = obtainedDoc.getLong("WW")?.toInt() ?: 0
                val obtainedZr = obtainedDoc.getLong("Zr")?.toInt() ?: 0
                val obtainedZyw = obtainedDoc.getLong("Zyw")?.toInt() ?: 0

                // Dokument progression
                val progressionA = progressionDoc.getLong("A")?.toInt() ?: 0
                val progressionInt = progressionDoc.getLong("Int")?.toInt() ?: 0
                val progressionK = progressionDoc.getLong("K")?.toInt() ?: 0
                val progressionMag = progressionDoc.getLong("Mag")?.toInt() ?: 0
                val progressionOdp = progressionDoc.getLong("Odp")?.toInt() ?: 0
                val progressionOgd = progressionDoc.getLong("Ogd")?.toInt() ?: 0
                val progressionPO = progressionDoc.getLong("PO")?.toInt() ?: 0
                val progressionPP = progressionDoc.getLong("PP")?.toInt() ?: 0
                val progressionS = progressionDoc.getLong("S")?.toInt() ?: 0
                val progressionSW = progressionDoc.getLong("SW")?.toInt() ?: 0
                val progressionSz = progressionDoc.getLong("Sz")?.toInt() ?: 0
                val progressionUS = progressionDoc.getLong("US")?.toInt() ?: 0
                val progressionWW = progressionDoc.getLong("WW")?.toInt() ?: 0
                val progressionWt = progressionDoc.getLong("Wt")?.toInt() ?: 0
                val progressionZr = progressionDoc.getLong("Zr")?.toInt() ?: 0
                val progressionZyw = progressionDoc.getLong("Zyw")?.toInt() ?: 0

                // Pobieranie nazw umiejętności
                val ownedSkills = (skillsDoc.get("owned") as? List<Map<String, Any>>)
                    ?.mapNotNull { it["name"] as? String }
                    ?: emptyList()

                val skillStatBonuses: Map<String, Map<String, Int>> = mapOf(
                    StatsSkills.bardzoSilny.name to mapOf("K" to 5),
                    StatsSkills.bardzoSzybki.name to mapOf("Sz" to 1),
                    StatsSkills.blyskotliwosc.name to mapOf("Int" to 5),
                    StatsSkills.charyzmatyczny.name to mapOf("Ogd" to 5),
                    StatsSkills.niezwykleOdporny.name to mapOf("Odp" to 5),
                    StatsSkills.opanowanie.name to mapOf("SW" to 5),
                    StatsSkills.strzelecWyborowy.name to mapOf("US" to 5),
                    StatsSkills.szybkiRefleks.name to mapOf("Zr" to 5),
                    StatsSkills.twardziel.name to mapOf("Zyw" to 1),
                    StatsSkills.urodzonyWojownik.name to mapOf("WW" to 5)
                )
                fun calculateSkillBonuses(ownedSkills: List<String>): Map<String, Int> {
                    val result = mutableMapOf<String, Int>()
                    for (skillName in ownedSkills) {
                        val bonuses = skillStatBonuses[skillName] ?: continue
                        for ((stat, bonus) in bonuses) {
                            result[stat] = result.getOrDefault(stat, 0) + bonus
                        }
                    }
                    return result
                }

                val skillBonuses = calculateSkillBonuses(ownedSkills)

                val swBonus = skillBonuses["SW"] ?: 0
                val intBonus = skillBonuses["Int"] ?: 0
                val odpBonus = skillBonuses["Odp"] ?: 0
                val ogdBonus = skillBonuses["Ogd"] ?: 0
                val szBonus = skillBonuses["Sz"] ?: 0
                val usBonus = skillBonuses["US"] ?: 0
                val wwBonus = skillBonuses["WW"] ?: 0
                val kBonus = skillBonuses["K"] ?: 0
                val zrBonus = skillBonuses["Zr"] ?: 0
                val zywBonus = skillBonuses["Zyw"] ?: 0

                // Aktualizowanie UI z danymi z dokumentu base
                binding.baseA.text = "$baseA"
                binding.baseInt.text = "${baseInt + intBonus}"
                binding.baseK.text = "${baseK + kBonus}"
                binding.baseMag.text = "$baseMag"
                binding.baseOdp.text = "${baseOdp + odpBonus}"
                binding.baseOgd.text = "${baseOgd + ogdBonus}"
                binding.basePO.text = "$basePO"
                binding.basePP.text = "$basePP"
                binding.baseS.text = "${(baseK + kBonus)/10}"
                binding.baseSW.text = "${baseSW + swBonus}"
                binding.baseSz.text = "${baseSz + szBonus}"
                binding.baseUS.text = "${baseUS + usBonus}"
                binding.baseWW.text = "${baseWW + wwBonus}"
                binding.baseWt.text = "${(baseOdp + odpBonus)/10}"
                binding.baseZr.text = "${baseZr + zrBonus}"
                binding.baseZyw.text = "${baseZyw + zywBonus}"

                // Aktualizowanie UI z danymi z dokumentu obtained
                binding.obtainedA.text = "${baseA + obtainedA}"
                binding.obtainedInt.text = "${baseInt + obtainedInt + intBonus}"
                binding.obtainedK.text = "${baseK + obtainedK + kBonus}"
                binding.obtainedMag.text = "${baseMag + obtainedMag}"
                binding.obtainedOdp.text = "${baseOdp + obtainedOdp + odpBonus}"
                binding.obtainedOgd.text = "${baseOgd + obtainedOgd + ogdBonus}"
                binding.obtainedPO.text = "${basePO + obtainedPO}"
                binding.obtainedPP.text = "${basePP + obtainedPP}"
                binding.obtainedS.text = "${(baseK + obtainedK + kBonus)/10}"
                binding.obtainedSz.text = "${baseSz + obtainedSz + szBonus}"
                binding.obtainedUS.text = "${baseUS + obtainedUS + usBonus}"
                binding.obtainedWW.text = "${baseWW + obtainedWW + wwBonus}"
                binding.obtainedWt.text = "${(baseOdp + obtainedOdp + odpBonus)/10}"
                binding.obtainedZr.text = "${baseZr + obtainedZr + zrBonus}"
                binding.obtainedSW.text = "${baseSW + obtainedSW + swBonus}"
                binding.obtainedZyw.text = "${baseZyw + obtainedZyw + zywBonus}"


                // Aktualizowanie UI z danymi z dokumentu progression
                binding.progressionA.text = "$progressionA"
                binding.progressionInt.text = "$progressionInt"
                binding.progressionK.text = "$progressionK"
                binding.progressionMag.text = "$progressionMag"
                binding.progressionOdp.text = "$progressionOdp"
                binding.progressionOgd.text = "$progressionOgd"
                binding.progressionPO.text = "$progressionPO"
                binding.progressionPP.text = "$progressionPP"
                binding.progressionS.text = "$progressionS"
                binding.progressionSW.text = "$progressionSW"
                binding.progressionSz.text = "$progressionSz"
                binding.progressionUS.text = "$progressionUS"
                binding.progressionWW.text = "$progressionWW"
                binding.progressionWt.text = "$progressionWt"
                binding.progressionZr.text = "$progressionZr"
                binding.progressionZyw.text = "$progressionZyw"

                val statMap = mapOf(
                    binding.aProgressBar to obtainedA,
                    binding.intProgressBar to obtainedInt / 5,
                    binding.kProgressBar to obtainedK / 5,
                    binding.magProgressBar to obtainedMag,
                    binding.odpProgressBar to obtainedOdp / 5,
                    binding.ogdProgressBar to obtainedOgd / 5,
                    binding.swProgressBar to obtainedSW / 5,
                    binding.szProgressBar to obtainedSz,
                    binding.usProgressBar to obtainedUS / 5,
                    binding.wwProgressBar to obtainedWW / 5,
                    binding.zrProgressBar to obtainedZr / 5,
                    binding.zywProgressBar to obtainedZyw
                )

                binding.skillsTextView.text = "Premie ze zdolności: " + ownedSkills
                    .flatMap { skill ->
                        skillStatBonuses[skill]?.entries?.map { e -> "+${e.value} ${e.key}" } ?: emptyList()
                    }
                    .joinToString(", ")

                for ((view, value) in statMap) {
                    view.currentPoints = value
                }

            }
            .addOnFailureListener {
                Toast.makeText(this, "Błąd pobierania danych", Toast.LENGTH_SHORT).show()
            }
    }
    private fun fetchCharacterInfo(docId: String) {
        val characterRef = db.collection("users")
            .document(userId)
            .collection("characters")
            .document(docId)

        characterRef.get()
            .addOnSuccessListener { document ->
                if (document != null && document.exists()) {
                    val sex = document.getString("sex") ?: "Brak danych"
                    val age = document.getString("age") ?: "Brak danych"
                    val eyes = document.getString("eyes") ?: "Brak danych"
                    val hair = document.getString("hair") ?: "Brak danych"
                    val height = document.getString("height") ?: "Brak danych"
                    val weight = document.getString("weight") ?: "Brak danych"
                    val starSign = document.getString("starSign") ?: "Brak danych"

                    // Przypisanie do TextView
                    binding.sexTextView.text = "Płeć: $sex"
                    binding.ageTextView.text = "Wiek: $age"
                    binding.eyesTextView.text = "Oczy: $eyes"
                    binding.hairTextView.text = "Włosy: $hair"
                    binding.heightTextView.text = "Wzrost: $height cm"
                    binding.weightTextView.text = "Waga: $weight kg"
                    binding.starSignTextView.text = "Znak: $starSign"

                    // Możesz też obsłużyć createdAt i lastActiveAt jeśli chcesz je sformatować
                } else {
                    Toast.makeText(this, "Brak danych postaci", Toast.LENGTH_SHORT).show()
                }
            }
            .addOnFailureListener { e ->
                Toast.makeText(this, "Błąd podczas pobierania: ${e.message}", Toast.LENGTH_LONG).show()
            }
    }

}