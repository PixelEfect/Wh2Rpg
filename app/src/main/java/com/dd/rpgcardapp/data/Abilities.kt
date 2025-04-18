package com.dd.rpgcardapp.data

data class Ability(val name: String, val attribute: String ="Int"){
    // Tworzymy metodę do konwersji obiektu na mapę
    fun toMap(): Map<String, String> {
        return mapOf(
            "name" to this.name,
            "attribute" to this.attribute
        )
    }
}

object CommonAbilities {
    val charakteryzacja = Ability("Charakteryzacja", "Ogd")
    val dowodzenie = Ability("Dowodzenie", "Ogd")
    val hazard = Ability("Hazard",)
    val jezdziectwo = Ability("Jeździectwo", "Zr")
    val mocnaGlowa = Ability("Mocna Głowa", "Odp")
    val opiekaNadZwierzetami = Ability("Opieka Nad Zwierzętami",)
    val plotkowanie = Ability("Plotkowanie", "Ogd")

    val plywanie = Ability("Pływanie", "K")
    val powozenie = Ability("Powożenie", "K")
    val przekonywanie = Ability("Przekonywanie", "Ogd")
    val przeszukiwanie = Ability("Przeszukiwanie",)
    val skradanieSie = Ability("Skradanie Się", "Zr")
    val spostrzegawczosc = Ability("Spostrzegawczość",)
    val sztukaPrzetrwania = Ability("Sztuka Przetrwania",)

    val targowanie = Ability("Targowanie", "Ogd")
    val ukrywanieSie = Ability("Ukrywanie Się", "Zr")
    val wioslarstwo = Ability("Wioślarstwo", "K")
    val wspinaczka = Ability("Wspinaczka", "K")
    val wycena = Ability("Wycena",)
    val zastraszanie = Ability("Zastraszanie", "K")
}

object RareAbilities {
    val brzuchomowstwo = Ability("Brzuchomówstwo", "Ogd")
    val czytanieIPisanie = Ability("Czytanie i Pisanie",)
    val czytanieZWarg = Ability("Czytanie z Warg",)
    val gadanina = Ability("Gadanina", "Ogd")
    val hipnoza = Ability("Hipnoza", "SW")
    val leczenie = Ability("Leczenie",)

    val nawigacja = Ability("Nawigacja",)
    val oswajanie = Ability("Oswajanie", "Ogd")
    val otwieranieZamkow = Ability("Otwieranie Zamków", "Zr")
    val splatanieMagii = Ability("Splatanie Magii", "SW")
    val sledzenie = Ability("Śledzenie", "Zr")
    val torturowanie = Ability("Torturowanie", "Ogd")

    val tresura = Ability("Tresura", "Ogd")
    val tropienie = Ability("Tropienie",)
    val unik = Ability("Unik", "Zr")
    val warzenieTrucizn = Ability("Warzenie Trucizn",)
    val wykrywanieMagii = Ability("Wykrywanie Magii", "SW")
    val wykuwanieRun = Ability("Wykuwanie run", "SW")
    val zastawianiePulapek = Ability("Zastawianie Pułapek", "Zr")
    val zwinnePalce = Ability("Zwinne Palce", "Zr")
    val zeglarstwo = Ability("Żeglarstwo", "Zr")
}

object SpecialAbilities{
    val jezykTajemnyDemoniczny = Ability("jezyk tajemny: Demoniczny",)
    val jezykTajemnyMagiczny = Ability("jezyk tajemny: Magiczny",)
    val jezykTajemnyElfi = Ability("jezyk tajemny: Tajemny elfi",)
    val jezykTajemnyKrasnoludzki = Ability("jezyk tajemny: Tajemny krasnoludzki",)
    val jezykTajemnyNehekharanski = Ability("jezyk tajemny: Tajemny nehekharański",)

    val kuglarstwoAkrobatyka = Ability("Kuglarstwo: Akrobatyka", "Ogd")
    val kuglarstwoAktorstwo = Ability("Kuglarstwo: Aktorstwo", "Ogd")
    val kuglarstwoBlaznowanie = Ability("Kuglarstwo: Błaznowanie", "Ogd")
    val kuglarstwoGawedziarstwo = Ability("Kuglarstwo: Gawędziarstwo", "Ogd")
    val kuglarstwoKomedianctwo = Ability("Kuglarstwo: Komedianctwo", "Ogd")
    val kuglarstwoMimika = Ability("Kuglarstwo: Mimika", "Ogd")
    val kuglarstwoMuzykalnosc = Ability("Kuglarstwo: Muzykalność", "Ogd")
    val kuglarstwoPolykanieOgnia = Ability("Kuglarstwo: Połykanie ognia", "Ogd")
    val kuglarstwoSpiew = Ability("Kuglarstwo: Śpiew", "Ogd")
    val kuglarstwoTaniec = Ability("Kuglarstwo: Taniec", "Ogd")
    val kuglarstwoWrozenieZDloni = Ability("Kuglarstwo: Wróżenie z dłoni", "Ogd")
    val kuglarstwoZonglerka = Ability("Kuglarstwo: Żonglerka", "Ogd")

