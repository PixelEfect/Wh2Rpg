package com.dd.rpgcardapp.views

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.dd.rpgcardapp.views.HomeActivity
import com.dd.rpgcardapp.base.BaseActivity
import com.dd.rpgcardapp.data.*
import com.dd.rpgcardapp.databinding.ActivityBlessingViewerBinding

class BlessingViewerActivity : BaseActivity() {
    private lateinit var binding: ActivityBlessingViewerBinding

    private var currentCategory = 0
    private var currentBlessingIndex = 0

    // Categories and their corresponding data sources for blessings
    private val blessingCategories = listOf(
        "BŁOGOSŁAWIEŃSTWA" to Common::class.java,
        "DZIEDZINA NURGLA" to NurgleTradition::class.java,
        "DZIEDZINA SLAANESHA" to SlaaneshTradition::class.java,
        "DZIEDZINA TZEENTCHA" to TzeentchTradition::class.java,
        "DZIEDZINA MANANNA" to ManannDomain::class.java,
        "DZIEDZINA MORRA" to MorrDomain::class.java,
        "DZIEDZINA MYRMIDII" to MyrmiidiaDomain::class.java,
        "DZIEDZINA RANALDA" to RanaldDomain::class.java,
        "DZIEDZINA SHALLYI" to ShallyaDomain::class.java,
        "DZIEDZINA SIGMARA" to SigmarDomain::class.java,
        "DZIEDZINA TAALA I RHYI" to TaalRhyaDomain::class.java,
        "DZIEDZINA ULRYKA" to UlricDomain::class.java,
        "DZIEDZINA VERENY" to VerenaDomain::class.java,
        "DZIEDZINA GUNNDREDA" to GunndreDomain::class.java,
        "DZIEDZINA HÄNDRICHA" to HandrichDomain::class.java,
        "DZIEDZINA KHAINA" to KhainDomain::class.java,
        "DZIEDZINA DAŻA" to DazhDomain::class.java,
        "DZIEDZINA TORA" to TorDomain::class.java,
        "DZIEDZINA URSUNA" to UrsunDomain::class.java,
    )

    private fun getBlessingsFromClass(clazz: Class<*>): List<Blessing> {
        val blessings = mutableListOf<Blessing>()
        val fields = clazz.declaredFields

        for (field in fields) {
            field.isAccessible = true
            try {
                val value = field.get(null)
                if (value is Blessing) {
                    blessings.add(value)
                }
            } catch (e: Exception) {
                // Skip fields that can't be accessed
            }
        }
        return blessings
    }

    private fun getCurrentCategoryBlessings(): List<Blessing> {
        if (currentCategory >= blessingCategories.size) return emptyList()
        val (_, clazz) = blessingCategories[currentCategory]
        return getBlessingsFromClass(clazz)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBlessingViewerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableTouchToHideKeyboardAndSystemUI()
        setupButtons()
        updateDisplay()
    }

    private fun setupButtons() {
        // Category navigation
        binding.buttonPreviousCategory.setOnClickListener {
            navigateCategory(-1)
            updateDisplay()
        }

        binding.buttonNextCategory.setOnClickListener {
            navigateCategory(1)
            updateDisplay()
        }

        // Blessing navigation
        binding.buttonPreviousBlessing.setOnClickListener {
            navigateBlessing(-1)
            updateDisplay()
        }

        binding.buttonNextBlessing.setOnClickListener {
            navigateBlessing(1)
            updateDisplay()
        }

        // Exit and Back buttons
        val exitClickListener = {
            startActivityWithTransition(Intent(this, HomeActivity::class.java), TransitionType.FADE)
            finish()
        }
        binding.exitButton.setOnClickListener { exitClickListener() }
        binding.backButton.setOnClickListener { exitClickListener() }

        // Next button - placeholder for future functionality
        binding.nextButton.setOnClickListener {
            // Placeholder for additional functionality
        }
    }

    private fun navigateCategory(direction: Int) {
        val maxCategories = blessingCategories.size
        currentCategory = when {
            direction > 0 -> if (currentCategory < maxCategories - 1) currentCategory + 1 else 0
            else -> if (currentCategory > 0) currentCategory - 1 else maxCategories - 1
        }
        currentBlessingIndex = 0
    }

    private fun navigateBlessing(direction: Int) {
        val maxBlessings = getCurrentCategoryBlessings().size
        if (maxBlessings == 0) return

        currentBlessingIndex = when {
            direction > 0 -> if (currentBlessingIndex < maxBlessings - 1) currentBlessingIndex + 1 else 0
            else -> if (currentBlessingIndex > 0) currentBlessingIndex - 1 else maxBlessings - 1
        }
    }

    private fun getCurrentBlessing(): Blessing? {
        val blessings = getCurrentCategoryBlessings()
        return blessings.getOrNull(currentBlessingIndex)
    }

    private fun updateDisplay() {
        // Update category display
        val categoryName = if (currentCategory < blessingCategories.size) {
            blessingCategories[currentCategory].first
        } else {
            "Brak kategorii"
        }
        binding.textCurrentCategory.text = categoryName

        // Get current blessing and update display
        getCurrentBlessing()?.let { blessing ->
            binding.apply {
                textCurrentBlessing.text = blessing.name
                textBlessingName.text = blessing.name
                textPower.text = "Moc: ${blessing.power}"
                textTimeToCast.text = "Czas rzucania: ${blessing.timeToCast.label}"
                textRange.text = "Zasięg: ${blessing.range}"
                textComponent.text = "Komponent: ${blessing.componentName} (+${blessing.componentPower})"
                textDuration.text = "Czas trwania: ${blessing.duration}"
                textDescription.text = blessing.description
                textNote.text = if (blessing.note.isNotEmpty()) "Uwagi: ${blessing.note}" else ""
                textNote.visibility = if (blessing.note.isNotEmpty()) View.VISIBLE else View.GONE
            }
        }

        // Update counter
        val totalInCategory = getCurrentCategoryBlessings().size
        binding.textBlessingCounter.text = "${currentBlessingIndex + 1} / $totalInCategory"
    }
}