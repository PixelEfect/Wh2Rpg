package com.dd.rpgcardapp.data

data class Profession(
    val name: String,
    val ww: Int = 0,
    val us: Int = 0,
    val k: Int = 0,
    val odp: Int = 0,
    val zr: Int = 0,
    val int: Int = 0,
    val sw: Int = 0,
    val ogd: Int = 0,
    val a: Int = 0,
    val zyw: Int =2,
    val mag: Int = 0,
    val sz: Int = 0,
    val abilities: List<Ability>,
    val skills: List<Skill>,
    val optionalAbility: List<List<Ability>> = listOf(),
    val optionalSkills: List<List<Skill>> = listOf(),
)
object BasicProfessions {
    val Akolita = Profession(
        name = "Akolita",
        ww = 5, us = 5, k = 0, odp = 5, zr = 0, int = 10, sw = 10, ogd = 10,

        abilities = listOf(
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            RareAbilities.leczenie,
            SpecialAbilities.naukaTeologia,
            SpecialAbilities.jezykKlasyczny,
            SpecialAbilities.jezykReikspiel,
        ),
        skills = listOf(
            CommonSkills.przemawianie,

            ),
        optionalAbility = listOf(
            listOf(SpecialAbilities.naukaAstronomia, SpecialAbilities.naukaHistoria)
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.bardzoSilny, StatsSkills.szybkiRefleks),
            listOf(StatsSkills.charyzmatyczny, StatsSkills.urodzonyWojownik)
        ),
    )

    val AkolitaKultuKhorna = Profession(
        name = "Akolita kultu Khorna",
        ww = 20, us = 0, k = 10, odp = 15, zr = 5, int = 0, sw = 15, ogd = 0,
        a = 1, zyw = 4,
        abilities = listOf(
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
            SpecialAbilities.sekretnyjezykBitewny,
        ),
        skills = listOf(
            CommonSkills.silnyCios,
            CommonSkills.uodpornionyNaChaos,
            StatsSkills.twardziel,
        ),
        optionalAbility = listOf(
            KnowledgeAbilities.OldWorld
        ),
        optionalSkills = listOf(
            listOf(WeaponSkills.bronDwureczna, WeaponSkills.korbacze),
            listOf(CommonSkills.morderczyAtak, CommonSkills.mierzonyCios),
            listOf(StatsSkills.niezwykleOdporny, StatsSkills.szybkiRefleks)
        )
    )

    val AkolitaKultuNurgla = Profession(
        name = "Akolita kultu Nurgla",
        ww = 10, us = 0, k = 0, odp = 20, zr = 5, int = 0, sw = 15, ogd = 15,
        zyw = 3, mag = 1,
        abilities = listOf(
            CommonAbilities.charakteryzacja,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.leczenie,
            RareAbilities.splatanieMagii,
            RareAbilities.torturowanie,
            RareAbilities.wykrywanieMagii,
            SpecialAbilities.jezykTajemnyDemoniczny,
            SpecialAbilities.naukaDemonologia,
        ),
        skills = listOf(
            CommonSkills.czarnoksiestwo,
            CommonSkills.niepokojacy,
            CommonSkills.nieustraszony,
            CommonSkills.odpornoscNaChoroby,
            CommonSkills.przemawianie,
            CommonSkills.uodpornionyNaChaos,
            MagicSkills.magiaProstaChaos,
        ),
        optionalAbility = listOf(
            KnowledgeAbilities.OldWorld
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.zmyslMagii, StatsSkills.niezwykleOdporny)
        )
    )

    val AkolitaKultuSlaanesha = Profession(
        name = "Akolita kultu Slaanesha",
        ww = 5, us = 5, k = 0, odp = 0, zr = 10, int = 20, sw = 0, ogd = 25,
        zyw = 3, mag = 1,
        abilities = listOf(
            CommonAbilities.hazard,
            CommonAbilities.plotkowanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.splatanieMagii,
            SpecialAbilities.jezykTajemnyDemoniczny,
            SpecialAbilities.naukaDemonologia,
        ),
        skills = listOf(
            CommonSkills.czarnoksiestwo,
            CommonSkills.etykieta,
            CommonSkills.lotrzyk,
            CommonSkills.uodpornionyNaChaos,
            CommonSkills.wyostrzoneZmysly,
            MagicSkills.magiaProstaChaos,
            StatsSkills.charyzmatyczny,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.charakteryzacja, CommonAbilities.wycena),
            SleightOfHandAbilities.All + CommonAbilities.mocnaGlowa,
            listOf(CommonAbilities.przekonywanie, CommonAbilities.zastraszanie)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.zmyslMagii, CommonSkills.zylkaHandlowa)
        )
    )

    val AkolitaKultuTzeentcha = Profession(
        name = "Akolita kultu Tzeentcha",
        ww = 5, us = 5, k = 0, odp = 0, zr = 5, int = 20, sw = 10, ogd = 20,
        zyw = 3, mag = 1,
        abilities = listOf(
            CommonAbilities.charakteryzacja,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.wycena,
            RareAbilities.czytanieIPisanie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecialAbilities.jezykTajemnyDemoniczny,
            SpecialAbilities.naukaDemonologia,
        ),
        skills = listOf(
            CommonSkills.czarnoksiestwo,
            CommonSkills.etykieta,
            CommonSkills.intrygant,
            CommonSkills.odpornoscNaMagie,
            CommonSkills.kontrolowanaMutacja,
            CommonSkills.poliglota,
            CommonSkills.przemawianie,
            CommonSkills.uodpornionyNaChaos,
            MagicSkills.magiaProstaChaos,
            StatsSkills.charyzmatyczny,
            StatsSkills.opanowanie,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.dowodzenie, CommonAbilities.przekonywanie),
            ScienceAbilities.All,
            listOf(CommonAbilities.plotkowanie, CommonAbilities.zastraszanie),
            CraftAbilities.All + LanguageAbilities.All,
            KnowledgeAbilities.OldWorld + RareAbilities.warzenieTrucizn,
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.blyskotliwosc, CommonSkills.obiezyswiat),
            listOf(CommonSkills.zmyslMagii, CommonSkills.zylkaHandlowa)
        )
    )

    val Aptekarz = Profession(
        name = "Aptekarz",
        ww = 0, us = 0, k = 0, odp = 5, zr = 5, int = 10, sw = 10, ogd = 5,

        abilities = listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.targowanie,
            SpecialAbilities.naukaAlchemia,
            SpecialAbilities.rzemiosloAptekarstwo,
            SpecialAbilities.sekretnyjezykGildii,
            SpecialAbilities.jezykKlasyczny,
        ),
        skills = listOf(
        ),
        optionalAbility = listOf(
            listOf(RareAbilities.leczenie, RareAbilities.warzenieTrucizn),
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.charyzmatyczny, StatsSkills.niezwykleOdporny),
            listOf(CommonSkills.etykieta, CommonSkills.odpornoscNaTrucizny)
        )
    )

    val Bagiennik = Profession(
        name = "Bagiennik",
        ww = 5, us = 10, k = 0, odp = 5, zr = 10, int = 5, sw = 0, ogd = 0,
        zyw = 3,
        abilities = listOf(
            CommonAbilities.charakteryzacja,
            CommonAbilities.plywanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            RareAbilities.zastawianiePulapek,
        ),
        skills = listOf(
            CommonSkills.wedrowiec,
            StatsSkills.strzelecWyborowy,
            StatsSkills.twardziel,
            WeaponSkills.bronUnieruchamiajaca,
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.opanowanie, StatsSkills.szybkiRefleks),
        )
    )

    val Bajarz = Profession(
        name = "Bajarz",
        ww = 5, us = 0, k = 0, odp = 0, zr = 5, int = 10, sw = 10, ogd = 10,

        abilities = listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.gadanina,
            SpecialAbilities.kuglarstwoGawedziarstwo,
            SpecialAbilities.kuglarstwoKomedianctwo,
        ),
        skills = listOf(
            CommonSkills.obiezyswiat,
            CommonSkills.przemawianie,
        ),
        optionalAbility = listOf(
            KnowledgeAbilities.OldWorld,
            LanguageAbilities.All
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.etykieta, StatsSkills.twardziel)
        )
    )

    val Balsamista = Profession(
        name = "Balsamista",
        ww = 0, us = 0, k = 5, odp = 5, zr = 0, int = 15, sw = 10, ogd = 5,

        abilities = listOf(
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            RareAbilities.czytanieIPisanie,
            RareAbilities.leczenie,
            RareAbilities.zwinnePalce,
            SpecialAbilities.naukaAnatomia,
            SpecialAbilities.naukaNekromancja,
            SpecialAbilities.rzemiosloAptekarstwo,
            SpecialAbilities.jezykKlasyczny,
        ),
        skills = listOf(
            CommonSkills.chirurgia,
            CommonSkills.odpornoscNaChoroby,
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.lotrzyk, CommonSkills.zylkaHandlowa)
        )
    )

    val Banita = Profession(
        name = "Banita",
        ww = 10, us = 10, k = 0, odp = 0, zr = 10, int = 5, sw = 0, ogd = 0,
        a = 1,
        abilities = listOf(
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            RareAbilities.unik,
        ),
        skills = listOf(
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.opiekaNadZwierzetami, SpecialAbilities.wiedzaImperium),
            listOf(CommonAbilities.plotkowanie, SpecialAbilities.sekretneZnakiZlodziei),
            listOf(CommonAbilities.plywanie, RareAbilities.zastawianiePulapek),
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.strzalMierzony, CommonSkills.ogluszenie),
            listOf(CommonSkills.wedrowiec, CommonSkills.lotrzyk),
        ),
    )

    val BerserkerZNorski = Profession(
        name = "Berserker z Norski",
        ww = 15, us = 0, k = 10, odp = 10, zr = 0, int = 0, sw = 10, ogd = 0,

        abilities = listOf(
            CommonAbilities.mocnaGlowa,
            CommonAbilities.plywanie,
            CommonAbilities.zastraszanie,
            SpecialAbilities.kuglarstwoGawedziarstwo,
            SpecialAbilities.wiedzaNorska,
            SpecialAbilities.jezykNorski,
        ),
        skills = listOf(
            CommonSkills.grozny,
            CommonSkills.szalBojowy,
            CommonSkills.szybkieWyciagniecie,
            WeaponSkills.bronDwureczna,
        ),
    )

    val BlednyRycerz = Profession(
        name = "Błędny rycerz",
        ww = 15, us = 0, k = 5, odp = 5, zr = 5, int = 0, sw = 5, ogd = 5,
        a = 1,
        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.sztukaPrzetrwania,
            RareAbilities.tresura,
            RareAbilities.unik,
            SpecialAbilities.naukaGeneologiaHeraldyka,
        ),
        skills = listOf(
            CommonSkills.etykieta,
            CommonSkills.obiezyswiat,
            CommonSkills.silnyCios,
            KnightSkills.cnotaRycerskosci,
            WeaponSkills.bronKawaleryjska,
        ),
        optionalAbility = listOf(
            KnowledgeAbilities.OldWorld,
            LanguageAbilities.All
        )
    )


    val BylySkazaniec = Profession(
        name = "Były skazaniec",
        ww = 10, us = 0, k = 5, odp = 10, zr = 5, int = 0, sw = 10, ogd = 0,

        abilities = listOf(
            CommonAbilities.ukrywanieSie,
            RareAbilities.unik,
            RareAbilities.zwinnePalce,
            SpecialAbilities.sekretnyjezykWieziennySlang,
        ),
        skills = listOf(
            CommonSkills.chodu,
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.odpornoscNaChoroby, StatsSkills.szybkiRefleks),
            listOf(CommonSkills.ulicznik, CommonSkills.bijatyka),
        )
    )

    val Cenobita = Profession(
        name = "Cenobita",
        ww = 5, us = 0, k = 5, odp = 10, zr = 0, int = 5, sw = 10, ogd = 5,

        abilities = listOf(
            CommonAbilities.spostrzegawczosc,
            RareAbilities.gadanina,
            RareAbilities.leczenie,
            RareAbilities.torturowanie,
            SpecialAbilities.naukaTeologia,
            SpecialAbilities.wiedzaKsiestwaGraniczne,
        ),
        skills = listOf(
            CommonSkills.odpornoscPsychiczna,
            CommonSkills.odpornoscNaTrucizny,
            CommonSkills.odwaga,
            StatsSkills.twardziel,
        ),
    )

    val Chlop = Profession(
        name = "Chłop",
        ww = 5, us = 5, k = 5, odp = 10, zr = 5, int = 0, sw = 5, ogd = 0,

        abilities = listOf(
            CommonAbilities.ukrywanieSie,
        ),
        skills = listOf(
        ),
        optionalAbility = listOf(
            listOf(
                CommonAbilities.hazard,
                SpecialAbilities.kuglarstwoSpiew,
                SpecialAbilities.kuglarstwoTaniec
            ),
            listOf(CommonAbilities.opiekaNadZwierzetami, CommonAbilities.przekonywanie),
            listOf(RareAbilities.oswajanie, SpecialAbilities.rzemiosloGotowanie),
            listOf(CommonAbilities.powozenie, SpecialAbilities.rzemiosloWyrobLukow),
            listOf(CommonAbilities.sztukaPrzetrwania, SpecialAbilities.rzemiosloUprawaZiemi),
            listOf(RareAbilities.tresura, CommonAbilities.plywanie),
            listOf(RareAbilities.zastawianiePulapek, CommonAbilities.wioslarstwo),
            listOf(CommonAbilities.wspinaczka, CommonAbilities.skradanieSie),
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.chodu, WeaponSkills.proce),
            listOf(CommonSkills.wedrowiec, StatsSkills.twardziel),
        ),
    )

    val CiuraObozowa = Profession(
        name = "Ciura Obozowa",
        ww = 0, us = 0, k = 0, odp = 5, zr = 10, int = 5, sw = 5, ogd = 10,

        abilities = listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            RareAbilities.zwinnePalce,
        ),
        skills = listOf(
            CommonSkills.chodu,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.opiekaNadZwierzetami, CommonAbilities.powozenie),
            listOf(CommonAbilities.przekonywanie, CommonAbilities.wycena),
            listOf(
                SpecialAbilities.rzemiosloGotowanie,
                SpecialAbilities.rzemiosloHandel,
                SpecialAbilities.rzemiosloKartografia,
                SpecialAbilities.rzemiosloKowalstwo,
                SpecialAbilities.rzemiosloKrawiectwo,
                SpecialAbilities.rzemiosloPlatnerstwo,
                SpecialAbilities.rzemiosloRusznikarstwo,
                SpecialAbilities.rzemiosloWyrobLukow,
                SpecialAbilities.rzemiosloZielarstwo
            ),
            listOf(
                SpecialAbilities.jezykBretonski,
                SpecialAbilities.jezykKislevski,
                SpecialAbilities.jezykTileanski
            ),
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.odpornoscNaChoroby, CommonSkills.obiezyswiat),
            listOf(StatsSkills.charyzmatyczny, StatsSkills.twardziel),
            listOf(CommonSkills.zylkaHandlowa, CommonSkills.bijatyka),
        ),
    )

    val Cyrkowiec = Profession(
        name = "Cyrkowiec",
        ww = 5, us = 10, k = 0, odp = 0, zr = 10, int = 0, sw = 5, ogd = 10,

        abilities = listOf(
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            SpecialAbilities.wiedzaImperium,
        ),
        skills = listOf(
        ),
        optionalAbility = listOf(
            SleightOfHandAbilities.All,
            SleightOfHandAbilities.All,
            listOf(CommonAbilities.opiekaNadZwierzetami, CommonAbilities.plywanie),
            listOf(CommonAbilities.plotkowanie, CommonAbilities.wycena),
            listOf(
                SpecialAbilities.jezykReikspiel,
                RareAbilities.brzuchomowstwo,
                RareAbilities.gadanina,
                RareAbilities.hipnoza,
                CommonAbilities.jezdziectwo,
                RareAbilities.oswajanie,
                RareAbilities.tresura,
                CommonAbilities.wspinaczka,
                RareAbilities.zwinnePalce
            )
        ),
        optionalSkills = listOf(
            Acrobat.All,
            Acrobat.All,
        ),
    )

    val Cyrulik = Profession(
        name = "Cyrulik",
        ww = 5, us = 0, k = 0, odp = 0, zr = 10, int = 10, sw = 10, ogd = 5,

        abilities = listOf(
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.leczenie,
            SpecialAbilities.rzemiosloAptekarstwo,
        ),
        skills = listOf(
            CommonSkills.chirurgia,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.powozenie, CommonAbilities.plywanie),
            listOf(
                SpecialAbilities.jezykBretonski,
                SpecialAbilities.jezykReikspiel,
                SpecialAbilities.jezykTileanski
            )
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.charyzmatyczny, StatsSkills.niezwykleOdporny),
            listOf(CommonSkills.odpornoscNaChoroby, StatsSkills.blyskotliwosc)
        ),
    )

    val Czekista = Profession(
        name = "Czekista",
        ww = 10, us = 5, k = 5, odp = 5, zr = 5, int = 5, sw = 5, ogd = 0,

        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.jezdziectwo,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.tropienie,
            SpecialAbilities.wiedzaKislev,
        ),
        skills = listOf(
            CommonSkills.grozny,
        ),
        optionalAbility = listOf(
            listOf(SpecialAbilities.naukaPrawo, CommonAbilities.zastraszanie),
            listOf(RareAbilities.sledzenie, RareAbilities.unik)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.rozbrajanie, WeaponSkills.bronPalna),
            listOf(CommonSkills.ogluszenie, CommonSkills.silnyCios)
        )
    )

    val CzeladnikRun = Profession(
        name = "Czeladnik run",
        ww = 5, us = 0, k = 5, odp = 0, zr = 0, int = 10, sw = 15, ogd = 0,
        mag = 1,
        abilities = listOf(
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.wycena,
            RareAbilities.czytanieIPisanie,
            RareAbilities.wykuwanieRun,
            SpecialAbilities.jezykTajemnyKrasnoludzki,
            SpecialAbilities.naukaRuny,
            SpecialAbilities.rzemiosloKowalstwo,
            SpecialAbilities.rzemiosloPlatnerstwo,
        ),
        skills = listOf(
        ),
        optionalSkills = listOf(
            MinorRuneForging.All, MinorRuneForging.All
        )
    )

    val Doker = Profession(
        name = "Doker",
        ww = 0, us = 5, k = 10, odp = 10, zr = 5, int = 0, sw = 5, ogd = 0,

        abilities = listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.plywanie,
            SpecialAbilities.kuglarstwoSpiew,
            SpecialAbilities.sekretnyjezykGildii,
        ),
        skills = listOf(
            StatsSkills.bardzoSilny,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.hazard, CommonAbilities.mocnaGlowa),
            listOf(CommonAbilities.przeszukiwanie, CommonAbilities.spostrzegawczosc),
            listOf(CommonAbilities.wspinaczka, RareAbilities.unik)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.krzepki, StatsSkills.szybkiRefleks)
        )
    )

    val Dylentant = Profession(
        name = "Dylentant",
        ww = 5, us = 5, k = 5, odp = 5, zr = 5, int = 5, sw = 5, ogd = 5,

        abilities = listOf(
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            RareAbilities.gadanina,
            RareAbilities.nawigacja,
        ),
        skills = listOf(
            StatsSkills.bardzoSilny,
        ),
        optionalAbility = listOf(
            ScienceAbilities.All,
            KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
            listOf(CommonAbilities.plotkowanie, CommonAbilities.wycena),
            SignsAndLanguagesAbilities.Signs, SignsAndLanguagesAbilities.Lang,
            LanguageAbilities.All, LanguageAbilities.All,
            listOf(SpecialAbilities.rzemiosloSztuka, SpecialAbilities.rzemiosloKaligrafia, SpecialAbilities.rzemiosloKartografia)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.krzepki, StatsSkills.szybkiRefleks)
        )
    )

    val Fanatyk = Profession(
        name = "Fanatyk",
        ww = 10, us = 0, k = 5, odp = 10, zr = 0, int = 0, sw = 10, ogd = 5,

        abilities = listOf(
            CommonAbilities.przekonywanie,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            SpecialAbilities.naukaTeologia,
            SpecialAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.przemawianie,
            WeaponSkills.korbacze,
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.opanowanie, StatsSkills.bardzoSilny),
            listOf(StatsSkills.charyzmatyczny, StatsSkills.twardziel),
        )
    )

    val Flisak = Profession(
        name = "Flisak",
        ww = 10, us = 5, k = 5, odp = 5, zr = 10, int = 5, sw = 0, ogd = 0,

        abilities = listOf(
            CommonAbilities.plywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.wioslarstwo,
            RareAbilities.nawigacja,
            RareAbilities.zeglarstwo,
        ),
        skills = listOf(
            CommonSkills.obiezyswiat,
            CommonSkills.wyczucieKierunku,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.mocnaGlowa, CommonAbilities.plotkowanie),
            listOf(SpecialAbilities.sekretnyjezykLowcow, SpecialAbilities.jezykKislevski),
            listOf(SpecialAbilities.wiedzaImperium, SpecialAbilities.wiedzaKislev)
        )
    )

    val Gazeciarz = Profession(
        name = "Gazeciarz",
        ww = 5, us = 5, k = 0, odp = 0, zr = 10, int = 5, sw = 0, ogd = 10,

        abilities = listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            RareAbilities.czytanieIPisanie,
            SpecialAbilities.kuglarstwoGawedziarstwo,
            SpecialAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.przemawianie,
        ),
        optionalAbility = listOf(
            listOf(RareAbilities.gadanina, RareAbilities.zwinnePalce)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.bijatyka, CommonSkills.lotrzyk)
        )
    )

    val Giermek = Profession(
        name = "Giermek",
        ww = 10, us = 5, k = 5, odp = 5, zr = 5, int = 0, sw = 0, ogd = 5,
        a = 1,
        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.opiekaNadZwierzetami,
            RareAbilities.tresura,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.etykieta,
            CommonSkills.silnyCios,
            WeaponSkills.bronKawaleryjska,
        ),
        optionalAbility = listOf(
            listOf(SpecialAbilities.naukaGeneologiaHeraldyka, SpecialAbilities.wiedzaBretonia),
            listOf(SpecialAbilities.jezykBretonski, SpecialAbilities.jezykReikspiel),
            listOf(CommonAbilities.plotkowanie, CommonAbilities.przekonywanie)
        )
    )

    val Gladiator = Profession(
        name = "Gladiator",
        ww = 15, us = 0, k = 0, odp = 10, zr = 10, int = 0, sw = 10, ogd = 0,

        abilities = listOf(
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.silnyCios,
            WeaponSkills.bronDwureczna,
            WeaponSkills.korbacze,
            WeaponSkills.bronParujaca,
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.bardzoSilny, CommonSkills.odpornoscPsychiczna),
            listOf(CommonSkills.rozbrajanie, CommonSkills.zapasy),
            listOf(CommonSkills.szybkieWyciagniecie, CommonSkills.morderczyAtak),
        )
    )

    val Goniec = Profession(
        name = "Goniec",
        ww = 10, us = 0, k = 5, odp = 5, zr = 10, int = 5, sw = 5, ogd = 0,
        sz = 1,
        abilities = listOf(
            CommonAbilities.plywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            RareAbilities.nawigacja,
            RareAbilities.unik,
            SpecialAbilities.sekretneZnakiZwiadowcow,
        ),
        skills = listOf(
            CommonSkills.blyskawicznePrzadowanie,
            CommonSkills.chodu,
            CommonSkills.wyczucieKierunku,
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.bardzoSzybki, CommonSkills.szostyZmysl),
            listOf(StatsSkills.bardzoSilny, StatsSkills.niezwykleOdporny),
        )
    )

    val Gornik = Profession(
        name = "Górnik",
        ww = 5, us = 5, k = 10, odp = 5, zr = 0, int = 5, sw = 5, ogd = 0,

        abilities = listOf(
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.wspinaczka,
            RareAbilities.nawigacja,
        ),
        skills = listOf(
            CommonSkills.wyczucieKierunku,
            WeaponSkills.bronDwureczna,
        ),
        optionalAbility = listOf(
            listOf(
                SpecialAbilities.rzemiosloGornictwo,
                SpecialAbilities.rzemiosloGornictwoOdkrywkowe
            ),
            listOf(CommonAbilities.ukrywanieSie, CommonAbilities.powozenie),
            listOf(CommonAbilities.wycena, CommonAbilities.sztukaPrzetrwania),
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.niezwykleOdporny, StatsSkills.urodzonyWojownik)
        )
    )

    val Grabaz = Profession(
        name = "Grabaż",
        ww = 5, us = 5, k = 10, odp = 10, zr = 0, int = 0, sw = 10, ogd = 0,

        abilities = listOf(
            CommonAbilities.powozenie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.wycena,
            RareAbilities.unik,
            SpecialAbilities.naukaTeologia,
            SpecialAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.odpornoscNaChoroby,
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.bardzoSilny, CommonSkills.odwaga)
        )
    )

    val Grabiezca = Profession(
        name = "Grabieżca",
        ww = 10, us = 0, k = 5, odp = 5, zr = 10, int = 0, sw = 10, ogd = 0,
        a = 1,
        abilities = listOf(
            CommonAbilities.mocnaGlowa,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.nawigacja,
            RareAbilities.tropienie,
            SpecialAbilities.naukaTeologia,
            SpecialAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.wyczucieKierunku,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.jezdziectwo, RareAbilities.zeglarstwo)
        ),
        optionalSkills = listOf(
            listOf(
                WeaponSkills.bronDwureczna,
                WeaponSkills.bronKawaleryjska,
                WeaponSkills.korbacze
            ),
            listOf(CommonSkills.morderczyAtak, CommonSkills.mierzonyCios)
        )
    )

    val Guslarz = Profession(
        name = "Guślarz",
        ww = 0, us = 0, k = 0, odp = 5, zr = 5, int = 5, sw = 10, ogd = 10,
        mag = 1,
        abilities = listOf(
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
        ),
        skills = listOf(
            CommonSkills.gusla,
            MagicSkills.magiaProstaGusla,
        ),
        optionalAbility = listOf(
            listOf(RareAbilities.hipnoza, RareAbilities.leczenie),
            listOf(CommonAbilities.opiekaNadZwierzetami, CommonAbilities.targowanie),
            listOf(RareAbilities.oswajanie, SpecialAbilities.rzemiosloAptekarstwo),
            listOf(CommonAbilities.przekonywanie, CommonAbilities.zastraszanie),
        )
    )

    val HienaCmentarna = Profession(
        name = "Hiena cmentarna",
        ww = 10, us = 0, k = 0, odp = 0, zr = 10, int = 10, sw = 10, ogd = 5,

        abilities = listOf(
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.wspinaczka,
            CommonAbilities.wycena,
            RareAbilities.czytanieIPisanie,
        ),
        skills = listOf(
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.skradanieSie, RareAbilities.otwieranieZamkow),
            listOf(CommonAbilities.sztukaPrzetrwania, CommonAbilities.ukrywanieSie),
            listOf(SpecialAbilities.wiedzaImperium, SpecialAbilities.sekretneZnakiZlodziei),
            listOf(
                SpecialAbilities.jezykEltharin,
                SpecialAbilities.jezykKhazalid,
                SpecialAbilities.jezykKlasyczny
            ),
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.szczescie, CommonSkills.szostyZmysl),
            listOf(CommonSkills.grotolaz, CommonSkills.wykrywaniePulapek),
        )
    )

    val Kadet = Profession(
        name = "Kadet",
        ww = 5, us = 5, k = 0, odp = 0, zr = 5, int = 10, sw = 5, ogd = 10,

        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.jezdziectwo,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            SpecialAbilities.naukaStrategiaTaktyka,
            SpecialAbilities.sekretnyjezykBitewny,
            SpecialAbilities.jezykKlasyczny,
        ),
        skills = listOf(
            CommonSkills.rozbrajanie,
            WeaponSkills.bronSzermiercza,
        ),
        optionalAbility = listOf(
            listOf(
                SpecialAbilities.wiedzaBretonia,
                SpecialAbilities.wiedzaImperium,
                SpecialAbilities.wiedzaTilea
            ),
            listOf(
                SpecialAbilities.jezykBretonski,
                SpecialAbilities.jezykReikspiel,
                SpecialAbilities.jezykTileanski
            ),
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.blyskotliwosc, StatsSkills.urodzonyWojownik),
        )
    )

    val Kanciarz = Profession(
        name = "Kanciarz",
        ww = 5, us = 5, k = 0, odp = 0, zr = 10, int = 5, sw = 5, ogd = 10,

        abilities = listOf(
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.wycena,
            RareAbilities.gadanina,
            SpecialAbilities.jezykReikspiel,
        ),
        skills = listOf(
            CommonSkills.przemawianie,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.hazard, SpecialAbilities.sekretneZnakiZlodziei),
            listOf(SpecialAbilities.kuglarstwoAktorstwo, SpecialAbilities.kuglarstwoGawedziarstwo),
            listOf(CommonAbilities.plotkowanie, CommonAbilities.targowanie),
            listOf(CommonAbilities.przeszukiwanie, SpecialAbilities.sekretnyjezykZlodziei),
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.chodu, CommonSkills.lotrzyk),
            listOf(CommonSkills.szczescie, CommonSkills.szostyZmysl)
        )
    )

    val Kartograf = Profession(
        name = "Kartograf",
        ww = 5, us = 0, k = 0, odp = 5, zr = 5, int = 10, sw = 5, ogd = 5,

        abilities = listOf(
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            RareAbilities.nawigacja,
            SpecialAbilities.naukaGeografia,
            SpecialAbilities.rzemiosloKartografia,
        ),
        skills = listOf(
            CommonSkills.bystryWzrok,
            CommonSkills.wyczucieKierunku,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.sztukaPrzetrwania, CommonAbilities.jezdziectwo)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.obiezyswiat, CommonSkills.geniuszArytmetyczny)
        )
    )

    val Koczownik = Profession(
        name = "Koczownik",
        ww = 10, us = 10, k = 0, odp = 5, zr = 5, int = 0, sw = 10, ogd = 0,

        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.wycena,
            SpecialAbilities.wiedzaKrajTrolli,
        ),
        skills = listOf(
        ),
        optionalAbility = listOf(
            listOf(SpecialAbilities.kuglarstwoTaniec, CommonAbilities.spostrzegawczosc),
            listOf(RareAbilities.leczenie, CommonAbilities.ukrywanieSie),
            listOf(CommonAbilities.mocnaGlowa, RareAbilities.oswajanie),
            listOf(RareAbilities.nawigacja, SpecialAbilities.sekretneZnakiZwiadowcow),
            listOf(SpecialAbilities.rzemiosloGotowanie, RareAbilities.tresura),
            listOf(SpecialAbilities.rzemiosloWyrobLukow, RareAbilities.tropienie)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.wedrowiec, StatsSkills.twardziel)
        )
    )

    val Kominiarz = Profession(
        name = "Kominiarz",
        ww = 5, us = 0, k = 5, odp = 5, zr = 5, int = 0, sw = 5, ogd = 5,

        abilities = listOf(
            CommonAbilities.mocnaGlowa,
            CommonAbilities.plotkowanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wspinaczka,
            SpecialAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.lotrzyk,
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.bardzoSilny, CommonSkills.czlowiekGuma)
        )
    )

    val Koniarz = Profession(
        name = "Koniarz",
        ww = 0, us = 5, k = 5, odp = 0, zr = 5, int = 5, sw = 5, ogd = 5,

        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            RareAbilities.oswajanie,
            RareAbilities.tropienie,
            SpecialAbilities.jezykKislevski,
        ),
        skills = listOf(
            StatsSkills.charyzmatyczny,
            WeaponSkills.bronUnieruchamiajaca,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.mocnaGlowa, CommonAbilities.przekonywanie)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.chodu, CommonSkills.zylkaHandlowa)
        )
    )

    val Korsarz = Profession(
        name = "Korsarz",
        ww = 10, us = 0, k = 10, odp = 5, zr = 10, int = 0, sw = 0, ogd = 0,
        a = 1,
        abilities = listOf(
            CommonAbilities.mocnaGlowa,
            CommonAbilities.plywanie,
            CommonAbilities.wioslarstwo,
            CommonAbilities.wspinaczka,
            RareAbilities.unik,
            RareAbilities.zeglarstwo,
        ),
        skills = listOf(
            CommonSkills.obiezyswiat,
        ),
        optionalAbility = listOf(
            listOf(
                SpecialAbilities.wiedzaBretonia,
                SpecialAbilities.wiedzaEstalia,
                SpecialAbilities.wiedzaImperium,
                SpecialAbilities.wiedzaJalowaKraina,
                SpecialAbilities.wiedzaKsiestwaGraniczne,
                SpecialAbilities.wiedzaLustria,
                SpecialAbilities.wiedzaNorska,
                SpecialAbilities.wiedzaTilea
            ),
            listOf(
                SpecialAbilities.jezykBretonski,
                SpecialAbilities.jezykEstalijski,
                SpecialAbilities.jezykReikspiel,
                SpecialAbilities.jezykTileanski
            )
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.bijatyka, StatsSkills.twardziel),
            listOf(CommonSkills.grozny, CommonSkills.silnyCios)
        )
    )

    val KozakKislevski = Profession(
        name = "Kozak kislevski",
        ww = 10, us = 10, k = 0, odp = 10, zr = 0, int = 0, sw = 10, ogd = 0,

        abilities = listOf(
            CommonAbilities.mocnaGlowa,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            RareAbilities.unik,
            SpecialAbilities.wiedzaKislev,
            SpecialAbilities.jezykKislevski,
        ),
        skills = listOf(
            CommonSkills.morderczyAtak,
            WeaponSkills.bronDwureczna,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.hazard, CommonAbilities.targowanie),
        )
    )

    val Latarnik = Profession(
        name = "Latarnik",
        ww = 5, us = 0, k = 5, odp = 0, zr = 10, int = 5, sw = 5, ogd = 5,

        abilities = listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.targowanie,
            CommonAbilities.wspinaczka,
            SpecialAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.chodu,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.mocnaGlowa, CommonAbilities.powozenie)
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.blyskotliwosc, CommonSkills.bystryWzrok)
        )
    )

    val Lesnik = Profession(
        name = "Leśnik",
        ww = 10, us = 0, k = 10, odp = 0, zr = 5, int = 0, sw = 10, ogd = 0,
        zyw = 3,
        abilities = listOf(
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            SpecialAbilities.sekretneZnakiLowcow,
            SpecialAbilities.sekretnyjezykLowcow,
        ),
        skills = listOf(
            CommonSkills.wedrowiec,
            WeaponSkills.bronDwureczna,
        ),
        optionalAbility = listOf(
            listOf(RareAbilities.tropienie, RareAbilities.zastawianiePulapek),
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.bardzoSzybki, StatsSkills.niezwykleOdporny)
        )
    )

    val Lowca = Profession(
        name = "Łowca",
        ww = 0, us = 15, k = 0, odp = 5, zr = 10, int = 5, sw = 0, ogd = 0,
        zyw = 3,
        abilities = listOf(
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            RareAbilities.tropienie,
            SpecialAbilities.sekretneZnakiLowcow,
        ),
        skills = listOf(
            CommonSkills.blyskawicznePrzadowanie,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.przeszukiwanie, CommonAbilities.plywanie),
            listOf(CommonAbilities.skradanieSie, RareAbilities.zastawianiePulapek),
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.wedrowiec, StatsSkills.strzelecWyborowy),
            listOf(StatsSkills.szybkiRefleks, StatsSkills.niezwykleOdporny),
            listOf(StatsSkills.twardziel, WeaponSkills.dlugieLuki),
        )
    )

    val LowcaNagrod = Profession(
        name = "Łowca nagród",
        ww = 5, us = 10, k = 5, odp = 0, zr = 10, int = 0, sw = 5, ogd = 0,

        abilities = listOf(
            CommonAbilities.przeszukiwanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.zastraszanie,
            RareAbilities.sledzenie,
            RareAbilities.tropienie,
        ),
        skills = listOf(
            CommonSkills.wedrowiec,
            WeaponSkills.bronUnieruchamiajaca,
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.strzalMierzony, CommonSkills.silnyCios),
            listOf(CommonSkills.ogluszenie, StatsSkills.strzelecWyborowy),
        )
    )

    val Mieszczanin = Profession(
        name = "Mieszczanin",
        ww = 5, us = 0, k = 0, odp = 0, zr = 5, int = 10, sw = 5, ogd = 5,

        abilities = listOf(
            CommonAbilities.powozenie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            SpecialAbilities.jezykReikspiel,
        ),
        skills = listOf(
            CommonSkills.zylkaHandlowa,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.plotkowanie, RareAbilities.czytanieIPisanie),
            listOf(SpecialAbilities.wiedzaImperium, CommonAbilities.mocnaGlowa),
            listOf(
                SpecialAbilities.jezykBretonski,
                SpecialAbilities.jezykKislevski,
                SpecialAbilities.jezykTileanski
            ),
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.blyskotliwosc, StatsSkills.charyzmatyczny)
        )
    )

    val Mytnik = Profession(
        name = "Mytnik",
        ww = 10, us = 5, k = 5, odp = 10, zr = 5, int = 0, sw = 5, ogd = 0,

        abilities = listOf(
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.wycena,
            RareAbilities.czytanieIPisanie,
            RareAbilities.unik,
        ),
        skills = listOf(
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.plotkowanie, CommonAbilities.targowanie),
            listOf(
                SpecialAbilities.jezykBretonski,
                SpecialAbilities.jezykKislevski,
                SpecialAbilities.jezykTileanski
            ),
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.szybkiRefleks, StatsSkills.strzelecWyborowy)
        )
    )

    val Najemnik = Profession(
        name = "Najemnik",
        ww = 10, us = 10, k = 5, odp = 5, zr = 5, int = 0, sw = 5, ogd = 0,
        a = 1,
        abilities = listOf(
            RareAbilities.unik,
            SpecialAbilities.sekretnyjezykBitewny,
        ),
        skills = listOf(


        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.plotkowanie, CommonAbilities.targowanie),
            listOf(CommonAbilities.hazard, CommonAbilities.opiekaNadZwierzetami),
            listOf(CommonAbilities.powozenie, CommonAbilities.jezdziectwo),
            listOf(CommonAbilities.przeszukiwanie, CommonAbilities.spostrzegawczosc),
            listOf(
                SpecialAbilities.wiedzaBretonia,
                SpecialAbilities.wiedzaKislev,
                SpecialAbilities.wiedzaTilea
            ),
            listOf(SpecialAbilities.jezykTileanski, CommonAbilities.plywanie),
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.blyskawicznePrzadowanie, CommonSkills.silnyCios),
            listOf(CommonSkills.rozbrajanie, CommonSkills.szybkieWyciagniecie),
            listOf(CommonSkills.ogluszenie, CommonSkills.strzalMierzony),
        )
    )

    val Ochotnik = Profession(
        name = "Ochotnik",
        ww = 10, us = 5, k = 5, odp = 5, zr = 10, int = 0, sw = 0, ogd = 0,

        abilities = listOf(
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.silnyCios,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.plotkowanie, CommonAbilities.hazard),
            listOf(CommonAbilities.plywanie, CommonAbilities.powozenie),
            CraftAbilities.All,
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.blyskawicznePrzadowanie, WeaponSkills.bronDwureczna)
        )
    )

    val Ochroniarz = Profession(
        name = "Ochroniarz",
        ww = 10, us = 0, k = 5, odp = 5, zr = 5, int = 0, sw = 0, ogd = 0,
        a = 1, zyw = 3,
        abilities = listOf(
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.leczenie,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.ogluszenie,
            WeaponSkills.bronParujaca,
            WeaponSkills.bronRzucana,
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.bardzoSilny, StatsSkills.niezwykleOdporny),
            listOf(CommonSkills.rozbrajanie, CommonSkills.szybkieWyciagniecie)
        )
    )

    val Oprych = Profession(
        name = "Oprych",
        ww = 10, us = 0, k = 5, odp = 5, zr = 0, int = 0, sw = 5, ogd = 5,
        a = 1,
        abilities = listOf(
            CommonAbilities.hazard,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
            SpecialAbilities.sekretnyjezykZlodziei,
        ),
        skills = listOf(
            CommonSkills.ogluszenie,
            CommonSkills.rozbrajanie,
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.morderczyAtak, CommonSkills.zapasy, CommonSkills.mierzonyCios),
            listOf(CommonSkills.odpornoscNaTrucizny, CommonSkills.szybkieWyciagniecie),
            listOf(StatsSkills.opanowanie, StatsSkills.szybkiRefleks),
        )
    )

    val Pacholek = Profession(
        name = "Pachołek",
        ww = 10, us = 0, k = 5, odp = 10, zr = 10, int = 0, sw = 0, ogd = 0,

        abilities = listOf(
            CommonAbilities.hazard,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.plotkowanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.morderczyAtak,
            CommonSkills.silnyCios,
            WeaponSkills.bronDwureczna,
        ),
    )

    val PasterzZCarcassonne = Profession(
        name = "Pasterz z Carcassonne",
        ww = 5, us = 10, k = 0, odp = 0, zr = 10, int = 5, sw = 0, ogd = 0,
        a = 1,
        abilities = listOf(
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            RareAbilities.unik,
            RareAbilities.zastawianiePulapek,
            SpecialAbilities.sekretneZnakiZwiadowcow,
        ),
        skills = listOf(
            CommonSkills.chodu,
            CommonSkills.strzalMierzony,
            StatsSkills.bardzoSzybki,
        ),
    )

    val Paz = Profession(
        name = "Paź",
        ww = 0, us = 0, k = 0, odp = 0, zr = 10, int = 10, sw = 5, ogd = 10,

        abilities = listOf(
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            RareAbilities.czytanieIPisanie,
            RareAbilities.gadanina,
            SpecialAbilities.naukaGeneologiaHeraldyka,
        ),
        skills = listOf(
            CommonSkills.etykieta,
        ),
        optionalAbility = listOf(
            listOf(
                CommonAbilities.plotkowanie,
                SpecialAbilities.jezykBretonski,
                SpecialAbilities.jezykReikspiel
            )
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.opanowanie, StatsSkills.charyzmatyczny),
            listOf(CommonSkills.obiezyswiat, CommonSkills.zylkaHandlowa),
        )
    )

    val Pielgrzym = Profession(
        name = "Pielgrzym",
        ww = 5, us = 5, k = 5, odp = 5, zr = 5, int = 10, sw = 10, ogd = 10,
        zyw = 4,
        abilities = listOf(
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.targowanie,
            SpecialAbilities.kuglarstwoGawedziarstwo,
        ),
        skills = listOf(
            CommonSkills.obiezyswiat,
            StatsSkills.niezwykleOdporny,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.mocnaGlowa, SpecialAbilities.naukaTeologia),
            listOf(CommonAbilities.plotkowanie, RareAbilities.nawigacja),
            KnowledgeAbilities.OldWorld,
            LanguageAbilities.All
        )
    )

    val PielgrzymGraala = Profession(
        name = "Pielgrzym Graala",
        ww = 10, us = 5, k = 5, odp = 5, zr = 5, int = 0, sw = 0, ogd = 5,

        abilities = listOf(
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
            SpecialAbilities.wiedzaBretonia,
        ),
        skills = listOf(
            CommonSkills.etykieta,
            WeaponSkills.bronDwureczna,
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.niezwykleOdporny, StatsSkills.twardziel),
            listOf(CommonSkills.odpornoscPsychiczna, CommonSkills.odwaga)
        )
    )

    val PiratRzeczny = Profession(
        name = "Pirat rzeczny",
        ww = 5, us = 10, k = 0, odp = 5, zr = 5, int = 0, sw = 5, ogd = 5,

        abilities = listOf(
            CommonAbilities.plywanie,
            CommonAbilities.wioslarstwo,
        ),
        skills = listOf(
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.hazard, RareAbilities.nawigacja),
            listOf(CommonAbilities.mocnaGlowa, RareAbilities.unik),
            listOf(CommonAbilities.przeszukiwanie, CommonAbilities.spostrzegawczosc),
            listOf(SpecialAbilities.sekretneZnakiLowcow, SpecialAbilities.jezykKislevski),
            listOf(CommonAbilities.sztukaPrzetrwania, RareAbilities.zeglarstwo),
            listOf(SpecialAbilities.wiedzaImperium, SpecialAbilities.wiedzaKislev)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.ogluszenie, CommonSkills.strzalMierzony),
            listOf(CommonSkills.wedrowiec, CommonSkills.wyczucieKierunku)
        )
    )

    val PoborcaPodatkowy = Profession(
        name = "Poborca podatkowy",
        ww = 10, us = 0, k = 0, odp = 0, zr = 10, int = 10, sw = 5, ogd = 5,

        abilities = listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            RareAbilities.czytanieIPisanie,
            RareAbilities.gadanina,
            SpecialAbilities.naukaPrawo,
        ),
        skills = listOf(
            CommonSkills.intrygant,
            CommonSkills.geniuszArytmetyczny,
            CommonSkills.wyczucieKierunku,
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.blyskotliwosc, StatsSkills.charyzmatyczny)
        )
    )

    val Podzegacz = Profession(
        name = "Podżegacz",
        ww = 5, us = 5, k = 0, odp = 0, zr = 5, int = 10, sw = 0, ogd = 10,

        abilities = listOf(
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.ukrywanieSie,
            RareAbilities.czytanieIPisanie,
            SpecialAbilities.jezykReikspiel,
        ),
        skills = listOf(
            CommonSkills.chodu,
            CommonSkills.przemawianie,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.plotkowanie, SpecialAbilities.naukaHistoria),
            listOf(SpecialAbilities.naukaPrawo, SpecialAbilities.wiedzaImperium),
            listOf(SpecialAbilities.jezykBretonski, SpecialAbilities.jezykTileanski),
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.opanowanie, CommonSkills.bijatyka)
        )
    )

    val Poganiacz = Profession(
        name = "Poganiacz",
        ww = 5, us = 10, k = 10, odp = 5, zr = 10, int = 0, sw = 5, ogd = 0,

        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            RareAbilities.nawigacja,
            RareAbilities.tropienie,
        ),
        skills = listOf(
            CommonSkills.wyczucieKierunku,
            WeaponSkills.bronUnieruchamiajaca,
        ),
        optionalAbility = listOf(
            listOf(RareAbilities.oswajanie, RareAbilities.tresura),
            listOf(SpecialAbilities.wiedzaKislev, SpecialAbilities.wiedzaKrajTrolli),
            listOf(SpecialAbilities.jezykKislevski, SpecialAbilities.jezykUngolski)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.obiezyswiat, CommonSkills.wedrowiec)
        )
    )

    val PoganiaczMulow = Profession(
        name = "Poganiacz mułów",
        ww = 5, us = 10, k = 0, odp = 5, zr = 10, int = 10, sw = 5, ogd = 0,

        abilities = listOf(
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            RareAbilities.nawigacja,
            SpecialAbilities.wiedzaKsiestwaGraniczne,
        ),
        skills = listOf(
            CommonSkills.obiezyswiat,
            CommonSkills.wyczucieKierunku,
        ),
        optionalAbility = listOf(
            LanguageAbilities.All
        )
    )

    val Pogranicznik = Profession(
        name = "Pogranicznik",
        ww = 5, us = 5, k = 10, odp = 0, zr = 10, int = 5, sw = 0, ogd = 0,

        abilities = listOf(
            CommonAbilities.przeszukiwanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            RareAbilities.nawigacja,
            RareAbilities.tropienie,
        ),
        skills = listOf(
            CommonSkills.szostyZmysl,
            CommonSkills.wyczucieKierunku,
        ),
    )

    val Pokutnik = Profession(
        name = "Pokutnik",
        ww = 10, us = 0, k = 10, odp = 10, zr = 0, int = 0, sw = 5, ogd = 0,
        zyw = 3,
        abilities = listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.zastraszanie,
            RareAbilities.gadanina,
            RareAbilities.leczenie,
            RareAbilities.torturowanie,
            SpecialAbilities.naukaTeologia,
        ),
        skills = listOf(
            CommonSkills.ogluszenie,
            StatsSkills.niezwykleOdporny,
            StatsSkills.twardziel,
        ),
    )

    val PorywaczZwlok = Profession(
        name = "Porywacz zwłok",
        ww = 5, us = 5, k = 5, odp = 0, zr = 10, int = 0, sw = 10, ogd = 0,

        abilities = listOf(
            CommonAbilities.powozenie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.wspinaczka,
            SpecialAbilities.sekretneZnakiZlodziei,
        ),
        skills = listOf(
            CommonSkills.chodu,
            CommonSkills.odpornoscNaChoroby,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.plotkowanie, CommonAbilities.targowanie)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.lotrzyk, CommonSkills.odpornoscPsychiczna)
        )
    )

    val PoskramiaczNiedzwiedzi = Profession(
        name = "Poskramiacz niedzwiedzi",
        ww = 5, us = 0, k = 10, odp = 5, zr = 5, int = 0, sw = 10, ogd = 5,

        abilities = listOf(
            CommonAbilities.opiekaNadZwierzetami,
            RareAbilities.oswajanie,
            RareAbilities.tresura,
            SpecialAbilities.jezykKislevski,
        ),
        skills = listOf(
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.mocnaGlowa, CommonAbilities.plotkowanie),
            SleightOfHandAbilities.All + CommonAbilities.spostrzegawczosc
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.bardzoSilny, StatsSkills.opanowanie),
            listOf(CommonSkills.zapasy, StatsSkills.niezwykleOdporny),
            listOf(CommonSkills.przemawianie, StatsSkills.szybkiRefleks)
        )
    )

    val Poslaniec = Profession(
        name = "Posłaniec",
        ww = 5, us = 5, k = 0, odp = 5, zr = 10, int = 5, sw = 5, ogd = 0,

        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            RareAbilities.nawigacja,
            SpecialAbilities.sekretneZnakiZwiadowcow,
            SpecialAbilities.jezykReikspiel,
        ),
        skills = listOf(
            CommonSkills.obiezyswiat,
            CommonSkills.wyczucieKierunku,
        ),
        optionalAbility = listOf(
            listOf(
                SpecialAbilities.wiedzaImperium,
                SpecialAbilities.wiedzaJalowaKraina,
                CommonAbilities.plotkowanie
            )
        )
    )

    val Prawnik = Profession(
        name = "Prawnik",
        ww = 0, us = 0, k = 0, odp = 0, zr = 5, int = 10, sw = 10, ogd = 10,

        abilities = listOf(
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            SpecialAbilities.naukaPrawo,
            SpecialAbilities.wiedzaImperium,
            SpecialAbilities.sekretnyjezykGildii,
            SpecialAbilities.jezykReikspiel,
        ),
        skills = listOf(
            CommonSkills.przemawianie,
        ),
        optionalAbility = listOf(
            listOf(SpecialAbilities.naukaGeneologiaHeraldyka, SpecialAbilities.naukaHistoria),
            listOf(CommonAbilities.przekonywanie, RareAbilities.gadanina),
            listOf(CommonAbilities.plotkowanie, CommonAbilities.targowanie),
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.intrygant, CommonSkills.etykieta),
            listOf(StatsSkills.blyskotliwosc, StatsSkills.charyzmatyczny)
        )
    )

    val Przemytnik = Profession(
        name = "Przemytnik",
        ww = 5, us = 5, k = 0, odp = 0, zr = 10, int = 10, sw = 0, ogd = 10,

        abilities = listOf(
            CommonAbilities.plywanie,
            CommonAbilities.powozenie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wioslarstwo,
            CommonAbilities.wycena,
        ),
        skills = listOf(
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.plotkowanie, SpecialAbilities.sekretnyjezykZlodziei),
            listOf(
                SpecialAbilities.sekretneZnakiZlodziei,
                SpecialAbilities.jezykBretonski,
                SpecialAbilities.jezykKislevski
            ),
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.lotrzyk, CommonSkills.zylkaHandlowa)
        )
    )

    val Przepatrywacz = Profession(
        name = "Przepatrywacz",
        ww = 5, us = 10, k = 0, odp = 0, zr = 10, int = 10, sw = 5, ogd = 0,

        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            RareAbilities.nawigacja,
            RareAbilities.tropienie,
        ),
        skills = listOf(
            CommonSkills.wyczucieKierunku,
            WeaponSkills.bronUnieruchamiajaca,
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.opanowanie, StatsSkills.bardzoSilny)
        )
    )

    val Przewoznik = Profession(
        name = "Przewoźnik",
        ww = 5, us = 5, k = 10, odp = 5, zr = 5, int = 5, sw = 0, ogd = 0,

        abilities = listOf(
            CommonAbilities.plywanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wioslarstwo,
            SpecialAbilities.wiedzaImperium,
        ),

        skills = listOf(

        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.plotkowanie, CommonAbilities.zastraszanie),
            listOf(CommonAbilities.wycena, SpecialAbilities.sekretnyjezykLowcow)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.bijatyka, WeaponSkills.bronPalna),
            listOf(StatsSkills.charyzmatyczny, StatsSkills.strzelecWyborowy)
        )
    )

    val Pustelnik = Profession(
        name = "Pustelnik",
        ww = 0, us = 5, k = 5, odp = 10, zr = 10, int = 0, sw = 10, ogd = 0,

        abilities = listOf(
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
        ),
        skills = listOf(
            CommonSkills.chodu,
            CommonSkills.odpornoscNaTrucizny,
            CommonSkills.odwaga,
            CommonSkills.wedrowiec,
            StatsSkills.twardziel,
        ),
    )

    val RogatyLowca = Profession(
        name = "Rogaty łowca",
        ww = 5, us = 5, k = 10, odp = 0, zr = 5, int = 0, sw = 10, ogd = 0,
        zyw = 3,
        abilities = listOf(
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            SpecialAbilities.sekretnyjezykStraznikowLasu,
            SpecialAbilities.sekretneZnakiStraznikowLasu,
        ),
        skills = listOf(
            CommonSkills.krzepki,
            CommonSkills.szalBojowy,
            StatsSkills.twardziel,
        ),
        optionalAbility = listOf(
            listOf(RareAbilities.tropienie, RareAbilities.zastawianiePulapek)
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.bardzoSzybki, StatsSkills.niezwykleOdporny)
        )
    )

    val Rolnik = Profession(
        name = "Rolnik",
        ww = 5, us = 5, k = 10, odp = 10, zr = 5, int = 0, sw = 5, ogd = 0,

        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.powozenie,
            CommonAbilities.wycena,
            CommonAbilities.targowanie,
            RareAbilities.oswajanie,
            RareAbilities.zastawianiePulapek,
            SpecialAbilities.rzemiosloUprawaZiemi,
        ),
        skills = listOf(
            CommonSkills.zylkaHandlowa,
            StatsSkills.twardziel,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.zastraszanie, CommonAbilities.przekonywanie)
        ),
        optionalSkills = listOf(
            listOf(WeaponSkills.bronDwureczna, WeaponSkills.proce, WeaponSkills.bronRzucana)
        )
    )

    val Rozjemca = Profession(
        name = "Rozjemca",
        ww = 0, us = 0, k = 0, odp = 0, zr = 0, int = 10, sw = 10, ogd = 10,

        abilities = listOf(
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            CommonAbilities.zastraszanie,
            SpecialAbilities.wiedzaBretonia,
        ),

        skills = listOf(
            CommonSkills.obiezyswiat,
            CommonSkills.przemawianie,
            CommonSkills.zylkaHandlowa,
            StatsSkills.charyzmatyczny,
        ),
    )

    val Rybak = Profession(
        name = "Rybak",
        ww = 0, us = 5, k = 10, odp = 5, zr = 10, int = 5, sw = 0, ogd = 0,

        abilities = listOf(
            CommonAbilities.plywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.wioslarstwo,
            RareAbilities.zeglarstwo,
        ),
        skills = listOf(
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.mocnaGlowa, CommonAbilities.targowanie),
            listOf(RareAbilities.nawigacja, SpecialAbilities.rzemiosloHandel),
            listOf(SpecialAbilities.wiedzaImperium, SpecialAbilities.wiedzaJalowaKraina),
            listOf(SpecialAbilities.jezykNorski, SpecialAbilities.jezykReikspiel)
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.blyskotliwosc, StatsSkills.twardziel),
            listOf(CommonSkills.bijatyka, CommonSkills.wyczucieKierunku)
        )
    )

    val RzecznikRodu = Profession(
        name = "Rzecznik rodu",
        ww = 5, us = 5, k = 0, odp = 0, zr = 5, int = 10, sw = 5, ogd = 10,

        abilities = listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.plywanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            RareAbilities.czytanieIPisanie,
            SpecialAbilities.rzemiosloHandel,
            SpecialAbilities.sekretnyjezykGildii,
        ),
        skills = listOf(

        ),
        optionalAbility = listOf(
            listOf(SpecialAbilities.wiedzaImperium, SpecialAbilities.wiedzaJalowaKraina)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.obiezyswiat, CommonSkills.zylkaHandlowa)
        )
    )

    val Rzemieslnik = Profession(
        name = "Rzemieślnik",
        ww = 0, us = 0, k = 5, odp = 5, zr = 10, int = 5, sw = 10, ogd = 0,

        abilities = listOf(

            CommonAbilities.powozenie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            RareAbilities.czytanieIPisanie,
            SpecialAbilities.sekretnyjezykGildii,
        ),
        skills = listOf(

        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.opiekaNadZwierzetami, CommonAbilities.plotkowanie),
            CraftAbilities.All,
            CraftAbilities.All
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.zylkaHandlowa, StatsSkills.blyskotliwosc)
        )
    )

    val Rzezimieszek = Profession(
        name = "Rzezimieszek",
        ww = 10, us = 0, k = 10, odp = 0, zr = 10, int = 0, sw = 10, ogd = 0,
        a = 1,
        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.ogluszenie,
            CommonSkills.silnyCios,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.plotkowanie, CommonAbilities.targowanie)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.grozny, StatsSkills.charyzmatyczny),
            listOf(CommonSkills.morderczyAtak, CommonSkills.mierzonyCios),
            listOf(CommonSkills.rozbrajanie, CommonSkills.szybkieWyciagniecie),
        )
    )

    val Skald = Profession(
        name = "Skald",
        ww = 5, us = 0, k = 5, odp = 0, zr = 5, int = 10, sw = 5, ogd = 10,

        abilities = listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.gadanina,
            SpecialAbilities.naukaHistoria,
            SpecialAbilities.wiedzaNorska,
            SpecialAbilities.wiedzaPustkowiaChaosu,
            SpecialAbilities.jezykNorski,
        ),
        skills = listOf(
            CommonSkills.nasladowca,
            CommonSkills.przemawianie,
            StatsSkills.blyskotliwosc,
            StatsSkills.charyzmatyczny,
        ),
        optionalAbility = listOf(
            LanguageAbilities.All, LanguageAbilities.All + RareAbilities.brzuchomowstwo,
            SleightOfHandAbilities.All, SleightOfHandAbilities.All,
        )
    )

    val Skryba = Profession(
        name = "Skryba",
        ww = 0, us = 0, k = 0, odp = 0, zr = 10, int = 10, sw = 10, ogd = 5,

        abilities = listOf(
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            SpecialAbilities.rzemiosloKaligrafia,
            SpecialAbilities.sekretnyjezykGildii,
            SpecialAbilities.jezykBretonski,
            SpecialAbilities.jezykKlasyczny,
        ),
        skills = listOf(
            CommonSkills.poliglota,
        ),
        optionalAbility = listOf(
            listOf(SpecialAbilities.wiedzaImperium, CommonAbilities.plotkowanie),
            ScienceAbilities.All,
            listOf(SpecialAbilities.jezykReikspiel, SpecialAbilities.jezykTileanski)
        )
    )

    val Sluga = Profession(
        name = "Sługa",
        ww = 5, us = 0, k = 5, odp = 0, zr = 10, int = 5, sw = 10, ogd = 5,

        abilities = listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.gadanina,
            RareAbilities.unik,
        ),
        skills = listOf(
        ),
        optionalAbility = listOf(
            listOf(RareAbilities.czytanieIPisanie, RareAbilities.zwinnePalce),
            listOf(CommonAbilities.opiekaNadZwierzetami, SpecialAbilities.rzemiosloGotowanie),
            listOf(CommonAbilities.powozenie, CommonAbilities.przeszukiwanie),
            listOf(CommonAbilities.targowanie, CommonAbilities.wycena)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.czulySluch, CommonSkills.chodu),
            listOf(CommonSkills.etykieta, StatsSkills.twardziel),
            listOf(StatsSkills.niezwykleOdporny, StatsSkills.szybkiRefleks),
        )
    )

    val Straznik = Profession(
        name = "Strażnik",
        ww = 10, us = 5, k = 5, odp = 0, zr = 5, int = 10, sw = 0, ogd = 5,

        abilities = listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.tropienie,
            RareAbilities.unik,
            SpecialAbilities.naukaPrawo,
        ),
        skills = listOf(
            CommonSkills.ogluszenie,
            CommonSkills.silnyCios,
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.blyskotliwosc, StatsSkills.opanowanie),
            listOf(CommonSkills.bijatyka, CommonSkills.rozbrajanie)
        )
    )

    val StraznikDrog = Profession(
        name = "Strażnik dróg",
        ww = 10, us = 10, k = 5, odp = 0, zr = 10, int = 5, sw = 5, ogd = 0,

        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.powozenie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            RareAbilities.nawigacja,
        ),
        skills = listOf(
            WeaponSkills.bronPalna,
        ),
        optionalAbility = listOf(
            listOf(RareAbilities.tropienie, SpecialAbilities.sekretneZnakiZwiadowcow),
            listOf(SpecialAbilities.wiedzaImperium, CommonAbilities.plotkowanie)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.blyskawicznePrzadowanie, CommonSkills.szybkieWyciagniecie)
        )
    )

    val StraznikKanalow = Profession(
        name = "Strażnik kanałów",
        ww = 10, us = 5, k = 0, odp = 10, zr = 5, int = 0, sw = 10, ogd = 0,

        abilities = listOf(
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.grotolaz,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.plywanie, CommonAbilities.przeszukiwanie),
            listOf(RareAbilities.tropienie, SpecialAbilities.sekretneZnakiZwiadowcow)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.szybkieWyciagniecie, CommonSkills.odpornoscNaChoroby)
        )
    )

    val StraznikPol = Profession(
        name = "Strażnik pól",
        ww = 5, us = 10, k = 0, odp = 5, zr = 10, int = 0, sw = 10, ogd = 0,

        abilities = listOf(
            CommonAbilities.przeszukiwanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            RareAbilities.tropienie,
        ),
        skills = listOf(
        ),
        optionalAbility = listOf(
            listOf(SpecialAbilities.naukaNekromancja, SpecialAbilities.wiedzaImperium)
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.bardzoSzybki, StatsSkills.blyskotliwosc),
            listOf(CommonSkills.blyskawicznePrzadowanie, CommonSkills.strzalPrecyzyjny),
            listOf(CommonSkills.szybkieWyciagniecie, CommonSkills.wedrowiec)
        )
    )

    val StraznikRzeczny = Profession(
        name = "Strażnik rzeczny",
        ww = 0, us = 10, k = 10, odp = 5, zr = 10, int = 5, sw = 5, ogd = 0,

        abilities = listOf(
            CommonAbilities.plywanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.wioslarstwo,
            RareAbilities.nawigacja,
            SpecialAbilities.sekretneZnakiZwiadowcow,
        ),
        skills = listOf(
            WeaponSkills.bronPalna,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.plotkowanie, SpecialAbilities.jezykKislevski),
            listOf(CommonAbilities.sztukaPrzetrwania, RareAbilities.zeglarstwo),
            listOf(SpecialAbilities.wiedzaImperium, SpecialAbilities.wiedzaKislev)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.wyczucieKierunku, StatsSkills.bardzoSilny)
        )
    )

    val StraznikSwiatynny = Profession(
        name = "Strażnik świątynny",
        ww = 10, us = 5, k = 5, odp = 5, zr = 5, int = 0, sw = 5, ogd = 0,

        abilities = listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.ogluszenie,
            CommonSkills.silnyCios,
        ),
        optionalAbility = listOf(
            KnowledgeAbilities.OldWorld
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.odwaga, StatsSkills.opanowanie)
        )
    )

    val StraznikTuneli = Profession(
        name = "Strażnik tuneli",
        ww = 10, us = 0, k = 5, odp = 5, zr = 5, int = 0, sw = 5, ogd = 0,
        a = 1,
        abilities = listOf(
            CommonAbilities.przeszukiwanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.wspinaczka,
            CommonAbilities.wycena,
            RareAbilities.nawigacja,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.grotolaz,
            CommonSkills.odpornoscNaChoroby,
            CommonSkills.odpornoscNaTrucizny,
            CommonSkills.wyczucieKierunku,
        ),
    )

    val StraznikWiezienny = Profession(
        name = "Strażnik więzienny",
        ww = 10, us = 0, k = 10, odp = 10, zr = 0, int = 0, sw = 5, ogd = 0,
        zyw = 3,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.odpornoscNaChoroby,
            CommonSkills.odpornoscNaTrucizny,
            CommonSkills.zapasy,
            WeaponSkills.bronUnieruchamiajaca,
        ),
        optionalAbility = listOf(
            listOf(RareAbilities.leczenie, RareAbilities.zwinnePalce)
        )
    )

    val Strielec = Profession(
        name = "Strielec",
        ww = 10, us = 10, k = 5, odp = 5, zr = 5, int = 0, sw = 5, ogd = 0,

        abilities = listOf(
            CommonAbilities.mocnaGlowa,
            RareAbilities.unik,
            SpecialAbilities.jezykKislevski,
        ),
        skills = listOf(
            WeaponSkills.bronDwureczna,
            WeaponSkills.bronPalna,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.hazard, CommonAbilities.plotkowanie),
            listOf(CommonAbilities.spostrzegawczosc, SpecialAbilities.wiedzaKislev)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.artylerzysta, CommonSkills.szybkieWyciagniecie),
            listOf(CommonSkills.blyskawicznePrzadowanie, CommonSkills.strzalPrecyzyjny),
            listOf(CommonSkills.strzalMierzony, StatsSkills.strzelecWyborowy)
        )
    )

    val StrzyganskiMistyk = Profession(
        name = "Strzygański mistyk",
        ww = 5, us = 5, k = 0, odp = 0, zr = 5, int = 5, sw = 10, ogd = 10,

        abilities = listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            RareAbilities.zwinnePalce,
            SpecialAbilities.naukaNekromancja,
            SpecialAbilities.jezykStrzyganski,
        ),
        skills = listOf(
            CommonSkills.szostyZmysl,
        ),
        optionalAbility = listOf(
            listOf(RareAbilities.hipnoza, SpecialAbilities.rzemiosloAptekarstwo),
            listOf(CommonAbilities.jezdziectwo, CommonAbilities.powozenie),
            SleightOfHandAbilities.All,
            listOf(SpecialAbilities.sekretneZnakiAstrologow, SpecialAbilities.sekretneZnakiLowcow),
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.obiezyswiat, CommonSkills.wedrowiec)
        )
    )

    val Szczurolap = Profession(
        name = "Szczurołap",
        ww = 5, us = 10, k = 0, odp = 5, zr = 10, int = 0, sw = 10, ogd = 0,

        abilities = listOf(
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.ukrywanieSie,
            RareAbilities.tresura,
            RareAbilities.zastawianiePulapek,
        ),
        skills = listOf(
            CommonSkills.grotolaz,
            CommonSkills.odpornoscNaChoroby,
            CommonSkills.odpornoscNaTrucizny,
            WeaponSkills.proce,
        ),
    )

    val SzermierzEstalijski = Profession(
        name = "Szermierz estalijski",
        ww = 15, us = 0, k = 5, odp = 5, zr = 10, int = 5, sw = 0, ogd = 0,
        a = 1,
        abilities = listOf(
            RareAbilities.czytanieIPisanie,
            RareAbilities.unik,
            SpecialAbilities.naukaAnatomia,
            SpecialAbilities.wiedzaEstalia,
            SpecialAbilities.jezykEstalijski,
        ),
        skills = listOf(
            CommonSkills.silnyCios,
            WeaponSkills.bronSzermiercza,
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.brawura, StatsSkills.szybkiRefleks),
            listOf(
                CommonSkills.szybkieWyciagniecie,
                CommonSkills.morderczyAtak,
                CommonSkills.mierzonyCios
            )
        )
    )

    val Szlachcic = Profession(
        name = "Szlachcic",
        ww = 10, us = 5, k = 0, odp = 0, zr = 5, int = 5, sw = 5, ogd = 10,

        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.przekonywanie,
            RareAbilities.czytanieIPisanie,
            SpecialAbilities.wiedzaImperium,
            SpecialAbilities.jezykReikspiel,
        ),
        skills = listOf(
            CommonSkills.etykieta,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.dowodzenie, RareAbilities.gadanina),
            listOf(CommonAbilities.hazard, CommonAbilities.plotkowanie),
            listOf(CommonAbilities.mocnaGlowa, SpecialAbilities.kuglarstwoMuzykalnosc),
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.blyskotliwosc, WeaponSkills.bronSzermiercza),
            listOf(CommonSkills.przemawianie, CommonSkills.szczescie),
            listOf(CommonSkills.intrygant, WeaponSkills.bronParujaca)
        )
    )

    val Szperacz = Profession(
        name = "Szperacz",
        ww = 5, us = 5, k = 0, odp = 10, zr = 10, int = 10, sw = 0, ogd = 0,

        abilities = listOf(
            CommonAbilities.plywanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            RareAbilities.nawigacja,
            RareAbilities.tropienie,
        ),
        skills = listOf(
            CommonSkills.odpornoscNaChoroby,
            CommonSkills.szostyZmysl,
        ),
    )

    val Szuler = Profession(
        name = "Szuler",
        ww = 10, us = 5, k = 0, odp = 10, zr = 5, int = 0, sw = 10, ogd = 0,

        abilities = listOf(
            CommonAbilities.hazard,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.gadanina,
            RareAbilities.zwinnePalce,
            SpecialAbilities.sekretnyjezykZlodziei,
        ),
        skills = listOf(
        ),
        optionalAbility = listOf(
            listOf(RareAbilities.czytanieIPisanie, SpecialAbilities.sekretneZnakiZlodziei),
            listOf(CommonAbilities.plotkowanie, SpecialAbilities.sekretnyjezykZlodziei)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.etykieta, CommonSkills.lotrzyk),
            listOf(CommonSkills.chodu, CommonSkills.szczescie)
        )
    )

    val Smieciarz = Profession(
        name = "Śmieciarz",
        ww = 5, us = 0, k = 5, odp = 10, zr = 5, int = 0, sw = 5, ogd = 5,

        abilities = listOf(
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.powozenie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            SpecialAbilities.wiedzaImperium,
        ),
        skills = listOf(
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.przekonywanie, CommonAbilities.plotkowanie)
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.twardziel, CommonSkills.odpornoscNaChoroby),
            listOf(StatsSkills.opanowanie, CommonSkills.lotrzyk)
        )
    )

    val Tarczownik = Profession(
        name = "Tarczownik",
        ww = 10, us = 0, k = 5, odp = 5, zr = 10, int = 0, sw = 5, ogd = 0,
        a = 1,
        abilities = listOf(
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.wspinaczka,
            RareAbilities.nawigacja,
            RareAbilities.sledzenie,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.ogluszenie,
            CommonSkills.silnyCios,
            CommonSkills.wyczucieKierunku,
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.czulySluch, StatsSkills.opanowanie),
            listOf(CommonSkills.morderczyAtak, CommonSkills.mierzonyCios)
        )
    )

    val UczenCzarodzieja = Profession(
        name = "Uczeń czarodzieja",
        ww = 0, us = 0, k = 0, odp = 0, zr = 5, int = 10, sw = 15, ogd = 5,
        mag = 1,
        abilities = listOf(
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecialAbilities.jezykTajemnyMagiczny,
            SpecialAbilities.naukaMagia,
            SpecialAbilities.jezykKlasyczny,
        ),
        skills = listOf(
            MagicSkills.magiaProstaTajemna,
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.blyskotliwosc, StatsSkills.niezwykleOdporny),
            listOf(CommonSkills.dotykMocy, CommonSkills.zmyslMagii)
        )
    )

    val UczennicaCzarownicy = Profession(
        name = "Uczennica czarownicy",
        ww = 0, us = 0, k = 0, odp = 10, zr = 5, int = 10, sw = 10, ogd = 0,
        mag = 1,
        abilities = listOf(
            CommonAbilities.sztukaPrzetrwania,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecialAbilities.jezykTajemnyMagiczny,
            SpecialAbilities.wiedzaKislev,
            SpecialAbilities.jezykKislevski,
        ),
        skills = listOf(
            MagicSkills.magiaProstaLodu,
        ),
        optionalAbility = listOf(
            listOf(SpecialAbilities.naukaMagia, CommonAbilities.zastraszanie),
            listOf(CommonAbilities.spostrzegawczosc, RareAbilities.nawigacja),
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.niezwykleOdporny, StatsSkills.twardziel),
            UniversalMagic.All + CommonSkills.zmyslMagii,
        )
    )

    val UczenZielarza = Profession(
        name = "Uczeń zielarza",
        ww = 0, us = 0, k = 5, odp = 0, zr = 0, int = 10, sw = 5, ogd = 10,
        mag = 1,
        abilities = listOf(
            CommonAbilities.spostrzegawczosc,
            RareAbilities.leczenie,
        ),
        skills = listOf(
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.opiekaNadZwierzetami, RareAbilities.splatanieMagii),
            listOf(CommonAbilities.mocnaGlowa, CommonAbilities.plotkowanie),
            listOf(RareAbilities.warzenieTrucizn, RareAbilities.wykrywanieMagii),
            listOf(RareAbilities.czytanieIPisanie, SpecialAbilities.jezykTajemnyMagiczny),
            listOf(CommonAbilities.sztukaPrzetrwania, CommonAbilities.targowanie),
            listOf(CommonAbilities.ukrywanieSie, RareAbilities.oswajanie),
            listOf(CommonAbilities.skradanieSie, RareAbilities.zastawianiePulapek),
            listOf(SpecialAbilities.rzemiosloAptekarstwo, SpecialAbilities.rzemiosloZielarstwo)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.nieustraszony, StatsSkills.szybkiRefleks),
            listOf(CommonSkills.wedrowiec, MagicSkills.magiaProstaZielarska)
        )
    )

    val Weglarz = Profession(
        name = "Węglarz",
        ww = 5, us = 0, k = 5, odp = 5, zr = 5, int = 5, sw = 5, ogd = 5,

        abilities = listOf(
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.targowanie,
            CommonAbilities.wspinaczka,
            SpecialAbilities.sekretneZnakiLowcow,
        ),
        skills = listOf(
            CommonSkills.chodu,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.plotkowanie, CommonAbilities.powozenie),
            listOf(CommonAbilities.ukrywanieSie, SpecialAbilities.wiedzaImperium)
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.bardzoSilny, StatsSkills.blyskotliwosc)
        )
    )

    val Wielorybnik = Profession(
        name = "Wielorybnik",
        ww = 5, us = 5, k = 10, odp = 10, zr = 10, int = 0, sw = 0, ogd = 0,

        abilities = listOf(
            CommonAbilities.mocnaGlowa,
            CommonAbilities.plywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.wioslarstwo,
            RareAbilities.nawigacja,
            RareAbilities.zeglarstwo,
        ),
        skills = listOf(
            CommonSkills.bystryWzrok,
            CommonSkills.obiezyswiat,
            StatsSkills.bardzoSilny,
            StatsSkills.opanowanie,
            StatsSkills.twardziel,
        ),
    )

    val Wloczykij = Profession(
        name = "Włóczykij",
        ww = 5, us = 10, k = 0, odp = 0, zr = 10, int = 5, sw = 0, ogd = 5,

        abilities = listOf(
            CommonAbilities.skradanieSie,
            CommonAbilities.sztukaPrzetrwania,
            RareAbilities.nawigacja,
        ),
        skills = listOf(
            CommonSkills.obiezyswiat,
        ),
        optionalAbility = listOf(
            listOf(
                SpecialAbilities.kuglarstwoGawedziarstwo,
                SpecialAbilities.kuglarstwoSpiew,
                SpecialAbilities.kuglarstwoTaniec
            ),
            listOf(SpecialAbilities.sekretneZnakiLowcow, SpecialAbilities.sekretneZnakiZlodziei),
            listOf(RareAbilities.leczenie, CommonAbilities.spostrzegawczosc),
            listOf(
                CommonAbilities.plotkowanie,
                SpecialAbilities.sekretnyjezykLowcow,
                SpecialAbilities.sekretnyjezykZlodziei
            ),
            listOf(CommonAbilities.targowanie, CommonAbilities.plywanie),
            listOf(
                SpecialAbilities.wiedzaBretonia,
                SpecialAbilities.wiedzaEstalia,
                SpecialAbilities.wiedzaKislev,
                SpecialAbilities.wiedzaTilea
            )
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.bardzoSzybki, CommonSkills.wedrowiec),
            listOf(CommonSkills.wyczucieKierunku, StatsSkills.strzelecWyborowy)
        )
    )

    val Woj = Profession(
        name = "Woj",
        ww = 10, us = 5, k = 5, odp = 5, zr = 5, int = 0, sw = 5, ogd = 0,
        a = 1,
        abilities = listOf(
            CommonAbilities.hazard,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.plotkowanie,
            CommonAbilities.zastraszanie,
        ),
        skills = listOf(
            CommonSkills.grozny,
            CommonSkills.odwaga,
            CommonSkills.silnyCios,
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.blyskotliwosc, StatsSkills.opanowanie),
            listOf(CommonSkills.szybkieWyciagniecie, WeaponSkills.bronDwureczna)
        )
    )

    val WojownikKlanowy = Profession(
        name = "Wojownik klanowy",
        ww = 5, us = 5, k = 0, odp = 0, zr = 10, int = 10, sw = 5, ogd = 0,

        abilities = listOf(
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            RareAbilities.tropienie,
            RareAbilities.unik,
        ),
        skills = listOf(
        ),
        optionalAbility = listOf(
            listOf(RareAbilities.leczenie, CommonAbilities.przeszukiwanie)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.wedrowiec, StatsSkills.strzelecWyborowy),
            listOf(CommonSkills.blyskawicznePrzadowanie, StatsSkills.urodzonyWojownik)
        )
    )

    val Woznica = Profession(
        name = "Woźnica",
        ww = 5, us = 10, k = 0, odp = 0, zr = 10, int = 0, sw = 5, ogd = 5,

        abilities = listOf(
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.powozenie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.nawigacja,
            SpecialAbilities.sekretneZnakiLowcow,
        ),
        skills = listOf(
            WeaponSkills.bronPalna,
        ),
        optionalAbility = listOf(
            listOf(RareAbilities.leczenie, CommonAbilities.jezdziectwo),
            listOf(CommonAbilities.plotkowanie, CommonAbilities.targowanie),
            listOf(
                SpecialAbilities.jezykBretonski,
                SpecialAbilities.jezykKislevski,
                SpecialAbilities.jezykTileanski
            )
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.obiezyswiat, CommonSkills.szybkieWyciagniecie)
        )
    )

    val Wrozbita = Profession(
        name = "Wróżbita",
        ww = 0, us = 0, k = 0, odp = 0, zr = 5, int = 5, sw = 10, ogd = 15,
        mag = 1,
        abilities = listOf(
        ),
        skills = listOf(
            CommonSkills.gusla,
            CommonSkills.przemawianie,
            CommonSkills.szczescie,
            CommonSkills.wyostrzoneZmysly,
            MagicSkills.magiaProstaGusla,
        ),
        optionalAbility = listOf(
            listOf(
                SpecialAbilities.jezykTajemnyDemoniczny,
                SpecialAbilities.jezykTajemnyMagiczny,
                RareAbilities.gadanina
            ),
            listOf(RareAbilities.splatanieMagii, SpecialAbilities.kuglarstwoWrozenieZDloni),
            listOf(CommonAbilities.przekonywanie, RareAbilities.tresura),
            listOf(CommonAbilities.spostrzegawczosc, RareAbilities.wykrywanieMagii)
        )
    )

    val ZabiaPani = Profession(
        name = "Żabia pani",
        ww = 0, us = 0, k = 0, odp = 5, zr = 10, int = 5, sw = 10, ogd = 5,

        abilities = listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            SpecialAbilities.rzemiosloGotowanie,
        ),
        skills = listOf(
            CommonSkills.odwaga,
            CommonSkills.ulicznik,
            CommonSkills.zylkaHandlowa,
        ),
        optionalAbility = listOf(
            KnowledgeAbilities.OldWorld,
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.wedrowiec, StatsSkills.twardziel),
        )
    )

    val ZabojcaTrolli = Profession(
        name = "Zabójca trolli",
        ww = 10, us = 0, k = 5, odp = 5, zr = 5, int = 0, sw = 10, ogd = 0,
        a = 1, zyw = 3,
        abilities = listOf(
            CommonAbilities.mocnaGlowa,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.silnyCios,
            StatsSkills.twardziel,
            WeaponSkills.bronDwureczna,
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.rozbrajanie, CommonSkills.szybkieWyciagniecie),
            listOf(StatsSkills.niezwykleOdporny, StatsSkills.szybkiRefleks)
        )
    )

    val Zakapturzony = Profession(
        name = "Zakapturzony",
        ww = 5, us = 10, k = 0, odp = 0, zr = 10, int = 0, sw = 0, ogd = 10,
        a = 1,
        abilities = listOf(
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.obiezyswiat,
            CommonSkills.wedrowiec,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.opiekaNadZwierzetami, CommonAbilities.przekonywanie),
            listOf(CommonAbilities.plotkowanie, SpecialAbilities.sekretnyjezykLowcow)
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.strzelecWyborowy, WeaponSkills.dlugieLuki)
        )
    )

    val Zarzadca = Profession(
        name = "Zarządca",
        ww = 5, us = 5, k = 5, odp = 0, zr = 0, int = 10, sw = 5, ogd = 10,

        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            SpecialAbilities.naukaPrawo,
        ),
        skills = listOf(
            CommonSkills.przemawianie,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.dowodzenie, RareAbilities.nawigacja),
            listOf(CommonAbilities.opiekaNadZwierzetami, CommonAbilities.plotkowanie),
            listOf(CommonAbilities.zastraszanie, SpecialAbilities.wiedzaImperium)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.etykieta, CommonSkills.geniuszArytmetyczny)
        )
    )

    val ZbieraczLajna = Profession(
        name = "Zbieracz łajna",
        ww = 5, us = 0, k = 5, odp = 10, zr = 5, int = 0, sw = 5, ogd = 0,

        abilities = listOf(
            CommonAbilities.mocnaGlowa,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.powozenie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            SpecialAbilities.wiedzaImperium,
        ),
        skills = listOf(
            StatsSkills.opanowanie,
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.nieustraszony, CommonSkills.odpornoscNaChoroby)
        )
    )

    val Zlodziej = Profession(
        name = "Złodziej",
        ww = 5, us = 5, k = 0, odp = 0, zr = 15, int = 5, sw = 0, ogd = 10,

        abilities = listOf(
            CommonAbilities.przeszukiwanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.ukrywanieSie,
        ),
        skills = listOf(
        ),
        optionalAbility = listOf(
            listOf(RareAbilities.czytanieIPisanie, RareAbilities.zwinnePalce),
            listOf(CommonAbilities.hazard, RareAbilities.otwieranieZamkow),
            listOf(CommonAbilities.przekonywanie, CommonAbilities.wspinaczka),
            listOf(SpecialAbilities.sekretnyjezykZlodziei, SpecialAbilities.sekretneZnakiZlodziei),
            listOf(CommonAbilities.charakteryzacja, CommonAbilities.wycena)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.lotrzyk, CommonSkills.ulicznik),
            listOf(CommonSkills.geniuszArytmetyczny, CommonSkills.wykrywaniePulapek)
        )
    )

    val Zak = Profession(
        name = "Żak",
        ww = 0, us = 0, k = 0, odp = 0, zr = 10, int = 10, sw = 5, ogd = 10,

        abilities = listOf(
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            SpecialAbilities.jezykKlasyczny,
            SpecialAbilities.jezykReikspiel,
        ),
        skills = listOf(
        ),
        optionalAbility = listOf(
            listOf(RareAbilities.leczenie, CommonAbilities.przeszukiwanie),
            ScienceAbilities.All,
            ScienceAbilities.All + listOf(CommonAbilities.plotkowanie),
            listOf(CommonAbilities.przekonywanie, CommonAbilities.mocnaGlowa)
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.blyskotliwosc, StatsSkills.charyzmatyczny),
            listOf(CommonSkills.etykieta, CommonSkills.poliglota),
            listOf(CommonSkills.geniuszArytmetyczny, CommonSkills.obiezyswiat)
        )
    )

    val Zeglarz = Profession(
        name = "Żeglarz",
        ww = 10, us = 5, k = 10, odp = 0, zr = 10, int = 0, sw = 0, ogd = 0,
        a = 1,
        abilities = listOf(
            CommonAbilities.plywanie,
            CommonAbilities.wioslarstwo,
            CommonAbilities.wspinaczka,
            RareAbilities.unik,
            RareAbilities.zeglarstwo,
        ),
        skills = listOf(
            CommonSkills.obiezyswiat,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.mocnaGlowa, CommonAbilities.spostrzegawczosc),
            listOf(
                SpecialAbilities.wiedzaBretonia,
                SpecialAbilities.wiedzaJalowaKraina,
                SpecialAbilities.wiedzaNorska,
                SpecialAbilities.wiedzaTilea
            ),
            listOf(
                SpecialAbilities.jezykBretonski,
                SpecialAbilities.jezykNorski,
                SpecialAbilities.jezykTileanski
            )
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.silnyCios, CommonSkills.brawura),
            listOf(CommonSkills.bijatyka, StatsSkills.twardziel)
        )
    )

    val Znachorka = Profession(
        name = "Znachorka",
        ww = 0, us = 0, k = 0, odp = 5, zr = 0, int = 15, sw = 10, ogd = 5,

        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.leczenie,
            RareAbilities.wykrywanieMagii,
            SpecialAbilities.kuglarstwoGawedziarstwo,
            SpecialAbilities.jezykUngolski,
        ),
        skills = listOf(
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.mocnaGlowa, CommonAbilities.plotkowanie),
            listOf(SpecialAbilities.naukaDuchy, SpecialAbilities.naukaHistoria),
            listOf(CommonAbilities.przekonywanie, CommonAbilities.zastraszanie),
            listOf(
                RareAbilities.warzenieTrucizn,
                SpecialAbilities.rzemiosloAptekarstwo,
                SpecialAbilities.rzemiosloZielarstwo
            ),
            listOf(SpecialAbilities.wiedzaKislev, SpecialAbilities.wiedzaKrajTrolli)
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.blyskotliwosc, StatsSkills.opanowanie)
        )
    )

    val Zolnierz = Profession(
        name = "Żołnierz",
        ww = 10, us = 10, k = 0, odp = 0, zr = 10, int = 0, sw = 5, ogd = 0,
        a = 1,
        abilities = listOf(
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
        ),
        skills = listOf(
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.hazard, CommonAbilities.plotkowanie),
            listOf(CommonAbilities.opiekaNadZwierzetami, RareAbilities.leczenie),
            listOf(CommonAbilities.jezdziectwo, CommonAbilities.powozenie),
            listOf(CommonAbilities.spostrzegawczosc, SpecialAbilities.wiedzaImperium)
        ),
        optionalSkills = listOf(
            listOf(WeaponSkills.bronDwureczna, WeaponSkills.bronPalna),
            listOf(
                CommonSkills.blyskawicznePrzadowanie,
                CommonSkills.morderczyAtak,
                CommonSkills.mierzonyCios
            ),
            listOf(CommonSkills.ogluszenie, CommonSkills.strzalPrecyzyjny),
            listOf(CommonSkills.rozbrajanie, CommonSkills.szybkieWyciagniecie),
            listOf(CommonSkills.silnyCios, CommonSkills.strzalMierzony)
        )
    )

    val ZolnierzOkretowy = Profession(
        name = "Żołnierz okrętowy",
        ww = 10, us = 10, k = 10, odp = 0, zr = 5, int = 0, sw = 5, ogd = 0,
        a = 1, zyw = 3,
        abilities = listOf(
            CommonAbilities.mocnaGlowa,
            CommonAbilities.plywanie,
            CommonAbilities.wioslarstwo,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.ogluszenie,
            CommonSkills.silnyCios,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.plotkowanie, SpecialAbilities.sekretnyjezykBitewny),
            listOf(SpecialAbilities.wiedzaJalowaKraina, CommonAbilities.hazard),
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.rozbrajanie, CommonSkills.szybkieWyciagniecie)
        )
    )
}
    /////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////         ZAAWANSOWANE          ////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////
    object AdvancedProfessions {
        val Admiral = Profession(
            name = "Admirał",
            ww = 25, us = 20, k = 15, odp = 15, zr = 15, int = 30, sw = 30, ogd = 35,
            a = 1, zyw = 6,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.plywanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.zastraszanie,
                RareAbilities.czytanieIPisanie,
                RareAbilities.zeglarstwo,
                SpecialAbilities.naukaStrategiaTaktyka,
            ),
            skills = listOf(
                CommonSkills.krasomowstwo,
                CommonSkills.poliglota,
                CommonSkills.przemawianie,
                StatsSkills.blyskotliwosc,
            ),
            optionalAbility = listOf(
                ScienceAbilities.All,
                KnowledgeAbilities.All,
                KnowledgeAbilities.All,
                KnowledgeAbilities.All,
                LanguageAbilities.All,
                LanguageAbilities.All,
                LanguageAbilities.All,
                listOf(CommonAbilities.przekonywanie, RareAbilities.unik),
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.etykieta, CommonSkills.obiezyswiat)
            ),
        )

        val AgentCalunu = Profession(
            name = "Agent Całunu (Morr)",
            ww = 15, us = 10, k = 10, odp = 10, zr = 20, int = 20, sw = 30, ogd = 10,
            a = 1, zyw = 4,
            abilities = listOf(
                CommonAbilities.charakteryzacja,
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.przeszukiwanie,
                CommonAbilities.skradanieSie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.ukrywanieSie,
                CommonAbilities.zastraszanie,
                RareAbilities.czytanieIPisanie,
                RareAbilities.leczenie,
                RareAbilities.sledzenie,
                RareAbilities.tropienie,
                SpecialAbilities.naukaNekromancja,
                SpecialAbilities.naukaTeologia,
                SpecialAbilities.wiedzaImperium,
                SpecialAbilities.wiedzaTilea,
            ),
            skills = listOf(
                CommonSkills.intrygant,
            ),
            optionalAbility = listOf(
                ScienceAbilities.All,
                LanguageAbilities.All, LanguageAbilities.All
            ),
            optionalSkills = listOf(
                listOf(StatsSkills.blyskotliwosc, StatsSkills.charyzmatyczny),
                listOf(CommonSkills.odwaga, StatsSkills.opanowanie),
                listOf(CommonSkills.szostyZmysl, CommonSkills.wyostrzoneZmysly)
            ),
        )

        val Ambasador = Profession(
            name = "Ambasador",
            ww = 10, us = 10, k = 5, odp = 10, zr = 10, int = 30, sw = 30, ogd = 40,
            zyw = 6,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.jezdziectwo,
                CommonAbilities.plotkowanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.targowanie,
                RareAbilities.czytanieIPisanie,
                SpecialAbilities.kuglarstwoAktorstwo,
            ),
            skills = listOf(
                CommonSkills.etykieta,
                CommonSkills.przemawianie,
            ),
            optionalAbility = listOf(
                listOf(CommonAbilities.przekonywanie, RareAbilities.gadanina),
                listOf(SpecialAbilities.naukaGeneologiaHeraldyka, SpecialAbilities.naukaHistoria),
                KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
                LanguageAbilities.All, LanguageAbilities.All, LanguageAbilities.All
            ),
            optionalSkills = listOf(
                listOf(StatsSkills.blyskotliwosc, CommonSkills.krasomowstwo),
                listOf(StatsSkills.charyzmatyczny, CommonSkills.poliglota),
                listOf(CommonSkills.intrygant, CommonSkills.zylkaHandlowa)
            ),
        )

        val Arcykaplan = Profession(
            name = "Arcykapłan",
            ww = 20, us = 20, k = 15, odp = 15, zr = 15, int = 20, sw = 30, ogd = 25,
            a = 1, zyw = 6, mag = 3,
            abilities = listOf(
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.zastraszanie,
                RareAbilities.leczenie,
                RareAbilities.splatanieMagii,
                RareAbilities.wykrywanieMagii,
                SpecialAbilities.naukaTeologia,
                SpecialAbilities.jezykTajemnyMagiczny,
            ),
            skills = listOf(
                CommonSkills.etykieta,
            ),
            optionalAbility = listOf(
                listOf(CommonAbilities.jezdziectwo, CommonAbilities.plywanie),
                ScienceAbilities.All,
                ScienceAbilities.All,
                ScienceAbilities.All,
                KnowledgeAbilities.OldWorld,
                KnowledgeAbilities.OldWorld,
                LanguageAbilities.All,
                LanguageAbilities.All,
                LanguageAbilities.All
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.dotykMocy, StatsSkills.niezwykleOdporny),
                listOf(CommonSkills.pancerzWiary, CommonSkills.morderczyPocisk),
                listOf(CommonSkills.medytacja, CommonSkills.zmyslMagii),
                UniversalMagic.All,
                UniversalMagic.All
            ),
        )

        val Arcymag = Profession(
            name = "Arcymag",
            ww = 15, us = 15, k = 5, odp = 15, zr = 20, int = 35, sw = 40, ogd = 20,
            zyw = 5, mag = 4,
            abilities = listOf(
                RareAbilities.czytanieIPisanie,
                RareAbilities.splatanieMagii,
                RareAbilities.wykrywanieMagii,
                SpecialAbilities.jezykTajemnyMagiczny,
                SpecialAbilities.naukaMagia,
            ),
            skills = listOf(
            ),
            optionalAbility = listOf(
                listOf(SpecialAbilities.jezykTajemnyDemoniczny, SpecialAbilities.jezykTajemnyElfi),
                ScienceAbilities.All,
                ScienceAbilities.All,
                ScienceAbilities.All,
                listOf(CommonAbilities.przekonywanie, CommonAbilities.zastraszanie),
                KnowledgeAbilities.OldWorld,
                KnowledgeAbilities.OldWorld,
                KnowledgeAbilities.OldWorld,
                LanguageAbilities.All,
                LanguageAbilities.All,
                LanguageAbilities.All,
                LanguageAbilities.All
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.czarnoksiestwo, CommonSkills.medytacja),
                listOf(CommonSkills.dotykMocy, StatsSkills.twardziel),
                listOf(CommonSkills.morderczyPocisk, CommonSkills.zmyslMagii),
                UniversalMagic.All, UniversalMagic.All
            ),
        )

        val Arcymistrz = Profession(
            name = "Arcymistrz",
            ww = 40, us = 15, k = 25, odp = 25, zr = 25, int = 15, sw = 30, ogd = 20,
            a = 2, zyw = 8,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.jezdziectwo,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.zastraszanie,
                RareAbilities.czytanieIPisanie,
                RareAbilities.tresura,
                RareAbilities.unik,
                SpecialAbilities.naukaStrategiaTaktyka,
                SpecialAbilities.sekretneZnakiRycerzyZakonnych,
                SpecialAbilities.sekretnyjezykBitewny,
            ),
            skills = listOf(
                CommonSkills.grozny,
                CommonSkills.nieustraszony,
                CommonSkills.obiezyswiat,
                CommonSkills.odpornoscPsychiczna,
                StatsSkills.bardzoSzybki,
            ),
            optionalAbility = listOf(
                listOf(SpecialAbilities.naukaGeneologiaHeraldyka, SpecialAbilities.naukaTeologia),
                listOf(
                    SpecialAbilities.jezykBretonski,
                    SpecialAbilities.jezykEstalijski,
                    SpecialAbilities.jezykKislevski,
                    SpecialAbilities.jezykTileanski
                ),
                KnowledgeAbilities.OldWorld,
                KnowledgeAbilities.OldWorld,
                KnowledgeAbilities.OldWorld,
            ),
            optionalSkills = listOf(
                SpecialWeapon.Common, SpecialWeapon.Common
            ),
        )

        val ArcymistrzRun = Profession(
            name = "Arcymistrz run",
            ww = 20, us = 15, k = 20, odp = 15, zr = 15, int = 30, sw = 40, ogd = 15,
            a = 2, zyw = 6, mag = 4,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.wycena,
                CommonAbilities.zastraszanie,
                RareAbilities.czytanieIPisanie,
                RareAbilities.unik,
                RareAbilities.wykuwanieRun,
                SpecialAbilities.jezykTajemnyKrasnoludzki,
            ),
            skills = listOf(
            ),
            optionalAbility = listOf(
                ScienceAbilities.All,
                ScienceAbilities.All,
                ScienceAbilities.All,
                ScienceAbilities.All,
                CraftAbilities.All,
                CraftAbilities.All,
                KnowledgeAbilities.OldWorld,
                KnowledgeAbilities.OldWorld,
                KnowledgeAbilities.OldWorld,
                LanguageAbilities.All,
                LanguageAbilities.All,
                LanguageAbilities.All,
            ),
            optionalSkills = listOf(
                SpecialWeapon.Common,
                listOf(
                    CommonSkills.morderczyAtak,
                    CommonSkills.ogluszenie,
                    CommonSkills.mierzonyCios
                ),
                RuneForging.All,
                RuneForging.All,
                RuneForging.All,
                RuneForging.All,
                RuneForging.All,
                RuneForging.All,
                RuneForging.All,
                RuneForging.All,
                RuneForging.All,
                RuneForging.All,
                MasterRuneForging.All,
                MasterRuneForging.All
            ),
        )

        val ArcymistrzZielarstwa = Profession(
            name = "Arcymistrz zielarstwa",
            ww = 0, us = 0, k = 5, odp = 10, zr = 15, int = 35, sw = 35, ogd = 35,
            zyw = 5, mag = 3,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.plotkowanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.wycena,
                CommonAbilities.zastraszanie,
                RareAbilities.leczenie,
                RareAbilities.nawigacja,
                SpecialAbilities.wiedzaImperium,
            ),
            skills = listOf(
            ),
            optionalAbility = listOf(
                ScienceAbilities.All, ScienceAbilities.All,
                listOf(CommonAbilities.opiekaNadZwierzetami, RareAbilities.splatanieMagii),
                listOf(CommonAbilities.ukrywanieSie, RareAbilities.oswajanie),
                listOf(CommonAbilities.mocnaGlowa, RareAbilities.tropienie),
                listOf(CommonAbilities.sztukaPrzetrwania, CommonAbilities.targowanie),
                listOf(RareAbilities.warzenieTrucizn, RareAbilities.wykrywanieMagii),
                listOf(RareAbilities.czytanieIPisanie, SpecialAbilities.jezykTajemnyMagiczny),
                listOf(CommonAbilities.skradanieSie, RareAbilities.zastawianiePulapek),
                listOf(SpecialAbilities.rzemiosloAptekarstwo, SpecialAbilities.rzemiosloZielarstwo)
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.zmyslMagii, StatsSkills.blyskotliwosc),
                listOf(CommonSkills.bystryWzrok, CommonSkills.krzepki),
                UniversalMagic.All + CommonSkills.widzenieWCiemnosci,
                UniversalMagic.All + CommonSkills.szostyZmysl,
                UniversalMagic.All + CommonSkills.odpornoscPsychiczna,
            ),
        )

        val Artylerzysta = Profession(
            name = "Artylerzysta",
            ww = 15, us = 25, k = 10, odp = 10, zr = 15, int = 30, sw = 15, ogd = 0,
            zyw = 5,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.powozenie,
                CommonAbilities.spostrzegawczosc,
                SpecialAbilities.naukaInzynieria,
                SpecialAbilities.naukaMechanika,
                SpecialAbilities.rzemiosloRusznikarstwo,
                SpecialAbilities.sekretnyjezykBitewny,
            ),
            skills = listOf(
                CommonSkills.artylerzysta,
                CommonSkills.blyskawicznePrzadowanie,
                CommonSkills.strzalMierzony,
                CommonSkills.strzalPrecyzyjny,
                CommonSkills.strzalPrzebijajacy,
                StatsSkills.opanowanie,
                StatsSkills.strzelecWyborowy,
            ),
            optionalSkills = listOf(
                listOf(WeaponSkills.bronPalna, WeaponSkills.bronMechaniczna),
            ),
        )

        val Arystokrata = Profession(
            name = "Arystokrata",
            ww = 25, us = 15, k = 10, odp = 10, zr = 10, int = 20, sw = 20, ogd = 30,
            a = 1, zyw = 6,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.jezdziectwo,
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.wycena,
                RareAbilities.czytanieIPisanie,
                SpecialAbilities.naukaGeneologiaHeraldyka,
                SpecialAbilities.wiedzaImperium,
                SpecialAbilities.jezykKlasyczny,
                SpecialAbilities.jezykReikspiel,
            ),
            skills = listOf(
                CommonSkills.krasomowstwo,
                CommonSkills.przemawianie,
                WeaponSkills.bronSzermiercza,
            ),
            optionalAbility = listOf(
                listOf(SpecialAbilities.naukaHistoria, SpecialAbilities.naukaStrategiaTaktyka),
            ),
        )

        val Astrolog = Profession(
            name = "Astrolog",
            ww = 5, us = 5, k = 0, odp = 5, zr = 10, int = 25, sw = 20, ogd = 20,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                RareAbilities.czytanieIPisanie,
                RareAbilities.nawigacja,
                SpecialAbilities.kuglarstwoGawedziarstwo,
                SpecialAbilities.naukaAstronomia,
                SpecialAbilities.naukaFizyka,
                SpecialAbilities.sekretneZnakiAstrologow,
                SpecialAbilities.wiedzaImperium,
                SpecialAbilities.jezykKlasyczny,
            ),
            skills = listOf(
            ),
            optionalAbility = listOf(
                listOf(
                    SpecialAbilities.wiedzaBretonia,
                    SpecialAbilities.wiedzaEstalia,
                    SpecialAbilities.wiedzaKislev,
                    SpecialAbilities.wiedzaTilea
                ),
                listOf(
                    SpecialAbilities.jezykBretonski,
                    SpecialAbilities.jezykEstalijski,
                    SpecialAbilities.jezykKislevski,
                    SpecialAbilities.jezykTileanski
                ),
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.chodu, CommonSkills.etykieta),
                listOf(CommonSkills.geniuszArytmetyczny, CommonSkills.szczescie)
            ),
        )

        val Ataman = Profession(
            name = "Ataman",
            ww = 10, us = 10, k = 5, odp = 15, zr = 5, int = 30, sw = 20, ogd = 25,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.jezdziectwo,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.targowanie,
                SpecialAbilities.jezykKislevski,
            ),
            skills = listOf(
                CommonSkills.przemawianie,
            ),
            optionalAbility = listOf(
                listOf(SpecialAbilities.naukaHistoria, SpecialAbilities.naukaPrawo),
                listOf(SpecialAbilities.naukaStrategiaTaktyka, SpecialAbilities.naukaTeologia),
                listOf(CommonAbilities.plotkowanie, CommonAbilities.sztukaPrzetrwania),
                listOf(CommonAbilities.przekonywanie, CommonAbilities.zastraszanie),
                listOf(SpecialAbilities.wiedzaKislev, SpecialAbilities.wiedzaKrajTrolli)
            ),
            optionalSkills = listOf(
                listOf(StatsSkills.charyzmatyczny, StatsSkills.opanowanie)
            ),
        )

        val Bard = Profession(
            name = "Bard",
            ww = 10, us = 10, k = 0, odp = 0, zr = 15, int = 10, sw = 5, ogd = 25,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                RareAbilities.czytanieIPisanie,
                SpecialAbilities.kuglarstwoMuzykalnosc,
                SpecialAbilities.kuglarstwoSpiew,
            ),
            skills = listOf(
                CommonSkills.etykieta,
                CommonSkills.przemawianie,
            ),
            optionalAbility = listOf(
                KnowledgeAbilities.OldWorld,
                KnowledgeAbilities.OldWorld,
                listOf(
                    SpecialAbilities.jezykBretonski,
                    SpecialAbilities.jezykEltharin,
                    SpecialAbilities.jezykTileanski
                )
            ),
        )

        val Bezimienny = Profession(
            name = "Bezimienny",
            ww = 10, us = 30, k = 10, odp = 20, zr = 10, int = 10, sw = 10, ogd = 35,
            a = 2, zyw = 6,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.skradanieSie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.sztukaPrzetrwania,
                CommonAbilities.ukrywanieSie,
                CommonAbilities.wspinaczka,
                RareAbilities.tropienie,
                SpecialAbilities.naukaStrategiaTaktyka,
                SpecialAbilities.sekretnyjezykBitewny,
                SpecialAbilities.wiedzaBretonia,
            ),
            skills = listOf(
                CommonSkills.blyskawicznePrzadowanie,
                CommonSkills.niepokojacy,
                CommonSkills.przemawianie,
                CommonSkills.strzalPrecyzyjny,
                CommonSkills.strzalPrzebijajacy,
            ),
            optionalAbility = listOf(
                listOf(
                    SpecialAbilities.sekretneZnakiLowcow,
                    SpecialAbilities.sekretneZnakiZwiadowcow
                )
            ),
        )

        val BiczBozy = Profession(
            name = "Bicz boży",
            ww = 25, us = 0, k = 25, odp = 25, zr = 10, int = 0, sw = 30, ogd = 20,
            a = 2, zyw = 8,
            abilities = listOf(
                CommonAbilities.przekonywanie,
                CommonAbilities.zastraszanie,
                RareAbilities.leczenie,
                SpecialAbilities.naukaTeologia,
            ),
            skills = listOf(
                CommonSkills.grozny,
                CommonSkills.odpornoscNaChaos,
                CommonSkills.przemawianie,
                CommonSkills.szczescie,
                CommonSkills.szostyZmysl,
                StatsSkills.bardzoSilny,
                StatsSkills.niezwykleOdporny,
            ),
        )

        val Biczownik = Profession(
            name = "Biczownik",
            ww = 15, us = 0, k = 10, odp = 15, zr = 5, int = 0, sw = 20, ogd = 10,
            a = 1, zyw = 6,
            abilities = listOf(
                CommonAbilities.przekonywanie,
                CommonAbilities.zastraszanie,
                RareAbilities.leczenie,
                SpecialAbilities.naukaTeologia,
                SpecialAbilities.jezykKlasyczny,
            ),
            skills = listOf(
                CommonSkills.nieustraszony,
                CommonSkills.silnyCios,
            ),
            optionalSkills = listOf(
                listOf(WeaponSkills.bronDwureczna, WeaponSkills.korbacze)
            ),
        )

        val Bosman = Profession(
            name = "Bosman",
            ww = 15, us = 15, k = 10, odp = 15, zr = 10, int = 10, sw = 10, ogd = 10,
            a = 1, zyw = 4,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.hazard,
                CommonAbilities.mocnaGlowa,
                CommonAbilities.plotkowanie,
                CommonAbilities.plywanie,
                CommonAbilities.wioslarstwo,
                CommonAbilities.zastraszanie,
                RareAbilities.unik,
                RareAbilities.zeglarstwo,
                SpecialAbilities.rzemiosloSzkutnictwo,
            ),
            skills = listOf(
                CommonSkills.bijatyka,
                CommonSkills.obiezyswiat,
                CommonSkills.odpornoscNaChoroby,
            ),
            optionalAbility = listOf(
                KnowledgeAbilities.All,
                KnowledgeAbilities.All,
                listOf(
                    SpecialAbilities.jezykBretonski,
                    SpecialAbilities.jezykKislevski,
                    SpecialAbilities.jezykNorski
                )
            ),
        )

        val Brygadzista = Profession(
            name = "Brygadzista",
            ww = 10, us = 5, k = 10, odp = 10, zr = 5, int = 5, sw = 15, ogd = 15,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.targowanie,
                SpecialAbilities.kuglarstwoSpiew,
                SpecialAbilities.sekretnyjezykGildii,
            ),
            skills = listOf(
                CommonSkills.lotrzyk,
                CommonSkills.przemawianie,
            ),
            optionalAbility = listOf(
                listOf(CommonAbilities.hazard, CommonAbilities.plotkowanie),
                listOf(CommonAbilities.mocnaGlowa, CommonAbilities.przekonywanie),
                listOf(
                    SpecialAbilities.wiedzaImperium,
                    SpecialAbilities.wiedzaJalowaKraina,
                    SpecialAbilities.wiedzaKislev
                )
            ),
        )

        val Budowniczy = Profession(
            name = "Budowniczy",
            ww = 0, us = 10, k = 10, odp = 10, zr = 25, int = 20, sw = 10, ogd = 10,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.plotkowanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.targowanie,
                CommonAbilities.wycena,
                SpecialAbilities.naukaInzynieria,
                SpecialAbilities.naukaStrategiaTaktyka,
                SpecialAbilities.rzemiosloKamieniarstwo,
                SpecialAbilities.rzemiosloStolarstwo,
                SpecialAbilities.wiedzaBretonia,
            ),
            skills = listOf(
                StatsSkills.szybkiRefleks,
                WeaponSkills.bronMechaniczna,
            ),
        )

        val Ceremoniarz = Profession(
            name = "Ceremoniarz",
            ww = 10, us = 10, k = 5, odp = 5, zr = 0, int = 20, sw = 15, ogd = 10,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                RareAbilities.czytanieIPisanie,
                SpecialAbilities.naukaTeologia,
                SpecialAbilities.jezykKlasyczny,
            ),
            skills = listOf(
                CommonSkills.przemawianie,
                CommonSkills.zylkaHandlowa,
            ),
            optionalAbility = listOf(
                KnowledgeAbilities.OldWorld,
                LanguageAbilities.All
            ),
        )

        val Czarownik = Profession(
            name = "Czarownik",
            ww = 5, us = 5, k = 5, odp = 10, zr = 10, int = 10, sw = 15, ogd = 15,
            zyw = 4, mag = 2,
            abilities = listOf(
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.przeszukiwanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.targowanie,
                RareAbilities.leczenie,
                RareAbilities.splatanieMagii,
                RareAbilities.wykrywanieMagii,
            ),
            skills = listOf(
                CommonSkills.czarnoksiestwo,
                CommonSkills.czarostwo,
                CommonSkills.morderczyPocisk,
            ),
            optionalAbility = listOf(
                listOf(CommonAbilities.jezdziectwo, CommonAbilities.plywanie),
                listOf(CommonAbilities.opiekaNadZwierzetami, CommonAbilities.zastraszanie),
                listOf(SpecialAbilities.rzemiosloAptekarstwo, SpecialAbilities.rzemiosloZielarstwo),
                KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld
            ),
        )

        val Czarnoksieznik = Profession(
            name = "Czarnoksiężnik",
            ww = 10, us = 10, k = 10, odp = 10, zr = 15, int = 15, sw = 20, ogd = 20,
            zyw = 5, mag = 3,
            abilities = listOf(
                CommonAbilities.charakteryzacja,
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.przeszukiwanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.targowanie,
                CommonAbilities.ukrywanieSie,
                CommonAbilities.zastraszanie,
                RareAbilities.leczenie,
                RareAbilities.splatanieMagii,
                RareAbilities.wykrywanieMagii,
            ),
            skills = listOf(
                CommonSkills.czarnoksiestwo,
            ),
            optionalAbility = listOf(
                listOf(RareAbilities.czytanieIPisanie, RareAbilities.hipnoza),
                listOf(CommonAbilities.jezdziectwo, CommonAbilities.plywanie),
                listOf(SpecialAbilities.naukaDemonologia, SpecialAbilities.naukaNekromancja),
                listOf(SpecialAbilities.rzemiosloAptekarstwo, SpecialAbilities.rzemiosloZielarstwo),
                KnowledgeAbilities.OldWorld,
                KnowledgeAbilities.OldWorld,
                KnowledgeAbilities.OldWorld
            ),
            optionalSkills = listOf(
                listOf(
                    MagicSkills.magiaCzarnoksieskaChaos,
                    MagicSkills.magiaCzarnoksieskaNekromacja
                ),
                listOf(StatsSkills.niezwykleOdporny, StatsSkills.twardziel)
            ),
        )

        val CzarnyStraznik = Profession(
            name = "Czarny strażnik (Morr)",
            ww = 25, us = 15, k = 10, odp = 15, zr = 15, int = 5, sw = 20, ogd = 0,
            a = 1, zyw = 4,
            abilities = listOf(
                CommonAbilities.jezdziectwo,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.zastraszanie,
                RareAbilities.unik,
                SpecialAbilities.naukaNekromancja,
                SpecialAbilities.naukaTeologia,
                SpecialAbilities.sekretnyjezykBitewny,
            ),
            skills = listOf(
                CommonSkills.grozny,
                CommonSkills.odwaga,
                WeaponSkills.bronDwureczna,
                WeaponSkills.bronKawaleryjska,
            ),
            optionalAbility = listOf(
                LanguageAbilities.All, LanguageAbilities.All
            ),
            optionalSkills = listOf(
                listOf(WeaponSkills.dlugieLuki, WeaponSkills.kusze),
                listOf(CommonSkills.silnyCios, CommonSkills.strzalPrecyzyjny),
                listOf(CommonSkills.strzalMierzony, CommonSkills.strzalPrzebijajacy)
            ),
        )

        val Demagog = Profession(
            name = "Demagog",
            ww = 10, us = 10, k = 0, odp = 10, zr = 15, int = 20, sw = 15, ogd = 30,
            a = 1, zyw = 4,
            abilities = listOf(
                CommonAbilities.charakteryzacja,
                CommonAbilities.dowodzenie,
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.ukrywanieSie,
                CommonAbilities.zastraszanie,
                RareAbilities.gadanina,
                RareAbilities.unik,
                SpecialAbilities.naukaHistoria,
                SpecialAbilities.naukaPrawo,
                SpecialAbilities.wiedzaImperium,
                SpecialAbilities.jezykReikspiel,
            ),
            skills = listOf(
                CommonSkills.bijatyka,
                CommonSkills.krasomowstwo,
                CommonSkills.przemawianie,
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.etykieta, CommonSkills.lotrzyk)
            ),
        )

        val Dworak = Profession(
            name = "Dworak",
            ww = 15, us = 5, k = 10, odp = 15, zr = 15, int = 20, sw = 20, ogd = 10,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.przeszukiwanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.ukrywanieSie,
                CommonAbilities.zastraszanie,
                RareAbilities.gadanina,
                RareAbilities.unik,
                RareAbilities.warzenieTrucizn,
                SpecialAbilities.wiedzaKsiestwaGraniczne,
            ),
            skills = listOf(
                CommonSkills.bijatyka,
                CommonSkills.intrygant,
                CommonSkills.morderczyAtak,
                CommonSkills.mierzonyCios,
                CommonSkills.odpornoscNaTrucizny,
                StatsSkills.charyzmatyczny,
                StatsSkills.niezwykleOdporny,
            ),
            optionalAbility = listOf(
                LanguageAbilities.All
            ),
        )

        val Dworzanin = Profession(
            name = "Dworzanin",
            ww = 5, us = 5, k = 0, odp = 0, zr = 10, int = 20, sw = 20, ogd = 20,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.jezdziectwo,
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.wycena,
                RareAbilities.czytanieIPisanie,
                RareAbilities.gadanina,
                SpecialAbilities.jezykReikspiel,
            ),
            skills = listOf(
                CommonSkills.przemawianie,
            ),
            optionalAbility = listOf(
                SleightOfHandAbilities.All + listOf(CommonAbilities.dowodzenie),
                listOf(
                    SpecialAbilities.naukaHistoria,
                    SpecialAbilities.naukaSztuka,
                    CommonAbilities.hazard
                ),
                listOf(SpecialAbilities.wiedzaBretonia, SpecialAbilities.wiedzaTilea),
                listOf(SpecialAbilities.jezykBretonski, SpecialAbilities.jezykTileanski)
            ),
            optionalSkills = listOf(
                listOf(StatsSkills.blyskotliwosc, StatsSkills.charyzmatyczny),
                listOf(CommonSkills.intrygant, WeaponSkills.bronSzermiercza),
                listOf(CommonSkills.etykieta, CommonSkills.zylkaHandlowa)
            ),
        )

        val Egzorcysta = Profession(
            name = "Egzorcysta",
            ww = 0, us = 0, k = 10, odp = 15, zr = 15, int = 20, sw = 35, ogd = 20,
            a = 1, zyw = 6, mag = 2,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.zastraszanie,
                RareAbilities.hipnoza,
                RareAbilities.splatanieMagii,
                RareAbilities.wykrywanieMagii,
                SpecialAbilities.jezykTajemnyDemoniczny,
                SpecialAbilities.jezykTajemnyMagiczny,
                SpecialAbilities.naukaTeologia,
            ),
            skills = listOf(
                MagicSkills.magiaPowszechnaEgzorcyzm,
            ),
            optionalAbility = listOf(
                listOf(SpecialAbilities.naukaDemonologia, SpecialAbilities.naukaNekromancja),
                LanguageAbilities.All
            ),
            optionalSkills = listOf(
                listOf(StatsSkills.blyskotliwosc, StatsSkills.opanowanie),
                listOf(CommonSkills.odpornoscPsychiczna, CommonSkills.odwaga),
                listOf(CommonSkills.grozny, CommonSkills.szostyZmysl),
                UniversalMagic.All,
                PriestlyMagic.All
            ),
        )

        val Falszerz = Profession(
            name = "Fałszerz",
            ww = 5, us = 5, k = 10, odp = 10, zr = 20, int = 20, sw = 10, ogd = 10,
            zyw = 3,
            abilities = listOf(
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.targowanie,
                CommonAbilities.wycena,
                RareAbilities.czytanieIPisanie,
                SpecialAbilities.naukaSztuka,
                SpecialAbilities.rzemiosloKaligrafia,
                SpecialAbilities.rzemiosloKowalstwo,
                SpecialAbilities.rzemiosloSztuka,
                SpecialAbilities.sekretneZnakiZlodziei,
            ),
            skills = listOf(
                CommonSkills.talentArtystyczny,
            ),
            optionalAbility = listOf(
                KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
                LanguageAbilities.All
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.zylkaHandlowa, StatsSkills.opanowanie),
                listOf(StatsSkills.charyzmatyczny, CommonSkills.chodu)
            ),
        )

        val Fechtmistrz = Profession(
            name = "Fechtmistrz",
            ww = 40, us = 40, k = 25, odp = 25, zr = 30, int = 0, sw = 20, ogd = 0,
            a = 2, zyw = 8,
            abilities = listOf(
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.wycena,
                CommonAbilities.zastraszanie,
                RareAbilities.unik,
            ),
            skills = listOf(
                CommonSkills.artylerzysta,
                CommonSkills.blyskawicznePrzadowanie,
                CommonSkills.blyskawicznyBlok,
                CommonSkills.strzalPrecyzyjny,
                CommonSkills.szybkieWyciagniecie,
                CommonSkills.zapasy,
            ),
            optionalSkills = listOf(
                listOf(StatsSkills.bardzoSzybki, StatsSkills.szybkiRefleks),
                SpecialWeapon.Common, SpecialWeapon.Common, SpecialWeapon.Common
            ),
        )

        val HandlarzNiewolnikami = Profession(
            name = "Handlarz niewolnikami",
            ww = 20, us = 20, k = 20, odp = 0, zr = 10, int = 0, sw = 10, ogd = 0,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.jezdziectwo,
                CommonAbilities.powozenie,
                CommonAbilities.targowanie,
                CommonAbilities.wycena,
                CommonAbilities.zastraszanie,
                RareAbilities.torturowanie,
                RareAbilities.tropienie,
            ),
            skills = listOf(
                CommonSkills.grozny,
                CommonSkills.przemawianie,
                CommonSkills.zylkaHandlowa,
            ),
            optionalAbility = listOf(
                listOf(
                    SpecialAbilities.wiedzaBretonia,
                    SpecialAbilities.wiedzaImperium,
                    SpecialAbilities.wiedzaTilea
                ),
                LanguageAbilities.All, LanguageAbilities.All, LanguageAbilities.All
            ),
            optionalSkills = listOf(
                listOf(WeaponSkills.bronUnieruchamiajaca, CommonSkills.ogluszenie),
                listOf(CommonSkills.lotrzyk, CommonSkills.obiezyswiat)
            ),
        )

        val Herold = Profession(
            name = "Herold",
            ww = 10, us = 10, k = 5, odp = 5, zr = 15, int = 15, sw = 10, ogd = 20,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.jezdziectwo,
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.targowanie,
                CommonAbilities.wycena,
                RareAbilities.czytanieIPisanie,
                RareAbilities.gadanina,
                SpecialAbilities.naukaGeneologiaHeraldyka,
                SpecialAbilities.naukaHistoria,
                SpecialAbilities.wiedzaImperium,
                SpecialAbilities.jezykReikspiel,
            ),
            skills = listOf(
                CommonSkills.etykieta,
                CommonSkills.krasomowstwo,
                CommonSkills.przemawianie,
            ),
            optionalAbility = listOf(
                listOf(
                    SpecialAbilities.wiedzaBretonia,
                    SpecialAbilities.wiedzaKislev,
                    SpecialAbilities.wiedzaTilea
                ),
                listOf(
                    SpecialAbilities.jezykBretonski,
                    SpecialAbilities.jezykKislevski,
                    SpecialAbilities.jezykTileanski
                )
            ),
        )

        val HersztBanitow = Profession(
            name = "Herszt banitów",
            ww = 20, us = 30, k = 10, odp = 20, zr = 10, int = 10, sw = 10, ogd = 20,
            a = 2, zyw = 6,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.jezdziectwo,
                CommonAbilities.skradanieSie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.ukrywanieSie,
                CommonAbilities.wspinaczka,
                RareAbilities.tropienie,
                SpecialAbilities.naukaStrategiaTaktyka,
                SpecialAbilities.sekretnyjezykBitewny,
                SpecialAbilities.sekretnyjezykZlodziei,
                SpecialAbilities.wiedzaImperium,
            ),
            skills = listOf(
                CommonSkills.blyskawicznePrzadowanie,
                CommonSkills.blyskawicznyBlok,
                CommonSkills.strzalPrecyzyjny,
                CommonSkills.strzalPrzebijajacy,
                CommonSkills.szybkieWyciagniecie,
            ),
            optionalAbility = listOf(
                listOf(
                    SpecialAbilities.sekretneZnakiZwiadowcow,
                    SpecialAbilities.sekretneZnakiZlodziei
                )
            ),
        )

        val Husarz = Profession(
            name = "Husarz",
            ww = 25, us = 15, k = 15, odp = 15, zr = 15, int = 0, sw = 15, ogd = 15,
            a = 1, zyw = 4,
            abilities = listOf(
                CommonAbilities.jezdziectwo,
                CommonAbilities.mocnaGlowa,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.sztukaPrzetrwania,
                SpecialAbilities.naukaStrategiaTaktyka,
                SpecialAbilities.sekretnyjezykBitewny,
                SpecialAbilities.jezykKislevski,
            ),
            skills = listOf(
                WeaponSkills.bronKawaleryjska,
            ),
            optionalAbility = listOf(
                listOf(CommonAbilities.dowodzenie, RareAbilities.nawigacja),
                listOf(CommonAbilities.opiekaNadZwierzetami, RareAbilities.unik),
                listOf(SpecialAbilities.wiedzaKislev, SpecialAbilities.wiedzaKrajTrolli)
            ),
            optionalSkills = listOf(
                listOf(
                    CommonSkills.morderczyAtak,
                    CommonSkills.mierzonyCios,
                    CommonSkills.silnyCios
                ),
                listOf(StatsSkills.niezwykleOdporny, StatsSkills.twardziel)
            ),
        )

        val Inzynier = Profession(
            name = "Inżynier",
            ww = 10, us = 15, k = 5, odp = 5, zr = 10, int = 20, sw = 10, ogd = 0,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.spostrzegawczosc,
                RareAbilities.czytanieIPisanie,
                SpecialAbilities.naukaInzynieria,
                SpecialAbilities.naukaMechanika,
                SpecialAbilities.rzemiosloRusznikarstwo,
            ),
            skills = listOf(
                CommonSkills.artylerzysta,
            ),
            optionalAbility = listOf(
                listOf(CommonAbilities.jezdziectwo, CommonAbilities.powozenie),
                listOf(SpecialAbilities.wiedzaKrasnoludy, SpecialAbilities.wiedzaTilea),
                listOf(SpecialAbilities.jezykKhazalid, SpecialAbilities.jezykTileanski)
            ),
            optionalSkills = listOf(
                listOf(WeaponSkills.bronMechaniczna, WeaponSkills.bronPalna)
            ),
        )

        val Kapitan = Profession(
            name = "Kapitan",
            ww = 25, us = 20, k = 15, odp = 20, zr = 20, int = 20, sw = 25, ogd = 30,
            a = 2, zyw = 6,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.plywanie,
                CommonAbilities.spostrzegawczosc,
                RareAbilities.tresura,
                RareAbilities.unik,
                RareAbilities.zeglarstwo,
                SpecialAbilities.naukaStrategiaTaktyka,
            ),
            skills = listOf(
                CommonSkills.obiezyswiat,
                CommonSkills.rozbrajanie,
                CommonSkills.silnyCios,
                WeaponSkills.bronSzermiercza,
            ),
            optionalAbility = listOf(
                listOf(
                    SpecialAbilities.rzemiosloKartografia,
                    SpecialAbilities.rzemiosloSzkutnictwo
                ),
                KnowledgeAbilities.All, KnowledgeAbilities.All, KnowledgeAbilities.All,
                LanguageAbilities.All, LanguageAbilities.All, LanguageAbilities.All
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.blyskawicznyBlok, CommonSkills.brawura),
            ),
        )

        val Kaplan = Profession(
            name = "Kapłan",
            ww = 10, us = 10, k = 5, odp = 10, zr = 5, int = 10, sw = 20, ogd = 15,
            zyw = 4, mag = 1,
            abilities = listOf(
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                RareAbilities.czytanieIPisanie,
                RareAbilities.leczenie,
                RareAbilities.splatanieMagii,
                RareAbilities.wykrywanieMagii,
                SpecialAbilities.jezykTajemnyMagiczny,
                SpecialAbilities.naukaTeologia,
            ),
            skills = listOf(
            ),
            optionalAbility = listOf(
                listOf(CommonAbilities.jezdziectwo, CommonAbilities.plywanie),
                ScienceAbilities.All,
                KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
                LanguageAbilities.All, LanguageAbilities.All
            ),
            optionalSkills = listOf(
                SimplePriestlyMagic.All,
                listOf(CommonSkills.morderczyAtak, CommonSkills.ogluszenie, CommonSkills.mierzonyCios),
                listOf(CommonSkills.krasomowstwo, CommonSkills.pancerzWiary)
            ),
        )

        val KaplanSwiecki = Profession(
            name = "Kapłan świecki",
            ww = 15, us = 10, k = 5, odp = 10, zr = 10, int = 15, sw = 20, ogd = 20,
            zyw = 6,
            abilities = listOf(
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.targowanie,
                RareAbilities.czytanieIPisanie,
                RareAbilities.leczenie,
                RareAbilities.wykrywanieMagii,
                SpecialAbilities.jezykTajemnyMagiczny,
                SpecialAbilities.naukaTeologia,
            ),
            skills = listOf(
                CommonSkills.etykieta,
                CommonSkills.krasomowstwo,
                CommonSkills.odpornoscNaMagie,
            ),
            optionalAbility = listOf(
                listOf(CommonAbilities.jezdziectwo, CommonAbilities.plywanie),
                ScienceAbilities.All, ScienceAbilities.All,
                KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
                LanguageAbilities.All, LanguageAbilities.All
            ),
        )

        val KaplanWojownik = Profession(
            name = "Kapłan - wojownik",
            ww = 20, us = 15, k = 10, odp = 10, zr = 15, int = 15, sw = 25, ogd = 15,
            a = 1, zyw = 5, mag = 2,
            abilities = listOf(
                CommonAbilities.jezdziectwo,
                RareAbilities.leczenie,
                RareAbilities.splatanieMagii,
                RareAbilities.unik,
                RareAbilities.wykrywanieMagii,
                SpecialAbilities.jezykTajemnyMagiczny,
                SpecialAbilities.naukaStrategiaTaktyka,
                SpecialAbilities.naukaTeologia,
                SpecialAbilities.sekretnyjezykBitewny,
            ),
            skills = listOf(
                CommonSkills.pancerzWiary,
            ),
            optionalAbility = listOf(
                KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
                LanguageAbilities.All
            ),
            optionalSkills = listOf(
                listOf(WeaponSkills.bronDwureczna, CommonSkills.silnyCios),
                PriestlyMagic.All,
                UniversalMagic.All, UniversalMagic.All,
                listOf(CommonSkills.dotykMocy, CommonSkills.medytacja)
            ),
        )

        val Karczmarz = Profession(
            name = "Karczmarz",
            ww = 10, us = 5, k = 5, odp = 10, zr = 20, int = 10, sw = 10, ogd = 20,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.mocnaGlowa,
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.targowanie,
                CommonAbilities.wycena,
                SpecialAbilities.rzemiosloGotowanie,
                SpecialAbilities.wiedzaImperium,
            ),
            skills = listOf(
                CommonSkills.ogluszenie,
            ),
            optionalAbility = listOf(
                listOf(RareAbilities.czytanieIPisanie, RareAbilities.zwinnePalce),
                listOf(RareAbilities.czytanieZWarg, RareAbilities.gadanina),
                listOf(
                    SpecialAbilities.jezykBretonski,
                    SpecialAbilities.jezykKislevski,
                    SpecialAbilities.jezykReikspiel,
                    SpecialAbilities.jezykTileanski
                )
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.etykieta, CommonSkills.lotrzyk),
                listOf(CommonSkills.bijatyka, CommonSkills.zylkaHandlowa)
            ),
        )

        val Katecheta = Profession(
            name = "Katecheta",
            ww = 0, us = 0, k = 5, odp = 5, zr = 10, int = 20, sw = 15, ogd = 10,
            zyw = 4,
            abilities = listOf(
                RareAbilities.czytanieIPisanie,
                SpecialAbilities.naukaTeologia,
                SpecialAbilities.jezykKlasyczny
            ),
            skills = listOf(
                CommonSkills.przemawianie,
            ),
            optionalAbility = listOf(
                ScienceAbilities.All,
                KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
                LanguageAbilities.All
            ),
        )

        val Koniuszy = Profession(
            name = "Koniuszy",
            ww = 5, us = 15, k = 15, odp = 10, zr = 15, int = 20, sw = 15, ogd = 25,
            zyw = 5,
            abilities = listOf(
                CommonAbilities.jezdziectwo,
                CommonAbilities.opiekaNadZwierzetami,
                CommonAbilities.powozenie,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                RareAbilities.oswajanie,
                RareAbilities.tresura,
            ),
            skills = listOf(
                StatsSkills.bardzoSilny,
                WeaponSkills.bronUnieruchamiajaca,
            ),
            optionalAbility = listOf(
                listOf(CommonAbilities.mocnaGlowa, RareAbilities.unik),
            ),
            optionalSkills = listOf(
                listOf(StatsSkills.opanowanie, StatsSkills.twardziel)
            ),
        )

        val KonnyLucznik = Profession(
            name = "Konny łucznik",
            ww = 15, us = 25, k = 15, odp = 15, zr = 15, int = 0, sw = 15, ogd = 5,
            a = 1, zyw = 4,
            abilities = listOf(
                CommonAbilities.jezdziectwo,
                CommonAbilities.mocnaGlowa,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.sztukaPrzetrwania,
                RareAbilities.unik,
                SpecialAbilities.naukaStrategiaTaktyka,
            ),
            skills = listOf(
                WeaponSkills.bronKawaleryjska,
            ),
            optionalAbility = listOf(
                listOf(CommonAbilities.dowodzenie, RareAbilities.nawigacja),
                listOf(SpecialAbilities.wiedzaKislev, SpecialAbilities.wiedzaKrajTrolli),
                listOf(SpecialAbilities.jezykKislevski, SpecialAbilities.jezykUngolski)
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.blyskawicznePrzadowanie, CommonSkills.szybkieWyciagniecie),
                listOf(StatsSkills.opanowanie, StatsSkills.twardziel),
                listOf(CommonSkills.strzalPrecyzyjny, CommonSkills.strzalPrzebijajacy)
            ),
        )

        val KowalRun = Profession(
            name = "Kowal run",
            ww = 10, us = 5, k = 10, odp = 5, zr = 5, int = 20, sw = 25, ogd = 5,
            zyw = 3, mag = 2,
            abilities = listOf(
                CommonAbilities.plotkowanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.wycena,
                CommonAbilities.zastraszanie,
                RareAbilities.czytanieIPisanie,
                RareAbilities.unik,
                RareAbilities.wykuwanieRun,
                SpecialAbilities.jezykTajemnyKrasnoludzki,
                SpecialAbilities.naukaHistoria,
                SpecialAbilities.naukaRuny,
            ),
            skills = listOf(
            ),
            optionalAbility = listOf(
                CraftAbilities.All, CraftAbilities.All,
                KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
                LanguageAbilities.All, LanguageAbilities.All,
            ),
            optionalSkills = listOf(
                RuneForging.All,
                RuneForging.All,
                RuneForging.All,
                RuneForging.All,
                RuneForging.All,
                RuneForging.All,
                listOf(CommonSkills.talentArtystyczny, StatsSkills.twardziel)
            ),
        )

        val Krzyzowiec = Profession(
            name = "Krzyżowiec",
            ww = 30, us = 10, k = 20, odp = 20, zr = 20, int = 20, sw = 25, ogd = 15,
            a = 2, zyw = 8,
            abilities = listOf(
                CommonAbilities.jezdziectwo,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.sztukaPrzetrwania,
                RareAbilities.nawigacja,
                SpecialAbilities.naukaHistoria,
                SpecialAbilities.naukaStrategiaTaktyka,
                SpecialAbilities.sekretnyjezykBitewny,
                SpecialAbilities.naukaRuny,
            ),
            skills = listOf(
                CommonSkills.obiezyswiat,
                CommonSkills.odwaga,
                CommonSkills.ogluszenie,
                WeaponSkills.bronParujaca,
            ),
            optionalAbility = listOf(
                listOf(
                    SpecialAbilities.jezykArabski,
                    SpecialAbilities.jezykBretonski,
                    SpecialAbilities.jezykEstalijski,
                    SpecialAbilities.jezykTileanski
                ),
                KnowledgeAbilities.OldWorld
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.morderczyAtak, CommonSkills.mierzonyCios),
                listOf(CommonSkills.wyczucieKierunku, CommonSkills.poliglota)
            ),
        )

        val KsiazeZlodziei = Profession(
            name = "Książe złodziei",
            ww = 20, us = 20, k = 15, odp = 15, zr = 20, int = 25, sw = 20, ogd = 30,
            a = 1, zyw = 6,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.targowanie,
                CommonAbilities.wycena,
                CommonAbilities.zastraszanie,
                RareAbilities.torturowanie,
                RareAbilities.unik,
                SpecialAbilities.sekretneZnakiZlodziei,
                SpecialAbilities.sekretnyjezykZlodziei,
                SpecialAbilities.wiedzaImperium,
            ),
            skills = listOf(
                CommonSkills.grozny,
                CommonSkills.intrygant,
                CommonSkills.lotrzyk,
                CommonSkills.odpornoscNaTrucizny,
                CommonSkills.przemawianie,
                CommonSkills.szostyZmysl,
            ),
            optionalSkills = listOf(
                listOf(WeaponSkills.kusze, WeaponSkills.bronParujaca),
                listOf(CommonSkills.zylkaHandlowa, CommonSkills.intrygant)
            ),
        )

        val Kupiec = Profession(
            name = "Kupiec",
            ww = 10, us = 10, k = 5, odp = 5, zr = 10, int = 25, sw = 20, ogd = 20,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.jezdziectwo,
                CommonAbilities.plotkowanie,
                CommonAbilities.powozenie,
                CommonAbilities.przekonywanie,
                CommonAbilities.targowanie,
                CommonAbilities.wycena,
                RareAbilities.czytanieIPisanie,
                SpecialAbilities.rzemiosloHandel,
                SpecialAbilities.sekretnyjezykGildii,
                SpecialAbilities.jezykReikspiel,
            ),
            skills = listOf(
                CommonSkills.geniuszArytmetyczny,
            ),
            optionalAbility = listOf(
                KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
                listOf(
                    SpecialAbilities.jezykBretonski,
                    SpecialAbilities.jezykEstalijski,
                    SpecialAbilities.jezykKislevski,
                    SpecialAbilities.jezykNorski
                )
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.lotrzyk, CommonSkills.zylkaHandlowa),
            ),
        )

        val Lajdak = Profession(
            name = "Łajdak",
            ww = 10, us = 5, k = 5, odp = 15, zr = 25, int = 10, sw = 10, ogd = 30,
            a = 1, zyw = 4,
            abilities = listOf(
                CommonAbilities.hazard,
                CommonAbilities.mocnaGlowa,
                CommonAbilities.plotkowanie,
                CommonAbilities.plywanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.przeszukiwanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.wycena,
                RareAbilities.czytanieZWarg,
                RareAbilities.unik,
                RareAbilities.zwinnePalce,
            ),
            skills = listOf(
            ),
            optionalAbility = listOf(
                KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.oburecznosc, StatsSkills.bardzoSzybki),
                listOf(CommonSkills.przemawianie, CommonSkills.szostyZmysl),
                listOf(CommonSkills.lotrzyk, CommonSkills.szybkieWyciagniecie),
                listOf(CommonSkills.ulicznik, CommonSkills.zylkaHandlowa),
            ),
        )

        val LesnyDuch = Profession(
            name = "Leśny duch",
            ww = 20, us = 30, k = 15, odp = 15, zr = 25, int = 20, sw = 20, ogd = 0,
            a = 2, zyw = 6,
            abilities = listOf(
                CommonAbilities.skradanieSie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.sztukaPrzetrwania,
                CommonAbilities.ukrywanieSie,
                CommonAbilities.zastraszanie,
                RareAbilities.czytanieZWarg,
                RareAbilities.nawigacja,
                RareAbilities.sledzenie,
                RareAbilities.tropienie,
                RareAbilities.unik,
                RareAbilities.zastawianiePulapek,
                SpecialAbilities.sekretneZnakiLowcow,
                SpecialAbilities.sekretnyjezykLowcow,
            ),
            skills = listOf(
                CommonSkills.blyskawicznePrzadowanie,
                CommonSkills.blyskawicznyBlok,
                CommonSkills.strzalPrecyzyjny,
                CommonSkills.strzalPrzebijajacy,
                CommonSkills.szybkieWyciagniecie,
            ),
            optionalSkills = listOf(
                listOf(StatsSkills.bardzoSzybki, StatsSkills.twardziel)
            ),
        )

        val LodowaCzarownica = Profession(
            name = "Lodowa czarownica",
            ww = 15, us = 0, k = 5, odp = 20, zr = 15, int = 30, sw = 40, ogd = 15,
            zyw = 6, mag = 4,
            abilities = listOf(
                CommonAbilities.spostrzegawczosc,
                RareAbilities.czytanieIPisanie,
                RareAbilities.splatanieMagii,
                RareAbilities.wykrywanieMagii,
                SpecialAbilities.jezykTajemnyMagiczny,
                SpecialAbilities.naukaMagia,
                SpecialAbilities.wiedzaKislev,
                SpecialAbilities.jezykKislevski,
            ),
            skills = listOf(
                CommonSkills.dotykMocy,
            ),
            optionalAbility = listOf(
                listOf(CommonAbilities.dowodzenie, CommonAbilities.zastraszanie),
                listOf(CommonAbilities.jezdziectwo, CommonAbilities.sztukaPrzetrwania),
                ScienceAbilities.All,
                KnowledgeAbilities.OldWorld,
                LanguageAbilities.All, LanguageAbilities.All
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.grozny, CommonSkills.niepokojacy),
                UniversalMagic.All, UniversalMagic.All, UniversalMagic.All
            ),
        )

        val LodowaPanna = Profession(
            name = "Lodowa panna",
            ww = 5, us = 0, k = 5, odp = 10, zr = 5, int = 20, sw = 25, ogd = 10,
            zyw = 4, mag = 2,
            abilities = listOf(
                CommonAbilities.spostrzegawczosc,
                RareAbilities.splatanieMagii,
                RareAbilities.wykrywanieMagii,
                SpecialAbilities.jezykTajemnyMagiczny,
                SpecialAbilities.naukaMagia,
                SpecialAbilities.wiedzaKislev,
                SpecialAbilities.jezykKislevski,
            ),
            skills = listOf(
                StatsSkills.opanowanie,
                MagicSkills.magiaCzarownicTradycjaLodu,
            ),
            optionalAbility = listOf(
                listOf(RareAbilities.czytanieIPisanie, RareAbilities.nawigacja),
                listOf(CommonAbilities.dowodzenie, CommonAbilities.zastraszanie),
                listOf(CommonAbilities.jezdziectwo, CommonAbilities.sztukaPrzetrwania)
            ),
            optionalSkills = listOf(
                UniversalMagic.All, UniversalMagic.All, UniversalMagic.All,
                listOf(CommonSkills.medytacja, CommonSkills.morderczyPocisk),
                listOf(CommonSkills.odpornoscPsychiczna, CommonSkills.odwaga)
            ),
        )

        val LowcaCzarownic = Profession(
            name = "Łowca czarownic",
            ww = 30, us = 30, k = 15, odp = 15, zr = 15, int = 15, sw = 35, ogd = 20,
            a = 2, zyw = 6,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.jezdziectwo,
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.przeszukiwanie,
                CommonAbilities.skradanieSie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.zastraszanie,
                SpecialAbilities.naukaMagia,
                SpecialAbilities.naukaNekromancja,
                SpecialAbilities.naukaTeologia,
                SpecialAbilities.wiedzaImperium,
            ),
            skills = listOf(
                CommonSkills.blyskawicznyBlok,
                CommonSkills.grozny,
                CommonSkills.odwaga,
                CommonSkills.przemawianie,
                CommonSkills.silnyCios,
                CommonSkills.szostyZmysl,
                WeaponSkills.kusze,
                WeaponSkills.bronRzucana,
                WeaponSkills.bronUnieruchamiajaca,
            ),
            optionalAbility = listOf(
                LanguageAbilities.All
            ),
            optionalSkills = listOf(
                listOf(StatsSkills.strzelecWyborowy, StatsSkills.szybkiRefleks)
            ),
        )

        val LowcaWampirow = Profession(
            name = "Łowca wampirów",
            ww = 20, us = 20, k = 10, odp = 20, zr = 15, int = 15, sw = 20, ogd = 0,
            a = 1, zyw = 4,
            abilities = listOf(
                CommonAbilities.przeszukiwanie,
                CommonAbilities.skradanieSie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.ukrywanieSie,
                CommonAbilities.wspinaczka,
                RareAbilities.sledzenie,
                RareAbilities.tropienie,
                RareAbilities.unik,
                SpecialAbilities.wiedzaImperium,
                SpecialAbilities.jezykKlasyczny,
            ),
            skills = listOf(
                CommonSkills.grotolaz,
                CommonSkills.morderczyAtak,
                CommonSkills.odwaga,
                CommonSkills.silnyCios,
                WeaponSkills.kusze,
            ),
            optionalAbility = listOf(
                listOf(SpecialAbilities.naukaHistoria, SpecialAbilities.naukaNekromancja)
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.strzalPrecyzyjny, CommonSkills.blyskawicznePrzadowanie)
            ),
        )

        val MagisterRewizor = Profession(
            name = "Magister rewizor",
            ww = 15, us = 10, k = 5, odp = 10, zr = 20, int = 25, sw = 30, ogd = 15,
            zyw = 5, mag = 3,
            abilities = listOf(
                CommonAbilities.jezdziectwo,
                CommonAbilities.plotkowanie,
                CommonAbilities.przeszukiwanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.zastraszanie,
                RareAbilities.czytanieIPisanie,
                RareAbilities.splatanieMagii,
                RareAbilities.torturowanie,
                RareAbilities.wykrywanieMagii,
                SpecialAbilities.jezykTajemnyDemoniczny,
                SpecialAbilities.jezykTajemnyMagiczny,
                SpecialAbilities.naukaMagia,
                SpecialAbilities.naukaNekromancja,
                SpecialAbilities.wiedzaImperium,
            ),
            skills = listOf(
                CommonSkills.dotykMocy,
                CommonSkills.grozny,
                CommonSkills.intrygant,
                CommonSkills.morderczyPocisk,
                CommonSkills.odpornoscPsychiczna,
                CommonSkills.odwaga,
            ),
            optionalAbility = listOf(
                KnowledgeAbilities.OldWorld,
                LanguageAbilities.All, LanguageAbilities.All
            ),
            optionalSkills = listOf(
                UniversalMagic.All, UniversalMagic.All, UniversalMagic.All, UniversalMagic.All
            ),
        )

        val Majordomus = Profession(
            name = "Majordomus",
            ww = 10, us = 10, k = 10, odp = 10, zr = 0, int = 30, sw = 20, ogd = 25,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.przeszukiwanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.targowanie,
                CommonAbilities.wycena,
                CommonAbilities.zastraszanie,
                SpecialAbilities.naukaPrawo,
                SpecialAbilities.rzemiosloHandel,
                SpecialAbilities.wiedzaImperium,
                SpecialAbilities.jezykReikspiel,
            ),
            skills = listOf(
                CommonSkills.geniuszArytmetyczny,
                CommonSkills.przemawianie,
            ),
        )

        val Medyk = Profession(
            name = "Medyk",
            ww = 0, us = 0, k = 10, odp = 10, zr = 15, int = 30, sw = 20, ogd = 15,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.plotkowanie,
                CommonAbilities.spostrzegawczosc,
                RareAbilities.czytanieIPisanie,
                RareAbilities.leczenie,
                RareAbilities.warzenieTrucizn,
                SpecialAbilities.rzemiosloAptekarstwo,
                SpecialAbilities.jezykKlasyczny,
            ),
            skills = listOf(
                CommonSkills.chirurgia,
                CommonSkills.odpornoscNaChoroby,
                CommonSkills.ogluszenie,
            ),
        )

        val MistrzCieni = Profession(
            name = "Mistrz Cieni",
            ww = 20, us = 20, k = 10, odp = 10, zr = 40, int = 25, sw = 20, ogd = 25,
            a = 1, zyw = 6,
            abilities = listOf(
                CommonAbilities.charakteryzacja,
                CommonAbilities.plotkowanie,
                CommonAbilities.plywanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.przeszukiwanie,
                CommonAbilities.skradanieSie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.ukrywanieSie,
                CommonAbilities.wspinaczka,
                CommonAbilities.wycena,
                RareAbilities.czytanieIPisanie,
                RareAbilities.otwieranieZamkow,
                RareAbilities.unik,
                RareAbilities.zwinnePalce,
                SpecialAbilities.sekretneZnakiZlodziei,
                SpecialAbilities.sekretnyjezykZlodziei,
            ),
            skills = listOf(
                CommonSkills.lotrzyk,
                CommonSkills.wykrywaniePulapek,
                WeaponSkills.kusze,
                WeaponSkills.bronRzucana,
            ),
            optionalAbility = listOf(
                listOf(CommonAbilities.hazard, RareAbilities.czytanieZWarg),
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.bijatyka, CommonSkills.brawura)
            ),
        )

        val MistrzGildii = Profession(
            name = "Mistrz gildii",
            ww = 10, us = 10, k = 0, odp = 10, zr = 15, int = 30, sw = 20, ogd = 35,
            a = 1, zyw = 5,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.targowanie,
                CommonAbilities.wycena,
                SpecialAbilities.naukaHistoria,
                SpecialAbilities.sekretnyjezykGildii,
                SpecialAbilities.wiedzaImperium,
                SpecialAbilities.jezykReikspiel,
            ),
            skills = listOf(
                CommonSkills.etykieta,
                CommonSkills.poliglota,
                CommonSkills.zylkaHandlowa,
            ),
            optionalAbility = listOf(
                CraftAbilities.All,
                CraftAbilities.All,
                listOf(
                    SpecialAbilities.jezykBretonski,
                    SpecialAbilities.jezykEstalijski,
                    SpecialAbilities.jezykKislevski,
                    SpecialAbilities.jezykNorski
                )
            ),
        )

        val MistrzMagii = Profession(
            name = "Mistrz magii",
            ww = 10, us = 10, k = 0, odp = 10, zr = 15, int = 30, sw = 35, ogd = 15,
            zyw = 4, mag = 3,
            abilities = listOf(
                RareAbilities.czytanieIPisanie,
                RareAbilities.splatanieMagii,
                RareAbilities.wykrywanieMagii,
                SpecialAbilities.jezykTajemnyMagiczny,
                SpecialAbilities.naukaMagia,
            ),
            skills = listOf(
            ),
            optionalAbility = listOf(
                listOf(SpecialAbilities.jezykTajemnyDemoniczny, SpecialAbilities.jezykTajemnyElfi),
                ScienceAbilities.All, ScienceAbilities.All,
                listOf(CommonAbilities.plotkowanie, CommonAbilities.jezdziectwo),
                listOf(CommonAbilities.przekonywanie, CommonAbilities.zastraszanie),
                KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
                LanguageAbilities.All, LanguageAbilities.All, LanguageAbilities.All
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.czarnoksiestwo, CommonSkills.odpornoscPsychiczna),
                listOf(CommonSkills.dotykMocy, CommonSkills.morderczyPocisk),
                listOf(CommonSkills.medytacja, CommonSkills.zmyslMagii),
                UniversalMagic.All, UniversalMagic.All
            ),
        )

        val MistrzRun = Profession(
            name = "Mistrz run",
            ww = 15, us = 10, k = 15, odp = 10, zr = 10, int = 25, sw = 35, ogd = 10,
            a = 1, zyw = 5, mag = 3,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.plotkowanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.wycena,
                CommonAbilities.zastraszanie,
                RareAbilities.czytanieIPisanie,
                RareAbilities.unik,
                RareAbilities.wykuwanieRun,
                SpecialAbilities.jezykTajemnyKrasnoludzki,
            ),
            skills = listOf(
            ),
            optionalAbility = listOf(
                ScienceAbilities.All,
                ScienceAbilities.All,
                ScienceAbilities.All,
                CraftAbilities.All,
                CraftAbilities.All,
                KnowledgeAbilities.OldWorld,
                KnowledgeAbilities.OldWorld,
                KnowledgeAbilities.OldWorld,
                LanguageAbilities.All,
                LanguageAbilities.All,
                LanguageAbilities.All
            ),
            optionalSkills = listOf(
                listOf(WeaponSkills.bronDwureczna, WeaponSkills.korbacze),
                listOf(CommonSkills.rozbrajanie, CommonSkills.silnyCios),
                RuneForging.All,
                RuneForging.All,
                RuneForging.All,
                RuneForging.All,
                RuneForging.All,
                RuneForging.All,
                RuneForging.All,
                RuneForging.All,
                RuneForging.All,
                RuneForging.All,
                MasterRuneForging.All,
                MasterRuneForging.All
            ),
        )

        val MistrzRzemiosla = Profession(
            name = "Mistrz rzemiosła",
            ww = 0, us = 0, k = 10, odp = 10, zr = 20, int = 10, sw = 10, ogd = 10,
            zyw = 3,
            abilities = listOf(
                CommonAbilities.plotkowanie,
                CommonAbilities.powozenie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.targowanie,
                CommonAbilities.wycena,
                SpecialAbilities.sekretnyjezykGildii,
                SpecialAbilities.wiedzaImperium,
            ),
            skills = listOf(
            ),
            optionalAbility = listOf(
                listOf(
                    SpecialAbilities.jezykBretonski,
                    SpecialAbilities.jezykKhazalid,
                    SpecialAbilities.jezykTileanski
                ),
                CraftAbilities.All, CraftAbilities.All, CraftAbilities.All
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.etykieta, CommonSkills.talentArtystyczny)
            ),
        )

        val MistrzZakonny = Profession(
            name = "Mistrz zakonny",
            ww = 35, us = 10, k = 20, odp = 20, zr = 20, int = 15, sw = 25, ogd = 15,
            a = 2, zyw = 8,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.jezdziectwo,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                RareAbilities.czytanieIPisanie,
                RareAbilities.tresura,
                RareAbilities.unik,
                SpecialAbilities.naukaStrategiaTaktyka,
                SpecialAbilities.sekretnyjezykBitewny,
            ),
            skills = listOf(
                CommonSkills.blyskawicznyBlok,
                CommonSkills.etykieta,
                CommonSkills.morderczyAtak,
                CommonSkills.obiezyswiat,
                CommonSkills.odwaga,
                CommonSkills.ogluszenie,
                WeaponSkills.bronParujaca,
                WeaponSkills.bronSzermiercza,
            ),
            optionalAbility = listOf(
                listOf(SpecialAbilities.naukaGeneologiaHeraldyka, SpecialAbilities.naukaTeologia),
                listOf(
                    SpecialAbilities.sekretneZnakiZwiadowcow,
                    SpecialAbilities.sekretneZnakiRycerzyZakonnych
                ),
                KnowledgeAbilities.OldWorld,
                KnowledgeAbilities.OldWorld,
                KnowledgeAbilities.OldWorld,
                listOf(
                    SpecialAbilities.jezykBretonski,
                    SpecialAbilities.jezykEstalijski,
                    SpecialAbilities.jezykKislevski,
                    SpecialAbilities.jezykTileanski
                )
            ),
        )

        val MistrzZielarstwa = Profession(
            name = "Mistrz zielarstwa",
            ww = 0, us = 0, k = 5, odp = 5, zr = 5, int = 20, sw = 20, ogd = 20,
            zyw = 3, mag = 2,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.spostrzegawczosc,
                RareAbilities.leczenie,
            ),
            skills = listOf(
            ),
            optionalAbility = listOf(
                listOf(CommonAbilities.opiekaNadZwierzetami, RareAbilities.splatanieMagii),
                listOf(CommonAbilities.ukrywanieSie, RareAbilities.oswajanie),
                listOf(CommonAbilities.wycena, RareAbilities.nawigacja),
                listOf(CommonAbilities.mocnaGlowa, RareAbilities.tropienie),
                listOf(CommonAbilities.plotkowanie, CommonAbilities.zastraszanie),
                listOf(CommonAbilities.sztukaPrzetrwania, CommonAbilities.targowanie),
                listOf(RareAbilities.warzenieTrucizn, RareAbilities.wykrywanieMagii),
                listOf(RareAbilities.czytanieIPisanie, SpecialAbilities.jezykTajemnyMagiczny),
                listOf(CommonAbilities.skradanieSie, RareAbilities.zastawianiePulapek),
                listOf(SpecialAbilities.rzemiosloAptekarstwo, SpecialAbilities.rzemiosloZielarstwo)
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.morderczyPocisk, StatsSkills.szybkiRefleks),
                listOf(CommonSkills.medytacja, StatsSkills.opanowanie),
                UniversalMagic.All + StatsSkills.bardzoSzybki,
                listOf(CommonSkills.szczescie, MagicSkills.magiaCzarownicTradycjaWiedzm),
                listOf(CommonSkills.wedrowiec, MagicSkills.magiaProstaZielarska),
            ),
        )

        val Mistyk = Profession(
            name = "Mistyk",
            ww = 0, us = 0, k = 0, odp = 10, zr = 10, int = 10, sw = 15, ogd = 15,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.przekonywanie,
                CommonAbilities.zastraszanie,
                RareAbilities.gadanina,
                RareAbilities.torturowanie,
                SpecialAbilities.naukaTeologia,
            ),
            skills = listOf(
                CommonSkills.grozny,
                CommonSkills.przemawianie,
            ),
            optionalAbility = listOf(
                LanguageAbilities.All
            ),
        )

        val Mnich = Profession(
            name = "Mnich",
            ww = 5, us = 0, k = 5, odp = 5, zr = 10, int = 25, sw = 15, ogd = 15,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.opiekaNadZwierzetami,
                CommonAbilities.spostrzegawczosc,
                RareAbilities.czytanieIPisanie,
                RareAbilities.leczenie,
                SpecialAbilities.jezykTajemnyMagiczny,
                SpecialAbilities.naukaTeologia,
                SpecialAbilities.jezykKlasyczny,
            ),
            skills = listOf(
                CommonSkills.poliglota,
            ),
            optionalAbility = listOf(
                ScienceAbilities.All, ScienceAbilities.All,
                KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
                LanguageAbilities.All, LanguageAbilities.All
            ),
        )

        val Nawigator = Profession(
            name = "Nawigator",
            ww = 10, us = 10, k = 5, odp = 5, zr = 10, int = 25, sw = 10, ogd = 5,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.plywanie,
                CommonAbilities.spostrzegawczosc,
                RareAbilities.czytanieIPisanie,
                RareAbilities.nawigacja,
                SpecialAbilities.naukaAstronomia,
                SpecialAbilities.rzemiosloKartografia,
                SpecialAbilities.jezykKlasyczny,
            ),
            skills = listOf(
                CommonSkills.wyczucieKierunku,
            ),
            optionalAbility = listOf(
                KnowledgeAbilities.All, KnowledgeAbilities.All
            ),
        )

        val Obszarnik = Profession(
            name = "Obszarnik",
            ww = 5, us = 10, k = 0, odp = 0, zr = 10, int = 5, sw = 10, ogd = 10,
            zyw = 3,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.opiekaNadZwierzetami,
                CommonAbilities.plotkowanie,
                CommonAbilities.powozenie,
                CommonAbilities.targowanie,
                CommonAbilities.wycena,
                SpecialAbilities.wiedzaNorska,
            ),
            skills = listOf(
                CommonSkills.intrygant,
                CommonSkills.przemawianie,
                CommonSkills.zylkaHandlowa,
                StatsSkills.blyskotliwosc,
                StatsSkills.charyzmatyczny,
            ),
            optionalAbility = listOf(
                CraftAbilities.All,
                LanguageAbilities.All
            ),
        )

        val Opat = Profession(
            name = "Opat",
            ww = 10, us = 0, k = 10, odp = 10, zr = 10, int = 30, sw = 25, ogd = 20,
            zyw = 6,
            abilities = listOf(
                CommonAbilities.opiekaNadZwierzetami,
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                RareAbilities.czytanieIPisanie,
                RareAbilities.leczenie,
                SpecialAbilities.jezykTajemnyMagiczny,
                SpecialAbilities.naukaTeologia,
                SpecialAbilities.rzemiosloKartografia,
                SpecialAbilities.jezykKlasyczny,
            ),
            skills = listOf(
                CommonSkills.krasomowstwo,
                CommonSkills.odpornoscPsychiczna,
                StatsSkills.blyskotliwosc,
            ),
            optionalAbility = listOf(
                ScienceAbilities.All, ScienceAbilities.All,
                KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
                LanguageAbilities.All, LanguageAbilities.All
            ),
        )

        val Odkrywca = Profession(
            name = "Odkrywca",
            ww = 20, us = 20, k = 10, odp = 15, zr = 15, int = 25, sw = 20, ogd = 15,
            a = 1, zyw = 6,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.jezdziectwo,
                CommonAbilities.plywanie,
                CommonAbilities.powozenie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.sztukaPrzetrwania,
                CommonAbilities.wspinaczka,
                CommonAbilities.wycena,
                RareAbilities.czytanieIPisanie,
                RareAbilities.nawigacja,
                RareAbilities.tropienie,
                SpecialAbilities.rzemiosloKartografia,
                SpecialAbilities.sekretneZnakiZwiadowcow,
                SpecialAbilities.sekretnyjezykLowcow,
            ),
            skills = listOf(
                CommonSkills.obiezyswiat,
            ),
            optionalAbility = listOf(
                listOf(SpecialAbilities.naukaHistoria, SpecialAbilities.naukaPrawo),
                KnowledgeAbilities.All, KnowledgeAbilities.All, KnowledgeAbilities.All,
                LanguageAbilities.All, LanguageAbilities.All, LanguageAbilities.All
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.poliglota, CommonSkills.wyczucieKierunku)
            ),
        )

        val Oficer = Profession(
            name = "Oficer",
            ww = 30, us = 20, k = 20, odp = 20, zr = 20, int = 15, sw = 15, ogd = 25,
            a = 2, zyw = 7,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.jezdziectwo,
                CommonAbilities.opiekaNadZwierzetami,
                CommonAbilities.plotkowanie,
                RareAbilities.czytanieIPisanie,
                RareAbilities.unik,
                SpecialAbilities.naukaStrategiaTaktyka,
                SpecialAbilities.sekretnyjezykBitewny,
            ),
            skills = listOf(
                CommonSkills.blyskawicznyBlok,
            ),
            optionalAbility = listOf(
                KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
                listOf(SpecialAbilities.jezykKislevski, SpecialAbilities.jezykTileanski)
            ),
            optionalSkills = listOf(
                listOf(WeaponSkills.bronDwureczna, WeaponSkills.bronKawaleryjska),
                listOf(WeaponSkills.korbacze, WeaponSkills.bronParujaca),
                listOf(CommonSkills.rozbrajanie, CommonSkills.szybkieWyciagniecie)
            ),
        )

        val Oprawca = Profession(
            name = "Oprawca",
            ww = 15, us = 0, k = 20, odp = 10, zr = 10, int = 10, sw = 20, ogd = 15,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.zastraszanie,
                RareAbilities.leczenie,
                RareAbilities.torturowanie,
            ),
            skills = listOf(
                CommonSkills.grozny,
                CommonSkills.zapasy,
                WeaponSkills.korbacze,
            ),
        )

        val Pamflecista = Profession(
            name = "Pamflecista",
            ww = 5, us = 5, k = 5, odp = 10, zr = 15, int = 25, sw = 20, ogd = 20,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.plotkowanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.ukrywanieSie,
                RareAbilities.czytanieIPisanie,
                RareAbilities.gadanina,
                SpecialAbilities.wiedzaImperium
            ),
            skills = listOf(
                CommonSkills.ulicznik,
            ),
            optionalAbility = listOf(
                ScienceAbilities.All,
                listOf(SpecialAbilities.wiedzaBretonia, SpecialAbilities.wiedzaKislev, SpecialAbilities.wiedzaTilea),
                listOf(SpecialAbilities.kuglarstwoGawedziarstwo, SpecialAbilities.rzemiosloSztuka),
                listOf(SpecialAbilities.rzemiosloKaligrafia, SpecialAbilities.rzemiosloHandel)
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.talentArtystyczny, CommonSkills.przemawianie)
            )
        )

        val Paser = Profession(
            name = "Paser",
            ww = 15, us = 10, k = 10, odp = 5, zr = 10, int = 5, sw = 10, ogd = 10,
            a = 1, zyw = 4,
            abilities = listOf(
                CommonAbilities.hazard,
                CommonAbilities.plotkowanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.targowanie,
                CommonAbilities.wycena,
                CommonAbilities.zastraszanie,
                RareAbilities.zwinnePalce,
            ),
            skills = listOf(
                CommonSkills.geniuszArytmetyczny,
                CommonSkills.ogluszenie,
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.lotrzyk, CommonSkills.zylkaHandlowa)
            ),
        )

        val PielgrzymBitewny = Profession(
            name = "Pielgrzym bitewny",
            ww = 20, us = 10, k = 10, odp = 10, zr = 15, int = 10, sw = 10, ogd = 10,
            a = 1, zyw = 6,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.sztukaPrzetrwania,
                CommonAbilities.targowanie,
                CommonAbilities.zastraszanie,
                RareAbilities.unik,
                SpecialAbilities.wiedzaBretonia,
            ),
            skills = listOf(
                CommonSkills.chodu,
                CommonSkills.odpornoscPsychiczna,
                CommonSkills.odwaga,
                CommonSkills.ogluszenie,
                CommonSkills.przemawianie,
                StatsSkills.bardzoSilny,
                StatsSkills.niezwykleOdporny,
                StatsSkills.twardziel,
            ),
        )

        val Prawiedzma = Profession(
            name = "Prawiedźma",
            ww = 0, us = 0, k = 5, odp = 20, zr = 10, int = 40, sw = 30, ogd = 15,
            zyw = 6, mag = 3,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.opiekaNadZwierzetami,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.zastraszanie,
                RareAbilities.oswajanie,
                RareAbilities.wykrywanieMagii,
                SpecialAbilities.jezykUngolski,
                SpecialAbilities.wiedzaKislev,
                SpecialAbilities.wiedzaKrajTrolli,
            ),
            skills = listOf(
                CommonSkills.szostyZmysl,
                MagicSkills.magiaCzarownicTradycjaWiedzm
            ),
            optionalAbility = listOf(
                listOf(RareAbilities.leczenie, RareAbilities.warzenieTrucizn),
                SecretLanguageAbilities.All,
                listOf(SpecialAbilities.naukaDemonologia, SpecialAbilities.naukaDuchy),
                listOf(SpecialAbilities.naukaHistoria, SpecialAbilities.naukaNekromancja),
                listOf(SpecialAbilities.rzemiosloAptekarstwo, SpecialAbilities.rzemiosloZielarstwo),
                ScienceAbilities.All,
                KnowledgeAbilities.OldWorld,
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.bystryWzrok, CommonSkills.szczescie),
                listOf(CommonSkills.wedrowiec, CommonSkills.zmyslMagii),
                UniversalMagic.All, UniversalMagic.All, UniversalMagic.All
            ),
        )

        val Prelat = Profession(
            name = "Prelat",
            ww = 10, us = 10, k = 10, odp = 15, zr = 15, int = 20, sw = 30, ogd = 30,
            zyw = 6,
            abilities = listOf(
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.zastraszanie,
                RareAbilities.leczenie,
                RareAbilities.gadanina,
                SpecialAbilities.naukaTeologia,
                SpecialAbilities.jezykTajemnyMagiczny,
                SpecialAbilities.sekretnyjezykGildii,
                SpecialAbilities.kuglarstwoGawedziarstwo,
            ),
            skills = listOf(
                CommonSkills.krasomowstwo,
                CommonSkills.etykieta,
                CommonSkills.poliglota,
                CommonSkills.obiezyswiat,
                CommonSkills.intrygant,
                CommonSkills.odwaga,
                StatsSkills.opanowanie,
            ),
            optionalAbility = listOf(
                ScienceAbilities.All, ScienceAbilities.All,
                KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
                LanguageAbilities.All, LanguageAbilities.All,
                listOf(CommonAbilities.jezdziectwo, CommonAbilities.plywanie),
            ),
        )

        val Psalterzysta = Profession(
            name = "Psałterzysta",
            ww = 20, us = 10, k = 10, odp = 10, zr = 15, int = 10, sw = 10, ogd = 10,
            a = 1, zyw = 6,
            abilities = listOf(
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                RareAbilities.czytanieIPisanie,
                SpecialAbilities.kuglarstwoMuzykalnosc,
                SpecialAbilities.kuglarstwoSpiew,
                SpecialAbilities.naukaTeologia,
            ),
            skills = listOf(
                CommonSkills.zaspiew,
            ),
            optionalAbility = listOf(
                KnowledgeAbilities.OldWorld,
                LanguageAbilities.All, LanguageAbilities.All,
            ),
        )

        val Rajtar = Profession(
            name = "Rajtar",
            ww = 20, us = 20, k = 10, odp = 10, zr = 15, int = 0, sw = 15, ogd = 15,
            a = 1, zyw = 4,
            abilities = listOf(
                CommonAbilities.jezdziectwo,
                CommonAbilities.opiekaNadZwierzetami,
                CommonAbilities.spostrzegawczosc,
                RareAbilities.unik,
                SpecialAbilities.sekretneZnakiZwiadowcow,
            ),
            skills = listOf(
                CommonSkills.blyskawicznePrzadowanie,
                CommonSkills.silnyCios,
                CommonSkills.strzalMierzony,
                CommonSkills.strzalPrzebijajacy,
                CommonSkills.szybkieWyciagniecie,
                WeaponSkills.bronPalna,
            ),
            optionalAbility = listOf(
                listOf(CommonAbilities.plotkowanie, CommonAbilities.wycena)
            ),
        )

        val Reketer = Profession(
            name = "Reketer",
            ww = 20, us = 15, k = 15, odp = 10, zr = 10, int = 0, sw = 15, ogd = 10,
            a = 1, zyw = 5,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.plotkowanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.targowanie,
                CommonAbilities.wycena,
                CommonAbilities.zastraszanie,
                RareAbilities.sledzenie,
                RareAbilities.unik,
                SpecialAbilities.wiedzaImperium,
            ),
            skills = listOf(
                CommonSkills.bijatyka,
                CommonSkills.grozny,
                CommonSkills.lotrzyk,
                CommonSkills.ogluszenie,
                CommonSkills.silnyCios,
            ),
        )

        val Rozbojnik = Profession(
            name = "Rozbójnik",
            ww = 20, us = 20, k = 10, odp = 10, zr = 30, int = 20, sw = 15, ogd = 25,
            a = 1, zyw = 4,
            abilities = listOf(
                CommonAbilities.jezdziectwo,
                CommonAbilities.opiekaNadZwierzetami,
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.skradanieSie,
                CommonAbilities.wycena,
                RareAbilities.tresura,
                SpecialAbilities.wiedzaImperium,
            ),
            skills = listOf(
                CommonSkills.artylerzysta,
                CommonSkills.brawura,
                CommonSkills.etykieta,
                CommonSkills.oburecznosc,
                CommonSkills.strzalMierzony,
                CommonSkills.strzalPrecyzyjny,
                CommonSkills.woltyzerka,
                WeaponSkills.bronPalna,
                WeaponSkills.bronSzermiercza,
            ),
        )

        val Rycerz = Profession(
            name = "Rycerz",
            ww = 25, us = 0, k = 15, odp = 15, zr = 15, int = 5, sw = 15, ogd = 5,
            a = 1, zyw = 4,
            abilities = listOf(
                CommonAbilities.jezdziectwo,
                CommonAbilities.spostrzegawczosc,
                RareAbilities.unik,
                SpecialAbilities.naukaStrategiaTaktyka,
                SpecialAbilities.sekretnyjezykBitewny,
            ),
            skills = listOf(
                CommonSkills.silnyCios,
                WeaponSkills.bronDwureczna,
                WeaponSkills.bronKawaleryjska,
                WeaponSkills.korbacze,
            ),
            optionalAbility = listOf(
                listOf(SpecialAbilities.naukaGeneologiaHeraldyka, SpecialAbilities.naukaTeologia),
                LanguageAbilities.All, LanguageAbilities.All
            ),
        )

        val RycerzGraala = Profession(
            name = "Rycerz Graala",
            ww = 40, us = 0, k = 30, odp = 30, zr = 25, int = 10, sw = 25, ogd = 25,
            a = 2, zyw = 8,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.jezdziectwo,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                RareAbilities.unik,
                SpecialAbilities.naukaGeneologiaHeraldyka,
                SpecialAbilities.naukaStrategiaTaktyka,
                SpecialAbilities.naukaTeologia,
                SpecialAbilities.sekretnyjezykBitewny,
                SpecialAbilities.wiedzaBretonia,
            ),
            skills = listOf(
                CommonSkills.krzepki,
                CommonSkills.odpornoscNaChaos,
                CommonSkills.odwaga,
                CommonSkills.przemawianie,
                CommonSkills.silnyCios,
                CommonSkills.szczescie,
                CommonSkills.szostyZmysl,
                StatsSkills.bardzoSilny,
                StatsSkills.niezwykleOdporny,
                StatsSkills.urodzonyWojownik,
                WeaponSkills.bronDwureczna,
            ),
            optionalSkills = listOf(
                Blessing.All,
                listOf(CommonSkills.morderczyAtak, CommonSkills.mierzonyCios)
            ),
        )

        val RycerzKrolestwa = Profession(
            name = "Rycerz Królestwa",
            ww = 25, us = 0, k = 15, odp = 15, zr = 15, int = 0, sw = 10, ogd = 15,
            a = 1, zyw = 4,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.jezdziectwo,
                CommonAbilities.spostrzegawczosc,
                RareAbilities.unik,
                SpecialAbilities.naukaStrategiaTaktyka,
                SpecialAbilities.sekretnyjezykBitewny,
            ),
            skills = listOf(
                CommonSkills.silnyCios,
                WeaponSkills.bronDwureczna,
                WeaponSkills.bronKawaleryjska,
            ),
            optionalAbility = listOf(
                listOf(SpecialAbilities.naukaGeneologiaHeraldyka, SpecialAbilities.naukaTeologia),
                LanguageAbilities.All, LanguageAbilities.All
            ),
            optionalSkills = listOf(
                Virtue.All
            ),
        )

        val RycerzKruka = Profession(
            name = "Rycerz Kruka",
            ww = 35, us = 15, k = 20, odp = 20, zr = 20, int = 15, sw = 30, ogd = 10,
            a = 2, zyw = 8,
            abilities = listOf(
                CommonAbilities.jezdziectwo,
                CommonAbilities.spostrzegawczosc,
                RareAbilities.czytanieIPisanie,
                RareAbilities.tresura,
                RareAbilities.tropienie,
                RareAbilities.unik,
                SpecialAbilities.naukaHistoria,
                SpecialAbilities.naukaNekromancja,
                SpecialAbilities.naukaStrategiaTaktyka,
                SpecialAbilities.naukaTeologia,
                SpecialAbilities.sekretnyjezykBitewny,
            ),
            skills = listOf(
                CommonSkills.blyskawicznePrzadowanie,
                CommonSkills.blyskawicznyBlok,
                CommonSkills.morderczyAtak,
                CommonSkills.obiezyswiat,
                CommonSkills.odpornoscPsychiczna,
                CommonSkills.odwaga,
                StatsSkills.strzelecWyborowy,
            ),
            optionalAbility = listOf(
                KnowledgeAbilities.OldWorld,
                listOf(SpecialAbilities.jezykBretonski, SpecialAbilities.jezykKislevski)
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.artylerzysta, CommonSkills.szybkieWyciagniecie),
                listOf(WeaponSkills.dlugieLuki, WeaponSkills.kusze),
                listOf(WeaponSkills.bronDwureczna, WeaponSkills.bronParujaca),
                listOf(CommonSkills.mierzonyCios, CommonSkills.strzalMierzony),
                listOf(StatsSkills.opanowanie, CommonSkills.szostyZmysl)
            ),
        )

        val RycerzPantery = Profession(
            name = "Rycerz Pantery",
            ww = 30, us = 0, k = 15, odp = 15, zr = 15, int = 10, sw = 10, ogd = 15,
            a = 1, zyw = 6,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.jezdziectwo,
                CommonAbilities.spostrzegawczosc,
                RareAbilities.tresura,
                RareAbilities.unik,
                SpecialAbilities.naukaGeneologiaHeraldyka,
                SpecialAbilities.naukaStrategiaTaktyka,
                SpecialAbilities.sekretnyjezykBitewny,
                SpecialAbilities.wiedzaImperium,
            ),
            skills = listOf(
                CommonSkills.etykieta,
                CommonSkills.krzepki,
                CommonSkills.zylkaHandlowa,
                StatsSkills.opanowanie,
                StatsSkills.urodzonyWojownik,
                WeaponSkills.bronKawaleryjska,
            ),
            optionalAbility = listOf(
                LanguageAbilities.All, LanguageAbilities.All
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.morderczyAtak, CommonSkills.mierzonyCios),
                SpecialWeapon.Common
            ),
        )

        val RycerzPlonacegoSlonca = Profession(
            name = "Rycerz Płonącego Słońca (Myrmidia)",
            ww = 25, us = 0, k = 10, odp = 20, zr = 20, int = 10, sw = 15, ogd = 10,
            a = 1, zyw = 5,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.jezdziectwo,
                CommonAbilities.spostrzegawczosc,
                RareAbilities.czytanieIPisanie,
                RareAbilities.unik,
                SpecialAbilities.naukaHistoria,
                SpecialAbilities.naukaStrategiaTaktyka,
                SpecialAbilities.naukaTeologia,
                SpecialAbilities.sekretnyjezykBitewny,
                SpecialAbilities.sekretneZnakiRycerzyZakonnych,
            ),
            skills = listOf(
                CommonSkills.etykieta,
                CommonSkills.obiezyswiat,
                CommonSkills.odwaga,
                CommonSkills.rozbrajanie,
                WeaponSkills.bronKawaleryjska,
                WeaponSkills.bronParujaca,
                WeaponSkills.bronSzermiercza,
            ),
            optionalAbility = listOf(
                listOf(SpecialAbilities.wiedzaEstalia, SpecialAbilities.wiedzaTilea),
                listOf(SpecialAbilities.jezykEstalijski, SpecialAbilities.jezykTileanski)
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.morderczyAtak, CommonSkills.mierzonyCios)
            ),
        )

        val RycerzProby = Profession(
            name = "Rycerz Próby",
            ww = 35, us = 0, k = 20, odp = 20, zr = 25, int = 10, sw = 25, ogd = 25,
            a = 2, zyw = 6,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.jezdziectwo,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.sztukaPrzetrwania,
                RareAbilities.unik,
                SpecialAbilities.naukaGeneologiaHeraldyka,
                SpecialAbilities.naukaStrategiaTaktyka,
                SpecialAbilities.naukaTeologia,
                SpecialAbilities.sekretnyjezykBitewny,
            ),
            skills = listOf(
                CommonSkills.krzepki,
                CommonSkills.obiezyswiat,
                CommonSkills.silnyCios,
                CommonSkills.szczescie,
                StatsSkills.bardzoSilny,
                StatsSkills.niezwykleOdporny,
                StatsSkills.urodzonyWojownik,
                KnightSkills.cnotaWyprawyRycerskiej,
                WeaponSkills.bronDwureczna,
            ),
            optionalAbility = listOf(
                KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
                LanguageAbilities.All, LanguageAbilities.All
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.morderczyAtak, CommonSkills.morderczyAtak),
            ),
        )

        val RycerzZielonegoPola = Profession(
            name = "Rycerz Zielonego Pola",
            ww = 20, us = 20, k = 15, odp = 15, zr = 10, int = 5, sw = 10, ogd = 5,
            a = 1, zyw = 4,
            abilities = listOf(
                CommonAbilities.jezdziectwo,
                CommonAbilities.przeszukiwanie,
                CommonAbilities.spostrzegawczosc,
                RareAbilities.oswajanie,
                RareAbilities.tropienie,
                RareAbilities.unik,
                SpecialAbilities.naukaStrategiaTaktyka,
            ),
            skills = listOf(
                CommonSkills.wyczucieKierunku,
                CommonSkills.wedrowiec,
                WeaponSkills.dlugieLuki,
            ),
            optionalAbility = listOf(
                listOf(CommonAbilities.dowodzenie, CommonAbilities.zastraszanie),
                listOf(CommonAbilities.sztukaPrzetrwania, CommonAbilities.wspinaczka),
                listOf(
                    SpecialAbilities.sekretneZnakiStraznikowLasu,
                    SpecialAbilities.sekretnyjezykStraznikowLasu
                )
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.wyostrzoneZmysly, StatsSkills.bardzoSzybki),
                listOf(
                    CommonSkills.morderczyAtak,
                    CommonSkills.mierzonyCios,
                    CommonSkills.strzalPrecyzyjny
                )
            ),
        )

        val Sierzant = Profession(
            name = "Sierżant",
            ww = 20, us = 15, k = 10, odp = 10, zr = 10, int = 10, sw = 10, ogd = 20,
            a = 1, zyw = 4,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.plotkowanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.zastraszanie,
                RareAbilities.unik,
                SpecialAbilities.naukaStrategiaTaktyka,
                SpecialAbilities.sekretnyjezykBitewny,
                SpecialAbilities.jezykTileanski,
            ),
            skills = listOf(
                CommonSkills.ogluszenie,
                CommonSkills.silnyCios,
            ),
            optionalAbility = listOf(
                listOf(CommonAbilities.jezdziectwo, CommonAbilities.plywanie),
                KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.grozny, CommonSkills.obiezyswiat),
                listOf(CommonSkills.bijatyka, CommonSkills.zapasy)
            ),
        )

        val Skrytobojca = Profession(
            name = "Skrytobójca",
            ww = 25, us = 25, k = 10, odp = 10, zr = 30, int = 20, sw = 10, ogd = 20,
            a = 2, zyw = 4,
            abilities = listOf(
                CommonAbilities.charakteryzacja,
                CommonAbilities.plotkowanie,
                CommonAbilities.skradanieSie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.ukrywanieSie,
                CommonAbilities.wspinaczka,
                RareAbilities.sledzenie,
                RareAbilities.warzenieTrucizn,
                SpecialAbilities.sekretneZnakiZlodziei,
            ),
            skills = listOf(
                CommonSkills.bijatyka,
                CommonSkills.blyskawicznyBlok,
                CommonSkills.brawura,
                CommonSkills.lotrzyk,
                CommonSkills.strzalMierzony,
                CommonSkills.szybkieWyciagniecie,
                WeaponSkills.bronParujaca,
                WeaponSkills.bronRzucana,
                WeaponSkills.bronUnieruchamiajaca,
            ),
        )

        val StarszyWioskowy = Profession(
            name = "Starszy wioskowy",
            ww = 0, us = 0, k = 0, odp = 0, zr = 0, int = 20, sw = 20, ogd = 30,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.targowanie,
                CommonAbilities.wycena,
                CommonAbilities.zastraszanie,
                RareAbilities.torturowanie,
                SpecialAbilities.wiedzaBretonia,
            ),
            skills = listOf(
                CommonSkills.grozny,
                CommonSkills.krasomowstwo,
                CommonSkills.przemawianie,
                StatsSkills.charyzmatyczny,
            ),
        )

        val StrozPrawa = Profession(
            name = "Stróż prawa",
            ww = 20, us = 20, k = 10, odp = 10, zr = 10, int = 20, sw = 10, ogd = 5,
            a = 1, zyw = 4,
            abilities = listOf(
                CommonAbilities.charakteryzacja,
                CommonAbilities.dowodzenie,
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.przeszukiwanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.ukrywanieSie,
                CommonAbilities.zastraszanie,
                RareAbilities.sledzenie,
                RareAbilities.torturowanie,
                RareAbilities.tropienie,
                SpecialAbilities.wiedzaKsiestwaGraniczne,
            ),
            skills = listOf(
                CommonSkills.bijatyka,
                CommonSkills.grozny,
                CommonSkills.intrygant,
                CommonSkills.szybkieWyciagniecie,
                WeaponSkills.bronUnieruchamiajaca,
            ),
        )

        val Strzelec = Profession(
            name = "Strzelec",
            ww = 0, us = 35, k = 10, odp = 10, zr = 25, int = 10, sw = 20, ogd = 15,
            a = 1, zyw = 4,
            abilities = listOf(
                CommonAbilities.plotkowanie,
                CommonAbilities.przeszukiwanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.sztukaPrzetrwania,
                RareAbilities.zwinnePalce,
                SpecialAbilities.wiedzaImperium,
            ),
            skills = listOf(
                CommonSkills.blyskawicznePrzadowanie,
                CommonSkills.strzalMierzony,
                CommonSkills.strzalPrecyzyjny,
                CommonSkills.strzalPrzebijajacy,
                WeaponSkills.dlugieLuki,
            ),
            optionalSkills = listOf(
                listOf(WeaponSkills.kusze, WeaponSkills.bronRzucana)
            ),
        )

        val Szampierz = Profession(
            name = "Szampierz",
            ww = 35, us = 0, k = 15, odp = 15, zr = 20, int = 10, sw = 15, ogd = 0,
            a = 2, zyw = 6,
            abilities = listOf(
                CommonAbilities.spostrzegawczosc,
                RareAbilities.unik,
            ),
            skills = listOf(
                CommonSkills.blyskawicznyBlok,
                WeaponSkills.bronDwureczna,
                WeaponSkills.korbacze,
                WeaponSkills.bronParujaca,
                WeaponSkills.bronSzermiercza,
            ),
        )

        val Szarlatan = Profession(
            name = "Szarlatan",
            ww = 10, us = 10, k = 5, odp = 10, zr = 15, int = 15, sw = 15, ogd = 25,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.charakteryzacja,
                CommonAbilities.hazard,
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.targowanie,
                CommonAbilities.wycena,
                RareAbilities.gadanina,
                RareAbilities.zwinnePalce,
                SpecialAbilities.sekretnyjezykZlodziei,
                SpecialAbilities.jezykReikspiel,
            ),
            skills = listOf(
                CommonSkills.chodu,
                CommonSkills.nasladowca,
                CommonSkills.obiezyswiat,
                CommonSkills.przemawianie,
            ),
            optionalAbility = listOf(
                listOf(SpecialAbilities.wiedzaBretonia, SpecialAbilities.wiedzaTilea),
                listOf(SpecialAbilities.jezykBretonski, SpecialAbilities.jezykTileanski)
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.intrygant, CommonSkills.lotrzyk),
            ),
        )

        val Szpieg = Profession(
            name = "Szpieg",
            ww = 15, us = 15, k = 5, odp = 10, zr = 20, int = 20, sw = 35, ogd = 20,
            a = 1, zyw = 4,
            abilities = listOf(
                CommonAbilities.charakteryzacja,
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.skradanieSie,
                CommonAbilities.ukrywanieSie,
                RareAbilities.czytanieZWarg,
                RareAbilities.otwieranieZamkow,
                RareAbilities.sledzenie,
                RareAbilities.zwinnePalce,
                SpecialAbilities.kuglarstwoAktorstwo,
            ),
            skills = listOf(
                CommonSkills.chodu,
                CommonSkills.intrygant,
                CommonSkills.poliglota,
            ),
            optionalAbility = listOf(
                listOf(
                    SpecialAbilities.sekretnyjezykBitewny,
                    SpecialAbilities.sekretnyjezykGildii,
                    SpecialAbilities.sekretnyjezykLowcow,
                    SpecialAbilities.sekretnyjezykZlodziei
                ),
                KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
                LanguageAbilities.All, LanguageAbilities.All, LanguageAbilities.All
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.szostyZmysl, StatsSkills.charyzmatyczny)
            ),
        )

        val SledczyVereny = Profession(
            name = "Śledczy Vereny",
            ww = 10, us = 10, k = 10, odp = 10, zr = 20, int = 30, sw = 20, ogd = 20,
            a = 1, zyw = 5,
            abilities = listOf(
                CommonAbilities.charakteryzacja,
                CommonAbilities.plotkowanie,
                CommonAbilities.przeszukiwanie,
                CommonAbilities.skradanieSie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.ukrywanieSie,
                RareAbilities.czytanieIPisanie,
                RareAbilities.otwieranieZamkow,
                RareAbilities.sledzenie,
                RareAbilities.tropienie,
                RareAbilities.zwinnePalce,
                SpecialAbilities.sekretneZnakiAstrologow,
                SpecialAbilities.naukaPrawo,
                SpecialAbilities.wiedzaImperium,
                SpecialAbilities.jezykKlasyczny,
                SpecialAbilities.jezykReikspiel,
            ),
            skills = listOf(
                CommonSkills.lotrzyk,
            ),
            optionalAbility = listOf(
                listOf(
                    SpecialAbilities.sekretneZnakiLowcow,
                    SpecialAbilities.sekretneZnakiRycerzyZakonnych,
                    SpecialAbilities.sekretneZnakiZlodziei,
                    SpecialAbilities.sekretneZnakiZwiadowcow
                ),
                ScienceAbilities.All, ScienceAbilities.All,
                KnowledgeAbilities.OldWorld,
                LanguageAbilities.All,
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.bijatyka, CommonSkills.odpornoscPsychiczna),
                listOf(CommonSkills.wyostrzoneZmysly, StatsSkills.blyskotliwosc),
                listOf(CommonSkills.ulicznik, StatsSkills.opanowanie)
            ),
        )

        val TreserZwierzat = Profession(
            name = "Treser zwierząt",
            ww = 10, us = 10, k = 10, odp = 10, zr = 15, int = 10, sw = 10, ogd = 15,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.jezdziectwo,
                CommonAbilities.opiekaNadZwierzetami,
                CommonAbilities.spostrzegawczosc,
                RareAbilities.oswajanie,
                RareAbilities.tresura,
            ),
            skills = listOf(
                CommonSkills.ogluszenie,
                WeaponSkills.bronUnieruchamiajaca,
            ),
            optionalAbility = listOf(
                KnowledgeAbilities.OldWorld,
                LanguageAbilities.All,
                listOf(CommonAbilities.plywanie, CommonAbilities.powozenie),
                CraftAbilities.Animal,
                CraftAbilities.Animal,
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.etykieta, CommonSkills.zapasy)
            ),
        )

        val Tropiciel = Profession(
            name = "Tropiciel",
            ww = 20, us = 20, k = 10, odp = 20, zr = 25, int = 20, sw = 20, ogd = 5,
            zyw = 7,
            abilities = listOf(
                CommonAbilities.plywanie,
                CommonAbilities.skradanieSie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.sztukaPrzetrwania,
                CommonAbilities.ukrywanieSie,
                RareAbilities.nawigacja,
                RareAbilities.tropienie,
                RareAbilities.unik,
                RareAbilities.zastawianiePulapek,
                SpecialAbilities.sekretneZnakiZwiadowcow,
                SpecialAbilities.sekretnyjezykLowcow,
                SpecialAbilities.wiedzaKsiestwaGraniczne,
            ),
            skills = listOf(
                CommonSkills.chodu,
                CommonSkills.szostyZmysl,
                CommonSkills.wedrowiec,
                CommonSkills.wyczucieKierunku,
                StatsSkills.niezwykleOdporny,
            ),
        )

        val Uczony = Profession(
            name = "Uczony",
            ww = 5, us = 5, k = 5, odp = 5, zr = 10, int = 30, sw = 15, ogd = 15,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.wycena,
                RareAbilities.czytanieIPisanie,
                SpecialAbilities.rzemiosloKartografia,
            ),
            skills = listOf(
                CommonSkills.poliglota,
            ),
            optionalAbility = listOf(
                ScienceAbilities.All,
                ScienceAbilities.All,
                ScienceAbilities.All,
                KnowledgeAbilities.OldWorld,
                KnowledgeAbilities.OldWorld,
                KnowledgeAbilities.OldWorld,
                LanguageAbilities.All,
                LanguageAbilities.All,
                LanguageAbilities.All
            ),
        )

        val Urzednik = Profession(
            name = "Urzędnik",
            ww = 5, us = 5, k = 5, odp = 10, zr = 0, int = 20, sw = 10, ogd = 20,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.targowanie,
                CommonAbilities.wycena,
                RareAbilities.czytanieIPisanie,
                RareAbilities.gadanina,
                SpecialAbilities.kuglarstwoAktorstwo,
                SpecialAbilities.naukaPrawo,
                SpecialAbilities.wiedzaImperium,
                SpecialAbilities.jezykReikspiel,
            ),
            skills = listOf(
                CommonSkills.krasomowstwo,
                CommonSkills.przemawianie,
            ),
            optionalAbility = listOf(
                listOf(SpecialAbilities.naukaGeneologiaHeraldyka, SpecialAbilities.naukaHistoria)
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.etykieta, CommonSkills.lotrzyk),
                listOf(CommonSkills.intrygant, CommonSkills.zylkaHandlowa)
            ),
        )

        val Vitki = Profession(
            name = "Vitki",
            ww = 15, us = 10, k = 10, odp = 10, zr = 10, int = 15, sw = 25, ogd = 20,
            a = 1, zyw = 5, mag = 2,
            abilities = listOf(
                CommonAbilities.opiekaNadZwierzetami,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.sztukaPrzetrwania,
                CommonAbilities.zastraszanie,
                RareAbilities.hipnoza,
                RareAbilities.splatanieMagii,
                RareAbilities.wykrywanieMagii,
                SpecialAbilities.kuglarstwoGawedziarstwo,
            ),
            skills = listOf(
                CommonSkills.niepokojacy,
                CommonSkills.nieustraszony,
                CommonSkills.silnyCios,
                WeaponSkills.bronDwureczna,
            ),
            optionalSkills = listOf(
                listOf(StatsSkills.bardzoSilny, StatsSkills.niezwykleOdporny),
                listOf(CommonSkills.morderczyAtak, CommonSkills.mierzonyCios)
            ),
        )

        val Weteran = Profession(
            name = "Weteran",
            ww = 20, us = 20, k = 10, odp = 10, zr = 15, int = 0, sw = 15, ogd = 0,
            a = 1, zyw = 6,
            abilities = listOf(
                CommonAbilities.hazard,
                CommonAbilities.mocnaGlowa,
                CommonAbilities.plotkowanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.zastraszanie,
                RareAbilities.unik,
                SpecialAbilities.sekretnyjezykBitewny,
                SpecialAbilities.wiedzaImperium,
            ),
            skills = listOf(
            ),
            optionalSkills = listOf(
                listOf(
                    CommonSkills.blyskawicznePrzadowanie,
                    CommonSkills.morderczyAtak,
                    CommonSkills.mierzonyCios
                ),
                SpecialWeapon.Common, SpecialWeapon.Common,
                listOf(StatsSkills.bardzoSilny, StatsSkills.niezwykleOdporny),
                listOf(CommonSkills.strzalPrecyzyjny, CommonSkills.silnyCios)
            ),
        )

        val WedrownyCzarodziej = Profession(
            name = "Wędrowny czarodziej",
            ww = 5, us = 5, k = 0, odp = 5, zr = 10, int = 20, sw = 25, ogd = 10,
            zyw = 3, mag = 2,
            abilities = listOf(
                CommonAbilities.plotkowanie,
                RareAbilities.czytanieIPisanie,
                RareAbilities.splatanieMagii,
                RareAbilities.wykrywanieMagii,
                SpecialAbilities.jezykTajemnyMagiczny,
                SpecialAbilities.naukaMagia,
            ),
            skills = listOf(
            ),
            optionalAbility = listOf(
                listOf(CommonAbilities.jezdziectwo, CommonAbilities.plywanie),
                ScienceAbilities.All,
                listOf(CommonAbilities.przekonywanie, CommonAbilities.zastraszanie),
                KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
                LanguageAbilities.All, LanguageAbilities.All,
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.dotykMocy, StatsSkills.niezwykleOdporny),
                TraditionsOfMagic.All + listOf(
                    MagicSkills.magiaCzarnoksieskaChaos,
                    MagicSkills.magiaCzarnoksieskaNekromacja,
                    MagicSkills.magiaCzarnoksieskaNurgl,
                    MagicSkills.magiaCzarnoksieskaSlaanesh,
                    MagicSkills.magiaCzarnoksieskaTzeentch
                ),
                UniversalMagic.All, UniversalMagic.All,
                listOf(CommonSkills.medytacja, CommonSkills.morderczyPocisk),
                listOf(CommonSkills.czarnoksiestwo, CommonSkills.zmyslMagii)
            ),
        )

        val Wiedzma = Profession(
            name = "Wiedźma",
            ww = 0, us = 0, k = 5, odp = 10, zr = 5, int = 25, sw = 20, ogd = 10,
            zyw = 4, mag = 1,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.zastraszanie,
                RareAbilities.leczenie,
                RareAbilities.wykrywanieMagii,
                SpecialAbilities.jezykTajemnyMagiczny,
                SpecialAbilities.jezykUngolski,
            ),
            skills = listOf(
                CommonSkills.dotykMocy,
                CommonSkills.medytacja,
                MagicSkills.magiaProstaWiedzm,
            ),
            optionalAbility = listOf(
                listOf(CommonAbilities.mocnaGlowa, CommonAbilities.spostrzegawczosc),
                listOf(SpecialAbilities.naukaDuchy, SpecialAbilities.naukaHistoria),
                listOf(
                    SpecialAbilities.rzemiosloAptekarstwo,
                    SpecialAbilities.rzemiosloZielarstwo,
                    RareAbilities.warzenieTrucizn
                ),
                listOf(SpecialAbilities.wiedzaKislev, SpecialAbilities.wiedzaKrajTrolli),
            ),
            optionalSkills = listOf(
                UniversalMagic.All, UniversalMagic.All, UniversalMagic.All,
                listOf(CommonSkills.odpornoscPsychiczna, StatsSkills.twardziel)
            ),
        )

        val Wlamywacz = Profession(
            name = "Włamywacz",
            ww = 10, us = 10, k = 5, odp = 5, zr = 25, int = 10, sw = 10, ogd = 0,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.plotkowanie,
                CommonAbilities.przeszukiwanie,
                CommonAbilities.skradanieSie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.targowanie,
                CommonAbilities.ukrywanieSie,
                CommonAbilities.wspinaczka,
                CommonAbilities.wycena,
                RareAbilities.otwieranieZamkow,
                SpecialAbilities.sekretneZnakiZlodziei,
                SpecialAbilities.sekretnyjezykZlodziei,
            ),
            skills = listOf(
                CommonSkills.bijatyka,
                CommonSkills.lotrzyk,
                CommonSkills.ulicznik,
                CommonSkills.wykrywaniePulapek,
            ),
        )

        val Wodz = Profession(
            name = "Wódz",
            ww = 20, us = 0, k = 20, odp = 20, zr = 10, int = 5, sw = 10, ogd = 10,
            a = 2, zyw = 5,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.mocnaGlowa,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.zastraszanie,
                RareAbilities.unik,
            ),
            skills = listOf(
                CommonSkills.niepokojacy,
                CommonSkills.nieustraszony,
                CommonSkills.silnyCios,

                WeaponSkills.bronDwureczna,
            ),
            optionalSkills = listOf(
                listOf(StatsSkills.bardzoSilny, StatsSkills.niezwykleOdporny),
                listOf(CommonSkills.morderczyAtak, CommonSkills.mierzonyCios)
            ),
        )

        val WtajemniczonyKultuKhorna = Profession(
            name = "Wtajemniczony kultu Khorna",
            ww = 40, us = 5, k = 20, odp = 30, zr = 10, int = 0, sw = 15, ogd = 5,
            a = 2, zyw = 7,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.zastraszanie,
                RareAbilities.unik,
            ),
            skills = listOf(
                CommonSkills.niepokojacy,
                CommonSkills.odpornoscNaMagie,
                CommonSkills.szalBojowy,
                CommonSkills.szybkieWyciagniecie,
                StatsSkills.bardzoSilny,
                StatsSkills.niezwykleOdporny,
                StatsSkills.urodzonyWojownik,
            ),
            optionalSkills = listOf(
                listOf(WeaponSkills.bronDwureczna, WeaponSkills.korbacze)
            ),
        )

        val WtajemniczonyKultuNurgla = Profession(
            name = "Wtajemniczony kultu Nurgla",
            ww = 15, us = 5, k = 5, odp = 30, zr = 10, int = 5, sw = 20, ogd = 15,
            a = 1, zyw = 5, mag = 2,
            abilities = listOf(
                CommonAbilities.dowodzenie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.zastraszanie,
                RareAbilities.czytanieIPisanie,
                RareAbilities.splatanieMagii,
                RareAbilities.warzenieTrucizn,
                RareAbilities.wykrywanieMagii,
                SpecialAbilities.naukaDemonologia,
            ),
            skills = listOf(
                CommonSkills.medytacja,
                CommonSkills.morderczyPocisk,
                CommonSkills.straszny,
                CommonSkills.zmyslMagii,
                MagicSkills.magiaCzarnoksieskaNurgl,
                StatsSkills.opanowanie,
            ),
            optionalAbility = listOf(
                SecretLanguageAbilities.Common, SecretLanguageAbilities.Common,
                ScienceAbilities.All,
                KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.morderczyAtak, CommonSkills.mierzonyCios),
                UniversalMagic.All, UniversalMagic.All
            ),
        )

        val WtajemniczonyKultuSlaanesha = Profession(
            name = "Wtajemniczony kultu Slaanesha",
            ww = 10, us = 10, k = 5, odp = 5, zr = 20, int = 30, sw = 0, ogd = 40,
            a = 1, zyw = 5, mag = 2,
            abilities = listOf(
                CommonAbilities.charakteryzacja,
                CommonAbilities.mocnaGlowa,
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.wycena,
                CommonAbilities.zastraszanie,
                RareAbilities.czytanieIPisanie,
                RareAbilities.splatanieMagii,
                RareAbilities.wykrywanieMagii,
                SpecialAbilities.naukaDemonologia
            ),
            skills = listOf(
                CommonSkills.grozny,
                CommonSkills.nieustraszony,
                CommonSkills.odpornoscNaTrucizny,
                MagicSkills.magiaCzarnoksieskaSlaanesh,
                StatsSkills.blyskotliwosc,
                StatsSkills.szybkiRefleks,
            ),
            optionalAbility = listOf(
                SecretLanguageAbilities.Common, SecretLanguageAbilities.Common,
                SleightOfHandAbilities.All, SleightOfHandAbilities.All,
                ScienceAbilities.All, ScienceAbilities.All,
                LanguageAbilities.All, LanguageAbilities.All, LanguageAbilities.All
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.intrygant, CommonSkills.ogluszenie),
                listOf(CommonSkills.zmyslMagii, CommonSkills.zylkaHandlowa),
                UniversalMagic.All, UniversalMagic.All
            ),
        )

        val WtajemniczonyKultuTzeentcha = Profession(
            name = "Wtajemniczony kultu Tzeentcha",
            ww = 10, us = 10, k = 5, odp = 5, zr = 10, int = 40, sw = 20, ogd = 30,
            a = 1, zyw = 5, mag = 2,
            abilities = listOf(
                CommonAbilities.charakteryzacja,
                CommonAbilities.dowodzenie,
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.wycena,
                CommonAbilities.zastraszanie,
                RareAbilities.czytanieIPisanie,
                RareAbilities.gadanina,
                RareAbilities.splatanieMagii,
                RareAbilities.wykrywanieMagii,
            ),
            skills = listOf(
                CommonSkills.grozny,
                CommonSkills.krasomowstwo,
                CommonSkills.medytacja,
                CommonSkills.morderczyPocisk,
                CommonSkills.odwaga,
                MagicSkills.magiaCzarnoksieskaTzeentch,
            ),
            optionalAbility = listOf(
                SecretLanguageAbilities.Common,
                SecretLanguageAbilities.Common,
                ScienceAbilities.All,
                ScienceAbilities.All,
                ScienceAbilities.All,
                KnowledgeAbilities.OldWorld,
                KnowledgeAbilities.OldWorld,
                KnowledgeAbilities.OldWorld,
                KnowledgeAbilities.OldWorld,
                LanguageAbilities.All,
                LanguageAbilities.All,
                LanguageAbilities.All
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.zmyslMagii, CommonSkills.zylkaHandlowa),
                UniversalMagic.All, UniversalMagic.All
            ),
        )

        val WybraniecBozy = Profession(
            name = "Wybraniec Boży",
            ww = 15, us = 15, k = 10, odp = 10, zr = 10, int = 15, sw = 25, ogd = 20,
            a = 1, zyw = 5, mag = 2,
            abilities = listOf(
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                RareAbilities.leczenie,
                RareAbilities.splatanieMagii,
                RareAbilities.wykrywanieMagii,
                SpecialAbilities.jezykTajemnyMagiczny,
                SpecialAbilities.naukaTeologia,
            ),
            skills = listOf(
            ),
            optionalAbility = listOf(
                listOf(CommonAbilities.jezdziectwo, CommonAbilities.plywanie),
                ScienceAbilities.All, ScienceAbilities.All,
                KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
                LanguageAbilities.All, LanguageAbilities.All,
            ),
            optionalSkills = listOf(
                PriestlyMagic.All,
                UniversalMagic.All, UniversalMagic.All,
                listOf(CommonSkills.obiezyswiat, CommonSkills.silnyCios),
                listOf(CommonSkills.dotykMocy, CommonSkills.pancerzWiary),
                listOf(CommonSkills.medytacja, CommonSkills.zmyslMagii)
            ),
        )

        val ZabojcaDemonow = Profession(
            name = "Zabójca demonów",
            ww = 40, us = 0, k = 30, odp = 30, zr = 20, int = 0, sw = 30, ogd = 0,
            a = 2, zyw = 8,
            abilities = listOf(
                CommonAbilities.mocnaGlowa,
                CommonAbilities.wspinaczka,
                CommonAbilities.zastraszanie,
                RareAbilities.unik,
            ),
            skills = listOf(
                CommonSkills.blyskawicznyBlok,
                CommonSkills.niepokojacy,
            ),
            optionalAbility = listOf(
                KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld
            ),
        )

        val ZabojcaNieumarlych = Profession(
            name = "Zabójca nieumarłych",
            ww = 35, us = 35, k = 15, odp = 20, zr = 20, int = 15, sw = 30, ogd = 5,
            a = 2, zyw = 6,
            abilities = listOf(
                CommonAbilities.skradanieSie,
                CommonAbilities.sztukaPrzetrwania,
                CommonAbilities.ukrywanieSie,
                CommonAbilities.zastraszanie,
                RareAbilities.sledzenie,
                RareAbilities.torturowanie,
                RareAbilities.tropienie,
                SpecialAbilities.naukaNekromancja,
            ),
            skills = listOf(
                CommonSkills.grozny,
                CommonSkills.mierzonyCios,
                CommonSkills.morderczyAtak,
                CommonSkills.niepokojacy,
                CommonSkills.nieustraszony,
                CommonSkills.odwaga,
                CommonSkills.silnyCios,
                CommonSkills.szalBojowy,
                CommonSkills.szostyZmysl,
                StatsSkills.szybkiRefleks,
                WeaponSkills.bronDwureczna,
            ),
            optionalSkills = listOf(
                listOf(StatsSkills.bardzoSilny, StatsSkills.niezwykleOdporny),
                listOf(CommonSkills.blyskawicznePrzadowanie, CommonSkills.strzalPrecyzyjny),
                listOf(WeaponSkills.kusze, WeaponSkills.bronRzucana),
                listOf(CommonSkills.ulicznik, CommonSkills.wedrowiec)
            ),
        )

        val ZabojcaOlbrzymow = Profession(
            name = "Zabójca olbrzymów",
            ww = 25, us = 0, k = 15, odp = 15, zr = 10, int = 0, sw = 20, ogd = 0,
            a = 1, zyw = 6,
            abilities = listOf(
                CommonAbilities.mocnaGlowa,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.zastraszanie,
                RareAbilities.unik,
            ),
            skills = listOf(
                CommonSkills.morderczyAtak,
                CommonSkills.nieustraszony,
                CommonSkills.odpornoscNaTrucizny,
                WeaponSkills.korbacze,
            ),
            optionalAbility = listOf(
                KnowledgeAbilities.OldWorld
            ),
        )

        val ZakapturzonyBrat = Profession(
            name = "Zakapturzony Brat",
            ww = 25, us = 10, k = 15, odp = 15, zr = 25, int = 30, sw = 25, ogd = 30,
            a = 1, zyw = 6,
            abilities = listOf(
                CommonAbilities.charakteryzacja,
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.przeszukiwanie,
                CommonAbilities.skradanieSie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.ukrywanieSie,
                RareAbilities.czytanieIPisanie,
            ),
            skills = listOf(
                CommonSkills.czulySluch,
                CommonSkills.intrygant,
                CommonSkills.lotrzyk,
                CommonSkills.ulicznik,
                StatsSkills.opanowanie,
            ),
            optionalAbility = listOf(
                SignsAndLanguagesAbilities.Signs,
                SignsAndLanguagesAbilities.Signs,
                SignsAndLanguagesAbilities.Lang,
                SignsAndLanguagesAbilities.Lang,
                CraftAbilities.All,
                KnowledgeAbilities.OldWorld,
                KnowledgeAbilities.OldWorld,
                KnowledgeAbilities.OldWorld,
                LanguageAbilities.All,
                LanguageAbilities.All,
                LanguageAbilities.All,
                LanguageAbilities.All,
            ),
            optionalSkills = listOf(
                listOf(StatsSkills.blyskotliwosc, StatsSkills.charyzmatyczny),
                listOf(CommonSkills.nasladowca, CommonSkills.poliglota)
            ),
        )

        val Zakonnik = Profession(
            name = "Zakonnik",
            ww = 10, us = 0, k = 5, odp = 10, zr = 0, int = 15, sw = 15, ogd = 15,
            zyw = 4,
            abilities = listOf(
                CommonAbilities.opiekaNadZwierzetami,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.sztukaPrzetrwania,
                RareAbilities.leczenie,
                SpecialAbilities.naukaTeologia,
                SpecialAbilities.jezykKlasyczny,
                SpecialAbilities.jezykReikspiel,
            ),
            skills = listOf(
                CommonSkills.obiezyswiat,
            ),
            optionalAbility = listOf(
                KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
                listOf(
                    SpecialAbilities.jezykBretonski,
                    SpecialAbilities.jezykEstalijski,
                    SpecialAbilities.jezykKislevski,
                    SpecialAbilities.jezykTileanski
                )
            ),
        )

        val Zbrojny = Profession(
            name = "Zbrojny",
            ww = 25, us = 10, k = 10, odp = 10, zr = 10, int = 10, sw = 10, ogd = 0,
            a = 1, zyw = 6,
            abilities = listOf(
                CommonAbilities.hazard,
                CommonAbilities.jezdziectwo,
                CommonAbilities.mocnaGlowa,
                CommonAbilities.opiekaNadZwierzetami,
                CommonAbilities.plotkowanie,
                CommonAbilities.skradanieSie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.sztukaPrzetrwania,
                CommonAbilities.ukrywanieSie,
                CommonAbilities.zastraszanie,
                RareAbilities.unik,
                SpecialAbilities.sekretnyjezykBitewny,
                SpecialAbilities.wiedzaBretonia,
            ),
            skills = listOf(
                CommonSkills.ogluszenie,
                CommonSkills.wedrowiec,
                WeaponSkills.bronDwureczna
            ),
            optionalSkills = listOf(
                SpecialWeapon.Common,
                listOf(StatsSkills.bardzoSilny, StatsSkills.niezwykleOdporny)
            ),
        )

        val Zwadzca = Profession(
            name = "Zwadźca",
            ww = 20, us = 20, k = 10, odp = 20, zr = 20, int = 15, sw = 15, ogd = 10,
            a = 1, zyw = 4,
            abilities = listOf(
                CommonAbilities.hazard,
                CommonAbilities.plotkowanie,
                CommonAbilities.przekonywanie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.zastraszanie,
                RareAbilities.unik,
                RareAbilities.zwinnePalce,
            ),
            skills = listOf(
                CommonSkills.artylerzysta,
                CommonSkills.brawura,
                CommonSkills.etykieta,
                CommonSkills.silnyCios,
                CommonSkills.strzalMierzony,
                CommonSkills.strzalPrecyzyjny,
                CommonSkills.szybkieWyciagniecie,
                WeaponSkills.bronPalna,
                WeaponSkills.bronParujaca,
                WeaponSkills.bronSzermiercza,
            ),
            optionalSkills = listOf(
                listOf(CommonSkills.morderczyAtak, CommonSkills.mierzonyCios),
                listOf(CommonSkills.oburecznosc, CommonSkills.rozbrajanie),
            ),
        )

        val Zwiadowca = Profession(
            name = "Zwiadowca",
            ww = 20, us = 20, k = 10, odp = 10, zr = 15, int = 20, sw = 15, ogd = 0,
            a = 1, zyw = 6,
            abilities = listOf(
                CommonAbilities.jezdziectwo,
                CommonAbilities.opiekaNadZwierzetami,
                CommonAbilities.skradanieSie,
                CommonAbilities.spostrzegawczosc,
                CommonAbilities.ukrywanieSie,
                RareAbilities.nawigacja,
                RareAbilities.oswajanie,
                RareAbilities.tropienie,
                RareAbilities.unik,
                SpecialAbilities.sekretneZnakiZwiadowcow,
                SpecialAbilities.sekretnyjezykLowcow,
            ),
            skills = listOf(
                CommonSkills.blyskawicznePrzadowanie,
                CommonSkills.wyczucieKierunku,
            ),
            optionalAbility = listOf(
                KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
                LanguageAbilities.All, LanguageAbilities.All
            ),
            optionalSkills = listOf(
                listOf(WeaponSkills.dlugieLuki, WeaponSkills.kusze),
                listOf(CommonSkills.strzalPrecyzyjny, CommonSkills.strzalPrzebijajacy)
            ),
        )
    }