    val naukaAlchemia = Ability("Nauka: Alchemia",)
    val naukaAnatomia = Ability("Nauka: Anatomia",)
    val naukaAstronomia = Ability("Nauka: Astronomia",)
    val naukaDemonologia = Ability("Nauka: Demonologia",)
    val naukaDuchy = Ability("Nauka: Duchy",)
    val naukaFilozofia = Ability("Nauka: Filozofia",)
    val naukaFizyka = Ability("Nauka: Fizyka",)
    val naukaGeografia = Ability("Nauka: Geografia",)
    val naukaGeneologiaHeraldyka = Ability("Nauka: Geneologia/heraldyka",)
    val naukaHistoria = Ability("Nauka: Historia",)
    val naukaInzynieria = Ability("Nauka: Inzynieria",)
    val naukaMagia = Ability("Nauka: Magia",)
    val naukaMatematyka = Ability("Nauka: Matematyka",)
    val naukaMechanika = Ability("Nauka: Mechanika",)
    val naukaNekromancja = Ability("Nauka: Nekromancja",)
    val naukaPrawo = Ability("Nauka: Prawo",)
    val naukaRuny = Ability("Nauka: Runy",)
    val naukaStrategiaTaktyka = Ability("Nauka: Strategia/taktyka",)
    val naukaSztuka = Ability("Nauka: Sztuka",)
    val naukaTeologia = Ability("Nauka: Teologia",)

    val rzemiosloAptekarstwo = Ability("Rzemiosło: Aptekarstwo",)
    val rzemiosloBednarstwo = Ability("Rzemiosło: Bednarstwo", "K")
    val rzemiosloGarbarstwo = Ability("Rzemiosło: Garbarstwo", "K")
    val rzemiosloGotowanie = Ability("Rzemiosło: Gotowanie",)
    val rzemiosloGornictwo = Ability("Rzemiosło: Górnictwo", "K")
    val rzemiosloGornictwoOdkrywkowe = Ability("Rzemiosło: Górnictwo odkrywkowe", "K")

    val rzemiosloHandel = Ability("Rzemiosło: Handel", "Ogd")
    val rzemiosloHodowlaKoni = Ability("Rzemiosło: Hodowla koni")
    val rzemiosloHodowlaPsow = Ability("Rzemiosło: Hodowla psów")
    val rzemiosloHodowlaPtakow = Ability("Rzemiosło: Hodowla ptaków")
    val rzemiosloJubilerstwo = Ability("Rzemiosło: Jubilerstwo", "Zr")
    val rzemiosloKaligrafia = Ability("Rzemiosło: Kaligrafia", "Zr")
    val rzemiosloKamieniarstwo = Ability("Rzemiosło: Kamieniarstwo", "Zr")
    val rzemiosloKartografia = Ability("Rzemiosło: Kartografia", "Zr")
    val rzemiosloKowalstwo = Ability("Rzemiosło: Kowalstwo", "K")
    val rzemiosloKrawiectwo = Ability("Rzemiosło: Krawiectwo", "Zr")

    val rzemiosloMlynarstwo = Ability("Rzemiosło: Młynarstwo", "K")
    val rzemiosloPiwowarstwo = Ability("Rzemiosło: Piwowarstwo",)
    val rzemiosloPlatnerstwo = Ability("Rzemiosło: Płatnerstwo", "K")
    val rzemiosloRusznikarstwo = Ability("Rzemiosło: Rusznikarstwo", "Zr")
    val rzemiosloRymarstwo = Ability("Rzemiosło: Rymarstwo", "Zr")
    val rzemiosloStolarstwo = Ability("Rzemiosło: Stolarstwo", "Zr")
    val rzemiosloSzkutnictwo = Ability("Rzemiosło: Szkutnictwo",)
    val rzemiosloSzewstwo = Ability("Rzemiosło: Szewstwo", "Zr")
    val rzemiosloSztuka = Ability("Rzemiosło: Sztuka", "Zr")
    val rzemiosloSwiecarstwo = Ability("Rzemiosło: Świecarstwo", "Zr")

