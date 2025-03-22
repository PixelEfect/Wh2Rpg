package com.dd.rpgcardapp.data

// Klasa Paths, która przechowuje ścieżki dla profesji
data class Paths(
    val entry: List<Profession>,
    val exit: List<Profession>
)

// Definicje ścieżek
object ProfessionPaths {
    val paths: Map<Profession, Paths> = mapOf(
        Professions.Akolita to Paths(
            entry = listOf(
                Professions.Fanatyk,
                Professions.Guslarz,
                Professions.LowcaCzarownic,
                Professions.LowcaWampirow,
                Professions.Rycerz,
                Professions.Skryba,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.Cyrulik,
                Professions.Demagog,
                Professions.Fanatyk,
                Professions.Kaplan,
                Professions.Skryba,
                Professions.Zakonnik,
            )
        ),

        Professions.Banita to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.Fanatyk,
                Professions.Giermek,
                Professions.Guslarz,
                Professions.Kanciarz,
                Professions.Karczmarz,
                Professions.Lesnik,
                Professions.Mytnik,
                Professions.Najemnik,
                Professions.Ochotnik,
                Professions.Podzegacz,
                Professions.StraznikDrog,
                Professions.Szarlatan,
                Professions.Woznica,
                Professions.ZolnierzOkretowy,
            ),
            exit = listOf(
                Professions.Demagog,
                Professions.Rozbojnik,
                Professions.Weteran,
                Professions.Wloczykij,
                Professions.Zlodziej,
            )
        ),

        Professions.BerserkerZNorski to Paths(
            entry = listOf(),
            exit = listOf(
                Professions.Gladiator,
                Professions.Najemnik,
                Professions.Sierzant,
                Professions.Weteran,
                Professions.Zeglarz,
            )
        ),

        Professions.Chlop to Paths(
            entry = listOf(),
            exit = listOf(
                Professions.Banita,
                Professions.Fanatyk,
                Professions.Ochotnik,
                Professions.Rybak,
                Professions.Rzemieslnik,
                Professions.Sluga,
                Professions.Smieciarz,
                Professions.Urzednik,
                Professions.Weglarz,
            )
        ),

        Professions.CiuraObozowa to Paths(
            entry = listOf(
                Professions.Sluga,
                Professions.Smieciarz,
            ),
            exit = listOf(
                Professions.Przemytnik,
                Professions.Rzemieslnik,
                Professions.Sluga,
                Professions.Szarlatan,
                Professions.Szpieg,
                Professions.Weglarz,
                Professions.Wloczykij,
            )
        ),

        Professions.Cyrkowiec to Paths(
            entry = listOf(
                Professions.Herold,
                Professions.Kanciarz,
                Professions.Wloczykij,
                Professions.Zlodziej,
            ),
            exit = listOf(
                Professions.Bard,
                Professions.Kanciarz,
                Professions.Szarlatan,
                Professions.Wloczykij,
                Professions.Zlodziej,
            )
        ),

        Professions.Cyrulik to Paths(
            entry = listOf(
                Professions.Akolita,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.Medyk,
                Professions.Oprawca,
                Professions.PorywaczZwlok,
                Professions.Rzemieslnik,
                Professions.Wloczykij,
            )
        ),

        Professions.Fanatyk to Paths(
            entry = listOf(
                Professions.Akolita,
                Professions.Chlop,
                Professions.Podzegacz,
                Professions.Rzemieslnik,
                Professions.Szampierz,
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.Banita,
                Professions.Biczownik,
                Professions.Podzegacz,
                Professions.Zakonnik,
            )
        ),

        Professions.Flisak to Paths(
            entry = listOf(
                Professions.Przemytnik,
                Professions.Przewoznik,
            ),
            exit = listOf(
                Professions.Nawigator,
                Professions.Przemytnik,
                Professions.Rybak,
                Professions.Zeglarz,
                Professions.ZolnierzOkretowy,
            )
        ),

        Professions.Giermek to Paths(
            entry = listOf(
                Professions.Herold,
                Professions.Paz,
                Professions.Szlachcic,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.Rycerz,
                Professions.Sierzant,
                Professions.Szlachcic,
                Professions.Weteran,
            )
        ),

        Professions.Gladiator to Paths(
            entry = listOf(
                Professions.BerserkerZNorski,
                Professions.Oprych,
                Professions.Rzezimieszek,
                Professions.Tarczownik,
            ),
            exit = listOf(
                Professions.LowcaNagrod,
                Professions.Najemnik,
                Professions.Rzezimieszek,
                Professions.Weteran,
                Professions.ZabojcaTrolli,
            )
        ),

        Professions.Goniec to Paths(
            entry = listOf(
                Professions.Tarczownik,
            ),
            exit = listOf(
                Professions.HienaCmentarna,
                Professions.Szczurolap,
                Professions.Tarczownik,
                Professions.Weteran,
                Professions.Zwiadowca,
            )
        ),

        Professions.Gornik to Paths(
            entry = listOf(
                Professions.Lowca,
                Professions.Weglarz,
            ),
            exit = listOf(
                Professions.Inzynier,
                Professions.Najemnik,
                Professions.Przemytnik,
                Professions.Tarczownik,
                Professions.Weglarz,
                Professions.Zwiadowca,
            )
        ),

        Professions.Guslarz to Paths(
            entry = listOf(
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.Banita,
                Professions.Szarlatan,
                Professions.UczenCzarodzieja,
                Professions.Wloczykij,
            )
        ),

        Professions.HienaCmentarna to Paths(
            entry = listOf(
                Professions.Goniec,
                Professions.Tarczownik,
                Professions.Zlodziej,
            ),
            exit = listOf(
                Professions.LowcaWampirow,
                Professions.Paser,
                Professions.Szczurolap,
                Professions.Tarczownik,
                Professions.Zlodziej,
            )
        ),

        Professions.Kanciarz to Paths(
            entry = listOf(
                Professions.Cyrkowiec,
                Professions.Paz,
                Professions.Podzegacz,
                Professions.RzecznikRodu,
                Professions.Skrytobojca,
                Professions.SzermierzEstalijski,
                Professions.Szlachcic,
                Professions.Zlodziej,
                Professions.Zwadzca,
                Professions.Zeglarz,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.Cyrkowiec,
                Professions.Demagog,
                Professions.Sluga,
                Professions.Szarlatan,
                Professions.Zlodziej,
            )
        ),

        Professions.KozakKislevski to Paths(
            entry = listOf(
            ),
            exit = listOf(
                Professions.LowcaNagrod,
                Professions.Najemnik,
                Professions.Sierzant,
                Professions.Tarczownik,
                Professions.Weteran,
            )
        ),

        Professions.Lesnik to Paths(
            entry = listOf(
                Professions.Weglarz,
                Professions.Wloczykij,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.Lowca,
                Professions.Ochotnik,
                Professions.Wloczykij,
                Professions.Zwiadowca,
            )
        ),

        Professions.Lowca to Paths(
            entry = listOf(
                Professions.Lesnik,
                Professions.Weglarz,
                Professions.WojownikKlanowy,
            ),
            exit = listOf(
                Professions.Gornik,
                Professions.LowcaNagrod,
                Professions.StraznikPol,
                Professions.Strzelec,
                Professions.Weglarz,
                Professions.WojownikKlanowy,
                Professions.Zwiadowca,
                Professions.Zolnierz,
            )
        ),

        Professions.LowcaNagrod to Paths(
            entry = listOf(
                Professions.Gladiator,
                Professions.KozakKislevski,
                Professions.Lowca,
                Professions.Najemnik,
                Professions.Ochroniarz,
                Professions.StraznikPol,
            ),
            exit = listOf(
                Professions.LowcaWampirow,
                Professions.Najemnik,
                Professions.Rzezimieszek,
                Professions.Strzelec,
                Professions.Zwiadowca,
            )
        ),

        Professions.Mieszczanin to Paths(
            entry = listOf(
                Professions.Karczmarz,
                Professions.Sluga,
            ),
            exit = listOf(
                Professions.Karczmarz,
                Professions.Kupiec,
                Professions.Ochotnik,
                Professions.Paser,
                Professions.Paz,
                Professions.Podzegacz,
                Professions.Rzemieslnik,
            )
        ),

        Professions.Mytnik to Paths(
            entry = listOf(
                Professions.StraznikDrog,
                Professions.Woznica,
                Professions.Zarzadca,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.Przewoznik,
                Professions.Rozbojnik,
                Professions.StraznikPol,
                Professions.Urzednik,
                Professions.Zlodziej,
                Professions.Zolnierz,
            )
        ),

        Professions.Najemnik to Paths(
            entry = listOf(
                Professions.BerserkerZNorski,
                Professions.Demagog,
                Professions.Gladiator,
                Professions.Gornik,
                Professions.KozakKislevski,
                Professions.LowcaNagrod,
                Professions.Ochotnik,
                Professions.Ochroniarz,
                Professions.Oprych,
                Professions.Przepatrywacz,
                Professions.Straznik,
                Professions.StraznikPol,
                Professions.Zolnierz,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.LowcaNagrod,
                Professions.Ochroniarz,
                Professions.Sierzant,
                Professions.Tarczownik,
                Professions.Weteran,
            )
        ),

        Professions.Ochotnik to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.Kupiec,
                Professions.Lesnik,
                Professions.Mieszczanin,
                Professions.MistrzRzemiosla,
                Professions.Rybak,
                Professions.Rzemieslnik,
                Professions.Zarzadca,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.MistrzRzemiosla,
                Professions.Najemnik,
                Professions.Poslaniec,
                Professions.Sierzant,
                Professions.StraznikPol,
                Professions.Zlodziej,
            )
        ),

        Professions.Ochroniarz to Paths(
            entry = listOf(
                Professions.Najemnik,
                Professions.Oprych,
                Professions.StraznikWiezienny,
                Professions.SzermierzEstalijski,
            ),
            exit = listOf(
                Professions.LowcaNagrod,
                Professions.Najemnik,
                Professions.Oprawca,
                Professions.Reketer,
                Professions.Rzezimieszek,
                Professions.StraznikWiezienny,
                Professions.Zarzadca,
            )
        ),

        Professions.Oprych to Paths(
            entry = listOf(
                Professions.Rzezimieszek,
                Professions.ZolnierzOkretowy,
            ),
            exit = listOf(
                Professions.Gladiator,
                Professions.Najemnik,
                Professions.Ochroniarz,
                Professions.Oprawca,
                Professions.Reketer,
            )
        ),

        Professions.Paz to Paths(
            entry = listOf(
                Professions.Mieszczanin,
                Professions.Sluga,
            ),
            exit = listOf(
                Professions.Giermek,
                Professions.Herold,
                Professions.Kanciarz,
                Professions.Majordomus,
                Professions.Zak,
            )
        ),

        Professions.Podzegacz to Paths(
            entry = listOf(
                Professions.Fanatyk,
                Professions.Herold,
                Professions.Mieszczanin,
                Professions.Oficer,
                Professions.Rozbojnik,
                Professions.Skryba,
                Professions.Sluga,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.Demagog,
                Professions.Fanatyk,
                Professions.Kanciarz,
                Professions.Szarlatan,
                Professions.Urzednik,
            )
        ),

        Professions.PorywaczZwlok to Paths(
            entry = listOf(
                Professions.Cyrulik,
                Professions.Szczurolap,
                Professions.Smieciarz,
            ),
            exit = listOf(
                Professions.Paser,
                Professions.Szczurolap,
                Professions.Wlamywacz,
                Professions.Zlodziej,
                Professions.Zak,
            )
        ),

        Professions.Poslaniec to Paths(
            entry = listOf(
                Professions.Ochotnik,
                Professions.Sluga,
                Professions.Przepatrywacz,
                Professions.StraznikDrog,
            ),
            exit = listOf(
                Professions.Herold,
                Professions.Przepatrywacz,
                Professions.StraznikDrog,
                Professions.WojownikKlanowy,
                Professions.Woznica,
                Professions.Zwiadowca,
                Professions.Zolnierz,
            )
        ),

        Professions.Przemytnik to Paths(
            entry = listOf(
                Professions.CiuraObozowa,
                Professions.Flisak,
                Professions.Gornik,
                Professions.Inzynier,
                Professions.Karczmarz,
                Professions.Przewoznik,
                Professions.Smieciarz,
                Professions.Tarczownik,
                Professions.Woznica,
                Professions.Zarzadca,
                Professions.Zeglarz,
                Professions.ZolnierzOkretowy,
            ),
            exit = listOf(
                Professions.Flisak,
                Professions.Paser,
                Professions.Przewoznik,
                Professions.Szarlatan,
                Professions.Tarczownik,
                Professions.Zlodziej,
                Professions.Zeglarz,
            )
        ),

        Professions.Przepatrywacz to Paths(
            entry = listOf(
                Professions.Poslaniec,
                Professions.StraznikDrog,
                Professions.WojownikKlanowy,
                Professions.Zolnierz,
            ),
            exit = listOf(
                Professions.Najemnik,
                Professions.Poslaniec,
                Professions.Rozbojnik,
                Professions.StraznikDrog,
                Professions.Woznica,
                Professions.Zwiadowca,
            )
        ),

        Professions.Przewoznik to Paths(
            entry = listOf(
                Professions.Mytnik,
                Professions.Przemytnik,
                Professions.Woznica,
            ),
            exit = listOf(
                Professions.Flisak,
                Professions.Przemytnik,
                Professions.Rozbojnik,
                Professions.StraznikDrog,
                Professions.Zeglarz,
            )
        ),

        Professions.Rybak to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.Flisak,
            ),
            exit = listOf(
                Professions.Kupiec,
                Professions.Nawigator,
                Professions.Ochotnik,
                Professions.Zeglarz,
                Professions.ZolnierzOkretowy,
            )
        ),

        Professions.RzecznikRodu to Paths(
            entry = listOf(
                Professions.Rzemieslnik,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.Kanciarz,
                Professions.Kupiec,
                Professions.Szarlatan,
                Professions.Wloczykij,
                Professions.Zeglarz,
                Professions.Zak,
            )
        ),

        Professions.Rzemieslnik to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.CiuraObozowa,
                Professions.Cyrulik,
                Professions.Mieszczanin,
                Professions.Straznik,
            ),
            exit = listOf(
                Professions.Fanatyk,
                Professions.Inzynier,
                Professions.Kupiec,
                Professions.MistrzRzemiosla,
                Professions.Ochotnik,
                Professions.RzecznikRodu,
            )
        ),

        Professions.Rzezimieszek to Paths(
            entry = listOf(
                Professions.Gladiator,
                Professions.LowcaNagrod,
                Professions.Ochroniarz,
                Professions.SzermierzEstalijski,
                Professions.Zarzadca,
            ),
            exit = listOf(
                Professions.Gladiator,
                Professions.Oprych,
                Professions.Reketer,
                Professions.Zlodziej,
                Professions.Zwadzca,
            )
        ),

        Professions.Skryba to Paths(
            entry = listOf(
                Professions.Akolita,
                Professions.UczenCzarodzieja,
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.Nawigator,
                Professions.Podzegacz,
                Professions.UczenCzarodzieja,
                Professions.Uczony,
            )
        ),

        Professions.Sluga to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.CiuraObozowa,
                Professions.Kanciarz,
            ),
            exit = listOf(
                Professions.CiuraObozowa,
                Professions.Karczmarz,
                Professions.Mieszczanin,
                Professions.Paz,
                Professions.Podzegacz,
                Professions.Poslaniec,
                Professions.Szpieg,
                Professions.Zlodziej,
            )
        ),

        Professions.Straznik to Paths(
            entry = listOf(
                Professions.StraznikWiezienny,
                Professions.Zolnierz,
            ),
            exit = listOf(
                Professions.Najemnik,
                Professions.Reketer,
                Professions.Rzemieslnik,
                Professions.Sierzant,
                Professions.StraznikDrog,
                Professions.Zolnierz,
            )
        ),

        Professions.StraznikDrog to Paths(
            entry = listOf(
                Professions.Poslaniec,
                Professions.Przepatrywacz,
                Professions.Przewoznik,
                Professions.Straznik,
                Professions.Woznica,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.Mytnik,
                Professions.Poslaniec,
                Professions.Przepatrywacz,
                Professions.Rozbojnik,
                Professions.Sierzant,
                Professions.Zwiadowca,
            )
        ),

        Professions.StraznikPol to Paths(
            entry = listOf(
                Professions.Lowca,
                Professions.Mytnik,
                Professions.Ochotnik,
            ),
            exit = listOf(
                Professions.LowcaNagrod,
                Professions.LowcaWampirow,
                Professions.Najemnik,
                Professions.Wloczykij,
                Professions.Zwiadowca,
            )
        ),

        Professions.StraznikWiezienny to Paths(
            entry = listOf(
                Professions.Ochroniarz,
                Professions.Szczurolap,
            ),
            exit = listOf(
                Professions.Ochroniarz,
                Professions.Oprawca,
                Professions.Straznik,
                Professions.Szczurolap,
                Professions.Zarzadca,
            )
        ),

        Professions.Szczurolap to Paths(
            entry = listOf(
                Professions.Goniec,
                Professions.HienaCmentarna,
                Professions.PorywaczZwlok,
                Professions.StraznikWiezienny,
            ),
            exit = listOf(
                Professions.PorywaczZwlok,
                Professions.StraznikWiezienny,
                Professions.Smieciarz,
                Professions.Tarczownik,
                Professions.Wlamywacz,
                Professions.Zlodziej,
            )
        ),

        Professions.SzermierzEstalijski to Paths(
            entry = listOf(
            ),
            exit = listOf(
                Professions.Kanciarz,
                Professions.Ochroniarz,
                Professions.Rozbojnik,
                Professions.Rzezimieszek,
                Professions.Zwadzca,
            )
        ),

        Professions.Szlachcic to Paths(
            entry = listOf(
                Professions.Giermek,
                Professions.Majordomus,
            ),
            exit = listOf(
                Professions.Dworzanin,
                Professions.Giermek,
                Professions.Kanciarz,
                Professions.Rajtar,
                Professions.Urzednik,
                Professions.Zak,
            )
        ),

        Professions.Smieciarz to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.Szczurolap,
                Professions.Wloczykij,
            ),
            exit = listOf(
                Professions.CiuraObozowa,
                Professions.Paser,
                Professions.PorywaczZwlok,
                Professions.Przemytnik,
                Professions.Wlamywacz,
            )
        ),

        Professions.Tarczownik to Paths(
            entry = listOf(
                Professions.Goniec,
                Professions.Gornik,
                Professions.HienaCmentarna,
                Professions.KozakKislevski,
                Professions.Najemnik,
                Professions.Przemytnik,
                Professions.Szczurolap,
            ),
            exit = listOf(
                Professions.Gladiator,
                Professions.Goniec,
                Professions.HienaCmentarna,
                Professions.Przemytnik,
                Professions.Sierzant,
                Professions.Weteran,
            )
        ),

        Professions.UczenCzarodzieja to Paths(
            entry = listOf(
                Professions.Guslarz,
                Professions.Skryba,
                Professions.Uczony,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.Skryba,
                Professions.Uczony,
                Professions.WedrownyCzarodziej,
            )
        ),

        Professions.Weglarz to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.CiuraObozowa,
                Professions.Gornik,
                Professions.Lowca,
            ),
            exit = listOf(
                Professions.Gornik,
                Professions.Lesnik,
                Professions.Lowca,
                Professions.Wloczykij,
                Professions.Zwiadowca,
            )
        ),

        Professions.Wloczykij to Paths(
            entry = listOf(
                Professions.Banita,
                Professions.CiuraObozowa,
                Professions.Cyrkowiec,
                Professions.Cyrulik,
                Professions.Guslarz,
                Professions.Lesnik,
                Professions.RzecznikRodu,
                Professions.StraznikPol,
                Professions.Weglarz,
                Professions.Wlamywacz,
                Professions.WojownikKlanowy,
                Professions.Zolnierz,
            ),
            exit = listOf(
                Professions.Cyrkowiec,
                Professions.Lesnik,
                Professions.Smieciarz,
                Professions.Zakonnik,
                Professions.Zlodziej,
                Professions.Zwiadowca,
            )
        ),

        Professions.WojownikKlanowy to Paths(
            entry = listOf(
                Professions.Lowca,
                Professions.Poslaniec,
            ),
            exit = listOf(
                Professions.Lowca,
                Professions.Przepatrywacz,
                Professions.Weteran,
                Professions.Wloczykij,
                Professions.Zwiadowca,
            )
        ),

        Professions.Woznica to Paths(
            entry = listOf(
                Professions.Poslaniec,
                Professions.Przepatrywacz,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.Mytnik,
                Professions.Przemytnik,
                Professions.Przewoznik,
                Professions.Rozbojnik,
                Professions.StraznikDrog,
                Professions.Zwiadowca,
            )
        ),

        Professions.ZabojcaTrolli to Paths(
            entry = listOf(
                Professions.Gladiator,
            ),
            exit = listOf(
                Professions.ZabojcaOlbrzymow,
            )
        ),

        Professions.Zarzadca to Paths(
            entry = listOf(
                Professions.Ochroniarz,
                Professions.StraznikWiezienny,
            ),
            exit = listOf(
                Professions.Mytnik,
                Professions.Ochotnik,
                Professions.Przemytnik,
                Professions.Reketer,
                Professions.Rzezimieszek,
                Professions.Urzednik,
            )
        ),

        Professions.Zlodziej to Paths(
            entry = listOf(
                Professions.Banita,
                Professions.Cyrkowiec,
                Professions.HienaCmentarna,
                Professions.Kanciarz,
                Professions.Mytnik,
                Professions.Ochotnik,
                Professions.Oprawca,
                Professions.PorywaczZwlok,
                Professions.Przemytnik,
                Professions.Rzezimieszek,
                Professions.Sluga,
                Professions.Szczurolap,
                Professions.Wloczykij,
            ),
            exit = listOf(
                Professions.Cyrkowiec,
                Professions.HienaCmentarna,
                Professions.Kanciarz,
                Professions.Paser,
                Professions.Szarlatan,
                Professions.Wlamywacz,
            )
        ),

        Professions.Zak to Paths(
            entry = listOf(
                Professions.Bard,
                Professions.Paz,
                Professions.PorywaczZwlok,
                Professions.RzecznikRodu,
                Professions.Szlachcic,
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.Cyrulik,
                Professions.Inzynier,
                Professions.Medyk,
                Professions.Podzegacz,
                Professions.RzecznikRodu,
                Professions.UczenCzarodzieja,
                Professions.Uczony,
            )
        ),

        Professions.Zeglarz to Paths(
            entry = listOf(
                Professions.BerserkerZNorski,
                Professions.Flisak,
                Professions.Przemytnik,
                Professions.Przewoznik,
                Professions.Rybak,
                Professions.RzecznikRodu,
            ),
            exit = listOf(
                Professions.Bosman,
                Professions.Kanciarz,
                Professions.Nawigator,
                Professions.Przemytnik,
                Professions.ZolnierzOkretowy,
            )
        ),

        Professions.Zolnierz to Paths(
            entry = listOf(
                Professions.Biczownik,
                Professions.Lowca,
                Professions.Mytnik,
                Professions.Poslaniec,
                Professions.Straznik,
            ),
            exit = listOf(
                Professions.Najemnik,
                Professions.Przepatrywacz,
                Professions.Sierzant,
                Professions.Straznik,
                Professions.Weteran,
                Professions.Wloczykij,
            )
        ),

        Professions.ZolnierzOkretowy to Paths(
            entry = listOf(
                Professions.Flisak,
                Professions.Rybak,
                Professions.Zeglarz,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.Bosman,
                Professions.Oprych,
                Professions.Przemytnik,
                Professions.Sierzant,
            )
        ),

        Professions.Arcykaplan to Paths(
            entry = listOf(
                Professions.WybraniecBozy,
            ),
            exit = listOf(
                Professions.LowcaCzarownic,
                Professions.Uczony,
                Professions.Urzednik,
            )
        ),

        Professions.Arcymag to Paths(
            entry = listOf(
                Professions.MistrzMagii,
            ),
            exit = listOf(
                Professions.MistrzGildii,
                Professions.Odkrywca,
            )
        ),

        Professions.Arystokrata to Paths(
            entry = listOf(
                Professions.Dworzanin,
                Professions.Kapitan,
                Professions.MistrzZakonny,
                Professions.Rycerz,
                Professions.Urzednik,
            ),
            exit = listOf(
                Professions.Kapitan,
                Professions.Oficer,
                Professions.Rycerz,
                Professions.Uczony,
            )
        ),

        Professions.Bard to Paths(
            entry = listOf(
                Professions.Cyrkowiec,
            ),
            exit = listOf(
                Professions.Demagog,
                Professions.Rozbojnik,
                Professions.Szarlatan,
                Professions.Szpieg,
                Professions.Zak,
            )
        ),

        Professions.Biczownik to Paths(
            entry = listOf(
                Professions.Fanatyk,
                Professions.Kaplan,
                Professions.WybraniecBozy,
                Professions.Zakonnik,
            ),
            exit = listOf(
                Professions.Demagog,
                Professions.Kaplan,
                Professions.Oprawca,
                Professions.Weteran,
                Professions.Zolnierz,
            )
        ),

        Professions.Bosman to Paths(
            entry = listOf(
                Professions.Zeglarz,
                Professions.ZolnierzOkretowy,
            ),
            exit = listOf(
                Professions.Kapitan,
                Professions.Kupiec,
                Professions.Nawigator,
                Professions.Odkrywca,
            )
        ),

        Professions.Demagog to Paths(
            entry = listOf(
                Professions.Akolita,
                Professions.Banita,
                Professions.Bard,
                Professions.Biczownik,
                Professions.HersztBanitow,
                Professions.Kanciarz,
                Professions.KsiazeZlodziei,
                Professions.LowcaCzarownic,
                Professions.LowcaWampirow,
                Professions.MistrzRzemiosla,
                Professions.Podzegacz,
                Professions.Szarlatan,
                Professions.Urzednik,
                Professions.WybraniecBozy,
                Professions.Zakonnik,
            ),
            exit = listOf(
                Professions.HersztBanitow,
                Professions.KsiazeZlodziei,
                Professions.Najemnik,
                Professions.Urzednik,
                Professions.Zakonnik,
            )
        ),

        Professions.Dworzanin to Paths(
            entry = listOf(
                Professions.Herold,
                Professions.Rajtar,
                Professions.Szlachcic,
                Professions.Urzednik,
            ),
            exit = listOf(
                Professions.Arystokrata,
                Professions.Majordomus,
                Professions.Szarlatan,
                Professions.Szpieg,
                Professions.Urzednik,
                Professions.Zwadzca,
            )
        ),

        Professions.Fechtmistrz to Paths(
            entry = listOf(
                Professions.LowcaCzarownic,
                Professions.MistrzZakonny,
                Professions.Skrytobojca,
                Professions.Strzelec,
                Professions.Szampierz,
                Professions.Weteran,
                Professions.Zwadzca,
            ),
            exit = listOf(
                Professions.LowcaCzarownic,
                Professions.Sierzant,
                Professions.Skrytobojca,
                Professions.Zwiadowca,
            )
        ),

        Professions.Herold to Paths(
            entry = listOf(
                Professions.Paz,
                Professions.Poslaniec,
            ),
            exit = listOf(
                Professions.Cyrkowiec,
                Professions.Dworzanin,
                Professions.Giermek,
                Professions.Odkrywca,
                Professions.Podzegacz,
                Professions.Urzednik,
            )
        ),

        Professions.HersztBanitow to Paths(
            entry = listOf(
                Professions.Demagog,
                Professions.KsiazeZlodziei,
                Professions.LesnyDuch,
                Professions.MistrzCieni,
                Professions.Oficer,
                Professions.Reketer,
                Professions.Rozbojnik,
                Professions.Skrytobojca,
                Professions.Weteran,
                Professions.Zwiadowca,
            ),
            exit = listOf(
                Professions.Demagog,
                Professions.KsiazeZlodziei,
                Professions.Oficer,
                Professions.Skrytobojca,
            )
        ),

        Professions.Inzynier to Paths(
            entry = listOf(
                Professions.Gornik,
                Professions.MistrzRzemiosla,
                Professions.Rzemieslnik,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.MistrzGildii,
                Professions.MistrzRzemiosla,
                Professions.Odkrywca,
                Professions.Przemytnik,
                Professions.Rajtar,
            )
        ),

        Professions.Kapitan to Paths(
            entry = listOf(
                Professions.Arystokrata,
                Professions.Bosman,
                Professions.Nawigator,
                Professions.Odkrywca,
            ),
            exit = listOf(
                Professions.Arystokrata,
                Professions.Odkrywca,
                Professions.Szpieg,
                Professions.Uczony,
            )
        ),

        Professions.Kaplan to Paths(
            entry = listOf(
                Professions.Akolita,
                Professions.Biczownik,
                Professions.Zakonnik,
            ),
            exit = listOf(
                Professions.Biczownik,
                Professions.Majordomus,
                Professions.Uczony,
                Professions.WybraniecBozy,
            )
        ),

        Professions.Karczmarz to Paths(
            entry = listOf(
                Professions.Mieszczanin,
                Professions.Sluga,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.Kupiec,
                Professions.Mieszczanin,
                Professions.Paser,
                Professions.Przemytnik,
            )
        ),

        Professions.KsiazeZlodziei to Paths(
            entry = listOf(
                Professions.Demagog,
                Professions.HersztBanitow,
                Professions.Majordomus,
                Professions.MistrzCieni,
                Professions.MistrzGildii,
                Professions.Paser,
                Professions.Urzednik,
                Professions.Wlamywacz,
            ),
            exit = listOf(
                Professions.Demagog,
                Professions.HersztBanitow,
                Professions.MistrzCieni,
                Professions.Urzednik,
            )
        ),

        Professions.Kupiec to Paths(
            entry = listOf(
                Professions.Bosman,
                Professions.Karczmarz,
                Professions.Majordomus,
                Professions.Mieszczanin,
                Professions.MistrzRzemiosla,
                Professions.Odkrywca,
                Professions.Oficer,
                Professions.Rybak,
                Professions.RzecznikRodu,
                Professions.Rzemieslnik,
                Professions.Uczony,
            ),
            exit = listOf(
                Professions.MistrzGildii,
                Professions.Ochotnik,
                Professions.Reketer,
                Professions.Szpieg,
                Professions.Urzednik,
            )
        ),

        Professions.LesnyDuch to Paths(
            entry = listOf(
                Professions.Zwiadowca,
            ),
            exit = listOf(
                Professions.HersztBanitow,
                Professions.LowcaWampirow,
                Professions.Oficer,
                Professions.Strzelec,
            )
        ),

        Professions.LowcaCzarownic to Paths(
            entry = listOf(
                Professions.Arcykaplan,
                Professions.Fechtmistrz,
                Professions.LowcaWampirow,
                Professions.MistrzZakonny,
                Professions.Skrytobojca,
                Professions.Szampierz,
                Professions.WybraniecBozy,
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.Demagog,
                Professions.Fechtmistrz,
                Professions.MistrzZakonny,
                Professions.Oficer,
            )
        ),

        Professions.LowcaWampirow to Paths(
            entry = listOf(
                Professions.HienaCmentarna,
                Professions.LesnyDuch,
                Professions.LowcaNagrod,
                Professions.Rycerz,
                Professions.StraznikPol,
                Professions.Zwiadowca,
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.Demagog,
                Professions.LowcaCzarownic,
                Professions.Rycerz,
                Professions.Strzelec,
            )
        ),

        Professions.Majordomus to Paths(
            entry = listOf(
                Professions.Dworzanin,
                Professions.Kaplan,
                Professions.Paz,
                Professions.Uczony,
                Professions.Urzednik,
            ),
            exit = listOf(
                Professions.KsiazeZlodziei,
                Professions.Kupiec,
                Professions.Paser,
                Professions.Szlachcic,
            )
        ),

        Professions.Medyk to Paths(
            entry = listOf(
                Professions.Cyrulik,
                Professions.Oprawca,
                Professions.Uczony,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.MistrzGildii,
                Professions.Szpieg,
                Professions.Uczony,
                Professions.Zakonnik,
            )
        ),

        Professions.MistrzCieni to Paths(
            entry = listOf(
                Professions.KsiazeZlodziei,
                Professions.Paser,
                Professions.Reketer,
                Professions.Rozbojnik,
                Professions.Szpieg,
                Professions.Wlamywacz,
            ),
            exit = listOf(
                Professions.HersztBanitow,
                Professions.KsiazeZlodziei,
                Professions.Odkrywca,
                Professions.Strzelec,
            )
        ),

        Professions.MistrzGildii to Paths(
            entry = listOf(
                Professions.Arcymag,
                Professions.Inzynier,
                Professions.Kupiec,
                Professions.Medyk,
                Professions.MistrzRzemiosla,
            ),
            exit = listOf(
                Professions.KsiazeZlodziei,
                Professions.Reketer,
                Professions.Urzednik,
            )
        ),

        Professions.MistrzMagii to Paths(
            entry = listOf(
                Professions.WedrownyCzarodziej,
            ),
            exit = listOf(
                Professions.Arcymag,
                Professions.Odkrywca,
                Professions.Uczony,
            )
        ),

        Professions.MistrzRzemiosla to Paths(
            entry = listOf(
                Professions.Inzynier,
                Professions.Nawigator,
                Professions.Ochotnik,
                Professions.Rzemieslnik,
            ),
            exit = listOf(
                Professions.Demagog,
                Professions.Inzynier,
                Professions.Kupiec,
                Professions.MistrzGildii,
                Professions.Ochotnik,
            )
        ),

        Professions.MistrzZakonny to Paths(
            entry = listOf(
                Professions.LowcaCzarownic,
                Professions.Rycerz,
            ),
            exit = listOf(
                Professions.Arystokrata,
                Professions.Fechtmistrz,
                Professions.LowcaCzarownic,
                Professions.Oficer,
            )
        ),

        Professions.Nawigator to Paths(
            entry = listOf(
                Professions.Bosman,
                Professions.Flisak,
                Professions.Rybak,
                Professions.Skryba,
                Professions.Zeglarz,
            ),
            exit = listOf(
                Professions.Kapitan,
                Professions.MistrzRzemiosla,
                Professions.Odkrywca,
                Professions.Uczony,
            )
        ),

        Professions.Odkrywca to Paths(
            entry = listOf(
                Professions.Arcymag,
                Professions.Bosman,
                Professions.Herold,
                Professions.Inzynier,
                Professions.Kapitan,
                Professions.MistrzCieni,
                Professions.MistrzMagii,
                Professions.Nawigator,
                Professions.Oficer,
                Professions.Szpieg,
                Professions.Uczony,
                Professions.Zwiadowca,
            ),
            exit = listOf(
                Professions.Kapitan,
                Professions.Kupiec,
                Professions.Oficer,
                Professions.Szpieg,
            )
        ),

        Professions.Oficer to Paths(
            entry = listOf(
                Professions.Arystokrata,
                Professions.HersztBanitow,
                Professions.LesnyDuch,
                Professions.LowcaCzarownic,
                Professions.MistrzZakonny,
                Professions.Odkrywca,
                Professions.Rycerz,
                Professions.Sierzant,
            ),
            exit = listOf(
                Professions.HersztBanitow,
                Professions.Kupiec,
                Professions.Odkrywca,
                Professions.Podzegacz,
                Professions.Urzednik,
            )
        ),

        Professions.Oprawca to Paths(
            entry = listOf(
                Professions.Biczownik,
                Professions.Cyrulik,
                Professions.Ochroniarz,
                Professions.Oprych,
                Professions.StraznikWiezienny,
            ),
            exit = listOf(
                Professions.Medyk,
                Professions.Reketer,
                Professions.Zlodziej,
            )
        ),

        Professions.Paser to Paths(
            entry = listOf(
                Professions.HienaCmentarna,
                Professions.Karczmarz,
                Professions.Majordomus,
                Professions.Mieszczanin,
                Professions.PorywaczZwlok,
                Professions.Przemytnik,
                Professions.Reketer,
                Professions.Smieciarz,
                Professions.Wlamywacz,
                Professions.Zlodziej,
            ),
            exit = listOf(
                Professions.KsiazeZlodziei,
                Professions.MistrzCieni,
                Professions.Reketer,
                Professions.Szarlatan,
            )
        ),

        Professions.Rajtar to Paths(
            entry = listOf(
                Professions.Inzynier,
                Professions.Szlachcic,
            ),
            exit = listOf(
                Professions.Dworzanin,
                Professions.Rycerz,
                Professions.Sierzant,
                Professions.Weteran,
                Professions.Zwadzca,
            )
        ),

        Professions.Reketer to Paths(
            entry = listOf(
                Professions.Kupiec,
                Professions.MistrzGildii,
                Professions.Ochroniarz,
                Professions.Oprawca,
                Professions.Oprych,
                Professions.Paser,
                Professions.Rzezimieszek,
                Professions.Straznik,
                Professions.Szpieg,
                Professions.Urzednik,
                Professions.Wlamywacz,
                Professions.Zarzadca,
            ),
            exit = listOf(
                Professions.HersztBanitow,
                Professions.MistrzCieni,
                Professions.Paser,
                Professions.Urzednik,
            )
        ),

        Professions.Rozbojnik to Paths(
            entry = listOf(
                Professions.Banita,
                Professions.Bard,
                Professions.Mytnik,
                Professions.Przepatrywacz,
                Professions.Przewoznik,
                Professions.StraznikDrog,
                Professions.SzermierzEstalijski,
                Professions.Woznica,
                Professions.Zwadzca,
            ),
            exit = listOf(
                Professions.HersztBanitow,
                Professions.MistrzCieni,
                Professions.Podzegacz,
                Professions.Sierzant,
                Professions.Zwadzca,
            )
        ),

        Professions.Rycerz to Paths(
            entry = listOf(
                Professions.Arystokrata,
                Professions.Giermek,
                Professions.LowcaWampirow,
                Professions.Rajtar,
                Professions.Sierzant,
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.Arystokrata,
                Professions.LowcaWampirow,
                Professions.MistrzZakonny,
                Professions.Oficer,
            )
        ),

        Professions.Sierzant to Paths(
            entry = listOf(
                Professions.BerserkerZNorski,
                Professions.Fechtmistrz,
                Professions.Giermek,
                Professions.KozakKislevski,
                Professions.Najemnik,
                Professions.Ochotnik,
                Professions.Rajtar,
                Professions.Rozbojnik,
                Professions.Skrytobojca,
                Professions.Straznik,
                Professions.StraznikDrog,
                Professions.Strzelec,
                Professions.Szampierz,
                Professions.Tarczownik,
                Professions.Weteran,
                Professions.Zwadzca,
                Professions.Zwiadowca,
                Professions.Zolnierz,
                Professions.ZolnierzOkretowy,
            ),
            exit = listOf(
                Professions.Oficer,
                Professions.Rycerz,
                Professions.Szampierz,
                Professions.Zwadzca,
            )
        ),

        Professions.Skrytobojca to Paths(
            entry = listOf(
                Professions.Fechtmistrz,
                Professions.HersztBanitow,
                Professions.Strzelec,
                Professions.Szampierz,
                Professions.Szpieg,
                Professions.Zwadzca,
            ),
            exit = listOf(
                Professions.Fechtmistrz,
                Professions.HersztBanitow,
                Professions.LowcaCzarownic,
                Professions.Kanciarz,
                Professions.Sierzant,
            )
        ),

        Professions.Strzelec to Paths(
            entry = listOf(
                Professions.LesnyDuch,
                Professions.Lowca,
                Professions.LowcaNagrod,
                Professions.LowcaWampirow,
                Professions.MistrzCieni,
                Professions.Weteran,
            ),
            exit = listOf(
                Professions.Fechtmistrz,
                Professions.Sierzant,
                Professions.Skrytobojca,
                Professions.Zwadzca,
            )
        ),

        Professions.Szampierz to Paths(
            entry = listOf(
                Professions.Sierzant,
                Professions.Weteran,
            ),
            exit = listOf(
                Professions.Fanatyk,
                Professions.Fechtmistrz,
                Professions.LowcaCzarownic,
                Professions.Sierzant,
                Professions.Skrytobojca,
            )
        ),

        Professions.Szarlatan to Paths(
            entry = listOf(
                Professions.Bard,
                Professions.CiuraObozowa,
                Professions.Cyrkowiec,
                Professions.Dworzanin,
                Professions.Guslarz,
                Professions.Kanciarz,
                Professions.Paser,
                Professions.Podzegacz,
                Professions.Przemytnik,
                Professions.RzecznikRodu,
                Professions.WedrownyCzarodziej,
                Professions.Zlodziej,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.Demagog,
                Professions.Szpieg,
                Professions.Urzednik,
                Professions.Wlamywacz,
            )
        ),

        Professions.Szpieg to Paths(
            entry = listOf(
                Professions.Bard,
                Professions.CiuraObozowa,
                Professions.Dworzanin,
                Professions.Kapitan,
                Professions.Kupiec,
                Professions.Medyk,
                Professions.Odkrywca,
                Professions.Sluga,
                Professions.Szarlatan,
            ),
            exit = listOf(
                Professions.MistrzCieni,
                Professions.Odkrywca,
                Professions.Reketer,
                Professions.Skrytobojca,
            )
        ),

        Professions.Uczony to Paths(
            entry = listOf(
                Professions.Arcykaplan,
                Professions.Arystokrata,
                Professions.Kapitan,
                Professions.Kaplan,
                Professions.Medyk,
                Professions.MistrzMagii,
                Professions.Nawigator,
                Professions.Skryba,
                Professions.UczenCzarodzieja,
                Professions.WedrownyCzarodziej,
                Professions.WybraniecBozy,
                Professions.Zakonnik,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.Kupiec,
                Professions.Majordomus,
                Professions.Medyk,
                Professions.Odkrywca,
                Professions.UczenCzarodzieja,
                Professions.Zakonnik,
            )
        ),

        Professions.Urzednik to Paths(
            entry = listOf(
                Professions.Arcykaplan,
                Professions.Chlop,
                Professions.Demagog,
                Professions.Dworzanin,
                Professions.Herold,
                Professions.KsiazeZlodziei,
                Professions.Kupiec,
                Professions.MistrzGildii,
                Professions.Mytnik,
                Professions.Oficer,
                Professions.Podzegacz,
                Professions.Reketer,
                Professions.Szarlatan,
                Professions.Szlachcic,
                Professions.Zarzadca,
            ),
            exit = listOf(
                Professions.Arystokrata,
                Professions.Demagog,
                Professions.Dworzanin,
                Professions.KsiazeZlodziei,
                Professions.Majordomus,
                Professions.Reketer,
            )
        ),

        Professions.Weteran to Paths(
            entry = listOf(
                Professions.Banita,
                Professions.BerserkerZNorski,
                Professions.Biczownik,
                Professions.Giermek,
                Professions.Gladiator,
                Professions.Goniec,
                Professions.KozakKislevski,
                Professions.Najemnik,
                Professions.Rajtar,
                Professions.Tarczownik,
                Professions.WojownikKlanowy,
                Professions.Zolnierz,
            ),
            exit = listOf(
                Professions.Fechtmistrz,
                Professions.HersztBanitow,
                Professions.Sierzant,
                Professions.Strzelec,
                Professions.Szampierz,
            )
        ),

        Professions.WedrownyCzarodziej to Paths(
            entry = listOf(
                Professions.UczenCzarodzieja,
            ),
            exit = listOf(
                Professions.MistrzMagii,
                Professions.Szarlatan,
                Professions.Uczony,
            )
        ),

        Professions.Wlamywacz to Paths(
            entry = listOf(
                Professions.PorywaczZwlok,
                Professions.Szarlatan,
                Professions.Szczurolap,
                Professions.Smieciarz,
                Professions.Zlodziej,
            ),
            exit = listOf(
                Professions.KsiazeZlodziei,
                Professions.MistrzCieni,
                Professions.Paser,
                Professions.Reketer,
                Professions.Wloczykij,
            )
        ),

        Professions.WybraniecBozy to Paths(
            entry = listOf(
                Professions.Kaplan,
            ),
            exit = listOf(
                Professions.Arcykaplan,
                Professions.Biczownik,
                Professions.Demagog,
                Professions.LowcaCzarownic,
                Professions.Uczony,
            )
        ),

        Professions.ZabojcaDemonow to Paths(
            entry = listOf(
                Professions.ZabojcaOlbrzymow,
            ),
            exit = listOf(
            )
        ),

        Professions.ZabojcaOlbrzymow to Paths(
            entry = listOf(
                Professions.ZabojcaTrolli,
            ),
            exit = listOf(
                Professions.ZabojcaDemonow,
            )
        ),

        Professions.Zakonnik to Paths(
            entry = listOf(
                Professions.Akolita,
                Professions.Demagog,
                Professions.Fanatyk,
                Professions.Medyk,
                Professions.Uczony,
                Professions.Wloczykij,
            ),
            exit = listOf(
                Professions.Biczownik,
                Professions.Demagog,
                Professions.Kaplan,
                Professions.Uczony,
            )
        ),

        Professions.Zwadzca to Paths(
            entry = listOf(
                Professions.Dworzanin,
                Professions.Rajtar,
                Professions.Rozbojnik,
                Professions.Rzezimieszek,
                Professions.Sierzant,
                Professions.Strzelec,
                Professions.SzermierzEstalijski,
            ),
            exit = listOf(
                Professions.Fechtmistrz,
                Professions.Kanciarz,
                Professions.Rozbojnik,
                Professions.Sierzant,
                Professions.Skrytobojca,
            )
        ),

        Professions.Zwiadowca to Paths(
            entry = listOf(
                Professions.Fechtmistrz,
                Professions.Goniec,
                Professions.Gornik,
                Professions.Lesnik,
                Professions.Lowca,
                Professions.LowcaNagrod,
                Professions.Poslaniec,
                Professions.Przepatrywacz,
                Professions.StraznikDrog,
                Professions.StraznikPol,
                Professions.Weglarz,
                Professions.Wloczykij,
                Professions.WojownikKlanowy,
                Professions.Woznica,
            ),
            exit = listOf(
                Professions.HersztBanitow,
                Professions.LesnyDuch,
                Professions.LowcaWampirow,
                Professions.Odkrywca,
                Professions.Sierzant,
            )
        ),
    )
}