/////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////      SKAVENY     /////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
object SkavenProfessions {
    val Czarnoszczur = Profession(
        name = "Czarnoszczur",
        ww = 10, us = 0, k = 5, odp = 5, zr = 10, int = 0, sw = 5, ogd = 0,

        abilities = listOf(
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.silnyCios,
            StatsSkills.twardziel,
            WeaponSkills.bronDwureczna,
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.niezwykleOdporny, StatsSkills.szybkiRefleks)
        )
    )

    val CzcicielZarazy = Profession(
        name = "Czciciel zarazy",
        ww = 10, us = 0, k = 5, odp = 10, zr = 5, int = 0, sw = 10, ogd = 5,

        abilities = listOf(
            CommonAbilities.skradanieSie,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            RareAbilities.unik,
            SpecialAbilities.naukaTeologia,
            SpecialAbilities.wiedzaSkaveny,
        ),
        skills = listOf(
            CommonSkills.grotolaz,
            CommonSkills.nieustraszony,
            CommonSkills.odpornoscNaChoroby,
            CommonSkills.szalBojowy,
        ),
    )

    val Harcownik = Profession(
        name = "Harcownik",
        ww = 5, us = 10, k = 0, odp = 0, zr = 10, int = 10, sw = 5, ogd = 0,

        abilities = listOf(
            CommonAbilities.skradanieSie,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            SpecialAbilities.naukaInzynieria,
            SpecialAbilities.wiedzaSkaveny,
        ),
        skills = listOf(
            CommonSkills.blyskawicznePrzadowanie,
            CommonSkills.grotolaz,
            WeaponSkills.bronPalna,
        ),
    )

    val Klanbrat = Profession(
        name = "Klanbrat",
        ww = 5, us = 5, k = 0, odp = 0, zr = 5, int = 0, sw = 5, ogd = 0,

        abilities = listOf(
            CommonAbilities.skradanieSie,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            SpecialAbilities.wiedzaSkaveny,
        ),
        skills = listOf(
            CommonSkills.grotolaz,
            WeaponSkills.proce,
        ),
    )

    val Niewolnik = Profession(
        name = "Niewolnik",
        ww = 5, us = 0, k = 5, odp = 5, zr = 10, int = 0, sw = 5, ogd = 0,
        zyw = 4,
        abilities = listOf(
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.ukrywanieSie,
            RareAbilities.gadanina,
            SpecialAbilities.wiedzaSkaveny,
            SpecialAbilities.jezykQueekish,
        ),
        skills = listOf(
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.bystryWzrok, CommonSkills.czulySluch),
            listOf(CommonSkills.chodu, StatsSkills.twardziel)
        )
    )

    val PoganiaczSkavenski = Profession(
        name = "Poganiacz skaveński",
        ww = 5, us = 0, k = 5, odp = 5, zr = 5, int = 5, sw = 10, ogd = 5,
        zyw = 3,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            RareAbilities.tresura,
            SpecialAbilities.wiedzaSkaveny,
        ),
        skills = listOf(
            CommonSkills.grotolaz,
            CommonSkills.mistrzTresury,
            WeaponSkills.bronDwureczna,
            WeaponSkills.bronUnieruchamiajaca,
        ),
    )

    val PoslaniecNocy = Profession(
        name = "Posłaniec nocy",
        ww = 10, us = 10, k = 0, odp = 5, zr = 10, int = 0, sw = 5, ogd = 0,

        abilities = listOf(
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            RareAbilities.nawigacja,
            RareAbilities.unik,
            SpecialAbilities.wiedzaSkaveny,
        ),
        skills = listOf(
            CommonSkills.grotolaz,
            CommonSkills.wedrowiec,
            CommonSkills.wyczucieKierunku,
            StatsSkills.bardzoSzybki,
        ),
        optionalSkills = listOf(
            listOf(WeaponSkills.proce, WeaponSkills.bronRzucana)
        )
    )

    val UczenSzaregoProroka = Profession(
        name = "Uczeń szarego proroka",
        ww = 5, us = 5, k = 0, odp = 0, zr = 10, int = 10, sw = 15, ogd = 5,
        zyw = 3, mag = 1,
        abilities = listOf(
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
        ),
        skills = listOf(
            CommonSkills.dotykMocy,
            CommonSkills.przemawianie,
        ),
        optionalAbility = listOf(
            LanguageAbilities.All
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.blyskotliwosc, StatsSkills.charyzmatyczny),
            UniversalMagic.All, UniversalMagic.All
        )
    )

    val DiakonZarazy = Profession(
        name = "Diakon zarazy",
        ww = 10, us = 5, k = 10, odp = 15, zr = 10, int = 5, sw = 15, ogd = 10,
        a = 1, zyw = 4, mag = 1,
        abilities = listOf(
            CommonAbilities.plywanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecialAbilities.jezykTajemnyMagiczny,
            SpecialAbilities.naukaTeologia,
        ),
        skills = listOf(
            CommonSkills.czarnoksiestwo,
            CommonSkills.ogluszenie,
            CommonSkills.przemawianie,
            MagicSkills.magiaProstaSpaczeniowa,
            WeaponSkills.korbacze,
        ),
        optionalAbility = listOf(
            ScienceAbilities.All,
            KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.morderczyAtak, CommonSkills.mierzonyCios)
        ),
    )

    val HersztKlanu = Profession(
        name = "Herszt klanu",
        ww = 40, us = 30, k = 30, odp = 30, zr = 40, int = 30, sw = 20, ogd = 25,
        a = 2, zyw = 6,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.wspinaczka,
            CommonAbilities.wycena,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.gadanina,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.blyskawicznyBlok,
            CommonSkills.grozny,
            CommonSkills.krasomowstwo,
            CommonSkills.ogluszenie,
            CommonSkills.przemawianie,
            CommonSkills.silnyCios,
        ),
        optionalAbility = listOf(
            listOf(SpecialAbilities.naukaHistoria, SpecialAbilities.naukaStrategiaTaktyka),
            KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
            LanguageAbilities.All, LanguageAbilities.All, LanguageAbilities.All
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.niezwykleOdporny, CommonSkills.szostyZmysl),
            listOf(CommonSkills.rozbrajanie, CommonSkills.szybkieWyciagniecie),
            SpecialWeapon.All, SpecialWeapon.All,
        ),
    )

    val InzynierSpaczenia = Profession(
        name = "Inżynier spaczenia",
        ww = 15, us = 20, k = 10, odp = 10, zr = 30, int = 30, sw = 15, ogd = 5,
        a = 1, zyw = 7,
        abilities = listOf(
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            SpecialAbilities.naukaAnatomia,
            SpecialAbilities.naukaInzynieria,
            SpecialAbilities.rzemiosloKowalstwo,
            SpecialAbilities.rzemiosloRusznikarstwo,
        ),
        skills = listOf(
            CommonSkills.artylerzysta,
            CommonSkills.inzynieriaSpaczeniowa,
            CommonSkills.strzalMierzony,
            CommonSkills.strzalPrzebijajacy,
            StatsSkills.strzelecWyborowy,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.jezdziectwo, CommonAbilities.powozenie),
            KnowledgeAbilities.OldWorld,
            LanguageAbilities.All, LanguageAbilities.All
        ),
        optionalSkills = listOf(
            listOf(WeaponSkills.bronMechaniczna, WeaponSkills.bronPalna)
        ),
    )

    val Kadzielnik = Profession(
        name = "Kadzielnik",
        ww = 25, us = 0, k = 25, odp = 20, zr = 10, int = 0, sw = 25, ogd = 0,
        a = 1, zyw = 6,
        abilities = listOf(
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.czarnyGlod,
            CommonSkills.grozny,
            CommonSkills.nieustraszony,
            CommonSkills.odpornoscNaChoroby,
            CommonSkills.silnyCios,
            CommonSkills.szalBojowy,
            StatsSkills.twardziel,
            StatsSkills.urodzonyWojownik,
            WeaponSkills.korbacze,
        ),
    )

    val KaplanZarazy = Profession(
        name = "Kapłan zarazy",
        ww = 20, us = 10, k = 15, odp = 25, zr = 20, int = 10, sw = 25, ogd = 15,
        a = 1, zyw = 6, mag = 2,
        abilities = listOf(
            CommonAbilities.plywanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.leczenie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecialAbilities.rzemiosloPiwowarstwo,
            SpecialAbilities.naukaTeologia,
        ),
        skills = listOf(
            CommonSkills.przemawianie,
            CommonSkills.warzenieZarazy,
            MagicSkills.magiaCzarnoksieskaZarazy,
        ),
        optionalAbility = listOf(
            ScienceAbilities.All,
            KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
            LanguageAbilities.All, LanguageAbilities.All
        ),
    )

    val MistrzCialoksztaltowania = Profession(
        name = "Mistrz ciałokształtowania",
        ww = 15, us = 0, k = 10, odp = 15, zr = 10, int = 15, sw = 15, ogd = 10,
        a = 1, zyw = 5,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.wycena,
            CommonAbilities.zastraszanie,
            RareAbilities.leczenie,
            RareAbilities.torturowanie,
            RareAbilities.tresura,
            SpecialAbilities.naukaAnatomia,
        ),
        skills = listOf(
            CommonSkills.chirurgia,
            CommonSkills.cialoksztaltowanie,
            CommonSkills.intrygant,
            CommonSkills.mistrzTresury,
            CommonSkills.niepokojacy,
            CommonSkills.zylkaHandlowa,
        ),
        optionalAbility = listOf(
            ScienceAbilities.All,
            CraftAbilities.All,
            KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld
        ),
    )

    val MistrzMutator = Profession(
        name = "Mistrz mutator",
        ww = 30, us = 10, k = 20, odp = 30, zr = 20, int = 30, sw = 25, ogd = 15,
        a = 2, zyw = 7,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plywanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.targowanie,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wycena,
            CommonAbilities.zastraszanie,
            RareAbilities.nawigacja,
            RareAbilities.oswajanie,
            RareAbilities.sledzenie,
            RareAbilities.torturowanie,
            RareAbilities.tresura,
            RareAbilities.tropienie,
            RareAbilities.unik,
            RareAbilities.warzenieTrucizn,
            RareAbilities.zastawianiePulapek,
        ),
        skills = listOf(
            CommonSkills.chirurgia,
            CommonSkills.intrygant,
            CommonSkills.mistrzTresury,
            CommonSkills.niepokojacy,
            CommonSkills.nieustraszony,
            CommonSkills.wyostrzoneZmysly,
            CommonSkills.zylkaHandlowa,
            StatsSkills.opanowanie,
        ),
        optionalAbility = listOf(
            ScienceAbilities.All, ScienceAbilities.All, ScienceAbilities.All,
            CraftAbilities.All, CraftAbilities.All,
            KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.bystryWzrok, CommonSkills.czulySluch)
        ),
    )

    val MistrzSkrytobojca = Profession(
        name = "Mistrz skrytobojca",
        ww = 25, us = 25, k = 10, odp = 15, zr = 30, int = 15, sw = 20, ogd = 10,
        a = 2, zyw = 6,
        abilities = listOf(
            CommonAbilities.charakteryzacja,
            CommonAbilities.plywanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            CommonAbilities.wycena,
            RareAbilities.czytanieIPisanie,
            RareAbilities.czytanieZWarg,
            RareAbilities.otwieranieZamkow,
            RareAbilities.sledzenie,
            RareAbilities.unik,
            RareAbilities.warzenieTrucizn,
            RareAbilities.zastawianiePulapek,
            RareAbilities.zwinnePalce,
            SpecialAbilities.wiedzaKataj,
        ),
        skills = listOf(
            CommonSkills.biegPoScianach,
            CommonSkills.blyskawicznyBlok,
            CommonSkills.sztukaCichejSmierci,
            CommonSkills.szybkieWyciagniecie,
            CommonSkills.ulicznik,
            CommonSkills.walkaOgonem,
            WeaponSkills.bronRzucana,
            WeaponSkills.bronUnieruchamiajaca
        ),
        optionalSkills = listOf(
            SpecialWeapon.All
        ),
    )

    val Nadprorok = Profession(
        name = "Nadprorok",
        ww = 20, us = 20, k = 15, odp = 15, zr = 40, int = 40, sw = 35, ogd = 35,
        a = 1, zyw = 9, mag = 3,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
        ),
        skills = listOf(
            CommonSkills.krasomowstwo,
            CommonSkills.medytacja,
            CommonSkills.morderczyPocisk,
            CommonSkills.zmyslMagii,
            MagicSkills.magiaCzarnoksieskaSpaczenia,
        ),
        optionalAbility = listOf(
            SecretLanguageAbilities.Common,
            SecretLanguageAbilities.Common,
            SecretLanguageAbilities.Common,
            ScienceAbilities.All,
            ScienceAbilities.All,
            ScienceAbilities.All,
            KnowledgeAbilities.OldWorld,
            KnowledgeAbilities.OldWorld,
            KnowledgeAbilities.OldWorld,
            LanguageAbilities.All,
            LanguageAbilities.All,
            LanguageAbilities.All,
            LanguageAbilities.All
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.czarnoksiestwo, CommonSkills.odpornoscPsychiczna),
            listOf(CommonSkills.dotykMocy, StatsSkills.niezwykleOdporny),
            UniversalMagic.All, UniversalMagic.All
        ),
    )

    val Rynsztokowiec = Profession(
        name = "Rynsztokowiec",
        ww = 15, us = 15, k = 5, odp = 10, zr = 20, int = 5, sw = 10, ogd = 5,
        a = 1, zyw = 4,
        abilities = listOf(
            CommonAbilities.charakteryzacja,
            CommonAbilities.plywanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            CommonAbilities.wycena,
            RareAbilities.czytanieZWarg,
            RareAbilities.otwieranieZamkow,
            RareAbilities.unik,
            RareAbilities.zwinnePalce,
            SpecialAbilities.wiedzaSkaveny,
        ),
        skills = listOf(
            CommonSkills.sztukaCichejSmierci,
            CommonSkills.wedrowiec,
            CommonSkills.wyczucieKierunku,
            CommonSkills.wykrywaniePulapek,
            StatsSkills.bardzoSzybki,
            WeaponSkills.kusze,
        ),
        optionalSkills = listOf(
            listOf(WeaponSkills.bronRzucana, WeaponSkills.ostrzeJadowe)
        ),
    )

    val SkavenskiZaklinacz = Profession(
        name = "Skaveński zaklinacz",
        ww = 15, us = 15, k = 0, odp = 20, zr = 25, int = 20, sw = 25, ogd = 10,
        zyw = 5, mag = 2,
        abilities = listOf(
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecialAbilities.jezykTajemnyMagiczny,
            SpecialAbilities.naukaMagia,
            SpecialAbilities.wiedzaKataj,
        ),
        skills = listOf(
            CommonSkills.pancerzWiary,
            CommonSkills.zmyslMagii,
            MagicSkills.magiaCzarnoksieskaSkrytosci,
            WeaponSkills.bronRzucana,
        ),
        optionalAbility = listOf(
            ScienceAbilities.All,
            KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
            LanguageAbilities.All, LanguageAbilities.All
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.czarnoksiestwo, CommonSkills.odpornoscPsychiczna),
            listOf(CommonSkills.dotykMocy, StatsSkills.niezwykleOdporny),
            listOf(CommonSkills.medytacja, CommonSkills.morderczyPocisk),
            UniversalMagic.All, UniversalMagic.All
        ),
    )

    val SzaryProrok = Profession(
        name = "Szary prorok",
        ww = 10, us = 10, k = 5, odp = 10, zr = 20, int = 20, sw = 25, ogd = 15,
        zyw = 5, mag = 2,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecialAbilities.jezykTajemnyDemoniczny,
            SpecialAbilities.jezykTajemnyMagiczny,
            SpecialAbilities.naukaMagia,
            SpecialAbilities.naukaTeologia,
            SpecialAbilities.wiedzaKataj,
        ),
        skills = listOf(
            CommonSkills.krasomowstwo,
            MagicSkills.magiaCzarnoksieskaSpaczenia,
        ),
        optionalAbility = listOf(
            ScienceAbilities.All,
            KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
            LanguageAbilities.All, LanguageAbilities.All
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.czarnoksiestwo, CommonSkills.odpornoscPsychiczna),
            listOf(CommonSkills.dotykMocy, StatsSkills.niezwykleOdporny),
            listOf(CommonSkills.medytacja, CommonSkills.morderczyPocisk),
            UniversalMagic.All, UniversalMagic.All
        ),
    )

    val Szponowlad = Profession(
        name = "Szponowład",
        ww = 15, us = 10, k = 5, odp = 5, zr = 10, int = 5, sw = 10, ogd = 5,
        a = 1, zyw = 4,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.plywanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
            SpecialAbilities.naukaStrategiaTaktyka,
            SpecialAbilities.wiedzaKataj,
        ),
        skills = listOf(
            CommonSkills.grozny,
            CommonSkills.intrygant,
            CommonSkills.obiezyswiat,
            CommonSkills.silnyCios,
            CommonSkills.wyostrzoneZmysly,
        ),
        optionalAbility = listOf(
            KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
            LanguageAbilities.All
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.bijatyka, CommonSkills.zapasy),
            listOf(CommonSkills.morderczyAtak, CommonSkills.mierzonyCios)
        ),
    )

    val Szturmoszczur = Profession(
        name = "Szturmoszczur",
        ww = 15, us = 15, k = 10, odp = 10, zr = 15, int = 0, sw = 10, ogd = 5,
        a = 1, zyw = 4,
        abilities = listOf(
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.grotolaz,
            CommonSkills.grozny,
            CommonSkills.odwaga,
            StatsSkills.urodzonyWojownik,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.dowodzenie, CommonAbilities.wycena),
        ),
        optionalSkills = listOf(
            listOf(StatsSkills.bardzoSilny, StatsSkills.niezwykleOdporny),
            listOf(CommonSkills.morderczyAtak, CommonSkills.mierzonyCios)
        ),
    )
}
/////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////      PLEMIE      /////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
object TribeProfessions {
    val UczenSzamana = Profession(
        name = "Uczeń szamana",
        ww = 5, us = 5, k = 0, odp = 5, zr = 5, int = 10, sw = 10, ogd = 10,
        mag = 1,
        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.leczenie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecialAbilities.kuglarstwoSpiew,
            SpecialAbilities.kuglarstwoTaniec,
            SpecialAbilities.naukaTeologia,
        ),
        skills = listOf(
            CommonSkills.przemawianie,
            MagicSkills.magiaProstaGusla,
        ),
        optionalAbility = listOf(
            KnowledgeAbilities.OldWorld,
            LanguageAbilities.All,
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.morderczyAtak, CommonSkills.ogluszenie, CommonSkills.mierzonyCios)
        )
    )

    val Szaman = Profession(
        name = "Szaman",
        ww = 10, us = 10, k = 5, odp = 10, zr = 10, int = 15, sw = 20, ogd = 15,
        zyw = 4, mag = 2,
        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.leczenie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecialAbilities.kuglarstwoGawedziarstwo,
            SpecialAbilities.kuglarstwoSpiew,
            SpecialAbilities.kuglarstwoTaniec,
            SpecialAbilities.naukaTeologia,
        ),
        skills = listOf(
            CommonSkills.dotykMocy,
            CommonSkills.krasomowstwo,
            MagicSkills.magiaKaplanskaDuchow,
        ),
        optionalAbility = listOf(
            listOf(SpecialAbilities.jezykTajemnyDemoniczny, SpecialAbilities.jezykTajemnyMagiczny),
            ScienceAbilities.All,
            KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
            LanguageAbilities.All
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.medytacja, CommonSkills.zmyslMagii)
        ),
    )

    val WielkiSzaman = Profession(
        name = "Wielki szaman",
        ww = 15, us = 15, k = 10, odp = 15, zr = 15, int = 20, sw = 25, ogd = 20,
        a = 1, zyw = 6, mag = 3,
        abilities = ScienceAbilities.All + KnowledgeAbilities.OldWorld + LanguageAbilities.All + listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.leczenie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecialAbilities.kuglarstwoGawedziarstwo,
            SpecialAbilities.kuglarstwoSpiew,
            SpecialAbilities.kuglarstwoTaniec,
            SpecialAbilities.naukaTeologia,
        ),
        skills = listOf(
            CommonSkills.medytacja,
            CommonSkills.morderczyPocisk,
            CommonSkills.nieustraszony,
            CommonSkills.odpornoscPsychiczna,
            CommonSkills.zmyslMagii,
            MagicSkills.magiaKaplanskaDuchow,
        ),
        optionalAbility = listOf(
            listOf(SpecialAbilities.jezykTajemnyDemoniczny, SpecialAbilities.jezykTajemnyMagiczny),
            ScienceAbilities.All,
            KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
            LanguageAbilities.All, LanguageAbilities.All
        ),
        optionalSkills = listOf(
            UniversalMagic.All, UniversalMagic.All,
            listOf(CommonSkills.medytacja, CommonSkills.zmyslMagii)
        ),
    )

    val Knuj = Profession(
        name = "Knuj",
        ww = 10, us = 20, k = 10, odp = 10, zr = 20, int = 10, sw = 15, ogd = 0,
        a = 1, zyw = 4,
        abilities = listOf(
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            RareAbilities.nawigacja,
            RareAbilities.sledzenie,
            RareAbilities.tropienie,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.wyczucieKierunku,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.dowodzenie, RareAbilities.warzenieTrucizn),
            listOf(CommonAbilities.jezdziectwo, CommonAbilities.wspinaczka)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.blyskawicznePrzadowanie, CommonSkills.strzalMierzony),
            listOf(WeaponSkills.bronRzucana, WeaponSkills.bronUnieruchamiajaca),
            listOf(CommonSkills.strzalPrecyzyjny, CommonSkills.strzalPrzebijajacy),
            listOf(CommonSkills.grotolaz, CommonSkills.wedrowiec)
        )
    )

    val Silacz = Profession(
        name = "Siłacz",
        ww = 20, us = 10, k = 15, odp = 15, zr = 15, int = 0, sw = 15, ogd = 10,
        a = 1, zyw = 6,
        abilities = listOf(
            CommonAbilities.mocnaGlowa,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.morderczyAtak,
            CommonSkills.silnyCios,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.dowodzenie, CommonAbilities.wycena),
            listOf(CommonAbilities.jezdziectwo, CommonAbilities.przeszukiwanie),
        ),
        optionalSkills = listOf(
            listOf(WeaponSkills.bronDwureczna, WeaponSkills.korbacze)
        )
    )

    val WodzPlemienny = Profession(
        name = "Wódz plemienny",
        ww = 30, us = 20, k = 20, odp = 20, zr = 35, int = 15, sw = 20, ogd = 20,
        a = 2, zyw = 8,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.wycena,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
            SpecialAbilities.naukaStrategiaTaktyka,
        ),
        skills = listOf(
            CommonSkills.blyskawicznyBlok,
            CommonSkills.grozny,
            CommonSkills.ogluszenie,
            CommonSkills.silnyCios,
            CommonSkills.szybkieWyciagniecie,
        ),
        optionalAbility = listOf(
            listOf(CommonAbilities.jezdziectwo, CommonAbilities.wspinaczka)
        ),
        optionalSkills = listOf(
            listOf(CommonSkills.rozbrajanie, CommonSkills.szybkieWyciagniecie),
            listOf(CommonSkills.szostyZmysl, StatsSkills.niezwykleOdporny),
            SpecialWeapon.Common, SpecialWeapon.Common
        ),
    )
}
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////      ZWIERZAKI      ///////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
object AnimalProfessions {
    val TresowanyNiedzwiedz = Profession(
        name = "Tresowany Niedźwiedź",
        ww = 10, us = 5, k = 5, odp = 5, zr = 5, int = 5, sw = 5, ogd = 0,

        abilities = listOf(
            CommonAbilities.plywanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.grozny,
            CommonSkills.oburecznosc,
            CommonSkills.odwaga,
            CommonSkills.ogluszenie,
            CommonSkills.rozbrajanie,
            CommonSkills.szalBojowy,
            CommonSkills.zapasy,
        ),
    )
}
/////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////      ZWIERZOLUDZIE      //////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
object BeastmenProfessions {
    val Bestigor = Profession(
        name = "Bestigor",
        ww = 20, us = 0, k = 15, odp = 15, zr = 20, int = 5, sw = 20, ogd = 10,
        a = 1, zyw = 6,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.morderczyAtak,
            CommonSkills.mierzonyCios,
            CommonSkills.silnyCios,
            WeaponSkills.bronDwureczna,
        ),
    )

    val WodzZwierzoludzi = Profession(
        name = "Wódz zwierzoludzi",
        ww = 30, us = 10, k = 25, odp = 25, zr = 30, int = 10, sw = 20, ogd = 15,
        a = 2, zyw = 8,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wycena,
            CommonAbilities.zastraszanie,
            RareAbilities.sledzenie,
            RareAbilities.tropienie,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.blyskawicznyBlok,
            CommonSkills.grozny,
            CommonSkills.ogluszenie,
            CommonSkills.silnyCios,
        ),
        optionalSkills = listOf(
            SpecialWeapon.Common, SpecialWeapon.Common, SpecialWeapon.Common,
            listOf(CommonSkills.szostyZmysl, StatsSkills.niezwykleOdporny),
            listOf(CommonSkills.rozbrajanie, CommonSkills.szybkieWyciagniecie)
        ),
    )

    val SzamanRykowcowK = Profession(
        name = "Szaman rykowców",
        ww = 5, us = 0, k = 5, odp = 10, zr = 10, int = 10, sw = 15, ogd = 10,
        a = 1, zyw = 6, mag = 2,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.leczenie,
            RareAbilities.torturowanie,
            RareAbilities.unik,
            SpecialAbilities.jezykTajemnyDemoniczny,
            SpecialAbilities.kuglarstwoGawedziarstwo,
            SpecialAbilities.jezykMrocznaMowa,
        ),
        skills = listOf(
            CommonSkills.morderczyAtak,
            CommonSkills.mierzonyCios,
            CommonSkills.ogluszenie,
            CommonSkills.przemawianie,
            StatsSkills.bardzoSilny,
            WeaponSkills.bronDwureczna,
        ),
        optionalAbility = listOf(
            KnowledgeAbilities.OldWorld
        ),
    )

    val SzamanRykowcowNST = Profession(
        name = "Szaman rykowców",
        ww = 5, us = 0, k = 5, odp = 10, zr = 10, int = 10, sw = 15, ogd = 10,
        a = 1, zyw = 6, mag = 2,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.leczenie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            RareAbilities.unik,
            SpecialAbilities.jezykTajemnyDemoniczny,
            SpecialAbilities.kuglarstwoGawedziarstwo,
            SpecialAbilities.jezykMrocznaMowa,
        ),
        skills = listOf(
            CommonSkills.dotykMocy,
            CommonSkills.przemawianie,
        ),
        optionalSkills = listOf(
            listOf(
                MagicSkills.magiaCzarnoksieskaNurgl,
                MagicSkills.magiaCzarnoksieskaSlaanesh,
                MagicSkills.magiaCzarnoksieskaTzeentch,
                MagicSkills.magiaTajemnaTradycjaCienia,
                MagicSkills.magiaTajemnaTradycjaSmierci,
                MagicSkills.magiaTajemnaTradycjaZwierzat
            ),
            listOf(CommonSkills.medytacja, CommonSkills.zmyslMagii),
        ),
    )


    val WielkiSzamanRykowcowK = Profession(
        name = "Wielki szaman rykowców",
        ww = 20, us = 10, k = 15, odp = 20, zr = 20, int = 20, sw = 30, ogd = 20,
        a = 2, zyw = 8, mag = 4,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.leczenie,
            RareAbilities.torturowanie,
            SpecialAbilities.jezykTajemnyDemoniczny,
            SpecialAbilities.kuglarstwoGawedziarstwo,
        ),
        skills = listOf(
            CommonSkills.krasomowstwo,
            CommonSkills.nieustraszony,
            CommonSkills.odpornoscPsychiczna,
            CommonSkills.szalBojowy,
            StatsSkills.niezwykleOdporny,
        ),
        optionalAbility = listOf(
            KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
            LanguageAbilities.All, LanguageAbilities.All, LanguageAbilities.All,
        ),
        optionalSkills = listOf(
            SpecialWeapon.Common
        ),
    )

    val WielkiSzamanRykowcowNST = Profession(
        name = "Wielki szaman rykowców",
        ww = 20, us = 10, k = 15, odp = 20, zr = 20, int = 20, sw = 30, ogd = 20,
        a = 2, zyw = 8, mag = 4,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.leczenie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecialAbilities.jezykTajemnyDemoniczny,
            SpecialAbilities.kuglarstwoGawedziarstwo,
        ),
        skills = listOf(
            CommonSkills.nieustraszony,
            CommonSkills.krasomowstwo,
            CommonSkills.morderczyPocisk,
            CommonSkills.odpornoscPsychiczna,
        ),
        optionalAbility = listOf(
            KnowledgeAbilities.OldWorld, KnowledgeAbilities.OldWorld,
            LanguageAbilities.All, LanguageAbilities.All, LanguageAbilities.All,
        ),
        optionalSkills = listOf(
            UniversalMagic.All, UniversalMagic.All,
            listOf(CommonSkills.medytacja, CommonSkills.zmyslMagii),
        ),
    )
}

//TODO: PROFESJE WAMPIRÓW, KRASNOLUDÓW CHAOSU, WYBRAŃCÓW CHAOSU

//    fun getProfessionByName(name: String): Profession? {
//        return professionList.find { it.name == name }
//    }