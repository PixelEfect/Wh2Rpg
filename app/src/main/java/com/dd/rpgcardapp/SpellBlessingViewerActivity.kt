package com.dd.rpgcardapp

import android.content.Intent
import android.os.Bundle
import com.dd.rpgcardapp.base.BaseActivity
import com.dd.rpgcardapp.data.*
import com.dd.rpgcardapp.databinding.ActivitySpellBlessingViewerBinding

class SpellBlessingViewerActivity : BaseActivity() {
    private lateinit var binding: ActivitySpellBlessingViewerBinding

    private var currentType = MagicType.BLESSING
    private var currentCategory = 0
    private var currentSpellIndex = 0

    // Wspólny interfejs dla Spell i Blessing
    interface MagicItem {
        val name: String
        val power: Int
        val timeToCast: CastingTime
        val range: String
        val componentName: String
        val componentPower: String
        val duration: String
        val description: String
        val note: String
    }

    // Categories and their corresponding data sources
    private val magicCategories = mapOf(
        MagicType.BLESSING to listOf(
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
        ),
        MagicType.SPELL to listOf(
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
    )

    private fun getCurrentCategoryNames(): List<String> {
        return magicCategories[currentType]?.map { it.first } ?: emptyList()
    }

    private fun getSpellsFromClass(clazz: Class<*>): List<Any> {
        val items = mutableListOf<Any>()
        val fields = clazz.declaredFields

        for (field in fields) {
            field.isAccessible = true
            try {
                val value = field.get(null)
                if (value is Blessing || value is Spell) {
                    items.add(value)
                }
            } catch (e: Exception) {
                // Skip fields that can't be accessed
            }
        }
        return items
    }

    private fun getCurrentCategoryItems(): List<Any> {
        val categories = magicCategories[currentType] ?: return emptyList()
        if (currentCategory >= categories.size) return emptyList()

        val (_, clazz) = categories[currentCategory]
        return getSpellsFromClass(clazz)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySpellBlessingViewerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableTouchToHideKeyboardAndSystemUI()
        setupButtons()
        updateDisplay()
    }

    private fun setupButtons() {
        // Type navigation - wspólna funkcja
        val typeClickListener = {
            toggleType()
            resetNavigation()
            updateDisplay()
        }
        binding.buttonPreviousType.setOnClickListener { typeClickListener() }
        binding.buttonNextType.setOnClickListener { typeClickListener() }

        // Category navigation
        binding.buttonPreviousCategory.setOnClickListener {
            navigateCategory(-1)
            updateDisplay()
        }

        binding.buttonNextCategory.setOnClickListener {
            navigateCategory(1)
            updateDisplay()
        }

        // Spell/Blessing navigation
        binding.buttonPreviousSpell.setOnClickListener {
            navigateSpell(-1)
            updateDisplay()
        }

        binding.buttonNextSpell.setOnClickListener {
            navigateSpell(1)
            updateDisplay()
        }

        // Exit and Back buttons - wspólna funkcja
        val exitClickListener = {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }
        binding.exitButton.setOnClickListener { exitClickListener() }
        binding.backButton.setOnClickListener { exitClickListener() }

        // Next button - placeholder for future functionality
        binding.nextButton.setOnClickListener {
            // Placeholder for additional functionality
        }
    }

    // Pomocnicze funkcje nawigacji
    private fun toggleType() {
        currentType = when (currentType) {
            MagicType.BLESSING -> MagicType.SPELL
            MagicType.SPELL -> MagicType.BLESSING
        }
    }

    private fun resetNavigation() {
        currentCategory = 0
        currentSpellIndex = 0
    }

    private fun navigateCategory(direction: Int) {
        val maxCategories = getCurrentCategoryNames().size
        currentCategory = when {
            direction > 0 -> if (currentCategory < maxCategories - 1) currentCategory + 1 else 0
            else -> if (currentCategory > 0) currentCategory - 1 else maxCategories - 1
        }
        currentSpellIndex = 0
    }

    private fun navigateSpell(direction: Int) {
        val maxSpells = getCurrentCategorySize()
        currentSpellIndex = when {
            direction > 0 -> if (currentSpellIndex < maxSpells - 1) currentSpellIndex + 1 else 0
            else -> if (currentSpellIndex > 0) currentSpellIndex - 1 else maxSpells - 1
        }
    }

    private fun getCurrentCategorySize(): Int {
        return getCurrentCategoryItems().size
    }

    private fun getCurrentSpell(): Any? {
        val items = getCurrentCategoryItems()
        return items.getOrNull(currentSpellIndex)
    }

    // Wspólna funkcja wyświetlania dla Spell i Blessing
    private fun displayMagicItem(item: Any) {
        when (item) {
            is Blessing -> updateMagicDisplay(item.name, item.power, item.timeToCast.label,
                item.range, item.componentName, item.componentPower, item.duration,
                item.description, item.note)
            is Spell -> updateMagicDisplay(item.name, item.power, item.timeToCast.label,
                item.range, item.componentName, item.componentPower, item.duration,
                item.description, item.note)
        }
    }

    private fun updateMagicDisplay(name: String, power: Int, timeToCast: String,
                                   range: String, componentName: String, componentPower: Int,
                                   duration: String, description: String, note: String) {
        binding.apply {
            textCurrentSpell.text = name
            textSpellName.text = name
            textPower.text = "Moc: $power"
            textTimeToCast.text = "Czas rzucania: $timeToCast"
            textRange.text = "Zasięg: $range"
            textComponent.text = "Komponent: $componentName (+$componentPower)"
            textDuration.text = "Czas trwania: $duration"
            textDescription.text = description
            textNote.text = if (note.isNotEmpty()) "Uwagi: $note" else ""
            textNote.visibility = if (note.isNotEmpty()) android.view.View.VISIBLE else android.view.View.GONE
        }
    }

    private fun updateDisplay() {
        // Update type display
        binding.textCurrentType.text = when (currentType) {
            MagicType.BLESSING -> "Błogosławieństwa"
            MagicType.SPELL -> "Zaklęcia"
        }

        // Update category display
        val categoryNames = getCurrentCategoryNames()
        val categoryName = if (currentCategory < categoryNames.size) {
            categoryNames[currentCategory]
        } else {
            "Brak kategorii"
        }
        binding.textCurrentCategory.text = categoryName

        // Get current item and update display
        getCurrentSpell()?.let { displayMagicItem(it) }

        // Update counters
        val totalInCategory = getCurrentCategorySize()
        binding.textSpellCounter.text = "${currentSpellIndex + 1} / $totalInCategory"
    }

    enum class MagicType {
        BLESSING, SPELL
    }
}