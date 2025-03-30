package com.dd.rpgcardapp.data

data class Profession(
    val name: String,
    val ww: Int,
    val us: Int,
    val k: Int,
    val odp: Int,
    val zr: Int,
    val int: Int,
    val sw: Int,
    val ogd: Int,
    val a: Int = 0,
    val zyw: Int =2,
    val mag: Int = 0,
    val sz: Int = 0,
    val abilities: List<Ability>,
    val skills: List<Skill>,
    val isStartingProfession: Boolean = true,
)
object Professions {
    val Akolita = Profession(
        name = "Akolita",
        ww = 5, us = 5, k = 0, odp = 5, zr = 0, int = 10, sw = 10, ogd = 10,
        
        abilities = listOf(
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            RareAbilities.leczenie,
            SpecializedAbilities.naukaAstronomia,
            SpecializedAbilities.naukaHistoria,
            SpecializedAbilities.naukaTeologia,
            SpecializedAbilities.znajomoscJezykaKlasyczny,
            SpecializedAbilities.znajomoscJezykaReikspiel,
        ),
        skills = listOf(
            CommonSkills.przemawianie,
            StatsSkills.bardzoSilny,
            StatsSkills.szybkiRefleks,
            StatsSkills.charyzmatyczny,
            StatsSkills.urodzonyWojownik,
        ),
    )

    val AkolitaKultuKhorna = Profession(
        name = "Akolita kultu Khorna",
        ww = 20, us = 0, k = 10, odp = 15, zr = 5, int = 0, sw = 15, ogd = 0,
        a = 1, zyw = 4,
        abilities = KnowledgeAbilities.All + listOf(
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
            SpecializedAbilities.sekretnyJezykBitewny,
        ),
        skills = listOf(
            CommonSkills.morderczyAtak,
            CommonSkills.mierzonyCios,
            CommonSkills.silnyCios,
            CommonSkills.uodpornionyNaChaos,
            StatsSkills.niezwykleOdporny,
            StatsSkills.szybkiRefleks,
            StatsSkills.twardziel,
            WeaponSkills.bronDwureczna,
            WeaponSkills.korbacze,
        ),
    )

    val AkolitaKultuNurgla = Profession(
        name = "Akolita kultu Nurgla",
        ww = 10, us = 0, k = 0, odp = 20, zr = 5, int = 0, sw = 15, ogd = 15,
        zyw = 3, mag = 1,
        abilities = KnowledgeAbilities.All + listOf(
            CommonAbilities.charakteryzacja,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.leczenie,
            RareAbilities.splatanieMagii,
            RareAbilities.torturowanie,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.jezykTajemnyDemoniczny,
            SpecializedAbilities.naukaDemonologia,
        ),
        skills = listOf(
            CommonSkills.czarnoksiestwo,
            CommonSkills.niepokojacy,
            CommonSkills.nieustraszony,
            CommonSkills.odpornoscNaChoroby,
            CommonSkills.przemawianie,
            CommonSkills.uodpornionyNaChaos,
            CommonSkills.zmyslMagii,
            MagicSkills.magiaProstaChaos,
            StatsSkills.niezwykleOdporny,
        ),
    )

    val AkolitaKultuSlaanesha = Profession(
        name = "Akolita kultu Slaanesha",
        ww = 5, us = 5, k = 0, odp = 0, zr = 10, int = 20, sw = 0, ogd = 25,
        zyw = 3, mag = 1,
        abilities = SleightOfHandAbilities.All + listOf(
            CommonAbilities.charakteryzacja,
            CommonAbilities.hazard,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.wycena,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.splatanieMagii,
            SpecializedAbilities.jezykTajemnyDemoniczny,
            SpecializedAbilities.naukaDemonologia,
        ),
        skills = listOf(
            CommonSkills.czarnoksiestwo,
            CommonSkills.etykieta,
            CommonSkills.lotrzyk,
            CommonSkills.uodpornionyNaChaos,
            CommonSkills.wyostrzoneZmysly,
            CommonSkills.zmyslMagii,
            CommonSkills.zylkaHandlowa,
            MagicSkills.magiaProstaChaos,
            StatsSkills.charyzmatyczny,
        ),
    )

