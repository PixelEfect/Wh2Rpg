package com.dd.rpgcardapp

import BaseActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.dd.rpgcardapp.data.Ability
import com.dd.rpgcardapp.data.AbilityGroupSimplifier
import com.dd.rpgcardapp.data.Profession
import com.dd.rpgcardapp.data.ProfessionPaths
import com.dd.rpgcardapp.data.Race
import com.dd.rpgcardapp.data.Races
import com.dd.rpgcardapp.databinding.ActivityMyCardAttributesBinding

import com.dd.rpgcardapp.utils.SystemUIUtils
import com.dd.rpgcardapp.utils.showAlertDialog
import com.google.android.gms.tasks.Task
import com.google.android.gms.tasks.Tasks
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import java.text.Collator
import java.util.Locale

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
        }
    }


    override fun onStart() {
        super.onStart()
        SystemUIUtils.hideSystemUI(this)
    }

    override fun onResume() {
        super.onResume()
        SystemUIUtils.hideSystemUI(this)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            SystemUIUtils.hideSystemUI(this)
        }
    }

    private fun fetchCharacterAttributes(characterDocId: String) {
        // Pobieranie danych z dokumentów "base", "obtained", "progression"
        val attributesRef = db.collection("users")
            .document(userId)
            .collection("characters")
            .document(characterDocId)
            .collection("attributes")

        // Pobranie danych z dokumentu "base"
        val baseDocTask = attributesRef.document("base").get()
        // Pobranie danych z dokumentu "obtained"
        val obtainedDocTask = attributesRef.document("obtained").get()
        // Pobranie danych z dokumentu "progression"
        val progressionDocTask = attributesRef.document("progression").get()

        // Oczekiwanie na wszystkie trzy dokumenty
        Tasks.whenAllSuccess<DocumentSnapshot>(baseDocTask, obtainedDocTask, progressionDocTask)
            .addOnSuccessListener { documents ->
                // Dokument base
                val baseDoc = documents[0] as DocumentSnapshot
                val baseA = baseDoc.getLong("A")?.toInt() ?: 0
                val baseInt = baseDoc.getLong("Int")?.toInt() ?: 0
                val baseK = baseDoc.getLong("K")?.toInt() ?: 0
                val baseMag = baseDoc.getLong("Mag")?.toInt() ?: 0
                val baseOdp = baseDoc.getLong("Odp")?.toInt() ?: 0
                val baseOgd = baseDoc.getLong("Ogd")?.toInt() ?: 0
                val basePO = baseDoc.getLong("PO")?.toInt() ?: 0
                val basePP = baseDoc.getLong("PP")?.toInt() ?: 0
                val baseS = baseDoc.getLong("S")?.toInt() ?: 0
                val baseSW = baseDoc.getLong("SW")?.toInt() ?: 0
                val baseSz = baseDoc.getLong("Sz")?.toInt() ?: 0
                val baseUS = baseDoc.getLong("US")?.toInt() ?: 0
                val baseWW = baseDoc.getLong("WW")?.toInt() ?: 0
                val baseWt = baseDoc.getLong("Wt")?.toInt() ?: 0
                val baseZr = baseDoc.getLong("Zr")?.toInt() ?: 0
                val baseZyw = baseDoc.getLong("Zyw")?.toInt() ?: 0

                // Dokument obtained
                val obtainedDoc = documents[1] as DocumentSnapshot
                val obtainedA = obtainedDoc.getLong("A")?.toInt() ?: 0
                val obtainedInt = obtainedDoc.getLong("Int")?.toInt() ?: 0
                val obtainedK = obtainedDoc.getLong("K")?.toInt() ?: 0
                val obtainedMag = obtainedDoc.getLong("Mag")?.toInt() ?: 0
                val obtainedOdp = obtainedDoc.getLong("Odp")?.toInt() ?: 0
                val obtainedOgd = obtainedDoc.getLong("Ogd")?.toInt() ?: 0
                val obtainedPO = obtainedDoc.getLong("PO")?.toInt() ?: 0
                val obtainedPP = obtainedDoc.getLong("PP")?.toInt() ?: 0
                val obtainedS = obtainedDoc.getLong("S")?.toInt() ?: 0
                val obtainedSW = obtainedDoc.getLong("SW")?.toInt() ?: 0
                val obtainedSz = obtainedDoc.getLong("Sz")?.toInt() ?: 0
                val obtainedUS = obtainedDoc.getLong("US")?.toInt() ?: 0
                val obtainedWW = obtainedDoc.getLong("WW")?.toInt() ?: 0
                val obtainedWt = obtainedDoc.getLong("Wt")?.toInt() ?: 0
                val obtainedZr = obtainedDoc.getLong("Zr")?.toInt() ?: 0
                val obtainedZyw = obtainedDoc.getLong("Zyw")?.toInt() ?: 0

                // Dokument progression
                val progressionDoc = documents[2] as DocumentSnapshot
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

                // Aktualizowanie UI z danymi z dokumentu base
                binding.baseA.text = "$baseA"
                binding.baseInt.text = "$baseInt"
                binding.baseK.text = "$baseK"
                binding.baseMag.text = "$baseMag"
                binding.baseOdp.text = "$baseOdp"
                binding.baseOgd.text = "$baseOgd"
                binding.basePO.text = "$basePO"
                binding.basePP.text = "$basePP"
                binding.baseS.text = "$baseS"
                binding.baseSW.text = "$baseSW"
                binding.baseSz.text = "$baseSz"
                binding.baseUS.text = "$baseUS"
                binding.baseWW.text = "$baseWW"
                binding.baseWt.text = "$baseWt"
                binding.baseZr.text = "$baseZr"
                binding.baseZyw.text = "$baseZyw"

                // Aktualizowanie UI z danymi z dokumentu obtained
                binding.obtainedA.text = "${baseA + obtainedA}"
                binding.obtainedInt.text = "${baseInt + obtainedInt}"
                binding.obtainedK.text = "${baseK + obtainedK}"
                binding.obtainedMag.text = "${baseMag + obtainedMag}"
                binding.obtainedOdp.text = "${baseOdp + obtainedOdp}"
                binding.obtainedOgd.text = "${baseOgd + obtainedOgd}"
                binding.obtainedPO.text = "${basePO + obtainedPO}"
                binding.obtainedPP.text = "${basePP + obtainedPP}"
                binding.obtainedS.text = "${baseS + obtainedS}"
                binding.obtainedSW.text = "${baseSW + obtainedSW}"
                binding.obtainedSz.text = "${baseSz + obtainedSz}"
                binding.obtainedUS.text = "${baseUS + obtainedUS}"
                binding.obtainedWW.text = "${baseWW + obtainedWW}"
                binding.obtainedWt.text = "${baseWt + obtainedWt}"
                binding.obtainedZr.text = "${baseZr + obtainedZr}"
                binding.obtainedZyw.text = "${baseZyw + obtainedZyw}"

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

                for ((view, value) in statMap) {
                    view.currentPoints = value
                }

            }
            .addOnFailureListener {
                Toast.makeText(this, "Błąd pobierania danych", Toast.LENGTH_SHORT).show()
            }
    }
}