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
                Professions.Bajarz,
                Professions.BiczBozy,
                Professions.Fanatyk,
                Professions.Grabaz,
                Professions.Guslarz,
                Professions.Katecheta,
                Professions.Krzyzowiec,
                Professions.Latarnik,
                Professions.LowcaCzarownic,
                Professions.LowcaWampirow,
                Professions.Pielgrzym,
                Professions.Pokutnik,
                Professions.Psalterzysta,
                Professions.Rycerz,
                Professions.RycerzPlonacegoSlonca,
                Professions.Skryba,
                Professions.SledczyVereny,
                Professions.StraznikSwiatynny,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.AgentCalunu,
                Professions.Ceremoniarz,
                Professions.Cyrulik,
                Professions.Demagog,
                Professions.Fanatyk,
                Professions.Kaplan,
                Professions.Mnich,
                Professions.Pokutnik,
                Professions.Psalterzysta,
                Professions.Skryba,
                Professions.SledczyVereny,
                Professions.StraznikSwiatynny,
                Professions.Zakonnik,
            )
        ),

        Professions.Aptekarz to Paths(
            entry = listOf(
                Professions.Cyrulik,
                Professions.Guslarz,
                Professions.UczenCzarodzieja,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.Astrolog,
                Professions.Cyrulik,
                Professions.HienaCmentarna,
                Professions.Kupiec,
                Professions.Medyk,
                Professions.MistrzRzemiosla,
                Professions.UczenCzarodzieja,
                Professions.Uczony,
            )
        ),

        Professions.Astrolog to Paths(
            entry = listOf(
                Professions.Aptekarz,
                Professions.Medyk,
                Professions.MistrzMagii,
                Professions.Nawigator,
                Professions.StrzyganskiMistyk,
                Professions.Szarlatan,
                Professions.Szlachcic,
                Professions.UczenCzarodzieja,
                Professions.Uczony,
                Professions.WedrownyCzarodziej,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.Nawigator,
                Professions.Odkrywca,
                Professions.Szarlatan,
                Professions.UczenCzarodzieja,
                Professions.Uczony,
            )
        ),

        Professions.Bajarz to Paths(
            entry = listOf(
                Professions.CiuraObozowa,
                Professions.Cyrkowiec,
                Professions.Kanciarz,
                Professions.Podzegacz,
                Professions.Wloczykij,
                Professions.Zak,
                Professions.Zeglarz,
                Professions.Zolnierz,
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.Cyrkowiec,
                Professions.Demagog,
                Professions.Dworzanin,
                Professions.Herold,
                Professions.Kanciarz,
                Professions.Szarlatan,
            )
        ),

        Professions.Balsamista to Paths(
            entry = listOf(
                Professions.Cyrulik,
                Professions.Rzemieslnik,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.Medyk,
                Professions.Mieszczanin,
                Professions.PorywaczZwlok,
                Professions.UczenCzarodzieja,
                Professions.Uczony,
            )
        ),

        Professions.Banita to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.Czarnoszczur,
                Professions.Czarownik,
                Professions.Czarnoksieznik,
                Professions.Fanatyk,
                Professions.Giermek,
                Professions.Guslarz,
                Professions.Kanciarz,
                Professions.Karczmarz,
                Professions.Klanbrat,
                Professions.Lesnik,
                Professions.Mytnik,
                Professions.Najemnik,
                Professions.Ochotnik,
                Professions.Pacholek,
                Professions.PasterzZCarcassonne,
                Professions.Pielgrzym,
                Professions.PiratRzeczny,
                Professions.Podzegacz,
                Professions.PoslaniecNocy,
                Professions.StraznikDrog,
                Professions.Szarlatan,
                Professions.Woznica,
                Professions.Zakapturzony,
                Professions.ZolnierzOkretowy,
            ),
            exit = listOf(
                Professions.Demagog,
                Professions.PasterzZCarcassonne,
                Professions.PielgrzymGraala,
                Professions.PiratRzeczny,
                Professions.Pokutnik,
                Professions.Rozbojnik,
                Professions.Weteran,
                Professions.Wloczykij,
                Professions.Zakapturzony,
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

        Professions.BlednyRycerz to Paths(
            entry = listOf(
                Professions.Giermek,
                Professions.Rycerz,
                Professions.Szlachcic,
            ),
            exit = listOf(
                Professions.RycerzKrolestwa,
                Professions.Zakapturzony,
            )
        ),

        Professions.Cenobita to Paths(
            entry = listOf(
            ),
            exit = listOf(
                Professions.Banita,
                Professions.Mistyk,
                Professions.Sluga,
                Professions.Wloczykij,
            )
        ),

        Professions.Chlop to Paths(
            entry = listOf(),
            exit = listOf(
                Professions.Banita,
                Professions.Brygadzista,
                Professions.Budowniczy,
                Professions.Doker,
                Professions.Fanatyk,
                Professions.Gazeciarz,
                Professions.Grabaz,
                Professions.Kominiarz,
                Professions.Latarnik,
                Professions.Ochotnik,
                Professions.Pacholek,
                Professions.PasterzZCarcassonne,
                Professions.PielgrzymGraala,
                Professions.PiratRzeczny,
                Professions.Rozjemca,
                Professions.Rybak,
                Professions.Rzemieslnik,
                Professions.Sluga,
                Professions.Smieciarz,
                Professions.StraznikKanalow,
                Professions.Urzednik,
                Professions.Weglarz,
                Professions.Zakapturzony,
                Professions.ZbieraczLajna,
            )
        ),

        Professions.CiuraObozowa to Paths(
            entry = listOf(
                Professions.Sluga,
                Professions.Smieciarz,
            ),
            exit = listOf(
                Professions.Bajarz,
                Professions.Przemytnik,
                Professions.Rzemieslnik,
                Professions.Sluga,
                Professions.Szarlatan,
                Professions.Szpieg,
                Professions.Weglarz,
                Professions.Wloczykij,
                Professions.ZbieraczLajna,
            )
        ),

        Professions.Cyrkowiec to Paths(
            entry = listOf(
                Professions.Bajarz,
                Professions.Gazeciarz,
                Professions.Herold,
                Professions.Kanciarz,
                Professions.Latarnik,
                Professions.Psalterzysta,
                Professions.StrzyganskiMistyk,
                Professions.Szuler,
                Professions.Wloczykij,
                Professions.Zlodziej,
            ),
            exit = listOf(
                Professions.Bajarz,
                Professions.Bard,
                Professions.Kanciarz,
                Professions.Psalterzysta,
                Professions.Szarlatan,
                Professions.Szuler,
                Professions.Wloczykij,
                Professions.Zlodziej,
            )
        ),

        Professions.Cyrulik to Paths(
            entry = listOf(
                Professions.Akolita,
                Professions.Aptekarz,
                Professions.Klanbrat,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.AgentCalunu,
                Professions.Aptekarz,
                Professions.Balsamista,
                Professions.Medyk,
                Professions.Oprawca,
                Professions.PorywaczZwlok,
                Professions.Rzemieslnik,
                Professions.Wloczykij,
            )
        ),

        Professions.Czekista to Paths(
            entry = listOf(
                Professions.KozakKislevski,
                Professions.Oprych,
                Professions.Rzezimieszek,
                Professions.Straznik,
                Professions.Strielec,
            ),
            exit = listOf(
                Professions.Najemnik,
                Professions.Oprawca,
                Professions.Reketer,
                Professions.Sierzant,
                Professions.Straznik,
                Professions.StraznikWiezienny,
                Professions.Szpieg,
                Professions.Weteran,
                Professions.Zolnierz,
            )
        ),

        Professions.CzeladnikRun to Paths(
            entry = listOf(
                Professions.Goniec,
                Professions.MistrzRzemiosla,
                Professions.Skryba,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.Goniec,
                Professions.KowalRun,
                Professions.Skryba,
                Professions.Tarczownik,
                Professions.Uczony,
            )
        ),

        Professions.Doker to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.Flisak,
            ),
            exit = listOf(
                Professions.Brygadzista,
                Professions.Flisak,
                Professions.Kupiec,
                Professions.Oprych,
                Professions.Przemytnik,
                Professions.Rzemieslnik,
                Professions.Zlodziej,
                Professions.ZolnierzOkretowy,
            )
        ),

        Professions.Egzorcysta to Paths(
            entry = listOf(
                Professions.Kaplan,
                Professions.WybraniecBozy,
            ),
            exit = listOf(
                Professions.LowcaCzarownic,
                Professions.Uczony,
                Professions.WybraniecBozy,
            )
        ),

        Professions.Falszerz to Paths(
            entry = listOf(
                Professions.MistrzRzemiosla,
                Professions.Poslaniec,
                Professions.Przemytnik,
                Professions.Rzemieslnik,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.MistrzRzemiosla,
                Professions.Paser,
                Professions.Rzemieslnik,
                Professions.Skryba,
                Professions.Szarlatan,
                Professions.Uczony,
                Professions.Zak,
            )
        ),

        Professions.Fanatyk to Paths(
            entry = listOf(
                Professions.Akolita,
                Professions.Chlop,
                Professions.CzcicielZarazy,
                Professions.Gazeciarz,
                Professions.Katecheta,
                Professions.Klanbrat,
                Professions.Mnich,
                Professions.Pielgrzym,
                Professions.Podzegacz,
                Professions.Psalterzysta,
                Professions.Rzemieslnik,
                Professions.Szampierz,
                Professions.Szturmoszczur,
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.Banita,
                Professions.Biczownik,
                Professions.Kadzielnik,
                Professions.Katecheta,
                Professions.Podzegacz,
                Professions.Pokutnik,
                Professions.Psalterzysta,
                Professions.StraznikSwiatynny,
                Professions.Zakonnik,
            )
        ),

        Professions.Flisak to Paths(
            entry = listOf(
                Professions.Doker,
                Professions.PiratRzeczny,
                Professions.Przemytnik,
                Professions.Przewoznik,
                Professions.StraznikRzeczny,
            ),
            exit = listOf(
                Professions.Doker,
                Professions.Klanbrat,
                Professions.Nawigator,
                Professions.PiratRzeczny,
                Professions.Przemytnik,
                Professions.Rybak,
                Professions.StraznikRzeczny,
                Professions.Zeglarz,
                Professions.ZolnierzOkretowy,
            )
        ),

        Professions.Gazeciarz to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.Mieszczanin,
                Professions.Poslaniec,
                Professions.Sluga,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.Cyrkowiec,
                Professions.Demagog,
                Professions.Fanatyk,
                Professions.Kanciarz,
                Professions.Podzegacz,
                Professions.Poslaniec,
                Professions.Skryba,
            )
        ),

        Professions.Giermek to Paths(
            entry = listOf(
                Professions.Ceremoniarz,
                Professions.Herold,
                Professions.Paz,
                Professions.StraznikSwiatynny,
                Professions.Szlachcic,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.BlednyRycerz,
                Professions.CzarnyStraznik,
                Professions.Rycerz,
                Professions.RycerzPlonacegoSlonca,
                Professions.Sierzant,
                Professions.Szlachcic,
                Professions.Weteran,
            )
        ),

        Professions.Gladiator to Paths(
            entry = listOf(
                Professions.BerserkerZNorski,
                Professions.Czarnoszczur,
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
                Professions.CzeladnikRun,
                Professions.Tarczownik,
            ),
            exit = listOf(
                Professions.CzeladnikRun,
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
                Professions.Klanbrat,
                Professions.Kominiarz,
                Professions.Najemnik,
                Professions.Przemytnik,
                Professions.Tarczownik,
                Professions.Weglarz,
                Professions.Zwiadowca,
            )
        ),

        Professions.Grabaz to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.Szczurolap,
                Professions.Smieciarz,
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.LowcaWampirow,
                Professions.Ochotnik,
                Professions.PorywaczZwlok,
                Professions.Straznik,
            )
        ),

        Professions.Guslarz to Paths(
            entry = listOf(
                Professions.StrzyganskiMistyk,
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.Aptekarz,
                Professions.Banita,
                Professions.Czarownik,
                Professions.Szarlatan,
                Professions.UczenCzarodzieja,
                Professions.Wloczykij,
            )
        ),

        Professions.HienaCmentarna to Paths(
            entry = listOf(
                Professions.Aptekarz,
                Professions.Goniec,
                Professions.Klanbrat,
                Professions.Tarczownik,
                Professions.ZbieraczLajna,
                Professions.Zlodziej,
            ),
            exit = listOf(
                Professions.AgentCalunu,
                Professions.LowcaWampirow,
                Professions.Paser,
                Professions.StraznikTuneli,
                Professions.Szczurolap,
                Professions.Tarczownik,
                Professions.Zlodziej,
            )
        ),

        Professions.Kanciarz to Paths(
            entry = listOf(
                Professions.Bajarz,
                Professions.Cyrkowiec,
                Professions.Gazeciarz,
                Professions.Paz,
                Professions.Podzegacz,
                Professions.Rozjemca,
                Professions.RzecznikRodu,
                Professions.Skrytobojca,
                Professions.StrzyganskiMistyk,
                Professions.SzermierzEstalijski,
                Professions.Szlachcic,
                Professions.Szuler,
                Professions.Zlodziej,
                Professions.Zwadzca,
                Professions.Zeglarz,
            ),
            exit = listOf(
                Professions.Bajarz,
                Professions.Banita,
                Professions.Cyrkowiec,
                Professions.Demagog,
                Professions.Kominiarz,
                Professions.Rozjemca,
                Professions.Sluga,
                Professions.Szarlatan,
                Professions.Szuler,
                Professions.Zakapturzony,
                Professions.Zlodziej,
            )
        ),

        Professions.Koczownik to Paths(
            entry = listOf(
            ),
            exit = listOf(
                Professions.Ataman,
                Professions.Banita,
                Professions.Koniuszy,
                Professions.KonnyLucznik,
                Professions.KozakKislevski,
                Professions.Wloczykij,
                Professions.Zwiadowca,
            )
        ),

        Professions.Kominiarz to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.Gornik,
                Professions.Kanciarz,
                Professions.Weglarz,
                Professions.Zlodziej,
            ),
            exit = listOf(
                Professions.Najemnik,
                Professions.Ochotnik,
                Professions.Rzezimieszek,
                Professions.Szczurolap,
                Professions.Wlamywacz,
            )
        ),

        Professions.Koniarz to Paths(
            entry = listOf(
                Professions.Koczownik,
                Professions.Koniuszy,
                Professions.Mieszczanin,
                Professions.Poganiacz,
                Professions.Poslaniec,
            ),
            exit = listOf(
                Professions.Kanciarz,
                Professions.Koniuszy,
                Professions.Kupiec,
                Professions.Mieszczanin,
                Professions.Szarlatan,
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

        Professions.Latarnik to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.Sluga,
                Professions.Szczurolap,
                Professions.Weglarz,
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.Cyrkowiec,
                Professions.Mieszczanin,
                Professions.Mytnik,
                Professions.Podzegacz,
                Professions.Przemytnik,
                Professions.Sluga,
                Professions.Straznik,
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
                Professions.Pacholek,
                Professions.PasterzZCarcassonne,
                Professions.Wloczykij,
                Professions.Zakapturzony,
                Professions.Zwiadowca,
            )
        ),

        Professions.Lowca to Paths(
            entry = listOf(
                Professions.Lesnik,
                Professions.Rynsztokowiec,
                Professions.Weglarz,
                Professions.WojownikKlanowy,
            ),
            exit = listOf(
                Professions.Gornik,
                Professions.LowcaNagrod,
                Professions.Pacholek,
                Professions.PasterzZCarcassonne,
                Professions.PielgrzymGraala,
                Professions.PoganiaczSkavenski,
                Professions.Rozjemca,
                Professions.StraznikPol,
                Professions.Strzelec,
                Professions.Weglarz,
                Professions.WojownikKlanowy,
                Professions.Zakapturzony,
                Professions.Zwiadowca,
                Professions.Zolnierz,
            )
        ),

        Professions.LowcaNagrod to Paths(
            entry = listOf(
                Professions.Gladiator,
                Professions.Klanbrat,
                Professions.KozakKislevski,
                Professions.Lowca,
                Professions.Najemnik,
                Professions.Ochroniarz,
                Professions.PoganiaczSkavenski,
                Professions.PoslaniecNocy,
                Professions.Rynsztokowiec,
                Professions.StraznikPol,
            ),
            exit = listOf(
                Professions.LowcaWampirow,
                Professions.Najemnik,
                Professions.PoganiaczSkavenski,
                Professions.Rzezimieszek,
                Professions.Strzelec,
                Professions.SledczyVereny,
                Professions.Zwiadowca,
            )
        ),

        Professions.Mieszczanin to Paths(
            entry = listOf(
                Professions.Balsamista,
                Professions.Karczmarz,
                Professions.Latarnik,
                Professions.Sluga,
            ),
            exit = listOf(
                Professions.Gazeciarz,
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
                Professions.Latarnik,
                Professions.StraznikDrog,
                Professions.StraznikRzeczny,
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
                Professions.Artylerzysta,
                Professions.BerserkerZNorski,
                Professions.Czarnoszczur,
                Professions.Demagog,
                Professions.Gladiator,
                Professions.Gornik,
                Professions.Harcownik,
                Professions.InzynierSpaczenia,
                Professions.Klanbrat,
                Professions.Kominiarz,
                Professions.KozakKislevski,
                Professions.LowcaNagrod,
                Professions.Ochotnik,
                Professions.Ochroniarz,
                Professions.Oprych,
                Professions.PielgrzymGraala,
                Professions.PoganiaczSkavenski,
                Professions.PoslaniecNocy,
                Professions.Przepatrywacz,
                Professions.Rynsztokowiec,
                Professions.Straznik,
                Professions.StraznikKanalow,
                Professions.StraznikPol,
                Professions.StraznikSwiatynny,
                Professions.StraznikTuneli,
                Professions.Szturmoszczur,
                Professions.Zbrojny,
                Professions.Zolnierz,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.LowcaNagrod,
                Professions.Ochroniarz,
                Professions.PoslaniecNocy,
                Professions.Sierzant,
                Professions.Szuler,
                Professions.Tarczownik,
                Professions.Weteran,
                Professions.Zbrojny,
            )
        ),

        Professions.Ochotnik to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.Grabaz,
                Professions.Kominiarz,
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
                Professions.StraznikKanalow,
                Professions.StraznikPol,
                Professions.StraznikSwiatynny,
                Professions.Zlodziej,
            )
        ),

        Professions.Ochroniarz to Paths(
            entry = listOf(
                Professions.Harcownik,
                Professions.Klanbrat,
                Professions.Najemnik,
                Professions.Oprych,
                Professions.PoslaniecNocy,
                Professions.Rynsztokowiec,
                Professions.StraznikWiezienny,
                Professions.SzermierzEstalijski,
                Professions.Szturmoszczur,
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
                Professions.Doker,
                Professions.Klanbrat,
                Professions.PoganiaczSkavenski,
                Professions.Rzezimieszek,
                Professions.ZbieraczLajna,
                Professions.ZolnierzOkretowy,
            ),
            exit = listOf(
                Professions.Gladiator,
                Professions.Klanbrat,
                Professions.Najemnik,
                Professions.Ochroniarz,
                Professions.Oprawca,
                Professions.PoslaniecNocy,
                Professions.Reketer,
            )
        ),

        Professions.Pacholek to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.Lesnik,
                Professions.Lowca,
                Professions.PasterzZCarcassonne,
                Professions.Wloczykij,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.Budowniczy,
                Professions.PasterzZCarcassonne,
                Professions.Przepatrywacz,
                Professions.Rozjemca,
                Professions.Weteran,
                Professions.Zakapturzony,
                Professions.Zbrojny,
            )
        ),

        Professions.PasterzZCarcassonne to Paths(
            entry = listOf(
                Professions.Banita,
                Professions.Chlop,
                Professions.Lesnik,
                Professions.Lowca,
                Professions.Pacholek,
                Professions.PielgrzymGraala,
                Professions.Przepatrywacz,
                Professions.Wloczykij,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.Pacholek,
                Professions.PielgrzymGraala,
                Professions.Weteran,
                Professions.Wloczykij,
                Professions.Zakapturzony,
                Professions.Zbrojny,
                Professions.Zwiadowca,
            )
        ),

        Professions.Paz to Paths(
            entry = listOf(
                Professions.Mieszczanin,
                Professions.Sluga,
            ),
            exit = listOf(
                Professions.Ceremoniarz,
                Professions.Giermek,
                Professions.Herold,
                Professions.Kanciarz,
                Professions.Majordomus,
                Professions.Zak,
            )
        ),

        Professions.Pielgrzym to Paths(
            entry = listOf(
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.Banita,
                Professions.Demagog,
                Professions.Fanatyk,
                Professions.Wloczykij,
                Professions.Zakonnik,
            )
        ),

        Professions.PielgrzymGraala to Paths(
            entry = listOf(
                Professions.Banita,
                Professions.Chlop,
                Professions.Lowca,
                Professions.PasterzZCarcassonne,
                Professions.Rzemieslnik,
                Professions.Wloczykij,
                Professions.Zakapturzony,
            ),
            exit = listOf(
                Professions.Najemnik,
                Professions.PasterzZCarcassonne,
                Professions.PielgrzymBitewny,
                Professions.Wloczykij,
                Professions.Zakapturzony,
            )
        ),

        Professions.PiratRzeczny to Paths(
            entry = listOf(
                Professions.Banita,
                Professions.Chlop,
                Professions.Flisak,
                Professions.Przemytnik,
                Professions.Przewoznik,
                Professions.StraznikRzeczny,
                Professions.Zeglarz,
                Professions.ZolnierzOkretowy,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.Flisak,
                Professions.Weteran,
                Professions.Zlodziej,
                Professions.ZolnierzOkretowy,
            )
        ),

        Professions.Podzegacz to Paths(
            entry = listOf(
                Professions.Fanatyk,
                Professions.Gazeciarz,
                Professions.Herold,
                Professions.Latarnik,
                Professions.Mieszczanin,
                Professions.Oficer,
                Professions.Rozbojnik,
                Professions.Skryba,
                Professions.Sluga,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.Bajarz,
                Professions.Banita,
                Professions.Demagog,
                Professions.Fanatyk,
                Professions.Kanciarz,
                Professions.Klanbrat,
                Professions.Szarlatan,
                Professions.Urzednik,
                Professions.Zakapturzony,
            )
        ),

        Professions.Poganiacz to Paths(
            entry = listOf(
                Professions.Koczownik,
                Professions.Poslaniec,
                Professions.Przepatrywacz,
                Professions.Woznica,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.Koniarz,
                Professions.Koniuszy,
                Professions.Poslaniec,
                Professions.Przepatrywacz,
                Professions.Rozbojnik,
                Professions.StraznikDrog,
                Professions.Zwiadowca,
            )
        ),

        Professions.PoganiaczMulow to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.Lowca,
                Professions.Mieszczanin,
                Professions.Poslaniec,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.Kupiec,
                Professions.Mieszczanin,
                Professions.Poslaniec,
                Professions.Rozbojnik,
                Professions.Zwiadowca,
            )
        ),

        Professions.Pogranicznik to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.Pustelnik,
                Professions.Wloczykij,
            ),
            exit = listOf(
                Professions.Wlamywacz,
                Professions.Wloczykij,
            )
        ),

        Professions.Pokutnik to Paths(
            entry = listOf(
                Professions.Akolita,
                Professions.Banita,
                Professions.Biczownik,
                Professions.Fanatyk,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.Biczownik,
                Professions.Szarlatan,
                Professions.Wloczykij,
            )
        ),

        Professions.PorywaczZwlok to Paths(
            entry = listOf(
                Professions.Balsamista,
                Professions.Cyrulik,
                Professions.Grabaz,
                Professions.Klanbrat,
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

        Professions.PoskramiaczNiedzwiedzi to Paths(
            entry = listOf(
                Professions.Akolita,
                Professions.Cyrkowiec,
                Professions.Kaplan,
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.Cyrkowiec,
                Professions.Gladiator,
                Professions.Zolnierz,
            )
        ),

        Professions.Poslaniec to Paths(
            entry = listOf(
                Professions.Gazeciarz,
                Professions.Ochotnik,
                Professions.Sluga,
                Professions.Przepatrywacz,
                Professions.StraznikDrog,
            ),
            exit = listOf(
                Professions.Ceremoniarz,
                Professions.Falszerz,
                Professions.Gazeciarz,
                Professions.Herold,
                Professions.Klanbrat,
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
                Professions.Doker,
                Professions.Flisak,
                Professions.Gornik,
                Professions.Inzynier,
                Professions.Karczmarz,
                Professions.Latarnik,
                Professions.PoslaniecNocy,
                Professions.Przewoznik,
                Professions.Smieciarz,
                Professions.StraznikKanalow,
                Professions.StraznikRzeczny,
                Professions.StraznikTuneli,
                Professions.Tarczownik,
                Professions.Woznica,
                Professions.Zarzadca,
                Professions.Zeglarz,
                Professions.ZolnierzOkretowy,
            ),
            exit = listOf(
                Professions.Falszerz,
                Professions.Flisak,
                Professions.Paser,
                Professions.PiratRzeczny,
                Professions.Przewoznik,
                Professions.Szarlatan,
                Professions.Tarczownik,
                Professions.Zlodziej,
                Professions.Zeglarz,
            )
        ),

        Professions.Przepatrywacz to Paths(
            entry = listOf(
                Professions.Pacholek,
                Professions.Poslaniec,
                Professions.StraznikDrog,
                Professions.WojownikKlanowy,
                Professions.Zolnierz,
            ),
            exit = listOf(
                Professions.Najemnik,
                Professions.PasterzZCarcassonne,
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
                Professions.PiratRzeczny,
                Professions.Przemytnik,
                Professions.Rozbojnik,
                Professions.StraznikDrog,
                Professions.StraznikRzeczny,
                Professions.Zeglarz,
            )
        ),

        Professions.Pustelnik to Paths(
            entry = listOf(
            ),
            exit = listOf(
                Professions.Banita,
                Professions.Mistyk,
                Professions.Pogranicznik,
                Professions.Szperacz,
                Professions.Wloczykij,
            )
        ),

        Professions.Rozjemca to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.Kanciarz,
                Professions.Lowca,
                Professions.Pacholek,
                Professions.Zakapturzony,
            ),
            exit = listOf(
                Professions.Demagog,
                Professions.Kanciarz,
                Professions.StarszyWioskowy,
                Professions.Zakapturzony,
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

        Professions.RycerzPlonacegoSlonca to Paths(
            entry = listOf(
                Professions.Arystokrata,
                Professions.Giermek,
                Professions.Kaplan,
                Professions.Rycerz,
                Professions.Sierzant,
                Professions.WybraniecBozy,
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.Fechtmistrz,
                Professions.MistrzZakonny,
                Professions.Odkrywca,
                Professions.Oficer,
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
                Professions.Doker,
                Professions.Falszerz,
                Professions.Harcownik,
                Professions.Klanbrat,
                Professions.Mieszczanin,
                Professions.Straznik,
            ),
            exit = listOf(
                Professions.Balsamista,
                Professions.Brygadzista,
                Professions.Budowniczy,
                Professions.Falszerz,
                Professions.Fanatyk,
                Professions.Harcownik,
                Professions.Inzynier,
                Professions.Klanbrat,
                Professions.Kupiec,
                Professions.MistrzRzemiosla,
                Professions.Ochotnik,
                Professions.PielgrzymGraala,
                Professions.RzecznikRodu,
            )
        ),

        Professions.Rzezimieszek to Paths(
            entry = listOf(
                Professions.Gladiator,
                Professions.LowcaNagrod,
                Professions.Kominiarz,
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
                Professions.Czarnoksieznik,
                Professions.CzeladnikRun,
                Professions.Falszerz,
                Professions.Gazeciarz,
                Professions.UczenCzarodzieja,
                Professions.UczenSzaregoProroka,
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.Brygadzista,
                Professions.CzeladnikRun,
                Professions.Katecheta,
                Professions.Mnich,
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
                Professions.Latarnik,
            ),
            exit = listOf(
                Professions.CiuraObozowa,
                Professions.Gazeciarz,
                Professions.Karczmarz,
                Professions.Latarnik,
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
                Professions.Grabaz,
                Professions.Latarnik,
                Professions.StraznikKanalow,
                Professions.StraznikSwiatynny,
                Professions.StraznikWiezienny,
                Professions.Zolnierz,
            ),
            exit = listOf(
                Professions.Harcownik,
                Professions.Klanbrat,
                Professions.Najemnik,
                Professions.Reketer,
                Professions.Rzemieslnik,
                Professions.Sierzant,
                Professions.StraznikDrog,
                Professions.StraznikKanalow,
                Professions.StraznikSwiatynny,
                Professions.StraznikTuneli,
                Professions.SledczyVereny,
                Professions.Zolnierz,
            )
        ),

        Professions.StraznikDrog to Paths(
            entry = listOf(
                Professions.Poslaniec,
                Professions.Przepatrywacz,
                Professions.Przewoznik,
                Professions.Straznik,
                Professions.StraznikRzeczny,
                Professions.Woznica,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.Mytnik,
                Professions.Poslaniec,
                Professions.Przepatrywacz,
                Professions.Rozbojnik,
                Professions.Sierzant,
                Professions.SledczyVereny,
                Professions.StraznikRzeczny,
                Professions.Zwiadowca,
            )
        ),

        Professions.StraznikKanalow to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.Ochotnik,
                Professions.Straznik,
                Professions.StraznikWiezienny,
                Professions.Szczurolap,
                Professions.Tarczownik,
                Professions.ZbieraczLajna,
            ),
            exit = listOf(
                Professions.Najemnik,
                Professions.Przemytnik,
                Professions.Sierzant,
                Professions.Straznik,
                Professions.Szczurolap,
                Professions.Tarczownik,
                Professions.Weteran,
            )
        ),

        Professions.StraznikPol to Paths(
            entry = listOf(
                Professions.Lowca,
                Professions.Mytnik,
                Professions.Ochotnik,
            ),
            exit = listOf(
                Professions.AgentCalunu,
                Professions.LowcaNagrod,
                Professions.LowcaWampirow,
                Professions.Najemnik,
                Professions.Wloczykij,
                Professions.Zwiadowca,
            )
        ),

        Professions.StraznikRzeczny to Paths(
            entry = listOf(
                Professions.Flisak,
                Professions.Przewoznik,
                Professions.StraznikDrog,
                Professions.ZolnierzOkretowy,
            ),
            exit = listOf(
                Professions.Flisak,
                Professions.Mytnik,
                Professions.PiratRzeczny,
                Professions.Przemytnik,
                Professions.Sierzant,
                Professions.StraznikDrog,
                Professions.SledczyVereny,
                Professions.Zeglarz,
                Professions.ZolnierzOkretowy,
            )
        ),

        Professions.StraznikSwiatynny to Paths(
            entry = listOf(
                Professions.Akolita,
                Professions.Fanatyk,
                Professions.Ochotnik,
                Professions.Straznik,
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.Giermek,
                Professions.Najemnik,
                Professions.Straznik,
                Professions.Zolnierz,
            )
        ),

        Professions.StraznikTuneli to Paths(
            entry = listOf(
                Professions.HienaCmentarna,
                Professions.Straznik,
                Professions.Szczurolap,
                Professions.Tarczownik,
                Professions.Zolnierz,
            ),
            exit = listOf(
                Professions.Inzynier,
                Professions.Najemnik,
                Professions.Odkrywca,
                Professions.Przemytnik,
                Professions.Sierzant,
                Professions.Weteran,
            )
        ),

        Professions.StraznikWiezienny to Paths(
            entry = listOf(
                Professions.Klanbrat,
                Professions.Ochroniarz,
                Professions.Szczurolap,
            ),
            exit = listOf(
                Professions.Klanbrat,
                Professions.Ochroniarz,
                Professions.Oprawca,
                Professions.Straznik,
                Professions.StraznikKanalow,
                Professions.Szczurolap,
                Professions.Zarzadca,
            )
        ),

        Professions.Strielec to Paths(
            entry = listOf(
                Professions.KozakKislevski,
                Professions.Straznik,
            ),
            exit = listOf(
                Professions.Czekista,
                Professions.Husarz,
                Professions.LowcaNagrod,
                Professions.Najemnik,
                Professions.Sierzant,
                Professions.Straznik,
                Professions.Weteran,
            )
        ),

        Professions.StrzyganskiMistyk to Paths(
            entry = listOf(
            ),
            exit = listOf(
                Professions.Astrolog,
                Professions.Cyrkowiec,
                Professions.Guslarz,
                Professions.Kanciarz,
                Professions.Szarlatan,
                Professions.Smieciarz,
                //Professions.Wrozbita,
                Professions.Zlodziej,
            )
        ),

        Professions.Szczurolap to Paths(
            entry = listOf(
                Professions.Goniec,
                Professions.HienaCmentarna,
                Professions.Kominiarz,
                Professions.PorywaczZwlok,
                Professions.StraznikKanalow,
                Professions.StraznikWiezienny,
                Professions.ZbieraczLajna,
            ),
            exit = listOf(
                Professions.Grabaz,
                Professions.Latarnik,
                Professions.PorywaczZwlok,
                Professions.StraznikKanalow,
                Professions.StraznikWiezienny,
                Professions.Smieciarz,
                Professions.StraznikTuneli,
                Professions.Tarczownik,
                Professions.Wlamywacz,
                Professions.ZbieraczLajna,
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
                Professions.Astrolog,
                Professions.BlednyRycerz,
                Professions.Dworzanin,
                Professions.Giermek,
                Professions.Kanciarz,
                Professions.Rajtar,
                Professions.Szuler,
                Professions.Urzednik,
                Professions.Zak,
                Professions.Zakapturzony,
            )
        ),

        Professions.Szperacz to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.Pustelnik,
                Professions.Wloczykij,
            ),
            exit = listOf(
                Professions.Chlop,
                Professions.Najemnik,
                Professions.Wloczykij,
            )
        ),

        Professions.Szuler to Paths(
            entry = listOf(
                Professions.Cyrkowiec,
                Professions.Kanciarz,
                Professions.Najemnik,
                Professions.Szlachcic,
                Professions.Wloczykij,
                Professions.Zlodziej,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.Cyrkowiec,
                Professions.Demagog,
                Professions.Kanciarz,
                Professions.Rozbojnik,
                Professions.Szarlatan,
            )
        ),

        Professions.SledczyVereny to Paths(
            entry = listOf(
                Professions.Akolita,
                Professions.Kaplan,
                Professions.LowcaCzarownic,
                Professions.LowcaNagrod,
                Professions.Straznik,
                Professions.StraznikDrog,
                Professions.StraznikRzeczny,
                Professions.Szpieg,
                Professions.Uczony,
                Professions.Wlamywacz,
                Professions.Zlodziej,
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.LowcaCzarownic,
                Professions.Szpieg,
                Professions.Uczony,
            )
        ),

        Professions.Smieciarz to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.Klanbrat,
                Professions.StrzyganskiMistyk,
                Professions.Szczurolap,
                Professions.Wloczykij,
                Professions.ZbieraczLajna,
            ),
            exit = listOf(
                Professions.CiuraObozowa,
                Professions.Grabaz,
                Professions.Paser,
                Professions.PorywaczZwlok,
                Professions.Przemytnik,
                Professions.Wlamywacz,
                Professions.ZbieraczLajna,
            )
        ),

        Professions.Tarczownik to Paths(
            entry = listOf(
                Professions.CzeladnikRun,
                Professions.Goniec,
                Professions.Gornik,
                Professions.HienaCmentarna,
                Professions.KowalRun,
                Professions.KozakKislevski,
                Professions.Najemnik,
                Professions.Przemytnik,
                Professions.StraznikKanalow,
                Professions.Szczurolap,
            ),
            exit = listOf(
                Professions.Gladiator,
                Professions.Goniec,
                Professions.HienaCmentarna,
                Professions.Przemytnik,
                Professions.Sierzant,
                Professions.StraznikKanalow,
                Professions.StraznikTuneli,
                Professions.Weteran,
            )
        ),

        Professions.UczenCzarodzieja to Paths(
            entry = listOf(
                Professions.Aptekarz,
                Professions.Astrolog,
                Professions.Balsamista,
                Professions.Czarownik,
                Professions.Czarnoksieznik,
                Professions.Guslarz,
                Professions.Skryba,
                Professions.Uczony,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.Aptekarz,
                Professions.Astrolog,
                Professions.Skryba,
                Professions.Uczony,
                Professions.WedrownyCzarodziej,
            )
        ),

        Professions.UczennicaCzarownicy to Paths(
            entry = listOf(
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.Czarownik,
                Professions.LodowaPanna,
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
                Professions.Latarnik,
                Professions.Lesnik,
                Professions.Lowca,
                Professions.Kominiarz,
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
                Professions.Czarownik,
                Professions.Czarnoksieznik,
                Professions.Guslarz,
                Professions.Klanbrat,
                Professions.Lesnik,
                Professions.PasterzZCarcassonne,
                Professions.Pielgrzym,
                Professions.PielgrzymBitewny,
                Professions.PielgrzymGraala,
                Professions.PoganiaczSkavenski,
                Professions.Pokutnik,
                Professions.PoslaniecNocy,
                Professions.RzecznikRodu,
                Professions.StraznikPol,
                Professions.Weglarz,
                Professions.Wlamywacz,
                Professions.WojownikKlanowy,
                Professions.Zakapturzony,
                Professions.Zolnierz,
            ),
            exit = listOf(
                Professions.Bajarz,
                Professions.Cyrkowiec,
                Professions.Klanbrat,
                Professions.Lesnik,
                Professions.Pacholek,
                Professions.PasterzZCarcassonne,
                Professions.PielgrzymGraala,
                Professions.Smieciarz,
                Professions.Szuler,
                Professions.Zakonnik,
                Professions.ZbieraczLajna,
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
                Professions.Zakapturzony,
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
                Professions.Doker,
                Professions.HienaCmentarna,
                Professions.Kanciarz,
                Professions.Klanbrat,
                Professions.Mytnik,
                Professions.Ochotnik,
                Professions.Oprawca,
                Professions.PiratRzeczny,
                Professions.PorywaczZwlok,
                Professions.PoslaniecNocy,
                Professions.Przemytnik,
                Professions.Rzezimieszek,
                Professions.Sluga,
                Professions.StrzyganskiMistyk,
                Professions.Szczurolap,
                Professions.Wloczykij,
                Professions.Zakapturzony,
            ),
            exit = listOf(
                Professions.Cyrkowiec,
                Professions.HienaCmentarna,
                Professions.Kanciarz,
                Professions.Klanbrat,
                Professions.Kominiarz,
                Professions.Paser,
                Professions.PoslaniecNocy,
                Professions.Szarlatan,
                Professions.Szuler,
                Professions.SledczyVereny,
                Professions.Wlamywacz,
            )
        ),

        Professions.Zak to Paths(
            entry = listOf(
                Professions.Bard,
                Professions.Falszerz,
                Professions.Paz,
                Professions.PorywaczZwlok,
                Professions.RzecznikRodu,
                Professions.Szlachcic,
            ),
            exit = listOf(
                Professions.AgentCalunu,
                Professions.Akolita,
                Professions.Aptekarz,
                Professions.Astrolog,
                Professions.Bajarz,
                Professions.Balsamista,
                Professions.Cyrulik,
                Professions.CzeladnikRun,
                Professions.Falszerz,
                Professions.Gazeciarz,
                Professions.Inzynier,
                Professions.Katecheta,
                Professions.Medyk,
                Professions.Mnich,
                Professions.Podzegacz,
                Professions.Pokutnik,
                Professions.RzecznikRodu,
                Professions.Szuler,
                Professions.UczenCzarodzieja,
                Professions.Uczony,
            )
        ),

        Professions.Zakapturzony to Paths(
            entry = listOf(
                Professions.Banita,
                Professions.BlednyRycerz,
                Professions.Chlop,
                Professions.Kanciarz,
                Professions.Karczmarz,
                Professions.Lesnik,
                Professions.Lowca,
                Professions.Pacholek,
                Professions.PasterzZCarcassonne,
                Professions.PielgrzymGraala,
                Professions.Podzegacz,
                Professions.Rozjemca,
                Professions.Szarlatan,
                Professions.Szlachcic,
                Professions.Woznica,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.Demagog,
                Professions.PielgrzymGraala,
                Professions.Rozjemca,
                Professions.Weteran,
                Professions.Wloczykij,
                Professions.Zlodziej,
                Professions.Zwiadowca,
            )
        ),

        Professions.ZbieraczLajna to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.CiuraObozowa,
                Professions.Szczurolap,
                Professions.Smieciarz,
                Professions.Wloczykij,
            ),
            exit = listOf(
                Professions.HienaCmentarna,
                Professions.Oprych,
                Professions.StraznikKanalow,
                Professions.Szczurolap,
                Professions.Smieciarz,
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
                Professions.StraznikRzeczny,
            ),
            exit = listOf(
                Professions.Bajarz,
                Professions.Bosman,
                Professions.Kanciarz,
                Professions.Nawigator,
                Professions.PiratRzeczny,
                Professions.Przemytnik,
                Professions.ZolnierzOkretowy,
            )
        ),

        Professions.Znachorka to Paths(
            entry = listOf(
            ),
            exit = listOf(
                Professions.Demagog,
                Professions.Guslarz,
                Professions.Koczownik,
                Professions.Urzednik,
                Professions.Wiedzma,
            )
        ),

        Professions.Zolnierz to Paths(
            entry = listOf(
                Professions.Biczownik,
                Professions.Lowca,
                Professions.Mytnik,
                Professions.Poslaniec,
                Professions.Straznik,
                Professions.StraznikSwiatynny,
            ),
            exit = listOf(
                Professions.Bajarz,
                Professions.Najemnik,
                Professions.Przepatrywacz,
                Professions.Sierzant,
                Professions.Straznik,
                Professions.StraznikTuneli,
                Professions.Weteran,
                Professions.Wloczykij,
            )
        ),

        Professions.ZolnierzOkretowy to Paths(
            entry = listOf(
                Professions.Doker,
                Professions.Flisak,
                Professions.PiratRzeczny,
                Professions.Rybak,
                Professions.StraznikRzeczny,
                Professions.Zeglarz,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.Bosman,
                Professions.Oprych,
                Professions.PiratRzeczny,
                Professions.Przemytnik,
                Professions.Sierzant,
                Professions.StraznikRzeczny,
            )
        ),
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////        ZAAWANSOWANE      //////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////

        Professions.AgentCalunu to Paths(
            entry = listOf(
                Professions.Akolita,
                Professions.Cyrulik,
                Professions.HienaCmentarna,
                Professions.LowcaWampirow,
                Professions.StraznikPol,
                Professions.Uczony,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.Kaplan,
                Professions.LowcaCzarownic,
                Professions.LowcaWampirow,
                Professions.Szpieg,
                Professions.Uczony,
                Professions.ZabojcaNieumarlych,
            )
        ),

        Professions.Ambasador to Paths(
            entry = listOf(
                Professions.Arcykaplan,
                Professions.Arcymag,
                Professions.Arystokrata,
                Professions.LodowaCzarownica,
                Professions.Oficer,
            ),
            exit = listOf(
                Professions.Arystokrata,
                Professions.Kupiec,
                Professions.Oficer,
                Professions.Urzednik,
            )
        ),

        Professions.Arcykaplan to Paths(
            entry = listOf(
                Professions.KaplanWojownik,
                Professions.Opat,
                Professions.WybraniecBozy,
            ),
            exit = listOf(
                Professions.LowcaCzarownic,
                Professions.Opat,
                Professions.Psalterzysta,
                Professions.Uczony,
                Professions.Urzednik,
            )
        ),

        Professions.Arcymag to Paths(
            entry = listOf(
                Professions.MagisterRewizor,
                Professions.MistrzMagii,
            ),
            exit = listOf(
                Professions.MistrzGildii,
                Professions.Odkrywca,
            )
        ),

        Professions.Arcymistrz to Paths(
            entry = listOf(
                Professions.MistrzZakonny,
            ),
            exit = listOf(
                Professions.Arystokrata,
                Professions.Fechtmistrz,
                Professions.LowcaCzarownic,
                Professions.Oficer,
            )
        ),

        Professions.ArcymistrzRun to Paths(
            entry = listOf(
                Professions.MistrzRun,
            ),
            exit = listOf(
                Professions.MistrzGildii,
                Professions.Oficer,
            )
        ),

        Professions.Artylerzysta to Paths(
            entry = listOf(
                Professions.Inzynier,
                Professions.Sierzant,
            ),
            exit = listOf(
                Professions.MistrzGildii,
                Professions.MistrzRzemiosla,
                Professions.Najemnik,
                Professions.Oficer,
                Professions.Weteran,
            )
        ),

        Professions.Arystokrata to Paths(
            entry = listOf(
                Professions.Arcymistrz,
                Professions.Dworzanin,
                Professions.Kapitan,
                Professions.Krzyzowiec,
                Professions.MistrzZakonny,
                Professions.Rycerz,
                Professions.RycerzGraala,
                Professions.RycerzKrolestwa,
                Professions.RycerzProby,
                Professions.Urzednik,
            ),
            exit = listOf(
                Professions.Bezimienny,
                Professions.Kapitan,
                Professions.Krzyzowiec,
                Professions.Oficer,
                Professions.Rycerz,
                Professions.RycerzPlonacegoSlonca,
                Professions.Uczony,
            )
        ),

        Professions.Ataman to Paths(
            entry = listOf(
                Professions.Koniuszy,
                Professions.Oficer,
                Professions.Szlachcic,
                Professions.Weteran,
            ),
            exit = listOf(
                Professions.Arystokrata,
                Professions.Kaplan,
                Professions.Urzednik,
            )
        ),

        Professions.Bard to Paths(
            entry = listOf(
                Professions.Cyrkowiec,
                Professions.Psalterzysta,
            ),
            exit = listOf(
                Professions.Demagog,
                Professions.Psalterzysta,
                Professions.Rozbojnik,
                Professions.Szarlatan,
                Professions.Szpieg,
                Professions.Zak,
            )
        ),

        Professions.Bezimienny to Paths(
            entry = listOf(
                Professions.Arystokrata,
                Professions.Demagog,
                Professions.HersztBanitow,
                Professions.KsiazeZlodziei,
                Professions.Majordomus,
                Professions.PielgrzymBitewny,
                Professions.RycerzGraala,
                Professions.RycerzKrolestwa,
                Professions.RycerzProby,
                Professions.StarszyWioskowy,
                Professions.Urzednik,
                Professions.Weteran,
                Professions.Zbrojny,
            ),
            exit = listOf(
                Professions.Demagog,
                Professions.HersztBanitow,
                Professions.KsiazeZlodziei,
                Professions.Odkrywca,
                Professions.Rozbojnik,
                Professions.StarszyWioskowy,
            )
        ),

        Professions.BiczBozy to Paths(
            entry = listOf(
                Professions.Biczownik,
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.Fechtmistrz,
                Professions.LowcaCzarownic,
                Professions.Oprawca,
            )
        ),

        Professions.Biczownik to Paths(
            entry = listOf(
                Professions.Fanatyk,
                Professions.Kaplan,
                Professions.Pokutnik,
                Professions.WybraniecBozy,
                Professions.Zakonnik,
            ),
            exit = listOf(
                Professions.BiczBozy,
                Professions.Demagog,
                Professions.Kaplan,
                Professions.Oprawca,
                Professions.Pokutnik,
                Professions.Weteran,
                Professions.ZabojcaNieumarlych,
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

        Professions.Brygadzista to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.Doker,
                Professions.Rzemieslnik,
                Professions.Skryba,
            ),
            exit = listOf(
                Professions.Demagog,
                Professions.MistrzGildii,
                Professions.Paser,
                Professions.Reketer,
                Professions.Urzednik,
            )
        ),

        Professions.Budowniczy to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.Pacholek,
                Professions.Rzemieslnik,
            ),
            exit = listOf(
                Professions.Majordomus,
                Professions.Szpieg,
                Professions.Zbrojny,
            )
        ),

        Professions.Ceremoniarz to Paths(
            entry = listOf(
                Professions.Akolita,
                Professions.Dworzanin,
                Professions.Kaplan,
                Professions.Paz,
                Professions.Poslaniec,
                Professions.WybraniecBozy,
            ),
            exit = listOf(
                Professions.Giermek,
                Professions.Kaplan,
                Professions.Majordomus,
                Professions.Urzednik,
            )
        ),

        Professions.CzarnyStraznik to Paths(
            entry = listOf(
                Professions.Giermek,
                Professions.Kaplan,
                Professions.LowcaCzarownic,
                Professions.LowcaWampirow,
                Professions.Rycerz,
                Professions.Sierzant,
            ),
            exit = listOf(
                Professions.Fechtmistrz,
                Professions.Kaplan,
                Professions.LowcaWampirow,
                Professions.MistrzZakonny,
                Professions.Oficer,
                Professions.RycerzKruka,
                Professions.ZabojcaNieumarlych,
            )
        ),

        Professions.Czarownik to Paths(
            entry = listOf(
                Professions.Guslarz,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.Czarnoksieznik,
                Professions.Szarlatan,
                Professions.UczenCzarodzieja,
                Professions.Wloczykij,
            )
        ),

        Professions.Czarnoksieznik to Paths(
            entry = listOf(
                Professions.Czarownik,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.Skryba,
                Professions.Szarlatan,
                Professions.UczenCzarodzieja,
                Professions.Wloczykij,
            )
        ),

        Professions.Demagog to Paths(
            entry = listOf(
                Professions.Akolita,
                Professions.Bajarz,
                Professions.Banita,
                Professions.Bard,
                Professions.Bezimienny,
                Professions.Biczownik,
                Professions.Brygadzista,
                Professions.Gazeciarz,
                Professions.HersztBanitow,
                Professions.Kanciarz,
                Professions.Katecheta,
                Professions.KsiazeZlodziei,
                Professions.LowcaCzarownic,
                Professions.LowcaWampirow,
                Professions.MistrzRzemiosla,
                Professions.Mnich,
                Professions.Pielgrzym,
                Professions.Podzegacz,
                Professions.Rozjemca,
                Professions.StarszyWioskowy,
                Professions.Szarlatan,
                Professions.Szuler,
                Professions.Urzednik,
                Professions.WybraniecBozy,
                Professions.Zakapturzony,
                Professions.Zakonnik,
            ),
            exit = listOf(
                Professions.Bezimienny,
                Professions.HersztBanitow,
                Professions.KsiazeZlodziei,
                Professions.Najemnik,
                Professions.Urzednik,
                Professions.Zakonnik,
            )
        ),

        Professions.Dworak to Paths(
            entry = listOf(
                Professions.Dworzanin,
                Professions.HersztBanitow,
                Professions.Oficer,
                Professions.Sierzant,
                Professions.Szlachcic,
                Professions.Urzednik,
            ),
            exit = listOf(
                Professions.Arystokrata,
                Professions.Dworzanin,
                Professions.Oficer,
                Professions.Skrytobojca,
                Professions.Szpieg,
            )
        ),

        Professions.Dworzanin to Paths(
            entry = listOf(
                Professions.Bajarz,
                Professions.Herold,
                Professions.Rajtar,
                Professions.RycerzGraala,
                Professions.RycerzKrolestwa,
                Professions.RycerzProby,
                Professions.Szlachcic,
                Professions.Urzednik,
            ),
            exit = listOf(
                Professions.Arystokrata,
                Professions.Ceremoniarz,
                Professions.Majordomus,
                Professions.Szarlatan,
                Professions.Szpieg,
                Professions.Urzednik,
                Professions.Zwadzca,
            )
        ),

        Professions.Fechtmistrz to Paths(
            entry = listOf(
                Professions.Arcymistrz,
                Professions.BiczBozy,
                Professions.CzarnyStraznik,
                Professions.LowcaCzarownic,
                Professions.MistrzZakonny,
                Professions.RycerzKruka,
                Professions.RycerzPlonacegoSlonca,
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
                Professions.Bajarz,
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
                Professions.Bezimienny,
                Professions.Demagog,
                Professions.KsiazeZlodziei,
                Professions.LesnyDuch,
                Professions.MistrzCieni,
                Professions.Oficer,
                Professions.Reketer,
                Professions.Rozbojnik,
                Professions.Skrytobojca,
                Professions.StarszyWioskowy,
                Professions.Weteran,
                Professions.Zbrojny,
                Professions.Zwiadowca,
            ),
            exit = listOf(
                Professions.Bezimienny,
                Professions.Demagog,
                Professions.KsiazeZlodziei,
                Professions.Oficer,
                Professions.Skrytobojca,
            )
        ),

        Professions.Husarz to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.Koniuszy,
                Professions.KozakKislevski,
                Professions.Przepatrywacz,
                Professions.Strielec,
                Professions.Szlachcic,
            ),
            exit = listOf(
                Professions.Koniuszy,
                Professions.Oficer,
                Professions.Weteran,
                Professions.Zwiadowca,
            )
        ),

        Professions.Inzynier to Paths(
            entry = listOf(
                Professions.Gornik,
                Professions.Harcownik,
                Professions.MistrzRzemiosla,
                Professions.Rzemieslnik,
                Professions.StraznikTuneli,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.Artylerzysta,
                Professions.InzynierSpaczenia,
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
                Professions.AgentCalunu,
                Professions.Akolita,
                Professions.Biczownik,
                Professions.Ceremoniarz,
                Professions.CzarnyStraznik,
                Professions.Mnich,
                Professions.Psalterzysta,
                Professions.Zakonnik,
            ),
            exit = listOf(
                Professions.Biczownik,
                Professions.Ceremoniarz,
                Professions.CzarnyStraznik,
                Professions.Egzorcysta,
                Professions.KaplanWojownik,
                Professions.Katecheta,
                Professions.Majordomus,
                Professions.Psalterzysta,
                Professions.RycerzPlonacegoSlonca,
                Professions.SledczyVereny,
                Professions.Uczony,
                Professions.WybraniecBozy,
            )
        ),

        Professions.KaplanWojownik to Paths(
            entry = listOf(
                Professions.Kaplan,
                Professions.WybraniecBozy,
            ),
            exit = listOf(
                Professions.Arcykaplan,
                Professions.LowcaCzarownic,
                Professions.Rycerz,
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
                Professions.Zakapturzony,
            )
        ),

        Professions.Katecheta to Paths(
            entry = listOf(
                Professions.Fanatyk,
                Professions.Kaplan,
                Professions.Psalterzysta,
                Professions.Skryba,
                Professions.Uczony,
                Professions.WybraniecBozy,
                Professions.Zakonnik,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.Demagog,
                Professions.Fanatyk,
                Professions.Uczony,
                Professions.Zakonnik,
            )
        ),

        Professions.Koniuszy to Paths(
            entry = listOf(
                Professions.Banita,
                Professions.Giermek,
                Professions.Husarz,
                Professions.Koczownik,
                Professions.Koniarz,
                Professions.KonnyLucznik,
                Professions.Najemnik,
                Professions.Poganiacz,
                Professions.Przepatrywacz,
                Professions.Rajtar,
                Professions.StraznikDrog,
                Professions.Szlachcic,
                Professions.Zwiadowca,
                Professions.Zolnierz,
            ),
            exit = listOf(
                Professions.Ataman,
                Professions.Husarz,
                Professions.Koniarz,
                Professions.KonnyLucznik,
                Professions.Kupiec,
                Professions.Poganiacz,
                Professions.Sierzant,
            )
        ),

        Professions.Koniuszy to Paths(
            entry = listOf(
                Professions.Chlop,
                Professions.Koczownik,
                Professions.Koniuszy,
                Professions.Szlachcic,
            ),
            exit = listOf(
                Professions.Koczownik,
                Professions.Koniuszy,
                Professions.Najemnik,
                Professions.Oficer,
                Professions.Strzelec,
                Professions.Weteran,
                Professions.Zwiadowca,
            )
        ),

        Professions.KowalRun to Paths(
            entry = listOf(
                Professions.CzeladnikRun,
            ),
            exit = listOf(
                Professions.MistrzRun,
                Professions.Tarczownik,
                Professions.Uczony,
            )
        ),

        Professions.Krzyzowiec to Paths(
            entry = listOf(
                Professions.Arystokrata,
                Professions.Rycerz,
                Professions.Sierzant,
                Professions.Weteran,
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.Arystokrata,
                Professions.MistrzZakonny,
                Professions.Odkrywca,
                Professions.Oficer,
                Professions.Szampierz,
                Professions.Weteran,
            )
        ),

        Professions.KsiazeZlodziei to Paths(
            entry = listOf(
                Professions.Bezimienny,
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
                Professions.Bezimienny,
                Professions.Demagog,
                Professions.HersztBanitow,
                Professions.MistrzCieni,
                Professions.Urzednik,
            )
        ),

        Professions.Kupiec to Paths(
            entry = listOf(
                Professions.Aptekarz,
                Professions.Bosman,
                Professions.Doker,
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

        Professions.LodowaCzarownica to Paths(
            entry = listOf(
                Professions.LodowaPanna,
            ),
            exit = listOf(
                Professions.Ambasador,
                Professions.Oficer,
            )
        ),

        Professions.LodowaPanna to Paths(
            entry = listOf(
                Professions.UczennicaCzarownicy,
            ),
            exit = listOf(
                Professions.Czarownik,
                Professions.Dworzanin,
                Professions.LodowaCzarownica,
                Professions.Sierzant,
                Professions.Weteran,
                Professions.Zwiadowca,
            )
        ),

        Professions.LowcaCzarownic to Paths(
            entry = listOf(
                Professions.AgentCalunu,
                Professions.Arcykaplan,
                Professions.Arcymistrz,
                Professions.BiczBozy,
                Professions.Egzorcysta,
                Professions.Fechtmistrz,
                Professions.KaplanWojownik,
                Professions.LowcaWampirow,
                Professions.MagisterRewizor,
                Professions.MistrzZakonny,
                Professions.RycerzKruka,
                Professions.Skrytobojca,
                Professions.Szampierz,
                Professions.SledczyVereny,
                Professions.WybraniecBozy,
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.CzarnyStraznik,
                Professions.Demagog,
                Professions.Fechtmistrz,
                Professions.MistrzZakonny,
                Professions.Oficer,
                Professions.SledczyVereny,
                Professions.ZabojcaNieumarlych,
            )
        ),

        Professions.LowcaWampirow to Paths(
            entry = listOf(
                Professions.AgentCalunu,
                Professions.CzarnyStraznik,
                Professions.Grabaz,
                Professions.HienaCmentarna,
                Professions.LesnyDuch,
                Professions.LowcaNagrod,
                Professions.Rycerz,
                Professions.StraznikPol,
                Professions.Zwiadowca,
            ),
            exit = listOf(
                Professions.AgentCalunu,
                Professions.Akolita,
                Professions.CzarnyStraznik,
                Professions.Demagog,
                Professions.LowcaCzarownic,
                Professions.Rycerz,
                Professions.Strzelec,
                Professions.ZabojcaNieumarlych,
            )
        ),

        Professions.MagisterRewizor to Paths(
            entry = listOf(
                Professions.MistrzMagii,
                Professions.WedrownyCzarodziej,
            ),
            exit = listOf(
                Professions.Arcymag,
                Professions.LowcaCzarownic,
                Professions.MistrzMagii,
                Professions.Szpieg,
            )
        ),

        Professions.Majordomus to Paths(
            entry = listOf(
                Professions.Budowniczy,
                Professions.Ceremoniarz,
                Professions.Dworzanin,
                Professions.Kaplan,
                Professions.Mnich,
                Professions.Paz,
                Professions.StarszyWioskowy,
                Professions.Uczony,
                Professions.Urzednik,
            ),
            exit = listOf(
                Professions.Bezimienny,
                Professions.KsiazeZlodziei,
                Professions.Kupiec,
                Professions.Paser,
                Professions.Szlachcic,
            )
        ),

        Professions.Medyk to Paths(
            entry = listOf(
                Professions.Aptekarz,
                Professions.Balsamista,
                Professions.Cyrulik,
                Professions.MistrzCialoksztaltowania,
                Professions.Mnich,
                Professions.Oprawca,
                Professions.Uczony,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.Astrolog,
                Professions.MistrzGildii,
                Professions.Mnich,
                Professions.Szpieg,
                Professions.Uczony,
                Professions.Zakonnik,
            )
        ),

        Professions.MistrzCieni to Paths(
            entry = listOf(
                Professions.KsiazeZlodziei,
                Professions.MistrzSkrytobojca,
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
                Professions.ArcymistrzRun,
                Professions.Artylerzysta,
                Professions.Brygadzista,
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
                Professions.MagisterRewizor,
                Professions.SkavenskiZaklinacz,
                Professions.WedrownyCzarodziej,
            ),
            exit = listOf(
                Professions.Arcymag,
                Professions.Astrolog,
                Professions.MagisterRewizor,
                Professions.Odkrywca,
                Professions.Uczony,
            )
        ),

        Professions.MistrzRun to Paths(
            entry = listOf(
                Professions.KowalRun,
            ),
            exit = listOf(
                Professions.ArcymistrzRun,
                Professions.Uczony,
                Professions.Weteran,
            )
        ),

        Professions.MistrzRzemiosla to Paths(
            entry = listOf(
                Professions.Aptekarz,
                Professions.Artylerzysta,
                Professions.Falszerz,
                Professions.Inzynier,
                Professions.Nawigator,
                Professions.Ochotnik,
                Professions.Rzemieslnik,
            ),
            exit = listOf(
                Professions.CzeladnikRun,
                Professions.Demagog,
                Professions.Falszerz,
                Professions.Inzynier,
                Professions.Kupiec,
                Professions.MistrzGildii,
                Professions.Ochotnik,
            )
        ),

        Professions.MistrzZakonny to Paths(
            entry = listOf(
                Professions.CzarnyStraznik,
                Professions.Krzyzowiec,
                Professions.LowcaCzarownic,
                Professions.Rycerz,
                Professions.RycerzKruka,
                Professions.RycerzPlonacegoSlonca,
            ),
            exit = listOf(
                Professions.Arcymistrz,
                Professions.Arystokrata,
                Professions.Fechtmistrz,
                Professions.LowcaCzarownic,
                Professions.Oficer,
                Professions.RycerzKruka,
            )
        ),

        Professions.Mistyk to Paths(
            entry = listOf(
                Professions.Cenobita,
                Professions.Pustelnik,
            ),
            exit = listOf(
                Professions.Demagog,
                Professions.Guslarz,
                Professions.Kanciarz,
                Professions.Szarlatan,
            )
        ),

        Professions.Mnich to Paths(
            entry = listOf(
                Professions.Akolita,
                Professions.Medyk,
                Professions.Skryba,
                Professions.Uczony,
                Professions.Zakonnik,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.Demagog,
                Professions.Fanatyk,
                Professions.Kaplan,
                Professions.Majordomus,
                Professions.Medyk,
                Professions.Opat,
                Professions.Psalterzysta,
                Professions.Uczony,
                Professions.Zakonnik,
            )
        ),

        Professions.Nawigator to Paths(
            entry = listOf(
                Professions.Astrolog,
                Professions.Bosman,
                Professions.Flisak,
                Professions.Rybak,
                Professions.Skryba,
                Professions.Zeglarz,
            ),
            exit = listOf(
                Professions.Astrolog,
                Professions.Kapitan,
                Professions.MistrzRzemiosla,
                Professions.Odkrywca,
                Professions.Uczony,
            )
        ),

        Professions.Opat to Paths(
            entry = listOf(
                Professions.Arcykaplan,
                Professions.Mnich,
                Professions.Uczony,
                Professions.WybraniecBozy,
            ),
            exit = listOf(
                Professions.Arcykaplan,
                Professions.Uczony,
            )
        ),

        Professions.Odkrywca to Paths(
            entry = listOf(
                Professions.Astrolog,
                Professions.Arcymag,
                Professions.Bezimienny,
                Professions.Bosman,
                Professions.Herold,
                Professions.Inzynier,
                Professions.Kapitan,
                Professions.Krzyzowiec,
                Professions.MistrzCieni,
                Professions.MistrzMagii,
                Professions.Nawigator,
                Professions.Oficer,
                Professions.RycerzGraala,
                Professions.RycerzKrolestwa,
                Professions.RycerzPlonacegoSlonca,
                Professions.RycerzProby,
                Professions.StraznikTuneli,
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
                Professions.Arcymistrz,
                Professions.ArcymistrzRun,
                Professions.Artylerzysta,
                Professions.Arystokrata,
                Professions.CzarnyStraznik,
                Professions.HersztBanitow,
                Professions.Krzyzowiec,
                Professions.LesnyDuch,
                Professions.LowcaCzarownic,
                Professions.MistrzZakonny,
                Professions.Odkrywca,
                Professions.Rycerz,
                Professions.RycerzGraala,
                Professions.RycerzKrolestwa,
                Professions.RycerzKruka,
                Professions.RycerzPlonacegoSlonca,
                Professions.RycerzProby,
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
                Professions.BiczBozy,
                Professions.Biczownik,
                Professions.Cyrulik,
                Professions.CzcicielZarazy,
                Professions.InzynierSpaczenia,
                Professions.Ochroniarz,
                Professions.Oprych,
                Professions.StraznikWiezienny,
                Professions.Szponowlad,
            ),
            exit = listOf(
                Professions.Medyk,
                Professions.Reketer,
                Professions.Zlodziej,
            )
        ),

        Professions.Paser to Paths(
            entry = listOf(
                Professions.Brygadzista,
                Professions.Falszerz,
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

        Professions.PielgrzymBitewny to Paths(
            entry = listOf(
                Professions.PielgrzymGraala,
            ),
            exit = listOf(
                Professions.Bezimienny,
                Professions.Sierzant,
                Professions.Weteran,
                Professions.Wloczykij,
            )
        ),

        Professions.Prawiedzma to Paths(
            entry = listOf(
                Professions.Wiedzma,
            ),
            exit = listOf(
            )
        ),

        Professions.Psalterzysta to Paths(
            entry = listOf(
                Professions.Akolita,
                Professions.Arcykaplan,
                Professions.Bard,
                Professions.Cyrkowiec,
                Professions.Fanatyk,
                Professions.Kaplan,
                Professions.Mnich,
                Professions.WybraniecBozy,
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.Bard,
                Professions.Cyrkowiec,
                Professions.Fanatyk,
                Professions.Kaplan,
                Professions.Katecheta,
            )
        ),

        Professions.Rajtar to Paths(
            entry = listOf(
                Professions.Harcownik,
                Professions.Inzynier,
                Professions.Szlachcic,
            ),
            exit = listOf(
                Professions.Dworzanin,
                Professions.InzynierSpaczenia,
                Professions.Rycerz,
                Professions.Sierzant,
                Professions.Weteran,
                Professions.Zwadzca,
            )
        ),

        Professions.Reketer to Paths(
            entry = listOf(
                Professions.Brygadzista,
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
                Professions.Bezimienny,
                Professions.Mytnik,
                Professions.Przepatrywacz,
                Professions.Przewoznik,
                Professions.StraznikDrog,
                Professions.SzermierzEstalijski,
                Professions.Szuler,
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
                Professions.KaplanWojownik,
                Professions.LowcaWampirow,
                Professions.Rajtar,
                Professions.Sierzant,
            ),
            exit = listOf(
                Professions.Akolita,
                Professions.Arystokrata,
                Professions.BlednyRycerz,
                Professions.CzarnyStraznik,
                Professions.Krzyzowiec,
                Professions.LowcaWampirow,
                Professions.MistrzZakonny,
                Professions.Oficer,
                Professions.RycerzKruka,
                Professions.RycerzPlonacegoSlonca,
            )
        ),

        Professions.RycerzGraala to Paths(
            entry = listOf(
                Professions.RycerzProby,
            ),
            exit = listOf(
                Professions.Arystokrata,
                Professions.Bezimienny,
                Professions.Dworzanin,
                Professions.Odkrywca,
                Professions.Oficer,
                Professions.Urzednik,
            )
        ),

        Professions.RycerzKrolestwa to Paths(
            entry = listOf(
                Professions.BlednyRycerz,
            ),
            exit = listOf(
                Professions.Arystokrata,
                Professions.Bezimienny,
                Professions.Dworzanin,
                Professions.Odkrywca,
                Professions.Oficer,
                Professions.RycerzProby,
                Professions.Urzednik,
            )
        ),

        Professions.RycerzKruka to Paths(
            entry = listOf(
                Professions.CzarnyStraznik,
                Professions.MistrzZakonny,
                Professions.Rycerz,
            ),
            exit = listOf(
                Professions.Fechtmistrz,
                Professions.LowcaCzarownic,
                Professions.MistrzZakonny,
                Professions.Oficer,
                Professions.ZabojcaNieumarlych,
            )
        ),

        Professions.RycerzProby to Paths(
            entry = listOf(
                Professions.RycerzKrolestwa,
            ),
            exit = listOf(
                Professions.Arystokrata,
                Professions.Bezimienny,
                Professions.Dworzanin,
                Professions.Odkrywca,
                Professions.Oficer,
                Professions.RycerzGraala,
                Professions.Urzednik,
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
                Professions.PielgrzymBitewny,
                Professions.Rajtar,
                Professions.Rozbojnik,
                Professions.Skrytobojca,
                Professions.Straznik,
                Professions.StraznikDrog,
                Professions.StraznikKanalow,
                Professions.StraznikRzeczny,
                Professions.StraznikTuneli,
                Professions.Strzelec,
                Professions.Szampierz,
                Professions.Tarczownik,
                Professions.Weteran,
                Professions.Zbrojny,
                Professions.Zwadzca,
                Professions.Zwiadowca,
                Professions.Zolnierz,
                Professions.ZolnierzOkretowy,
            ),
            exit = listOf(
                Professions.Artylerzysta,
                Professions.CzarnyStraznik,
                Professions.Krzyzowiec,
                Professions.Oficer,
                Professions.Rycerz,
                Professions.RycerzPlonacegoSlonca,
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

        Professions.StarszyWioskowy to Paths(
            entry = listOf(
                Professions.Bezimienny,
                Professions.Rozjemca,
                Professions.Zbrojny,
            ),
            exit = listOf(
                Professions.Bezimienny,
                Professions.Demagog,
                Professions.HersztBanitow,
                Professions.Majordomus,
                Professions.Urzednik,
            )
        ),

        Professions.StrozPrawa to Paths(
            entry = listOf(
                Professions.Lowca,
                Professions.LowcaNagrod,
                Professions.Straznik,
                Professions.StraznikDrog,
            ),
            exit = listOf(
                Professions.LowcaCzarownic,
                Professions.Szpieg,
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
                Professions.Krzyzowiec,
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
                Professions.Astrolog,
                Professions.Bajarz,
                Professions.Bard,
                Professions.CiuraObozowa,
                Professions.Cyrkowiec,
                Professions.Czarownik,
                Professions.Czarnoksieznik,
                Professions.Dworzanin,
                Professions.Falszerz,
                Professions.Guslarz,
                Professions.Kanciarz,
                Professions.Paser,
                Professions.Podzegacz,
                Professions.Pokutnik,
                Professions.Przemytnik,
                Professions.RzecznikRodu,
                Professions.StrzyganskiMistyk,
                Professions.Szuler,
                Professions.WedrownyCzarodziej,
                Professions.Zlodziej,
            ),
            exit = listOf(
                Professions.Astrolog,
                Professions.Banita,
                Professions.Demagog,
                Professions.Szpieg,
                Professions.Urzednik,
                Professions.Wlamywacz,
                Professions.Zakapturzony,
            )
        ),

        Professions.Szpieg to Paths(
            entry = listOf(
                Professions.AgentCalunu,
                Professions.Bard,
                Professions.Budowniczy,
                Professions.CiuraObozowa,
                Professions.Dworzanin,
                Professions.Kapitan,
                Professions.Kupiec,
                Professions.MagisterRewizor,
                Professions.Medyk,
                Professions.MistrzSkrytobojca,
                Professions.Odkrywca,
                Professions.Rynsztokowiec,
                Professions.Sluga,
                Professions.Szarlatan,
                Professions.SledczyVereny,
            ),
            exit = listOf(
                Professions.MistrzCieni,
                Professions.Odkrywca,
                Professions.Reketer,
                Professions.Skrytobojca,
                Professions.SledczyVereny,
            )
        ),

        Professions.Tropiciel to Paths(
            entry = listOf(
                Professions.HersztBanitow,
                Professions.Odkrywca,
                Professions.Zwiadowca,
            ),
            exit = listOf(
                Professions.HersztBanitow,
                Professions.Odkrywca,
                Professions.Oficer,
            )
        ),

        Professions.Uczony to Paths(
            entry = listOf(
                Professions.AgentCalunu,
                Professions.Aptekarz,
                Professions.Arcykaplan,
                Professions.Arystokrata,
                Professions.Astrolog,
                Professions.Balsamista,
                Professions.CzeladnikRun,
                Professions.Egzorcysta,
                Professions.Falszerz,
                Professions.Kapitan,
                Professions.Kaplan,
                Professions.Katecheta,
                Professions.KowalRun,
                Professions.Medyk,
                Professions.MistrzMagii,
                Professions.MistrzRun,
                Professions.Mnich,
                Professions.Nawigator,
                Professions.Opat,
                Professions.Skryba,
                Professions.SzaryProrok,
                Professions.SledczyVereny,
                Professions.UczenCzarodzieja,
                Professions.WedrownyCzarodziej,
                Professions.WybraniecBozy,
                Professions.Zakonnik,
                Professions.Zak,
            ),
            exit = listOf(
                Professions.AgentCalunu,
                Professions.Astrolog,
                Professions.Katecheta,
                Professions.Kupiec,
                Professions.Majordomus,
                Professions.Medyk,
                Professions.Mnich,
                Professions.Odkrywca,
                Professions.Opat,
                Professions.SledczyVereny,
                Professions.UczenCzarodzieja,
                Professions.Zakonnik,
            )
        ),

        Professions.Urzednik to Paths(
            entry = listOf(
                Professions.Arcykaplan,
                Professions.Brygadzista,
                Professions.Ceremoniarz,
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
                Professions.RycerzGraala,
                Professions.RycerzKrolestwa,
                Professions.RycerzProby,
                Professions.StarszyWioskowy,
                Professions.Szarlatan,
                Professions.Szlachcic,
                Professions.Zarzadca,
            ),
            exit = listOf(
                Professions.Arystokrata,
                Professions.Bezimienny,
                Professions.Demagog,
                Professions.Dworzanin,
                Professions.KsiazeZlodziei,
                Professions.Majordomus,
                Professions.Reketer,
            )
        ),

        Professions.Weteran to Paths(
            entry = listOf(
                Professions.Artylerzysta,
                Professions.Banita,
                Professions.BerserkerZNorski,
                Professions.Biczownik,
                Professions.Giermek,
                Professions.Gladiator,
                Professions.Goniec,
                Professions.InzynierSpaczenia,
                Professions.KozakKislevski,
                Professions.Krzyzowiec,
                Professions.MistrzCialoksztaltowania,
                Professions.MistrzRun,
                Professions.Najemnik,
                Professions.Pacholek,
                Professions.PasterzZCarcassonne,
                Professions.PielgrzymBitewny,
                Professions.PiratRzeczny,
                Professions.Rajtar,
                Professions.Rynsztokowiec,
                Professions.StraznikKanalow,
                Professions.StraznikTuneli,
                Professions.Szponowlad,
                Professions.Szturmoszczur,
                Professions.Tarczownik,
                Professions.WojownikKlanowy,
                Professions.Zakapturzony,
                Professions.Zolnierz,
            ),
            exit = listOf(
                Professions.Bezimienny,
                Professions.Fechtmistrz,
                Professions.HersztBanitow,
                Professions.Krzyzowiec,
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
                Professions.Astrolog,
                Professions.MagisterRewizor,
                Professions.MistrzMagii,
                Professions.Szarlatan,
                Professions.Uczony,
            )
        ),

        Professions.Wiedzma to Paths(
            entry = listOf(
                Professions.Znachorka,
            ),
            exit = listOf(
                Professions.Czarownik,
                Professions.Demagog,
                Professions.Prawiedzma,
                Professions.Urzednik,
            )
        ),

        Professions.Wlamywacz to Paths(
            entry = listOf(
                Professions.Kominiarz,
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
                Professions.SledczyVereny,
                Professions.Wloczykij,
            )
        ),

        Professions.WybraniecBozy to Paths(
            entry = listOf(
                Professions.Egzorcysta,
                Professions.Kaplan,
            ),
            exit = listOf(
                Professions.Arcykaplan,
                Professions.Biczownik,
                Professions.Ceremoniarz,
                Professions.Demagog,
                Professions.Egzorcysta,
                Professions.KaplanWojownik,
                Professions.Katecheta,
                Professions.LowcaCzarownic,
                Professions.Opat,
                Professions.Psalterzysta,
                Professions.RycerzPlonacegoSlonca,
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

        Professions.ZabojcaNieumarlych to Paths(
            entry = listOf(
                Professions.AgentCalunu,
                Professions.Biczownik,
                Professions.CzarnyStraznik,
                Professions.LowcaCzarownic,
                Professions.LowcaWampirow,
                Professions.RycerzKruka,
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
                Professions.Katecheta,
                Professions.Medyk,
                Professions.Mnich,
                Professions.Pielgrzym,
                Professions.Uczony,
                Professions.Wloczykij,
            ),
            exit = listOf(
                Professions.Biczownik,
                Professions.Demagog,
                Professions.Kaplan,
                Professions.Katecheta,
                Professions.Mnich,
                Professions.Uczony,
            )
        ),

        Professions.Zbrojny to Paths(
            entry = listOf(
                Professions.Budowniczy,
                Professions.Najemnik,
                Professions.Pacholek,
                Professions.PasterzZCarcassonne,
            ),
            exit = listOf(
                Professions.Bezimienny,
                Professions.HersztBanitow,
                Professions.Najemnik,
                Professions.Sierzant,
                Professions.StarszyWioskowy,
                Professions.Zwiadowca,
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
                Professions.PasterzZCarcassonne,
                Professions.Poslaniec,
                Professions.Przepatrywacz,
                Professions.Rynsztokowiec,
                Professions.StraznikDrog,
                Professions.StraznikPol,
                Professions.Weglarz,
                Professions.Wloczykij,
                Professions.WojownikKlanowy,
                Professions.Woznica,
                Professions.Zakapturzony,
                Professions.Zbrojny,
            ),
            exit = listOf(
                Professions.HersztBanitow,
                Professions.LesnyDuch,
                Professions.LowcaWampirow,
                Professions.Odkrywca,
                Professions.Sierzant,
            )
        ),

/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////      SKAVENY     /////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////

        Professions.Czarnoszczur to Paths(
            entry = listOf(
            ),
            exit = listOf(
                Professions.Banita,
                Professions.Gladiator,
                Professions.Najemnik,
                Professions.Szturmoszczur,
            )
        ),

        Professions.CzcicielZarazy to Paths(
            entry = listOf(
                Professions.Klanbrat,
            ),
            exit = listOf(
                Professions.DiakonZarazy,
                Professions.Fanatyk,
                Professions.Kadzielnik,
                Professions.Oprawca,
                Professions.Szponowlad,
            )
        ),

        Professions.Harcownik to Paths(
            entry = listOf(
                Professions.Klanbrat,
                Professions.Rzemieslnik,
                Professions.Straznik,
            ),
            exit = listOf(
                Professions.Inzynier,
                Professions.Najemnik,
                Professions.Ochroniarz,
                Professions.Rajtar,
                Professions.Rzemieslnik,
                Professions.Szponowlad,
            )
        ),

        Professions.Klanbrat to Paths(
            entry = listOf(
                Professions.Flisak,
                Professions.Gornik,
                Professions.Niewolnik,
                Professions.Oprych,
                Professions.Podzegacz,
                Professions.Poslaniec,
                Professions.Rzemieslnik,
                Professions.Straznik,
                Professions.StraznikWiezienny,
                Professions.Wloczykij,
                Professions.Zlodziej,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.Cyrulik,
                Professions.CzcicielZarazy,
                Professions.Fanatyk,
                Professions.Harcownik,
                Professions.HienaCmentarna,
                Professions.Kadzielnik,
                Professions.LowcaNagrod,
                Professions.Najemnik,
                Professions.Ochroniarz,
                Professions.Oprych,
                Professions.PoganiaczSkavenski,
                Professions.PorywaczZwlok,
                Professions.PoslaniecNocy,
                Professions.Rzemieslnik,
                Professions.StraznikWiezienny,
                Professions.Szponowlad,
                Professions.Smieciarz,
                Professions.Wloczykij,
                Professions.Zlodziej,
            )
        ),

        Professions.Niewolnik to Paths(
            entry = listOf(
            ),
            exit = listOf(
                Professions.Klanbrat,
                Professions.Szponowlad,
            )
        ),

        Professions.PoganiaczSkavenski to Paths(
            entry = listOf(
                Professions.Klanbrat,
                Professions.Lowca,
                Professions.LowcaNagrod,
            ),
            exit = listOf(
                Professions.LowcaNagrod,
                Professions.MistrzCialoksztaltowania,
                Professions.Najemnik,
                Professions.Oprych,
                Professions.Szponowlad,
                Professions.Wloczykij,
            )
        ),

        Professions.PoslaniecNocy to Paths(
            entry = listOf(
                Professions.Klanbrat,
                Professions.Najemnik,
                Professions.Oprych,
                Professions.Zlodziej,
            ),
            exit = listOf(
                Professions.Banita,
                Professions.LowcaNagrod,
                Professions.Najemnik,
                Professions.Ochroniarz,
                Professions.Przemytnik,
                Professions.Rynsztokowiec,
                Professions.SkavenskiZaklinacz,
                Professions.Szponowlad,
                Professions.Wloczykij,
                Professions.Zlodziej,
            )
        ),

        Professions.UczenSzaregoProroka to Paths(
            entry = listOf(
            ),
            exit = listOf(
                Professions.Skryba,
                Professions.SzaryProrok,
            )
        ),

        Professions.DiakonZarazy to Paths(
            entry = listOf(
                Professions.CzcicielZarazy,
            ),
            exit = listOf(
                Professions.Kadzielnik,
                Professions.KaplanZarazy,
            )
        ),

        Professions.HersztKlanu to Paths(
            entry = listOf(
                Professions.InzynierSpaczenia,
                Professions.KaplanZarazy,
                Professions.MistrzCialoksztaltowania,
                Professions.MistrzMutator,
                Professions.MistrzSkrytobojca,
                Professions.Rynsztokowiec,
                Professions.Szponowlad,
            ),
            exit = listOf(
                Professions.MistrzMutator,
            )
        ),

        Professions.InzynierSpaczenia to Paths(
            entry = listOf(
                Professions.Inzynier,
                Professions.Rajtar,
                Professions.Szponowlad,
            ),
            exit = listOf(
                Professions.HersztKlanu,
                Professions.Najemnik,
                Professions.Oprawca,
                Professions.Weteran,
            )
        ),

        Professions.Kadzielnik to Paths(
            entry = listOf(
                Professions.CzcicielZarazy,
                Professions.DiakonZarazy,
                Professions.Fanatyk,
                Professions.Klanbrat,
            ),
            exit = listOf(
            )
        ),

        Professions.KaplanZarazy to Paths(
            entry = listOf(
                Professions.DiakonZarazy,
            ),
            exit = listOf(
                Professions.HersztKlanu,
            )
        ),

        Professions.MistrzCialoksztaltowania to Paths(
            entry = listOf(
                Professions.PoganiaczSkavenski,
                Professions.Szponowlad,
            ),
            exit = listOf(
                Professions.HersztKlanu,
                Professions.Medyk,
                Professions.MistrzMutator,
                Professions.Weteran,
            )
        ),

        Professions.MistrzMutator to Paths(
            entry = listOf(
                Professions.HersztKlanu,
                Professions.MistrzCialoksztaltowania,
            ),
            exit = listOf(
                Professions.HersztKlanu,
            )
        ),

        Professions.MistrzSkrytobojca to Paths(
            entry = listOf(
                Professions.Rynsztokowiec,
            ),
            exit = listOf(
                Professions.HersztKlanu,
                Professions.MistrzCieni,
                Professions.Szpieg,
            )
        ),

        Professions.Nadprorok to Paths(
            entry = listOf(
                Professions.SzaryProrok,
            ),
            exit = listOf(
            )
        ),

        Professions.Rynsztokowiec to Paths(
            entry = listOf(
                Professions.PoslaniecNocy,
                Professions.SkavenskiZaklinacz,
                Professions.Szponowlad,
            ),
            exit = listOf(
                Professions.HersztKlanu,
                Professions.Lowca,
                Professions.LowcaNagrod,
                Professions.MistrzSkrytobojca,
                Professions.Najemnik,
                Professions.Ochroniarz,
                Professions.SkavenskiZaklinacz,
                Professions.Szpieg,
                Professions.Weteran,
                Professions.Zwiadowca,
            )
        ),

        Professions.SkavenskiZaklinacz to Paths(
            entry = listOf(
                Professions.PoslaniecNocy,
                Professions.Rynsztokowiec,
            ),
            exit = listOf(
                Professions.MistrzMagii,
                Professions.Rynsztokowiec,
            )
        ),

        Professions.SzaryProrok to Paths(
            entry = listOf(
                Professions.UczenSzaregoProroka,
            ),
            exit = listOf(
                Professions.Nadprorok,
                Professions.Uczony,
            )
        ),

        Professions.Szponowlad to Paths(
            entry = listOf(
                Professions.CzcicielZarazy,
                Professions.Harcownik,
                Professions.Klanbrat,
                Professions.Niewolnik,
                Professions.PoganiaczSkavenski,
                Professions.PoslaniecNocy,
                Professions.Szturmoszczur,
            ),
            exit = listOf(
                Professions.HersztKlanu,
                Professions.InzynierSpaczenia,
                Professions.MistrzCialoksztaltowania,
                Professions.Rynsztokowiec,
                Professions.Oprawca,
                Professions.Weteran,
            )
        ),

        Professions.Szturmoszczur to Paths(
            entry = listOf(
                Professions.Czarnoszczur,
            ),
            exit = listOf(
                Professions.Fanatyk,
                Professions.Najemnik,
                Professions.Ochroniarz,
                Professions.Szponowlad,
                Professions.Weteran,
            )
        ),

/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////      PLEMIE      /////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////

        Professions.UczenSzamana to Paths(
            entry = listOf(
            ),
            exit = listOf(
                Professions.Knuj,
                Professions.Szaman,
            )
        ),

        Professions.Szaman to Paths(
            entry = listOf(
                Professions.UczenSzamana,
            ),
            exit = listOf(
                Professions.Knuj,
                Professions.Silacz,
                Professions.WielkiSzaman,
            )
        ),

        Professions.WielkiSzaman to Paths(
            entry = listOf(
                Professions.Szaman,
            ),
            exit = listOf(
                Professions.Wodz,
            )
        ),

        Professions.Knuj to Paths(
            entry = listOf(
                Professions.UczenSzamana,
                Professions.Szaman,
            ),
            exit = listOf(
                Professions.Wodz,
            )
        ),

        Professions.Silacz to Paths(
            entry = listOf(
                Professions.Szaman,
            ),
            exit = listOf(
                Professions.Wodz,
            )
        ),

        Professions.Wodz to Paths(
            entry = listOf(
                Professions.Knuj,
                Professions.Silacz,
                Professions.WielkiSzaman,
            ),
            exit = listOf(
            )
        ),

    )
}