    val AkolitaKultuTzeentcha = Profession(
        name = "Akolita kultu Tzeentcha",
        ww = 5, us = 5, k = 0, odp = 0, zr = 5, int = 20, sw = 10, ogd = 20,
        zyw = 3, mag = 1,
        abilities = ScienceAbilities.All + CraftAbilities.All + LanguageAbilities.All + KnowledgeAbilities.All + listOf(
            CommonAbilities.charakteryzacja,
            CommonAbilities.dowodzenie,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.wycena,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.splatanieMagii,
            RareAbilities.warzenieTrucizn,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.jezykTajemnyDemoniczny,
            SpecializedAbilities.naukaDemonologia,
        ),
        skills = listOf(
            CommonSkills.czarnoksiestwo,
            CommonSkills.etykieta,
            CommonSkills.intrygant,
            CommonSkills.obiezyswiat,
            CommonSkills.odpornoscNaMagie,
            CommonSkills.kontrolowanaMutacja,
            CommonSkills.poliglota,
            CommonSkills.przemawianie,
            CommonSkills.uodpornionyNaChaos,
            CommonSkills.zmyslMagii,
            CommonSkills.zylkaHandlowa,
            MagicSkills.magiaProstaChaos,
            StatsSkills.blyskotliwosc,
            StatsSkills.charyzmatyczny,
            StatsSkills.opanowanie,
        ),
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
            SpecializedAbilities.naukaAnatomia,
            SpecializedAbilities.naukaNekromancja,
            SpecializedAbilities.rzemiosloAptekarstwo,
            SpecializedAbilities.znajomoscJezykaKlasyczny,
        ),
        skills = listOf(
            CommonSkills.chirurgia,
            CommonSkills.lotrzyk,
            CommonSkills.odpornoscNaChoroby,
            CommonSkills.zylkaHandlowa,
        ),
    )

    val Banita = Profession(
        name = "Banita",
        ww = 10, us = 10, k = 0, odp = 0, zr = 10, int = 5, sw = 0, ogd = 0,
        a = 1, 
        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.plywanie,
            CommonAbilities.powozenie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            RareAbilities.unik,
            RareAbilities.zastawianiePulapek,
            SpecializedAbilities.sekretneZnakiZlodziei,
            SpecializedAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.strzalMierzony,
            CommonSkills.ogluszenie,
            CommonSkills.wedrowiec,
            CommonSkills.lotrzyk,
        ),
    )

    val BerserkerZNorski = Profession(
        name = "Berserker z Norski",
        ww = 15, us = 0, k = 10, odp = 10, zr = 0, int = 0, sw = 10, ogd = 0,
        
        abilities = listOf(
            CommonAbilities.mocnaGlowa,
            CommonAbilities.plywanie,
            CommonAbilities.zastraszanie,
            SpecializedAbilities.kuglarstwoGawedziarstwo,
            SpecializedAbilities.wiedzaNorska,
            SpecializedAbilities.znajomoscJezykaNorski,
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
        abilities = KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.sztukaPrzetrwania,
            RareAbilities.tresura,
            RareAbilities.unik,
            SpecializedAbilities.naukaGeneologiaHeraldyka,
        ),
        skills = listOf(
            CommonSkills.etykieta,
            CommonSkills.obiezyswiat,
            CommonSkills.silnyCios,
            KnightSkills.cnotaRycerskosci,
            WeaponSkills.bronKawaleryjska,
        ),
    )

    val Cenobita = Profession(
        name = "Cenobita",
        ww = 5, us = 0, k = 5, odp = 10, zr = 0, int = 5, sw = 10, ogd = 5,
        
        abilities = listOf(
            CommonAbilities.spostrzegawczosc,
            RareAbilities.gadanina,
            RareAbilities.leczenie,
            RareAbilities.torturowanie,
            SpecializedAbilities.naukaTeologia,
            SpecializedAbilities.wiedzaKsiestwaGraniczne,
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
            CommonAbilities.hazard,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plywanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.powozenie,
            CommonAbilities.skradanieSie,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wioslarstwo,
            CommonAbilities.wspinaczka,
            RareAbilities.oswajanie,
            RareAbilities.tresura,
            RareAbilities.zastawianiePulapek,
            SpecializedAbilities.kuglarstwoSpiew,
            SpecializedAbilities.kuglarstwoTaniec,
            SpecializedAbilities.rzemiosloGotowanie,
            SpecializedAbilities.rzemiosloWyrobLukow,
            SpecializedAbilities.rzemiosloUprawaZiemi,
        ),
        skills = listOf(
            CommonSkills.chodu,
            CommonSkills.wedrowiec,
            StatsSkills.twardziel,
            WeaponSkills.proce,
        ),
    )

    val CiuraObozowa = Profession(
        name = "Ciura Obozowa",
        ww = 0, us = 0, k = 0, odp = 5, zr = 10, int = 5, sw = 5, ogd = 10,
        
        abilities = listOf(
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plywanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.powozenie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            RareAbilities.zwinnePalce,
            SpecializedAbilities.rzemiosloGotowanie,
            SpecializedAbilities.rzemiosloHandel,
            SpecializedAbilities.rzemiosloKartografia,
            SpecializedAbilities.rzemiosloKowalstwo,
            SpecializedAbilities.rzemiosloKrawiectwo,
            SpecializedAbilities.rzemiosloPlatnerstwo,
            SpecializedAbilities.rzemiosloRusznikarstwo,
            SpecializedAbilities.rzemiosloWyrobLukow,
            SpecializedAbilities.rzemiosloZielarstwo,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaKislevski,
            SpecializedAbilities.znajomoscJezykaTileanski,
        ),
        skills = listOf(
            CommonSkills.chodu,
            CommonSkills.odpornoscNaChoroby,
            CommonSkills.obiezyswiat,
            CommonSkills.zylkaHandlowa,
            CommonSkills.bijatyka,
            StatsSkills.charyzmatyczny,
            StatsSkills.twardziel,
        ),
    )

    val Cyrkowiec = Profession(
        name = "Cyrkowiec",
        ww = 5, us = 10, k = 0, odp = 0, zr = 10, int = 0, sw = 5, ogd = 10,
        
        abilities = SleightOfHandAbilities.All + listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.plywanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wspinaczka,
            CommonAbilities.wycena,
            RareAbilities.brzuchomowstwo,
            RareAbilities.gadanina,
            RareAbilities.hipnoza,
            RareAbilities.oswajanie,
            RareAbilities.tresura,
            RareAbilities.zwinnePalce,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.znajomoscJezykaReikspiel,
        ),
        skills = listOf(
            CommonSkills.nasladowca,
            CommonSkills.przemawianie,
            CommonSkills.strzalMierzony,
            CommonSkills.szybkieWyciagniecie,
            CommonSkills.woltyzerka,
            CommonSkills.zapasy,
            StatsSkills.bardzoSilny,
            StatsSkills.szybkiRefleks,
            WeaponSkills.bronRzucana,
        ),
    )

    val Cyrulik = Profession(
        name = "Cyrulik",
        ww = 5, us = 0, k = 0, odp = 0, zr = 10, int = 10, sw = 10, ogd = 5,
        
        abilities = listOf(
            CommonAbilities.powozenie,
            CommonAbilities.plywanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.leczenie,
            SpecializedAbilities.rzemiosloAptekarstwo,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaReikspiel,
            SpecializedAbilities.znajomoscJezykaTileanski,
        ),
        skills = listOf(
            CommonSkills.chirurgia,
            CommonSkills.odpornoscNaChoroby,
            StatsSkills.blyskotliwosc,
            StatsSkills.charyzmatyczny,
            StatsSkills.niezwykleOdporny,
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
            CommonAbilities.zastraszanie,
            RareAbilities.sledzenie,
            RareAbilities.tropienie,
            RareAbilities.unik,
            SpecializedAbilities.naukaPrawo,
            SpecializedAbilities.wiedzaKislev,
        ),
        skills = listOf(
            CommonSkills.grozny,
            CommonSkills.ogluszenie,
            CommonSkills.rozbrajanie,
            CommonSkills.silnyCios,
            WeaponSkills.bronPalna,
        ),
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
            SpecializedAbilities.jezykTajemnyKrasnoludzki,
            SpecializedAbilities.naukaRuny,
            SpecializedAbilities.rzemiosloKowalstwo,
            SpecializedAbilities.rzemiosloPlatnerstwo,
        ),
        skills = MinorRuneForging.All + listOf(
        ),
    )

    val Doker = Profession(
        name = "Doker",
        ww = 0, us = 5, k = 10, odp = 10, zr = 5, int = 0, sw = 5, ogd = 0,
        
        abilities = listOf(
            CommonAbilities.hazard,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.plotkowanie,
            CommonAbilities.plywanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.wspinaczka,
            RareAbilities.unik,
            SpecializedAbilities.kuglarstwoSpiew,
            SpecializedAbilities.sekretnyJezykGildii,
        ),
        skills = listOf(
            CommonSkills.krzepki,
            StatsSkills.bardzoSilny,
            StatsSkills.szybkiRefleks,
        ),
    )

    val Fanatyk = Profession(
        name = "Fanatyk",
        ww = 10, us = 0, k = 5, odp = 10, zr = 0, int = 0, sw = 10, ogd = 5,
        
        abilities = listOf(
            CommonAbilities.przekonywanie,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            SpecializedAbilities.naukaTeologia,
            SpecializedAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.przemawianie,
            StatsSkills.bardzoSilny,
            StatsSkills.charyzmatyczny,
            StatsSkills.opanowanie,
            StatsSkills.twardziel,
            WeaponSkills.korbacze,
        ),
    )

    val Flisak = Profession(
        name = "Flisak",
        ww = 10, us = 5, k = 5, odp = 5, zr = 10, int = 5, sw = 0, ogd = 0,
        
        abilities = listOf(
            CommonAbilities.mocnaGlowa,
            CommonAbilities.plotkowanie,
            CommonAbilities.plywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.wioslarstwo,
            RareAbilities.nawigacja,
            RareAbilities.zeglarstwo,
            SpecializedAbilities.sekretnyJezykLowcow,
            SpecializedAbilities.znajomoscJezykaKislevski,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.wiedzaKislev
        ),
        skills = listOf(
            CommonSkills.obiezyswiat,
            CommonSkills.wyczucieKierunku,
        ),
    )

    val Giermek = Profession(
        name = "Giermek",
        ww = 10, us = 5, k = 5, odp = 5, zr = 5, int = 0, sw = 0, ogd = 5,
        a = 1, 
        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            RareAbilities.tresura,
            RareAbilities.unik,
            SpecializedAbilities.naukaGeneologiaHeraldyka,
            SpecializedAbilities.wiedzaBretonia,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaReikspiel
        ),
        skills = listOf(
            CommonSkills.etykieta,
            CommonSkills.silnyCios,
            WeaponSkills.bronKawaleryjska,
        ),
    )

    val Gladiator = Profession(
        name = "Gladiator",
        ww = 15, us = 0, k = 0, odp = 10, zr = 10, int = 0, sw = 10, ogd = 0,
        
        abilities = listOf(
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.odpornoscPsychiczna,
            CommonSkills.rozbrajanie,
            CommonSkills.zapasy,
            CommonSkills.silnyCios,
            CommonSkills.szybkieWyciagniecie,
            CommonSkills.morderczyAtak,
            StatsSkills.bardzoSilny,
            WeaponSkills.bronDwureczna,
            WeaponSkills.korbacze,
            WeaponSkills.bronParujaca,
        ),
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
            SpecializedAbilities.sekretneZnakiZwiadowcow,
        ),
        skills = listOf(
            CommonSkills.blyskawicznePrzadowanie,
            CommonSkills.chodu,
            CommonSkills.szostyZmysl,
            CommonSkills.wyczucieKierunku,
            StatsSkills.bardzoSilny,
            StatsSkills.bardzoSzybki,
            StatsSkills.niezwykleOdporny,
        ),
    )

    val Gornik = Profession(
        name = "Górnik",
        ww = 5, us = 5, k = 10, odp = 5, zr = 0, int = 5, sw = 5, ogd = 0,
        
        abilities = listOf(
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.powozenie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            CommonAbilities.wycena,
            RareAbilities.nawigacja,
            SpecializedAbilities.rzemiosloGornictwo,
            SpecializedAbilities.rzemiosloGornictwoOdkrywkowe,
        ),
        skills = listOf(
            CommonSkills.wyczucieKierunku,
            StatsSkills.niezwykleOdporny,
            StatsSkills.urodzonyWojownik,
            WeaponSkills.bronDwureczna,
        ),
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
            SpecializedAbilities.naukaTeologia,
            SpecializedAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.odwaga,
            CommonSkills.odpornoscNaChoroby,
            StatsSkills.bardzoSilny,
        ),
    )

    val Grabiezca = Profession(
        name = "Grabieżca",
        ww = 10, us = 0, k = 5, odp = 5, zr = 10, int = 0, sw = 10, ogd = 0,
        a = 1,
        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.nawigacja,
            RareAbilities.tropienie,
            RareAbilities.zeglarstwo,
            SpecializedAbilities.naukaTeologia,
            SpecializedAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.morderczyAtak,
            CommonSkills.mierzonyCios,
            CommonSkills.wyczucieKierunku,
            WeaponSkills.bronDwureczna,
            WeaponSkills.bronKawaleryjska,
            WeaponSkills.korbacze,
        ),
    )

    val Guslarz = Profession(
        name = "Guślarz",
        ww = 0, us = 0, k = 0, odp = 5, zr = 5, int = 5, sw = 10, ogd = 10,
         mag = 1,
        abilities = listOf(
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.przekonywanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.zastraszanie,

            RareAbilities.hipnoza,
            RareAbilities.leczenie,
            RareAbilities.oswajanie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,

            SpecializedAbilities.rzemiosloAptekarstwo,
        ),

        skills = listOf(
            CommonSkills.gusla,
            MagicSkills.magiaProstaGusla,
        ),
    )

    val HienaCmentarna = Profession(
        name = "Hiena cmentarna",
        ww = 10, us = 0, k = 0, odp = 0, zr = 10, int = 10, sw = 10, ogd = 5,
        
        abilities = listOf(
            CommonAbilities.przeszukiwanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            CommonAbilities.wycena,
            RareAbilities.czytanieIPisanie,
            RareAbilities.otwieranieZamkow,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.sekretneZnakiZlodziei,
            SpecializedAbilities.znajomoscJezykaEltharin,
            SpecializedAbilities.znajomoscJezykaKhazalid,
            SpecializedAbilities.znajomoscJezykaKlasyczny,
        ),
        skills = listOf(
            CommonSkills.grotolaz,
            CommonSkills.szczescie,
            CommonSkills.szostyZmysl,
            CommonSkills.wykrywaniePulapek,
        ),
    )

    val Kanciarz = Profession(
        name = "Kanciarz",
        ww = 5, us = 5, k = 0, odp = 0, zr = 10, int = 5, sw = 5, ogd = 10,
        
        abilities = listOf(
            CommonAbilities.hazard,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            RareAbilities.gadanina,
            SpecializedAbilities.kuglarstwoAktorstwo,
            SpecializedAbilities.kuglarstwoGawedziarstwo,
            SpecializedAbilities.sekretneZnakiZlodziei,
            SpecializedAbilities.sekretnyJezykZlodziei,
            SpecializedAbilities.znajomoscJezykaReikspiel,
        ),
        skills = listOf(
            CommonSkills.chodu,
            CommonSkills.lotrzyk,
            CommonSkills.przemawianie,
            CommonSkills.szczescie,
            CommonSkills.szostyZmysl,
        ),
    )

    val Koczownik = Profession(
        name = "Koczownik",
        ww = 10, us = 10, k = 0, odp = 5, zr = 5, int = 0, sw = 10, ogd = 0,
        
        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wycena,
            RareAbilities.leczenie,
            RareAbilities.nawigacja,
            RareAbilities.oswajanie,
            RareAbilities.tresura,
            RareAbilities.tropienie,
            SpecializedAbilities.kuglarstwoTaniec,
            SpecializedAbilities.sekretneZnakiZwiadowcow,
            SpecializedAbilities.rzemiosloGotowanie,
            SpecializedAbilities.rzemiosloWyrobLukow,
            SpecializedAbilities.wiedzaKrajTrolli,
        ),
        skills = listOf(
            CommonSkills.wedrowiec,
            StatsSkills.twardziel,
        ),
    )

    val Koniarz = Profession(
        name = "Koniarz",
        ww = 0, us = 5, k = 5, odp = 0, zr = 5, int = 5, sw = 5, ogd = 5,
        
        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            RareAbilities.oswajanie,
            RareAbilities.tropienie,
            SpecializedAbilities.znajomoscJezykaKislevski,
        ),
        skills = listOf(
            CommonSkills.chodu,
            CommonSkills.zylkaHandlowa,
            StatsSkills.charyzmatyczny,
            WeaponSkills.bronUnieruchamiajaca,
        ),
    )

    val Korsarz = Profession(
        name = "Koniarz",
        ww = 10, us = 0, k = 10, odp = 5, zr = 10, int = 0, sw = 0, ogd = 0,
        a = 1,
        abilities = listOf(
            CommonAbilities.mocnaGlowa,
            CommonAbilities.plywanie,
            CommonAbilities.wioslarstwo,
            CommonAbilities.wspinaczka,
            RareAbilities.unik,
            RareAbilities.zeglarstwo,
            SpecializedAbilities.wiedzaBretonia,
            SpecializedAbilities.wiedzaEstalia,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.wiedzaJalowaKraina,
            SpecializedAbilities.wiedzaKsiestwaGraniczne,
            SpecializedAbilities.wiedzaLustria,
            SpecializedAbilities.wiedzaNorska,
            SpecializedAbilities.wiedzaTilea,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaEstalijski,
            SpecializedAbilities.znajomoscJezykaReikspiel,
            SpecializedAbilities.znajomoscJezykaTileanski,
        ),
        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.grozny,
            CommonSkills.obiezyswiat,
            CommonSkills.silnyCios,
            StatsSkills.twardziel,
        ),
    )

    val KozakKislevski = Profession(
        name = "Kozak kislevski",
        ww = 10, us = 10, k = 0, odp = 10, zr = 0, int = 0, sw = 10, ogd = 0,
        
        abilities = listOf(
            CommonAbilities.hazard,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.targowanie,
            RareAbilities.unik,
            SpecializedAbilities.wiedzaKislev,
            SpecializedAbilities.znajomoscJezykaKislevski,
        ),
        skills = listOf(
            CommonSkills.morderczyAtak,
            WeaponSkills.bronDwureczna,
        ),
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
            RareAbilities.tropienie,
            RareAbilities.zastawianiePulapek,
            SpecializedAbilities.sekretneZnakiLowcow,
            SpecializedAbilities.sekretnyJezykLowcow,
        ),
        skills = listOf(
            CommonSkills.wedrowiec,
            StatsSkills.bardzoSzybki,
            StatsSkills.niezwykleOdporny,
            WeaponSkills.bronDwureczna,
        ),
    )

    val Lowca = Profession(
        name = "Łowca",
        ww = 0, us = 15, k = 0, odp = 5, zr = 10, int = 5, sw = 0, ogd = 0,
        zyw = 3,
        abilities = listOf(
            CommonAbilities.przeszukiwanie,
            CommonAbilities.plywanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            RareAbilities.tropienie,
            RareAbilities.zastawianiePulapek,
            SpecializedAbilities.sekretneZnakiLowcow,
        ),
        skills = listOf(
            CommonSkills.blyskawicznePrzadowanie,
            CommonSkills.wedrowiec,
            StatsSkills.strzelecWyborowy,
            StatsSkills.szybkiRefleks,
            StatsSkills.niezwykleOdporny,
            StatsSkills.twardziel,
            WeaponSkills.dlugieLuki,
        ),
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
            CommonSkills.strzalMierzony,
            CommonSkills.silnyCios,
            CommonSkills.ogluszenie,
            CommonSkills.wedrowiec,
            StatsSkills.strzelecWyborowy,
            WeaponSkills.bronUnieruchamiajaca,
        ),
    )

    val Mieszczanin = Profession(
        name = "Mieszczanin",
        ww = 5, us = 0, k = 0, odp = 0, zr = 5, int = 10, sw = 5, ogd = 5,
        
        abilities = listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.powozenie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            RareAbilities.czytanieIPisanie,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaKislevski,
            SpecializedAbilities.znajomoscJezykaTileanski,
            SpecializedAbilities.znajomoscJezykaReikspiel,
        ),
        skills = listOf(
            CommonSkills.zylkaHandlowa,
            StatsSkills.blyskotliwosc,
            StatsSkills.charyzmatyczny,
        ),
    )

    val Mytnik = Profession(
        name = "Mytnik",
        ww = 10, us = 5, k = 5, odp = 10, zr = 5, int = 0, sw = 5, ogd = 0,
        
        abilities = listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            RareAbilities.czytanieIPisanie,
            RareAbilities.unik,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaKislevski,
            SpecializedAbilities.znajomoscJezykaTileanski,
        ),
        skills = listOf(
            StatsSkills.szybkiRefleks,
            StatsSkills.strzelecWyborowy,
        ),
    )

    val Najemnik = Profession(
        name = "Najemnik",
        ww = 10, us = 10, k = 5, odp = 5, zr = 5, int = 0, sw = 5, ogd = 0,
        a = 1, 
        abilities = listOf(
            CommonAbilities.hazard,
            CommonAbilities.jezdziectwo,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.plywanie,
            CommonAbilities.powozenie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            RareAbilities.unik,
            SpecializedAbilities.sekretnyJezykBitewny,
            SpecializedAbilities.wiedzaBretonia,
            SpecializedAbilities.wiedzaKislev,
            SpecializedAbilities.wiedzaTilea,
            SpecializedAbilities.znajomoscJezykaTileanski,
        ),
        skills = listOf(
            CommonSkills.blyskawicznePrzadowanie,
            CommonSkills.ogluszenie,
            CommonSkills.rozbrajanie,
            CommonSkills.silnyCios,
            CommonSkills.szybkieWyciagniecie,
            CommonSkills.strzalMierzony,
        ),
    )

    val Ochotnik = Profession(
        name = "Ochotnik",
        ww = 10, us = 5, k = 5, odp = 5, zr = 10, int = 0, sw = 0, ogd = 0,
        
        abilities = listOf(
            CommonAbilities.hazard,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.plywanie,
            CommonAbilities.powozenie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.blyskawicznePrzadowanie,
            CommonSkills.silnyCios,
            WeaponSkills.bronDwureczna,
        ),
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
            CommonSkills.rozbrajanie,
            CommonSkills.szybkieWyciagniecie,
            StatsSkills.bardzoSilny,
            StatsSkills.niezwykleOdporny,
            WeaponSkills.bronParujaca,
            WeaponSkills.bronRzucana,
        ),
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
            SpecializedAbilities.sekretnyJezykZlodziei,
        ),
        skills = listOf(
            CommonSkills.morderczyAtak,
            CommonSkills.odpornoscNaTrucizny,
            CommonSkills.ogluszenie,
            CommonSkills.rozbrajanie,
            CommonSkills.szybkieWyciagniecie,
            CommonSkills.zapasy,
            StatsSkills.opanowanie,
            StatsSkills.szybkiRefleks,
        ),
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
            SpecializedAbilities.sekretneZnakiZwiadowcow,
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
            CommonAbilities.plotkowanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            RareAbilities.czytanieIPisanie,
            RareAbilities.gadanina,
            SpecializedAbilities.naukaGeneologiaHeraldyka,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaReikspiel,
        ),
        skills = listOf(
            CommonSkills.etykieta,
            CommonSkills.obiezyswiat,
            CommonSkills.zylkaHandlowa,
            StatsSkills.opanowanie,
            StatsSkills.charyzmatyczny,
        ),
    )

    val Pielgrzym = Profession(
        name = "Pielgrzym",
        ww = 5, us = 5, k = 5, odp = 5, zr = 5, int = 10, sw = 10, ogd = 10,
        zyw = 4,
        abilities = KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.mocnaGlowa,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.targowanie,
            RareAbilities.nawigacja,
            SpecializedAbilities.kuglarstwoGawedziarstwo,
            SpecializedAbilities.naukaTeologia,
        ),
        skills = listOf(
            CommonSkills.obiezyswiat,
            StatsSkills.niezwykleOdporny,
        ),
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
            SpecializedAbilities.wiedzaBretonia,
        ),
        skills = listOf(
            CommonSkills.etykieta,
            CommonSkills.odpornoscPsychiczna,
            CommonSkills.odwaga,
            StatsSkills.niezwykleOdporny,
            StatsSkills.twardziel,
        ),
    )

    val PiratRzeczny = Profession(
        name = "Pirat rzeczny",
        ww = 5, us = 10, k = 0, odp = 5, zr = 5, int = 0, sw = 5, ogd = 5,
        
        abilities = listOf(
            CommonAbilities.hazard,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.plywanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.wioslarstwo,
            RareAbilities.nawigacja,
            RareAbilities.unik,
            RareAbilities.zeglarstwo,
            SpecializedAbilities.sekretneZnakiLowcow,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.wiedzaKislev,
            SpecializedAbilities.znajomoscJezykaKislevski,
        ),
        skills = listOf(
            CommonSkills.ogluszenie,
            CommonSkills.strzalMierzony,
            CommonSkills.wedrowiec,
            CommonSkills.wyczucieKierunku,
        ),
    )

    val Podzegacz = Profession(
        name = "Podżegacz",
        ww = 5, us = 5, k = 0, odp = 0, zr = 5, int = 10, sw = 0, ogd = 10,
        
        abilities = listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.ukrywanieSie,
            RareAbilities.czytanieIPisanie,
            SpecializedAbilities.naukaHistoria,
            SpecializedAbilities.naukaPrawo,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaReikspiel,
            SpecializedAbilities.znajomoscJezykaTileanski,
        ),
        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.chodu,
            CommonSkills.przemawianie,
            StatsSkills.opanowanie,
        ),
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
            RareAbilities.oswajanie,
            RareAbilities.tresura,
            RareAbilities.tropienie,
            SpecializedAbilities.wiedzaKislev,
            SpecializedAbilities.wiedzaKrajTrolli,
            SpecializedAbilities.znajomoscJezykaKislevski,
            SpecializedAbilities.znajomoscJezykaUngolski,
        ),
        skills = listOf(
            CommonSkills.obiezyswiat,
            CommonSkills.wedrowiec,
            CommonSkills.wyczucieKierunku,
            WeaponSkills.bronUnieruchamiajaca,
        ),
    )

    val PoganiaczMulow = Profession(
        name = "Poganiacz mułów",
        ww = 5, us = 10, k = 0, odp = 5, zr = 10, int = 10, sw = 5, ogd = 0,

        abilities = LanguageAbilities.All + listOf(
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            RareAbilities.nawigacja,
            SpecializedAbilities.wiedzaKsiestwaGraniczne,
        ),
        skills = listOf(
            CommonSkills.obiezyswiat,
            CommonSkills.wyczucieKierunku,
        ),
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
            SpecializedAbilities.naukaTeologia,
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
            CommonAbilities.plotkowanie,
            CommonAbilities.powozenie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wspinaczka,
            SpecializedAbilities.sekretneZnakiZlodziei,
        ),
        skills = listOf(
            CommonSkills.chodu,
            CommonSkills.lotrzyk,
            CommonSkills.odpornoscNaChoroby,
            CommonSkills.odpornoscPsychiczna,
        ),
    )

    val PoskramiaczNiedzwiedzi = Profession(
        name = "Poskramiacz niedzwiedzi",
        ww = 5, us = 0, k = 10, odp = 5, zr = 5, int = 0, sw = 10, ogd = 5,
        
        abilities = SleightOfHandAbilities.All + listOf(
            CommonAbilities.mocnaGlowa,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.oswajanie,
            RareAbilities.tresura,
            SpecializedAbilities.znajomoscJezykaKislevski,
        ),
        skills = listOf(
            CommonSkills.przemawianie,
            CommonSkills.zapasy,
            StatsSkills.bardzoSilny,
            StatsSkills.niezwykleOdporny,
            StatsSkills.opanowanie,
            StatsSkills.szybkiRefleks,
        ),
    )

    val Poslaniec = Profession(
        name = "Posłaniec",
        ww = 5, us = 5, k = 0, odp = 5, zr = 10, int = 5, sw = 5, ogd = 0,
        
        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plywanie,
            CommonAbilities.plotkowanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            RareAbilities.nawigacja,
            SpecializedAbilities.sekretneZnakiZwiadowcow,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.wiedzaJalowaKraina,
            SpecializedAbilities.znajomoscJezykaReikspiel,
        ),
        skills = listOf(
            CommonSkills.obiezyswiat,
            CommonSkills.wyczucieKierunku,
        ),
    )

    val Przemytnik = Profession(
        name = "Przemytnik",
        ww = 5, us = 5, k = 0, odp = 0, zr = 10, int = 10, sw = 0, ogd = 10,
        
        abilities = listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.plywanie,
            CommonAbilities.powozenie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wioslarstwo,
            CommonAbilities.wycena,
            SpecializedAbilities.sekretnyJezykZlodziei,
            SpecializedAbilities.sekretneZnakiZlodziei,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaKislevski,
        ),
        skills = listOf(
            CommonSkills.lotrzyk,
            CommonSkills.zylkaHandlowa,
        ),
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
            StatsSkills.opanowanie,
            StatsSkills.bardzoSilny,
            WeaponSkills.bronUnieruchamiajaca,
        ),
    )

    val Przewoznik = Profession(
        name = "Przewoźnik",
        ww = 5, us = 5, k = 10, odp = 5, zr = 5, int = 5, sw = 0, ogd = 0,
        
        abilities = listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.plywanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wioslarstwo,
            CommonAbilities.wycena,
            CommonAbilities.zastraszanie,
            SpecializedAbilities.sekretnyJezykLowcow,
            SpecializedAbilities.wiedzaImperium,
        ),

        skills = listOf(
            CommonSkills.bijatyka,
            StatsSkills.charyzmatyczny,
            StatsSkills.strzelecWyborowy,
            WeaponSkills.bronPalna,
        ),
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
            SpecializedAbilities.wiedzaBretonia,
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
            CommonAbilities.mocnaGlowa,
            CommonAbilities.plywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.targowanie,
            CommonAbilities.wioslarstwo,
            RareAbilities.nawigacja,
            RareAbilities.zeglarstwo,
            SpecializedAbilities.rzemiosloHandel,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.wiedzaJalowaKraina,
            SpecializedAbilities.znajomoscJezykaNorski,
            SpecializedAbilities.znajomoscJezykaReikspiel,
        ),

        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.wyczucieKierunku,
            StatsSkills.blyskotliwosc,
            StatsSkills.twardziel,
        ),
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
            SpecializedAbilities.rzemiosloHandel,
            SpecializedAbilities.sekretnyJezykGildii,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.wiedzaJalowaKraina,
        ),
        skills = listOf(
            CommonSkills.obiezyswiat,
            CommonSkills.zylkaHandlowa,
        ),
    )

    val Rzemieslnik = Profession(
        name = "Rzemieślnik",
        ww = 0, us = 0, k = 5, odp = 5, zr = 10, int = 5, sw = 10, ogd = 0,
        
        abilities = CraftAbilities.All + listOf(
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.powozenie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            RareAbilities.czytanieIPisanie,
            SpecializedAbilities.sekretnyJezykGildii,
        ),
        skills = listOf(
            CommonSkills.zylkaHandlowa,
            StatsSkills.blyskotliwosc,
        ),
    )

    val Rzezimieszek = Profession(
        name = "Rzezimieszek",
        ww = 10, us = 0, k = 10, odp = 0, zr = 10, int = 0, sw = 10, ogd = 0,
        a = 1, 
        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.plotkowanie,
            CommonAbilities.targowanie,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.grozny,
            CommonSkills.morderczyAtak,
            CommonSkills.ogluszenie,
            CommonSkills.rozbrajanie,
            CommonSkills.szybkieWyciagniecie,
            CommonSkills.silnyCios,
            StatsSkills.charyzmatyczny,
        ),
    )

    val Skald = Profession(
        name = "Skald",
        ww = 5, us = 0, k = 5, odp = 0, zr = 5, int = 10, sw = 5, ogd = 10,

        abilities = LanguageAbilities.All + SleightOfHandAbilities.All + listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.brzuchomowstwo,
            RareAbilities.gadanina,
            SpecializedAbilities.naukaHistoria,
            SpecializedAbilities.wiedzaNorska,
            SpecializedAbilities.wiedzaPustkowiaChaosu,
            SpecializedAbilities.znajomoscJezykaNorski,
        ),
        skills = listOf(
            CommonSkills.nasladowca,
            CommonSkills.przemawianie,
            StatsSkills.blyskotliwosc,
            StatsSkills.charyzmatyczny,
        ),
    )

    val Skryba = Profession(
        name = "Skryba",
        ww = 0, us = 0, k = 0, odp = 0, zr = 10, int = 10, sw = 10, ogd = 5,
        
        abilities = ScienceAbilities.All + listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            SpecializedAbilities.rzemiosloKaligrafia,
            SpecializedAbilities.sekretnyJezykGildii,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaKlasyczny,
            SpecializedAbilities.znajomoscJezykaReikspiel,
            SpecializedAbilities.znajomoscJezykaTileanski,
        ),
        skills = listOf(
            CommonSkills.poliglota,
        ),
    )

    val Sluga = Profession(
        name = "Sługa",
        ww = 5, us = 0, k = 5, odp = 0, zr = 10, int = 5, sw = 10, ogd = 5,
        
        abilities = listOf(
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.powozenie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            RareAbilities.czytanieIPisanie,
            RareAbilities.gadanina,
            RareAbilities.unik,
            RareAbilities.zwinnePalce,
            SpecializedAbilities.rzemiosloGotowanie,
        ),
        skills = listOf(
            CommonSkills.czulySluch,
            CommonSkills.chodu,
            CommonSkills.etykieta,
            StatsSkills.niezwykleOdporny,
            StatsSkills.szybkiRefleks,
            StatsSkills.twardziel,
        ),
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
            SpecializedAbilities.naukaPrawo,
        ),
        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.ogluszenie,
            CommonSkills.rozbrajanie,
            CommonSkills.silnyCios,
            StatsSkills.blyskotliwosc,
            StatsSkills.opanowanie,
        ),
    )

    val StraznikDrog = Profession(
        name = "Strażnik dróg",
        ww = 10, us = 10, k = 5, odp = 0, zr = 10, int = 5, sw = 5, ogd = 0,
        
        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.powozenie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            RareAbilities.nawigacja,
            RareAbilities.tropienie,
            SpecializedAbilities.sekretneZnakiZwiadowcow,
            SpecializedAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.blyskawicznePrzadowanie,
            CommonSkills.szybkieWyciagniecie,
            WeaponSkills.bronPalna,
        ),
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
            SpecializedAbilities.naukaNekromancja,
            SpecializedAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.blyskawicznePrzadowanie,
            CommonSkills.strzalPrecyzyjny,
            CommonSkills.szybkieWyciagniecie,
            CommonSkills.wedrowiec,
            StatsSkills.bardzoSzybki,
            StatsSkills.blyskotliwosc,
        ),
    )

    val StraznikRzeczny = Profession(
        name = "Strażnik rzeczny",
        ww = 0, us = 10, k = 10, odp = 5, zr = 10, int = 5, sw = 5, ogd = 0,
        
        abilities = listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.plywanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.wioslarstwo,
            RareAbilities.nawigacja,
            RareAbilities.zeglarstwo,
            SpecializedAbilities.znajomoscJezykaKislevski,
            SpecializedAbilities.sekretneZnakiZwiadowcow,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.wiedzaKislev,
        ),
        skills = listOf(
            CommonSkills.wyczucieKierunku,
            StatsSkills.bardzoSilny,
            WeaponSkills.bronPalna,
        ),
    )

    val StraznikSwiatynny = Profession(
        name = "Strażnik świątynny",
        ww = 10, us = 5, k = 5, odp = 5, zr = 5, int = 0, sw = 5, ogd = 0,
        
        abilities = KnowledgeAbilities.All + listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.ogluszenie,
            CommonSkills.odwaga,
            CommonSkills.silnyCios,
            StatsSkills.opanowanie,
        ),
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
            RareAbilities.leczenie,
            RareAbilities.unik,
            RareAbilities.zwinnePalce,
        ),
        skills = listOf(
            CommonSkills.odpornoscNaChoroby,
            CommonSkills.odpornoscNaTrucizny,
            CommonSkills.zapasy,
            WeaponSkills.bronUnieruchamiajaca,
        ),
    )

    val Strielec = Profession(
        name = "Strażnik więzienny",
        ww = 10, us = 10, k = 5, odp = 5, zr = 5, int = 0, sw = 5, ogd = 0,
        
        abilities = listOf(
            CommonAbilities.hazard,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.plotkowanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.unik,
            SpecializedAbilities.wiedzaKislev,
            SpecializedAbilities.znajomoscJezykaKislevski,
        ),
        skills = listOf(
            CommonSkills.artylerzysta,
            CommonSkills.blyskawicznePrzadowanie,
            CommonSkills.strzalMierzony,
            CommonSkills.strzalPrecyzyjny,
            CommonSkills.szybkieWyciagniecie,
            StatsSkills.strzelecWyborowy,
            WeaponSkills.bronDwureczna,
            WeaponSkills.bronPalna,
        ),
    )

    val StrzyganskiMistyk = Profession(
        name = "Strzygański mistyk",
        ww = 5, us = 5, k = 0, odp = 0, zr = 5, int = 5, sw = 10, ogd = 10,
        
        abilities = SleightOfHandAbilities.All + listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.plotkowanie,
            CommonAbilities.powozenie,
            CommonAbilities.przekonywanie,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            RareAbilities.hipnoza,
            RareAbilities.zwinnePalce,
            SpecializedAbilities.rzemiosloAptekarstwo,
            SpecializedAbilities.naukaNekromancja,
            SpecializedAbilities.sekretneZnakiAstrologow,
            SpecializedAbilities.sekretneZnakiLowcow,
            SpecializedAbilities.znajomoscJezykaStrzyganski,
        ),
        skills = listOf(
            CommonSkills.obiezyswiat,
            CommonSkills.szostyZmysl,
            CommonSkills.wedrowiec,
        ),
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
            SpecializedAbilities.naukaAnatomia,
            SpecializedAbilities.wiedzaEstalia,
            SpecializedAbilities.znajomoscJezykaEstalijski,
        ),
        skills = listOf(
            CommonSkills.brawura,
            CommonSkills.silnyCios,
            CommonSkills.szybkieWyciagniecie,
            CommonSkills.morderczyAtak,
            StatsSkills.szybkiRefleks,
            WeaponSkills.bronSzermiercza,
        ),
    )

    val Szlachcic = Profession(
        name = "Szlachcic",
        ww = 10, us = 5, k = 0, odp = 0, zr = 5, int = 5, sw = 5, ogd = 10,
        
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.hazard,
            CommonAbilities.jezdziectwo,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.gadanina,
            SpecializedAbilities.kuglarstwoMuzykalnosc,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.znajomoscJezykaReikspiel,
        ),
        skills = listOf(
            CommonSkills.etykieta,
            CommonSkills.intrygant,
            CommonSkills.przemawianie,
            CommonSkills.szczescie,
            StatsSkills.blyskotliwosc,
            WeaponSkills.bronSzermiercza,
            WeaponSkills.bronParujaca,
        ),
    )

    val Szperacz = Profession(
        name = "Szlachcic",
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

    val Smieciarz = Profession(
        name = "Śmieciarz",
        ww = 5, us = 0, k = 5, odp = 10, zr = 5, int = 0, sw = 5, ogd = 5,
        
        abilities = listOf(
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.powozenie,
            CommonAbilities.przekonywanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            SpecializedAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.lotrzyk,
            CommonSkills.odpornoscNaChoroby,
            StatsSkills.opanowanie,
            StatsSkills.twardziel,
        ),
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
            CommonSkills.czulySluch,
            CommonSkills.morderczyAtak,
            CommonSkills.ogluszenie,
            CommonSkills.silnyCios,
            CommonSkills.wyczucieKierunku,
            StatsSkills.opanowanie,
        ),
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
            SpecializedAbilities.jezykTajemnyMagiczny,
            SpecializedAbilities.naukaMagia,
            SpecializedAbilities.znajomoscJezykaKlasyczny,
        ),
        skills = listOf(
            CommonSkills.dotykMocy,
            CommonSkills.zmyslMagii,
            MagicSkills.magiaProstaTajemna,
            StatsSkills.blyskotliwosc,
            StatsSkills.niezwykleOdporny,
        ),
    )

    val UczennicaCzarownicy = Profession(
        name = "Uczennica czarownicy",
        ww = 0, us = 0, k = 0, odp = 10, zr = 5, int = 10, sw = 10, ogd = 0,
         mag = 1,
        abilities = listOf(
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.zastraszanie,
            RareAbilities.nawigacja,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.jezykTajemnyMagiczny,
            SpecializedAbilities.naukaMagia,
            SpecializedAbilities.wiedzaKislev,
            SpecializedAbilities.znajomoscJezykaKislevski,
        ),
        skills = UniversalMagic.All + listOf(
            CommonSkills.zmyslMagii,
            MagicSkills.magiaProstaLodu,
            StatsSkills.niezwykleOdporny,
            StatsSkills.twardziel,
        ),
    )

    val Weglarz = Profession(
        name = "Węglarz",
        ww = 5, us = 0, k = 5, odp = 5, zr = 5, int = 5, sw = 5, ogd = 5,
        
        abilities = listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.powozenie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.targowanie,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            SpecializedAbilities.sekretneZnakiLowcow,
            SpecializedAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.chodu,
            StatsSkills.bardzoSilny,
            StatsSkills.blyskotliwosc,
        ),
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
            CommonAbilities.plotkowanie,
            CommonAbilities.plywanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.targowanie,
            RareAbilities.leczenie,
            RareAbilities.nawigacja,
            SpecializedAbilities.kuglarstwoGawedziarstwo,
            SpecializedAbilities.kuglarstwoSpiew,
            SpecializedAbilities.kuglarstwoTaniec,
            SpecializedAbilities.sekretneZnakiLowcow,
            SpecializedAbilities.sekretneZnakiZlodziei,
            SpecializedAbilities.sekretnyJezykLowcow,
            SpecializedAbilities.sekretnyJezykZlodziei,
            SpecializedAbilities.wiedzaBretonia,
            SpecializedAbilities.wiedzaEstalia,
            SpecializedAbilities.wiedzaKislev,
            SpecializedAbilities.wiedzaTilea,
        ),
        skills = listOf(
            CommonSkills.obiezyswiat,
            CommonSkills.wedrowiec,
            CommonSkills.wyczucieKierunku,
            StatsSkills.bardzoSzybki,
            StatsSkills.strzelecWyborowy,
        ),
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
            CommonSkills.szybkieWyciagniecie,
            StatsSkills.blyskotliwosc,
            StatsSkills.opanowanie,
            WeaponSkills.bronDwureczna,
        ),
    )

    val WojownikKlanowy = Profession(
        name = "Wojownik klanowy",
        ww = 5, us = 5, k = 0, odp = 0, zr = 10, int = 10, sw = 5, ogd = 0,
        
        abilities = listOf(
            CommonAbilities.przeszukiwanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            RareAbilities.leczenie,
            RareAbilities.tropienie,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.blyskawicznePrzadowanie,
            CommonSkills.wedrowiec,
            StatsSkills.strzelecWyborowy,
            StatsSkills.urodzonyWojownik,
        ),
    )

    val Woznica = Profession(
        name = "Woźnica",
        ww = 5, us = 10, k = 0, odp = 0, zr = 10, int = 0, sw = 5, ogd = 5,
        
        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.powozenie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            RareAbilities.leczenie,
            RareAbilities.nawigacja,
            SpecializedAbilities.sekretneZnakiLowcow,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaKislevski,
            SpecializedAbilities.znajomoscJezykaTileanski,
        ),
        skills = listOf(
            CommonSkills.obiezyswiat,
            CommonSkills.szybkieWyciagniecie,
            WeaponSkills.bronPalna,
        ),
    )

    val Wrozbita = Profession(
        name = "Wróżbita",
        ww = 0, us = 0, k = 0, odp = 0, zr = 5, int = 5, sw = 10, ogd = 15,
        mag = 1,
        abilities = listOf(
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.gadanina,
            RareAbilities.splatanieMagii,
            RareAbilities.tresura,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.jezykTajemnyDemoniczny,
            SpecializedAbilities.jezykTajemnyMagiczny,
            SpecializedAbilities.kuglarstwoWrozenieZDloni,
        ),
        skills = listOf(
            CommonSkills.gusla,
            CommonSkills.przemawianie,
            CommonSkills.szczescie,
            CommonSkills.wyostrzoneZmysly,
            MagicSkills.magiaProstaGusla,
        ),
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
            CommonSkills.rozbrajanie,
            CommonSkills.silnyCios,
            CommonSkills.szybkieWyciagniecie,
            StatsSkills.niezwykleOdporny,
            StatsSkills.szybkiRefleks,
            StatsSkills.twardziel,
            WeaponSkills.bronDwureczna,
        ),
    )

    val Zakapturzony = Profession(
        name = "Zakapturzony",
        ww = 5, us = 10, k = 0, odp = 0, zr = 10, int = 0, sw = 0, ogd = 10,
        a = 1, 
        abilities = listOf(
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            RareAbilities.unik,
            SpecializedAbilities.sekretnyJezykLowcow,
        ),
        skills = listOf(
            CommonSkills.obiezyswiat,
            CommonSkills.wedrowiec,
            StatsSkills.strzelecWyborowy,
            WeaponSkills.dlugieLuki,
        ),
    )

    val Zarzadca = Profession(
        name = "Zarządca",
        ww = 5, us = 5, k = 5, odp = 0, zr = 0, int = 10, sw = 5, ogd = 10,
        
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.jezdziectwo,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.nawigacja,
            SpecializedAbilities.naukaPrawo,
            SpecializedAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.etykieta,
            CommonSkills.geniuszArytmetyczny,
            CommonSkills.przemawianie,
        ),
    )

    val Zlodziej = Profession(
        name = "Złodziej",
        ww = 5, us = 5, k = 0, odp = 0, zr = 15, int = 5, sw = 0, ogd = 10,
        
        abilities = listOf(
            CommonAbilities.charakteryzacja,
            CommonAbilities.hazard,
            CommonAbilities.przekonywanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            CommonAbilities.wycena,
            RareAbilities.czytanieIPisanie,
            RareAbilities.otwieranieZamkow,
            RareAbilities.zwinnePalce,
            SpecializedAbilities.sekretnyJezykZlodziei,
            SpecializedAbilities.sekretneZnakiZlodziei,
        ),
        skills = listOf(
            CommonSkills.geniuszArytmetyczny,
            CommonSkills.lotrzyk,
            CommonSkills.ulicznik,
            CommonSkills.wykrywaniePulapek,
        ),
    )

    val Zak = Profession(
        name = "Żak",
        ww = 0, us = 0, k = 0, odp = 0, zr = 10, int = 10, sw = 5, ogd = 10,
        
        abilities = ScienceAbilities.All + listOf(
            CommonAbilities.mocnaGlowa,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            RareAbilities.leczenie,
            SpecializedAbilities.znajomoscJezykaKlasyczny,
            SpecializedAbilities.znajomoscJezykaReikspiel,
        ),
        skills = listOf(
            CommonSkills.etykieta,
            CommonSkills.geniuszArytmetyczny,
            CommonSkills.obiezyswiat,
            CommonSkills.poliglota,
            StatsSkills.blyskotliwosc,
            StatsSkills.charyzmatyczny,
        ),
    )

    val Zeglarz = Profession(
        name = "Żeglarz",
        ww = 10, us = 5, k = 10, odp = 0, zr = 10, int = 0, sw = 0, ogd = 0,
        a = 1, 
        abilities = listOf(
            CommonAbilities.mocnaGlowa,
            CommonAbilities.plywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.wioslarstwo,
            CommonAbilities.wspinaczka,
            RareAbilities.unik,
            RareAbilities.zeglarstwo,
            SpecializedAbilities.wiedzaBretonia,
            SpecializedAbilities.wiedzaJalowaKraina,
            SpecializedAbilities.wiedzaNorska,
            SpecializedAbilities.wiedzaTilea,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaNorski,
            SpecializedAbilities.znajomoscJezykaTileanski,
        ),
        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.brawura,
            CommonSkills.obiezyswiat,
            CommonSkills.silnyCios,
            StatsSkills.twardziel,
        ),
    )

    val Znachorka = Profession(
        name = "Znachorka",
        ww = 0, us = 0, k = 0, odp = 5, zr = 0, int = 15, sw = 10, ogd = 5,
        
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.leczenie,
            RareAbilities.warzenieTrucizn,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.kuglarstwoGawedziarstwo,
            SpecializedAbilities.naukaDuchy,
            SpecializedAbilities.naukaHistoria,
            SpecializedAbilities.rzemiosloAptekarstwo,
            SpecializedAbilities.rzemiosloZielarstwo,
            SpecializedAbilities.wiedzaKislev,
            SpecializedAbilities.wiedzaKrajTrolli,
            SpecializedAbilities.znajomoscJezykaUngolski,
        ),
        skills = listOf(
            StatsSkills.blyskotliwosc,
            StatsSkills.opanowanie,
        ),
    )

    val Zolnierz = Profession(
        name = "Żołnierz",
        ww = 10, us = 10, k = 0, odp = 0, zr = 10, int = 0, sw = 5, ogd = 0,
        a = 1, 
        abilities = listOf(
            CommonAbilities.hazard,
            CommonAbilities.jezdziectwo,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.powozenie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.leczenie,
            RareAbilities.unik,
            SpecializedAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.blyskawicznePrzadowanie,
            CommonSkills.morderczyAtak,
            CommonSkills.ogluszenie,
            CommonSkills.rozbrajanie,
            CommonSkills.silnyCios,
            CommonSkills.strzalMierzony,
            CommonSkills.strzalPrecyzyjny,
            CommonSkills.szybkieWyciagniecie,
            WeaponSkills.bronDwureczna,
            WeaponSkills.bronPalna
        ),
    )

    val ZolnierzOkretowy = Profession(
        name = "Żołnierz okrętowy",
        ww = 10, us = 10, k = 10, odp = 0, zr = 5, int = 0, sw = 5, ogd = 0,
        a = 1, zyw = 3,
        abilities = listOf(
            CommonAbilities.hazard,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.plotkowanie,
            CommonAbilities.plywanie,
            CommonAbilities.wioslarstwo,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
            SpecializedAbilities.sekretnyJezykBitewny,
            SpecializedAbilities.wiedzaJalowaKraina,
        ),
        skills = listOf(
            CommonSkills.ogluszenie,
            CommonSkills.rozbrajanie,
            CommonSkills.silnyCios,
            CommonSkills.szybkieWyciagniecie,
        ),
    )
    /////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////         ZAAWANSOWANE          ////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////

    val AgentCalunu = Profession(
        name = "Agent Całunu (Morr)",
        ww = 15, us = 10, k = 10, odp = 10, zr = 20, int = 20, sw = 30, ogd = 10,
        a = 1, zyw = 4,
        abilities = ScienceAbilities.All + LanguageAbilities.All + listOf(
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
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.wiedzaTilea,
        ),
        skills = listOf(
            CommonSkills.intrygant,
            CommonSkills.odwaga,
            CommonSkills.szostyZmysl,
            CommonSkills.wyostrzoneZmysly,
            StatsSkills.blyskotliwosc,
            StatsSkills.charyzmatyczny,
            StatsSkills.opanowanie,
        ),
        isStartingProfession = false,
    )

    val Ambasador = Profession(
        name = "Ambasador",
        ww = 10, us = 10, k = 5, odp = 10, zr = 10, int = 30, sw = 30, ogd = 40,
        zyw = 6,
        abilities = KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.jezdziectwo,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.gadanina,
            SpecializedAbilities.kuglarstwoAktorstwo,
            SpecializedAbilities.naukaGeneologiaHeraldyka,
            SpecializedAbilities.naukaHistoria,
        ),
        skills = listOf(
            CommonSkills.etykieta,
            CommonSkills.intrygant,
            CommonSkills.krasomowstwo,
            CommonSkills.poliglota,
            CommonSkills.przemawianie,
            CommonSkills.zylkaHandlowa,
            StatsSkills.blyskotliwosc,
            StatsSkills.charyzmatyczny,
        ),
        isStartingProfession = false,
    )

    val Arcykaplan = Profession(
        name = "Arcykapłan",
        ww = 20, us = 20, k = 15, odp = 15, zr = 15, int = 20, sw = 30, ogd = 25,
        a = 1, zyw = 6, mag = 3,
        abilities = ScienceAbilities.All + KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.plotkowanie,
            CommonAbilities.plywanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.zastraszanie,
            RareAbilities.leczenie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.jezykTajemnyMagiczny,
        ),
        skills = UniversalMagic.All + listOf(
            CommonSkills.dotykMocy,
            CommonSkills.etykieta,
            CommonSkills.medytacja,
            CommonSkills.pancerzWiary,
            CommonSkills.morderczyPocisk,
            CommonSkills.zmyslMagii,
            StatsSkills.niezwykleOdporny,
        ),
        isStartingProfession = false,
    )

    val Arcymag = Profession(
        name = "Arcymag",
        ww = 15, us = 15, k = 5, odp = 15, zr = 20, int = 35, sw = 40, ogd = 20,
        zyw = 5, mag = 4,
        abilities = SecretLanguageAbilities.Common + ScienceAbilities.All + KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.przekonywanie,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
        ),
        skills = UniversalMagic.All + listOf(
            CommonSkills.czarnoksiestwo,
            CommonSkills.dotykMocy,
            CommonSkills.medytacja,
            CommonSkills.morderczyPocisk,
            CommonSkills.zmyslMagii,
            StatsSkills.twardziel,
        ),
        isStartingProfession = false,
    )

    val Arcymistrz = Profession(
        name = "Arcymistrz",
        ww = 40, us = 15, k = 25, odp = 25, zr = 25, int = 15, sw = 30, ogd = 20,
        a = 2, zyw = 8,
        abilities = KnowledgeAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.jezdziectwo,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.tresura,
            RareAbilities.unik,
            SpecializedAbilities.naukaGeneologiaHeraldyka,
            SpecializedAbilities.naukaStrategiaTaktyka,
            SpecializedAbilities.naukaTeologia,
            SpecializedAbilities.sekretneZnakiRycerzyZakonnych,
            SpecializedAbilities.sekretnyJezykBitewny,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaEstalijski,
            SpecializedAbilities.znajomoscJezykaKislevski,
            SpecializedAbilities.znajomoscJezykaTileanski,
        ),
        skills = SpecialWeapon.All + listOf(
            CommonSkills.grozny,
            CommonSkills.nieustraszony,
            CommonSkills.obiezyswiat,
            CommonSkills.odpornoscPsychiczna,
            StatsSkills.bardzoSzybki,
        ),
        isStartingProfession = false,
    )

    val ArcymistrzRun = Profession(
        name = "Arcymistrz run",
        ww = 20, us = 15, k = 20, odp = 15, zr = 15, int = 30, sw = 40, ogd = 15,
        a = 2, zyw = 6, mag = 4,
        abilities = CraftAbilities.All + ScienceAbilities.All + KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.wycena,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.unik,
            RareAbilities.wykuwanieRun,
            SpecializedAbilities.jezykTajemnyKrasnoludzki,
        ),
        skills = SpecialWeapon.All + MinorRuneForging.All + RuneForging.All + MasterRuneForging.All + listOf(
            CommonSkills.morderczyAtak,
            CommonSkills.ogluszenie,
        ),
        isStartingProfession = false,
    )

    val Artylerzysta = Profession(
        name = "Artylerzysta",
        ww = 15, us = 25, k = 10, odp = 10, zr = 15, int = 30, sw = 15, ogd = 0,
        zyw = 5,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.powozenie,
            CommonAbilities.spostrzegawczosc,
            SpecializedAbilities.naukaInzynieria,
            SpecializedAbilities.naukaMechanika,
            SpecializedAbilities.rzemiosloRusznikarstwo,
            SpecializedAbilities.sekretnyJezykBitewny,
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
        isStartingProfession = false,
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
            SpecializedAbilities.naukaGeneologiaHeraldyka,
            SpecializedAbilities.naukaHistoria,
            SpecializedAbilities.naukaStrategiaTaktyka,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.znajomoscJezykaKlasyczny,
            SpecializedAbilities.znajomoscJezykaReikspiel,
        ),
        skills = listOf(
            CommonSkills.krasomowstwo,
            CommonSkills.przemawianie,
            WeaponSkills.bronSzermiercza,
        ),
        isStartingProfession = false,
    )

    val Ataman = Profession(
        name = "Ataman",
        ww = 10, us = 10, k = 5, odp = 15, zr = 5, int = 30, sw = 20, ogd = 25,
        zyw = 4,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.jezdziectwo,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.targowanie,
            CommonAbilities.zastraszanie,
            SpecializedAbilities.naukaHistoria,
            SpecializedAbilities.naukaPrawo,
            SpecializedAbilities.naukaStrategiaTaktyka,
            SpecializedAbilities.naukaTeologia,
            SpecializedAbilities.wiedzaKislev,
            SpecializedAbilities.wiedzaKrajTrolli,
            SpecializedAbilities.znajomoscJezykaKislevski,
        ),
        skills = listOf(
            CommonSkills.przemawianie,
            StatsSkills.charyzmatyczny,
            StatsSkills.opanowanie,
        ),
        isStartingProfession = false,
    )

    val Bard = Profession(
        name = "Bard",
        ww = 10, us = 10, k = 0, odp = 0, zr = 15, int = 10, sw = 5, ogd = 25,
        zyw = 4,
        abilities = KnowledgeAbilities.All + listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            SpecializedAbilities.kuglarstwoMuzykalnosc,
            SpecializedAbilities.kuglarstwoSpiew,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaEltharin,
            SpecializedAbilities.znajomoscJezykaTileanski,
        ),
        skills = listOf(
            CommonSkills.etykieta,
            CommonSkills.przemawianie,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.naukaStrategiaTaktyka,
            SpecializedAbilities.sekretneZnakiLowcow,
            SpecializedAbilities.sekretneZnakiZwiadowcow,
            SpecializedAbilities.sekretnyJezykBitewny,
            SpecializedAbilities.wiedzaBretonia,
        ),
        skills = listOf(
            CommonSkills.blyskawicznePrzadowanie,
            CommonSkills.niepokojacy,
            CommonSkills.przemawianie,
            CommonSkills.strzalPrecyzyjny,
            CommonSkills.strzalPrzebijajacy,
        ),
        isStartingProfession = false,
    )

    val BiczBozy = Profession(
        name = "Bicz boży",
        ww = 25, us = 0, k = 25, odp = 25, zr = 10, int = 0, sw = 30, ogd = 20,
        a = 2, zyw = 8,
        abilities = listOf(
            CommonAbilities.przekonywanie,
            CommonAbilities.zastraszanie,
            RareAbilities.leczenie,
            SpecializedAbilities.naukaTeologia,
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
        isStartingProfession = false,
    )

    val Biczownik = Profession(
        name = "Biczownik",
        ww = 15, us = 0, k = 10, odp = 15, zr = 5, int = 0, sw = 20, ogd = 10,
        a = 1, zyw = 6,
        abilities = listOf(
            CommonAbilities.przekonywanie,
            CommonAbilities.zastraszanie,
            RareAbilities.leczenie,
            SpecializedAbilities.naukaTeologia,
            SpecializedAbilities.znajomoscJezykaKlasyczny,
        ),
        skills = listOf(
            CommonSkills.nieustraszony,
            CommonSkills.silnyCios,
            WeaponSkills.bronDwureczna,
            WeaponSkills.korbacze,
        ),
        isStartingProfession = false,
    )

    val Bosman = Profession(
        name = "Bosman",
        ww = 15, us = 15, k = 10, odp = 15, zr = 10, int = 10, sw = 10, ogd = 10,
        a = 1, zyw = 4,
        abilities = KnowledgeAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.hazard,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.plotkowanie,
            CommonAbilities.plywanie,
            CommonAbilities.wioslarstwo,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
            RareAbilities.zeglarstwo,
            SpecializedAbilities.rzemiosloSzkutnictwo,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaKislevski,
            SpecializedAbilities.znajomoscJezykaNorski,
        ),
        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.obiezyswiat,
            CommonSkills.odpornoscNaChoroby,
        ),
        isStartingProfession = false,
    )

    val Brygadzista = Profession(
        name = "Brygadzista",
        ww = 10, us = 5, k = 10, odp = 10, zr = 5, int = 5, sw = 15, ogd = 15,
        zyw = 4,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.hazard,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            RareAbilities.unik,
            RareAbilities.zeglarstwo,
            SpecializedAbilities.kuglarstwoSpiew,
            SpecializedAbilities.sekretnyJezykGildii,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.wiedzaJalowaKraina,
            SpecializedAbilities.wiedzaKislev,
        ),
        skills = listOf(
            CommonSkills.lotrzyk,
            CommonSkills.przemawianie,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.naukaInzynieria,
            SpecializedAbilities.naukaStrategiaTaktyka,
            SpecializedAbilities.rzemiosloKamieniarstwo,
            SpecializedAbilities.rzemiosloStolarstwo,
            SpecializedAbilities.wiedzaBretonia,
        ),
        skills = listOf(
            StatsSkills.szybkiRefleks,
            WeaponSkills.bronMechaniczna,
        ),
        isStartingProfession = false,
    )

    val Ceremoniarz = Profession(
        name = "Ceremoniarz",
        ww = 10, us = 10, k = 5, odp = 5, zr = 0, int = 20, sw = 15, ogd = 10,
        zyw = 4,
        abilities = KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            SpecializedAbilities.naukaTeologia,
        ),
        skills = listOf(
            CommonSkills.przemawianie,
            CommonSkills.zylkaHandlowa,
        ),
        isStartingProfession = false,
    )

    val Czarownik = Profession(
        name = "Czarownik",
        ww = 5, us = 5, k = 5, odp = 10, zr = 10, int = 10, sw = 15, ogd = 15,
        zyw = 4, mag = 2,
        abilities = KnowledgeAbilities.All + listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.plywanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.zastraszanie,
            RareAbilities.leczenie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.rzemiosloAptekarstwo,
            SpecializedAbilities.rzemiosloZielarstwo,
        ),
        skills = listOf(
            CommonSkills.czarnoksiestwo,
            CommonSkills.czarostwo,
            CommonSkills.morderczyPocisk,
        ),
        isStartingProfession = false,
    )

    val Czarnoksieznik = Profession(
        name = "Czarnoksiężnik",
        ww = 10, us = 10, k = 10, odp = 10, zr = 15, int = 15, sw = 20, ogd = 20,
        zyw = 5, mag = 3,
        abilities = KnowledgeAbilities.All + listOf(
            CommonAbilities.charakteryzacja,
            CommonAbilities.jezdziectwo,
            CommonAbilities.plotkowanie,
            CommonAbilities.plywanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.hipnoza,
            RareAbilities.leczenie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.naukaDemonologia,
            SpecializedAbilities.naukaNekromancja,
            SpecializedAbilities.rzemiosloAptekarstwo,
            SpecializedAbilities.rzemiosloZielarstwo,
        ),
        skills = listOf(
            CommonSkills.czarnoksiestwo,
            MagicSkills.magiaCzarnoksieskaChaos,
            MagicSkills.magiaCzarnoksieskaNekromacja,
            StatsSkills.niezwykleOdporny,
            StatsSkills.twardziel,
        ),
        isStartingProfession = false,
    )

    val CzarnyStraznik = Profession(
        name = "Czarny strażnik (Morr)",
        ww = 25, us = 15, k = 10, odp = 15, zr = 15, int = 5, sw = 20, ogd = 0,
        a = 1, zyw = 4,
        abilities = LanguageAbilities.All + listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
            SpecializedAbilities.naukaNekromancja,
            SpecializedAbilities.naukaTeologia,
            SpecializedAbilities.sekretnyJezykBitewny,
        ),
        skills = listOf(
            CommonSkills.grozny,
            CommonSkills.odwaga,
            CommonSkills.silnyCios,
            CommonSkills.strzalMierzony,
            CommonSkills.strzalPrecyzyjny,
            CommonSkills.strzalPrzebijajacy,
            WeaponSkills.dlugieLuki,
            WeaponSkills.bronDwureczna,
            WeaponSkills.bronKawaleryjska,
            WeaponSkills.kusze,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.naukaHistoria,
            SpecializedAbilities.naukaPrawo,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.znajomoscJezykaReikspiel,
        ),
        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.etykieta,
            CommonSkills.lotrzyk,
            CommonSkills.krasomowstwo,
            CommonSkills.przemawianie,
        ),
        isStartingProfession = false,
    )

    val Dworak = Profession(
        name = "Dworak",
        ww = 15, us = 5, k = 10, odp = 15, zr = 15, int = 20, sw = 20, ogd = 10,
        zyw = 4,
        abilities = LanguageAbilities.All + listOf(
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
            SpecializedAbilities.wiedzaKsiestwaGraniczne,
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
        isStartingProfession = false,
    )

    val Dworzanin = Profession(
        name = "Dworzanin",
        ww = 5, us = 5, k = 0, odp = 0, zr = 10, int = 20, sw = 20, ogd = 20,
        zyw = 4,
        abilities = SleightOfHandAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.hazard,
            CommonAbilities.jezdziectwo,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.wycena,
            RareAbilities.czytanieIPisanie,
            RareAbilities.gadanina,
            SpecializedAbilities.naukaHistoria,
            SpecializedAbilities.naukaSztuka,
            SpecializedAbilities.wiedzaBretonia,
            SpecializedAbilities.wiedzaTilea,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaReikspiel,
            SpecializedAbilities.znajomoscJezykaTileanski,
        ),
        skills = listOf(
            CommonSkills.etykieta,
            CommonSkills.intrygant,
            CommonSkills.przemawianie,
            CommonSkills.zylkaHandlowa,
            StatsSkills.blyskotliwosc,
            StatsSkills.charyzmatyczny,
            WeaponSkills.bronSzermiercza,
        ),
        isStartingProfession = false,
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
        skills = SpecialWeapon.All + listOf(
            CommonSkills.artylerzysta,
            CommonSkills.blyskawicznePrzadowanie,
            CommonSkills.blyskawicznyBlok,
            CommonSkills.strzalPrecyzyjny,
            CommonSkills.szybkieWyciagniecie,
            CommonSkills.zapasy,
        ),
        isStartingProfession = false,
    )

    val HandlarzNiewolnikami = Profession(
        name = "Handlarz niewolnikami",
        ww = 20, us = 20, k = 20, odp = 0, zr = 10, int = 0, sw = 10, ogd = 0,
         zyw = 4,
        abilities = LanguageAbilities.All + listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.powozenie,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            CommonAbilities.zastraszanie,
            RareAbilities.torturowanie,
            RareAbilities.tropienie,
            SpecializedAbilities.wiedzaBretonia,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.wiedzaTilea,
        ),
        skills = listOf(
            CommonSkills.grozny,
            CommonSkills.lotrzyk,
            CommonSkills.obiezyswiat,
            CommonSkills.ogluszenie,
            CommonSkills.przemawianie,
            CommonSkills.zylkaHandlowa,
            WeaponSkills.bronUnieruchamiajaca,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.naukaGeneologiaHeraldyka,
            SpecializedAbilities.naukaHistoria,
            SpecializedAbilities.wiedzaBretonia,
            SpecializedAbilities.wiedzaKislev,
            SpecializedAbilities.wiedzaTilea,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaKislevski,
            SpecializedAbilities.znajomoscJezykaReikspiel,
            SpecializedAbilities.znajomoscJezykaTileanski,
        ),
        skills = listOf(
            CommonSkills.etykieta,
            CommonSkills.krasomowstwo,
            CommonSkills.przemawianie,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.naukaStrategiaTaktyka,
            SpecializedAbilities.sekretneZnakiZwiadowcow,
            SpecializedAbilities.sekretneZnakiZlodziei,
            SpecializedAbilities.sekretnyJezykBitewny,
            SpecializedAbilities.sekretnyJezykZlodziei,
            SpecializedAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.blyskawicznePrzadowanie,
            CommonSkills.blyskawicznyBlok,
            CommonSkills.strzalPrecyzyjny,
            CommonSkills.strzalPrzebijajacy,
            CommonSkills.szybkieWyciagniecie,
        ),
        isStartingProfession = false,
    )

    val Husarz = Profession(
        name = "Husarz",
        ww = 25, us = 15, k = 15, odp = 15, zr = 15, int = 0, sw = 15, ogd = 15,
        a = 1, zyw = 4,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.jezdziectwo,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            RareAbilities.nawigacja,
            SpecializedAbilities.naukaStrategiaTaktyka,
            SpecializedAbilities.sekretnyJezykBitewny,
            SpecializedAbilities.wiedzaKislev,
            SpecializedAbilities.wiedzaKrajTrolli,
            SpecializedAbilities.znajomoscJezykaKislevski,
        ),
        skills = listOf(
            CommonSkills.morderczyAtak,
            CommonSkills.mierzonyCios,
            CommonSkills.silnyCios,
            StatsSkills.niezwykleOdporny,
            StatsSkills.twardziel,
            WeaponSkills.bronKawaleryjska,
        ),
        isStartingProfession = false,
    )

    val Inzynier = Profession(
        name = "Inżynier",
        ww = 10, us = 15, k = 5, odp = 5, zr = 10, int = 20, sw = 10, ogd = 0,
        zyw = 4,
        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.powozenie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            SpecializedAbilities.naukaInzynieria,
            SpecializedAbilities.naukaMechanika,
            SpecializedAbilities.rzemiosloRusznikarstwo,
            SpecializedAbilities.wiedzaKrasnoludy,
            SpecializedAbilities.wiedzaTilea,
            SpecializedAbilities.znajomoscJezykaKhazalid,
            SpecializedAbilities.znajomoscJezykaTileanski,
        ),
        skills = listOf(
            CommonSkills.artylerzysta,
            WeaponSkills.bronMechaniczna,
            WeaponSkills.bronPalna,
        ),
        isStartingProfession = false,
    )

    val Kapitan = Profession(
        name = "Kapitan",
        ww = 25, us = 20, k = 15, odp = 20, zr = 20, int = 20, sw = 25, ogd = 30,
        a = 2, zyw = 6,
        abilities = KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.plywanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.tresura,
            RareAbilities.unik,
            RareAbilities.zeglarstwo,
            SpecializedAbilities.naukaStrategiaTaktyka,
            SpecializedAbilities.rzemiosloKartografia,
            SpecializedAbilities.rzemiosloSzkutnictwo,
        ),
        skills = listOf(
            CommonSkills.blyskawicznyBlok,
            CommonSkills.brawura,
            CommonSkills.obiezyswiat,
            CommonSkills.rozbrajanie,
            CommonSkills.silnyCios,
            WeaponSkills.bronSzermiercza,
        ),
        isStartingProfession = false,
    )

    val Kaplan = Profession(
        name = "Kapłan",
        ww = 10, us = 10, k = 5, odp = 10, zr = 5, int = 10, sw = 20, ogd = 15,
        zyw = 4, mag = 1,
        abilities = ScienceAbilities.All + KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.plotkowanie,
            CommonAbilities.plywanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            RareAbilities.leczenie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.jezykTajemnyMagiczny,
        ),
        skills = SimplePriestlyMagic.All + listOf(
            CommonSkills.krasomowstwo,
            CommonSkills.morderczyAtak,
            CommonSkills.ogluszenie,
            CommonSkills.pancerzWiary,
        ),
        isStartingProfession = false,
    )

    val KaplanWojownik = Profession(
        name = "Kapłan - wojownik",
        ww = 20, us = 15, k = 10, odp = 10, zr = 15, int = 15, sw = 25, ogd = 15,
        a = 1, zyw = 5, mag = 2,
        abilities = KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.jezdziectwo,
            RareAbilities.leczenie,
            RareAbilities.splatanieMagii,
            RareAbilities.unik,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.jezykTajemnyMagiczny,
            SpecializedAbilities.naukaStrategiaTaktyka,
            SpecializedAbilities.naukaTeologia,
            SpecializedAbilities.sekretnyJezykBitewny,
        ),
        skills = PriestlyMagic.All + UniversalMagic.All + listOf(
            CommonSkills.dotykMocy,
            CommonSkills.medytacja,
            CommonSkills.pancerzWiary,
            CommonSkills.silnyCios,
            WeaponSkills.bronDwureczna,
        ),
        isStartingProfession = false,
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
            RareAbilities.czytanieIPisanie,
            RareAbilities.czytanieZWarg,
            RareAbilities.gadanina,
            RareAbilities.zwinnePalce,
            SpecializedAbilities.rzemiosloGotowanie,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaKislevski,
            SpecializedAbilities.znajomoscJezykaReikspiel,
            SpecializedAbilities.znajomoscJezykaTileanski,
        ),
        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.etykieta,
            CommonSkills.lotrzyk,
            CommonSkills.ogluszenie,
            CommonSkills.zylkaHandlowa,
        ),
        isStartingProfession = false,
    )

    val Katecheta = Profession(
        name = "Katecheta",
        ww = 0, us = 0, k = 5, odp = 5, zr = 10, int = 20, sw = 15, ogd = 10,
        zyw = 4,
        abilities = ScienceAbilities.All + KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            RareAbilities.czytanieIPisanie,
        ),
        skills = listOf(
            CommonSkills.przemawianie,
        ),
        isStartingProfession = false,
    )

    val Koniuszy = Profession(
        name = "Koniuszy",
        ww = 5, us = 15, k = 15, odp = 10, zr = 15, int = 20, sw = 15, ogd = 25,
        zyw = 5,
        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.powozenie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.oswajanie,
            RareAbilities.tresura,
            RareAbilities.unik,
        ),
        skills = listOf(
            StatsSkills.bardzoSilny,
            StatsSkills.opanowanie,
            StatsSkills.twardziel,
            WeaponSkills.bronUnieruchamiajaca,
        ),
        isStartingProfession = false,
    )

    val KonnyLucznik = Profession(
        name = "Konny łucznik",
        ww = 15, us = 25, k = 15, odp = 15, zr = 15, int = 0, sw = 15, ogd = 5,
        a = 1, zyw = 4,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.jezdziectwo,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            RareAbilities.nawigacja,
            RareAbilities.unik,
            SpecializedAbilities.naukaStrategiaTaktyka,
            SpecializedAbilities.wiedzaKislev,
            SpecializedAbilities.wiedzaKrajTrolli,
            SpecializedAbilities.znajomoscJezykaKislevski,
            SpecializedAbilities.znajomoscJezykaUngolski,
        ),
        skills = listOf(
            CommonSkills.blyskawicznePrzadowanie,
            CommonSkills.strzalPrecyzyjny,
            CommonSkills.strzalPrzebijajacy,
            CommonSkills.szybkieWyciagniecie,
            StatsSkills.opanowanie,
            StatsSkills.twardziel,
            WeaponSkills.bronKawaleryjska,
        ),
        isStartingProfession = false,
    )

    val KowalRun = Profession(
        name = "Kowal run",
        ww = 10, us = 5, k = 10, odp = 5, zr = 5, int = 20, sw = 25, ogd = 5,
        zyw = 3, mag = 2,
        abilities = CraftAbilities.All + KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.wycena,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.unik,
            RareAbilities.wykuwanieRun,
            SpecializedAbilities.jezykTajemnyKrasnoludzki,
            SpecializedAbilities.naukaHistoria,
            SpecializedAbilities.naukaRuny,
        ),
        skills = MinorRuneForging.All + RuneForging.All + listOf(
            CommonSkills.talentArtystyczny,
            StatsSkills.twardziel,
        ),
        isStartingProfession = false,
    )

    val Krzyzowiec = Profession(
        name = "Krzyżowiec",
        ww = 30, us = 10, k = 20, odp = 20, zr = 20, int = 20, sw = 25, ogd = 15,
        a = 2, zyw = 8,
        abilities = KnowledgeAbilities.All + listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            RareAbilities.nawigacja,
            SpecializedAbilities.naukaHistoria,
            SpecializedAbilities.naukaStrategiaTaktyka,
            SpecializedAbilities.sekretnyJezykBitewny,
            SpecializedAbilities.naukaRuny,
            SpecializedAbilities.znajomoscJezykaArabski,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaEstalijski,
            SpecializedAbilities.znajomoscJezykaTileanski,
        ),
        skills = listOf(
            CommonSkills.morderczyAtak,
            CommonSkills.obiezyswiat,
            CommonSkills.odwaga,
            CommonSkills.ogluszenie,
            CommonSkills.wyczucieKierunku,
            CommonSkills.poliglota,
            WeaponSkills.bronParujaca,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.sekretneZnakiZlodziei,
            SpecializedAbilities.sekretnyJezykZlodziei,
            SpecializedAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.grozny,
            CommonSkills.intrygant,
            CommonSkills.lotrzyk,
            CommonSkills.odpornoscNaTrucizny,
            CommonSkills.przemawianie,
            CommonSkills.szostyZmysl,
            CommonSkills.zylkaHandlowa,
            CommonSkills.intrygant,
            WeaponSkills.kusze,
            WeaponSkills.bronParujaca,
        ),
        isStartingProfession = false,
    )

    val Kupiec = Profession(
        name = "Kupiec",
        ww = 10, us = 10, k = 5, odp = 5, zr = 10, int = 25, sw = 20, ogd = 20,
        zyw = 4,
        abilities = KnowledgeAbilities.All + listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.plotkowanie,
            CommonAbilities.powozenie,
            CommonAbilities.przekonywanie,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            RareAbilities.czytanieIPisanie,
            SpecializedAbilities.rzemiosloHandel,
            SpecializedAbilities.sekretnyJezykGildii,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaEstalijski,
            SpecializedAbilities.znajomoscJezykaKislevski,
            SpecializedAbilities.znajomoscJezykaReikspiel,
        ),
        skills = listOf(
            CommonSkills.geniuszArytmetyczny,
            CommonSkills.lotrzyk,
            CommonSkills.zylkaHandlowa,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.sekretneZnakiLowcow,
            SpecializedAbilities.sekretnyJezykLowcow,
        ),
        skills = listOf(
            CommonSkills.blyskawicznePrzadowanie,
            CommonSkills.blyskawicznyBlok,
            CommonSkills.strzalPrecyzyjny,
            CommonSkills.strzalPrzebijajacy,
            CommonSkills.szybkieWyciagniecie,
            StatsSkills.bardzoSzybki,
            StatsSkills.twardziel,
        ),
        isStartingProfession = false,
    )

    val LodowaCzarownica = Profession(
        name = "Lodowa czarownica",
        ww = 15, us = 0, k = 5, odp = 20, zr = 15, int = 30, sw = 40, ogd = 15,
         zyw = 6, mag = 4,
        abilities = ScienceAbilities.All + KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.jezdziectwo,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.jezykTajemnyMagiczny,
        ),
        skills = UniversalMagic.All + listOf(
            CommonSkills.dotykMocy,
            CommonSkills.grozny,
            CommonSkills.niepokojacy,
        ),
        isStartingProfession = false,
    )

    val LodowaPanna = Profession(
        name = "Lodowa panna",
        ww = 5, us = 0, k = 5, odp = 10, zr = 5, int = 20, sw = 25, ogd = 10,
         zyw = 4, mag = 2,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.jezdziectwo,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.nawigacja,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.jezykTajemnyMagiczny,
            SpecializedAbilities.naukaMagia,
            SpecializedAbilities.wiedzaKislev,
            SpecializedAbilities.znajomoscJezykaKislevski,
        ),
        skills = UniversalMagic.All + listOf(
            CommonSkills.medytacja,
            CommonSkills.morderczyPocisk,
            CommonSkills.odpornoscPsychiczna,
            CommonSkills.odwaga,
            StatsSkills.opanowanie,
            MagicSkills.magiaCzarownicTradycjaLodu,
        ),
        isStartingProfession = false,
    )

    val LowcaCzarownic = Profession(
        name = "Łowca czarownic",
        ww = 30, us = 30, k = 15, odp = 15, zr = 15, int = 15, sw = 35, ogd = 20,
        a = 2, zyw = 6,
        abilities = LanguageAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.jezdziectwo,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            SpecializedAbilities.naukaMagia,
            SpecializedAbilities.naukaNekromancja,
            SpecializedAbilities.naukaTeologia,
            SpecializedAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.blyskawicznyBlok,
            CommonSkills.grozny,
            CommonSkills.odwaga,
            CommonSkills.przemawianie,
            CommonSkills.silnyCios,
            CommonSkills.szostyZmysl,
            StatsSkills.strzelecWyborowy,
            StatsSkills.szybkiRefleks,
            WeaponSkills.kusze,
            WeaponSkills.bronRzucana,
            WeaponSkills.bronUnieruchamiajaca,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.naukaHistoria,
            SpecializedAbilities.naukaNekromancja,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.znajomoscJezykaKlasyczny,
        ),
        skills = listOf(
            CommonSkills.blyskawicznePrzadowanie,
            CommonSkills.grotolaz,
            CommonSkills.morderczyAtak,
            CommonSkills.odwaga,
            CommonSkills.silnyCios,
            CommonSkills.strzalPrecyzyjny,
            WeaponSkills.kusze,
        ),
        isStartingProfession = false,
    )

    val MagisterRewizor = Profession(
        name = "Magister rewizor",
        ww = 15, us = 10, k = 5, odp = 10, zr = 20, int = 25, sw = 30, ogd = 15,
        zyw = 5, mag = 3,
        abilities = KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.plotkowanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.splatanieMagii,
            RareAbilities.torturowanie,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.jezykTajemnyDemoniczny,
            SpecializedAbilities.jezykTajemnyMagiczny,
            SpecializedAbilities.naukaMagia,
            SpecializedAbilities.naukaNekromancja,
        ),
        skills = UniversalMagic.All + listOf(
            CommonSkills.dotykMocy,
            CommonSkills.grozny,
            CommonSkills.intrygant,
            CommonSkills.morderczyPocisk,
            CommonSkills.odpornoscPsychiczna,
            CommonSkills.odwaga,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.naukaPrawo,
            SpecializedAbilities.rzemiosloHandel,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.znajomoscJezykaReikspiel,
        ),
        skills = listOf(
            CommonSkills.geniuszArytmetyczny,
            CommonSkills.przemawianie,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.rzemiosloAptekarstwo,
            SpecializedAbilities.znajomoscJezykaKlasyczny,
        ),
        skills = listOf(
            CommonSkills.chirurgia,
            CommonSkills.odpornoscNaChoroby,
            CommonSkills.ogluszenie,
        ),
        isStartingProfession = false,
    )

    val MistrzCieni = Profession(
        name = "Mistrz Cieni",
        ww = 20, us = 20, k = 10, odp = 10, zr = 40, int = 25, sw = 20, ogd = 25,
        a = 1, zyw = 6,
        abilities = listOf(
            CommonAbilities.charakteryzacja,
            CommonAbilities.hazard,
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
            RareAbilities.czytanieZWarg,
            RareAbilities.otwieranieZamkow,
            RareAbilities.unik,
            RareAbilities.zwinnePalce,
            SpecializedAbilities.sekretneZnakiZlodziei,
            SpecializedAbilities.sekretnyJezykZlodziei,
        ),
        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.brawura,
            CommonSkills.lotrzyk,
            CommonSkills.wykrywaniePulapek,
            WeaponSkills.kusze,
            WeaponSkills.bronRzucana,
        ),
        isStartingProfession = false,
    )

    val MistrzGildii = Profession(
        name = "Mistrz gildii",
        ww = 10, us = 10, k = 0, odp = 10, zr = 15, int = 30, sw = 20, ogd = 35,
        a = 1, zyw = 5,
        abilities = CraftAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            SpecializedAbilities.naukaHistoria,
            SpecializedAbilities.sekretnyJezykGildii,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaEstalijski,
            SpecializedAbilities.znajomoscJezykaKislevski,
            SpecializedAbilities.znajomoscJezykaNorski,
            SpecializedAbilities.znajomoscJezykaReikspiel,
        ),
        skills = listOf(
            CommonSkills.etykieta,
            CommonSkills.poliglota,
            CommonSkills.zylkaHandlowa,
        ),
        isStartingProfession = false,
    )

    val MistrzMagii = Profession(
        name = "Mistrz magii",
        ww = 10, us = 10, k = 0, odp = 10, zr = 15, int = 30, sw = 35, ogd = 15,
        zyw = 4, mag = 3,
        abilities = SecretLanguageAbilities.Common + ScienceAbilities.All + KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
        ),
        skills = UniversalMagic.All + listOf(
            CommonSkills.czarnoksiestwo,
            CommonSkills.dotykMocy,
            CommonSkills.medytacja,
            CommonSkills.morderczyPocisk,
            CommonSkills.odpornoscPsychiczna,
            CommonSkills.zmyslMagii,
        ),
        isStartingProfession = false,
    )

    val MistrzRun = Profession(
        name = "Mistrz run",
        ww = 15, us = 10, k = 15, odp = 10, zr = 10, int = 25, sw = 35, ogd = 10,
        a = 1, zyw = 5, mag = 3,
        abilities = CraftAbilities.All + ScienceAbilities.All + KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.plotkowanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.wycena,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.unik,
            RareAbilities.wykuwanieRun,
            SpecializedAbilities.jezykTajemnyKrasnoludzki,
        ),
        skills = MinorRuneForging.All + RuneForging.All + MasterRuneForging.All + listOf(
            CommonSkills.rozbrajanie,
            CommonSkills.silnyCios,
            WeaponSkills.bronDwureczna,
            WeaponSkills.korbacze,
        ),
        isStartingProfession = false,
    )

    val MistrzRzemiosla = Profession(
        name = "Mistrz rzemiosła",
        ww = 0, us = 0, k = 10, odp = 10, zr = 20, int = 10, sw = 10, ogd = 10,
        zyw = 3,
        abilities = CraftAbilities.All + listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.powozenie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            SpecializedAbilities.sekretnyJezykGildii,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaKhazalid,
            SpecializedAbilities.znajomoscJezykaTileanski,
        ),
        skills = listOf(
            CommonSkills.etykieta,
            CommonSkills.talentArtystyczny,
        ),
        isStartingProfession = false,
    )

    val MistrzZakonny = Profession(
        name = "Mistrz zakonny",
        ww = 35, us = 10, k = 20, odp = 20, zr = 20, int = 15, sw = 25, ogd = 15,
        a = 2, zyw = 8,
        abilities = KnowledgeAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.jezdziectwo,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            RareAbilities.tresura,
            RareAbilities.unik,
            SpecializedAbilities.naukaGeneologiaHeraldyka,
            SpecializedAbilities.naukaStrategiaTaktyka,
            SpecializedAbilities.naukaTeologia,
            SpecializedAbilities.sekretneZnakiZwiadowcow,
            SpecializedAbilities.sekretneZnakiRycerzyZakonnych,
            SpecializedAbilities.sekretnyJezykBitewny,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaEstalijski,
            SpecializedAbilities.znajomoscJezykaKislevski,
            SpecializedAbilities.znajomoscJezykaTileanski,
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
        isStartingProfession = false,
    )

    val Mistyk = Profession(
        name = "Mistyk",
        ww = 0, us = 0, k = 0, odp = 10, zr = 10, int = 10, sw = 15, ogd = 15,
        zyw = 4,
        abilities = LanguageAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.przekonywanie,
            CommonAbilities.zastraszanie,
            RareAbilities.gadanina,
            RareAbilities.torturowanie,
            SpecializedAbilities.naukaTeologia,
        ),
        skills = listOf(
            CommonSkills.grozny,
            CommonSkills.przemawianie,
        ),
        isStartingProfession = false,
    )

    val Mnich = Profession(
        name = "Mnich",
        ww = 5, us = 0, k = 5, odp = 5, zr = 10, int = 25, sw = 15, ogd = 15,
        zyw = 4,
        abilities = ScienceAbilities.All + KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            RareAbilities.leczenie,
            SpecializedAbilities.jezykTajemnyMagiczny,
        ),
        skills = listOf(
            CommonSkills.poliglota,
        ),
        isStartingProfession = false,
    )

    val Nawigator = Profession(
        name = "Nawigator",
        ww = 10, us = 10, k = 5, odp = 5, zr = 10, int = 25, sw = 10, ogd = 5,
        zyw = 4,
        abilities = KnowledgeAbilities.All + listOf(
            CommonAbilities.plywanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            RareAbilities.nawigacja,
            SpecializedAbilities.naukaAstronomia,
            SpecializedAbilities.rzemiosloKartografia,
            SpecializedAbilities.znajomoscJezykaKlasyczny,
        ),
        skills = listOf(
            CommonSkills.wyczucieKierunku,
        ),
        isStartingProfession = false,
    )

    val Obszarnik = Profession(
        name = "Obszarnik",
        ww = 5, us = 10, k = 0, odp = 0, zr = 10, int = 5, sw = 10, ogd = 10,
        zyw = 3,
        abilities = CraftAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.powozenie,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,
            SpecializedAbilities.wiedzaNorska,
        ),
        skills = listOf(
            CommonSkills.intrygant,
            CommonSkills.przemawianie,
            CommonSkills.zylkaHandlowa,
            StatsSkills.blyskotliwosc,
            StatsSkills.charyzmatyczny,
        ),
        isStartingProfession = false,
    )

    val Opat = Profession(
        name = "Opat",
        ww = 10, us = 0, k = 10, odp = 10, zr = 10, int = 30, sw = 25, ogd = 20,
        zyw = 6,
        abilities = ScienceAbilities.All + KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            RareAbilities.leczenie,
            SpecializedAbilities.jezykTajemnyMagiczny,
            SpecializedAbilities.rzemiosloKartografia,
            SpecializedAbilities.znajomoscJezykaKlasyczny,
        ),
        skills = listOf(
            CommonSkills.krasomowstwo,
            CommonSkills.odpornoscPsychiczna,
            StatsSkills.blyskotliwosc,
        ),
        isStartingProfession = false,
    )

    val Odkrywca = Profession(
        name = "Odkrywca",
        ww = 20, us = 20, k = 10, odp = 15, zr = 15, int = 25, sw = 20, ogd = 15,
        a = 1, zyw = 6,
        abilities = KnowledgeAbilities.All + LanguageAbilities.All + listOf(
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
            SpecializedAbilities.naukaHistoria,
            SpecializedAbilities.naukaPrawo,
            SpecializedAbilities.rzemiosloKartografia,
            SpecializedAbilities.sekretneZnakiZwiadowcow,
            SpecializedAbilities.sekretnyJezykLowcow,
        ),
        skills = listOf(
            CommonSkills.obiezyswiat,
            CommonSkills.poliglota,
            CommonSkills.wyczucieKierunku,
        ),
        isStartingProfession = false,
    )

    val Oficer = Profession(
        name = "Oficer",
        ww = 30, us = 20, k = 20, odp = 20, zr = 20, int = 15, sw = 15, ogd = 25,
        a = 2, zyw = 7,
        abilities = KnowledgeAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.jezdziectwo,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.unik,
            SpecializedAbilities.naukaStrategiaTaktyka,
            SpecializedAbilities.sekretnyJezykBitewny,
            SpecializedAbilities.znajomoscJezykaKislevski,
            SpecializedAbilities.znajomoscJezykaTileanski,
        ),
        skills = listOf(
            CommonSkills.blyskawicznyBlok,
            CommonSkills.rozbrajanie,
            CommonSkills.szybkieWyciagniecie,
            WeaponSkills.bronDwureczna,
            WeaponSkills.bronKawaleryjska,
            WeaponSkills.korbacze,
            WeaponSkills.bronParujaca,
        ),
        isStartingProfession = false,
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
        isStartingProfession = false,
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
            CommonSkills.lotrzyk,
            CommonSkills.ogluszenie,
            CommonSkills.zylkaHandlowa,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.wiedzaBretonia,
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
        isStartingProfession = false,
    )

    val Prawiedzma = Profession(
        name = "Prawiedźma",
        ww = 0, us = 0, k = 5, odp = 20, zr = 10, int = 40, sw = 30, ogd = 15,
         zyw = 6, mag = 3,
        abilities = SecretLanguageAbilities.All + ScienceAbilities.All + KnowledgeAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.leczenie,
            RareAbilities.oswajanie,
            RareAbilities.warzenieTrucizn,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.rzemiosloAptekarstwo,
            SpecializedAbilities.rzemiosloZielarstwo,
            SpecializedAbilities.znajomoscJezykaUngolski,
        ),
        skills = UniversalMagic.All + listOf(
            CommonSkills.bystryWzrok,
            CommonSkills.szczescie,
            CommonSkills.szostyZmysl,
            CommonSkills.wedrowiec,
            CommonSkills.zmyslMagii,
            MagicSkills.magiaCzarownicTradycjaWiedzm
        ),
        isStartingProfession = false,
    )

    val Psalterzysta = Profession(
        name = "Psałterzysta",
        ww = 20, us = 10, k = 10, odp = 10, zr = 15, int = 10, sw = 10, ogd = 10,
        a = 1, zyw = 6,
        abilities = KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            SpecializedAbilities.kuglarstwoMuzykalnosc,
            SpecializedAbilities.kuglarstwoSpiew,
            SpecializedAbilities.naukaTeologia,
        ),
        skills = listOf(
            CommonSkills.zaspiew,
        ),
        isStartingProfession = false,
    )

    val Rajtar = Profession(
        name = "Rajtar",
        ww = 20, us = 20, k = 10, odp = 10, zr = 15, int = 0, sw = 15, ogd = 15,
        a = 1, zyw = 4,
        abilities = listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.wycena,
            RareAbilities.unik,
            SpecializedAbilities.sekretneZnakiZwiadowcow,
        ),
        skills = listOf(
            CommonSkills.blyskawicznePrzadowanie,
            CommonSkills.silnyCios,
            CommonSkills.strzalMierzony,
            CommonSkills.strzalPrzebijajacy,
            CommonSkills.szybkieWyciagniecie,
            WeaponSkills.bronPalna,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.grozny,
            CommonSkills.lotrzyk,
            CommonSkills.ogluszenie,
            CommonSkills.silnyCios,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.wiedzaImperium,
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
        isStartingProfession = false,
    )

    val Rycerz = Profession(
        name = "Rycerz",
        ww = 25, us = 0, k = 15, odp = 15, zr = 15, int = 5, sw = 15, ogd = 5,
        a = 1, zyw = 4,
        abilities = LanguageAbilities.All + listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.unik,
            SpecializedAbilities.naukaGeneologiaHeraldyka,
            SpecializedAbilities.naukaStrategiaTaktyka,
            SpecializedAbilities.naukaTeologia,
            SpecializedAbilities.sekretnyJezykBitewny,
        ),
        skills = listOf(
            CommonSkills.silnyCios,
            WeaponSkills.bronDwureczna,
            WeaponSkills.bronKawaleryjska,
            WeaponSkills.korbacze,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.naukaGeneologiaHeraldyka,
            SpecializedAbilities.naukaStrategiaTaktyka,
            SpecializedAbilities.naukaTeologia,
            SpecializedAbilities.sekretnyJezykBitewny,
            SpecializedAbilities.wiedzaBretonia,
        ),
        skills = Blessing.All + listOf(
            CommonSkills.krzepki,
            CommonSkills.morderczyAtak,
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
        isStartingProfession = false,
    )

    val RycerzKrolestwa = Profession(
        name = "Rycerz Królestwa",
        ww = 25, us = 0, k = 15, odp = 15, zr = 15, int = 0, sw = 10, ogd = 15,
        a = 1, zyw = 4,
        abilities = LanguageAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.jezdziectwo,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.unik,
            SpecializedAbilities.naukaGeneologiaHeraldyka,
            SpecializedAbilities.naukaStrategiaTaktyka,
            SpecializedAbilities.naukaTeologia,
            SpecializedAbilities.sekretnyJezykBitewny,
        ),
        skills = Virtue.All + listOf(
            CommonSkills.silnyCios,
            WeaponSkills.bronDwureczna,
            WeaponSkills.bronKawaleryjska,
        ),
        isStartingProfession = false,
    )

    val RycerzKruka = Profession(
        name = "Rycerz Kruka",
        ww = 35, us = 15, k = 20, odp = 20, zr = 20, int = 15, sw = 30, ogd = 10,
        a = 2, zyw = 8,
        abilities = KnowledgeAbilities.All + listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            RareAbilities.tresura,
            RareAbilities.tropienie,
            RareAbilities.unik,
            SpecializedAbilities.naukaHistoria,
            SpecializedAbilities.naukaNekromancja,
            SpecializedAbilities.naukaStrategiaTaktyka,
            SpecializedAbilities.naukaTeologia,
            SpecializedAbilities.sekretnyJezykBitewny,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaKislevski,
        ),
        skills = listOf(
            CommonSkills.artylerzysta,
            CommonSkills.blyskawicznePrzadowanie,
            CommonSkills.blyskawicznyBlok,
            CommonSkills.mierzonyCios,
            CommonSkills.morderczyAtak,
            CommonSkills.obiezyswiat,
            CommonSkills.odpornoscPsychiczna,
            CommonSkills.odwaga,
            CommonSkills.strzalMierzony,
            CommonSkills.szostyZmysl,
            CommonSkills.szybkieWyciagniecie,
            StatsSkills.opanowanie,
            StatsSkills.strzelecWyborowy,
            WeaponSkills.bronDwureczna,
            WeaponSkills.dlugieLuki,
            WeaponSkills.kusze,
            WeaponSkills.bronParujaca,
        ),
        isStartingProfession = false,
    )

    val RycerzPantery = Profession(
        name = "Rycerz Pantery",
        ww = 30, us = 0, k = 15, odp = 15, zr = 15, int = 10, sw = 10, ogd = 15,
        a = 1, zyw = 6,
        abilities = LanguageAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.jezdziectwo,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.tresura,
            RareAbilities.unik,
            SpecializedAbilities.naukaGeneologiaHeraldyka,
            SpecializedAbilities.naukaStrategiaTaktyka,
            SpecializedAbilities.sekretnyJezykBitewny,
            SpecializedAbilities.wiedzaImperium,
        ),
        skills = SpecialWeapon.All + listOf(
            CommonSkills.etykieta,
            CommonSkills.krzepki,
            CommonSkills.morderczyAtak,
            CommonSkills.mierzonyCios,
            CommonSkills.zylkaHandlowa,
            StatsSkills.opanowanie,
            StatsSkills.urodzonyWojownik,
        ),
        isStartingProfession = false,
    )

    val RycerzProby = Profession(
        name = "Rycerz Próby",
        ww = 35, us = 0, k = 20, odp = 20, zr = 25, int = 10, sw = 25, ogd = 25,
        a = 2, zyw = 6,
        abilities = KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.jezdziectwo,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            RareAbilities.unik,
            SpecializedAbilities.naukaGeneologiaHeraldyka,
            SpecializedAbilities.naukaStrategiaTaktyka,
            SpecializedAbilities.naukaTeologia,
            SpecializedAbilities.sekretnyJezykBitewny,
        ),
        skills = listOf(
            CommonSkills.krzepki,
            CommonSkills.morderczyAtak,
            CommonSkills.obiezyswiat,
            CommonSkills.silnyCios,
            CommonSkills.szczescie,
            StatsSkills.bardzoSilny,
            StatsSkills.niezwykleOdporny,
            StatsSkills.urodzonyWojownik,
            KnightSkills.cnotaWyprawyRycerskiej,
            WeaponSkills.bronDwureczna,
        ),
        isStartingProfession = false,
    )

    val Sierzant = Profession(
        name = "Sierżant",
        ww = 20, us = 15, k = 10, odp = 10, zr = 10, int = 10, sw = 10, ogd = 20,
        a = 1, zyw = 4,
        abilities = KnowledgeAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.jezdziectwo,
            CommonAbilities.plotkowanie,
            CommonAbilities.plywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
            SpecializedAbilities.naukaStrategiaTaktyka,
            SpecializedAbilities.sekretnyJezykBitewny,
            SpecializedAbilities.znajomoscJezykaTileanski,
        ),
        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.grozny,
            CommonSkills.obiezyswiat,
            CommonSkills.ogluszenie,
            CommonSkills.silnyCios,
            CommonSkills.zapasy,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.sekretneZnakiZlodziei,
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
        isStartingProfession = false,
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
            SpecializedAbilities.wiedzaBretonia,
        ),
        skills = listOf(
            CommonSkills.grozny,
            CommonSkills.krasomowstwo,
            CommonSkills.przemawianie,
            StatsSkills.charyzmatyczny,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.wiedzaKsiestwaGraniczne,
        ),
        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.grozny,
            CommonSkills.intrygant,
            CommonSkills.szybkieWyciagniecie,
            WeaponSkills.bronUnieruchamiajaca,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.blyskawicznePrzadowanie,
            CommonSkills.strzalMierzony,
            CommonSkills.strzalPrecyzyjny,
            CommonSkills.strzalPrzebijajacy,
            WeaponSkills.dlugieLuki,
            WeaponSkills.kusze,
            WeaponSkills.bronRzucana,
        ),
        isStartingProfession = false,
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
        isStartingProfession = false,
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
            SpecializedAbilities.sekretnyJezykZlodziei,
            SpecializedAbilities.wiedzaBretonia,
            SpecializedAbilities.wiedzaTilea,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaReikspiel,
            SpecializedAbilities.znajomoscJezykaTileanski,
        ),
        skills = listOf(
            CommonSkills.chodu,
            CommonSkills.intrygant,
            CommonSkills.lotrzyk,
            CommonSkills.nasladowca,
            CommonSkills.obiezyswiat,
            CommonSkills.przemawianie,
        ),
        isStartingProfession = false,
    )

    val Szpieg = Profession(
        name = "Szpieg",
        ww = 15, us = 15, k = 5, odp = 10, zr = 20, int = 20, sw = 35, ogd = 20,
        a = 1, zyw = 4,
        abilities = KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.charakteryzacja,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.ukrywanieSie,
            RareAbilities.czytanieZWarg,
            RareAbilities.otwieranieZamkow,
            RareAbilities.sledzenie,
            RareAbilities.zwinnePalce,
            SpecializedAbilities.kuglarstwoAktorstwo,
            SpecializedAbilities.sekretnyJezykBitewny,
            SpecializedAbilities.sekretnyJezykGildii,
            SpecializedAbilities.sekretnyJezykLowcow,
            SpecializedAbilities.sekretnyJezykZlodziei,
        ),
        skills = listOf(
            CommonSkills.chodu,
            CommonSkills.intrygant,
            CommonSkills.poliglota,
            CommonSkills.szostyZmysl,
            StatsSkills.charyzmatyczny,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.sekretneZnakiZwiadowcow,
            SpecializedAbilities.sekretnyJezykLowcow,
            SpecializedAbilities.wiedzaKsiestwaGraniczne,
        ),
        skills = listOf(
            CommonSkills.chodu,
            CommonSkills.szostyZmysl,
            CommonSkills.wedrowiec,
            CommonSkills.wyczucieKierunku,
            StatsSkills.niezwykleOdporny,
        ),
        isStartingProfession = false,
    )

    val Uczony = Profession(
        name = "Uczony",
        ww = 5, us = 5, k = 5, odp = 5, zr = 10, int = 30, sw = 15, ogd = 15,
        zyw = 4,
        abilities = ScienceAbilities.All + KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.wycena,
            RareAbilities.czytanieIPisanie,
            SpecializedAbilities.rzemiosloKartografia,
        ),
        skills = listOf(
            CommonSkills.poliglota,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.kuglarstwoAktorstwo,
            SpecializedAbilities.naukaGeneologiaHeraldyka,
            SpecializedAbilities.naukaHistoria,
            SpecializedAbilities.naukaPrawo,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.znajomoscJezykaReikspiel,
        ),
        skills = listOf(
            CommonSkills.etykieta,
            CommonSkills.intrygant,
            CommonSkills.lotrzyk,
            CommonSkills.krasomowstwo,
            CommonSkills.przemawianie,
            CommonSkills.zylkaHandlowa,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.kuglarstwoGawedziarstwo,
        ),
        skills = listOf(
            CommonSkills.morderczyAtak,
            CommonSkills.mierzonyCios,
            CommonSkills.niepokojacy,
            CommonSkills.nieustraszony,
            CommonSkills.silnyCios,
            StatsSkills.bardzoSilny,
            StatsSkills.niezwykleOdporny,
            WeaponSkills.bronDwureczna,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.sekretnyJezykBitewny,
            SpecializedAbilities.wiedzaImperium,
        ),
        skills = SpecialWeapon.All + listOf(
            CommonSkills.blyskawicznePrzadowanie,
            CommonSkills.morderczyAtak,
            CommonSkills.strzalPrecyzyjny,
            CommonSkills.silnyCios,
            StatsSkills.bardzoSilny,
            StatsSkills.niezwykleOdporny,
        ),
        isStartingProfession = false,
    )

    val WedrownyCzarodziej = Profession(
        name = "Wędrowny czarodziej",
        ww = 5, us = 5, k = 0, odp = 5, zr = 10, int = 20, sw = 25, ogd = 10,
        zyw = 3, mag = 2,
        abilities = ScienceAbilities.All + KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.plotkowanie,
            CommonAbilities.plywanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.jezykTajemnyMagiczny,
        ),
        skills = UniversalMagic.All + TraditionsOfMagic.All + listOf(
            CommonSkills.czarnoksiestwo,
            CommonSkills.dotykMocy,
            CommonSkills.medytacja,
            CommonSkills.morderczyPocisk,
            CommonSkills.zmyslMagii,
            StatsSkills.niezwykleOdporny,
            MagicSkills.magiaCzarnoksieskaChaos,
            MagicSkills.magiaCzarnoksieskaNekromacja,
            MagicSkills.magiaCzarnoksieskaNurgl,
            MagicSkills.magiaCzarnoksieskaSlaanesh,
            MagicSkills.magiaCzarnoksieskaTzeentch,
        ),
        isStartingProfession = false,
    )

    val Wiedzma = Profession(
        name = "Wiedźma",
        ww = 0, us = 0, k = 5, odp = 10, zr = 5, int = 25, sw = 20, ogd = 10,
        zyw = 4, mag = 1,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.leczenie,
            RareAbilities.warzenieTrucizn,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.jezykTajemnyMagiczny,
            SpecializedAbilities.naukaDuchy,
            SpecializedAbilities.naukaHistoria,
            SpecializedAbilities.rzemiosloAptekarstwo,
            SpecializedAbilities.rzemiosloZielarstwo,
            SpecializedAbilities.wiedzaKislev,
            SpecializedAbilities.wiedzaKrajTrolli,
            SpecializedAbilities.znajomoscJezykaUngolski,
        ),
        skills = UniversalMagic.All + listOf(
            CommonSkills.dotykMocy,
            CommonSkills.medytacja,
            CommonSkills.odpornoscPsychiczna,
            StatsSkills.twardziel,
            MagicSkills.magiaProstaWiedzm,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.sekretneZnakiZlodziei,
            SpecializedAbilities.sekretnyJezykZlodziei,
        ),
        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.lotrzyk,
            CommonSkills.ulicznik,
            CommonSkills.wykrywaniePulapek,
        ),
        isStartingProfession = false,
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
            CommonSkills.morderczyAtak,
            CommonSkills.mierzonyCios,
            CommonSkills.niepokojacy,
            CommonSkills.nieustraszony,
            CommonSkills.silnyCios,
            StatsSkills.bardzoSilny,
            StatsSkills.niezwykleOdporny,
            WeaponSkills.bronDwureczna,
        ),
        isStartingProfession = false,
    )

    val WtajemniczonyKultuKhorna = Profession(
        name = "Wtajemniczony kultu Khorna",
        ww = 40, us = 5, k = 20, odp = 30, zr = 10, int = 0, sw = 15, ogd = 5,
        a = 2, zyw = 7,
        abilities = KnowledgeAbilities.All + listOf(
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
            WeaponSkills.bronDwureczna,
            WeaponSkills.korbacze,
        ),
        isStartingProfession = false,
    )

    val WtajemniczonyKultuNurgla = Profession(
        name = "Wtajemniczony kultu Nurgla",
        ww = 15, us = 5, k = 5, odp = 30, zr = 10, int = 5, sw = 20, ogd = 15,
        a = 1, zyw = 5, mag = 2,
        abilities = SecretLanguageAbilities.All + ScienceAbilities.All + KnowledgeAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.splatanieMagii,
            RareAbilities.warzenieTrucizn,
            RareAbilities.wykrywanieMagii,
        ),
        skills = UniversalMagic.All + listOf(
            CommonSkills.medytacja,
            CommonSkills.morderczyAtak,
            CommonSkills.morderczyPocisk,
            CommonSkills.mierzonyCios,
            CommonSkills.straszny,
            CommonSkills.zmyslMagii,
            MagicSkills.magiaCzarnoksieskaNurgl,
            StatsSkills.opanowanie,
        ),
        isStartingProfession = false,
    )

    val WtajemniczonyKultuSlaanesha = Profession(
        name = "Wtajemniczony kultu Slaanesha",
        ww = 10, us = 10, k = 5, odp = 5, zr = 20, int = 30, sw = 0, ogd = 40,
        a = 1, zyw = 5, mag = 2,
        abilities =SecretLanguageAbilities.All + SleightOfHandAbilities.All + ScienceAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.charakteryzacja,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.wycena,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
        ),
        skills = UniversalMagic.All + listOf(
            CommonSkills.grozny,
            CommonSkills.intrygant,
            CommonSkills.ogluszenie,
            CommonSkills.nieustraszony,
            CommonSkills.odpornoscNaTrucizny,
            CommonSkills.zmyslMagii,
            CommonSkills.zylkaHandlowa,
            MagicSkills.magiaCzarnoksieskaSlaanesh,
            StatsSkills.blyskotliwosc,
            StatsSkills.szybkiRefleks,
        ),
        isStartingProfession = false,
    )

    val WtajemniczonyKultuTzeentcha = Profession(
        name = "Wtajemniczony kultu Tzeentcha",
        ww = 10, us = 10, k = 5, odp = 5, zr = 10, int = 40, sw = 20, ogd = 30,
        a = 1, zyw = 5, mag = 2,
        abilities = SecretLanguageAbilities.All + ScienceAbilities.All + LanguageAbilities.All + KnowledgeAbilities.All + listOf(
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
        skills = UniversalMagic.All + listOf(
            CommonSkills.grozny,
            CommonSkills.krasomowstwo,
            CommonSkills.medytacja,
            CommonSkills.morderczyPocisk,
            CommonSkills.odwaga,
            CommonSkills.zmyslMagii,
            CommonSkills.zylkaHandlowa,
            MagicSkills.magiaCzarnoksieskaTzeentch,
        ),
        isStartingProfession = false,
    )

    val WybraniecBozy = Profession(
        name = "Wybraniec Boży",
        ww = 15, us = 15, k = 10, odp = 10, zr = 10, int = 15, sw = 25, ogd = 20,
        a = 1, zyw = 5, mag = 2,
        abilities = ScienceAbilities.All + KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.plywanie,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            RareAbilities.leczenie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.jezykTajemnyMagiczny,
        ),
        skills = UniversalMagic.All + PriestlyMagic.All + listOf(
            CommonSkills.dotykMocy,
            CommonSkills.obiezyswiat,
            CommonSkills.medytacja,
            CommonSkills.pancerzWiary,
            CommonSkills.silnyCios,
            CommonSkills.zmyslMagii,
        ),
        isStartingProfession = false,
    )

    val ZabojcaDemonow = Profession(
        name = "Zabójca demonów",
        ww = 40, us = 0, k = 30, odp = 30, zr = 20, int = 0, sw = 30, ogd = 0,
        a = 2, zyw = 8,
        abilities = KnowledgeAbilities.All + listOf(
            CommonAbilities.mocnaGlowa,
            CommonAbilities.wspinaczka,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.blyskawicznyBlok,
            CommonSkills.niepokojacy,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.naukaNekromancja,
        ),
        skills = listOf(
            CommonSkills.blyskawicznePrzadowanie,
            CommonSkills.grozny,
            CommonSkills.mierzonyCios,
            CommonSkills.morderczyAtak,
            CommonSkills.niepokojacy,
            CommonSkills.nieustraszony,
            CommonSkills.odwaga,
            CommonSkills.silnyCios,
            CommonSkills.strzalPrecyzyjny,
            CommonSkills.szalBojowy,
            CommonSkills.szostyZmysl,
            CommonSkills.ulicznik,
            CommonSkills.wedrowiec,
            StatsSkills.bardzoSilny,
            StatsSkills.niezwykleOdporny,
            StatsSkills.szybkiRefleks,
            WeaponSkills.bronDwureczna,
            WeaponSkills.kusze,
            WeaponSkills.bronRzucana,
        ),
        isStartingProfession = false,
    )

    val ZabojcaOlbrzymow = Profession(
        name = "Zabójca olbrzymów",
        ww = 25, us = 0, k = 15, odp = 15, zr = 10, int = 0, sw = 20, ogd = 0,
        a = 1, zyw = 6,
        abilities = KnowledgeAbilities.All + listOf(
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
        isStartingProfession = false,
    )

    val ZakapturzonyBrat = Profession(
        name = "Zakapturzony Brat",
        ww = 25, us = 10, k = 15, odp = 15, zr = 25, int = 30, sw = 25, ogd = 30,
        a = 1, zyw = 6,
        abilities = SignsAndLanguagesAbilities.All + CraftAbilities.All + KnowledgeAbilities.All + LanguageAbilities.All + listOf(
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
            CommonSkills.nasladowca,
            CommonSkills.poliglota,
            CommonSkills.ulicznik,
            StatsSkills.opanowanie,
        ),
        isStartingProfession = false,
    )

    val Zakonnik = Profession(
        name = "Zakonnik",
        ww = 10, us = 0, k = 5, odp = 10, zr = 0, int = 15, sw = 15, ogd = 15,
        zyw = 4,
        abilities = KnowledgeAbilities.All + listOf(
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            RareAbilities.leczenie,
            SpecializedAbilities.naukaTeologia,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaEstalijski,
            SpecializedAbilities.znajomoscJezykaKislevski,
            SpecializedAbilities.znajomoscJezykaKlasyczny,
            SpecializedAbilities.znajomoscJezykaReikspiel,
            SpecializedAbilities.znajomoscJezykaTileanski,
        ),
        skills = listOf(
            CommonSkills.obiezyswiat,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.sekretnyJezykBitewny,
            SpecializedAbilities.wiedzaBretonia,
        ),
        skills = SpecialWeapon.All + listOf(
            CommonSkills.ogluszenie,
            CommonSkills.wedrowiec,
            StatsSkills.bardzoSilny,
            StatsSkills.niezwykleOdporny,
        ),
        isStartingProfession = false,
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
            CommonSkills.morderczyAtak,
            CommonSkills.oburecznosc,
            CommonSkills.rozbrajanie,
            CommonSkills.silnyCios,
            CommonSkills.strzalMierzony,
            CommonSkills.strzalPrecyzyjny,
            CommonSkills.szybkieWyciagniecie,
            WeaponSkills.bronPalna,
            WeaponSkills.bronParujaca,
            WeaponSkills.bronSzermiercza,
        ),
        isStartingProfession = false,
    )

    val Zwiadowca = Profession(
        name = "Zwiadowca",
        ww = 20, us = 20, k = 10, odp = 10, zr = 15, int = 20, sw = 15, ogd = 0,
        a = 1, zyw = 6,
        abilities = KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.ukrywanieSie,
            RareAbilities.nawigacja,
            RareAbilities.oswajanie,
            RareAbilities.tropienie,
            RareAbilities.unik,
            SpecializedAbilities.sekretneZnakiZwiadowcow,
            SpecializedAbilities.sekretnyJezykLowcow,
        ),
        skills = listOf(
            CommonSkills.blyskawicznePrzadowanie,
            CommonSkills.strzalPrecyzyjny,
            CommonSkills.strzalPrzebijajacy,
            CommonSkills.wyczucieKierunku,
            WeaponSkills.dlugieLuki,
            WeaponSkills.kusze,
        ),
        isStartingProfession = false,
    )


    /////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////        NOWE      /////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
    val Aptekarz = Profession(
        name = "Aptekarz",
        ww = 0, us = 0, k = 0, odp = 5, zr = 5, int = 10, sw = 10, ogd = 5,
        
        abilities = listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.targowanie,
            RareAbilities.leczenie,
            RareAbilities.warzenieTrucizn,
            SpecializedAbilities.naukaAlchemia,
            SpecializedAbilities.rzemiosloAptekarstwo,
            SpecializedAbilities.sekretnyJezykGildii,
            SpecializedAbilities.znajomoscJezykaKlasyczny,
        ),
        skills = listOf(
            CommonSkills.etykieta,
            CommonSkills.odpornoscNaTrucizny,
            StatsSkills.charyzmatyczny,
            StatsSkills.niezwykleOdporny,
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
            SpecializedAbilities.kuglarstwoGawedziarstwo,
            SpecializedAbilities.naukaAstronomia,
            SpecializedAbilities.naukaFizyka,
            SpecializedAbilities.sekretneZnakiAstrologow,
            SpecializedAbilities.wiedzaBretonia,
            SpecializedAbilities.wiedzaEstalia,
            SpecializedAbilities.wiedzaImperium,
            SpecializedAbilities.wiedzaKislev,
            SpecializedAbilities.wiedzaTilea,
            SpecializedAbilities.znajomoscJezykaBretonski,
            SpecializedAbilities.znajomoscJezykaEstalijski,
            SpecializedAbilities.znajomoscJezykaKislevski,
            SpecializedAbilities.znajomoscJezykaTileanski,
            SpecializedAbilities.znajomoscJezykaKlasyczny,
        ),
        skills = listOf(
            CommonSkills.chodu,
            CommonSkills.etykieta,
            CommonSkills.geniuszArytmetyczny,
            CommonSkills.szczescie,
        ),
        isStartingProfession = false,
    )

    val Bajarz = Profession(
        name = "Bajarz",
        ww = 5, us = 0, k = 0, odp = 0, zr = 5, int = 10, sw = 10, ogd = 10,
        
        abilities = KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.gadanina,
            SpecializedAbilities.kuglarstwoGawedziarstwo,
            SpecializedAbilities.kuglarstwoKomedianctwo,
        ),
        skills = listOf(
            CommonSkills.etykieta,
            CommonSkills.obiezyswiat,
            CommonSkills.przemawianie,
            StatsSkills.twardziel,
        ),
    )

    val Egzorcysta = Profession(
        name = "Egzorcysta",
        ww = 0, us = 0, k = 10, odp = 15, zr = 15, int = 20, sw = 35, ogd = 20,
        a = 1, zyw = 6, mag = 2,
        abilities = LanguageAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.hipnoza,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.jezykTajemnyDemoniczny,
            SpecializedAbilities.jezykTajemnyMagiczny,
            SpecializedAbilities.naukaDemonologia,
            SpecializedAbilities.naukaNekromancja,
            SpecializedAbilities.naukaTeologia,
        ),
        skills = UniversalMagic.All + PriestlyMagic.All + listOf(
            CommonSkills.grozny,
            CommonSkills.odpornoscPsychiczna,
            CommonSkills.odwaga,
            CommonSkills.szostyZmysl,
            StatsSkills.blyskotliwosc,
            StatsSkills.opanowanie,
        ),
        isStartingProfession = false,
    )

    val Falszerz = Profession(
        name = "Fałszerz",
        ww = 5, us = 5, k = 10, odp = 10, zr = 20, int = 20, sw = 10, ogd = 10,
        zyw = 3,
        abilities = KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.targowanie,
            CommonAbilities.wycena,

            RareAbilities.czytanieIPisanie,

            SpecializedAbilities.naukaSztuka,
            SpecializedAbilities.rzemiosloKaligrafia,
            SpecializedAbilities.rzemiosloKowalstwo,
            SpecializedAbilities.rzemiosloSztuka,
            SpecializedAbilities.sekretneZnakiZlodziei,
        ),
        skills = listOf(
            CommonSkills.chodu,
            CommonSkills.talentArtystyczny,
            CommonSkills.zylkaHandlowa,
            StatsSkills.charyzmatyczny,
            StatsSkills.opanowanie,
        ),
        isStartingProfession = false,
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
            RareAbilities.gadanina,
            RareAbilities.zwinnePalce,

            SpecializedAbilities.kuglarstwoGawedziarstwo,
            SpecializedAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.czlowiekGuma,
            CommonSkills.lotrzyk,
            StatsSkills.bardzoSilny,
        ),
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
            SpecializedAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.czlowiekGuma,
            CommonSkills.lotrzyk,
            StatsSkills.bardzoSilny,
        ),
    )

    val Latarnik = Profession(
        name = "Latarnik",
        ww = 5, us = 0, k = 5, odp = 0, zr = 10, int = 5, sw = 5, ogd = 5,
        
        abilities = listOf(
            CommonAbilities.mocnaGlowa,
            CommonAbilities.plotkowanie,
            CommonAbilities.powozenie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.targowanie,
            CommonAbilities.wspinaczka,
            SpecializedAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.bystryWzrok,
            CommonSkills.chodu,
            StatsSkills.blyskotliwosc,
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
            SpecializedAbilities.wiedzaSkaveny,
            SpecializedAbilities.znajomoscJezykaQueekish,
        ),
        skills = listOf(
            CommonSkills.bystryWzrok,
            CommonSkills.chodu,
            CommonSkills.czulySluch,
            StatsSkills.twardziel,
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
            SpecializedAbilities.naukaHistoria,
            SpecializedAbilities.naukaStrategiaTaktyka,
            SpecializedAbilities.naukaTeologia,
            SpecializedAbilities.sekretnyJezykBitewny,
            SpecializedAbilities.sekretneZnakiRycerzyZakonnych,
            SpecializedAbilities.wiedzaEstalia,
            SpecializedAbilities.wiedzaTilea,
            SpecializedAbilities.znajomoscJezykaEstalijski,
            SpecializedAbilities.znajomoscJezykaTileanski,
        ),
        skills = listOf(
            CommonSkills.etykieta,
            CommonSkills.morderczyAtak,
            CommonSkills.obiezyswiat,
            CommonSkills.odwaga,
            CommonSkills.rozbrajanie,
            WeaponSkills.bronKawaleryjska,
            WeaponSkills.bronParujaca,
            WeaponSkills.bronSzermiercza,
        ),
        isStartingProfession = false,
    )

    val StraznikKanalow = Profession(
        name = "Strażnik kanałów",
        ww = 10, us = 5, k = 0, odp = 10, zr = 5, int = 0, sw = 10, ogd = 0,
        
        abilities = listOf(
            CommonAbilities.plywanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,

            RareAbilities.tropienie,
            RareAbilities.unik,

            SpecializedAbilities.sekretneZnakiZwiadowcow,
        ),
        skills = listOf(
            CommonSkills.grotolaz,
            CommonSkills.szybkieWyciagniecie,
            CommonSkills.odpornoscNaChoroby,
        ),
    )

    val Szuler = Profession(
        name = "Szuler",
        ww = 10, us = 5, k = 0, odp = 10, zr = 5, int = 0, sw = 10, ogd = 0,
        
        abilities = listOf(
            CommonAbilities.hazard,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,

            RareAbilities.czytanieIPisanie,
            RareAbilities.gadanina,
            RareAbilities.zwinnePalce,

            SpecializedAbilities.sekretneZnakiZlodziei,
            SpecializedAbilities.sekretnyJezykZlodziei,
        ),
        skills = listOf(
            CommonSkills.chodu,
            CommonSkills.etykieta,
            CommonSkills.lotrzyk,
            CommonSkills.szczescie,
        ),
    )

    val SledczyVereny = Profession(
        name = "Śledczy Vereny",
        ww = 10, us = 10, k = 10, odp = 10, zr = 20, int = 30, sw = 20, ogd = 20,
        a = 1, zyw = 5,
        abilities = ScienceAbilities.All + KnowledgeAbilities.All + LanguageAbilities.All + listOf(
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
            SpecializedAbilities.sekretneZnakiAstrologow,
            SpecializedAbilities.sekretneZnakiLowcow,
            SpecializedAbilities.sekretneZnakiRycerzyZakonnych,
            SpecializedAbilities.sekretneZnakiZlodziei,
            SpecializedAbilities.sekretneZnakiZwiadowcow,
        ),
        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.lotrzyk,
            CommonSkills.odpornoscPsychiczna,
            CommonSkills.ulicznik,
            CommonSkills.wyostrzoneZmysly,
            StatsSkills.blyskotliwosc,
            StatsSkills.opanowanie,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.wiedzaImperium,
        ),
        skills = listOf(
            CommonSkills.nieustraszony,
            CommonSkills.odpornoscNaChoroby,
            StatsSkills.opanowanie,
        ),
    )

