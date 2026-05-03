package com.dd.rpgcardapp.views

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.dd.rpgcardapp.base.BaseActivity
import com.dd.rpgcardapp.data.*
import com.dd.rpgcardapp.databinding.ActivityMutationBinding
import kotlin.random.Random
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.jvm.isAccessible

class MutationViewerActivity : BaseActivity() {
    private lateinit var binding: ActivityMutationBinding

    private var currentMutationIndex = 0

    // Automatyczne pobranie wszystkich mutacji z obiektu Mutations
    private val allMutations: List<Mutation> by lazy {
        Mutations::class.declaredMemberProperties
            .filter { it.returnType.classifier == Mutation::class }
            .mapNotNull { property ->
                property.isAccessible = true
                property.get(Mutations) as? Mutation
            }
            .sortedBy { it.range.first }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMutationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableTouchToHideKeyboardAndSystemUI()

        setupButtons()
        updateDisplay()
    }

    private fun setupButtons() {
        // Mutation navigation
        binding.buttonPreviousMutation.setOnClickListener {
            navigateMutation(-1)
            updateDisplay()
        }

        binding.buttonNextMutation.setOnClickListener {
            navigateMutation(1)
            updateDisplay()
        }

        // Roll random mutation
        binding.buttonRollMutation.setOnClickListener {
            rollRandomMutation()
        }

        // Exit and Back buttons
        val exitClickListener = {
            startActivityWithTransition(Intent(this, HomeActivity::class.java), TransitionType.FADE)
            finish()
        }
        binding.exitButton.setOnClickListener { exitClickListener() }
        binding.backButton.setOnClickListener { exitClickListener() }
    }

    private fun navigateMutation(direction: Int) {
        if (allMutations.isEmpty()) return

        val maxMutations = allMutations.size
        currentMutationIndex = when {
            direction > 0 -> if (currentMutationIndex < maxMutations - 1) currentMutationIndex + 1 else 0
            else -> if (currentMutationIndex > 0) currentMutationIndex - 1 else maxMutations - 1
        }
    }

    private fun rollRandomMutation() {
        val roll = Random.nextInt(1, 1001)

        // Znajdź mutację na podstawie rzutu
        val mutation = allMutations.firstOrNull { roll in it.range }

        if (mutation != null) {
            // Znajdź mutację na liście i przejdź do niej
            currentMutationIndex = allMutations.indexOf(mutation).coerceAtLeast(0)

            binding.textRollResult.text = "Wylosowano: $roll - ${mutation.name}"
            binding.textRollResult.visibility = View.VISIBLE
            updateDisplay()
        } else {
            // Nie znaleziono mutacji dla tego rzutu
            binding.textRollResult.text = "Wylosowano: $roll - brak mutacji w tym zakresie"
            binding.textRollResult.visibility = View.VISIBLE
        }
    }

    private fun updateDisplay() {
        // Get current mutation and update display
        allMutations.getOrNull(currentMutationIndex)?.let { mutation ->
            binding.apply {
                textCurrentMutation.text = mutation.name
                textMutationName.text = mutation.name
                textRange.text = "Zakres: ${mutation.range.first}-${mutation.range.last}"
                textTransformationDegree.text = "Stopień: ${mutation.fearPoints}"

                // Dodatkowe informacje o typie i maksymalnym poziomie
                val typeText = when (mutation.type) {
                    MutationType.SINGLE -> "Pojedyncza"
                    MutationType.MULTIPLE -> "Wielokrotna (max: ${mutation.maxLevel})"
                }
                textType.text = "Typ: $typeText"
                textType.visibility = View.VISIBLE

                // Tags display
                if (mutation.tags.isNotEmpty()) {
                    val tagsText = mutation.tags.joinToString(", ") { it.name }
                    textTags.text = "Tagi: $tagsText"
                    textTags.visibility = View.VISIBLE
                } else {
                    textTags.visibility = View.GONE
                }

                // Description
                textDescription.text = mutation.description

                // Stat modifiers display
                val modifiersText = buildStatModifiersText(mutation.statModifiers)
                if (modifiersText.isNotEmpty()) {
                    textStatModifiers.text = "Modyfikatory statystyk:\n$modifiersText"
                    textStatModifiers.visibility = View.VISIBLE
                } else {
                    textStatModifiers.visibility = View.GONE
                }

                // Variants display
                if (mutation.variants.isNotEmpty()) {
                    layoutVariantsSection.visibility = View.VISIBLE
                    textVariantsTitle.text = "Warianty (rzut k100):"
                    textVariants.text = buildVariantsTableSpannable(mutation.variants)
                } else {
                    layoutVariantsSection.visibility = View.GONE
                }

                // Variants2 display
                if (mutation.variants2.isNotEmpty()) {
                    layoutVariants2Section.visibility = View.VISIBLE
                    textVariants2Title.text = "Dodatkowe warianty (rzut k100):"
                    textVariants2.text = buildVariantsTableSpannable(mutation.variants2)
                } else {
                    layoutVariants2Section.visibility = View.GONE
                }
            }
        }

        // Update counter
        val totalMutations = allMutations.size
        binding.textMutationCounter.text = "${currentMutationIndex + 1} / $totalMutations"
    }

