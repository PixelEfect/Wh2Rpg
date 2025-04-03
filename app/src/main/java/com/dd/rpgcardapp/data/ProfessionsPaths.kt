package com.dd.rpgcardapp.data

// Klasa Paths, która przechowuje ścieżki dla profesji
data class Paths(
    val entry: List<Profession>,
    val exit: List<Profession>
)

// Definicje ścieżek
object ProfessionPaths {
    val paths: Map<Profession, Paths> = mapOf(
        BasicProfessions.Akolita to Paths(
            entry = listOf(
                BasicProfessions.Bajarz,
                BasicProfessions.Dylentant,
                BasicProfessions.Fanatyk,
                BasicProfessions.Grabaz,
                BasicProfessions.Guslarz,
                BasicProfessions.Latarnik,
                BasicProfessions.Pielgrzym,
                BasicProfessions.Pokutnik,
                BasicProfessions.PoskramiaczNiedzwiedzi,
                BasicProfessions.Skryba,
                BasicProfessions.StraznikSwiatynny,
                BasicProfessions.UczennicaCzarownicy,
                BasicProfessions.UczenZielarza,
                BasicProfessions.Zak,
                AdvancedProfessions.BiczBozy,
                AdvancedProfessions.Katecheta,
                AdvancedProfessions.Krzyzowiec,
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.LowcaWampirow,
                AdvancedProfessions.Psalterzysta,
                AdvancedProfessions.Rycerz,
                AdvancedProfessions.RycerzPlonacegoSlonca,
                AdvancedProfessions.SledczyVereny,
            ),
            exit = listOf(
                BasicProfessions.Cyrulik,
                BasicProfessions.Fanatyk,
                BasicProfessions.Pokutnik,
                BasicProfessions.PoskramiaczNiedzwiedzi,
                BasicProfessions.RogatyLowca,
                BasicProfessions.Skryba,
                BasicProfessions.StraznikSwiatynny,
                AdvancedProfessions.AgentCalunu,
                AdvancedProfessions.Ceremoniarz,
                AdvancedProfessions.Demagog,
                AdvancedProfessions.Kaplan,
                AdvancedProfessions.KaplanSwiecki,
                AdvancedProfessions.Mnich,
                AdvancedProfessions.Psalterzysta,
                AdvancedProfessions.RycerzZielonegoPola,
                AdvancedProfessions.SledczyVereny,
                AdvancedProfessions.Zakonnik,
            )
        ),

        BasicProfessions.AkolitaKultuKhorna to Paths(
            entry = listOf(
            ),
            exit = listOf(
                BasicProfessions.Banita,
                BasicProfessions.Fanatyk,
                BasicProfessions.Grabiezca,
                BasicProfessions.Podzegacz,
                AdvancedProfessions.Weteran,
                AdvancedProfessions.WtajemniczonyKultuKhorna,
            )
        ),

        BasicProfessions.AkolitaKultuNurgla to Paths(
            entry = listOf(
            ),
            exit = listOf(
                BasicProfessions.Banita,
                BasicProfessions.Cyrulik,
                BasicProfessions.Grabiezca,
                BasicProfessions.Podzegacz,
                BasicProfessions.PorywaczZwlok,
                AdvancedProfessions.Szarlatan,
                AdvancedProfessions.WtajemniczonyKultuNurgla,
            )
        ),

        BasicProfessions.AkolitaKultuSlaanesha to Paths(
            entry = listOf(
            ),
            exit = listOf(
                BasicProfessions.Cyrkowiec,
                BasicProfessions.Grabiezca,
                BasicProfessions.Kanciarz,
                BasicProfessions.Podzegacz,
                BasicProfessions.Szlachcic,
                // BasicProfessions.WojownikChaosu,
                AdvancedProfessions.WtajemniczonyKultuSlaanesha,
            )
        ),

        BasicProfessions.AkolitaKultuTzeentcha to Paths(
            entry = listOf(
            ),
            exit = listOf(
                BasicProfessions.Grabiezca,
                BasicProfessions.Kanciarz,
                BasicProfessions.Mieszczanin,
                BasicProfessions.Podzegacz,
                BasicProfessions.Przemytnik,
                BasicProfessions.Rzemieslnik,
                BasicProfessions.Skryba,
                BasicProfessions.Szlachcic,
                BasicProfessions.Zak,
                // BasicProfessions.WojownikChaosu,
                AdvancedProfessions.WtajemniczonyKultuTzeentcha,
                // BasicProfessions.ZniewolonyCzarodziej, ???
            )
        ),

        BasicProfessions.Aptekarz to Paths(
            entry = listOf(
                BasicProfessions.Cyrulik,
                BasicProfessions.Guslarz,
                BasicProfessions.UczenCzarodzieja,
                BasicProfessions.UczenZielarza,
                BasicProfessions.Zak,
            ),
            exit = listOf(
                BasicProfessions.Cyrulik,
                BasicProfessions.HienaCmentarna,
                BasicProfessions.UczenCzarodzieja,
                BasicProfessions.UczenZielarza,
                AdvancedProfessions.Astrolog,
                AdvancedProfessions.Kupiec,
                AdvancedProfessions.Medyk,
                AdvancedProfessions.MistrzRzemiosla,
                AdvancedProfessions.Uczony,
            )
        ),

        BasicProfessions.Bagiennik to Paths(
            entry = listOf(
                BasicProfessions.Chlop,
                BasicProfessions.Flisak,
                BasicProfessions.Lowca,
                BasicProfessions.Ochotnik,
                BasicProfessions.Przewoznik,
                BasicProfessions.Smieciarz,
                BasicProfessions.ZabiaPani,
            ),
            exit = listOf(
                BasicProfessions.Banita,
                BasicProfessions.CiuraObozowa,
                BasicProfessions.Oprych,
                BasicProfessions.PielgrzymGraala,
                BasicProfessions.Wloczykij,
                BasicProfessions.Zakapturzony,
                AdvancedProfessions.StarszyWioskowy,
                AdvancedProfessions.Zbrojny,
            )
        ),

        BasicProfessions.Bajarz to Paths(
            entry = listOf(
                BasicProfessions.CiuraObozowa,
                BasicProfessions.Cyrkowiec,
                BasicProfessions.Dylentant,
                BasicProfessions.Kanciarz,
                BasicProfessions.Podzegacz,
                BasicProfessions.Wloczykij,
                BasicProfessions.Zak,
                BasicProfessions.Zeglarz,
                BasicProfessions.Zolnierz,
            ),
            exit = listOf(
                BasicProfessions.Akolita,
                BasicProfessions.Cyrkowiec,
                BasicProfessions.Kanciarz,
                AdvancedProfessions.Demagog,
                AdvancedProfessions.Dworzanin,
                AdvancedProfessions.Lajdak,
                AdvancedProfessions.Herold,
                AdvancedProfessions.Szarlatan,
            )
        ),

        BasicProfessions.Balsamista to Paths(
            entry = listOf(
                BasicProfessions.Cyrulik,
                BasicProfessions.Rzemieslnik,
                BasicProfessions.Zak,
            ),
            exit = listOf(
                BasicProfessions.Mieszczanin,
                BasicProfessions.PorywaczZwlok,
                BasicProfessions.UczenCzarodzieja,
                AdvancedProfessions.Medyk,
                AdvancedProfessions.Uczony,
            )
        ),

        BasicProfessions.Banita to Paths(
            entry = listOf(
                BasicProfessions.AkolitaKultuKhorna,
                BasicProfessions.AkolitaKultuNurgla,
                BasicProfessions.Bagiennik,
                BasicProfessions.BylySkazaniec,
                BasicProfessions.Cenobita,
                BasicProfessions.Chlop,
                BasicProfessions.Fanatyk,
                BasicProfessions.Giermek,
                BasicProfessions.Guslarz,
                BasicProfessions.Kanciarz,
                BasicProfessions.Koczownik,
                BasicProfessions.Lesnik,
                BasicProfessions.Mytnik,
                BasicProfessions.Najemnik,
                BasicProfessions.Ochotnik,
                BasicProfessions.Pacholek,
                BasicProfessions.PasterzZCarcassonne,
                BasicProfessions.Pielgrzym,
                BasicProfessions.PiratRzeczny,
                BasicProfessions.PoborcaPodatkowy,
                BasicProfessions.Podzegacz,
                BasicProfessions.Poganiacz,
                BasicProfessions.PoganiaczMulow,
                BasicProfessions.Pustelnik,
                BasicProfessions.RogatyLowca,
                BasicProfessions.StraznikDrog,
                BasicProfessions.UczenZielarza,
                BasicProfessions.Woznica,
                BasicProfessions.Zakapturzony,
                BasicProfessions.ZolnierzOkretowy,
                AdvancedProfessions.Czarownik,
                AdvancedProfessions.Czarnoksieznik,
                AdvancedProfessions.Karczmarz,
                AdvancedProfessions.Lajdak,
                AdvancedProfessions.Szarlatan,
                SkavenProfessions.Czarnoszczur,
                SkavenProfessions.Klanbrat,
                SkavenProfessions.PoslaniecNocy,
            ),
            exit = listOf(
                BasicProfessions.BylySkazaniec,
                BasicProfessions.PasterzZCarcassonne,
                BasicProfessions.PielgrzymGraala,
                BasicProfessions.PiratRzeczny,
                BasicProfessions.Pokutnik,
                BasicProfessions.Wloczykij,
                BasicProfessions.Zakapturzony,
                BasicProfessions.Zlodziej,
                AdvancedProfessions.Demagog,
                AdvancedProfessions.Koniuszy,
                AdvancedProfessions.Rozbojnik,
                AdvancedProfessions.Weteran,
            )
        ),

        BasicProfessions.BerserkerZNorski to Paths(
            entry = listOf(
                BasicProfessions.Skald,
                BasicProfessions.Woj,
                ),
            exit = listOf(
                BasicProfessions.Gladiator,
                BasicProfessions.Grabiezca,
                BasicProfessions.Korsarz,
                BasicProfessions.Najemnik,
                BasicProfessions.Woj,
                BasicProfessions.Zeglarz,
                AdvancedProfessions.Sierzant,
                AdvancedProfessions.Weteran,
            )
        ),

        BasicProfessions.BlednyRycerz to Paths(
            entry = listOf(
                BasicProfessions.Giermek,
                BasicProfessions.Szlachcic,
                AdvancedProfessions.Rycerz,
            ),
            exit = listOf(
                BasicProfessions.Zakapturzony,
                AdvancedProfessions.RycerzKrolestwa,
            )
        ),

        BasicProfessions.BylySkazaniec to Paths(
            entry = listOf(
                BasicProfessions.Banita,
                BasicProfessions.HienaCmentarna,
                BasicProfessions.Kanciarz,
                BasicProfessions.Oprych,
                BasicProfessions.Podzegacz,
                BasicProfessions.PorywaczZwlok,
                BasicProfessions.Przemytnik,
                BasicProfessions.Rzezimieszek,
                BasicProfessions.Zlodziej,
            ),
            exit = listOf(
                BasicProfessions.Banita,
                BasicProfessions.HienaCmentarna,
                BasicProfessions.Oprych,
                BasicProfessions.Rzezimieszek,
                BasicProfessions.Wloczykij,
                AdvancedProfessions.Paser,
                AdvancedProfessions.Reketer,
                AdvancedProfessions.Rozbojnik,
                AdvancedProfessions.Szarlatan,
                AdvancedProfessions.Wlamywacz,
            )
        ),

        BasicProfessions.Cenobita to Paths(
            entry = listOf(
            ),
            exit = listOf(
                BasicProfessions.Banita,
                BasicProfessions.Sluga,
                BasicProfessions.Wloczykij,
                AdvancedProfessions.Mistyk,
            )
        ),

        BasicProfessions.Chlop to Paths(
            entry = listOf(
                BasicProfessions.Szperacz,
                ),
            exit = listOf(
                BasicProfessions.Bagiennik,
                BasicProfessions.Banita,
                BasicProfessions.Doker,
                BasicProfessions.Fanatyk,
                BasicProfessions.Gazeciarz,
                BasicProfessions.Grabaz,
                BasicProfessions.Kominiarz,
                BasicProfessions.Latarnik,
                BasicProfessions.Ochotnik,
                BasicProfessions.Pacholek,
                BasicProfessions.PasterzZCarcassonne,
                BasicProfessions.PielgrzymGraala,
                BasicProfessions.PiratRzeczny,
                BasicProfessions.PoganiaczMulow,
                BasicProfessions.Pogranicznik,
                BasicProfessions.Rolnik,
                BasicProfessions.Rozjemca,
                BasicProfessions.Rybak,
                BasicProfessions.Rzemieslnik,
                BasicProfessions.Sluga,
                BasicProfessions.Smieciarz,
                BasicProfessions.StraznikKanalow,
                BasicProfessions.Szperacz,
                BasicProfessions.UczenZielarza,
                BasicProfessions.Weglarz,
                BasicProfessions.Zakapturzony,
                BasicProfessions.ZabiaPani,
                BasicProfessions.ZbieraczLajna,
                AdvancedProfessions.Brygadzista,
                AdvancedProfessions.Budowniczy,
                AdvancedProfessions.Husarz,
                AdvancedProfessions.KonnyLucznik,
                AdvancedProfessions.TreserZwierzat,
                AdvancedProfessions.Urzednik,
            )
        ),

        BasicProfessions.CiuraObozowa to Paths(
            entry = listOf(
                BasicProfessions.Bagiennik,
                BasicProfessions.Sluga,
                BasicProfessions.Smieciarz,
                BasicProfessions.ZabiaPani,
            ),
            exit = listOf(
                BasicProfessions.Bajarz,
                BasicProfessions.Przemytnik,
                BasicProfessions.Rzemieslnik,
                BasicProfessions.Sluga,
                BasicProfessions.Weglarz,
                BasicProfessions.Wloczykij,
                BasicProfessions.ZabiaPani,
                BasicProfessions.ZbieraczLajna,
                AdvancedProfessions.Szarlatan,
                AdvancedProfessions.Szpieg,
            )
        ),

        BasicProfessions.Cyrkowiec to Paths(
            entry = listOf(
                BasicProfessions.AkolitaKultuSlaanesha,
                BasicProfessions.Bajarz,
                BasicProfessions.Gazeciarz,
                AdvancedProfessions.Herold,
                BasicProfessions.Kanciarz,
                BasicProfessions.Latarnik,
                BasicProfessions.PoskramiaczNiedzwiedzi,
                AdvancedProfessions.Psalterzysta,
                BasicProfessions.StrzyganskiMistyk,
                BasicProfessions.Szuler,
                BasicProfessions.Wloczykij,
                AdvancedProfessions.TreserZwierzat,
                BasicProfessions.Zlodziej,
            ),
            exit = listOf(
                BasicProfessions.Bajarz,
                AdvancedProfessions.Bard,
                BasicProfessions.Kanciarz,
                BasicProfessions.PoskramiaczNiedzwiedzi,
                AdvancedProfessions.Pamflecista,
                AdvancedProfessions.Psalterzysta,
                BasicProfessions.Skald,
                AdvancedProfessions.Szarlatan,
                BasicProfessions.Szuler,
                AdvancedProfessions.TreserZwierzat,
                BasicProfessions.Wloczykij,
                BasicProfessions.Zlodziej,
            )
        ),

        BasicProfessions.Cyrulik to Paths(
            entry = listOf(
                BasicProfessions.Akolita,
                BasicProfessions.AkolitaKultuNurgla,
                BasicProfessions.Aptekarz,
                BasicProfessions.Dylentant,
                SkavenProfessions.Klanbrat,
                BasicProfessions.UczenZielarza,
                BasicProfessions.Zak,
            ),
            exit = listOf(
                AdvancedProfessions.AgentCalunu,
                BasicProfessions.Aptekarz,
                BasicProfessions.Balsamista,
                AdvancedProfessions.Medyk,
                AdvancedProfessions.Oprawca,
                BasicProfessions.PorywaczZwlok,
                BasicProfessions.Rzemieslnik,
                BasicProfessions.Wloczykij,
            )
        ),

        BasicProfessions.Czekista to Paths(
            entry = listOf(
                BasicProfessions.KozakKislevski,
                BasicProfessions.Oprych,
                BasicProfessions.Rzezimieszek,
                BasicProfessions.Straznik,
                BasicProfessions.Strielec,
            ),
            exit = listOf(
                BasicProfessions.Najemnik,
                AdvancedProfessions.Oprawca,
                AdvancedProfessions.Reketer,
                AdvancedProfessions.Sierzant,
                BasicProfessions.Straznik,
                BasicProfessions.StraznikWiezienny,
                AdvancedProfessions.Szpieg,
                AdvancedProfessions.Weteran,
                BasicProfessions.Zolnierz,
            )
        ),

        BasicProfessions.CzeladnikRun to Paths(
            entry = listOf(
                BasicProfessions.Goniec,
                AdvancedProfessions.MistrzRzemiosla,
                BasicProfessions.Skryba,
                BasicProfessions.Zak,
            ),
            exit = listOf(
                BasicProfessions.Goniec,
                AdvancedProfessions.KowalRun,
                BasicProfessions.Skryba,
                BasicProfessions.Tarczownik,
                AdvancedProfessions.Uczony,
            )
        ),

        BasicProfessions.Doker to Paths(
            entry = listOf(
                BasicProfessions.Chlop,
                BasicProfessions.Flisak,
            ),
            exit = listOf(
                AdvancedProfessions.Brygadzista,
                BasicProfessions.Flisak,
                AdvancedProfessions.Kupiec,
                BasicProfessions.Oprych,
                BasicProfessions.Przemytnik,
                BasicProfessions.Rzemieslnik,
                BasicProfessions.Zlodziej,
                BasicProfessions.ZolnierzOkretowy,
            )
        ),

        BasicProfessions.Doker to Paths(
            entry = listOf(
                BasicProfessions.Chlop,
                BasicProfessions.Flisak,
            ),
            exit = listOf(
                AdvancedProfessions.Brygadzista,
                BasicProfessions.Flisak,
                AdvancedProfessions.Kupiec,
                BasicProfessions.Oprych,
                BasicProfessions.Przemytnik,
                BasicProfessions.Rzemieslnik,
                BasicProfessions.Zlodziej,
                BasicProfessions.ZolnierzOkretowy,
            )
        ),

        BasicProfessions.Dylentant to Paths(
            entry = listOf(
            ),
            exit = listOf(
                BasicProfessions.Akolita,
                BasicProfessions.Bajarz,
                BasicProfessions.Cyrulik,
                BasicProfessions.HienaCmentarna,
                BasicProfessions.Rzemieslnik,
                BasicProfessions.UczenCzarodzieja,
                BasicProfessions.Zak,
                AdvancedProfessions.Astrolog,
                AdvancedProfessions.Dworzanin,
                AdvancedProfessions.Katecheta,
                AdvancedProfessions.Lajdak,
                AdvancedProfessions.Nawigator,
                AdvancedProfessions.SledczyVereny,
                AdvancedProfessions.Szarlatan,
            )
        ),

        BasicProfessions.Fanatyk to Paths(
            entry = listOf(
                BasicProfessions.Akolita,
                BasicProfessions.AkolitaKultuKhorna,
                BasicProfessions.Chlop,
                SkavenProfessions.CzcicielZarazy,
                BasicProfessions.Gazeciarz,
                AdvancedProfessions.Katecheta,
                SkavenProfessions.Klanbrat,
                AdvancedProfessions.Mnich,
                BasicProfessions.Pielgrzym,
                BasicProfessions.Podzegacz,
                AdvancedProfessions.Psalterzysta,
                BasicProfessions.Rzemieslnik,
                AdvancedProfessions.Szampierz,
                SkavenProfessions.Szturmoszczur,
                BasicProfessions.UczenZielarza,
            ),
            exit = listOf(
                BasicProfessions.Akolita,
                BasicProfessions.Banita,
                AdvancedProfessions.Biczownik,
                SkavenProfessions.Kadzielnik,
                AdvancedProfessions.Katecheta,
                BasicProfessions.Podzegacz,
                BasicProfessions.Pokutnik,
                AdvancedProfessions.Psalterzysta,
                BasicProfessions.StraznikSwiatynny,
                AdvancedProfessions.Zakonnik,
            )
        ),

        BasicProfessions.Flisak to Paths(
            entry = listOf(
                BasicProfessions.Doker,
                BasicProfessions.PiratRzeczny,
                BasicProfessions.Przemytnik,
                BasicProfessions.Przewoznik,
                BasicProfessions.StraznikRzeczny,
                BasicProfessions.ZabiaPani,
            ),
            exit = listOf(
                BasicProfessions.Bagiennik,
                BasicProfessions.Doker,
                SkavenProfessions.Klanbrat,
                AdvancedProfessions.Nawigator,
                BasicProfessions.PiratRzeczny,
                BasicProfessions.Przemytnik,
                BasicProfessions.Rybak,
                BasicProfessions.StraznikRzeczny,
                BasicProfessions.Zeglarz,
                BasicProfessions.ZolnierzOkretowy,
            )
        ),

        BasicProfessions.Gazeciarz to Paths(
            entry = listOf(
                BasicProfessions.Chlop,
                BasicProfessions.Mieszczanin,
                BasicProfessions.Poslaniec,
                BasicProfessions.Sluga,
                BasicProfessions.Zak,
            ),
            exit = listOf(
                BasicProfessions.Cyrkowiec,
                AdvancedProfessions.Demagog,
                BasicProfessions.Fanatyk,
                BasicProfessions.Kanciarz,
                BasicProfessions.Podzegacz,
                BasicProfessions.Poslaniec,
                BasicProfessions.Skryba,
                AdvancedProfessions.Pamflecista,
            )
        ),

        BasicProfessions.Giermek to Paths(
            entry = listOf(
                AdvancedProfessions.Ceremoniarz,
                AdvancedProfessions.Herold,
                BasicProfessions.Kadet,
                BasicProfessions.Paz,
                BasicProfessions.StraznikSwiatynny,
                BasicProfessions.Szlachcic,
            ),
            exit = listOf(
                BasicProfessions.Banita,
                BasicProfessions.BlednyRycerz,
                AdvancedProfessions.CzarnyStraznik,
                BasicProfessions.Kadet,
                AdvancedProfessions.Koniuszy,
                AdvancedProfessions.Rycerz,
                AdvancedProfessions.RycerzPantery,
                AdvancedProfessions.RycerzPlonacegoSlonca,
                AdvancedProfessions.Sierzant,
                BasicProfessions.Szlachcic,
                AdvancedProfessions.Weteran,
            )
        ),

        BasicProfessions.Gladiator to Paths(
            entry = listOf(
                BasicProfessions.BerserkerZNorski,
                SkavenProfessions.Czarnoszczur,
                BasicProfessions.Oprych,
                BasicProfessions.PoskramiaczNiedzwiedzi,
                BasicProfessions.Rzezimieszek,
                BasicProfessions.Tarczownik,
            ),
            exit = listOf(
                BasicProfessions.LowcaNagrod,
                BasicProfessions.Najemnik,
                BasicProfessions.Rzezimieszek,
                AdvancedProfessions.Weteran,
                BasicProfessions.Woj,
                BasicProfessions.ZabojcaTrolli,
            )
        ),

        BasicProfessions.Goniec to Paths(
            entry = listOf(
                BasicProfessions.CzeladnikRun,
                BasicProfessions.Tarczownik,
            ),
            exit = listOf(
                BasicProfessions.CzeladnikRun,
                BasicProfessions.HienaCmentarna,
                BasicProfessions.Szczurolap,
                BasicProfessions.Tarczownik,
                AdvancedProfessions.Weteran,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        BasicProfessions.Gornik to Paths(
            entry = listOf(
                BasicProfessions.Lowca,
                BasicProfessions.Weglarz,
            ),
            exit = listOf(
                AdvancedProfessions.Inzynier,
                SkavenProfessions.Klanbrat,
                BasicProfessions.Kominiarz,
                BasicProfessions.Najemnik,
                BasicProfessions.Przemytnik,
                BasicProfessions.Tarczownik,
                BasicProfessions.Weglarz,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        BasicProfessions.Grabaz to Paths(
            entry = listOf(
                BasicProfessions.Chlop,
                BasicProfessions.Szczurolap,
                BasicProfessions.Smieciarz,
            ),
            exit = listOf(
                BasicProfessions.Akolita,
                AdvancedProfessions.LowcaWampirow,
                BasicProfessions.Ochotnik,
                BasicProfessions.PorywaczZwlok,
                BasicProfessions.Straznik,
            )
        ),

        BasicProfessions.Grabiezca to Paths(
            entry = listOf(
                BasicProfessions.AkolitaKultuKhorna,
                BasicProfessions.AkolitaKultuNurgla,
                BasicProfessions.AkolitaKultuSlaanesha,
                BasicProfessions.AkolitaKultuTzeentcha,
                BasicProfessions.BerserkerZNorski,
                BasicProfessions.Korsarz,
                AdvancedProfessions.Obszarnik,
                BasicProfessions.Skald,
                BasicProfessions.Wielorybnik,
                BasicProfessions.Woj,
            ),
            exit = listOf(
                AdvancedProfessions.HandlarzNiewolnikami,
                BasicProfessions.Korsarz,
                BasicProfessions.Najemnik,
                BasicProfessions.Woj,
                // BasicProfessions.WojownikChaosu,
                AdvancedProfessions.Wodz,
            )
        ),

        BasicProfessions.Guslarz to Paths(
            entry = listOf(
                AdvancedProfessions.Mistyk,
                BasicProfessions.StrzyganskiMistyk,
                BasicProfessions.Znachorka,
            ),
            exit = listOf(
                BasicProfessions.Akolita,
                BasicProfessions.Aptekarz,
                BasicProfessions.Banita,
                AdvancedProfessions.Czarownik,
                AdvancedProfessions.Szarlatan,
                BasicProfessions.UczenCzarodzieja,
                BasicProfessions.UczenZielarza,
                BasicProfessions.Wloczykij,
                BasicProfessions.Wrozbita,
                AdvancedProfessions.Vitki,
            )
        ),

        BasicProfessions.HienaCmentarna to Paths(
            entry = listOf(
                BasicProfessions.Aptekarz,
                BasicProfessions.BylySkazaniec,
                BasicProfessions.Dylentant,
                BasicProfessions.Goniec,
                SkavenProfessions.Klanbrat,
                BasicProfessions.Tarczownik,
                BasicProfessions.ZbieraczLajna,
                BasicProfessions.Zlodziej,
            ),
            exit = listOf(
                AdvancedProfessions.AgentCalunu,
                AdvancedProfessions.LowcaWampirow,
                AdvancedProfessions.Paser,
                BasicProfessions.BylySkazaniec,
                BasicProfessions.StraznikTuneli,
                BasicProfessions.Szczurolap,
                BasicProfessions.Tarczownik,
                BasicProfessions.Zlodziej,
            )
        ),

        BasicProfessions.Kadet to Paths(
            entry = listOf(
                BasicProfessions.SzermierzEstalijski,
                BasicProfessions.Najemnik,
                BasicProfessions.Ochotnik,
                BasicProfessions.Szlachcic,
                BasicProfessions.StraznikDrog,
                BasicProfessions.Giermek,
                BasicProfessions.Zolnierz,
                BasicProfessions.Zak,
            ),
            exit = listOf(
                AdvancedProfessions.Herold,
                BasicProfessions.Najemnik,
                AdvancedProfessions.Rajtar,
                AdvancedProfessions.Sierzant,
                BasicProfessions.Giermek,
                BasicProfessions.Zak,
            )
        ),

        BasicProfessions.Kanciarz to Paths(
            entry = listOf(
                BasicProfessions.AkolitaKultuSlaanesha,
                BasicProfessions.AkolitaKultuTzeentcha,
                BasicProfessions.Bajarz,
                BasicProfessions.Cyrkowiec,
                BasicProfessions.Gazeciarz,
                BasicProfessions.Koniarz,
                AdvancedProfessions.Mistyk,
                BasicProfessions.Paz,
                BasicProfessions.Podzegacz,
                BasicProfessions.Rozjemca,
                BasicProfessions.RzecznikRodu,
                BasicProfessions.Skald,
                AdvancedProfessions.Skrytobojca,
                BasicProfessions.StrzyganskiMistyk,
                BasicProfessions.SzermierzEstalijski,
                BasicProfessions.Szlachcic,
                BasicProfessions.Szuler,
                BasicProfessions.Zlodziej,
                AdvancedProfessions.Zwadzca,
                BasicProfessions.Zeglarz,
            ),
            exit = listOf(
                BasicProfessions.Bajarz,
                BasicProfessions.Banita,
                BasicProfessions.BylySkazaniec,
                BasicProfessions.Cyrkowiec,
                AdvancedProfessions.Demagog,
                BasicProfessions.Kominiarz,
                AdvancedProfessions.Lajdak,
                BasicProfessions.Rozjemca,
                BasicProfessions.Sluga,
                AdvancedProfessions.Szarlatan,
                BasicProfessions.Szuler,
                BasicProfessions.Zakapturzony,
                BasicProfessions.Zlodziej,
            )
        ),

        BasicProfessions.Kartograf to Paths(
            entry = listOf(
                BasicProfessions.Woznica,
                BasicProfessions.Poslaniec,
                AdvancedProfessions.Nawigator,
                AdvancedProfessions.Zwiadowca,
                BasicProfessions.Skryba,
                BasicProfessions.Zak,
                BasicProfessions.Rzemieslnik,
            ),
            exit = listOf(
                BasicProfessions.Rzemieslnik,
                AdvancedProfessions.Odkrywca,
                AdvancedProfessions.Falszerz,
                AdvancedProfessions.Nawigator,
                AdvancedProfessions.Uczony,
                BasicProfessions.Skryba,
                BasicProfessions.Wloczykij,
            )
        ),

        BasicProfessions.Koczownik to Paths(
            entry = listOf(
                AdvancedProfessions.KonnyLucznik,
                BasicProfessions.Znachorka,
            ),
            exit = listOf(
                AdvancedProfessions.Ataman,
                BasicProfessions.Banita,
                BasicProfessions.Koniarz,
                AdvancedProfessions.Koniuszy,
                AdvancedProfessions.KonnyLucznik,
                BasicProfessions.KozakKislevski,
                BasicProfessions.Poganiacz,
                BasicProfessions.Wloczykij,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        BasicProfessions.Kominiarz to Paths(
            entry = listOf(
                BasicProfessions.Chlop,
                BasicProfessions.Gornik,
                BasicProfessions.Kanciarz,
                BasicProfessions.Weglarz,
                BasicProfessions.Zlodziej,
            ),
            exit = listOf(
                BasicProfessions.Najemnik,
                BasicProfessions.Ochotnik,
                BasicProfessions.Rzezimieszek,
                BasicProfessions.Szczurolap,
                AdvancedProfessions.Wlamywacz,
            )
        ),

        BasicProfessions.Koniarz to Paths(
            entry = listOf(
                BasicProfessions.Koczownik,
                AdvancedProfessions.Koniuszy,
                BasicProfessions.Mieszczanin,
                BasicProfessions.Poganiacz,
                BasicProfessions.Poslaniec,
            ),
            exit = listOf(
                BasicProfessions.Kanciarz,
                AdvancedProfessions.Koniuszy,
                AdvancedProfessions.Kupiec,
                BasicProfessions.Mieszczanin,
                AdvancedProfessions.Szarlatan,
            )
        ),

        BasicProfessions.Korsarz to Paths(
            entry = listOf(
                BasicProfessions.BerserkerZNorski,
                BasicProfessions.Grabiezca,
                BasicProfessions.Skald,
                BasicProfessions.Wielorybnik,
                BasicProfessions.Woj,
                AdvancedProfessions.Wodz,
                BasicProfessions.Zeglarz,
            ),
            exit = listOf(
                AdvancedProfessions.Bosman,
                BasicProfessions.Grabiezca,
                AdvancedProfessions.HandlarzNiewolnikami,
                BasicProfessions.Najemnik,
                AdvancedProfessions.Nawigator,
                AdvancedProfessions.Weteran,
                BasicProfessions.Wielorybnik,
                AdvancedProfessions.Wodz,
                BasicProfessions.ZolnierzOkretowy,
            )
        ),

        BasicProfessions.KozakKislevski to Paths(
            entry = listOf(
                BasicProfessions.Koczownik,
            ),
            exit = listOf(
                BasicProfessions.Czekista,
                AdvancedProfessions.Husarz,
                BasicProfessions.LowcaNagrod,
                BasicProfessions.Najemnik,
                AdvancedProfessions.Sierzant,
                BasicProfessions.Strielec,
                BasicProfessions.Tarczownik,
                AdvancedProfessions.Weteran,
            )
        ),

        BasicProfessions.Latarnik to Paths(
            entry = listOf(
                BasicProfessions.Chlop,
                BasicProfessions.Sluga,
                BasicProfessions.Szczurolap,
                BasicProfessions.Weglarz,
            ),
            exit = listOf(
                BasicProfessions.Akolita,
                BasicProfessions.Cyrkowiec,
                BasicProfessions.Mieszczanin,
                BasicProfessions.Mytnik,
                BasicProfessions.Podzegacz,
                BasicProfessions.Przemytnik,
                BasicProfessions.Sluga,
                BasicProfessions.Straznik,
            )
        ),

        BasicProfessions.Lesnik to Paths(
            entry = listOf(
                BasicProfessions.Weglarz,
                BasicProfessions.Wloczykij,
            ),
            exit = listOf(
                BasicProfessions.Banita,
                BasicProfessions.Lowca,
                BasicProfessions.Ochotnik,
                BasicProfessions.Pacholek,
                BasicProfessions.PasterzZCarcassonne,
                AdvancedProfessions.RycerzZielonegoPola,
                BasicProfessions.Wloczykij,
                BasicProfessions.Zakapturzony,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        BasicProfessions.Lowca to Paths(
            entry = listOf(
                BasicProfessions.Lesnik,
                BasicProfessions.RogatyLowca,
                SkavenProfessions.Rynsztokowiec,
                AdvancedProfessions.TreserZwierzat,
                BasicProfessions.Weglarz,
                BasicProfessions.WojownikKlanowy,
            ),
            exit = listOf(
                BasicProfessions.Bagiennik,
                BasicProfessions.Gornik,
                BasicProfessions.LowcaNagrod,
                BasicProfessions.Pacholek,
                BasicProfessions.PasterzZCarcassonne,
                BasicProfessions.PielgrzymGraala,
                BasicProfessions.PoganiaczMulow,
                SkavenProfessions.PoganiaczSkavenski,
                BasicProfessions.Rozjemca,
                AdvancedProfessions.RycerzZielonegoPola,
                BasicProfessions.StraznikPol,
                AdvancedProfessions.StrozPrawa,
                AdvancedProfessions.Strzelec,
                AdvancedProfessions.TreserZwierzat,
                BasicProfessions.Weglarz,
                BasicProfessions.WojownikKlanowy,
                BasicProfessions.Zakapturzony,
                AdvancedProfessions.Zwiadowca,
                BasicProfessions.Zolnierz,
            )
        ),

        BasicProfessions.LowcaNagrod to Paths(
            entry = listOf(
                BasicProfessions.Gladiator,
                SkavenProfessions.Klanbrat,
                BasicProfessions.KozakKislevski,
                BasicProfessions.Lowca,
                BasicProfessions.Najemnik,
                BasicProfessions.Ochroniarz,
                SkavenProfessions.PoganiaczSkavenski,
                SkavenProfessions.PoslaniecNocy,
                SkavenProfessions.Rynsztokowiec,
                BasicProfessions.StraznikPol,
                BasicProfessions.Strielec,
            ),
            exit = listOf(
                AdvancedProfessions.LowcaWampirow,
                BasicProfessions.Najemnik,
                SkavenProfessions.PoganiaczSkavenski,
                BasicProfessions.Rzezimieszek,
                AdvancedProfessions.StrozPrawa,
                AdvancedProfessions.Strzelec,
                AdvancedProfessions.SledczyVereny,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        BasicProfessions.Mieszczanin to Paths(
            entry = listOf(
                BasicProfessions.AkolitaKultuTzeentcha,
                BasicProfessions.Balsamista,
                AdvancedProfessions.Karczmarz,
                BasicProfessions.Koniarz,
                BasicProfessions.Latarnik,
                BasicProfessions.PoganiaczMulow,
                BasicProfessions.Skald,
                BasicProfessions.Sluga,
            ),
            exit = listOf(
                BasicProfessions.Gazeciarz,
                AdvancedProfessions.Karczmarz,
                BasicProfessions.Koniarz,
                AdvancedProfessions.Kupiec,
                AdvancedProfessions.Obszarnik,
                BasicProfessions.Ochotnik,
                AdvancedProfessions.Pamflecista,
                AdvancedProfessions.Paser,
                BasicProfessions.Paz,
                BasicProfessions.Podzegacz,
                BasicProfessions.PoganiaczMulow,
                BasicProfessions.Prawnik,
                BasicProfessions.Rzemieslnik,
            )
        ),

        BasicProfessions.Mytnik to Paths(
            entry = listOf(
                BasicProfessions.Latarnik,
                BasicProfessions.StraznikDrog,
                BasicProfessions.StraznikRzeczny,
                BasicProfessions.Woznica,
                BasicProfessions.Zarzadca,
            ),
            exit = listOf(
                BasicProfessions.Banita,
                BasicProfessions.Przewoznik,
                AdvancedProfessions.Rozbojnik,
                BasicProfessions.StraznikPol,
                AdvancedProfessions.Urzednik,
                BasicProfessions.Zlodziej,
                BasicProfessions.Zolnierz,
            )
        ),

        BasicProfessions.Najemnik to Paths(
            entry = listOf(
                AdvancedProfessions.Artylerzysta,
                BasicProfessions.BerserkerZNorski,
                SkavenProfessions.Czarnoszczur,
                BasicProfessions.Czekista,
                AdvancedProfessions.Demagog,
                BasicProfessions.Gladiator,
                BasicProfessions.Gornik,
                BasicProfessions.Grabiezca,
                SkavenProfessions.Harcownik,
                SkavenProfessions.InzynierSpaczenia,
                BasicProfessions.Kadet,
                SkavenProfessions.Klanbrat,
                BasicProfessions.Kominiarz,
                AdvancedProfessions.KonnyLucznik,
                BasicProfessions.Korsarz,
                BasicProfessions.KozakKislevski,
                BasicProfessions.LowcaNagrod,
                BasicProfessions.Ochotnik,
                BasicProfessions.Ochroniarz,
                BasicProfessions.Oprych,
                BasicProfessions.PielgrzymGraala,
                SkavenProfessions.PoganiaczSkavenski,
                SkavenProfessions.PoslaniecNocy,
                BasicProfessions.Przepatrywacz,
                SkavenProfessions.Rynsztokowiec,
                BasicProfessions.Skald,
                BasicProfessions.Straznik,
                BasicProfessions.StraznikKanalow,
                BasicProfessions.StraznikPol,
                BasicProfessions.StraznikSwiatynny,
                BasicProfessions.StraznikTuneli,
                BasicProfessions.Strielec,
                BasicProfessions.Szperacz,
                SkavenProfessions.Szturmoszczur,
                BasicProfessions.Woj,
                AdvancedProfessions.Zbrojny,
                BasicProfessions.Zolnierz,
            ),
            exit = listOf(
                BasicProfessions.Banita,
                BasicProfessions.Kadet,
                AdvancedProfessions.Koniuszy,
                BasicProfessions.LowcaNagrod,
                BasicProfessions.Ochroniarz,
                SkavenProfessions.PoslaniecNocy,
                AdvancedProfessions.RycerzZielonegoPola,
                AdvancedProfessions.Sierzant,
                BasicProfessions.Szuler,
                BasicProfessions.Tarczownik,
                AdvancedProfessions.Weteran,
                BasicProfessions.Woj,
                AdvancedProfessions.Zbrojny,
            )
        ),

        BasicProfessions.Ochotnik to Paths(
            entry = listOf(
                BasicProfessions.Chlop,
                BasicProfessions.Grabaz,
                BasicProfessions.Kominiarz,
                AdvancedProfessions.Kupiec,
                BasicProfessions.Lesnik,
                BasicProfessions.Mieszczanin,
                AdvancedProfessions.MistrzRzemiosla,
                BasicProfessions.PoborcaPodatkowy,
                BasicProfessions.RogatyLowca,
                BasicProfessions.Rolnik,
                BasicProfessions.Rybak,
                BasicProfessions.Rzemieslnik,
                BasicProfessions.Zarzadca,
            ),
            exit = listOf(
                BasicProfessions.Bagiennik,
                BasicProfessions.Banita,
                BasicProfessions.Kadet,
                AdvancedProfessions.MistrzRzemiosla,
                BasicProfessions.Najemnik,
                BasicProfessions.Poslaniec,
                AdvancedProfessions.RycerzZielonegoPola,
                AdvancedProfessions.Sierzant,
                BasicProfessions.StraznikKanalow,
                BasicProfessions.StraznikPol,
                BasicProfessions.StraznikSwiatynny,
                BasicProfessions.Zlodziej,
            )
        ),

        BasicProfessions.Ochroniarz to Paths(
            entry = listOf(
                SkavenProfessions.Harcownik,
                SkavenProfessions.Klanbrat,
                BasicProfessions.Najemnik,
                BasicProfessions.Oprych,
                SkavenProfessions.PoslaniecNocy,
                SkavenProfessions.Rynsztokowiec,
                BasicProfessions.StraznikWiezienny,
                BasicProfessions.SzermierzEstalijski,
                SkavenProfessions.Szturmoszczur,
                BasicProfessions.Woj,
            ),
            exit = listOf(
                BasicProfessions.LowcaNagrod,
                BasicProfessions.Najemnik,
                AdvancedProfessions.Oprawca,
                AdvancedProfessions.Reketer,
                BasicProfessions.Rzezimieszek,
                BasicProfessions.StraznikWiezienny,
                BasicProfessions.Zarzadca,
            )
        ),

        BasicProfessions.Oprych to Paths(
            entry = listOf(
                BasicProfessions.Bagiennik,
                BasicProfessions.BylySkazaniec,
                BasicProfessions.Doker,
                SkavenProfessions.Klanbrat,
                SkavenProfessions.PoganiaczSkavenski,
                BasicProfessions.Rzezimieszek,
                BasicProfessions.ZbieraczLajna,
                BasicProfessions.ZolnierzOkretowy,
            ),
            exit = listOf(
                BasicProfessions.BylySkazaniec,
                BasicProfessions.Czekista,
                BasicProfessions.Gladiator,
                SkavenProfessions.Klanbrat,
                BasicProfessions.Najemnik,
                BasicProfessions.Ochroniarz,
                AdvancedProfessions.Oprawca,
                SkavenProfessions.PoslaniecNocy,
                AdvancedProfessions.Reketer,
            )
        ),

        BasicProfessions.Pacholek to Paths(
            entry = listOf(
                BasicProfessions.Chlop,
                BasicProfessions.Lesnik,
                BasicProfessions.Lowca,
                BasicProfessions.PasterzZCarcassonne,
                BasicProfessions.Wloczykij,
            ),
            exit = listOf(
                BasicProfessions.Banita,
                AdvancedProfessions.Budowniczy,
                BasicProfessions.PasterzZCarcassonne,
                BasicProfessions.Przepatrywacz,
                BasicProfessions.Rozjemca,
                AdvancedProfessions.Weteran,
                BasicProfessions.Zakapturzony,
                AdvancedProfessions.Zbrojny,
            )
        ),

        BasicProfessions.PasterzZCarcassonne to Paths(
            entry = listOf(
                BasicProfessions.Banita,
                BasicProfessions.Chlop,
                BasicProfessions.Lesnik,
                BasicProfessions.Lowca,
                BasicProfessions.Pacholek,
                BasicProfessions.PielgrzymGraala,
                BasicProfessions.Przepatrywacz,
                BasicProfessions.Wloczykij,
            ),
            exit = listOf(
                BasicProfessions.Banita,
                BasicProfessions.Pacholek,
                BasicProfessions.PielgrzymGraala,
                AdvancedProfessions.Weteran,
                BasicProfessions.Wloczykij,
                BasicProfessions.Zakapturzony,
                AdvancedProfessions.Zbrojny,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        BasicProfessions.Paz to Paths(
            entry = listOf(
                BasicProfessions.Mieszczanin,
                BasicProfessions.Sluga,
            ),
            exit = listOf(
                AdvancedProfessions.Ceremoniarz,
                BasicProfessions.Giermek,
                AdvancedProfessions.Herold,
                BasicProfessions.Kanciarz,
                AdvancedProfessions.Majordomus,
                BasicProfessions.Zak,
            )
        ),

        BasicProfessions.Pielgrzym to Paths(
            entry = listOf(
            ),
            exit = listOf(
                BasicProfessions.Akolita,
                BasicProfessions.Banita,
                AdvancedProfessions.Demagog,
                BasicProfessions.Fanatyk,
                BasicProfessions.Wloczykij,
                AdvancedProfessions.Zakonnik,
            )
        ),

        BasicProfessions.PielgrzymGraala to Paths(
            entry = listOf(
                BasicProfessions.Bagiennik,
                BasicProfessions.Banita,
                BasicProfessions.Chlop,
                BasicProfessions.Lowca,
                BasicProfessions.PasterzZCarcassonne,
                BasicProfessions.Rzemieslnik,
                BasicProfessions.Wloczykij,
                BasicProfessions.ZabiaPani,
                BasicProfessions.Zakapturzony,
            ),
            exit = listOf(
                BasicProfessions.Najemnik,
                BasicProfessions.PasterzZCarcassonne,
                AdvancedProfessions.PielgrzymBitewny,
                BasicProfessions.Wloczykij,
                BasicProfessions.Zakapturzony,
            )
        ),

        BasicProfessions.PiratRzeczny to Paths(
            entry = listOf(
                BasicProfessions.Banita,
                BasicProfessions.Chlop,
                BasicProfessions.Flisak,
                BasicProfessions.Przemytnik,
                BasicProfessions.Przewoznik,
                BasicProfessions.StraznikRzeczny,
                BasicProfessions.Zeglarz,
                BasicProfessions.ZolnierzOkretowy,
            ),
            exit = listOf(
                BasicProfessions.Banita,
                BasicProfessions.Flisak,
                AdvancedProfessions.Weteran,
                BasicProfessions.Zlodziej,
                BasicProfessions.ZolnierzOkretowy,
            )
        ),

        BasicProfessions.PoborcaPodatkowy to Paths(
            entry = listOf(
                BasicProfessions.Poslaniec,
                BasicProfessions.Skryba,
            ),
            exit = listOf(
                BasicProfessions.Banita,
                BasicProfessions.Podzegacz,
                BasicProfessions.Prawnik,
                AdvancedProfessions.Kupiec,
                BasicProfessions.Ochotnik,
                BasicProfessions.StraznikDrog,
                BasicProfessions.Zlodziej,
            )
        ),

        BasicProfessions.Podzegacz to Paths(
            entry = listOf(
                BasicProfessions.AkolitaKultuKhorna,
                BasicProfessions.AkolitaKultuNurgla,
                BasicProfessions.AkolitaKultuSlaanesha,
                BasicProfessions.AkolitaKultuTzeentcha,
                BasicProfessions.Fanatyk,
                BasicProfessions.Gazeciarz,
                AdvancedProfessions.Herold,
                BasicProfessions.Latarnik,
                BasicProfessions.Mieszczanin,
                AdvancedProfessions.Oficer,
                BasicProfessions.PoborcaPodatkowy,
                AdvancedProfessions.Rozbojnik,
                BasicProfessions.Skald,
                BasicProfessions.Skryba,
                BasicProfessions.Sluga,
                BasicProfessions.Wrozbita,
                BasicProfessions.Zak,
            ),
            exit = listOf(
                BasicProfessions.Bajarz,
                BasicProfessions.Banita,
                BasicProfessions.BylySkazaniec,
                AdvancedProfessions.Demagog,
                BasicProfessions.Fanatyk,
                BasicProfessions.Kanciarz,
                SkavenProfessions.Klanbrat,
                AdvancedProfessions.Pamflecista,
                AdvancedProfessions.Szarlatan,
                AdvancedProfessions.Urzednik,
                BasicProfessions.Zakapturzony,
            )
        ),

        BasicProfessions.Poganiacz to Paths(
            entry = listOf(
                BasicProfessions.Koczownik,
                AdvancedProfessions.Koniuszy,
                BasicProfessions.Poslaniec,
                BasicProfessions.Przepatrywacz,
                BasicProfessions.Woznica,
            ),
            exit = listOf(
                BasicProfessions.Banita,
                BasicProfessions.Koniarz,
                AdvancedProfessions.Koniuszy,
                BasicProfessions.Poslaniec,
                BasicProfessions.Przepatrywacz,
                AdvancedProfessions.Rozbojnik,
                BasicProfessions.StraznikDrog,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        BasicProfessions.PoganiaczMulow to Paths(
            entry = listOf(
                BasicProfessions.Chlop,
                BasicProfessions.Lowca,
                BasicProfessions.Mieszczanin,
                BasicProfessions.Poslaniec,
            ),
            exit = listOf(
                BasicProfessions.Banita,
                AdvancedProfessions.Kupiec,
                BasicProfessions.Mieszczanin,
                BasicProfessions.Poslaniec,
                AdvancedProfessions.Rozbojnik,
                AdvancedProfessions.TreserZwierzat,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        BasicProfessions.Pogranicznik to Paths(
            entry = listOf(
                BasicProfessions.Chlop,
                BasicProfessions.Pustelnik,
                BasicProfessions.Wloczykij,
            ),
            exit = listOf(
                AdvancedProfessions.Wlamywacz,
                BasicProfessions.Wloczykij,
            )
        ),

        BasicProfessions.Pokutnik to Paths(
            entry = listOf(
                BasicProfessions.Akolita,
                BasicProfessions.Banita,
                AdvancedProfessions.Biczownik,
                BasicProfessions.Fanatyk,
                BasicProfessions.Zak,
            ),
            exit = listOf(
                BasicProfessions.Akolita,
                AdvancedProfessions.Biczownik,
                AdvancedProfessions.Szarlatan,
                BasicProfessions.Wloczykij,
            )
        ),

        BasicProfessions.PorywaczZwlok to Paths(
            entry = listOf(
                BasicProfessions.AkolitaKultuNurgla,
                BasicProfessions.Balsamista,
                BasicProfessions.Cyrulik,
                BasicProfessions.Grabaz,
                SkavenProfessions.Klanbrat,
                BasicProfessions.Szczurolap,
                BasicProfessions.Smieciarz,
            ),
            exit = listOf(
                AdvancedProfessions.Paser,
                BasicProfessions.BylySkazaniec,
                BasicProfessions.Szczurolap,
                AdvancedProfessions.Wlamywacz,
                BasicProfessions.Zlodziej,
                BasicProfessions.Zak,
            )
        ),

        BasicProfessions.PoskramiaczNiedzwiedzi to Paths(
            entry = listOf(
                BasicProfessions.Akolita,
                BasicProfessions.Cyrkowiec,
                AdvancedProfessions.Kaplan,
                AdvancedProfessions.TreserZwierzat,
            ),
            exit = listOf(
                BasicProfessions.Akolita,
                BasicProfessions.Cyrkowiec,
                BasicProfessions.Gladiator,
                AdvancedProfessions.TreserZwierzat,
                BasicProfessions.Zolnierz,
            )
        ),

        BasicProfessions.Poslaniec to Paths(
            entry = listOf(
                BasicProfessions.Gazeciarz,
                BasicProfessions.Ochotnik,
                BasicProfessions.Poganiacz,
                BasicProfessions.PoganiaczMulow,
                BasicProfessions.Sluga,
                BasicProfessions.Przepatrywacz,
                BasicProfessions.StraznikDrog,
            ),
            exit = listOf(
                AdvancedProfessions.Ceremoniarz,
                AdvancedProfessions.Falszerz,
                BasicProfessions.Gazeciarz,
                AdvancedProfessions.Herold,
                BasicProfessions.Kartograf,
                SkavenProfessions.Klanbrat,
                BasicProfessions.Koniarz,
                BasicProfessions.PoborcaPodatkowy,
                BasicProfessions.Poganiacz,
                BasicProfessions.PoganiaczMulow,
                BasicProfessions.Przepatrywacz,
                BasicProfessions.StraznikDrog,
                BasicProfessions.WojownikKlanowy,
                BasicProfessions.Woznica,
                AdvancedProfessions.Pamflecista,
                AdvancedProfessions.Zwiadowca,
                BasicProfessions.Zolnierz,
            )
        ),

        BasicProfessions.Prawnik to Paths(
            entry = listOf(
                BasicProfessions.Mieszczanin,
                BasicProfessions.RzecznikRodu,
                BasicProfessions.PoborcaPodatkowy,
                BasicProfessions.Skryba,
                BasicProfessions.Zak,
                BasicProfessions.Straznik,
            ),
            exit = listOf(
                AdvancedProfessions.Demagog,
                AdvancedProfessions.Kupiec,
                AdvancedProfessions.MistrzGildii,
                AdvancedProfessions.Szarlatan,
                AdvancedProfessions.Uczony,
                AdvancedProfessions.Urzednik,
            )
        ),

        BasicProfessions.Przemytnik to Paths(
            entry = listOf(
                BasicProfessions.AkolitaKultuTzeentcha,
                BasicProfessions.CiuraObozowa,
                BasicProfessions.Doker,
                BasicProfessions.Flisak,
                BasicProfessions.Gornik,
                AdvancedProfessions.Inzynier,
                AdvancedProfessions.Karczmarz,
                BasicProfessions.Latarnik,
                SkavenProfessions.PoslaniecNocy,
                BasicProfessions.Przewoznik,
                BasicProfessions.Smieciarz,
                BasicProfessions.StraznikKanalow,
                BasicProfessions.StraznikRzeczny,
                BasicProfessions.StraznikTuneli,
                BasicProfessions.Tarczownik,
                BasicProfessions.Woznica,
                BasicProfessions.Zarzadca,
                BasicProfessions.Zeglarz,
                BasicProfessions.ZolnierzOkretowy,
            ),
            exit = listOf(
                AdvancedProfessions.Falszerz,
                BasicProfessions.BylySkazaniec,
                BasicProfessions.Flisak,
                AdvancedProfessions.Paser,
                BasicProfessions.PiratRzeczny,
                BasicProfessions.Przewoznik,
                AdvancedProfessions.Szarlatan,
                BasicProfessions.Tarczownik,
                BasicProfessions.Zlodziej,
                BasicProfessions.Zeglarz,
            )
        ),

        BasicProfessions.Przepatrywacz to Paths(
            entry = listOf(
                BasicProfessions.Pacholek,
                BasicProfessions.Poganiacz,
                BasicProfessions.Poslaniec,
                BasicProfessions.StraznikDrog,
                BasicProfessions.WojownikKlanowy,
                BasicProfessions.Zolnierz,
            ),
            exit = listOf(
                AdvancedProfessions.Husarz,
                AdvancedProfessions.Koniuszy,
                BasicProfessions.Najemnik,
                BasicProfessions.PasterzZCarcassonne,
                BasicProfessions.Poganiacz,
                BasicProfessions.Poslaniec,
                AdvancedProfessions.Rozbojnik,
                AdvancedProfessions.RycerzZielonegoPola,
                BasicProfessions.StraznikDrog,
                BasicProfessions.Woznica,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        BasicProfessions.Przewoznik to Paths(
            entry = listOf(
                BasicProfessions.Mytnik,
                BasicProfessions.Przemytnik,
                BasicProfessions.Woznica,
            ),
            exit = listOf(
                BasicProfessions.Bagiennik,
                BasicProfessions.Flisak,
                BasicProfessions.PiratRzeczny,
                BasicProfessions.Przemytnik,
                AdvancedProfessions.Rozbojnik,
                BasicProfessions.StraznikDrog,
                BasicProfessions.StraznikRzeczny,
                BasicProfessions.Zeglarz,
            )
        ),

        BasicProfessions.Pustelnik to Paths(
            entry = listOf(
            ),
            exit = listOf(
                BasicProfessions.Banita,
                AdvancedProfessions.Mistyk,
                BasicProfessions.Pogranicznik,
                BasicProfessions.Szperacz,
                BasicProfessions.Wloczykij,
            )
        ),

        BasicProfessions.RogatyLowca to Paths(
            entry = listOf(
                BasicProfessions.Akolita,
                BasicProfessions.Skryba,
            ),
            exit = listOf(
                BasicProfessions.Banita,
                BasicProfessions.Lowca,
                BasicProfessions.Ochotnik,
                BasicProfessions.Wloczykij,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        BasicProfessions.Rolnik to Paths(
            entry = listOf(
                AdvancedProfessions.Karczmarz,
                AdvancedProfessions.Kupiec,
                BasicProfessions.Chlop,
                BasicProfessions.Rzemieslnik,
                AdvancedProfessions.Weteran,
            ),
            exit = listOf(
                AdvancedProfessions.Karczmarz,
                AdvancedProfessions.Kupiec,
                AdvancedProfessions.Majordomus,
                BasicProfessions.Ochotnik,
                AdvancedProfessions.TreserZwierzat,
                AdvancedProfessions.Urzednik,
            )
        ),

        BasicProfessions.Rozjemca to Paths(
            entry = listOf(
                BasicProfessions.Chlop,
                BasicProfessions.Kanciarz,
                BasicProfessions.Lowca,
                BasicProfessions.Pacholek,
                BasicProfessions.Zakapturzony,
            ),
            exit = listOf(
                AdvancedProfessions.Demagog,
                BasicProfessions.Kanciarz,
                AdvancedProfessions.StarszyWioskowy,
                BasicProfessions.Zakapturzony,
            )
        ),

        BasicProfessions.Rybak to Paths(
            entry = listOf(
                BasicProfessions.Chlop,
                BasicProfessions.Flisak,
            ),
            exit = listOf(
                AdvancedProfessions.Kupiec,
                AdvancedProfessions.Nawigator,
                AdvancedProfessions.Obszarnik,
                BasicProfessions.Ochotnik,
                BasicProfessions.Wielorybnik,
                BasicProfessions.Zeglarz,
                BasicProfessions.ZolnierzOkretowy,
            )
        ),

        AdvancedProfessions.RycerzPlonacegoSlonca to Paths(
            entry = listOf(
                AdvancedProfessions.Arystokrata,
                BasicProfessions.Giermek,
                AdvancedProfessions.Kaplan,
                AdvancedProfessions.Rycerz,
                AdvancedProfessions.Sierzant,
                AdvancedProfessions.WybraniecBozy,
            ),
            exit = listOf(
                BasicProfessions.Akolita,
                AdvancedProfessions.Fechtmistrz,
                AdvancedProfessions.MistrzZakonny,
                AdvancedProfessions.Odkrywca,
                AdvancedProfessions.Oficer,
            )
        ),

        BasicProfessions.RzecznikRodu to Paths(
            entry = listOf(
                BasicProfessions.Rzemieslnik,
                BasicProfessions.Zak,
            ),
            exit = listOf(
                BasicProfessions.Kanciarz,
                AdvancedProfessions.Kupiec,
                BasicProfessions.Prawnik,
                AdvancedProfessions.Szarlatan,
                BasicProfessions.Wloczykij,
                BasicProfessions.Zeglarz,
                BasicProfessions.Zak,
            )
        ),

        BasicProfessions.Rzemieslnik to Paths(
            entry = listOf(
                BasicProfessions.AkolitaKultuTzeentcha,
                BasicProfessions.Chlop,
                BasicProfessions.CiuraObozowa,
                BasicProfessions.Cyrulik,
                BasicProfessions.Doker,
                BasicProfessions.Dylentant,
                AdvancedProfessions.Falszerz,
                SkavenProfessions.Harcownik,
                BasicProfessions.Kartograf,
                SkavenProfessions.Klanbrat,
                BasicProfessions.Mieszczanin,
                AdvancedProfessions.MistrzZielarstwa,
                BasicProfessions.Straznik,
                BasicProfessions.ZabiaPani,
            ),
            exit = listOf(
                BasicProfessions.Balsamista,
                AdvancedProfessions.Brygadzista,
                AdvancedProfessions.Budowniczy,
                AdvancedProfessions.Falszerz,
                BasicProfessions.Fanatyk,
                SkavenProfessions.Harcownik,
                AdvancedProfessions.Inzynier,
                BasicProfessions.Kartograf,
                SkavenProfessions.Klanbrat,
                AdvancedProfessions.Kupiec,
                AdvancedProfessions.MistrzRzemiosla,
                AdvancedProfessions.Obszarnik,
                AdvancedProfessions.Pamflecista,
                BasicProfessions.Ochotnik,
                BasicProfessions.PielgrzymGraala,
                BasicProfessions.Rolnik,
                BasicProfessions.RzecznikRodu,
            )
        ),

        BasicProfessions.Rzezimieszek to Paths(
            entry = listOf(
                BasicProfessions.BylySkazaniec,
                BasicProfessions.Gladiator,
                BasicProfessions.LowcaNagrod,
                BasicProfessions.Kominiarz,
                BasicProfessions.Ochroniarz,
                BasicProfessions.SzermierzEstalijski,
                BasicProfessions.Zarzadca,
            ),
            exit = listOf(
                BasicProfessions.BylySkazaniec,
                BasicProfessions.Czekista,
                BasicProfessions.Gladiator,
                BasicProfessions.Oprych,
                AdvancedProfessions.Reketer,
                BasicProfessions.Zlodziej,
                AdvancedProfessions.Zwadzca,
            )
        ),

        BasicProfessions.Skald to Paths(
            entry = listOf(
                BasicProfessions.Cyrkowiec,
                BasicProfessions.Woj,
            ),
            exit = listOf(
                BasicProfessions.BerserkerZNorski,
                BasicProfessions.Grabiezca,
                BasicProfessions.Kanciarz,
                BasicProfessions.Korsarz,
                BasicProfessions.Mieszczanin,
                BasicProfessions.Najemnik,
                AdvancedProfessions.Obszarnik,
                BasicProfessions.Podzegacz,
                BasicProfessions.Wrozbita,
            )
        ),

        BasicProfessions.Skryba to Paths(
            entry = listOf(
                BasicProfessions.Akolita,
                BasicProfessions.AkolitaKultuTzeentcha,
                AdvancedProfessions.Czarnoksieznik,
                BasicProfessions.CzeladnikRun,
                AdvancedProfessions.Falszerz,
                BasicProfessions.Gazeciarz,
                BasicProfessions.Kartograf,
                BasicProfessions.UczenCzarodzieja,
                SkavenProfessions.UczenSzaregoProroka,
                BasicProfessions.UczenZielarza,
            ),
            exit = listOf(
                BasicProfessions.Akolita,
                AdvancedProfessions.Brygadzista,
                BasicProfessions.CzeladnikRun,
                BasicProfessions.Kartograf,
                AdvancedProfessions.Katecheta,
                AdvancedProfessions.Mnich,
                AdvancedProfessions.Nawigator,
                AdvancedProfessions.Pamflecista,
                BasicProfessions.PoborcaPodatkowy,
                BasicProfessions.Podzegacz,
                BasicProfessions.Prawnik,
                BasicProfessions.RogatyLowca,
                BasicProfessions.UczenCzarodzieja,
                AdvancedProfessions.Uczony,
            )
        ),

        BasicProfessions.Sluga to Paths(
            entry = listOf(
                BasicProfessions.Cenobita,
                BasicProfessions.Chlop,
                BasicProfessions.CiuraObozowa,
                BasicProfessions.Kanciarz,
                BasicProfessions.Latarnik,
                BasicProfessions.ZabiaPani,
            ),
            exit = listOf(
                BasicProfessions.CiuraObozowa,
                BasicProfessions.Gazeciarz,
                AdvancedProfessions.Karczmarz,
                BasicProfessions.Latarnik,
                BasicProfessions.Mieszczanin,
                BasicProfessions.Paz,
                BasicProfessions.Podzegacz,
                BasicProfessions.Poslaniec,
                AdvancedProfessions.Szpieg,
                BasicProfessions.Zlodziej,
            )
        ),

        BasicProfessions.Straznik to Paths(
            entry = listOf(
                BasicProfessions.Czekista,
                BasicProfessions.Grabaz,
                BasicProfessions.Latarnik,
                BasicProfessions.StraznikKanalow,
                BasicProfessions.StraznikSwiatynny,
                BasicProfessions.StraznikWiezienny,
                BasicProfessions.Strielec,
                BasicProfessions.Zolnierz,
            ),
            exit = listOf(
                BasicProfessions.Czekista,
                SkavenProfessions.Harcownik,
                SkavenProfessions.Klanbrat,
                BasicProfessions.Najemnik,
                BasicProfessions.Prawnik,
                AdvancedProfessions.Reketer,
                BasicProfessions.Rzemieslnik,
                AdvancedProfessions.Sierzant,
                BasicProfessions.StraznikDrog,
                BasicProfessions.StraznikKanalow,
                BasicProfessions.StraznikSwiatynny,
                BasicProfessions.StraznikTuneli,
                AdvancedProfessions.StrozPrawa,
                BasicProfessions.Strielec,
                AdvancedProfessions.SledczyVereny,
                BasicProfessions.Zolnierz,
            )
        ),

        BasicProfessions.StraznikDrog to Paths(
            entry = listOf(
                BasicProfessions.PoborcaPodatkowy,
                BasicProfessions.Poganiacz,
                BasicProfessions.Poslaniec,
                BasicProfessions.Przepatrywacz,
                BasicProfessions.Przewoznik,
                BasicProfessions.Straznik,
                BasicProfessions.StraznikRzeczny,
                BasicProfessions.Woznica,
            ),
            exit = listOf(
                BasicProfessions.Banita,
                BasicProfessions.Kadet,
                AdvancedProfessions.Koniuszy,
                BasicProfessions.Mytnik,
                BasicProfessions.Poslaniec,
                BasicProfessions.Przepatrywacz,
                AdvancedProfessions.Rozbojnik,
                AdvancedProfessions.Sierzant,
                AdvancedProfessions.SledczyVereny,
                BasicProfessions.StraznikRzeczny,
                AdvancedProfessions.StrozPrawa,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        BasicProfessions.StraznikKanalow to Paths(
            entry = listOf(
                BasicProfessions.Chlop,
                BasicProfessions.Ochotnik,
                BasicProfessions.Straznik,
                BasicProfessions.StraznikWiezienny,
                BasicProfessions.Szczurolap,
                BasicProfessions.Tarczownik,
                BasicProfessions.ZbieraczLajna,
            ),
            exit = listOf(
                BasicProfessions.Najemnik,
                BasicProfessions.Przemytnik,
                AdvancedProfessions.Sierzant,
                BasicProfessions.Straznik,
                BasicProfessions.Szczurolap,
                BasicProfessions.Tarczownik,
                AdvancedProfessions.Weteran,
            )
        ),

        BasicProfessions.StraznikPol to Paths(
            entry = listOf(
                BasicProfessions.Lowca,
                BasicProfessions.Mytnik,
                BasicProfessions.Ochotnik,
            ),
            exit = listOf(
                AdvancedProfessions.AgentCalunu,
                BasicProfessions.LowcaNagrod,
                AdvancedProfessions.LowcaWampirow,
                BasicProfessions.Najemnik,
                BasicProfessions.Wloczykij,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        BasicProfessions.StraznikRzeczny to Paths(
            entry = listOf(
                BasicProfessions.Flisak,
                BasicProfessions.Przewoznik,
                BasicProfessions.StraznikDrog,
                BasicProfessions.ZolnierzOkretowy,
            ),
            exit = listOf(
                BasicProfessions.Flisak,
                BasicProfessions.Mytnik,
                BasicProfessions.PiratRzeczny,
                BasicProfessions.Przemytnik,
                AdvancedProfessions.Sierzant,
                BasicProfessions.StraznikDrog,
                AdvancedProfessions.SledczyVereny,
                BasicProfessions.Zeglarz,
                BasicProfessions.ZolnierzOkretowy,
            )
        ),

        BasicProfessions.StraznikSwiatynny to Paths(
            entry = listOf(
                BasicProfessions.Akolita,
                BasicProfessions.Fanatyk,
                BasicProfessions.Ochotnik,
                BasicProfessions.Straznik,
            ),
            exit = listOf(
                BasicProfessions.Akolita,
                BasicProfessions.Giermek,
                BasicProfessions.Najemnik,
                BasicProfessions.Straznik,
                BasicProfessions.Zolnierz,
            )
        ),

        BasicProfessions.StraznikTuneli to Paths(
            entry = listOf(
                BasicProfessions.HienaCmentarna,
                BasicProfessions.Straznik,
                BasicProfessions.Szczurolap,
                BasicProfessions.Tarczownik,
                BasicProfessions.Zolnierz,
            ),
            exit = listOf(
                AdvancedProfessions.Inzynier,
                BasicProfessions.Najemnik,
                AdvancedProfessions.Odkrywca,
                BasicProfessions.Przemytnik,
                AdvancedProfessions.Sierzant,
                AdvancedProfessions.Weteran,
            )
        ),

        BasicProfessions.StraznikWiezienny to Paths(
            entry = listOf(
                BasicProfessions.Czekista,
                SkavenProfessions.Klanbrat,
                BasicProfessions.Ochroniarz,
                BasicProfessions.Szczurolap,
            ),
            exit = listOf(
                SkavenProfessions.Klanbrat,
                BasicProfessions.Ochroniarz,
                AdvancedProfessions.Oprawca,
                BasicProfessions.Straznik,
                BasicProfessions.StraznikKanalow,
                BasicProfessions.Szczurolap,
                BasicProfessions.Zarzadca,
            )
        ),

        BasicProfessions.Strielec to Paths(
            entry = listOf(
                BasicProfessions.KozakKislevski,
                BasicProfessions.Straznik,
            ),
            exit = listOf(
                BasicProfessions.Czekista,
                AdvancedProfessions.Husarz,
                BasicProfessions.LowcaNagrod,
                BasicProfessions.Najemnik,
                AdvancedProfessions.Sierzant,
                BasicProfessions.Straznik,
                AdvancedProfessions.Weteran,
            )
        ),

        BasicProfessions.StrzyganskiMistyk to Paths(
            entry = listOf(
            ),
            exit = listOf(
                AdvancedProfessions.Astrolog,
                BasicProfessions.Cyrkowiec,
                BasicProfessions.Guslarz,
                BasicProfessions.Kanciarz,
                AdvancedProfessions.Szarlatan,
                BasicProfessions.Smieciarz,
                BasicProfessions.Wrozbita,
                BasicProfessions.Zlodziej,
            )
        ),

        BasicProfessions.Szczurolap to Paths(
            entry = listOf(
                BasicProfessions.Goniec,
                BasicProfessions.HienaCmentarna,
                BasicProfessions.Kominiarz,
                BasicProfessions.PorywaczZwlok,
                BasicProfessions.StraznikKanalow,
                BasicProfessions.StraznikWiezienny,
                BasicProfessions.ZbieraczLajna,
            ),
            exit = listOf(
                BasicProfessions.Grabaz,
                BasicProfessions.Latarnik,
                BasicProfessions.PorywaczZwlok,
                BasicProfessions.StraznikKanalow,
                BasicProfessions.StraznikWiezienny,
                BasicProfessions.Smieciarz,
                BasicProfessions.StraznikTuneli,
                BasicProfessions.Tarczownik,
                AdvancedProfessions.TreserZwierzat,
                AdvancedProfessions.Wlamywacz,
                BasicProfessions.ZbieraczLajna,
                BasicProfessions.Zlodziej,
            )
        ),

        BasicProfessions.SzermierzEstalijski to Paths(
            entry = listOf(
            ),
            exit = listOf(
                BasicProfessions.Kanciarz,
                BasicProfessions.Kadet,
                BasicProfessions.Ochroniarz,
                AdvancedProfessions.Rozbojnik,
                BasicProfessions.Rzezimieszek,
                AdvancedProfessions.Zwadzca,
            )
        ),

        BasicProfessions.Szlachcic to Paths(
            entry = listOf(
                BasicProfessions.AkolitaKultuSlaanesha,
                BasicProfessions.AkolitaKultuTzeentcha,
                BasicProfessions.Giermek,
                AdvancedProfessions.Majordomus,
            ),
            exit = listOf(
                AdvancedProfessions.Admiral,
                AdvancedProfessions.Astrolog,
                AdvancedProfessions.Ataman,
                BasicProfessions.BlednyRycerz,
                AdvancedProfessions.Dworak,
                AdvancedProfessions.Dworzanin,
                BasicProfessions.Giermek,
                AdvancedProfessions.Husarz,
                BasicProfessions.Kadet,
                BasicProfessions.Kanciarz,
                AdvancedProfessions.Koniuszy,
                AdvancedProfessions.KonnyLucznik,
                AdvancedProfessions.Rajtar,
                BasicProfessions.Szuler,
                AdvancedProfessions.Urzednik,
                BasicProfessions.Zak,
                BasicProfessions.Zakapturzony,
            )
        ),

        BasicProfessions.Szperacz to Paths(
            entry = listOf(
                BasicProfessions.Chlop,
                BasicProfessions.Pustelnik,
                BasicProfessions.Wloczykij,
            ),
            exit = listOf(
                BasicProfessions.Chlop,
                BasicProfessions.Najemnik,
                BasicProfessions.Wloczykij,
            )
        ),

        BasicProfessions.Szuler to Paths(
            entry = listOf(
                BasicProfessions.Cyrkowiec,
                BasicProfessions.Kanciarz,
                BasicProfessions.Najemnik,
                BasicProfessions.Szlachcic,
                BasicProfessions.Wloczykij,
                BasicProfessions.Zlodziej,
                BasicProfessions.Zak,
            ),
            exit = listOf(
                BasicProfessions.Cyrkowiec,
                AdvancedProfessions.Demagog,
                BasicProfessions.Kanciarz,
                AdvancedProfessions.Rozbojnik,
                AdvancedProfessions.Szarlatan,
            )
        ),



        BasicProfessions.Smieciarz to Paths(
            entry = listOf(
                BasicProfessions.Chlop,
                SkavenProfessions.Klanbrat,
                BasicProfessions.StrzyganskiMistyk,
                BasicProfessions.Szczurolap,
                BasicProfessions.Wloczykij,
                BasicProfessions.ZabiaPani,
                BasicProfessions.ZbieraczLajna,
            ),
            exit = listOf(
                BasicProfessions.Bagiennik,
                BasicProfessions.CiuraObozowa,
                BasicProfessions.Grabaz,
                AdvancedProfessions.Paser,
                BasicProfessions.PorywaczZwlok,
                BasicProfessions.Przemytnik,
                AdvancedProfessions.Wlamywacz,
                BasicProfessions.ZabiaPani,
                BasicProfessions.ZbieraczLajna,
            )
        ),

        BasicProfessions.Tarczownik to Paths(
            entry = listOf(
                BasicProfessions.CzeladnikRun,
                BasicProfessions.Goniec,
                BasicProfessions.Gornik,
                BasicProfessions.HienaCmentarna,
                AdvancedProfessions.KowalRun,
                BasicProfessions.KozakKislevski,
                BasicProfessions.Najemnik,
                BasicProfessions.Przemytnik,
                BasicProfessions.StraznikKanalow,
                BasicProfessions.Szczurolap,
            ),
            exit = listOf(
                BasicProfessions.Gladiator,
                BasicProfessions.Goniec,
                BasicProfessions.HienaCmentarna,
                BasicProfessions.Przemytnik,
                AdvancedProfessions.Sierzant,
                BasicProfessions.StraznikKanalow,
                BasicProfessions.StraznikTuneli,
                AdvancedProfessions.Weteran,
            )
        ),

        BasicProfessions.UczenCzarodzieja to Paths(
            entry = listOf(
                BasicProfessions.Aptekarz,
                AdvancedProfessions.Astrolog,
                BasicProfessions.Balsamista,
                AdvancedProfessions.Czarownik,
                AdvancedProfessions.Czarnoksieznik,
                BasicProfessions.Dylentant,
                BasicProfessions.Guslarz,
                BasicProfessions.Skryba,
                AdvancedProfessions.Uczony,
                BasicProfessions.Zak,
            ),
            exit = listOf(
                BasicProfessions.Aptekarz,
                AdvancedProfessions.Astrolog,
                BasicProfessions.Skryba,
                AdvancedProfessions.Uczony,
                AdvancedProfessions.WedrownyCzarodziej,
            )
        ),

        BasicProfessions.UczennicaCzarownicy to Paths(
            entry = listOf(
            ),
            exit = listOf(
                BasicProfessions.Akolita,
                AdvancedProfessions.Czarownik,
                AdvancedProfessions.LodowaPanna,
            )
        ),

        BasicProfessions.UczenZielarza to Paths(
            entry = listOf(
                BasicProfessions.Aptekarz,
                BasicProfessions.Chlop,
                BasicProfessions.Guslarz,
            ),
            exit = listOf(
                BasicProfessions.Akolita,
                BasicProfessions.Aptekarz,
                BasicProfessions.Cyrulik,
                AdvancedProfessions.MistrzZielarstwa,
                AdvancedProfessions.Szarlatan,
                BasicProfessions.Banita,
                BasicProfessions.Skryba,
                BasicProfessions.Fanatyk,
            )
        ),

        BasicProfessions.Weglarz to Paths(
            entry = listOf(
                BasicProfessions.Chlop,
                BasicProfessions.CiuraObozowa,
                BasicProfessions.Gornik,
                BasicProfessions.Lowca,
            ),
            exit = listOf(
                BasicProfessions.Gornik,
                BasicProfessions.Latarnik,
                BasicProfessions.Lesnik,
                BasicProfessions.Lowca,
                BasicProfessions.Kominiarz,
                BasicProfessions.Wloczykij,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        BasicProfessions.Wielorybnik to Paths(
            entry = listOf(
                BasicProfessions.Korsarz,
                BasicProfessions.Rybak,
                BasicProfessions.Zeglarz,
            ),
            exit = listOf(
                BasicProfessions.Grabiezca,
                BasicProfessions.Korsarz,
                AdvancedProfessions.Nawigator,
                AdvancedProfessions.Obszarnik,
                AdvancedProfessions.Weteran,
            )
        ),

        BasicProfessions.Wloczykij to Paths(
            entry = listOf(
                BasicProfessions.Bagiennik,
                BasicProfessions.Banita,
                BasicProfessions.BylySkazaniec,
                BasicProfessions.Cenobita,
                BasicProfessions.CiuraObozowa,
                BasicProfessions.Cyrkowiec,
                BasicProfessions.Cyrulik,
                AdvancedProfessions.Czarownik,
                AdvancedProfessions.Czarnoksieznik,
                BasicProfessions.Guslarz,
                BasicProfessions.Kartograf,
                SkavenProfessions.Klanbrat,
                BasicProfessions.Koczownik,
                BasicProfessions.Lesnik,
                BasicProfessions.PasterzZCarcassonne,
                BasicProfessions.Pielgrzym,
                AdvancedProfessions.PielgrzymBitewny,
                BasicProfessions.PielgrzymGraala,
                SkavenProfessions.PoganiaczSkavenski,
                BasicProfessions.Pogranicznik,
                BasicProfessions.Pokutnik,
                SkavenProfessions.PoslaniecNocy,
                BasicProfessions.Pustelnik,
                BasicProfessions.RogatyLowca,
                BasicProfessions.RzecznikRodu,
                BasicProfessions.StraznikPol,
                BasicProfessions.Szperacz,
                BasicProfessions.Weglarz,
                AdvancedProfessions.Wlamywacz,
                BasicProfessions.WojownikKlanowy,
                BasicProfessions.Wrozbita,
                BasicProfessions.ZabiaPani,
                BasicProfessions.Zakapturzony,
                BasicProfessions.Zolnierz,
            ),
            exit = listOf(
                BasicProfessions.Bajarz,
                BasicProfessions.Cyrkowiec,
                SkavenProfessions.Klanbrat,
                AdvancedProfessions.Lajdak,
                BasicProfessions.Lesnik,
                BasicProfessions.Pacholek,
                BasicProfessions.PasterzZCarcassonne,
                BasicProfessions.PielgrzymGraala,
                BasicProfessions.Pogranicznik,
                BasicProfessions.Smieciarz,
                BasicProfessions.Szperacz,
                BasicProfessions.Szuler,
                AdvancedProfessions.Zakonnik,
                BasicProfessions.ZbieraczLajna,
                BasicProfessions.Zlodziej,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        BasicProfessions.Woj to Paths(
            entry = listOf(
                BasicProfessions.BerserkerZNorski,
                BasicProfessions.Gladiator,
                BasicProfessions.Grabiezca,
                BasicProfessions.Najemnik,
            ),
            exit = listOf(
                BasicProfessions.BerserkerZNorski,
                BasicProfessions.Grabiezca,
                BasicProfessions.Korsarz,
                BasicProfessions.Najemnik,
                AdvancedProfessions.Obszarnik,
                BasicProfessions.Ochroniarz,
                BasicProfessions.Skald,
                AdvancedProfessions.Weteran,
                AdvancedProfessions.Wodz,
            )
        ),

        BasicProfessions.WojownikKlanowy to Paths(
            entry = listOf(
                BasicProfessions.Lowca,
                BasicProfessions.Poslaniec,
            ),
            exit = listOf(
                BasicProfessions.Lowca,
                BasicProfessions.Przepatrywacz,
                AdvancedProfessions.Weteran,
                BasicProfessions.Wloczykij,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        BasicProfessions.Woznica to Paths(
            entry = listOf(
                BasicProfessions.Poslaniec,
                BasicProfessions.Przepatrywacz,
            ),
            exit = listOf(
                BasicProfessions.Banita,
                BasicProfessions.Kartograf,
                BasicProfessions.Mytnik,
                BasicProfessions.Poganiacz,
                BasicProfessions.Przemytnik,
                BasicProfessions.Przewoznik,
                AdvancedProfessions.Rozbojnik,
                BasicProfessions.StraznikDrog,
                BasicProfessions.Zakapturzony,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        BasicProfessions.Wrozbita to Paths(
            entry = listOf(
                BasicProfessions.Guslarz,
                BasicProfessions.Skald,
                BasicProfessions.StrzyganskiMistyk,
            ),
            exit = listOf(
                AdvancedProfessions.Czarownik,
                BasicProfessions.Podzegacz,
                AdvancedProfessions.Szarlatan,
                AdvancedProfessions.Vitki,
                BasicProfessions.Wloczykij,
                // BasicProfessions.Zlowroz,
            )
        ),

        BasicProfessions.ZabiaPani to Paths(
            entry = listOf(
                BasicProfessions.Chlop,
                BasicProfessions.CiuraObozowa,
                BasicProfessions.Smieciarz,
            ),
            exit = listOf(
                BasicProfessions.CiuraObozowa,
                BasicProfessions.Flisak,
                BasicProfessions.Smieciarz,
                BasicProfessions.Bagiennik,
                BasicProfessions.PielgrzymGraala,
                BasicProfessions.Zakapturzony,
                BasicProfessions.Sluga,
                BasicProfessions.Rzemieslnik,
                BasicProfessions.Sluga,
                BasicProfessions.Rzemieslnik,
                BasicProfessions.Wloczykij,
                AdvancedProfessions.StarszyWioskowy,
            )
        ),

        BasicProfessions.ZabojcaTrolli to Paths(
            entry = listOf(
                BasicProfessions.Gladiator,
            ),
            exit = listOf(
                AdvancedProfessions.ZabojcaOlbrzymow,
            )
        ),

        BasicProfessions.Zarzadca to Paths(
            entry = listOf(
                BasicProfessions.Ochroniarz,
                BasicProfessions.StraznikWiezienny,
            ),
            exit = listOf(
                BasicProfessions.Mytnik,
                BasicProfessions.Ochotnik,
                BasicProfessions.Przemytnik,
                AdvancedProfessions.Reketer,
                BasicProfessions.Rzezimieszek,
                AdvancedProfessions.Urzednik,
            )
        ),

        BasicProfessions.Zlodziej to Paths(
            entry = listOf(
                BasicProfessions.Banita,
                BasicProfessions.Cyrkowiec,
                BasicProfessions.Doker,
                BasicProfessions.HienaCmentarna,
                BasicProfessions.Kanciarz,
                SkavenProfessions.Klanbrat,
                BasicProfessions.Mytnik,
                BasicProfessions.Ochotnik,
                AdvancedProfessions.Oprawca,
                BasicProfessions.PiratRzeczny,
                BasicProfessions.PoborcaPodatkowy,
                BasicProfessions.PorywaczZwlok,
                SkavenProfessions.PoslaniecNocy,
                BasicProfessions.Przemytnik,
                BasicProfessions.Rzezimieszek,
                BasicProfessions.Sluga,
                BasicProfessions.StrzyganskiMistyk,
                BasicProfessions.Szczurolap,
                BasicProfessions.Wloczykij,
                BasicProfessions.Zakapturzony,
            ),
            exit = listOf(
                BasicProfessions.BylySkazaniec,
                BasicProfessions.Cyrkowiec,
                BasicProfessions.HienaCmentarna,
                BasicProfessions.Kanciarz,
                SkavenProfessions.Klanbrat,
                BasicProfessions.Kominiarz,
                AdvancedProfessions.Paser,
                SkavenProfessions.PoslaniecNocy,
                AdvancedProfessions.Szarlatan,
                BasicProfessions.Szuler,
                AdvancedProfessions.SledczyVereny,
                AdvancedProfessions.Wlamywacz,
            )
        ),

        BasicProfessions.Zak to Paths(
            entry = listOf(
                BasicProfessions.AkolitaKultuTzeentcha,
                AdvancedProfessions.Bard,
                BasicProfessions.Dylentant,
                AdvancedProfessions.Falszerz,
                BasicProfessions.Kadet,
                BasicProfessions.Paz,
                BasicProfessions.PorywaczZwlok,
                BasicProfessions.RzecznikRodu,
                BasicProfessions.Szlachcic,
            ),
            exit = listOf(
                AdvancedProfessions.AgentCalunu,
                BasicProfessions.Akolita,
                BasicProfessions.Aptekarz,
                AdvancedProfessions.Astrolog,
                BasicProfessions.Bajarz,
                BasicProfessions.Balsamista,
                BasicProfessions.Cyrulik,
                BasicProfessions.CzeladnikRun,
                AdvancedProfessions.Falszerz,
                BasicProfessions.Gazeciarz,
                AdvancedProfessions.Inzynier,
                BasicProfessions.Kadet,
                BasicProfessions.Kartograf,
                AdvancedProfessions.Katecheta,
                AdvancedProfessions.Medyk,
                AdvancedProfessions.Mnich,
                AdvancedProfessions.Pamflecista,
                BasicProfessions.Podzegacz,
                BasicProfessions.Pokutnik,
                BasicProfessions.Prawnik,
                BasicProfessions.RzecznikRodu,
                BasicProfessions.Szuler,
                BasicProfessions.UczenCzarodzieja,
                AdvancedProfessions.Uczony,
            )
        ),

        BasicProfessions.Zakapturzony to Paths(
            entry = listOf(
                BasicProfessions.Bagiennik,
                BasicProfessions.Banita,
                BasicProfessions.BlednyRycerz,
                BasicProfessions.Chlop,
                BasicProfessions.Kanciarz,
                AdvancedProfessions.Karczmarz,
                BasicProfessions.Lesnik,
                BasicProfessions.Lowca,
                BasicProfessions.Pacholek,
                BasicProfessions.PasterzZCarcassonne,
                BasicProfessions.PielgrzymGraala,
                BasicProfessions.Podzegacz,
                BasicProfessions.Rozjemca,
                AdvancedProfessions.Szarlatan,
                BasicProfessions.Szlachcic,
                BasicProfessions.Woznica,
                BasicProfessions.ZabiaPani,
            ),
            exit = listOf(
                BasicProfessions.Banita,
                AdvancedProfessions.Demagog,
                BasicProfessions.PielgrzymGraala,
                BasicProfessions.Rozjemca,
                AdvancedProfessions.Weteran,
                BasicProfessions.Wloczykij,
                BasicProfessions.Zlodziej,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        BasicProfessions.ZbieraczLajna to Paths(
            entry = listOf(
                BasicProfessions.Chlop,
                BasicProfessions.CiuraObozowa,
                BasicProfessions.Szczurolap,
                BasicProfessions.Smieciarz,
                BasicProfessions.Wloczykij,
            ),
            exit = listOf(
                BasicProfessions.HienaCmentarna,
                BasicProfessions.Oprych,
                BasicProfessions.StraznikKanalow,
                BasicProfessions.Szczurolap,
                BasicProfessions.Smieciarz,
            )
        ),

        BasicProfessions.Zeglarz to Paths(
            entry = listOf(
                BasicProfessions.BerserkerZNorski,
                BasicProfessions.Flisak,
                AdvancedProfessions.HandlarzNiewolnikami,
                BasicProfessions.Przemytnik,
                BasicProfessions.Przewoznik,
                BasicProfessions.Rybak,
                BasicProfessions.RzecznikRodu,
                BasicProfessions.StraznikRzeczny,
            ),
            exit = listOf(
                BasicProfessions.Bajarz,
                AdvancedProfessions.Bosman,
                BasicProfessions.Kanciarz,
                BasicProfessions.Korsarz,
                AdvancedProfessions.Nawigator,
                BasicProfessions.PiratRzeczny,
                BasicProfessions.Przemytnik,
                BasicProfessions.Wielorybnik,
                BasicProfessions.ZolnierzOkretowy,
            )
        ),

        BasicProfessions.Znachorka to Paths(
            entry = listOf(
            ),
            exit = listOf(
                AdvancedProfessions.Demagog,
                BasicProfessions.Guslarz,
                BasicProfessions.Koczownik,
                AdvancedProfessions.Urzednik,
                AdvancedProfessions.Wiedzma,
            )
        ),

        BasicProfessions.Zolnierz to Paths(
            entry = listOf(
                AdvancedProfessions.Biczownik,
                BasicProfessions.Czekista,
                BasicProfessions.Lowca,
                BasicProfessions.Mytnik,
                BasicProfessions.PoskramiaczNiedzwiedzi,
                BasicProfessions.Poslaniec,
                BasicProfessions.Straznik,
                BasicProfessions.StraznikSwiatynny,
            ),
            exit = listOf(
                BasicProfessions.Bajarz,
                BasicProfessions.Kadet,
                AdvancedProfessions.Koniuszy,
                BasicProfessions.Najemnik,
                BasicProfessions.Przepatrywacz,
                AdvancedProfessions.RycerzZielonegoPola,
                AdvancedProfessions.Sierzant,
                BasicProfessions.Straznik,
                BasicProfessions.StraznikTuneli,
                AdvancedProfessions.Weteran,
                BasicProfessions.Wloczykij,
            )
        ),

        BasicProfessions.ZolnierzOkretowy to Paths(
            entry = listOf(
                BasicProfessions.Doker,
                BasicProfessions.Flisak,
                BasicProfessions.Korsarz,
                BasicProfessions.PiratRzeczny,
                BasicProfessions.Rybak,
                BasicProfessions.StraznikRzeczny,
                BasicProfessions.Zeglarz,
            ),
            exit = listOf(
                BasicProfessions.Banita,
                AdvancedProfessions.Bosman,
                BasicProfessions.Oprych,
                BasicProfessions.PiratRzeczny,
                BasicProfessions.Przemytnik,
                AdvancedProfessions.Sierzant,
                BasicProfessions.StraznikRzeczny,
            )
        ),
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////        ZAAWANSOWANE      //////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////

        AdvancedProfessions.Admiral to Paths(
            entry = listOf(
                BasicProfessions.Szlachcic,
                AdvancedProfessions.Kapitan,
            ),
            exit = listOf(
                AdvancedProfessions.Ambasador,
                AdvancedProfessions.Odkrywca,
                AdvancedProfessions.MistrzGildii,
            )
        ),

        AdvancedProfessions.AgentCalunu to Paths(
            entry = listOf(
                BasicProfessions.Akolita,
                BasicProfessions.Cyrulik,
                BasicProfessions.HienaCmentarna,
                AdvancedProfessions.LowcaWampirow,
                BasicProfessions.StraznikPol,
                AdvancedProfessions.Uczony,
                BasicProfessions.Zak,
            ),
            exit = listOf(
                AdvancedProfessions.Kaplan,
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.LowcaWampirow,
                AdvancedProfessions.Szpieg,
                AdvancedProfessions.Uczony,
                AdvancedProfessions.ZabojcaNieumarlych,
            )
        ),

        AdvancedProfessions.Ambasador to Paths(
            entry = listOf(
                AdvancedProfessions.Admiral,
                AdvancedProfessions.Arcykaplan,
                AdvancedProfessions.Arcymag,
                AdvancedProfessions.Arystokrata,
                AdvancedProfessions.LodowaCzarownica,
                AdvancedProfessions.Oficer,
            ),
            exit = listOf(
                AdvancedProfessions.Arystokrata,
                AdvancedProfessions.Kupiec,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.Urzednik,
            )
        ),

        AdvancedProfessions.Arcykaplan to Paths(
            entry = listOf(
                AdvancedProfessions.KaplanWojownik,
                AdvancedProfessions.Opat,
                AdvancedProfessions.WybraniecBozy,
            ),
            exit = listOf(
                AdvancedProfessions.Ambasador,
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.Opat,
                AdvancedProfessions.Psalterzysta,
                AdvancedProfessions.Uczony,
                AdvancedProfessions.Urzednik,
            )
        ),

        AdvancedProfessions.Arcymag to Paths(
            entry = listOf(
                AdvancedProfessions.MagisterRewizor,
                AdvancedProfessions.MistrzMagii,
            ),
            exit = listOf(
                AdvancedProfessions.Ambasador,
                AdvancedProfessions.MistrzGildii,
                AdvancedProfessions.Odkrywca,
            )
        ),

        AdvancedProfessions.Arcymistrz to Paths(
            entry = listOf(
                AdvancedProfessions.MistrzZakonny,
            ),
            exit = listOf(
                AdvancedProfessions.Arystokrata,
                AdvancedProfessions.Fechtmistrz,
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.Oficer,
            )
        ),

        AdvancedProfessions.ArcymistrzRun to Paths(
            entry = listOf(
                AdvancedProfessions.MistrzRun,
            ),
            exit = listOf(
                AdvancedProfessions.MistrzGildii,
                AdvancedProfessions.Oficer,
            )
        ),

        AdvancedProfessions.ArcymistrzZielarstwa to Paths(
            entry = listOf(
                AdvancedProfessions.MistrzZielarstwa,
            ),
            exit = listOf(
                AdvancedProfessions.Czarnoksieznik,
                AdvancedProfessions.Medyk,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        AdvancedProfessions.Artylerzysta to Paths(
            entry = listOf(
                AdvancedProfessions.Inzynier,
                AdvancedProfessions.Sierzant,
            ),
            exit = listOf(
                AdvancedProfessions.MistrzGildii,
                AdvancedProfessions.MistrzRzemiosla,
                BasicProfessions.Najemnik,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.Weteran,
            )
        ),

        AdvancedProfessions.Arystokrata to Paths(
            entry = listOf(
                AdvancedProfessions.Ambasador,
                AdvancedProfessions.Arcymistrz,
                AdvancedProfessions.Ataman,
                AdvancedProfessions.Dworak,
                AdvancedProfessions.Dworzanin,
                AdvancedProfessions.Kapitan,
                AdvancedProfessions.Krzyzowiec,
                AdvancedProfessions.MistrzZakonny,
                AdvancedProfessions.Rycerz,
                AdvancedProfessions.RycerzGraala,
                AdvancedProfessions.RycerzKrolestwa,
                AdvancedProfessions.RycerzProby,
                AdvancedProfessions.Urzednik,
            ),
            exit = listOf(
                AdvancedProfessions.Ambasador,
                AdvancedProfessions.Bezimienny,
                AdvancedProfessions.Kapitan,
                AdvancedProfessions.Krzyzowiec,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.Rycerz,
                AdvancedProfessions.RycerzPantery,
                AdvancedProfessions.RycerzPlonacegoSlonca,
                AdvancedProfessions.Uczony,
            )
        ),

        AdvancedProfessions.Astrolog to Paths(
            entry = listOf(
                BasicProfessions.Aptekarz,
                BasicProfessions.Dylentant,
                BasicProfessions.StrzyganskiMistyk,
                BasicProfessions.Szlachcic,
                BasicProfessions.UczenCzarodzieja,
                BasicProfessions.Zak,
                AdvancedProfessions.Medyk,
                AdvancedProfessions.MistrzMagii,
                AdvancedProfessions.Nawigator,
                AdvancedProfessions.Szarlatan,
                AdvancedProfessions.Uczony,
                AdvancedProfessions.WedrownyCzarodziej,
            ),
            exit = listOf(
                BasicProfessions.UczenCzarodzieja,
                AdvancedProfessions.Nawigator,
                AdvancedProfessions.Odkrywca,
                AdvancedProfessions.Szarlatan,
                AdvancedProfessions.Uczony,
            )
        ),

        AdvancedProfessions.Ataman to Paths(
            entry = listOf(
                BasicProfessions.Koczownik,
                AdvancedProfessions.Koniuszy,
                AdvancedProfessions.Oficer,
                BasicProfessions.Szlachcic,
                AdvancedProfessions.Weteran,
            ),
            exit = listOf(
                AdvancedProfessions.Arystokrata,
                AdvancedProfessions.Kaplan,
                AdvancedProfessions.Urzednik,
            )
        ),

        AdvancedProfessions.Bard to Paths(
            entry = listOf(
                BasicProfessions.Cyrkowiec,
                AdvancedProfessions.Psalterzysta,
            ),
            exit = listOf(
                AdvancedProfessions.Demagog,
                AdvancedProfessions.Psalterzysta,
                AdvancedProfessions.Rozbojnik,
                AdvancedProfessions.Szarlatan,
                AdvancedProfessions.Szpieg,
                BasicProfessions.Zak,
            )
        ),

        AdvancedProfessions.Bezimienny to Paths(
            entry = listOf(
                AdvancedProfessions.Arystokrata,
                AdvancedProfessions.Demagog,
                AdvancedProfessions.HersztBanitow,
                AdvancedProfessions.KsiazeZlodziei,
                AdvancedProfessions.Majordomus,
                AdvancedProfessions.PielgrzymBitewny,
                AdvancedProfessions.RycerzGraala,
                AdvancedProfessions.RycerzKrolestwa,
                AdvancedProfessions.RycerzProby,
                AdvancedProfessions.StarszyWioskowy,
                AdvancedProfessions.Urzednik,
                AdvancedProfessions.Weteran,
                AdvancedProfessions.Zbrojny,
            ),
            exit = listOf(
                AdvancedProfessions.Demagog,
                AdvancedProfessions.HersztBanitow,
                AdvancedProfessions.KsiazeZlodziei,
                AdvancedProfessions.Odkrywca,
                AdvancedProfessions.Rozbojnik,
                AdvancedProfessions.StarszyWioskowy,
            )
        ),

        AdvancedProfessions.BiczBozy to Paths(
            entry = listOf(
                AdvancedProfessions.Biczownik,
            ),
            exit = listOf(
                BasicProfessions.Akolita,
                AdvancedProfessions.Fechtmistrz,
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.Oprawca,
            )
        ),

        AdvancedProfessions.Biczownik to Paths(
            entry = listOf(
                BasicProfessions.Fanatyk,
                AdvancedProfessions.Kaplan,
                BasicProfessions.Pokutnik,
                AdvancedProfessions.WybraniecBozy,
                AdvancedProfessions.Zakonnik,
            ),
            exit = listOf(
                AdvancedProfessions.BiczBozy,
                AdvancedProfessions.Demagog,
                AdvancedProfessions.Kaplan,
                AdvancedProfessions.Oprawca,
                BasicProfessions.Pokutnik,
                AdvancedProfessions.Weteran,
                AdvancedProfessions.ZabojcaNieumarlych,
                BasicProfessions.Zolnierz,
            )
        ),

        AdvancedProfessions.Bosman to Paths(
            entry = listOf(
                BasicProfessions.Korsarz,
                BasicProfessions.Zeglarz,
                BasicProfessions.ZolnierzOkretowy,
            ),
            exit = listOf(
                AdvancedProfessions.Kapitan,
                AdvancedProfessions.Kupiec,
                AdvancedProfessions.Nawigator,
                AdvancedProfessions.Odkrywca,
            )
        ),

        AdvancedProfessions.Brygadzista to Paths(
            entry = listOf(
                BasicProfessions.Chlop,
                BasicProfessions.Doker,
                BasicProfessions.Rzemieslnik,
                BasicProfessions.Skryba,
            ),
            exit = listOf(
                AdvancedProfessions.Demagog,
                AdvancedProfessions.MistrzGildii,
                AdvancedProfessions.Paser,
                AdvancedProfessions.Reketer,
                AdvancedProfessions.Urzednik,
            )
        ),

        AdvancedProfessions.Budowniczy to Paths(
            entry = listOf(
                BasicProfessions.Chlop,
                BasicProfessions.Pacholek,
                BasicProfessions.Rzemieslnik,
            ),
            exit = listOf(
                AdvancedProfessions.Majordomus,
                AdvancedProfessions.Szpieg,
                AdvancedProfessions.Zbrojny,
            )
        ),

        AdvancedProfessions.Ceremoniarz to Paths(
            entry = listOf(
                BasicProfessions.Akolita,
                AdvancedProfessions.Dworzanin,
                AdvancedProfessions.Kaplan,
                BasicProfessions.Paz,
                BasicProfessions.Poslaniec,
                AdvancedProfessions.WybraniecBozy,
            ),
            exit = listOf(
                BasicProfessions.Giermek,
                AdvancedProfessions.Kaplan,
                AdvancedProfessions.Majordomus,
                AdvancedProfessions.Urzednik,
            )
        ),

        AdvancedProfessions.CzarnyStraznik to Paths(
            entry = listOf(
                BasicProfessions.Giermek,
                AdvancedProfessions.Kaplan,
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.LowcaWampirow,
                AdvancedProfessions.Rycerz,
                AdvancedProfessions.Sierzant,
            ),
            exit = listOf(
                AdvancedProfessions.Fechtmistrz,
                AdvancedProfessions.Kaplan,
                AdvancedProfessions.LowcaWampirow,
                AdvancedProfessions.MistrzZakonny,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.RycerzKruka,
                AdvancedProfessions.ZabojcaNieumarlych,
            )
        ),

        AdvancedProfessions.Czarnoksieznik to Paths(
            entry = listOf(
                AdvancedProfessions.ArcymistrzZielarstwa,
                AdvancedProfessions.Czarownik,
                AdvancedProfessions.Vitki,
            ),
            exit = listOf(
                BasicProfessions.Banita,
                BasicProfessions.Skryba,
                AdvancedProfessions.Szarlatan,
                BasicProfessions.UczenCzarodzieja,
                BasicProfessions.Wloczykij,
            )
        ),

        AdvancedProfessions.Czarownik to Paths(
            entry = listOf(
                BasicProfessions.Guslarz,
                AdvancedProfessions.LodowaPanna,
                BasicProfessions.UczennicaCzarownicy,
                AdvancedProfessions.Wiedzma,
                BasicProfessions.Wrozbita,
            ),
            exit = listOf(
                BasicProfessions.Banita,
                AdvancedProfessions.Czarnoksieznik,
                AdvancedProfessions.Szarlatan,
                BasicProfessions.UczenCzarodzieja,
                AdvancedProfessions.Vitki,
                BasicProfessions.Wloczykij,
            )
        ),

        AdvancedProfessions.Demagog to Paths(
            entry = listOf(
                BasicProfessions.Akolita,
                BasicProfessions.Bajarz,
                BasicProfessions.Banita,
                AdvancedProfessions.Bard,
                AdvancedProfessions.Bezimienny,
                AdvancedProfessions.Biczownik,
                AdvancedProfessions.Brygadzista,
                BasicProfessions.Gazeciarz,
                AdvancedProfessions.HersztBanitow,
                BasicProfessions.Kanciarz,
                AdvancedProfessions.Katecheta,
                AdvancedProfessions.KsiazeZlodziei,
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.LowcaWampirow,
                AdvancedProfessions.MistrzRzemiosla,
                AdvancedProfessions.Mistyk,
                AdvancedProfessions.Mnich,
                BasicProfessions.Pielgrzym,
                BasicProfessions.Podzegacz,
                BasicProfessions.Prawnik,
                BasicProfessions.Rozjemca,
                AdvancedProfessions.Pamflecista,
                AdvancedProfessions.Prelat,
                AdvancedProfessions.StarszyWioskowy,
                AdvancedProfessions.Szarlatan,
                BasicProfessions.Szuler,
                AdvancedProfessions.Urzednik,
                AdvancedProfessions.Wiedzma,
                AdvancedProfessions.WybraniecBozy,
                BasicProfessions.Zakapturzony,
                AdvancedProfessions.ZakapturzonyBrat,
                AdvancedProfessions.Zakonnik,
                BasicProfessions.Znachorka,
            ),
            exit = listOf(
                AdvancedProfessions.Bezimienny,
                AdvancedProfessions.HersztBanitow,
                AdvancedProfessions.KsiazeZlodziei,
                AdvancedProfessions.Pamflecista,
                BasicProfessions.Najemnik,
                AdvancedProfessions.Urzednik,
                AdvancedProfessions.ZakapturzonyBrat,
                AdvancedProfessions.Zakonnik,
            )
        ),

        AdvancedProfessions.Dworak to Paths(
            entry = listOf(
                AdvancedProfessions.Dworzanin,
                AdvancedProfessions.HersztBanitow,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.Sierzant,
                BasicProfessions.Szlachcic,
                AdvancedProfessions.Urzednik,
            ),
            exit = listOf(
                AdvancedProfessions.Arystokrata,
                AdvancedProfessions.Dworzanin,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.Skrytobojca,
                AdvancedProfessions.Szpieg,
            )
        ),

        AdvancedProfessions.Dworzanin to Paths(
            entry = listOf(
                BasicProfessions.Bajarz,
                BasicProfessions.Dylentant,
                AdvancedProfessions.Dworak,
                AdvancedProfessions.Herold,
                AdvancedProfessions.LodowaPanna,
                AdvancedProfessions.Rajtar,
                AdvancedProfessions.RycerzGraala,
                AdvancedProfessions.RycerzKrolestwa,
                AdvancedProfessions.RycerzProby,
                BasicProfessions.Szlachcic,
                AdvancedProfessions.Urzednik,
            ),
            exit = listOf(
                AdvancedProfessions.Arystokrata,
                AdvancedProfessions.Ceremoniarz,
                AdvancedProfessions.Dworak,
                AdvancedProfessions.Majordomus,
                AdvancedProfessions.Szarlatan,
                AdvancedProfessions.Szpieg,
                AdvancedProfessions.Urzednik,
                AdvancedProfessions.ZakapturzonyBrat,
                AdvancedProfessions.Zwadzca,
            )
        ),

        AdvancedProfessions.Egzorcysta to Paths(
            entry = listOf(
                AdvancedProfessions.Kaplan,
                AdvancedProfessions.WybraniecBozy,
            ),
            exit = listOf(
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.Uczony,
                AdvancedProfessions.WybraniecBozy,
            )
        ),

        AdvancedProfessions.Falszerz to Paths(
            entry = listOf(
                BasicProfessions.Kartograf,
                AdvancedProfessions.MistrzRzemiosla,
                BasicProfessions.Poslaniec,
                BasicProfessions.Przemytnik,
                BasicProfessions.Rzemieslnik,
                BasicProfessions.Zak,
            ),
            exit = listOf(
                AdvancedProfessions.MistrzRzemiosla,
                AdvancedProfessions.Paser,
                BasicProfessions.Rzemieslnik,
                BasicProfessions.Skryba,
                AdvancedProfessions.Szarlatan,
                AdvancedProfessions.Uczony,
                BasicProfessions.Zak,
            )
        ),

        AdvancedProfessions.Fechtmistrz to Paths(
            entry = listOf(
                AdvancedProfessions.Arcymistrz,
                AdvancedProfessions.BiczBozy,
                AdvancedProfessions.CzarnyStraznik,
                AdvancedProfessions.Lajdak,
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.MistrzZakonny,
                AdvancedProfessions.RycerzKruka,
                AdvancedProfessions.RycerzPantery,
                AdvancedProfessions.RycerzPlonacegoSlonca,
                AdvancedProfessions.Skrytobojca,
                AdvancedProfessions.Strzelec,
                AdvancedProfessions.Szampierz,
                AdvancedProfessions.Weteran,
                AdvancedProfessions.Wodz,
                AdvancedProfessions.Zwadzca,
            ),
            exit = listOf(
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.Sierzant,
                AdvancedProfessions.Skrytobojca,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        AdvancedProfessions.HandlarzNiewolnikami to Paths(
            entry = listOf(
                BasicProfessions.Grabiezca,
                BasicProfessions.Korsarz,
                AdvancedProfessions.Kupiec,
                AdvancedProfessions.Obszarnik,
            ),
            exit = listOf(
                AdvancedProfessions.HersztBanitow,
                AdvancedProfessions.Oficer,
                // BasicProfessions.WojownikChaosu,
                BasicProfessions.Zeglarz,
            )
        ),

        AdvancedProfessions.Herold to Paths(
            entry = listOf(
                BasicProfessions.Bajarz,
                BasicProfessions.Kadet,
                BasicProfessions.Paz,
                BasicProfessions.Poslaniec,
            ),
            exit = listOf(
                BasicProfessions.Cyrkowiec,
                AdvancedProfessions.Dworzanin,
                BasicProfessions.Giermek,
                AdvancedProfessions.Odkrywca,
                BasicProfessions.Podzegacz,
                AdvancedProfessions.Urzednik,
            )
        ),

        AdvancedProfessions.HersztBanitow to Paths(
            entry = listOf(
                AdvancedProfessions.Bezimienny,
                AdvancedProfessions.Demagog,
                AdvancedProfessions.HandlarzNiewolnikami,
                AdvancedProfessions.KsiazeZlodziei,
                AdvancedProfessions.LesnyDuch,
                AdvancedProfessions.MistrzCieni,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.Reketer,
                AdvancedProfessions.Rozbojnik,
                AdvancedProfessions.Skrytobojca,
                AdvancedProfessions.StarszyWioskowy,
                AdvancedProfessions.Tropiciel,
                AdvancedProfessions.Weteran,
                AdvancedProfessions.Zbrojny,
                AdvancedProfessions.Zwiadowca,
            ),
            exit = listOf(
                AdvancedProfessions.Bezimienny,
                AdvancedProfessions.Demagog,
                AdvancedProfessions.Dworak,
                AdvancedProfessions.KsiazeZlodziei,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.Skrytobojca,
                AdvancedProfessions.Tropiciel,
            )
        ),

        AdvancedProfessions.Husarz to Paths(
            entry = listOf(
                BasicProfessions.Chlop,
                AdvancedProfessions.Koniuszy,
                BasicProfessions.KozakKislevski,
                BasicProfessions.Przepatrywacz,
                BasicProfessions.Strielec,
                BasicProfessions.Szlachcic,
            ),
            exit = listOf(
                AdvancedProfessions.Koniuszy,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.Weteran,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        AdvancedProfessions.Inzynier to Paths(
            entry = listOf(
                BasicProfessions.Gornik,
                SkavenProfessions.Harcownik,
                AdvancedProfessions.MistrzRzemiosla,
                BasicProfessions.Rzemieslnik,
                BasicProfessions.StraznikTuneli,
                BasicProfessions.Zak,
            ),
            exit = listOf(
                AdvancedProfessions.Artylerzysta,
                SkavenProfessions.InzynierSpaczenia,
                AdvancedProfessions.MistrzGildii,
                AdvancedProfessions.MistrzRzemiosla,
                AdvancedProfessions.Odkrywca,
                AdvancedProfessions.Pamflecista,
                BasicProfessions.Przemytnik,
                AdvancedProfessions.Rajtar,
            )
        ),

        AdvancedProfessions.Kapitan to Paths(
            entry = listOf(
                AdvancedProfessions.Arystokrata,
                AdvancedProfessions.Bosman,
                AdvancedProfessions.Nawigator,
                AdvancedProfessions.Odkrywca,
            ),
            exit = listOf(
                AdvancedProfessions.Admiral,
                AdvancedProfessions.Arystokrata,
                AdvancedProfessions.Odkrywca,
                AdvancedProfessions.Szpieg,
                AdvancedProfessions.Uczony,
            )
        ),

        AdvancedProfessions.Kaplan to Paths(
            entry = listOf(
                AdvancedProfessions.AgentCalunu,
                BasicProfessions.Akolita,
                AdvancedProfessions.Ataman,
                AdvancedProfessions.Biczownik,
                AdvancedProfessions.Ceremoniarz,
                AdvancedProfessions.CzarnyStraznik,
                AdvancedProfessions.KaplanSwiecki,
                AdvancedProfessions.Mnich,
                AdvancedProfessions.Prelat,
                AdvancedProfessions.Psalterzysta,
                AdvancedProfessions.RycerzZielonegoPola,
                AdvancedProfessions.Zakonnik,
            ),
            exit = listOf(
                AdvancedProfessions.Biczownik,
                AdvancedProfessions.Ceremoniarz,
                AdvancedProfessions.CzarnyStraznik,
                AdvancedProfessions.Egzorcysta,
                AdvancedProfessions.KaplanSwiecki,
                AdvancedProfessions.KaplanWojownik,
                AdvancedProfessions.Katecheta,
                AdvancedProfessions.Majordomus,
                BasicProfessions.PoskramiaczNiedzwiedzi,
                AdvancedProfessions.Prelat,
                AdvancedProfessions.Psalterzysta,
                AdvancedProfessions.RycerzPlonacegoSlonca,
                AdvancedProfessions.SledczyVereny,
                AdvancedProfessions.Uczony,
                AdvancedProfessions.WybraniecBozy,
            )
        ),

        AdvancedProfessions.KaplanSwiecki to Paths(
            entry = listOf(
                BasicProfessions.Akolita,
                AdvancedProfessions.Kaplan,
                AdvancedProfessions.Zakonnik,
            ),
            exit = listOf(
                AdvancedProfessions.Kaplan,
                AdvancedProfessions.Prelat,
                AdvancedProfessions.Zakonnik,
            )
        ),

        AdvancedProfessions.KaplanWojownik to Paths(
            entry = listOf(
                AdvancedProfessions.Kaplan,
                AdvancedProfessions.WybraniecBozy,
            ),
            exit = listOf(
                AdvancedProfessions.Arcykaplan,
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.Rycerz,
            )
        ),

        AdvancedProfessions.Karczmarz to Paths(
            entry = listOf(
                BasicProfessions.Mieszczanin,
                AdvancedProfessions.Obszarnik,
                BasicProfessions.Rolnik,
                BasicProfessions.Sluga,
            ),
            exit = listOf(
                BasicProfessions.Banita,
                AdvancedProfessions.Kupiec,
                BasicProfessions.Mieszczanin,
                AdvancedProfessions.Paser,
                BasicProfessions.Przemytnik,
                BasicProfessions.Rolnik,
                BasicProfessions.Zakapturzony,
            )
        ),

        AdvancedProfessions.Katecheta to Paths(
            entry = listOf(
                BasicProfessions.Dylentant,
                BasicProfessions.Fanatyk,
                BasicProfessions.Skryba,
                BasicProfessions.Zak,
                AdvancedProfessions.Kaplan,
                AdvancedProfessions.Psalterzysta,
                AdvancedProfessions.Uczony,
                AdvancedProfessions.WybraniecBozy,
                AdvancedProfessions.Zakonnik,
            ),
            exit = listOf(
                BasicProfessions.Akolita,
                AdvancedProfessions.Demagog,
                BasicProfessions.Fanatyk,
                AdvancedProfessions.Uczony,
                AdvancedProfessions.Zakonnik,
            )
        ),

        AdvancedProfessions.Koniuszy to Paths(
            entry = listOf(
                BasicProfessions.Banita,
                BasicProfessions.Giermek,
                AdvancedProfessions.Husarz,
                BasicProfessions.Koczownik,
                BasicProfessions.Koniarz,
                AdvancedProfessions.KonnyLucznik,
                BasicProfessions.Najemnik,
                BasicProfessions.Poganiacz,
                BasicProfessions.Przepatrywacz,
                AdvancedProfessions.Rajtar,
                BasicProfessions.StraznikDrog,
                BasicProfessions.Szlachcic,
                AdvancedProfessions.Zwiadowca,
                BasicProfessions.Zolnierz,
            ),
            exit = listOf(
                AdvancedProfessions.Ataman,
                AdvancedProfessions.Husarz,
                BasicProfessions.Koniarz,
                AdvancedProfessions.KonnyLucznik,
                AdvancedProfessions.Kupiec,
                BasicProfessions.Poganiacz,
                AdvancedProfessions.Sierzant,
            )
        ),

        AdvancedProfessions.KonnyLucznik to Paths(
            entry = listOf(
                BasicProfessions.Chlop,
                BasicProfessions.Koczownik,
                AdvancedProfessions.Koniuszy,
                BasicProfessions.Szlachcic,
            ),
            exit = listOf(
                BasicProfessions.Koczownik,
                AdvancedProfessions.Koniuszy,
                BasicProfessions.Najemnik,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.Strzelec,
                AdvancedProfessions.Weteran,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        AdvancedProfessions.KowalRun to Paths(
            entry = listOf(
                BasicProfessions.CzeladnikRun,
            ),
            exit = listOf(
                AdvancedProfessions.MistrzRun,
                BasicProfessions.Tarczownik,
                AdvancedProfessions.Uczony,
            )
        ),

        AdvancedProfessions.Krzyzowiec to Paths(
            entry = listOf(
                AdvancedProfessions.Arystokrata,
                AdvancedProfessions.Rycerz,
                AdvancedProfessions.Sierzant,
                AdvancedProfessions.Weteran,
            ),
            exit = listOf(
                BasicProfessions.Akolita,
                AdvancedProfessions.Arystokrata,
                AdvancedProfessions.MistrzZakonny,
                AdvancedProfessions.Odkrywca,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.Szampierz,
                AdvancedProfessions.Weteran,
            )
        ),

        AdvancedProfessions.KsiazeZlodziei to Paths(
            entry = listOf(
                AdvancedProfessions.Bezimienny,
                AdvancedProfessions.Demagog,
                AdvancedProfessions.HersztBanitow,
                AdvancedProfessions.Majordomus,
                AdvancedProfessions.MistrzCieni,
                AdvancedProfessions.MistrzGildii,
                AdvancedProfessions.Paser,
                AdvancedProfessions.Urzednik,
                AdvancedProfessions.Wlamywacz,
                AdvancedProfessions.ZakapturzonyBrat,
            ),
            exit = listOf(
                AdvancedProfessions.Bezimienny,
                AdvancedProfessions.Demagog,
                AdvancedProfessions.HersztBanitow,
                AdvancedProfessions.MistrzCieni,
                AdvancedProfessions.Urzednik,
                AdvancedProfessions.ZakapturzonyBrat,
            )
        ),

        AdvancedProfessions.Kupiec to Paths(
            entry = listOf(
                AdvancedProfessions.Ambasador,
                BasicProfessions.Aptekarz,
                AdvancedProfessions.Bosman,
                BasicProfessions.Doker,
                AdvancedProfessions.Karczmarz,
                BasicProfessions.Koniarz,
                AdvancedProfessions.Koniuszy,
                AdvancedProfessions.Majordomus,
                BasicProfessions.Mieszczanin,
                AdvancedProfessions.MistrzRzemiosla,
                AdvancedProfessions.Obszarnik,
                AdvancedProfessions.Odkrywca,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.Pamflecista,
                BasicProfessions.PoborcaPodatkowy,
                BasicProfessions.PoganiaczMulow,
                BasicProfessions.Prawnik,
                BasicProfessions.Rolnik,
                BasicProfessions.Rybak,
                BasicProfessions.RzecznikRodu,
                BasicProfessions.Rzemieslnik,
                AdvancedProfessions.Uczony,
            ),
            exit = listOf(
                AdvancedProfessions.HandlarzNiewolnikami,
                AdvancedProfessions.MistrzGildii,
                BasicProfessions.Ochotnik,
                AdvancedProfessions.Reketer,
                BasicProfessions.Rolnik,
                AdvancedProfessions.Szpieg,
                AdvancedProfessions.Urzednik,
            )
        ),

        AdvancedProfessions.Lajdak to Paths(
            entry = listOf(
                BasicProfessions.Bajarz,
                BasicProfessions.Dylentant,
                BasicProfessions.Kanciarz,
                BasicProfessions.Wloczykij,
            ),
            exit = listOf(
                BasicProfessions.Banita,
                AdvancedProfessions.Fechtmistrz,
                AdvancedProfessions.Paser,
                AdvancedProfessions.Szarlatan,
                AdvancedProfessions.Szpieg,
            )
        ),

        AdvancedProfessions.LesnyDuch to Paths(
            entry = listOf(
                AdvancedProfessions.Zwiadowca,
            ),
            exit = listOf(
                AdvancedProfessions.HersztBanitow,
                AdvancedProfessions.LowcaWampirow,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.Strzelec,
            )
        ),

        AdvancedProfessions.LodowaCzarownica to Paths(
            entry = listOf(
                AdvancedProfessions.LodowaPanna,
            ),
            exit = listOf(
                AdvancedProfessions.Ambasador,
                AdvancedProfessions.Oficer,
            )
        ),

        AdvancedProfessions.LodowaPanna to Paths(
            entry = listOf(
                BasicProfessions.UczennicaCzarownicy,
            ),
            exit = listOf(
                AdvancedProfessions.Czarownik,
                AdvancedProfessions.Dworzanin,
                AdvancedProfessions.LodowaCzarownica,
                AdvancedProfessions.Sierzant,
                AdvancedProfessions.Weteran,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        AdvancedProfessions.LowcaCzarownic to Paths(
            entry = listOf(
                AdvancedProfessions.AgentCalunu,
                AdvancedProfessions.Arcykaplan,
                AdvancedProfessions.Arcymistrz,
                AdvancedProfessions.BiczBozy,
                AdvancedProfessions.Egzorcysta,
                AdvancedProfessions.Fechtmistrz,
                AdvancedProfessions.KaplanWojownik,
                AdvancedProfessions.LowcaWampirow,
                AdvancedProfessions.MagisterRewizor,
                AdvancedProfessions.MistrzZakonny,
                AdvancedProfessions.RycerzKruka,
                AdvancedProfessions.RycerzPantery,
                AdvancedProfessions.Skrytobojca,
                AdvancedProfessions.Szampierz,
                AdvancedProfessions.SledczyVereny,
                AdvancedProfessions.StrozPrawa,
                AdvancedProfessions.WybraniecBozy,
                AdvancedProfessions.ZakapturzonyBrat,
            ),
            exit = listOf(
                BasicProfessions.Akolita,
                AdvancedProfessions.CzarnyStraznik,
                AdvancedProfessions.Demagog,
                AdvancedProfessions.Fechtmistrz,
                AdvancedProfessions.MistrzZakonny,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.RycerzPantery,
                AdvancedProfessions.SledczyVereny,
                AdvancedProfessions.ZabojcaNieumarlych,
                AdvancedProfessions.ZakapturzonyBrat,
            )
        ),

        AdvancedProfessions.LowcaWampirow to Paths(
            entry = listOf(
                AdvancedProfessions.AgentCalunu,
                AdvancedProfessions.CzarnyStraznik,
                BasicProfessions.Grabaz,
                BasicProfessions.HienaCmentarna,
                AdvancedProfessions.LesnyDuch,
                BasicProfessions.LowcaNagrod,
                AdvancedProfessions.Rycerz,
                BasicProfessions.StraznikPol,
                AdvancedProfessions.Zwiadowca,
            ),
            exit = listOf(
                AdvancedProfessions.AgentCalunu,
                BasicProfessions.Akolita,
                AdvancedProfessions.CzarnyStraznik,
                AdvancedProfessions.Demagog,
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.Rycerz,
                AdvancedProfessions.Strzelec,
                AdvancedProfessions.ZabojcaNieumarlych,
            )
        ),

        AdvancedProfessions.MagisterRewizor to Paths(
            entry = listOf(
                AdvancedProfessions.MistrzMagii,
                AdvancedProfessions.WedrownyCzarodziej,
            ),
            exit = listOf(
                AdvancedProfessions.Arcymag,
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.MistrzMagii,
                AdvancedProfessions.Szpieg,
            )
        ),

        AdvancedProfessions.Majordomus to Paths(
            entry = listOf(
                AdvancedProfessions.Budowniczy,
                AdvancedProfessions.Ceremoniarz,
                AdvancedProfessions.Dworzanin,
                AdvancedProfessions.Kaplan,
                AdvancedProfessions.Mnich,
                BasicProfessions.Paz,
                BasicProfessions.Rolnik,
                AdvancedProfessions.StarszyWioskowy,
                AdvancedProfessions.Uczony,
                AdvancedProfessions.Urzednik,
            ),
            exit = listOf(
                AdvancedProfessions.Bezimienny,
                AdvancedProfessions.KsiazeZlodziei,
                AdvancedProfessions.Kupiec,
                AdvancedProfessions.Paser,
                BasicProfessions.Szlachcic,
            )
        ),

        AdvancedProfessions.Medyk to Paths(
            entry = listOf(
                BasicProfessions.Aptekarz,
                AdvancedProfessions.ArcymistrzZielarstwa,
                BasicProfessions.Balsamista,
                BasicProfessions.Cyrulik,
                SkavenProfessions.MistrzCialoksztaltowania,
                AdvancedProfessions.Mnich,
                AdvancedProfessions.Oprawca,
                AdvancedProfessions.Uczony,
                BasicProfessions.Zak,
            ),
            exit = listOf(
                AdvancedProfessions.Astrolog,
                AdvancedProfessions.MistrzGildii,
                AdvancedProfessions.Mnich,
                AdvancedProfessions.Szpieg,
                AdvancedProfessions.Uczony,
                AdvancedProfessions.Zakonnik,
            )
        ),

        AdvancedProfessions.MistrzCieni to Paths(
            entry = listOf(
                AdvancedProfessions.KsiazeZlodziei,
                SkavenProfessions.MistrzSkrytobojca,
                AdvancedProfessions.Paser,
                AdvancedProfessions.Reketer,
                AdvancedProfessions.Rozbojnik,
                AdvancedProfessions.Szpieg,
                AdvancedProfessions.Wlamywacz,
                AdvancedProfessions.ZakapturzonyBrat,
            ),
            exit = listOf(
                AdvancedProfessions.HersztBanitow,
                AdvancedProfessions.KsiazeZlodziei,
                AdvancedProfessions.Odkrywca,
                AdvancedProfessions.Strzelec,
                AdvancedProfessions.ZakapturzonyBrat,
            )
        ),

        AdvancedProfessions.MistrzGildii to Paths(
            entry = listOf(
                AdvancedProfessions.Admiral,
                AdvancedProfessions.Arcymag,
                AdvancedProfessions.ArcymistrzRun,
                AdvancedProfessions.Artylerzysta,
                AdvancedProfessions.Brygadzista,
                AdvancedProfessions.Inzynier,
                AdvancedProfessions.Kupiec,
                AdvancedProfessions.Medyk,
                AdvancedProfessions.MistrzRzemiosla,
                BasicProfessions.Prawnik,
            ),
            exit = listOf(
                AdvancedProfessions.KsiazeZlodziei,
                AdvancedProfessions.Reketer,
                AdvancedProfessions.Urzednik,
            )
        ),

        AdvancedProfessions.MistrzMagii to Paths(
            entry = listOf(
                AdvancedProfessions.MagisterRewizor,
                SkavenProfessions.SkavenskiZaklinacz,
                AdvancedProfessions.WedrownyCzarodziej,
            ),
            exit = listOf(
                AdvancedProfessions.Arcymag,
                AdvancedProfessions.Astrolog,
                AdvancedProfessions.MagisterRewizor,
                AdvancedProfessions.Odkrywca,
                AdvancedProfessions.Uczony,
            )
        ),

        AdvancedProfessions.MistrzRun to Paths(
            entry = listOf(
                AdvancedProfessions.KowalRun,
            ),
            exit = listOf(
                AdvancedProfessions.ArcymistrzRun,
                AdvancedProfessions.Uczony,
                AdvancedProfessions.Weteran,
            )
        ),

        AdvancedProfessions.MistrzRzemiosla to Paths(
            entry = listOf(
                BasicProfessions.Aptekarz,
                AdvancedProfessions.Artylerzysta,
                AdvancedProfessions.Falszerz,
                AdvancedProfessions.Inzynier,
                AdvancedProfessions.Nawigator,
                AdvancedProfessions.Obszarnik,
                BasicProfessions.Ochotnik,
                BasicProfessions.Rzemieslnik,
            ),
            exit = listOf(
                BasicProfessions.CzeladnikRun,
                AdvancedProfessions.Demagog,
                AdvancedProfessions.Falszerz,
                AdvancedProfessions.Inzynier,
                AdvancedProfessions.Kupiec,
                AdvancedProfessions.MistrzGildii,
                BasicProfessions.Ochotnik,
            )
        ),

        AdvancedProfessions.MistrzZakonny to Paths(
            entry = listOf(
                AdvancedProfessions.CzarnyStraznik,
                AdvancedProfessions.Krzyzowiec,
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.Rycerz,
                AdvancedProfessions.RycerzKruka,
                AdvancedProfessions.RycerzPantery,
                AdvancedProfessions.RycerzPlonacegoSlonca,
            ),
            exit = listOf(
                AdvancedProfessions.Arcymistrz,
                AdvancedProfessions.Arystokrata,
                AdvancedProfessions.Fechtmistrz,
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.RycerzKruka,
            )
        ),

        AdvancedProfessions.MistrzZielarstwa to Paths(
            entry = listOf(
                BasicProfessions.UczenZielarza,
            ),
            exit = listOf(
                BasicProfessions.Rzemieslnik,
                AdvancedProfessions.ArcymistrzZielarstwa,
                AdvancedProfessions.Uczony,
                AdvancedProfessions.Szpieg,
                AdvancedProfessions.Wiedzma,
            )
        ),

        AdvancedProfessions.Mistyk to Paths(
            entry = listOf(
                BasicProfessions.Cenobita,
                BasicProfessions.Pustelnik,
            ),
            exit = listOf(
                AdvancedProfessions.Demagog,
                BasicProfessions.Guslarz,
                BasicProfessions.Kanciarz,
                AdvancedProfessions.Szarlatan,
            )
        ),

        AdvancedProfessions.Mnich to Paths(
            entry = listOf(
                BasicProfessions.Akolita,
                AdvancedProfessions.Medyk,
                BasicProfessions.Skryba,
                AdvancedProfessions.Uczony,
                AdvancedProfessions.Zakonnik,
                BasicProfessions.Zak,
            ),
            exit = listOf(
                AdvancedProfessions.Demagog,
                BasicProfessions.Fanatyk,
                AdvancedProfessions.Kaplan,
                AdvancedProfessions.Majordomus,
                AdvancedProfessions.Medyk,
                AdvancedProfessions.Opat,
                AdvancedProfessions.Psalterzysta,
                AdvancedProfessions.Uczony,
                AdvancedProfessions.Zakonnik,
            )
        ),

        AdvancedProfessions.Nawigator to Paths(
            entry = listOf(
                BasicProfessions.Dylentant,
                BasicProfessions.Flisak,
                BasicProfessions.Kartograf,
                BasicProfessions.Korsarz,
                BasicProfessions.Rybak,
                BasicProfessions.Skryba,
                BasicProfessions.Wielorybnik,
                BasicProfessions.Zeglarz,
                AdvancedProfessions.Astrolog,
                AdvancedProfessions.Bosman,
            ),
            exit = listOf(
                AdvancedProfessions.Astrolog,
                AdvancedProfessions.Kapitan,
                BasicProfessions.Kartograf,
                AdvancedProfessions.MistrzRzemiosla,
                AdvancedProfessions.Odkrywca,
                AdvancedProfessions.Uczony,
            )
        ),

        AdvancedProfessions.Obszarnik to Paths(
            entry = listOf(
                BasicProfessions.Mieszczanin,
                BasicProfessions.Rybak,
                BasicProfessions.Rzemieslnik,
                BasicProfessions.Skald,
                BasicProfessions.Wielorybnik,
                BasicProfessions.Woj,
            ),
            exit = listOf(
                BasicProfessions.Grabiezca,
                AdvancedProfessions.HandlarzNiewolnikami,
                AdvancedProfessions.Karczmarz,
                AdvancedProfessions.Kupiec,
                AdvancedProfessions.MistrzRzemiosla,
            )
        ),

        AdvancedProfessions.Opat to Paths(
            entry = listOf(
                AdvancedProfessions.Arcykaplan,
                AdvancedProfessions.Mnich,
                AdvancedProfessions.Uczony,
                AdvancedProfessions.WybraniecBozy,
            ),
            exit = listOf(
                AdvancedProfessions.Arcykaplan,
                AdvancedProfessions.Uczony,
            )
        ),

        AdvancedProfessions.Odkrywca to Paths(
            entry = listOf(
                AdvancedProfessions.Admiral,
                AdvancedProfessions.Astrolog,
                AdvancedProfessions.Arcymag,
                AdvancedProfessions.Bezimienny,
                AdvancedProfessions.Bosman,
                AdvancedProfessions.Herold,
                AdvancedProfessions.Inzynier,
                AdvancedProfessions.Kapitan,
                BasicProfessions.Kartograf,
                AdvancedProfessions.Krzyzowiec,
                AdvancedProfessions.MistrzCieni,
                AdvancedProfessions.MistrzMagii,
                AdvancedProfessions.Nawigator,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.RycerzGraala,
                AdvancedProfessions.RycerzKrolestwa,
                AdvancedProfessions.RycerzPlonacegoSlonca,
                AdvancedProfessions.RycerzProby,
                BasicProfessions.StraznikTuneli,
                AdvancedProfessions.Szpieg,
                AdvancedProfessions.Tropiciel,
                AdvancedProfessions.Uczony,
                AdvancedProfessions.Zwiadowca,
            ),
            exit = listOf(
                AdvancedProfessions.Kapitan,
                AdvancedProfessions.Kupiec,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.Szpieg,
                AdvancedProfessions.Tropiciel,
            )
        ),

        AdvancedProfessions.Oficer to Paths(
            entry = listOf(
                AdvancedProfessions.Ambasador,
                AdvancedProfessions.Arcymistrz,
                AdvancedProfessions.ArcymistrzRun,
                AdvancedProfessions.Artylerzysta,
                AdvancedProfessions.Arystokrata,
                AdvancedProfessions.CzarnyStraznik,
                AdvancedProfessions.Dworak,
                AdvancedProfessions.HandlarzNiewolnikami,
                AdvancedProfessions.HersztBanitow,
                AdvancedProfessions.Husarz,
                AdvancedProfessions.KonnyLucznik,
                AdvancedProfessions.Krzyzowiec,
                AdvancedProfessions.LesnyDuch,
                AdvancedProfessions.LodowaCzarownica,
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.MistrzZakonny,
                AdvancedProfessions.Odkrywca,
                AdvancedProfessions.Rycerz,
                AdvancedProfessions.RycerzGraala,
                AdvancedProfessions.RycerzKrolestwa,
                AdvancedProfessions.RycerzKruka,
                AdvancedProfessions.RycerzPantery,
                AdvancedProfessions.RycerzPlonacegoSlonca,
                AdvancedProfessions.RycerzProby,
                AdvancedProfessions.Sierzant,
                AdvancedProfessions.Tropiciel,
                AdvancedProfessions.Wodz,
            ),
            exit = listOf(
                AdvancedProfessions.Ambasador,
                AdvancedProfessions.Ataman,
                AdvancedProfessions.Dworak,
                AdvancedProfessions.HersztBanitow,
                AdvancedProfessions.Kupiec,
                AdvancedProfessions.Odkrywca,
                BasicProfessions.Podzegacz,
                AdvancedProfessions.Urzednik,
            )
        ),

        AdvancedProfessions.Oprawca to Paths(
            entry = listOf(
                AdvancedProfessions.BiczBozy,
                AdvancedProfessions.Biczownik,
                BasicProfessions.Cyrulik,
                SkavenProfessions.CzcicielZarazy,
                BasicProfessions.Czekista,
                SkavenProfessions.InzynierSpaczenia,
                BasicProfessions.Ochroniarz,
                BasicProfessions.Oprych,
                BasicProfessions.StraznikWiezienny,
                SkavenProfessions.Szponowlad,
            ),
            exit = listOf(
                AdvancedProfessions.Medyk,
                AdvancedProfessions.Reketer,
                BasicProfessions.Zlodziej,
            )
        ),

        AdvancedProfessions.Pamflecista to Paths(
            entry = listOf(
                BasicProfessions.Cyrkowiec,
                BasicProfessions.Gazeciarz,
                BasicProfessions.Mieszczanin,
                BasicProfessions.Podzegacz,
                BasicProfessions.Poslaniec,
                BasicProfessions.Rzemieslnik,
                BasicProfessions.Skryba,
                BasicProfessions.Zak,
                AdvancedProfessions.Demagog,
                AdvancedProfessions.Inzynier,
                AdvancedProfessions.Uczony,
            ),
            exit = listOf(
                AdvancedProfessions.Demagog,
                AdvancedProfessions.Kupiec,
                AdvancedProfessions.Uczony,
                AdvancedProfessions.Urzednik,
            )
        ),

        AdvancedProfessions.Paser to Paths(
            entry = listOf(
                AdvancedProfessions.Brygadzista,
                BasicProfessions.BylySkazaniec,
                AdvancedProfessions.Falszerz,
                BasicProfessions.HienaCmentarna,
                AdvancedProfessions.Karczmarz,
                AdvancedProfessions.Lajdak,
                AdvancedProfessions.Majordomus,
                BasicProfessions.Mieszczanin,
                BasicProfessions.PorywaczZwlok,
                BasicProfessions.Przemytnik,
                AdvancedProfessions.Reketer,
                BasicProfessions.Smieciarz,
                AdvancedProfessions.Wlamywacz,
                BasicProfessions.Zlodziej,
            ),
            exit = listOf(
                AdvancedProfessions.KsiazeZlodziei,
                AdvancedProfessions.MistrzCieni,
                AdvancedProfessions.Reketer,
                AdvancedProfessions.Szarlatan,
            )
        ),

        AdvancedProfessions.PielgrzymBitewny to Paths(
            entry = listOf(
                BasicProfessions.PielgrzymGraala,
            ),
            exit = listOf(
                AdvancedProfessions.Bezimienny,
                AdvancedProfessions.Sierzant,
                AdvancedProfessions.Weteran,
                BasicProfessions.Wloczykij,
            )
        ),

        AdvancedProfessions.Prelat to Paths(
            entry = listOf(
                AdvancedProfessions.Kaplan,
                AdvancedProfessions.KaplanSwiecki,
                AdvancedProfessions.Zakonnik,
            ),
            exit = listOf(
                AdvancedProfessions.Demagog,
                AdvancedProfessions.Kaplan,
                AdvancedProfessions.Urzednik,
                AdvancedProfessions.Zakonnik,
            )
        ),

        AdvancedProfessions.Prawiedzma to Paths(
            entry = listOf(
                AdvancedProfessions.Wiedzma,
            ),
            exit = listOf(
            )
        ),

        AdvancedProfessions.Psalterzysta to Paths(
            entry = listOf(
                BasicProfessions.Akolita,
                AdvancedProfessions.Arcykaplan,
                AdvancedProfessions.Bard,
                BasicProfessions.Cyrkowiec,
                BasicProfessions.Fanatyk,
                AdvancedProfessions.Kaplan,
                AdvancedProfessions.Mnich,
                AdvancedProfessions.WybraniecBozy,
            ),
            exit = listOf(
                BasicProfessions.Akolita,
                AdvancedProfessions.Bard,
                BasicProfessions.Cyrkowiec,
                BasicProfessions.Fanatyk,
                AdvancedProfessions.Kaplan,
                AdvancedProfessions.Katecheta,
            )
        ),

        AdvancedProfessions.Rajtar to Paths(
            entry = listOf(
                SkavenProfessions.Harcownik,
                AdvancedProfessions.Inzynier,
                BasicProfessions.Kadet,
                BasicProfessions.Szlachcic,
            ),
            exit = listOf(
                AdvancedProfessions.Dworzanin,
                SkavenProfessions.InzynierSpaczenia,
                AdvancedProfessions.Koniuszy,
                AdvancedProfessions.Rycerz,
                AdvancedProfessions.Sierzant,
                AdvancedProfessions.Weteran,
                AdvancedProfessions.Zwadzca,
            )
        ),

        AdvancedProfessions.Reketer to Paths(
            entry = listOf(
                AdvancedProfessions.Brygadzista,
                BasicProfessions.BylySkazaniec,
                BasicProfessions.Czekista,
                AdvancedProfessions.Kupiec,
                AdvancedProfessions.MistrzGildii,
                BasicProfessions.Ochroniarz,
                AdvancedProfessions.Oprawca,
                BasicProfessions.Oprych,
                AdvancedProfessions.Paser,
                BasicProfessions.Rzezimieszek,
                BasicProfessions.Straznik,
                AdvancedProfessions.Szpieg,
                AdvancedProfessions.Urzednik,
                AdvancedProfessions.Wlamywacz,
                BasicProfessions.Zarzadca,
            ),
            exit = listOf(
                AdvancedProfessions.HersztBanitow,
                AdvancedProfessions.MistrzCieni,
                AdvancedProfessions.Paser,
                AdvancedProfessions.Urzednik,
            )
        ),

        AdvancedProfessions.Rozbojnik to Paths(
            entry = listOf(
                BasicProfessions.Banita,
                AdvancedProfessions.Bard,
                AdvancedProfessions.Bezimienny,
                BasicProfessions.BylySkazaniec,
                BasicProfessions.Mytnik,
                BasicProfessions.Poganiacz,
                BasicProfessions.PoganiaczMulow,
                BasicProfessions.Przepatrywacz,
                BasicProfessions.Przewoznik,
                BasicProfessions.StraznikDrog,
                BasicProfessions.SzermierzEstalijski,
                BasicProfessions.Szuler,
                BasicProfessions.Woznica,
                AdvancedProfessions.Zwadzca,
            ),
            exit = listOf(
                AdvancedProfessions.HersztBanitow,
                AdvancedProfessions.MistrzCieni,
                BasicProfessions.Podzegacz,
                AdvancedProfessions.Sierzant,
                AdvancedProfessions.Zwadzca,
            )
        ),

        AdvancedProfessions.Rycerz to Paths(
            entry = listOf(
                AdvancedProfessions.Arystokrata,
                BasicProfessions.Giermek,
                AdvancedProfessions.KaplanWojownik,
                AdvancedProfessions.LowcaWampirow,
                AdvancedProfessions.Rajtar,
                AdvancedProfessions.Sierzant,
            ),
            exit = listOf(
                BasicProfessions.Akolita,
                AdvancedProfessions.Arystokrata,
                BasicProfessions.BlednyRycerz,
                AdvancedProfessions.CzarnyStraznik,
                AdvancedProfessions.Krzyzowiec,
                AdvancedProfessions.LowcaWampirow,
                AdvancedProfessions.MistrzZakonny,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.RycerzKruka,
                AdvancedProfessions.RycerzPantery,
                AdvancedProfessions.RycerzPlonacegoSlonca,
            )
        ),

        AdvancedProfessions.RycerzGraala to Paths(
            entry = listOf(
                AdvancedProfessions.RycerzProby,
            ),
            exit = listOf(
                AdvancedProfessions.Arystokrata,
                AdvancedProfessions.Bezimienny,
                AdvancedProfessions.Dworzanin,
                AdvancedProfessions.Odkrywca,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.Urzednik,
            )
        ),

        AdvancedProfessions.RycerzKrolestwa to Paths(
            entry = listOf(
                BasicProfessions.BlednyRycerz,
            ),
            exit = listOf(
                AdvancedProfessions.Arystokrata,
                AdvancedProfessions.Bezimienny,
                AdvancedProfessions.Dworzanin,
                AdvancedProfessions.Odkrywca,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.RycerzProby,
                AdvancedProfessions.Urzednik,
            )
        ),

        AdvancedProfessions.RycerzKruka to Paths(
            entry = listOf(
                AdvancedProfessions.CzarnyStraznik,
                AdvancedProfessions.MistrzZakonny,
                AdvancedProfessions.Rycerz,
            ),
            exit = listOf(
                AdvancedProfessions.Fechtmistrz,
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.MistrzZakonny,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.ZabojcaNieumarlych,
            )
        ),

        AdvancedProfessions.RycerzPantery to Paths(
            entry = listOf(
                AdvancedProfessions.Arystokrata,
                BasicProfessions.Giermek,
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.Rycerz,
                AdvancedProfessions.Sierzant,
            ),
            exit = listOf(
                AdvancedProfessions.Fechtmistrz,
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.MistrzZakonny,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.Weteran,
            )
        ),

        AdvancedProfessions.RycerzProby to Paths(
            entry = listOf(
                AdvancedProfessions.RycerzKrolestwa,
            ),
            exit = listOf(
                AdvancedProfessions.Arystokrata,
                AdvancedProfessions.Bezimienny,
                AdvancedProfessions.Dworzanin,
                AdvancedProfessions.Odkrywca,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.RycerzGraala,
                AdvancedProfessions.Urzednik,
            )
        ),

        AdvancedProfessions.RycerzZielonegoPola to Paths(
            entry = listOf(
                BasicProfessions.Akolita,
                BasicProfessions.Lesnik,
                BasicProfessions.Lowca,
                BasicProfessions.Najemnik,
                BasicProfessions.Ochotnik,
                BasicProfessions.Przepatrywacz,
                BasicProfessions.Zolnierz,
            ),
            exit = listOf(
                AdvancedProfessions.Kaplan,
                AdvancedProfessions.Weteran,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        AdvancedProfessions.Sierzant to Paths(
            entry = listOf(
                BasicProfessions.BerserkerZNorski,
                BasicProfessions.Czekista,
                AdvancedProfessions.Fechtmistrz,
                BasicProfessions.Giermek,
                BasicProfessions.Kadet,
                AdvancedProfessions.Koniuszy,
                BasicProfessions.KozakKislevski,
                AdvancedProfessions.LodowaPanna,
                BasicProfessions.Najemnik,
                BasicProfessions.Ochotnik,
                AdvancedProfessions.PielgrzymBitewny,
                AdvancedProfessions.Rajtar,
                AdvancedProfessions.Rozbojnik,
                AdvancedProfessions.Skrytobojca,
                BasicProfessions.Straznik,
                BasicProfessions.StraznikDrog,
                BasicProfessions.StraznikKanalow,
                BasicProfessions.StraznikRzeczny,
                BasicProfessions.StraznikTuneli,
                BasicProfessions.Strielec,
                AdvancedProfessions.Strzelec,
                AdvancedProfessions.Szampierz,
                BasicProfessions.Tarczownik,
                AdvancedProfessions.Weteran,
                AdvancedProfessions.Zbrojny,
                AdvancedProfessions.Zwadzca,
                AdvancedProfessions.Zwiadowca,
                BasicProfessions.Zolnierz,
                BasicProfessions.ZolnierzOkretowy,
            ),
            exit = listOf(
                AdvancedProfessions.Artylerzysta,
                AdvancedProfessions.CzarnyStraznik,
                AdvancedProfessions.Dworak,
                AdvancedProfessions.Krzyzowiec,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.Rycerz,
                AdvancedProfessions.RycerzPantery,
                AdvancedProfessions.RycerzPlonacegoSlonca,
                AdvancedProfessions.Szampierz,
                AdvancedProfessions.Zwadzca,
            )
        ),

        AdvancedProfessions.Skrytobojca to Paths(
            entry = listOf(
                AdvancedProfessions.Dworak,
                AdvancedProfessions.Fechtmistrz,
                AdvancedProfessions.HersztBanitow,
                AdvancedProfessions.Strzelec,
                AdvancedProfessions.Szampierz,
                AdvancedProfessions.Szpieg,
                AdvancedProfessions.ZakapturzonyBrat,
                AdvancedProfessions.Zwadzca,
            ),
            exit = listOf(
                AdvancedProfessions.Fechtmistrz,
                AdvancedProfessions.HersztBanitow,
                AdvancedProfessions.LowcaCzarownic,
                BasicProfessions.Kanciarz,
                AdvancedProfessions.Sierzant,
                AdvancedProfessions.ZakapturzonyBrat,
            )
        ),

        AdvancedProfessions.SledczyVereny to Paths(
            entry = listOf(
                BasicProfessions.Akolita,
                BasicProfessions.Dylentant,
                AdvancedProfessions.Kaplan,
                AdvancedProfessions.LowcaCzarownic,
                BasicProfessions.LowcaNagrod,
                BasicProfessions.Straznik,
                BasicProfessions.StraznikDrog,
                BasicProfessions.StraznikRzeczny,
                AdvancedProfessions.Szpieg,
                AdvancedProfessions.Uczony,
                AdvancedProfessions.Wlamywacz,
                BasicProfessions.Zlodziej,
            ),
            exit = listOf(
                BasicProfessions.Akolita,
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.Szpieg,
                AdvancedProfessions.Uczony,
            )
        ),

        AdvancedProfessions.StarszyWioskowy to Paths(
            entry = listOf(
                BasicProfessions.Bagiennik,
                AdvancedProfessions.Bezimienny,
                BasicProfessions.Rozjemca,
                BasicProfessions.ZabiaPani,
                AdvancedProfessions.Zbrojny,
            ),
            exit = listOf(
                AdvancedProfessions.Bezimienny,
                AdvancedProfessions.Demagog,
                AdvancedProfessions.HersztBanitow,
                AdvancedProfessions.Majordomus,
                AdvancedProfessions.Urzednik,
            )
        ),

        AdvancedProfessions.StrozPrawa to Paths(
            entry = listOf(
                BasicProfessions.Lowca,
                BasicProfessions.LowcaNagrod,
                BasicProfessions.Straznik,
                BasicProfessions.StraznikDrog,
            ),
            exit = listOf(
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.Szpieg,
            )
        ),

        AdvancedProfessions.Strzelec to Paths(
            entry = listOf(
                AdvancedProfessions.KonnyLucznik,
                AdvancedProfessions.LesnyDuch,
                BasicProfessions.Lowca,
                BasicProfessions.LowcaNagrod,
                AdvancedProfessions.LowcaWampirow,
                AdvancedProfessions.MistrzCieni,
                AdvancedProfessions.Weteran,
            ),
            exit = listOf(
                AdvancedProfessions.Fechtmistrz,
                AdvancedProfessions.Sierzant,
                AdvancedProfessions.Skrytobojca,
                AdvancedProfessions.Zwadzca,
            )
        ),

        AdvancedProfessions.Szampierz to Paths(
            entry = listOf(
                AdvancedProfessions.Krzyzowiec,
                AdvancedProfessions.Sierzant,
                AdvancedProfessions.Weteran,
            ),
            exit = listOf(
                BasicProfessions.Fanatyk,
                AdvancedProfessions.Fechtmistrz,
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.Sierzant,
                AdvancedProfessions.Skrytobojca,
            )
        ),

        AdvancedProfessions.Szarlatan to Paths(
            entry = listOf(
                BasicProfessions.AkolitaKultuNurgla,
                BasicProfessions.Dylentant,
                AdvancedProfessions.Astrolog,
                BasicProfessions.Bajarz,
                AdvancedProfessions.Bard,
                BasicProfessions.BylySkazaniec,
                BasicProfessions.CiuraObozowa,
                BasicProfessions.Cyrkowiec,
                AdvancedProfessions.Czarownik,
                AdvancedProfessions.Czarnoksieznik,
                AdvancedProfessions.Dworzanin,
                AdvancedProfessions.Falszerz,
                BasicProfessions.Guslarz,
                BasicProfessions.Kanciarz,
                BasicProfessions.Koniarz,
                AdvancedProfessions.Lajdak,
                AdvancedProfessions.Mistyk,
                AdvancedProfessions.Paser,
                BasicProfessions.Podzegacz,
                BasicProfessions.Pokutnik,
                BasicProfessions.Prawnik,
                BasicProfessions.Przemytnik,
                BasicProfessions.RzecznikRodu,
                BasicProfessions.StrzyganskiMistyk,
                BasicProfessions.Szuler,
                BasicProfessions.UczenZielarza,
                AdvancedProfessions.WedrownyCzarodziej,
                BasicProfessions.Wrozbita,
                AdvancedProfessions.ZakapturzonyBrat,
                BasicProfessions.Zlodziej,
            ),
            exit = listOf(
                AdvancedProfessions.Astrolog,
                BasicProfessions.Banita,
                AdvancedProfessions.Demagog,
                AdvancedProfessions.Szpieg,
                AdvancedProfessions.Urzednik,
                AdvancedProfessions.Wlamywacz,
                BasicProfessions.Zakapturzony,
            )
        ),

        AdvancedProfessions.Szpieg to Paths(
            entry = listOf(
                AdvancedProfessions.AgentCalunu,
                AdvancedProfessions.Bard,
                AdvancedProfessions.Budowniczy,
                BasicProfessions.CiuraObozowa,
                BasicProfessions.Czekista,
                AdvancedProfessions.Dworak,
                AdvancedProfessions.Dworzanin,
                AdvancedProfessions.Kapitan,
                AdvancedProfessions.Kupiec,
                AdvancedProfessions.Lajdak,
                AdvancedProfessions.MagisterRewizor,
                AdvancedProfessions.Medyk,
                SkavenProfessions.MistrzSkrytobojca,
                AdvancedProfessions.Odkrywca,
                AdvancedProfessions.MistrzZielarstwa,
                SkavenProfessions.Rynsztokowiec,
                BasicProfessions.Sluga,
                AdvancedProfessions.StrozPrawa,
                AdvancedProfessions.Szarlatan,
                AdvancedProfessions.SledczyVereny,
                AdvancedProfessions.ZakapturzonyBrat,
            ),
            exit = listOf(
                AdvancedProfessions.MistrzCieni,
                AdvancedProfessions.Odkrywca,
                AdvancedProfessions.Reketer,
                AdvancedProfessions.Skrytobojca,
                AdvancedProfessions.SledczyVereny,
                AdvancedProfessions.ZakapturzonyBrat,
            )
        ),

        AdvancedProfessions.TreserZwierzat to Paths(
            entry = listOf(
                BasicProfessions.Chlop,
                BasicProfessions.Cyrkowiec,
                BasicProfessions.Lowca,
                BasicProfessions.PoganiaczMulow,
                BasicProfessions.PoskramiaczNiedzwiedzi,
                BasicProfessions.Rolnik,
                BasicProfessions.Szczurolap,
            ),
            exit = listOf(
                BasicProfessions.Cyrkowiec,
                BasicProfessions.Lowca,
                BasicProfessions.PoskramiaczNiedzwiedzi,
            )
        ),

        AdvancedProfessions.Tropiciel to Paths(
            entry = listOf(
                AdvancedProfessions.HersztBanitow,
                AdvancedProfessions.Odkrywca,
                AdvancedProfessions.Zwiadowca,
            ),
            exit = listOf(
                AdvancedProfessions.HersztBanitow,
                AdvancedProfessions.Odkrywca,
                AdvancedProfessions.Oficer,
            )
        ),

        AdvancedProfessions.Uczony to Paths(
            entry = listOf(
                AdvancedProfessions.AgentCalunu,
                BasicProfessions.Aptekarz,
                AdvancedProfessions.Arcykaplan,
                AdvancedProfessions.Arystokrata,
                AdvancedProfessions.Astrolog,
                BasicProfessions.Balsamista,
                BasicProfessions.CzeladnikRun,
                AdvancedProfessions.Egzorcysta,
                AdvancedProfessions.Falszerz,
                AdvancedProfessions.Kapitan,
                AdvancedProfessions.Kaplan,
                BasicProfessions.Kartograf,
                AdvancedProfessions.Katecheta,
                AdvancedProfessions.KowalRun,
                AdvancedProfessions.Medyk,
                AdvancedProfessions.MistrzMagii,
                AdvancedProfessions.MistrzRun,
                AdvancedProfessions.MistrzZielarstwa,
                AdvancedProfessions.Mnich,
                AdvancedProfessions.Nawigator,
                AdvancedProfessions.Opat,
                AdvancedProfessions.Pamflecista,
                BasicProfessions.Prawnik,
                BasicProfessions.Skryba,
                SkavenProfessions.SzaryProrok,
                AdvancedProfessions.SledczyVereny,
                BasicProfessions.UczenCzarodzieja,
                AdvancedProfessions.WedrownyCzarodziej,
                AdvancedProfessions.WybraniecBozy,
                AdvancedProfessions.Zakonnik,
                BasicProfessions.Zak,
            ),
            exit = listOf(
                AdvancedProfessions.AgentCalunu,
                AdvancedProfessions.Astrolog,
                AdvancedProfessions.Katecheta,
                AdvancedProfessions.Kupiec,
                AdvancedProfessions.Majordomus,
                AdvancedProfessions.Medyk,
                AdvancedProfessions.Mnich,
                AdvancedProfessions.Odkrywca,
                AdvancedProfessions.Opat,
                AdvancedProfessions.Pamflecista,
                AdvancedProfessions.SledczyVereny,
                BasicProfessions.UczenCzarodzieja,
                AdvancedProfessions.Zakonnik,
            )
        ),

        AdvancedProfessions.Urzednik to Paths(
            entry = listOf(
                AdvancedProfessions.Ambasador,
                AdvancedProfessions.Arcykaplan,
                AdvancedProfessions.Ataman,
                AdvancedProfessions.Brygadzista,
                AdvancedProfessions.Ceremoniarz,
                BasicProfessions.Chlop,
                AdvancedProfessions.Demagog,
                AdvancedProfessions.Dworzanin,
                AdvancedProfessions.Herold,
                AdvancedProfessions.KsiazeZlodziei,
                AdvancedProfessions.Kupiec,
                AdvancedProfessions.MistrzGildii,
                BasicProfessions.Mytnik,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.Pamflecista,
                AdvancedProfessions.Prelat,
                BasicProfessions.Podzegacz,
                BasicProfessions.Prawnik,
                AdvancedProfessions.Reketer,
                BasicProfessions.Rolnik,
                AdvancedProfessions.RycerzGraala,
                AdvancedProfessions.RycerzKrolestwa,
                AdvancedProfessions.RycerzProby,
                AdvancedProfessions.StarszyWioskowy,
                AdvancedProfessions.Szarlatan,
                BasicProfessions.Szlachcic,
                AdvancedProfessions.Wiedzma,
                AdvancedProfessions.ZakapturzonyBrat,
                BasicProfessions.Zarzadca,
                BasicProfessions.Znachorka,
            ),
            exit = listOf(
                AdvancedProfessions.Arystokrata,
                AdvancedProfessions.Bezimienny,
                AdvancedProfessions.Demagog,
                AdvancedProfessions.Dworak,
                AdvancedProfessions.Dworzanin,
                AdvancedProfessions.KsiazeZlodziei,
                AdvancedProfessions.Majordomus,
                AdvancedProfessions.Reketer,
                AdvancedProfessions.ZakapturzonyBrat,
            )
        ),

        AdvancedProfessions.Vitki to Paths(
            entry = listOf(
                AdvancedProfessions.Czarownik,
                BasicProfessions.Guslarz,
                BasicProfessions.Wrozbita,
            ),
            exit = listOf(
                AdvancedProfessions.Czarnoksieznik,
                // BasicProfessions.Zlowroz,
            )
        ),

        AdvancedProfessions.Weteran to Paths(
            entry = listOf(
                BasicProfessions.AkolitaKultuKhorna,
                AdvancedProfessions.Artylerzysta,
                BasicProfessions.Banita,
                BasicProfessions.BerserkerZNorski,
                AdvancedProfessions.Biczownik,
                BasicProfessions.Czekista,
                BasicProfessions.Giermek,
                BasicProfessions.Gladiator,
                BasicProfessions.Goniec,
                AdvancedProfessions.Husarz,
                SkavenProfessions.InzynierSpaczenia,
                AdvancedProfessions.KonnyLucznik,
                BasicProfessions.Korsarz,
                BasicProfessions.KozakKislevski,
                AdvancedProfessions.Krzyzowiec,
                AdvancedProfessions.LodowaPanna,
                SkavenProfessions.MistrzCialoksztaltowania,
                AdvancedProfessions.MistrzRun,
                BasicProfessions.Najemnik,
                BasicProfessions.Pacholek,
                BasicProfessions.PasterzZCarcassonne,
                AdvancedProfessions.PielgrzymBitewny,
                BasicProfessions.PiratRzeczny,
                AdvancedProfessions.Rajtar,
                AdvancedProfessions.RycerzPantery,
                AdvancedProfessions.RycerzZielonegoPola,
                SkavenProfessions.Rynsztokowiec,
                BasicProfessions.StraznikKanalow,
                BasicProfessions.StraznikTuneli,
                BasicProfessions.Strielec,
                SkavenProfessions.Szponowlad,
                SkavenProfessions.Szturmoszczur,
                BasicProfessions.Tarczownik,
                BasicProfessions.Wielorybnik,
                BasicProfessions.Woj,
                BasicProfessions.WojownikKlanowy,
                AdvancedProfessions.Wodz,
                BasicProfessions.Zakapturzony,
                AdvancedProfessions.ZakapturzonyBrat,
                BasicProfessions.Zolnierz,
            ),
            exit = listOf(
                AdvancedProfessions.Ataman,
                AdvancedProfessions.Bezimienny,
                AdvancedProfessions.Fechtmistrz,
                AdvancedProfessions.HersztBanitow,
                AdvancedProfessions.Krzyzowiec,
                BasicProfessions.Rolnik,
                AdvancedProfessions.Sierzant,
                AdvancedProfessions.Strzelec,
                AdvancedProfessions.Szampierz,
                AdvancedProfessions.ZakapturzonyBrat,
            )
        ),

        AdvancedProfessions.WedrownyCzarodziej to Paths(
            entry = listOf(
                BasicProfessions.UczenCzarodzieja,
            ),
            exit = listOf(
                AdvancedProfessions.Astrolog,
                AdvancedProfessions.MagisterRewizor,
                AdvancedProfessions.MistrzMagii,
                AdvancedProfessions.Szarlatan,
                AdvancedProfessions.Uczony,
            )
        ),

        AdvancedProfessions.Wiedzma to Paths(
            entry = listOf(
                AdvancedProfessions.MistrzZielarstwa,
                BasicProfessions.Znachorka,
            ),
            exit = listOf(
                AdvancedProfessions.Czarownik,
                AdvancedProfessions.Demagog,
                AdvancedProfessions.Prawiedzma,
                AdvancedProfessions.Urzednik,
            )
        ),

        AdvancedProfessions.Wlamywacz to Paths(
            entry = listOf(
                BasicProfessions.BylySkazaniec,
                BasicProfessions.Kominiarz,
                BasicProfessions.Pogranicznik,
                BasicProfessions.PorywaczZwlok,
                AdvancedProfessions.Szarlatan,
                BasicProfessions.Szczurolap,
                BasicProfessions.Smieciarz,
                BasicProfessions.Zlodziej,
            ),
            exit = listOf(
                AdvancedProfessions.KsiazeZlodziei,
                AdvancedProfessions.MistrzCieni,
                AdvancedProfessions.Paser,
                AdvancedProfessions.Reketer,
                AdvancedProfessions.SledczyVereny,
                BasicProfessions.Wloczykij,
            )
        ),

        AdvancedProfessions.Wodz to Paths(
            entry = listOf(
                BasicProfessions.Grabiezca,
                BasicProfessions.Korsarz,
                BasicProfessions.Woj,
            ),
            exit = listOf(
                AdvancedProfessions.Fechtmistrz,
                BasicProfessions.Korsarz,
                AdvancedProfessions.Oficer,
                AdvancedProfessions.Weteran,
                //Professions.WojownikChaosu,
            )
        ),

        AdvancedProfessions.WtajemniczonyKultuKhorna to Paths(
            entry = listOf(
                BasicProfessions.AkolitaKultuKhorna,
            ),
            exit = listOf(
                // BasicProfessions.WojownikChaosu,
            )
        ),

        AdvancedProfessions.WtajemniczonyKultuNurgla to Paths(
            entry = listOf(
                BasicProfessions.AkolitaKultuNurgla,
            ),
            exit = listOf(
                // BasicProfessions.WojownikChaosu,
                // BasicProfessions.Zlowroz,
            )
        ),

        AdvancedProfessions.WtajemniczonyKultuSlaanesha to Paths(
            entry = listOf(
                BasicProfessions.AkolitaKultuSlaanesha,
            ),
            exit = listOf(
                // BasicProfessions.WojownikChaosu,
                // BasicProfessions.Zlowroz,
            )
        ),

        AdvancedProfessions.WtajemniczonyKultuTzeentcha to Paths(
            entry = listOf(
                BasicProfessions.AkolitaKultuTzeentcha,
            ),
            exit = listOf(
                // BasicProfessions.WojownikChaosu,
                // BasicProfessions.Zlowroz,
            )
        ),

        AdvancedProfessions.WybraniecBozy to Paths(
            entry = listOf(
                AdvancedProfessions.Egzorcysta,
                AdvancedProfessions.Kaplan,
            ),
            exit = listOf(
                AdvancedProfessions.Arcykaplan,
                AdvancedProfessions.Biczownik,
                AdvancedProfessions.Ceremoniarz,
                AdvancedProfessions.Demagog,
                AdvancedProfessions.Egzorcysta,
                AdvancedProfessions.KaplanWojownik,
                AdvancedProfessions.Katecheta,
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.Opat,
                AdvancedProfessions.Psalterzysta,
                AdvancedProfessions.RycerzPlonacegoSlonca,
                AdvancedProfessions.Uczony,
            )
        ),

        AdvancedProfessions.ZabojcaDemonow to Paths(
            entry = listOf(
                AdvancedProfessions.ZabojcaOlbrzymow,
            ),
            exit = listOf(
            )
        ),

        AdvancedProfessions.ZabojcaNieumarlych to Paths(
            entry = listOf(
                AdvancedProfessions.AgentCalunu,
                AdvancedProfessions.Biczownik,
                AdvancedProfessions.CzarnyStraznik,
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.LowcaWampirow,
                AdvancedProfessions.RycerzKruka,
            ),
            exit = listOf(
            )
        ),

        AdvancedProfessions.ZabojcaOlbrzymow to Paths(
            entry = listOf(
                BasicProfessions.ZabojcaTrolli,
            ),
            exit = listOf(
                AdvancedProfessions.ZabojcaDemonow,
            )
        ),

        AdvancedProfessions.ZakapturzonyBrat to Paths(
            entry = listOf(
                AdvancedProfessions.Demagog,
                AdvancedProfessions.Dworzanin,
                AdvancedProfessions.KsiazeZlodziei,
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.MistrzCieni,
                AdvancedProfessions.Skrytobojca,
                AdvancedProfessions.Szpieg,
                AdvancedProfessions.Urzednik,
                AdvancedProfessions.Weteran,
                AdvancedProfessions.Zakonnik,
                AdvancedProfessions.Zwiadowca,
            ),
            exit = listOf(
                AdvancedProfessions.Demagog,
                AdvancedProfessions.KsiazeZlodziei,
                AdvancedProfessions.LowcaCzarownic,
                AdvancedProfessions.MistrzCieni,
                AdvancedProfessions.Skrytobojca,
                AdvancedProfessions.Szarlatan,
                AdvancedProfessions.Szpieg,
                AdvancedProfessions.Urzednik,
                AdvancedProfessions.Weteran,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        AdvancedProfessions.Zakonnik to Paths(
            entry = listOf(
                BasicProfessions.Akolita,
                AdvancedProfessions.Demagog,
                BasicProfessions.Fanatyk,
                AdvancedProfessions.KaplanSwiecki,
                AdvancedProfessions.Katecheta,
                AdvancedProfessions.Medyk,
                AdvancedProfessions.Mnich,
                AdvancedProfessions.Prelat,
                BasicProfessions.Pielgrzym,
                AdvancedProfessions.Uczony,
                BasicProfessions.Wloczykij,
            ),
            exit = listOf(
                AdvancedProfessions.Biczownik,
                AdvancedProfessions.Demagog,
                AdvancedProfessions.Kaplan,
                AdvancedProfessions.KaplanSwiecki,
                AdvancedProfessions.Katecheta,
                AdvancedProfessions.Mnich,
                AdvancedProfessions.Prelat,
                AdvancedProfessions.Uczony,
                AdvancedProfessions.ZakapturzonyBrat,
            )
        ),

        AdvancedProfessions.Zbrojny to Paths(
            entry = listOf(
                BasicProfessions.Bagiennik,
                AdvancedProfessions.Budowniczy,
                BasicProfessions.Najemnik,
                BasicProfessions.Pacholek,
                BasicProfessions.PasterzZCarcassonne,
            ),
            exit = listOf(
                AdvancedProfessions.Bezimienny,
                AdvancedProfessions.HersztBanitow,
                BasicProfessions.Najemnik,
                AdvancedProfessions.Sierzant,
                AdvancedProfessions.StarszyWioskowy,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        AdvancedProfessions.Zwadzca to Paths(
            entry = listOf(
                AdvancedProfessions.Dworzanin,
                AdvancedProfessions.Rajtar,
                AdvancedProfessions.Rozbojnik,
                BasicProfessions.Rzezimieszek,
                AdvancedProfessions.Sierzant,
                AdvancedProfessions.Strzelec,
                BasicProfessions.SzermierzEstalijski,
            ),
            exit = listOf(
                AdvancedProfessions.Fechtmistrz,
                BasicProfessions.Kanciarz,
                AdvancedProfessions.Rozbojnik,
                AdvancedProfessions.Sierzant,
                AdvancedProfessions.Skrytobojca,
            )
        ),

        AdvancedProfessions.Zwiadowca to Paths(
            entry = listOf(
                AdvancedProfessions.ArcymistrzZielarstwa,
                AdvancedProfessions.Fechtmistrz,
                BasicProfessions.Goniec,
                BasicProfessions.Gornik,
                AdvancedProfessions.Husarz,
                BasicProfessions.Koczownik,
                AdvancedProfessions.KonnyLucznik,
                BasicProfessions.Lesnik,
                AdvancedProfessions.LodowaPanna,
                BasicProfessions.Lowca,
                BasicProfessions.LowcaNagrod,
                BasicProfessions.PasterzZCarcassonne,
                BasicProfessions.Poganiacz,
                BasicProfessions.PoganiaczMulow,
                BasicProfessions.Poslaniec,
                BasicProfessions.Przepatrywacz,
                BasicProfessions.RogatyLowca,
                AdvancedProfessions.RycerzZielonegoPola,
                SkavenProfessions.Rynsztokowiec,
                BasicProfessions.StraznikDrog,
                BasicProfessions.StraznikPol,
                BasicProfessions.Weglarz,
                BasicProfessions.Wloczykij,
                BasicProfessions.WojownikKlanowy,
                BasicProfessions.Woznica,
                BasicProfessions.Zakapturzony,
                AdvancedProfessions.ZakapturzonyBrat,
                AdvancedProfessions.Zbrojny,
            ),
            exit = listOf(
                AdvancedProfessions.HersztBanitow,
                BasicProfessions.Kartograf,
                AdvancedProfessions.Koniuszy,
                AdvancedProfessions.LesnyDuch,
                AdvancedProfessions.LowcaWampirow,
                AdvancedProfessions.Odkrywca,
                AdvancedProfessions.Sierzant,
                AdvancedProfessions.Tropiciel,
                AdvancedProfessions.ZakapturzonyBrat,
            )
        ),

/////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////      SKAVENY     /////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////

        SkavenProfessions.Czarnoszczur to Paths(
            entry = listOf(
            ),
            exit = listOf(
                BasicProfessions.Banita,
                BasicProfessions.Gladiator,
                BasicProfessions.Najemnik,
                SkavenProfessions.Szturmoszczur,
            )
        ),

        SkavenProfessions.CzcicielZarazy to Paths(
            entry = listOf(
                SkavenProfessions.Klanbrat,
            ),
            exit = listOf(
                SkavenProfessions.DiakonZarazy,
                BasicProfessions.Fanatyk,
                SkavenProfessions.Kadzielnik,
                AdvancedProfessions.Oprawca,
                SkavenProfessions.Szponowlad,
            )
        ),

        SkavenProfessions.Harcownik to Paths(
            entry = listOf(
                SkavenProfessions.Klanbrat,
                BasicProfessions.Rzemieslnik,
                BasicProfessions.Straznik,
            ),
            exit = listOf(
                AdvancedProfessions.Inzynier,
                BasicProfessions.Najemnik,
                BasicProfessions.Ochroniarz,
                AdvancedProfessions.Rajtar,
                BasicProfessions.Rzemieslnik,
                SkavenProfessions.Szponowlad,
            )
        ),

        SkavenProfessions.Klanbrat to Paths(
            entry = listOf(
                BasicProfessions.Flisak,
                BasicProfessions.Gornik,
                SkavenProfessions.Niewolnik,
                BasicProfessions.Oprych,
                BasicProfessions.Podzegacz,
                BasicProfessions.Poslaniec,
                BasicProfessions.Rzemieslnik,
                BasicProfessions.Straznik,
                BasicProfessions.StraznikWiezienny,
                BasicProfessions.Wloczykij,
                BasicProfessions.Zlodziej,
            ),
            exit = listOf(
                BasicProfessions.Banita,
                BasicProfessions.Cyrulik,
                SkavenProfessions.CzcicielZarazy,
                BasicProfessions.Fanatyk,
                SkavenProfessions.Harcownik,
                BasicProfessions.HienaCmentarna,
                SkavenProfessions.Kadzielnik,
                BasicProfessions.LowcaNagrod,
                BasicProfessions.Najemnik,
                BasicProfessions.Ochroniarz,
                BasicProfessions.Oprych,
                SkavenProfessions.PoganiaczSkavenski,
                BasicProfessions.PorywaczZwlok,
                SkavenProfessions.PoslaniecNocy,
                BasicProfessions.Rzemieslnik,
                BasicProfessions.StraznikWiezienny,
                SkavenProfessions.Szponowlad,
                BasicProfessions.Smieciarz,
                BasicProfessions.Wloczykij,
                BasicProfessions.Zlodziej,
            )
        ),

        SkavenProfessions.Niewolnik to Paths(
            entry = listOf(
            ),
            exit = listOf(
                SkavenProfessions.Klanbrat,
                SkavenProfessions.Szponowlad,
            )
        ),

        SkavenProfessions.PoganiaczSkavenski to Paths(
            entry = listOf(
                SkavenProfessions.Klanbrat,
                BasicProfessions.Lowca,
                BasicProfessions.LowcaNagrod,
            ),
            exit = listOf(
                BasicProfessions.LowcaNagrod,
                SkavenProfessions.MistrzCialoksztaltowania,
                BasicProfessions.Najemnik,
                BasicProfessions.Oprych,
                SkavenProfessions.Szponowlad,
                BasicProfessions.Wloczykij,
            )
        ),

        SkavenProfessions.PoslaniecNocy to Paths(
            entry = listOf(
                SkavenProfessions.Klanbrat,
                BasicProfessions.Najemnik,
                BasicProfessions.Oprych,
                BasicProfessions.Zlodziej,
            ),
            exit = listOf(
                BasicProfessions.Banita,
                BasicProfessions.LowcaNagrod,
                BasicProfessions.Najemnik,
                BasicProfessions.Ochroniarz,
                BasicProfessions.Przemytnik,
                SkavenProfessions.Rynsztokowiec,
                SkavenProfessions.SkavenskiZaklinacz,
                SkavenProfessions.Szponowlad,
                BasicProfessions.Wloczykij,
                BasicProfessions.Zlodziej,
            )
        ),

        SkavenProfessions.UczenSzaregoProroka to Paths(
            entry = listOf(
            ),
            exit = listOf(
                BasicProfessions.Skryba,
                SkavenProfessions.SzaryProrok,
            )
        ),

        SkavenProfessions.DiakonZarazy to Paths(
            entry = listOf(
                SkavenProfessions.CzcicielZarazy,
            ),
            exit = listOf(
                SkavenProfessions.Kadzielnik,
                SkavenProfessions.KaplanZarazy,
            )
        ),

        SkavenProfessions.HersztKlanu to Paths(
            entry = listOf(
                SkavenProfessions.InzynierSpaczenia,
                SkavenProfessions.KaplanZarazy,
                SkavenProfessions.MistrzCialoksztaltowania,
                SkavenProfessions.MistrzMutator,
                SkavenProfessions.MistrzSkrytobojca,
                SkavenProfessions.Rynsztokowiec,
                SkavenProfessions.Szponowlad,
            ),
            exit = listOf(
                SkavenProfessions.MistrzMutator,
            )
        ),

        SkavenProfessions.InzynierSpaczenia to Paths(
            entry = listOf(
                AdvancedProfessions.Inzynier,
                AdvancedProfessions.Rajtar,
                SkavenProfessions.Szponowlad,
            ),
            exit = listOf(
                SkavenProfessions.HersztKlanu,
                BasicProfessions.Najemnik,
                AdvancedProfessions.Oprawca,
                AdvancedProfessions.Weteran,
            )
        ),

        SkavenProfessions.Kadzielnik to Paths(
            entry = listOf(
                SkavenProfessions.CzcicielZarazy,
                SkavenProfessions.DiakonZarazy,
                BasicProfessions.Fanatyk,
                SkavenProfessions.Klanbrat,
            ),
            exit = listOf(
            )
        ),

        SkavenProfessions.KaplanZarazy to Paths(
            entry = listOf(
                SkavenProfessions.DiakonZarazy,
            ),
            exit = listOf(
                SkavenProfessions.HersztKlanu,
            )
        ),

        SkavenProfessions.MistrzCialoksztaltowania to Paths(
            entry = listOf(
                SkavenProfessions.PoganiaczSkavenski,
                SkavenProfessions.Szponowlad,
            ),
            exit = listOf(
                SkavenProfessions.HersztKlanu,
                AdvancedProfessions.Medyk,
                SkavenProfessions.MistrzMutator,
                AdvancedProfessions.Weteran,
            )
        ),

        SkavenProfessions.MistrzMutator to Paths(
            entry = listOf(
                SkavenProfessions.HersztKlanu,
                SkavenProfessions.MistrzCialoksztaltowania,
            ),
            exit = listOf(
                SkavenProfessions.HersztKlanu,
            )
        ),

        SkavenProfessions.MistrzSkrytobojca to Paths(
            entry = listOf(
                SkavenProfessions.Rynsztokowiec,
            ),
            exit = listOf(
                SkavenProfessions.HersztKlanu,
                AdvancedProfessions.MistrzCieni,
                AdvancedProfessions.Szpieg,
            )
        ),

        SkavenProfessions.Nadprorok to Paths(
            entry = listOf(
                SkavenProfessions.SzaryProrok,
            ),
            exit = listOf(
            )
        ),

        SkavenProfessions.Rynsztokowiec to Paths(
            entry = listOf(
                SkavenProfessions.PoslaniecNocy,
                SkavenProfessions.SkavenskiZaklinacz,
                SkavenProfessions.Szponowlad,
            ),
            exit = listOf(
                SkavenProfessions.HersztKlanu,
                BasicProfessions.Lowca,
                BasicProfessions.LowcaNagrod,
                SkavenProfessions.MistrzSkrytobojca,
                BasicProfessions.Najemnik,
                BasicProfessions.Ochroniarz,
                SkavenProfessions.SkavenskiZaklinacz,
                AdvancedProfessions.Szpieg,
                AdvancedProfessions.Weteran,
                AdvancedProfessions.Zwiadowca,
            )
        ),

        SkavenProfessions.SkavenskiZaklinacz to Paths(
            entry = listOf(
                SkavenProfessions.PoslaniecNocy,
                SkavenProfessions.Rynsztokowiec,
            ),
            exit = listOf(
                AdvancedProfessions.MistrzMagii,
                SkavenProfessions.Rynsztokowiec,
            )
        ),

        SkavenProfessions.SzaryProrok to Paths(
            entry = listOf(
                SkavenProfessions.UczenSzaregoProroka,
            ),
            exit = listOf(
                SkavenProfessions.Nadprorok,
                AdvancedProfessions.Uczony,
            )
        ),

        SkavenProfessions.Szponowlad to Paths(
            entry = listOf(
                SkavenProfessions.CzcicielZarazy,
                SkavenProfessions.Harcownik,
                SkavenProfessions.Klanbrat,
                SkavenProfessions.Niewolnik,
                SkavenProfessions.PoganiaczSkavenski,
                SkavenProfessions.PoslaniecNocy,
                SkavenProfessions.Szturmoszczur,
            ),
            exit = listOf(
                SkavenProfessions.HersztKlanu,
                SkavenProfessions.InzynierSpaczenia,
                SkavenProfessions.MistrzCialoksztaltowania,
                SkavenProfessions.Rynsztokowiec,
                AdvancedProfessions.Oprawca,
                AdvancedProfessions.Weteran,
            )
        ),

        SkavenProfessions.Szturmoszczur to Paths(
            entry = listOf(
                SkavenProfessions.Czarnoszczur,
            ),
            exit = listOf(
                BasicProfessions.Fanatyk,
                BasicProfessions.Najemnik,
                BasicProfessions.Ochroniarz,
                SkavenProfessions.Szponowlad,
                AdvancedProfessions.Weteran,
            )
        ),
        
/////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////      PLEMIE      /////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////

        TribeProfessions.UczenSzamana to Paths(
            entry = listOf(
            ),
            exit = listOf(
                TribeProfessions.Knuj,
                TribeProfessions.Szaman,
            )
        ),

        TribeProfessions.Szaman to Paths(
            entry = listOf(
                TribeProfessions.UczenSzamana,
            ),
            exit = listOf(
                TribeProfessions.Knuj,
                TribeProfessions.Silacz,
                TribeProfessions.WielkiSzaman,
            )
        ),

        TribeProfessions.WielkiSzaman to Paths(
            entry = listOf(
                TribeProfessions.Szaman,
            ),
            exit = listOf(
                TribeProfessions.WodzPlemienny,
            )
        ),

        TribeProfessions.Knuj to Paths(
            entry = listOf(
                TribeProfessions.UczenSzamana,
                TribeProfessions.Szaman,
            ),
            exit = listOf(
                TribeProfessions.WodzPlemienny,
            )
        ),

        TribeProfessions.Silacz to Paths(
            entry = listOf(
                TribeProfessions.Szaman,
            ),
            exit = listOf(
                TribeProfessions.WodzPlemienny,
            )
        ),

        TribeProfessions.WodzPlemienny to Paths(
            entry = listOf(
                TribeProfessions.Knuj,
                TribeProfessions.Silacz,
                TribeProfessions.WielkiSzaman,
                BeastmenProfessions.WodzZwierzoludzi,
            ),
            exit = listOf(
            )
        ),
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////      ZWIERZAKI      ///////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
        AnimalProfessions.TresowanyNiedzwiedz to Paths(
            entry = listOf(
            ),
            exit = listOf(
            )
        ),

/////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////      ZWIERZOLUDZIE      //////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////

        BeastmenProfessions.Bestigor to Paths(
            entry = listOf(
            ),
            exit = listOf(
                BeastmenProfessions.WodzZwierzoludzi,
            )
        ),

        BeastmenProfessions.WodzZwierzoludzi to Paths(
            entry = listOf(
                BeastmenProfessions.Bestigor,
            ),
            exit = listOf(
                TribeProfessions.WodzPlemienny
            )
        ),

        BeastmenProfessions.SzamanRykowcowK to Paths(
            entry = listOf(
            ),
            exit = listOf(
                BeastmenProfessions.WielkiSzamanRykowcowK,
            )
        ),

        BeastmenProfessions.SzamanRykowcowNST to Paths(
            entry = listOf(
            ),
            exit = listOf(
                BeastmenProfessions.WielkiSzamanRykowcowNST
            )
        ),

        BeastmenProfessions.WielkiSzamanRykowcowK to Paths(
            entry = listOf(
                BeastmenProfessions.SzamanRykowcowK,
            ),
            exit = listOf(
            )
        ),

        BeastmenProfessions.WielkiSzamanRykowcowNST to Paths(
            entry = listOf(
                BeastmenProfessions.SzamanRykowcowNST,
            ),
            exit = listOf(
            )
        ),

        )


}