/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////      SKAVENY     /////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////


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
            StatsSkills.niezwykleOdporny,
            StatsSkills.szybkiRefleks,
            StatsSkills.twardziel,
            WeaponSkills.bronDwureczna,
        ),
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
            SpecializedAbilities.naukaTeologia,
            SpecializedAbilities.wiedzaSkaveny,
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
            SpecializedAbilities.naukaInzynieria,
            SpecializedAbilities.wiedzaSkaveny,
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
            SpecializedAbilities.wiedzaSkaveny,
        ),
        skills = listOf(
            CommonSkills.grotolaz,
            WeaponSkills.proce,
        ),
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
            SpecializedAbilities.wiedzaSkaveny,
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
            SpecializedAbilities.wiedzaSkaveny,
        ),
        skills = listOf(
            CommonSkills.grotolaz,
            CommonSkills.wedrowiec,
            CommonSkills.wyczucieKierunku,
            StatsSkills.bardzoSzybki,
            WeaponSkills.proce,
            WeaponSkills.bronRzucana,
        ),
    )

    val UczenSzaregoProroka = Profession(
        name = "Uczeń szarego proroka",
        ww = 5, us = 5, k = 0, odp = 0, zr = 10, int = 10, sw = 15, ogd = 5,
        zyw = 3, mag = 1,
        abilities = LanguageAbilities.All + listOf(
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
        ),
        skills = UniversalMagic.All + listOf(
            CommonSkills.dotykMocy,
            CommonSkills.przemawianie,
            StatsSkills.blyskotliwosc,
            StatsSkills.charyzmatyczny,
        ),
    )

    val DiakonZarazy = Profession(
        name = "Diakon zarazy",
        ww = 10, us = 5, k = 10, odp = 15, zr = 10, int = 5, sw = 15, ogd = 10,
        a = 1, zyw = 4, mag = 1,
        abilities = ScienceAbilities.All + KnowledgeAbilities.All + listOf(
            CommonAbilities.plywanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.jezykTajemnyMagiczny,
        ),
        skills = listOf(
            CommonSkills.czarnoksiestwo,
            CommonSkills.morderczyAtak,
            CommonSkills.ogluszenie,
            CommonSkills.przemawianie,
            MagicSkills.magiaProstaSpaczeniowa,
            WeaponSkills.korbacze,
        ),
        isStartingProfession = false,
    )

    val HersztKlanu = Profession(
        name = "Herszt klanu",
        ww = 40, us = 30, k = 30, odp = 30, zr = 40, int = 30, sw = 20, ogd = 25,
        a = 2, zyw = 6,
        abilities = KnowledgeAbilities.All + LanguageAbilities.All + listOf(
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
            SpecializedAbilities.naukaHistoria,
            SpecializedAbilities.naukaStrategiaTaktyka,
        ),
        skills = SpecialWeapon.All + listOf(
            CommonSkills.blyskawicznyBlok,
            CommonSkills.grozny,
            CommonSkills.krasomowstwo,
            CommonSkills.szostyZmysl,
            CommonSkills.ogluszenie,
            CommonSkills.przemawianie,
            CommonSkills.rozbrajanie,
            CommonSkills.szybkieWyciagniecie,
            CommonSkills.silnyCios,
        ),
        isStartingProfession = false,
    )

    val InzynierSpaczenia = Profession(
        name = "Inżynier spaczenia",
        ww = 15, us = 20, k = 10, odp = 10, zr = 30, int = 30, sw = 15, ogd = 5,
        a = 1, zyw = 7,
        abilities = KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.powozenie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.czytanieIPisanie,
            SpecializedAbilities.naukaAnatomia,
            SpecializedAbilities.naukaInzynieria,
            SpecializedAbilities.rzemiosloKowalstwo,
            SpecializedAbilities.rzemiosloRusznikarstwo,
        ),
        skills = listOf(
            CommonSkills.artylerzysta,
            CommonSkills.inzynieriaSpaczeniowa,
            CommonSkills.strzalMierzony,
            CommonSkills.strzalPrzebijajacy,
            StatsSkills.strzelecWyborowy,
            WeaponSkills.bronMechaniczna,
            WeaponSkills.bronPalna,
        ),
        isStartingProfession = false,
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
        isStartingProfession = false,
    )

    val KaplanZarazy = Profession(
        name = "Kapłan zarazy",
        ww = 20, us = 10, k = 15, odp = 25, zr = 20, int = 10, sw = 25, ogd = 15,
        a = 1, zyw = 6, mag = 2,
        abilities = ScienceAbilities.All + KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.plywanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.leczenie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.rzemiosloPiwowarstwo,
        ),
        skills = listOf(
            CommonSkills.przemawianie,
            CommonSkills.warzenieZarazy,
            MagicSkills.magiaCzarnoksieskaZarazy,
        ),
        isStartingProfession = false,
    )

    val MistrzCialoksztaltowania = Profession(
        name = "Mistrz ciałokształtowania",
        ww = 15, us = 0, k = 10, odp = 15, zr = 10, int = 15, sw = 15, ogd = 10,
        a = 1, zyw = 5,
        abilities = ScienceAbilities.All + CraftAbilities.All + KnowledgeAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.wycena,
            CommonAbilities.zastraszanie,
            RareAbilities.leczenie,
            RareAbilities.torturowanie,
            RareAbilities.tresura,
        ),
        skills = listOf(
            CommonSkills.chirurgia,
            CommonSkills.cialoksztaltowanie,
            CommonSkills.intrygant,
            CommonSkills.mistrzTresury,
            CommonSkills.niepokojacy,
            CommonSkills.zylkaHandlowa,
        ),
        isStartingProfession = false,
    )

    val MistrzMutator = Profession(
        name = "Mistrz mutator",
        ww = 30, us = 10, k = 20, odp = 30, zr = 20, int = 30, sw = 25, ogd = 15,
        a = 2, zyw = 7,
        abilities = ScienceAbilities.All + CraftAbilities.All + KnowledgeAbilities.All + listOf(
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
            CommonSkills.bystryWzrok,
            CommonSkills.chirurgia,
            CommonSkills.czulySluch,
            CommonSkills.intrygant,
            CommonSkills.mistrzTresury,
            CommonSkills.niepokojacy,
            CommonSkills.nieustraszony,
            CommonSkills.wyostrzoneZmysly,
            CommonSkills.zylkaHandlowa,
            StatsSkills.opanowanie,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.wiedzaKataj,
        ),
        skills = SpecialWeapon.All + listOf(
            CommonSkills.biegPoScianach,
            CommonSkills.blyskawicznyBlok,
            CommonSkills.sztukaCichejSmierci,
            CommonSkills.szybkieWyciagniecie,
            CommonSkills.ulicznik,
            CommonSkills.walkaOgonem,
        ),
        isStartingProfession = false,
    )

    val Nadprorok = Profession(
        name = "Nadprorok",
        ww = 20, us = 20, k = 15, odp = 15, zr = 40, int = 40, sw = 35, ogd = 35,
        a = 1, zyw = 9, mag = 3,
        abilities = SecretLanguageAbilities.Common + ScienceAbilities.All + KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
        ),
        skills = UniversalMagic.All + listOf(
            CommonSkills.czarnoksiestwo,
            CommonSkills.dotykMocy,
            CommonSkills.krasomowstwo,
            CommonSkills.medytacja,
            CommonSkills.morderczyPocisk,
            CommonSkills.odpornoscPsychiczna,
            CommonSkills.zmyslMagii,
            MagicSkills.magiaCzarnoksieskaSpaczenia,
            StatsSkills.niezwykleOdporny,
        ),
        isStartingProfession = false,
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
            SpecializedAbilities.wiedzaSkaveny,
        ),
        skills = listOf(
            CommonSkills.sztukaCichejSmierci,
            CommonSkills.wedrowiec,
            CommonSkills.wyczucieKierunku,
            CommonSkills.wykrywaniePulapek,
            StatsSkills.bardzoSzybki,
            WeaponSkills.kusze,
            WeaponSkills.bronRzucana,
            WeaponSkills.ostrzeJadowe,
        ),
        isStartingProfession = false,
    )

    val SkavenskiZaklinacz = Profession(
        name = "Skaveński zaklinacz",
        ww = 15, us = 15, k = 0, odp = 20, zr = 25, int = 20, sw = 25, ogd = 10,
        zyw = 5, mag = 2,
        abilities = ScienceAbilities.All + KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.jezykTajemnyMagiczny,
            SpecializedAbilities.wiedzaKataj,
        ),
        skills = UniversalMagic.All + listOf(
            CommonSkills.czarnoksiestwo,
            CommonSkills.dotykMocy,
            CommonSkills.medytacja,
            CommonSkills.morderczyPocisk,
            CommonSkills.odpornoscPsychiczna,
            CommonSkills.pancerzWiary,
            CommonSkills.zmyslMagii,
            StatsSkills.niezwykleOdporny,
            MagicSkills.magiaCzarnoksieskaSkrytosci,
            WeaponSkills.bronRzucana,
        ),
        isStartingProfession = false,
    )

    val SzaryProrok = Profession(
        name = "Szary prorok",
        ww = 10, us = 10, k = 5, odp = 10, zr = 20, int = 20, sw = 25, ogd = 15,
        zyw = 5, mag = 2,
        abilities = ScienceAbilities.All + KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.zastraszanie,
            RareAbilities.czytanieIPisanie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.jezykTajemnyDemoniczny,
            SpecializedAbilities.jezykTajemnyMagiczny,
            SpecializedAbilities.wiedzaKataj,
        ),
        skills = UniversalMagic.All + listOf(
            CommonSkills.czarnoksiestwo,
            CommonSkills.dotykMocy,
            CommonSkills.krasomowstwo,
            CommonSkills.medytacja,
            CommonSkills.morderczyPocisk,
            CommonSkills.odpornoscPsychiczna,
            StatsSkills.niezwykleOdporny,
            MagicSkills.magiaCzarnoksieskaSpaczenia,
        ),
        isStartingProfession = false,
    )

    val Szponowlad = Profession(
        name = "Szponowład",
        ww = 15, us = 10, k = 5, odp = 5, zr = 10, int = 5, sw = 10, ogd = 5,
        a = 1, zyw = 4,
        abilities = KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.plywanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
            SpecializedAbilities.naukaStrategiaTaktyka,
            SpecializedAbilities.wiedzaKataj,
        ),
        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.grozny,
            CommonSkills.intrygant,
            CommonSkills.morderczyAtak,
            CommonSkills.obiezyswiat,
            CommonSkills.silnyCios,
            CommonSkills.wyostrzoneZmysly,
            CommonSkills.zapasy,
        ),
        isStartingProfession = false,
    )

    val Szturmoszczur = Profession(
        name = "Szturmoszczur",
        ww = 15, us = 15, k = 10, odp = 10, zr = 15, int = 0, sw = 10, ogd = 5,
        a = 1, zyw = 4,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.wycena,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.grotolaz,
            CommonSkills.grozny,
            CommonSkills.morderczyAtak,
            CommonSkills.odwaga,
            StatsSkills.bardzoSilny,
            StatsSkills.niezwykleOdporny,
            StatsSkills.urodzonyWojownik,
        ),
        isStartingProfession = false,
    )