    val rzemiosloUprawaZiemi = Ability("Rzemiosło: Uprawa Ziemi", "K")
    val rzemiosloWyrobLukow = Ability("Rzemiosło: Wyrób Łuków", "Zr")
    val rzemiosloZielarstwo = Ability("Rzemiosło: Zielarstwo",)
    val rzemiosloZlotnictwo = Ability("Rzemiosło: Złotnictwo", "Zr")

    val sekretneZnakiAstrologow = Ability("Sekretne znaki: Astrologów",)
    val sekretneZnakiLowcow = Ability("Sekretne znaki: Łowców",)
    val sekretneZnakiRycerzyZakonnych = Ability("Sekretne znaki: Rycerzy zakonnych",)
    val sekretneZnakiZlodziei = Ability("Sekretne znaki: Złodziei",)
    val sekretneZnakiZwiadowcow = Ability("Sekretne znaki: Zwiadowców",)
    val sekretneZnakiKultuOswiecenia = Ability("Sekretne znaki: Kultu oświecenia (Poradnik staroświatowca)",)

    val sekretnyjezykBitewny = Ability("Sekretny jezyk: Bitewny",)
    val sekretnyjezykGildii = Ability("Sekretny jezyk: Gildii",)
    val sekretnyjezykLowcow = Ability("Sekretny jezyk: Łowców",)
    val sekretnyjezykZlodziei = Ability("Sekretny jezyk: Złodziei",)
    val sekretnyjezykWieziennySlang = Ability("Sekretny jezyk: Więzienny slang",)

    val wiedzaBretonia = Ability("Wiedza: Bretonia",)
    val wiedzaEstalia = Ability("Wiedza: Estalia",)
    val wiedzaImperium = Ability("Wiedza: Imperium",)
    val wiedzaJalowaKraina = Ability("Wiedza: Jałowa Kraina",)
    val wiedzaKataj = Ability("Wiedza: Kataj",)
    val wiedzaKislev = Ability("Wiedza: Kisleva",)
    val wiedzaKsiestwaGraniczne = Ability("Wiedza: Księstwa Graniczne",)
    val wiedzaLustria = Ability("Wiedza: Lustria",)
    val wiedzaNorska = Ability("Wiedza: Norska",)
    val wiedzaTilea = Ability("Wiedza: Tilea",)
    val wiedzaElfy = Ability("Wiedza: Elfy",)
    val wiedzaKrasnoludy = Ability("Wiedza: Krasnoludy",)
    val wiedzaNiziolki = Ability("Wiedza: Niziołki",)
    val wiedzaOgry = Ability("Wiedza: Ogry",)
    val wiedzaSkaveny = Ability("Wiedza: Skaveny",)
    val wiedzaKrajTrolli = Ability("Wiedza: Kraj Trolli",)
    val wiedzaPustkowiaChaosu = Ability("Wiedza: Pustkowia Chaosu",)
    val wiedzaGnomy = Ability("Wiedza: Gnomy",)

    val jezykArabski = Ability("Znajomość języka: Arabski",)
    val jezykBretonski = Ability("Znajomość języka: Bretoński",)
    val jezykEltharin = Ability("Znajomość języka: Eltharin",)
    val jezykEstalijski = Ability("Znajomość języka: Estalijski",)
    val jezykKhazalid = Ability("Znajomość języka: Khazalid",)
    val jezykKislevski = Ability("Znajomość języka: Kislevski",)
    val jezykNorski = Ability("Znajomość języka: Norski",)
    val jezykTileanski = Ability("Znajomość języka: Tileański",)
    val jezykReikspiel = Ability("Znajomość języka: Reikspiel",)
    val jezykNiziolkow = Ability("Znajomość języka: Niziołków",)
    val jezykKlasyczny = Ability("Znajomość języka: Klasyczny",)
    val jezykGoblinski = Ability("Znajomość języka: Gobliński",)
    val jezykGrumbarth = Ability("Znajomość języka: Narzecze Grumbarth (ogry)",)
    val jezykMrocznaMowa = Ability("Znajomość języka: Mroczna Mowa",)
    val jezykQueekish = Ability("Znajomość języka: Queekish",)
    val jezykStrzyganski = Ability("Znajomość języka: Strzygański",)
    val jezykUngolski = Ability("Znajomość języka: Ungolski",)
    val jezykGnomi = Ability("Znajomość języka: Gnomi",)
}

