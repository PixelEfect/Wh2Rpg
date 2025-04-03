package com.dd.rpgcardapp.data

data class Race(
    val name: String,
    val ww: Int = 20,
    val us: Int = 20,
    val k: Int = 20,
    val odp: Int = 20,
    val zr: Int = 20,
    val int: Int = 20,
    val sw: Int = 20,
    val ogd: Int = 20,
    val a: Int = 1,
    val zyw: Int = 0,
    val mag: Int = 0,
    val sz: Int = 4,
    val abilities: List<Ability>,
    val skills: List<Skill>,
    val optionalAbility: List<List<Ability>> = listOf(),
    val optionalSkills: List<List<Skill>> = listOf()
)
object Races {
    val Czlowiek = Race(
        name = "Człowiek",

        abilities = listOf(
            CommonAbilities.plotkowanie,
            SpecialAbilities.wiedzaImperium,
            SpecialAbilities.jezykReikspiel,
        ),
        skills = listOf(
        ),
        optionalSkills = listOf(
            Random.All,
            Random.All,
        )
    )

    val Elf = Race(
        name = "Elf",
        us = 30, zr = 30, sz = 5,
        abilities = listOf(
            SpecialAbilities.wiedzaElfy,
            SpecialAbilities.jezykEltharin,
            SpecialAbilities.jezykReikspiel,
        ),
        skills = listOf(
            CommonSkills.bystryWzrok,
            CommonSkills.widzenieWCiemnosci,
            StatsSkills.blyskotliwosc,
            StatsSkills.opanowanie,
        ),
        optionalSkills = listOf(
            listOf(WeaponSkills.dlugieLuki, CommonSkills.zmyslMagii),
            listOf(StatsSkills.opanowanie, StatsSkills.blyskotliwosc)
        )
    )

    val Gnom = Race(
        name = "Gnom",
        k = 10, odp = 30, sw = 30,
        abilities = listOf(
            SpecialAbilities.wiedzaGnomy,
            SpecialAbilities.jezykGnomi,
            SpecialAbilities.jezykReikspiel,
        ),
        skills = listOf(
            CommonSkills.czulySluch,
            CommonSkills.czulyWech,
            CommonSkills.dziecieGor,
            CommonSkills.krasnoludzkifach,
            CommonSkills.widzenieWCiemnosci,
            CommonSkills.zapieklaNienawisc,
        ),
        optionalSkills = listOf(
            listOf(WeaponSkills.dlugieLuki, CommonSkills.zmyslMagii),
            listOf(StatsSkills.opanowanie, StatsSkills.blyskotliwosc)
        )
    )

    val Krasnolud = Race(
        name = "Krasnolud",
        ww = 30, odp = 30, zr = 10, ogd = 10, sz = 3,
        abilities = listOf(
            SpecialAbilities.wiedzaKrasnoludy,
            SpecialAbilities.jezykKhazalid,
            SpecialAbilities.jezykReikspiel,
        ),
        skills = listOf(
            CommonSkills.krasnoludzkifach,
            CommonSkills.krzepki,
            CommonSkills.odpornoscNaMagie,
            CommonSkills.odwaga,
            CommonSkills.widzenieWCiemnosci,
            CommonSkills.zapieklaNienawisc,
        ),
        optionalAbility = listOf(
            listOf(SpecialAbilities.rzemiosloGornictwo, SpecialAbilities.rzemiosloKamieniarstwo, SpecialAbilities.rzemiosloKowalstwo),
        ),
    )

    val Niziolek = Race(
        name = "Niziołek",
        ww = 10, us = 30, k = 10, odp = 10, zr = 30, ogd = 30,
        abilities = listOf(
            SpecialAbilities.naukaGeneologiaHeraldyka,
            SpecialAbilities.wiedzaNiziolki,
            SpecialAbilities.jezykNiziolkow,
            SpecialAbilities.jezykReikspiel,
        ),
        skills = listOf(
            CommonSkills.odpornoscNaChaos,
            CommonSkills.widzenieWCiemnosci,
            WeaponSkills.proce,
        ),
        optionalAbility = listOf(
            listOf(SpecialAbilities.rzemiosloGotowanie, SpecialAbilities.rzemiosloUprawaZiemi),
        ),
        optionalSkills = listOf(
            Random.Halfling,
        )
    )
}

//TODO: półelf,