/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////      SZAMAN      /////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////

    val UczenSzamana = Profession(
        name = "Uczeń szamana",
        ww = 5, us = 5, k = 0, odp = 5, zr = 5, int = 10, sw = 10, ogd = 10,
         mag = 1,
        abilities = KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            RareAbilities.leczenie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.kuglarstwoSpiew,
            SpecializedAbilities.kuglarstwoTaniec,
            SpecializedAbilities.naukaTeologia,
        ),
        skills = listOf(
            CommonSkills.morderczyAtak,
            CommonSkills.ogluszenie,
            CommonSkills.przemawianie,
            MagicSkills.magiaProstaGusla,
        ),
    )

    val Szaman = Profession(
        name = "Szaman",
        ww = 10, us = 10, k = 5, odp = 10, zr = 10, int = 15, sw = 20, ogd = 15,
        zyw = 4, mag = 2,
        abilities = ScienceAbilities.All + KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.leczenie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.jezykTajemnyDemoniczny,
            SpecializedAbilities.jezykTajemnyMagiczny,
            SpecializedAbilities.kuglarstwoGawedziarstwo,
            SpecializedAbilities.kuglarstwoSpiew,
            SpecializedAbilities.kuglarstwoTaniec,
        ),
        skills = listOf(
            CommonSkills.dotykMocy,
            CommonSkills.krasomowstwo,
            CommonSkills.medytacja,
            CommonSkills.zmyslMagii,
            MagicSkills.magiaKaplanskaDuchow,
        ),
        isStartingProfession = false,
    )

    val WielkiSzaman = Profession(
        name = "Wielki szaman",
        ww = 15, us = 15, k = 10, odp = 15, zr = 15, int = 20, sw = 25, ogd = 20,
        a = 1, zyw = 6, mag = 3,
        abilities = ScienceAbilities.All + KnowledgeAbilities.All + LanguageAbilities.All + listOf(
            CommonAbilities.jezdziectwo,
            CommonAbilities.plotkowanie,
            CommonAbilities.przekonywanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.zastraszanie,
            RareAbilities.leczenie,
            RareAbilities.splatanieMagii,
            RareAbilities.wykrywanieMagii,
            SpecializedAbilities.jezykTajemnyDemoniczny,
            SpecializedAbilities.jezykTajemnyMagiczny,
            SpecializedAbilities.kuglarstwoGawedziarstwo,
            SpecializedAbilities.kuglarstwoSpiew,
            SpecializedAbilities.kuglarstwoTaniec,
        ),
        skills = UniversalMagic.All + listOf(
            CommonSkills.medytacja,
            CommonSkills.morderczyPocisk,
            CommonSkills.nieustraszony,
            CommonSkills.odpornoscPsychiczna,
            CommonSkills.zmyslMagii,
            MagicSkills.magiaKaplanskaDuchow,
        ),
        isStartingProfession = false,
    )

    val Knuj = Profession(
        name = "Knuj",
        ww = 10, us = 20, k = 10, odp = 10, zr = 20, int = 10, sw = 15, ogd = 0,
        a = 1, zyw = 4,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.jezdziectwo,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wspinaczka,
            RareAbilities.nawigacja,
            RareAbilities.sledzenie,
            RareAbilities.tropienie,
            RareAbilities.unik,
            RareAbilities.warzenieTrucizn,
        ),
        skills = listOf(
            CommonSkills.blyskawicznePrzadowanie,
            CommonSkills.grotolaz,
            CommonSkills.strzalMierzony,
            CommonSkills.strzalPrecyzyjny,
            CommonSkills.strzalPrzebijajacy,
            CommonSkills.wedrowiec,
            CommonSkills.wyczucieKierunku,
        ),
    )

    val Silacz = Profession(
        name = "Siłacz",
        ww = 20, us = 10, k = 15, odp = 15, zr = 15, int = 0, sw = 15, ogd = 10,
        a = 1, zyw = 6,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.jezdziectwo,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.wycena,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
        ),
        skills = listOf(
            CommonSkills.bijatyka,
            CommonSkills.morderczyAtak,
            CommonSkills.silnyCios,
            WeaponSkills.bronDwureczna,
            WeaponSkills.korbacze,
        ),
    )

    val WodzPlemienny = Profession(
        name = "Wódz plemienny",
        ww = 30, us = 20, k = 20, odp = 20, zr = 35, int = 15, sw = 20, ogd = 20,
        a = 2, zyw = 8,
        abilities = listOf(
            CommonAbilities.dowodzenie,
            CommonAbilities.jezdziectwo,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.wycena,
            CommonAbilities.wspinaczka,
            CommonAbilities.zastraszanie,
            RareAbilities.unik,
            SpecializedAbilities.naukaStrategiaTaktyka,
        ),
        skills = SpecialWeapon.All + listOf(
            CommonSkills.blyskawicznyBlok,
            CommonSkills.grozny,
            CommonSkills.ogluszenie,
            CommonSkills.rozbrajanie,
            CommonSkills.silnyCios,
            CommonSkills.szostyZmysl,
            CommonSkills.szybkieWyciagniecie,
            StatsSkills.niezwykleOdporny,
        ),
        isStartingProfession = false,
    )

/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////      ZWIERZAKI      ///////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
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



//TODO: PROFESJE WAMPIRÓW, ZWIERZOLUDZI, KRASNOLUDÓW CHAOSU, WYBRAŃCY CHAOSU
//TODO: PROFESJE Z KSIEGI SPACZENIA  (ODBLOKOWAC WROZBITE Z PROFESJI STRZYGONSKI MISTYK

//    fun getProfessionByName(name: String): Profession? {
//        return professionList.find { it.name == name }
//    }