// Mapa przypisująca umiejętności do odpowiednich grup
val abilityCategoryMap = mapOf(
    "Common" to setOf(
        CommonAbilities.charakteryzacja,
        CommonAbilities.dowodzenie,
        CommonAbilities.hazard,
        CommonAbilities.jezdziectwo,
        CommonAbilities.mocnaGlowa,
        CommonAbilities.opiekaNadZwierzetami,
        CommonAbilities.plotkowanie,
        CommonAbilities.plywanie,
        CommonAbilities.powozenie,
        CommonAbilities.przekonywanie,
        CommonAbilities.przeszukiwanie,
        CommonAbilities.skradanieSie,
        CommonAbilities.spostrzegawczosc,
        CommonAbilities.sztukaPrzetrwania,
        CommonAbilities.targowanie,
        CommonAbilities.ukrywanieSie,
        CommonAbilities.wioslarstwo,
        CommonAbilities.wspinaczka,
        CommonAbilities.wycena,
        CommonAbilities.zastraszanie
    ),
    "Rare" to setOf(
        RareAbilities.brzuchomowstwo,
        RareAbilities.czytanieIPisanie,
        RareAbilities.czytanieZWarg,
        RareAbilities.gadanina,
        RareAbilities.hipnoza,
        RareAbilities.leczenie,
        RareAbilities.nawigacja,
        RareAbilities.oswajanie,
        RareAbilities.otwieranieZamkow,
        RareAbilities.splatanieMagii,
        RareAbilities.sledzenie,
        RareAbilities.torturowanie,
        RareAbilities.tresura,
        RareAbilities.tropienie,
        RareAbilities.unik,
        RareAbilities.warzenieTrucizn,
        RareAbilities.wykrywanieMagii,
        RareAbilities.wykuwanieRun,
        RareAbilities.zastawianiePulapek,
        RareAbilities.zwinnePalce,
        RareAbilities.zeglarstwo
    ),
    "Special" to setOf(
        SpecialAbilities.jezykTajemnyDemoniczny,
        SpecialAbilities.jezykTajemnyMagiczny,
        SpecialAbilities.jezykTajemnyElfi,
        SpecialAbilities.jezykTajemnyKrasnoludzki,
        SpecialAbilities.jezykTajemnyNehekharanski,
        SpecialAbilities.kuglarstwoAkrobatyka,
        SpecialAbilities.kuglarstwoAktorstwo,
        SpecialAbilities.kuglarstwoBlaznowanie,
        SpecialAbilities.kuglarstwoGawedziarstwo,
        SpecialAbilities.kuglarstwoKomedianctwo,
        SpecialAbilities.kuglarstwoMimika,
        SpecialAbilities.kuglarstwoMuzykalnosc,
        SpecialAbilities.kuglarstwoPolykanieOgnia,
        SpecialAbilities.kuglarstwoSpiew,
        SpecialAbilities.kuglarstwoTaniec,
        SpecialAbilities.kuglarstwoWrozenieZDloni,
        SpecialAbilities.kuglarstwoZonglerka,
        SpecialAbilities.naukaAlchemia,
        SpecialAbilities.naukaAnatomia,
        SpecialAbilities.naukaAstronomia,
        SpecialAbilities.naukaDemonologia,
        SpecialAbilities.naukaDuchy,
        SpecialAbilities.naukaFilozofia,
        SpecialAbilities.naukaFizyka,
        SpecialAbilities.naukaGeografia,
        SpecialAbilities.naukaGeneologiaHeraldyka,
        SpecialAbilities.naukaHistoria,
        SpecialAbilities.naukaInzynieria,
        SpecialAbilities.naukaMagia,
        SpecialAbilities.naukaMatematyka,
        SpecialAbilities.naukaMechanika,
        SpecialAbilities.naukaNekromancja,
        SpecialAbilities.naukaPrawo,
        SpecialAbilities.naukaRuny,
        SpecialAbilities.naukaStrategiaTaktyka,
        SpecialAbilities.naukaSztuka,
        SpecialAbilities.naukaTeologia,
        SpecialAbilities.rzemiosloAptekarstwo,
        SpecialAbilities.rzemiosloBednarstwo,
        SpecialAbilities.rzemiosloGarbarstwo,
        SpecialAbilities.rzemiosloGotowanie,
        SpecialAbilities.rzemiosloGornictwo,
        SpecialAbilities.rzemiosloGornictwoOdkrywkowe,
        SpecialAbilities.rzemiosloHandel,
        SpecialAbilities.rzemiosloHodowlaKoni,
        SpecialAbilities.rzemiosloHodowlaPsow,
        SpecialAbilities.rzemiosloHodowlaPtakow,
        SpecialAbilities.rzemiosloJubilerstwo,
        SpecialAbilities.rzemiosloKaligrafia,
        SpecialAbilities.rzemiosloKamieniarstwo,
        SpecialAbilities.rzemiosloKartografia,
        SpecialAbilities.rzemiosloKowalstwo,
        SpecialAbilities.rzemiosloKrawiectwo,
        SpecialAbilities.rzemiosloMlynarstwo,
        SpecialAbilities.rzemiosloPiwowarstwo,
        SpecialAbilities.rzemiosloPlatnerstwo,
        SpecialAbilities.rzemiosloRusznikarstwo,
        SpecialAbilities.rzemiosloRymarstwo,
        SpecialAbilities.rzemiosloStolarstwo,
        SpecialAbilities.rzemiosloSzkutnictwo,
        SpecialAbilities.rzemiosloSzewstwo,
        SpecialAbilities.rzemiosloSztuka,
        SpecialAbilities.rzemiosloSwiecarstwo,
        SpecialAbilities.rzemiosloUprawaZiemi,
        SpecialAbilities.rzemiosloWyrobLukow,
        SpecialAbilities.rzemiosloZielarstwo,
        SpecialAbilities.rzemiosloZlotnictwo,
        SpecialAbilities.sekretneZnakiAstrologow,
        SpecialAbilities.sekretneZnakiLowcow,
        SpecialAbilities.sekretneZnakiRycerzyZakonnych,
        SpecialAbilities.sekretneZnakiZlodziei,
        SpecialAbilities.sekretneZnakiZwiadowcow,
        SpecialAbilities.sekretneZnakiKultuOswiecenia,
        SpecialAbilities.sekretnyjezykBitewny,
        SpecialAbilities.sekretnyjezykGildii,
        SpecialAbilities.sekretnyjezykLowcow,
        SpecialAbilities.sekretnyjezykZlodziei,
        SpecialAbilities.sekretnyjezykWieziennySlang,
        SpecialAbilities.wiedzaBretonia,
        SpecialAbilities.wiedzaEstalia,
        SpecialAbilities.wiedzaImperium,
        SpecialAbilities.wiedzaJalowaKraina,
        SpecialAbilities.wiedzaKataj,
        SpecialAbilities.wiedzaKislev,
        SpecialAbilities.wiedzaKsiestwaGraniczne,
        SpecialAbilities.wiedzaLustria,
        SpecialAbilities.wiedzaNorska,
        SpecialAbilities.wiedzaTilea,
        SpecialAbilities.wiedzaElfy,
        SpecialAbilities.wiedzaKrasnoludy,
        SpecialAbilities.wiedzaNiziolki,
        SpecialAbilities.wiedzaOgry,
        SpecialAbilities.wiedzaSkaveny,
        SpecialAbilities.wiedzaKrajTrolli,
        SpecialAbilities.wiedzaPustkowiaChaosu,
        SpecialAbilities.wiedzaGnomy,
        SpecialAbilities.jezykArabski,
        SpecialAbilities.jezykBretonski,
        SpecialAbilities.jezykEltharin,
        SpecialAbilities.jezykEstalijski,
        SpecialAbilities.jezykKhazalid,
        SpecialAbilities.jezykKislevski,
        SpecialAbilities.jezykNorski,
        SpecialAbilities.jezykTileanski,
        SpecialAbilities.jezykReikspiel,
        SpecialAbilities.jezykNiziolkow,
        SpecialAbilities.jezykKlasyczny,
        SpecialAbilities.jezykGoblinski,
        SpecialAbilities.jezykGrumbarth,
        SpecialAbilities.jezykMrocznaMowa,
        SpecialAbilities.jezykQueekish,
        SpecialAbilities.jezykStrzyganski,
        SpecialAbilities.jezykUngolski,
        SpecialAbilities.jezykGnomi
    )
)

// Funkcja sprawdzająca kategorię umiejętności
fun getAbilityCategory(ability: Ability): String {
    return abilityCategoryMap.entries.find { it.value.contains(ability) }?.key ?: "Unknown"
}
