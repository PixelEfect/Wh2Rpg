package com.dd.rpgcardapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.dd.rpgcardapp.data.Paths
import com.dd.rpgcardapp.data.Profession
import com.dd.rpgcardapp.data.ProfessionPaths
import com.dd.rpgcardapp.data.Professions


class ProfessionsConsistencyChecker : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_professions_consistency_checker)

        val textView: TextView = findViewById(R.id.textViewConsistencyReport)

        val inconsistencies = ConsistencyChecker.checkConsistency(ProfessionPaths.paths)
        val reverseInconsistencies = ConsistencyChecker.checkReverseConsistency(ProfessionPaths.paths)

        // Sprawdzamy profesje z najwięcej list w optionalAbility i optionalSkills
        val (maxAbilityProfession, maxAbilityCount) = getMaxOptionalAbility(Professions.professionMap)
        val (maxSkillsProfession, maxSkillsCount) = getMaxOptionalSkills(Professions.professionMap)

        val report = buildString {
            if (inconsistencies.isEmpty()) {
                append("Dane są spójne.\n")
            } else {
                append("Znaleziono niespójności:\n")
                append(inconsistencies.joinToString("\n"))
                append("\n\n")
            }

            if (reverseInconsistencies.isEmpty()) {
                append("Dane są spójne (odwrotne sprawdzenie).\n")
            } else {
                append("Znaleziono niespójności (odwrotne sprawdzenie):\n")
                append(reverseInconsistencies.joinToString("\n"))
            }

            // Dodajemy informacje o profesjach z największą liczbą list
            append("\n\nProfesja z najwięcej list w optionalAbility: ${maxAbilityProfession.name} (${maxAbilityCount} list).")
            append("\nProfesja z najwięcej list w optionalSkills: ${maxSkillsProfession.name} (${maxSkillsCount} list).")
        }

        textView.text = report
    }

    // Funkcja do znalezienia profesji z największą liczbą list w optionalAbility
    private fun getMaxOptionalAbility(professionMap: Map<String, Profession>): Pair<Profession, Int> {
        var maxAbilityProfession: Profession? = null
        var maxAbilityCount = 0
        for ((_, profession) in professionMap) {
            val abilityListCount = profession.optionalAbility.size
            if (abilityListCount > maxAbilityCount) {
                maxAbilityProfession = profession
                maxAbilityCount = abilityListCount
            }
        }
        return maxAbilityProfession!! to maxAbilityCount
    }

    // Funkcja do znalezienia profesji z największą liczbą list w optionalSkills
    private fun getMaxOptionalSkills(professionMap: Map<String, Profession>): Pair<Profession, Int> {
        var maxSkillsProfession: Profession? = null
        var maxSkillsCount = 0
        for ((_, profession) in professionMap) {
            val skillsListCount = profession.optionalSkills.size
            if (skillsListCount > maxSkillsCount) {
                maxSkillsProfession = profession
                maxSkillsCount = skillsListCount
            }
        }
        return maxSkillsProfession!! to maxSkillsCount
    }
}

object ConsistencyChecker {
    fun checkConsistency(paths: Map<Profession, Paths>): List<String> {
        val inconsistencies = mutableListOf<String>()
        for ((profession, path) in paths) {
            for (exitProfession in path.exit) {
                val entryList = paths[exitProfession]?.entry ?: emptyList()
                if (profession !in entryList) {
                    inconsistencies.add("Błąd:  ${exitProfession.name} - brak ${profession.name} w entry.")
                }
            }
        }
        return inconsistencies
    }

    fun checkReverseConsistency(paths: Map<Profession, Paths>): List<String> {
        val inconsistencies = mutableListOf<String>()
        for ((profession, path) in paths) {
            for (entryProfession in path.entry) {
                val exitList = paths[entryProfession]?.exit ?: emptyList()
                if (profession !in exitList) {
                    inconsistencies.add("Błąd:  ${entryProfession.name} nie ma ${profession.name} w exit.")
                }
            }
        }
        return inconsistencies
    }
}