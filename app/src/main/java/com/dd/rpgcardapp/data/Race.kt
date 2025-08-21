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
    val zyw: Int = 10,
    val mag: Int = 0,
    val sz: Int = 4,
    val ppOptions: List<Int> = listOf(2, 3, 3),
    val abilities: List<Ability>,
    val skills: List<Skill>,
    val optionalAbility: List<List<Ability>> = listOf(),
    val optionalSkills: List<List<Skill>> = listOf(),
    val startingProfessions: List<Profession> = listOf(),
    val minAge: Int = 16,   // Zakres wieku
    val maxAge: Int = 35,   // Zakres wieku
    val minWeight: Int,
    val maxWeight: Int,
    val minHeight: Int,
    val hair: List<Appearance>,
    val eyes: List<Appearance>
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
        ),
        startingProfessions = StartingProfessions.Human,
        hair = HairColor.HumanHalfling,
        minWeight = 50,
        maxWeight = 110,
        minHeight = 160,
        eyes = EyesColor.Human
    )

    val Elf = Race(
        name = "Elf",
        us = 30, zr = 30, sz = 5,
        zyw = 9,
        ppOptions = listOf(1, 2, 2),
        minAge = 30, maxAge = 125,
        abilities = listOf(
            SpecialAbilities.wiedzaElfy,
            SpecialAbilities.jezykEltharin,
            SpecialAbilities.jezykReikspiel,
        ),
        skills = listOf(
            CommonSkills.bystryWzrok,
            CommonSkills.widzenieWCiemnosci,
        ),
        optionalSkills = listOf(
            listOf(WeaponSkills.dlugieLuki, CommonSkills.zmyslMagii),
            listOf(StatsSkills.opanowanie, StatsSkills.blyskotliwosc)
        ),
        startingProfessions = StartingProfessions.Elf,
        hair = HairColor.ElfHalfElf,
        minWeight = 40,
        maxWeight = 95,
        minHeight = 170,
        eyes = EyesColor.Elf
    )

    val Gnom = Race(
        name = "Gnom",
        k = 10, odp = 30, sw = 30,
        ppOptions = listOf(2, 2, 3),
        minAge = 20, maxAge = 90,
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
        optionalAbility = listOf(
            listOf(SpecialAbilities.rzemiosloGornictwo, SpecialAbilities.rzemiosloKamieniarstwo, SpecialAbilities.rzemiosloKowalstwo),
        ),
        startingProfessions = StartingProfessions.Gnome,
        hair = HairColor.DwarfGnom,
        minWeight = 40,
        maxWeight = 85,
        minHeight = 120,
        eyes = EyesColor.Gnome
    )

    val Krasnolud = Race(
        name = "Krasnolud",
        ww = 30, odp = 30, zr = 10, ogd = 10, sz = 3,
        zyw = 11,
        ppOptions = listOf(1, 2, 3),
        minAge = 20, maxAge = 115,
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
        startingProfessions = StartingProfessions.Dwarf,
        hair = HairColor.DwarfGnom,
        minWeight = 45,
        maxWeight = 100,
        minHeight = 145,
        eyes = EyesColor.Dwarf
    )

    val Niziolek = Race(
        name = "Niziołek",
        ww = 10, us = 30, k = 10, odp = 10, zr = 30, ogd = 30,
        zyw = 8,
        ppOptions = listOf(2, 2, 3),
        minAge = 20, maxAge = 60,
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
        ),
        startingProfessions = StartingProfessions.Halfling,
        hair = HairColor.HumanHalfling,
        minWeight = 35,
        maxWeight = 70,
        minHeight = 110,
        eyes = EyesColor.Halfling
    )

    val Polelf = Race(
        name = "Półelf",
        us = 25, zr = 25, sz = 5,
        zyw = 10,
        ppOptions = listOf(2, 2, 3),
        minAge = 20, maxAge = 100,
        abilities = listOf(
            SpecialAbilities.jezykReikspiel,
        ),
        skills = listOf(
            CommonSkills.bystryWzrok,
            CommonSkills.widzenieWCiemnosci,
        ),
        optionalAbility = listOf(
            listOf(SpecialAbilities.wiedzaElfy, SpecialAbilities.wiedzaImperium),
            listOf(SpecialAbilities.jezykEltharin, CommonAbilities.plotkowanie),
        ),
        optionalSkills = listOf(
            listOf(WeaponSkills.dlugieLuki, CommonSkills.zmyslMagii),
            Random.All,
        ),
        startingProfessions = StartingProfessions.HalfElf,
        hair = HairColor.ElfHalfElf,
        minWeight = 45,
        maxWeight = 100,
        minHeight = 165,
        eyes = EyesColor.HalfElf
    )
    val all = listOf(Czlowiek, Elf, Gnom, Krasnolud, Niziolek, Polelf)
    private val mapByName = all.associateBy { it.name }

    fun getByName(name: String?): Race? = mapByName[name]
}

