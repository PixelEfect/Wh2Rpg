package com.dd.rpgcardapp.views

import android.content.Intent
import android.os.Bundle
import com.dd.rpgcardapp.views.HomeActivity
import com.dd.rpgcardapp.base.BaseActivity
import com.dd.rpgcardapp.data.*
import com.dd.rpgcardapp.databinding.ActivitySpellViewerBinding

class SpellViewerActivity : BaseActivity() {
    private lateinit var binding: ActivitySpellViewerBinding

    private var currentCategory = 0
    private var currentSpellIndex = 0
    private var isInCategorySelection = true

    // Categories and their corresponding data sources for spells
    private val spellCategories = listOf(
        "GUSŁA" to Cantrips::class.java,
        "MAGIA PROSTA TAJEMNA" to SecretMagic::class.java,
        "MAGIA PROSTA CHAOSU" to ChaosMagic::class.java,
        "MAGIA PROSTA SKAVENÓW" to SkavenMagic::class.java,
        "MAGIA PROSTA WIEDŹM" to WitchMagic::class.java,
        "MAGIA PROSTA LODU" to IceMagic::class.java,
        "MAGIA POWSZECHNA" to CommonMagic::class.java,
        "TRADYCJA CIENIA" to ShadowTradition::class.java,
        "TRADYCJA METALU" to MetalTradition::class.java,
        "TRADYCJA NIEBIOS" to HeavensTradition::class.java,
        "TRADYCJA OGNIA" to FireTradition::class.java,
        "TRADYCJA ŚMIERCI" to DeathTradition::class.java,
        "TRADYCJA ŚWIATŁA" to LightTradition::class.java,
        "TRADYCJA ZWIERZĄT" to BeastTradition::class.java,
        "TRADYCJA ŻYCIA" to LifeTradition::class.java,
        "TRADYCJA CHAOSU" to ChaosTradition::class.java,
        "TRADYCJA NEKROMANCJI" to NecromancyTradition::class.java,
        "TRADYCJA NAGASHA" to NagashTradition::class.java,
        "TRADYCJE MAGII SKAVEŃSKIEJ" to SkavenTraditions::class.java,
        "MAGIA DUCHÓW" to SpiritMagic::class.java,
        "TRADYCJA WIEDŹM" to WitchTradition::class.java,
        "TRADYCJA LODU" to IceTradition::class.java,
    )

    private fun getSpellsFromClass(clazz: Class<*>): List<Spell> {
        val spells = mutableListOf<Spell>()
        val fields = clazz.declaredFields

        for (field in fields) {
            field.isAccessible = true
            try {
                val value = field.get(null)
                if (value is Spell) {
                    spells.add(value)
                }
            } catch (e: Exception) {
                // Skip fields that can't be accessed
            }
        }
        return spells.sortedBy { it.power }
    }

    private fun getCurrentCategorySpells(): List<Spell> {
        if (currentCategory >= spellCategories.size) return emptyList()
        val (_, clazz) = spellCategories[currentCategory]
        return getSpellsFromClass(clazz)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySpellViewerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.headerLayout.titleTextView.text = "Księga magii"

        enableTouchToHideKeyboardAndSystemUI()
        setupButtons()
        setupCategoryButtons()
        showCategorySelection()
    }

    private fun setupButtons() {
        // Spell navigation buttons
        binding.buttonPreviousSpell.setOnClickListener {
            navigateSpell(-1)
            updateSpellDisplay()
        }

        binding.buttonNextSpell.setOnClickListener {
            navigateSpell(1)
            updateSpellDisplay()
        }

        // Exit and Back buttons
        val exitClickListener = {
            startActivityWithTransition(Intent(this, HomeActivity::class.java), TransitionType.FADE)
            finish()
        }
        binding.exitButton.setOnClickListener { exitClickListener() }

        binding.backButton.setOnClickListener {
            if (isInCategorySelection) {
                exitClickListener()
            } else {
                showCategorySelection()
            }
        }

        // Next button - placeholder for future functionality
        binding.nextButton.setOnClickListener {
            // Placeholder for additional functionality
        }
    }

    private fun setupCategoryButtons() {
        // Get references to all category buttons and set up their click listeners
        val categoryButtons = listOf(
            // Row 1: 6 buttons - Simple magic
            binding.btnGusla, binding.btnMagiaTajemna, binding.btnMagiaChaos,
            binding.btnMagiaSkaven, binding.btnMagiaWiedzm, binding.btnMagiaLod,
            // Row 2: 1 button - Common magic
            binding.btnMagiaPowszechna,
            // Row 3: 4 buttons - Traditions 1-4
            binding.btnTradycjaCienia, binding.btnTradycjaMetalu, binding.btnTradycjaNiebios, binding.btnTradycjaOgnia,
            // Row 4: 4 buttons - Traditions 5-8
            binding.btnTradycjaSmierc, binding.btnTradycjaSwiatla, binding.btnTradycjaZwierzat, binding.btnTradycjaZycia,
            // Row 5: 4 buttons - Traditions 9-12
            binding.btnTradycjaChaosT, binding.btnTradycjaNekromancja, binding.btnTradycjaNagash, binding.btnTradycjaSkaven,
            // Row 6: 3 buttons - Remaining traditions
            binding.btnMagiaDuchow, binding.btnTradycjaWiedzm, binding.btnTradycjaLoduT
        )

        categoryButtons.forEachIndexed { index, button ->
            button.setOnClickListener {
                selectCategory(index)
            }
        }
    }

    private fun selectCategory(categoryIndex: Int) {
        currentCategory = categoryIndex
        currentSpellIndex = 0
        showSpellViewer()
    }

    private fun showCategorySelection() {
        isInCategorySelection = true

        // Update title
        binding.textTitle.text = "WYBIERZ KATEGORIĘ ZAKLĘĆ"
    }

    private fun showSpellViewer() {
        isInCategorySelection = false

        updateSpellDisplay()
    }

    private fun navigateSpell(direction: Int) {
        val maxSpells = getCurrentCategorySpells().size
        if (maxSpells == 0) return

        currentSpellIndex = when {
            direction > 0 -> if (currentSpellIndex < maxSpells - 1) currentSpellIndex + 1 else 0
            else -> if (currentSpellIndex > 0) currentSpellIndex - 1 else maxSpells - 1
        }
    }

    private fun getCurrentSpell(): Spell? {
        val spells = getCurrentCategorySpells()
        return spells.getOrNull(currentSpellIndex)
    }

    private fun updateSpellDisplay() {
        // Update title to show current category
        val categoryName = if (currentCategory < spellCategories.size) {
            spellCategories[currentCategory].first
        } else {
            "Brak kategorii"
        }
        binding.textTitle.text = categoryName

        // Get current spell and update display
        getCurrentSpell()?.let { spell ->
            binding.apply {
                textSpellName.text = spell.name
                textPower.text = "Moc: ${spell.power}"
                textTimeToCast.text = "Czas rzucania: ${spell.timeToCast.label}"
                textRange.text = "Zasięg: ${spell.range}"
                textComponent.text = "Komponent: ${spell.componentName} (+${spell.componentPower})"
                textDuration.text = "Czas trwania: ${spell.duration}"
                textDescription.text = spell.description
                textNote.text = if (spell.note.isNotEmpty()) "Uwagi: ${spell.note}" else ""
            }
        }

        // Update counter
        val totalInCategory = getCurrentCategorySpells().size
        binding.textSpellCounter.text = "${currentSpellIndex + 1} / $totalInCategory"
    }
}