    private fun buildStatModifiersText(modifiers: StatModifiers): String {
        val parts = mutableListOf<String>()

        if (modifiers.ww != 0..0) parts.add("WW: ${formatRange(modifiers.ww)}")
        if (modifiers.us != 0..0) parts.add("US: ${formatRange(modifiers.us)}")
        if (modifiers.k != 0..0) parts.add("K: ${formatRange(modifiers.k)}")
        if (modifiers.odp != 0..0) parts.add("Odp: ${formatRange(modifiers.odp)}")
        if (modifiers.zr != 0..0) parts.add("Zr: ${formatRange(modifiers.zr)}")
        if (modifiers.int != 0..0) parts.add("Int: ${formatRange(modifiers.int)}")
        if (modifiers.sw != 0..0) parts.add("SW: ${formatRange(modifiers.sw)}")
        if (modifiers.ogd != 0..0) parts.add("Ogd: ${formatRange(modifiers.ogd)}")
        if (modifiers.a != 0..0) parts.add("A: ${formatRange(modifiers.a)}")
        if (modifiers.zyw != 0..0) parts.add("Żyw: ${formatRange(modifiers.zyw)}")
        if (modifiers.mag != 0..0) parts.add("Mag: ${formatRange(modifiers.mag)}")
        if (modifiers.sz != 0..0) parts.add("Sz: ${formatRange(modifiers.sz)}")

        return parts.joinToString("\n")
    }

    private fun formatRange(range: IntRange): String {
        return if (range.first == range.last) {
            if (range.first >= 0) "+${range.first}" else "${range.first}"
        } else {
            "${range.first}..${range.last}"
        }
    }

    private fun buildVariantsTableSpannable(variants: List<MutationVariant>): android.text.SpannableStringBuilder {
        val builder = android.text.SpannableStringBuilder()

        variants.forEachIndexed { index, variant ->
            // Główny wariant - pogrubiona nazwa
            val variantName = "${variant.range.first}-${variant.range.last} - ${variant.name}\n"
            val startPos = builder.length
            builder.append(variantName)
            builder.setSpan(
                android.text.style.StyleSpan(android.graphics.Typeface.BOLD),
                startPos,
                builder.length - 1,
                android.text.Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )

            if (variant.description.isNotEmpty()) {
                builder.append("${variant.description}\n")
            }

            // Modyfikatory statystyk wariantu
            val modText = buildStatModifiersText(variant.statModifiers)
            if (modText.isNotEmpty()) {
                builder.append("Modyfikatory: $modText\n")
            }

            // Subwarianty (wcięte) - pogrubione nazwy
            if (variant.subvariants.isNotEmpty()) {
                variant.subvariants.forEach { sub ->
                    val subvariantName = "  ${sub.range.first}-${sub.range.last} - ${sub.name}\n"
                    val subStartPos = builder.length
                    builder.append(subvariantName)
                    builder.setSpan(
                        android.text.style.StyleSpan(android.graphics.Typeface.BOLD),
                        subStartPos,
                        builder.length - 1,
                        android.text.Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                    )

                    if (sub.description.isNotEmpty()) {
                        builder.append("  ${sub.description}\n")
                    }
                    val subModText = buildStatModifiersText(sub.statModifiers)
                    if (subModText.isNotEmpty()) {
                        builder.append("  Modyfikatory: $subModText\n")
                    }
                }
            }

            if (index < variants.size - 1) {
                builder.append("\n")
            }
        }

        return builder
    }
}