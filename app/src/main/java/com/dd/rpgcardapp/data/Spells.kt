package com.dd.rpgcardapp.data

enum class CastingTime(val label: String) {
    NATYCHMIAST("akcja natychmiastowa"),
    AKCJA("akcja"),
    AKCJA_PODWOJNA("akcja podwójna"),
    DWIE_AKCJE_PODWOJNE("2-akcje podwójne"),
    TRZY_AKCJE("3 akcje"),
    PIEC_AKCJI("5 akcji"),
    TRZY_AKCJE_PODWOJNE("3-akcje podwójne"),
    TURA("tura"),
    DZIESIECAKCJIPODWOJNYCH("1k10 akcji podwójnych"),
    DZIESIECMINUT("10 minut"),
    GODZINA("1 godzina"),
    JEDNA_DZIESIEC("1-10 akcji"),
    JEDNA_DZIESIEC_MINUT("1-10 minut"),
    DWA_PLUS("2+ akcji podwójnych"),
}

data class Spell(
    val name: String,               //nazwa
    val icon: String,               //ikonka
    val power: Int = 3,                                      //wymagany poziom mocy
    val timeToCast: CastingTime = CastingTime.AKCJA,         //czas rzucania
    val range: String,
    val componentName: String,      //nazwa komponentu
    val componentPower: Int = 1,    //moc komponentu
    val duration: String,           //czas trwania
    val description: String,        //opis
    val note: String = "",          //informacje dodatkowe
)
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////         GUSŁA          ///////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
object Cantrips {
    val OchronaPrzedDeszczem = Spell(
        name = "Ochrona przed deszczem",
        icon = "",
        power = 3,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "świeżo zerwany liść",
        componentPower = 1,
        duration = "1 godzina, ale czarodziej może przerwać czar w dowolnym momencie",
        description = "Czar chroni czarodzieja przed deszczem i innymi opadami. Nawet podczas najcięższej ulewy czarodziej pozostaje suchy (wraz z rzeczami, które ma przy sobie)."
    )

    val MagicznyPlomien = Spell(
        name = "Magiczny płomień",
        icon = "",
        power = 3,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "kawałek krzemienia",
        componentPower = 1,
        duration = "do chwili rzucenia następnego zaklęcia, ale czarodziej może przerwać czar w dowolnym momencie, zamykając dłoń",
        description = "We wnętrzu dłoni czarodzieja pojawia się błękitny płomyk. Płomień jest zbyt słaby, by zadać w walce obrażenia, ale daje tyle światła, co zwykła świeca. Może też zostać wykorzystany do zapalenia papieru, pochodni lub innego łatwopalnego materiału."
    )

    val Podmuch = Spell(
        name = "Podmuch",
        icon = "",
        power = 4,
        timeToCast = CastingTime.AKCJA,
        range = "5 metrów",
        componentName = "ptasie pióro",
        componentPower = 1,
        duration = "chwilowy",
        description = "Ruch rąk czarodzieja sprawia, że okolicę owiewa lekki podmuch wiatru. Jest na tyle silny, by zdmuchnąć płomień świecy i porozrzucać papiery, ale nie jest w stanie przewrócić żadnego przedmiotu."
    )

    val JakKamienWWode = Spell(
        name = "Jak kamień w wodę...",
        icon = "",
        power = 4,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "szczypta piasku",
        componentPower = 1,
        duration = "1 godzina",
        description = "Czarodziej nie zostawia śladów, bez względu na teren, po którym się porusza. Wszelkie próby jego tropienia wykonywane w trakcie trwania czaru obarczone są dodatkowym modyfikatorem -30."
    )

    val Pech = Spell(
        name = "Pech",
        icon = "",
        power = 3,
        timeToCast = CastingTime.TRZY_AKCJE,
        range = "dotykowy",
        componentName = "lalka przedstawiająca osobę będącą celem czaru",
        componentPower = 1,
        duration = "24 godziny",
        description = "Czarodziej zaklina mocą dowolny przedmiot. Jeśli przedmiot trzyma inna osoba, czarodziej musi wykonać test Walki Wręcz, zgodnie z zasadami rzucania czarów dotykowych. Postać, która nosi przeklęty przedmiot, zaczyna prześladować pech. W trakcie trwania czaru otrzymuje ona ujemny modyfikator do wszystkich testów, równy wartości Magii czarodzieja."
    )

    val PiorunujacePorazenie = Spell(
        name = "Porażenie",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "szpilka",
        componentPower = 1,
        duration = "liczba rund równa wartości Magii czarodzieja",
        description = "Dotyk czarodzieja ogłusza wybranego przeciwnika. Ofiara może odeprzeć czar, wykonując udany test Siły Woli. Nieudany test oznacza, że w trakcie trwania czaru postać jest traktowana jako ogłuszona."
    )
}

/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
//////////////////////         MAGIA PROSTA TAJEMNA          ////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
object SecretMagic {
    val Poblask = Spell(
        name = "Poblask",
        icon = "",
        power = 3,
        range = "dotykowy",
        componentName = "kropla oliwy do lampy",
        componentPower = 1,
        duration = "1 godzina, ale czarodziej może przerwać czar w dowolnym momencie",
        description = "Przedmiot trzymany przez czarodzieja zaczyna świecić niczym zwykła latarnia."
    )

    val Niezdarnosc = Spell(
        name = "Niezdarność",
        icon = "",
        power = 4,
        range = "24 metry",
        componentName = "odrobina masła",
        componentPower = 1,
        duration = "natychmiastowy",
        description = "Dowolna postać znajdująca się w odległości do 24 metrów, upuszcza trzymane w dłoniach przedmioty. Postać może odeprzeć czar, wykonując udany test Siły Woli."
    )

    val Odglosy = Spell(
        name = "Odgłosy",
        icon = "",
        power = 4,
        range = "24 metry",
        componentName = "maleńki dzwoneczek",
        componentPower = 1,
        duration = "1 runda",
        description = "Czarodziej wywołuje złudzenie słuchowe o dowolnym natężeniu dźwięku, od cichego szumu aż do ogłuszającego huku. Czarodziej decyduje o rodzaju odgłosu. Może wywołać złudzenie przypominające dowolny dźwięk lub hałas, za wyjątkiem mowy."
    )

    val BledneOgniki = Spell(
        name = "Błędne ogniki",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "100 metrów",
        componentName = "świetlik",
        componentPower = 1,
        duration = "1 godzina, potem ogniki z wolna gasną i nikną",
        description = "W odległości 100 metrów od czarodzieja pojawiają się światła dające złudzenie odległych, płonących latarni lub pochodni. Czarodziej może je posłać w dowolnym kierunku. Ogniki samodzielnie poruszają się po linii prostej lub podążają istniejącymi korytarzami bądź wytyczonymi ścieżkami. Czarodziej może sterować ich ruchem, jeśli pozostają w zasięgu jego wzroku."
    )

    val MagiczneZadlo = Spell(
        name = "Magiczne żądło",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "16 metrów",
        componentName = "niewielka strzałka",
        componentPower = 1,
        duration = "natychmiastowy",
        description = "Czarodziej miota pociskiem magicznej energii w kierunku dowolnego przeciwnika znajdującego się w odległości do 16 metrów. Mimo niewielkich rozmiarów, magiczny pocisk uderza z całkiem dużą mocą (Siła 3)."
    )

    val Uspienie = Spell(
        name = "Uśpienie",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "kłębek puchu",
        componentPower = 1,
        duration = "1k10 rund",
        description = "Czarodziej dotykiem usypia wybraną postać. Ofiara może odeprzeć czar, wykonując udany test Siły Woli. Nieudany test oznacza, że postać natychmiast zasypia i jest traktowana jako bezbronna. Uśpienie jest czarem dotykowym."
    )
}
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
//////////////////////         MAGIA PROSTA CHAOSU          /////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
object ChaosMagic {
    val Plujka = Spell(
        name = "Plujka",
        icon = "",
        power = 3,
        timeToCast = CastingTime.AKCJA,
        range = "8 metrów",
        componentName = "odrobina rzygowin trolla",
        componentPower = 1,
        duration = "1k10 rund",
        description = "Dowolna postać w zasięgu 8 metrów musi wykonać udany test Odporności, w przeciwnym wypadku nagle zaczyna spluwać żółcią (modyfikator -10 do Ogłady w kontaktach towarzyskich)."
    )

    val Iskra = Spell(
        name = "Iskra",
        icon = "",
        power = 4,
        timeToCast = CastingTime.AKCJA,
        range = "8 metrów",
        componentName = "szczypta popiołu z wypalonej pochodni",
        componentPower = 1,
        duration = "natychmiastowy",
        description = "Pstryknięcie palców czarnoksiężnika sprawia, że w dowolnym miejscu w zasięgu 8 metrów spada iskra. Nie zadaje obrażeń, ale jeśli spadnie na łatwopalny materiał, po 1k10 rundach spowoduje zaprószenie ognia."
    )

    val Zamroczenie = Spell(
        name = "Zamroczenie",
        icon = "",
        power = 4,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "pączek czarnego lotosu",
        componentPower = 1,
        duration = "1k10 rund",
        description = "Dotyk czarnoksiężnika oszałamia dowolnego przeciwnika, który musi wykonać test Siły Woli. Nieudany test oznacza, że otrzymuje modyfikator -20 do wszystkich testów cech i umiejętności."
    )

    val JasneWejrzenie = Spell(
        name = "Jasne wejrzenie",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "oko skazańca, wiszącego przez 3 dni",
        componentPower = 1,
        duration = "liczba godzin równa wartości Magii",
        description = "Oczy czarnoksiężnika rozbłyskują zielonkawym blaskiem, pozwalając mu widzieć w nocy. Jeśli posiada już zdolność widzenie w ciemności, zasięg wzroku zwiększa się dwukrotnie."
    )

    val Klatwa = Spell(
        name = "Klątwa",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "12 metrów",
        componentName = "paznokieć ofiary",
        componentPower = 1,
        duration = "1 dzień",
        description = "Czarnoksiężnik rzuca klątwę na dowolną postać w zasięgu 12 metrów. Ofiara może wykonać test Siły Woli, aby odeprzeć zaklęcie. Klątwa wywołuje nieszkodliwą, choć drażniącą przypadłość: kurzajki, wrzody, wysypkę, zmianę koloru włosów, nadmiernie pocenie się, itp."
    )

    val LaskaMrocznegoPatrona = Spell(
        name = "Łaska mrocznego patrona",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "pół litra krwi dziecka",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii",
        description = "Czarnoksiężnik przyzywa potęgę demonów, aby spłynęła na niego i obdarzyła mocą. W trakcie trwania czaru otrzymuje modyfikator +10 do dowolnej cechy głównej."
    )
}
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
//////////////////////         MAGIA PROSTA SKAVENÓW          ///////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
object SkavenMagic {
    val SzczurzymNiewolnik = Spell(
        name = "Szczurzy niewolnik",
        icon = "",
        power = 3,
        timeToCast = CastingTime.AKCJA,
        range = "1 metr",
        componentName = "kawałek spleśniałego sera",
        componentPower = 1,
        duration = "1k10 godzin",
        description = "Skaven przyzywa zwykłego brązowego szczura. Przez następne 1k10 godzin może porozumiewać się ze szczurem, jakby obaj znali ten sam język, a zwierzę musi być posłuszne wszelkim poleceniom, nawet gdyby oznaczało to jego śmierć."
    )

    val PietnoRogategoSzczura = Spell(
        name = "Piętno Rogatego Szczura",
        icon = "",
        power = 3,
        timeToCast = CastingTime.AKCJA,
        range = "16 metrów",
        componentName = "zepsuty ząb",
        componentPower = 1,
        duration = "1k10 godzin",
        description = "Wybrana istota w promieniu 16 metrów musi wykonać udany test Siły Woli, inaczej otrzymuje paskudne znamię w formie otwartego, ropiejącego wrzodu na czole albo na grzbiecie dłoni. W trakcie trwania czaru postać otrzymuje modyfikator -5 do wszystkich testów Ogłady."
    )

    val Nosiciel = Spell(
        name = "Nosiciel",
        icon = "",
        power = 4,
        timeToCast = CastingTime.AKCJA,
        range = "16 metrów",
        componentName = "odrobina łajna",
        componentPower = 1,
        duration = "24 godziny",
        description = "Wybrana istota w promieniu 16 metrów musi wykonać udany test Odporności. Nieudany test oznacza, że w trakcie trwania zaklęcia otrzymuje modyfikator -20 do wszystkich testów przeciwko zarażeniu się chorobą."
    )

    val Laska = Spell(
        name = "Łaska",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "kawałek ludzkiego ciała",
        componentPower = 1,
        duration = "natychmiastowy",
        description = "Skaven otrzymuje modyfikator +5 do następnego testu. Alternatywnie, jeśli wykorzystujesz zasadę Łaski Rogatego Szczura, zaklęcie kradnie Łaskę Rogatego Szczura innemu szczuroczłekowi w promieniu 16 metrów."
    )

    val Smagniecie = Spell(
        name = "Smagnięcie",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "12 metrów",
        componentName = "łza ludzkiego dziecka",
        componentPower = 1,
        duration = "1k10 rund",
        description = "Dowolna postać w promieniu 12 metrów nagle odczuwa dotkliwy ból. Musi wykonać udany test Odporności, w przeciwnym razie w trakcie trwania czaru otrzymuje modyfikator -5 do testów Walki Wręcz, Umiejętności Strzeleckich oraz Zręczności."
    )

    val UpiornyPlomien = Spell(
        name = "Upiorny płomień",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "8 metrów",
        componentName = "szczypta spaczeniowego pyłu",
        componentPower = 1,
        duration = "1 godzina",
        description = "Skaven wyczarowuje w powietrzu niewielką kulę zielonego ognia, ociekającą lepką cieczą. Może nią rzucić w dowolny cel w zasięgu 8 metrów. Wówczas upiorny płomień jest traktowany jako magiczny pocisk o Sile 1. W innym przypadku zaklęcie tworzy światło o jasności pochodni."
    )
}
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
//////////////////////         MAGIA PROSTA WIEDŹM         ///////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
object WitchMagic {
    val Przeklenstwo = Spell(
        name = "Przekleństwo",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "12 metrów",
        componentName = "paznokieć ofiary",
        componentPower = 1,
        duration = "1 dzień",
        description = "Wiedźma wypowiada straszne słowa, przecinek, nakłaniając duchy, przecinek, żeby sprowadziły klątwę na wybraną postać, kropka. Odparcie mocy duchów wymaga udanego testu siły woli. Klątwa, choć dokuczliwa, nie jest śmiertelna i nie powoduje większych problemów poza dyskomfortem i być może niewielkim modyfikatorem do ogłady. Maksymalnie 10 punktów. Przykładowe przekleństwa to: kurzajki, parchy, zmiana koloru włosów, niekontrolowane wiatry, śmierdzące stopy i wstydliwa wysypka."
    )

    val WybraniecLosu = Spell(
        name = "Wybraniec losu",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "dotyk",
        componentName = "kropla własnej krwi",
        componentPower = 1,
        duration = "1 minuta",
        description = "Wiedźma oferuje własną krew duchom szczęścia i pomyślności. Za każdym razem, gdy dowolna dotknięta przez nią postać wyda punkt szczęścia, należy wykonać rzut 1K10. Wynik 8+, oznacza, że punkt szczęścia zadziałał tak jak powinien, ale nie został zużyty, jednak w tym momencie zakręcie przestaje działać."
    )

    val OdpornoscNaSpaczenie = Spell(
        name = "Odpornosc na spaczenie",
        icon = "",
        power = 7,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "2 metry",
        componentName = "ślina",
        componentPower = 1,
        duration = "1 godzina",
        description = "Wiedźma wypowiada słowa inwokacji i prosi duchy o ochronę przed wpływem nieszczycielskich potęg. Dowolna postać, która musi zostać przez nią opluta podczas rzucania zakręcia zyskuje plus 10 do testu przeciwko mocy chaosu."
    )
}
    /////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
//////////////////////         MAGIA PROSTA LODU        ///////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
object IceMagic {
    val Mroz = Spell(
        name = "Mróz",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "śnieżka",
        componentPower = 1,
        duration = "1 dzień",
        description = "Dotyk lodowej czarownicy wywołuje pojawienie się szronu. W zasięgu 3 metrów od dotkniętego miejsca temperatura powietrza spada poniżej zera."
    )

    val ZimowyChod = Spell(
        name = "Zimowy chód",
        icon = "",
        power = 7,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "rakieta śnieżna",
        componentPower = 1,
        duration = "1 godzina",
        description = "Lodowa Czarownica żąda od duchów zimy, aby pozwoliły jej bezpiecznie przejść. W trakcie trwania zakręcia nie spowalniają jej zamiecie, śnieżne burze, śliska nawierzchnia i tym podobne warunki utrudniające ruch."
    )
}


/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
////////////////////////         MAGIA POWSZECHNA          //////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
object CommonMagic {
    val DotykNaOdleglosc = Spell(
        name = "Dotyk na odległość",
        icon = "",
        power = 4,
        timeToCast = CastingTime.AKCJA,
        range = "12 metrów",
        componentName = "niewielki wachlarz",
        componentPower = 1,
        duration = "natychmiastowy",
        description = "Adept używa magicznej mocy, by poruszać i manipulować niewielkimi przedmiotami. Może siłą woli przesunąć każdy niezabezpieczony lekki przedmiot (Obciążenie 10 lub niższe) na odległość nie przekraczającą 12 metrów."
    )

    val PancerzEteru = Spell(
        name = "Pancerz Eteru",
        icon = "",
        power = 3,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "ogniwo kolczugi",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Adept splata wokół siebie Wiatry Magii, tworząc niewidzialną barierę, która chroni go przed zranieniem. Pancerz Eteru zapewnia dodatkowe Punkty Zbroi na każdej lokacji ciała adepta. Liczba dodatkowych PZ równa jest wartości jego Magii. Adept nie może rzucić tego czaru, jeśli nosi zbroję."
    )

    val MagicznaBron = Spell(
        name = "Magiczna broń",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "odrobina poświęconej wody",
        componentPower = 1,
        duration = "1 godzina",
        description = "Adept czerpie moc z Wiatrów Magii, zamykając ją w dowolnej broni białej (lub broni rzucanej) lub maksymalnie w pięciu pociskach do broni strzeleckiej. Nasycona mocą broń nie zadaje dodatkowych obrażeń, ale w trakcie trwania czaru jest traktowana jako broń magiczna."
    )

    val MagiczneZamkniecie = Spell(
        name = "Magiczne zamknięcie",
        icon = "",
        power = 7,
        timeToCast = CastingTime.TURA,
        range = "2 metry",
        componentName = "mały klucz",
        componentPower = 1,
        duration = "1 tydzień",
        description = "Zaklęcie to można nałożyć na dowolny zamek (skobel, zasuwkę, itp.), znajdujący się w odległości do 2 metrów od adepta. W trakcie trwania czaru zamka nie można otworzyć żadnym kluczem ani wytrychem, choć można wyważyć chronione w ten sposób drzwi."
    )

    val MagicznyAlarm = Spell(
        name = "Magiczny alarm",
        icon = "",
        power = 8,
        timeToCast = CastingTime.TURA,
        range = "zasięg widzenia",
        componentName = "mosiężny dzwoneczek",
        componentPower = 1,
        duration = "do wyzwolenia",
        description = "Adept ogniskuje moc w dowolnym miejscu. Jeśli ktokolwiek znajdzie się w odległości 2 metrów od tego miejsca, adept odbierze przekaz mentalny, który poinformuje go o tym, że ktoś wyzwolił efekt zaklęcia. Czar działa niezależnie od odległości."
    )

    val Uciszenie = Spell(
        name = "Uciszenie",
        icon = "",
        power = 10,
        timeToCast = CastingTime.AKCJA,
        range = "24 metry",
        componentName = "knebel",
        componentPower = 1,
        duration = "liczba rund równa wartości Magii adepta",
        description = "Adept splata Wiatry Magii w zamkniętą sferę ciszy, otaczając nią dowolną postać znajdującą się w odległości do 24 metrów. Ofiara może odeprzeć czar wykonując udany test Siły Woli. Nieudany test oznacza, że w trakcie trwania czaru postać nie wydaje żadnych dźwięków."
    )

    val PodniebnyChod = Spell(
        name = "Podniebny chód",
        icon = "",
        power = 11,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "orle pióro",
        componentPower = 2,
        duration = "1 runda",
        description = "Czar pozwala przez krótką chwilę chodzić w powietrzu jak po stałym gruncie. Adept może przebyć odległość równą potrojonej wartości jego Szybkości, a potem powoli opada na ziemię. Maksymalna wysokość wynosi 6 metrów."
    )

    val RozproszenieMagii = Spell(
        name = "Rozproszenie magii",
        icon = "",
        power = 13,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "12 metrów",
        componentName = "srebrny młoteczek",
        componentPower = 2,
        duration = "natychmiastowy",
        description = "Czar ten umożliwia rozproszenie efektu dowolnego zaklęcia, rzucanego lub działającego na obszarze w odległości do 12 metrów od adepta. Adept musi wykonać udany test splatania magii z modyfikatorem -10 za każdy punkt Magii postaci, która rzuciła czar będący celem rozproszenia."
    )

    val Wspinacz = Spell(
        name = "Wspinacz",
        icon = "",
        power = 7,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "kropla kleju",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii",
        description = "Dłonie i stopy adepta pokrywają się lepką substancją, która przykleja się do każdej powierzchni. W trakcie trwania czaru postać może się wspinać, jakby posiadała umiejętność wspinaczka ze specjalizacją +20."
    )

    val Wstrzas = Spell(
        name = "Wstrząs",
        icon = "",
        power = 8,
        timeToCast = CastingTime.AKCJA,
        range = "3 metry",
        componentName = "kawałek pokruszonej skały",
        componentPower = 1,
        duration = "natychmiastowy",
        description = "Grunt wokół adepta zaczyna drżeć jak podczas trzęsienia ziemi. Wszystkie stojące postacie w promieniu 3 metrów muszą wykonać udany test Zręczności, w przeciwnym wypadku padają na ziemię. Wstrząs nie działa na adepta, który rzucił to zaklęcie."
    )

    val Peta = Spell(
        name = "Pęta",
        icon = "",
        power = 10,
        timeToCast = CastingTime.AKCJA,
        range = "12 metrów",
        componentName = "kawałek liny",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii",
        description = "Niewidzialne pęta krępują dłonie dowolnej postaci w zasięgu 12 metrów, zmuszając ją do upuszczenia wszystkich trzymanych w rękach przedmiotów. W każdej turze ofiara może poświęcić pojedynczą akcję, aby rozerwać magiczne pęta."
    )

    val Przeskok = Spell(
        name = "Przeskok",
        icon = "",
        power = 11,
        timeToCast = CastingTime.AKCJA,
        range = "10 metrów",
        componentName = "pasikonik",
        componentPower = 2,
        duration = "natychmiastowy",
        description = "Adept znika, a po chwili pojawia się w dowolnym miejscu w zasięgu 10 metrów. W trakcie przeskoku przez chwilę przebywa w Eterze, co może zwrócić uwagę pomniejszego demona (10% szans). Czarodziejów przestrzega się przed zbyt częstym korzystaniem z tego zaklęcia."
    )

    val PalecBozy = Spell(
        name = "Palec boży",
        icon = "",
        power = 13,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "palec kapłana Sigmara",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii",
        description = "Adept magii splata Wiatry wokół siebie, otaczając się zasłoną, która chroni przed mutacjami. W trakcie trwania czaru otrzymuje modyfikator +10 do testów przeciwko wystąpieniu mutacji Chaosu."
    )

    val PowstrzymanieMutacji = Spell(
        name = "Powstrzymanie mutacji",
        icon = "",
        power = 15,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "mikstura lecznicza",
        componentPower = 2,
        duration = "liczba godzin równa wartości Magii",
        description = "Dotyk adepta powstrzymuje i na krótki czas likwiduje objawy mutacji u dowolnej postaci. Może ona wykonać test Siły Woli, aby odeprzeć zaklęcie. Jest to czar dotykowy, który nie działa na istoty ze zdolnością specjalną demoniczny byt."
    )

    val GlosKaznodziei = Spell(
        name = "Głos kaznodziei",
        icon = "",
        power = 4,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "róg byka",
        componentPower = 1,
        duration = "do zakończenia przemowy",
        description = "Głos wybranej postaci niesie się na pół kilometra, lecz nie jest ogłuszający dla osób stojących blisko. Zaklęcie trwa tak długo, aż postać skończy przemawiać. Kapłani używają go do wygłaszania kazań wobec wielkich tłumów."
    )

    val MocnePostanowienie = Spell(
        name = "Mocne postanowienie",
        icon = "",
        power = 8,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "symbol lordowskiej władzy",
        componentPower = 1,
        duration = "1 minuta (6 rund) albo do aktywacji",
        description = "Wybrana postać otrzymuje modyfikator +10 do następnego testu Siły Woli."
    )

    val Wytlumienie = Spell(
        name = "Wytłumienie",
        icon = "",
        power = 8,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "2 metry",
        componentName = "odprysk obsydianu",
        componentPower = 1,
        duration = "patrz opis",
        description = "Zaklęcie tymczasowo tłumi moc magicznego przedmiotu, sprawiając, że wydaje się zupełnie zwyczajny. Za każdy poziom sukcesu w teście splatania magii moc przedmiotu jest wytłumiona na jedną rundę."
    )

    val Anatema = Spell(
        name = "Anatema",
        icon = "",
        power = 10,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "12 metrów",
        componentName = "mały dzwoneczek",
        componentPower = 1,
        duration = "liczba godzin równa wartości Magii",
        description = "Kapłan wypowiada słowa inkantacji, pozostawiając znamię na duszy wybranej postaci. Choć niewidzialne, jest wyczuwane przez inne żywe istoty, wzbudzając w nich niepokój i wrogość. Postać otrzymuje modyfikator -20 do testów Ogłady."
    )

    val Slubowanie = Spell(
        name = "Ślubowanie",
        icon = "",
        power = 11,
        timeToCast = CastingTime.TURA,
        range = "dotykowy",
        componentName = "spisany tekst przysięgi",
        componentPower = 2,
        duration = "do wypełnienia lub złamania",
        description = "Postać będąca obiektem zaklęcia przysięga, że podejmie określone działanie lub powstrzyma się od niego. Jeśli złamie ślubowanie, natychmiast i permanentnie traci 1k10 punktów Odporności. Kapłanki Shallyi nigdy nie uczą się tego zaklęcia."
    )

    val BarieraCzystosci = Spell(
        name = "Bariera czystości",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "gałązka wiedźmiego ziela",
        componentPower = 2,
        duration = "liczba rund równa wartości Magii",
        description = "Kapłana otacza nagłe migocząca bariera błękitnej energii. Każda istota z mutacją Chaosu, która zamierza go zaatakować w walce wręcz, musi w każdej rundzie wykonywać udany test Siły Woli."
    )

    val Azyl = Spell(
        name = "Azyl",
        icon = "",
        power = 13,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "kłódka",
        componentPower = 2,
        duration = "liczba godzin równa wartości Magii",
        description = "Kapłan może rzucić to zaklęcie na pomieszczenie, w którym się znajduje. Żeby do niego wejść, każda istota musi wykonać udany Prosty (+10) test Siły Woli. Kapłani używają go często do ochrony świątyń."
    )

    val Wiez = Spell(
        name = "Więź",
        icon = "",
        power = 18,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "6 metrów",
        componentName = "srebrny łańcuszek o drobnych ogniwach",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii",
        description = "Zaklęcie pozwala utworzyć więź z chętnym adeptem magii, który znajduje się w zasięgu i ma dostęp do zaklęć z tej samej Dziedziny lub Tradycji. W trakcie trwania czaru adept otrzymuje +1 do poziomu uzyskanej mocy za każdy poziom sukcesu w teście splatania magii uzyskany przez towarzysza."
    )

    val KrwistyPlomien = Spell(
        name = "Krwisty płomień",
        icon = "",
        power = 14,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "12 metrów",
        componentName = "krew wampira",
        componentPower = 2,
        duration = "natychmiastowy",
        description = "Z ręki adepta tryska struga płonącej krwi, która podpala dowolny cel w zasięgu 12 metrów. Jest to magiczny pocisk o Sile 4. Maksymalna liczba celów równa jest wartości Magii adepta. Jeśli rzucającym jest wampir i straci 5 punktów Żywotności, może podwoić liczbę celów."
    )

    val Wazila = Spell(
        name = "Wazila",
        icon = "",
        power = 4,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "100 metrów",
        componentName = "podkowa",
        componentPower = 1,
        duration = "liczba godzin równa wartości Magii",
        description = "Adept jedną ręką trzyma dłoń nad swoim czołem i woła konia Kislevczyka. Konie czują ducha zwanego wazila, które w razie konieczności ostrzegają właściciela jeźdźca. Odmiany tego zaklęcia występują w każdej kislevskiej tradycji magii."
    )

    val BarieraDuchow = Spell(
        name = "Bariera duchów",
        icon = "",
        power = 12,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "4 metry",
        componentName = "krąg usypany z soli",
        componentPower = 2,
        duration = "liczba godzin równa wartości Magii",
        description = "Adept stawia niewidzialną barierę, która odstrasza duchy. Istota ze zdolnością widzenia eterycznych nie może wejść w zasięg zaklęcia, a jeśli już znajduje się wewnątrz bariery, następna akcja musi poświęcić na ucieczkę. Gdy adept się przemieści, zaklęcie się rozprasza. Odmiany tego zaklęcia występują w każdej kislevskiej tradycji magii."
    )

    val PobranieMocy = Spell(
        name = "Pobranie mocy",
        icon = "",
        power = 14,
        timeToCast = CastingTime.JEDNA_DZIESIEC_MINUT,
        range = "dotyk",
        componentName = "fiolka święconej lub oczyszczonej wody",
        componentPower = 2,
        duration = "natychmiastowy",
        description = "Adept może przejąć moc ze starożytnego magicznego miejsca: z kręgu monolitów, magicznego obelisku lub świętego gaju. Zaklęcie to służy jedynie do wzmocnienia odprawianego rytuału. Jeśli natychmiast po udanym rzuceniu Pobrania mocy postać użyje jej do wykonania innego rytuału, może dorzucić jedną kostkę do rzutu w celu określenia uzyskanego wyniku."
    )

    val PieknaMaska = Spell(
        name = "Piękna maska",
        icon = "",
        power = 16,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "osobisty",
        componentName = "zimowa róża",
        componentPower = 2,
        duration = "liczba godzin równa wartości Magii",
        description = "Magiczna moc zaklęcia ukrywa wszystkie skazy i niedoskonałości wyglądu. Adept wygląda, jakby miał dwadzieścia kilka lat, a ponadto jest znacznie atrakcyjniejszy niż w rzeczywistości. Ignoruje negatywne modyfikatory do Ogłady wynikające z wyglądu, starości, mutacji, sygnetów kapłańskich, piętien wiedźm i tajemnych, ubocznych skutków czarnoksięstwa oraz tym podobnych czynników. Po każdej rundzie, w której był silnie poturbany lub został uderzony, musi wykonać udany test Siły Woli, w przeciwnym razie maska iluzji się rozwiewa. To zaklęcie może być źródłem niepokojących opowieści o wiedźmach uwodzących mężczyzn gdzieś na dalekich rubieżach strony."
    )

}
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////         TRADYCJA CIENIA          //////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////

object ShadowTradition {
    // ŚCIEŻKA GŁÓWNA
    val GraPozorow = Spell(
        name = "Gra pozorów",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "oko potwora lub dowolny przedmiot najlepszej jakości",
        componentPower = 1,
        duration = "liczba godzin równa wartości Magii czarodzieja",
        description = "Czarodziej swoim dotykiem zaklina dowolny przedmiot (Obciążenie 75 lub mniejsze), nadając mu wygląd znacznie cenniejszego lub mniej wartościowego. Zaklęcie nie zmienia rzeczywistej struktury przedmiotu ani jego właściwości. W trakcie trwania czaru wszystkie testy wyceny zaczarowanego przedmiotu wykonywane są z modyfikatorem -20."
    )

    val Sobowtór = Spell(
        name = "Sobowtór",
        icon = "",
        power = 7,
        timeToCast = CastingTime.TRZY_AKCJE,
        range = "dotykowy",
        componentName = "pukiel włosów przedstawiciela rasy, w którą ma się przeobrazić czarodziej",
        componentPower = 1,
        duration = "liczba rund równa 10 x wartości Magii czarodzieja",
        description = "Czarodziej przybiera wygląd (wraz z ubraniem, zbroją, itp.) dowolnej żywej istoty humanoidalnej mającej poniżej 3 metrów wzrostu. Zaklęcie zmienia tylko wygląd zewnętrzny, nie modyfikuje wiedzy ani barwy głosu. Jeśli czarodziej chce przybrać wygląd konkretnej osoby, musi wykonać udany test splatania magii."
    )

    val LukaWPamieci = Spell(
        name = "Luka w pamięci",
        icon = "",
        power = 8,
        timeToCast = CastingTime.AKCJA,
        range = "48 metrów",
        componentName = "skrawki paznokci osoby będącej ofiarą czaru",
        componentPower = 1,
        duration = "trwały",
        description = "Czarodziej omiata magicznym strumieniem Cienia dowolną postać w zasięgu 48 metrów. Po przegranym przeciwstawnym teście Siły Woli wskazana postać natychmiast zapomina o czarodzieju i wszelkich wydarzeniach z nim związanych, których była świadkiem. Od tego momentu będzie traktować czarodzieja jak obcą osobę."
    )

    val RumakZCieni = Spell(
        name = "Rumak z cieni",
        icon = "",
        power = 11,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "6 metrów",
        componentName = "odprysk podkowy zdechłego konia",
        componentPower = 2,
        duration = "do świtu lub do pierwszego dłuższego postoju",
        description = "Czarodziej przyzywa utkanego z cieni wierzchowca, który potrafi bezszelestnie i bez wytchnienia biec aż do momentu wygaśnięcia zaklęcia. Rumak posiada współczynniki konia wierzchowego oraz umiejętności: ukrywanie się (+30) i nawigacja. Może galopować bez ustanku, nie męcząc się."
    )

    val MaskaIluzji = Spell(
        name = "Maska iluzji",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "szkic wyobrażający planowaną czynność",
        componentPower = 2,
        duration = "1k10 rund",
        description = "Czarodziej okrywa się magiczną iluzją, która umożliwia mu wykonywanie dowolnych działań przy zachowaniu wrażenia, że robi coś zupełnie innego. Jeżeli zamierzona czynność obejmuje działaniem inną postać, cel czaru może wykonać test Inteligencji, by się zorientować. Udane rzucenie zaklęcia pozwala zamaskować fakt użycia magii."
    )

    val Dusiciel = Spell(
        name = "Dusiciel",
        icon = "",
        power = 13,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "12 metrów",
        componentName = "garota, którą uduszono człowieka",
        componentPower = 2,
        duration = "wymaga podtrzymywania",
        description = "Macki oleistej czerni owijają się wokół dowolnej postaci w zasięgu 12 metrów, dusząc ją. Udany test Odporności pozwala odeprzeć czar. Czarodziej może podtrzymywać zaklęcie, ale w każdej rundzie test staje się trudniejszy (-10). Po nieudanym teście ofiara otrzymuje obrażenia rosnące co rundę (Siła 1, 2, 3...)."
    )

    val CalunNiewidzialnosci = Spell(
        name = "Całun niewidzialności",
        icon = "",
        power = 17,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "nić babiego lata",
        componentPower = 2,
        duration = "1k10 rund",
        description = "Czarodziej staje się niewidzialny. Nie może być celem ataków bronią strzelecką ani magicznymi pociskami. Otrzymuje +20 do Walki Wręcz. Postacie w odległości do 4 metrów mogą wykonać Trudny (-20) test spostrzegawczości, by wykryć go słuchem/węchem i atakować z -30 do trafienia."
    )

    val ZludzenieSmieci = Spell(
        name = "Złudzenie śmierci",
        icon = "",
        power = 18,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "6 metrów",
        componentName = "całun, który co najmniej rok spoczywał w grobie",
        componentPower = 2,
        duration = "liczba dni równa wartości Magii czarodzieja",
        description = "Czarodziej sprawia, że dowolna postać wygląda jak nieżywa - jest zimna w dotyku i nie ma tętna. Postać zachowuje możliwość postrzegania, ale nie może się przemieszczać. Potrzebuje powietrza, pożywienia i wody. Postać może odeprzeć czar udanym testem Siły Woli."
    )

    val SztyletyCienia = Spell(
        name = "Sztylety cienia",
        icon = "",
        power = 21,
        timeToCast = CastingTime.AKCJA,
        range = "48 metrów",
        componentName = "nóż ze skuwanego na zimno żelaza",
        componentPower = 3,
        duration = "chwilowy",
        description = "Czarodziej tworzy z cienia kilka sztyletów (tyle, ile wynosi jego Magia) i może rzucić nimi w przeciwników w zasięgu 48 metrów. Są to magiczne pociski zadające obrażenia o Sile 3. Sztylety są niematerialne i przebijają każdą niemagiczną zbroję."
    )

    val Iluzja = Spell(
        name = "Iluzja",
        icon = "",
        power = 24,
        timeToCast = CastingTime.TRZY_AKCJE,
        range = "48 metrów",
        componentName = "kryształowy pryzmat",
        componentPower = 3,
        duration = "liczba rund równa wartości Magii czarodzieja, można przedłużyć",
        description = "Czarodziej tworzy w zasięgu 48 metrów niemal doskonałą iluzję (wzrokową, dźwiękową, zapachową) zajmującą obszar o średnicy 10 metrów. Postać podejrzewająca podstęp może wykonać test Inteligencji. Czarodziej może przedłużać działanie czaru akcją zwykłą i testem SW, ale rzucenie innego zaklęcia kończy iluzję."
    )

    // ŚCIEŻKA MISTYCZNA
    val ZwodniczyWyglad = Spell(
        name = "Zwodniczy wygląd",
        icon = "",
        power = 7,
        timeToCast = CastingTime.AKCJA,
        range = "12 metrów",
        componentName = "trochę kosmetyków najlepszej jakości",
        componentPower = 1,
        duration = "liczba godzin równa wartości Magii czarodzieja",
        description = "Czarodziej manipuluje strumieniami Ulgu, zmieniając wygląd wybranej postaci. Postać wygląda bardziej lub mniej atrakcyjnie, otrzymując modyfikator ±10 do Ogłady. Postać może próbować odeprzeć czar przeciwstawnym testem Siły Woli. Jest to czar dotykowy."
    )

    val Incognito = Spell(
        name = "Incognito",
        icon = "",
        power = 9,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "garść czegokolwiek",
        componentPower = 1,
        duration = "do utraty świadomości przez czarodzieja",
        description = "Czarodziej przestaje być zauważany przez inne osoby (nie niewidzialność, lecz brak uwagi). Postać musi pokonać czarodzieja w przeciwstawnym teście Siły Woli, by do niego podejść lub porozmawiać. Po rozstaniu ma problemy z przypomnieniem szczegółów spotkania."
    )

    val PalacyDotykCienia = Spell(
        name = "Palący dotyk cienia",
        icon = "",
        power = 14,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "18 metrów",
        componentName = "dawka czarnego lotosu wyrosłego w cieniu",
        componentPower = 2,
        duration = "1k10 rund",
        description = "Cienie wokół czarodzieja nasycone magiczną mocą zaczynają palić niczym kwas. Dowolna postać w zasięgu 18 metrów znajdująca się w rzeczywistym cieniu otrzymuje trafienie z Siłą 3. Sama postać musi znajdować się w cieniu powstałym przez przesłonięcie źródła światła."
    )

    val ZlowieszczyCien = Spell(
        name = "Złowieszczy cień",
        icon = "",
        power = 15,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "skrawek szaty upiora",
        componentPower = 3,
        duration = "1 minuta (6 rund)",
        description = "Czarodziej okrywa się iluzją, przybierając przerażający wygląd wcielenia śmierci. W trakcie trwania czaru wzbudza Strach."
    )

    val MateriaCienia = Spell(
        name = "Materia cienia",
        icon = "",
        power = 22,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "idealnie okrągły kawałek aksamitu",
        componentPower = 2,
        duration = "dopóki cel pozostaje w cieniu",
        description = "Postać lub obiekt (Obciążenie ≤200) całkowicie pogrążone w cieniu stają się niewidzialne, niesłyszalne i częściowo bezcielesne. Inne osoby nie mogą ich dotykać ani atakować, ale zaczarowana osoba może normalnie oddziaływać na otoczenie. Czar działa tylko w rzeczywistym cieniu."
    )

    // ŚCIEŻKA ŻYWIOŁU
    val PlaszczCieni = Spell(
        name = "Płaszcz cieni",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "kawałek węgla drzewnego",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii czarodzieja",
        description = "Czarodziej przywołuje moc Ulgu, która okrywa jego ciało zasłoną utkaną z cieni. W trakcie trwania zaklęcia czarodziej otrzymuje modyfikator +20 do testów ukrywania się."
    )

    val Oszolomienie = Spell(
        name = "Oszołomienie",
        icon = "",
        power = 8,
        timeToCast = CastingTime.AKCJA,
        range = "24 metry",
        componentName = "trochę piwa",
        componentPower = 1,
        duration = "liczba rund równa wartości Magii czarodzieja",
        description = "Czarodziej mocą umysłu ogłupia postać w zasięgu 24 metrów. Ofiara może odeprzeć czar testem Siły Woli. Nieudany test oznacza oszołomienie - losowy efekt: otępienie (1 akcja/rundę), ucieczka, atak najbliższej postaci, paraliż lub lęk (bezbronna)."
    )

    val StrefaMroku = Spell(
        name = "Strefa mroku",
        icon = "",
        power = 15,
        timeToCast = CastingTime.AKCJA,
        range = "48 metrów",
        componentName = "oczy salamandry",
        componentPower = 2,
        duration = "liczba rund równa wartości Magii czarodzieja",
        description = "Czarodziej tworzy obszar nieprzeniknionej ciemności w zasięgu 48 metrów. Wszystkie postacie w promieniu 3 metrów wokół wskazanego miejsca przestają widzieć cokolwiek, nawet jeśli posiadają zdolność widzenia w ciemności."
    )

    val PrzerazajacyWyglad = Spell(
        name = "Przerażający wygląd",
        icon = "",
        power = 21,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "skrawek szaty upiora",
        componentPower = 3,
        duration = "1 minuta (6 rund)",
        description = "Czarodziej przybiera wygląd przerażającej istoty. W trakcie trwania czaru wzbudza Grozę."
    )

    val StrefaZametu = Spell(
        name = "Strefa zamętu",
        icon = "",
        power = 27,
        timeToCast = CastingTime.AKCJA,
        range = "24 metry",
        componentName = "oczy chimery",
        componentPower = 3,
        duration = "chwilowy",
        description = "Potężniejsza wersja zaklęcia oszołomienie działająca na obszar w zasięgu 24 metrów. Wszystkie postacie w promieniu 5 metrów wokół wskazanego miejsca muszą wykonać test Siły Woli. Nieudany test oznacza zachowanie jak pod wpływem czaru oszołomienie."
    )
}
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////         TRADYCJA METALU          //////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////

object MetalTradition {
    // ŚCIEŻKA GŁÓWNA
    val ZaporaZeStali = Spell(
        name = "Zapora ze stali",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "stalowa kula",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Czarodziej skupia moc wokół siebie, otaczając się zaporą wirujących stalowych kul. W trakcie trwania czaru wszystkie wymierzone w niego ataki wykonywane są z modyfikatorem -10 do WW lub US."
    )

    val Skaza = Spell(
        name = "Skaza",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "24 metry",
        componentName = "niewielki pilnik do metalu",
        componentPower = 1,
        duration = "1k10 rund",
        description = "Czarodziej nieznacznie zmienia wytrzymałość i strukturę dowolnego egzemplarza broni w zasięgu 24 metrów. W trakcie trwania czaru oręż traci wszelkie korzystne cechy, władająca nim osoba otrzymuje -10 do WW/US. Skaza nasila też wady oręża - broń szybciej się zacina i wybucha."
    )

    val AlchemicznaWizja = Spell(
        name = "Alchemiczna wizja",
        icon = "",
        power = 11,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "dotykowy",
        componentName = "soczewka",
        componentPower = 2,
        duration = "chwilowy",
        description = "Pod dotykiem czarodzieja metalowy przedmiot odsłania swoją przeszłość, umożliwiając zobaczenie momentu jego wykuwania lub tworzenia. Udany test Inteligencji pozwala przypomnieć sobie dodatkowe szczegóły wizji. Jest to czar dotykowy."
    )

    val SrzebrzystemStrzalyArha = Spell(
        name = "Srebrzyste strzały Arha",
        icon = "",
        power = 13,
        timeToCast = CastingTime.AKCJA,
        range = "48 metrów",
        componentName = "srebrny grot strzały",
        componentPower = 2,
        duration = "chwilowy",
        description = "Czarodziej kształtuje moc, tworząc kilka magicznych strzał z czystego srebra (tyle, ile wynosi wartość jego Magii). Może nimi cisnąć w jednego lub kilku przeciwników w zasięgu 48 metrów. Strzały są magicznymi pociskami o Sile 3 i znikają po uderzeniu."
    )

    val TajemneRyty = Spell(
        name = "Tajemne ryty",
        icon = "",
        power = 14,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "fiolka atramentu z płatkami złota",
        componentPower = 3,
        duration = "trwały",
        description = "Zaklęcie działa podobnie jak inskrypcja, ale pozwala zapisać tajemną wiadomość niewidzialną przy oględzinach. Odczytanie wymaga ponownego rzucenia czaru. Czarodzieje Kolegium Złota często używają tego do wymiany wiadomości."
    )

    val Postarzenie = Spell(
        name = "Postarzenie",
        icon = "",
        power = 15,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "2 metry",
        componentName = "skamieniała kość",
        componentPower = 2,
        duration = "liczba minut równa 1 + wartość Magii czarodzieja",
        description = "Magiczne strumienie Chamon przepływają przez dowolny przedmiot, osłabiając jego strukturę. Ciężar i wygląd nie ulegają zmianie, ale przedmiot staje się wyjątkowo kruchy. Obniża to trudność uszkodzenia go lub zniszczenia (zwykle o 1k10/2 stopnie trudności)."
    )

    val MetodaProbIBledow = Spell(
        name = "Metoda prób i błędów",
        icon = "",
        power = 16,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "12 metrów",
        componentName = "pusta szklana fiolka",
        componentPower = 2,
        duration = "1 runda",
        description = "Czarodziej używa magii, by kierować poczynaniami wszystkich swoich towarzyszy w zasięgu 12 metrów. W trakcie trwania czaru każdy z nich może przerzucić wynik pojedynczego testu lub rzutu na obrażenia. Wynik drugiego rzutu jest ostateczny."
    )

    val Umagicznienie = Spell(
        name = "Umagicznienie",
        icon = "",
        power = 21,
        timeToCast = CastingTime.TURA,
        range = "dotykowy",
        componentName = "pióro gryfa",
        componentPower = 3,
        duration = "1 godzina",
        description = "Czarodziej zamyka magiczną energię w dowolnym przedmiocie. Posiadacz otrzymuje +5 do dowolnej cechy związanej z podstawową funkcją przedmiotu (np. magiczny miecz zwiększy WW, pierścień da bonus do Ogłady). Przedmiot może być pod wpływem tylko jednego umagicznienia."
    )

    val PoznanieTajemnic = Spell(
        name = "Poznanie tajemnic",
        icon = "",
        power = 22,
        timeToCast = CastingTime.TURA,
        range = "dotykowy",
        componentName = "drachma sproszkowanej czerwonej siarki",
        componentPower = 3,
        duration = "1 godzina",
        description = "Zaklęcie umożliwia poznanie wszelkich zwyczajnych właściwości dowolnego przedmiotu, włącznie z budową i składnikami użytymi do jego stworzenia. Jest to czar dotykowy pozwalający na pełną analizę struktury obiektu."
    )

    val TlumieniemagII = Spell(
        name = "Tłumienie magii",
        icon = "",
        power = 26,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "24 metry",
        componentName = "niewielka ozdobna pochwa ze złota o wartości przynajmniej 75zk",
        componentPower = 3,
        duration = "1k10 rund",
        description = "Czarodziej przyzywa moc Chamon, owijając jej pasami dowolny magiczny przedmiot w odległości do 24 metrów. W trakcie trwania czaru przedmiot traci swoje magiczne właściwości."
    )

    // ŚCIEŻKA MISTYCZNA
    val PodsycenieOgnia = Spell(
        name = "Podsycenie ognia",
        icon = "",
        power = 4,
        timeToCast = CastingTime.AKCJA,
        range = "24 metry",
        componentName = "gorący podmuch powietrza",
        componentPower = 1,
        duration = "1k10 x 10 minut",
        description = "Czarodziej wzmacnia strumieniami magii ogień w kuźni, palenisku lub innym źródle ognia wewnątrz sztucznie wzniesionej konstrukcji. W trakcie trwania czaru ogień płonie z pełną siłą, bez potrzeby dorzucania opału, węgla, drew itp."
    )

    val Inskrypcja = Spell(
        name = "Inskrypcja",
        icon = "",
        power = 7,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "dłuto",
        componentPower = 1,
        duration = "trwały",
        description = "Przesuwając dłonią ponad metalową powierzchnią, czarodziej może umieścić na niej inskrypcję. Każde dwanaście wyrazów powyżej pierwszego tuzina wydłuża czas rzucania o kolejną akcję podwójną. Inskrypcja zapisana jest w stylu charakterystycznym dla czarodzieja."
    )

    val SztywnoscCialaIUmyslu = Spell(
        name = "Sztywność ciała i umysłu",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "niewielki stalowy dysk",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii czarodzieja",
        description = "Ciało i umysł czarodzieja nabierają właściwości metalu. Skóra zapewnia dodatkowy 1 PZ na każdej lokacji (max 5 PZ), +10 do Siły Woli, ale czarodziej odczuwa opór przeciwko zmianie raz podjętej decyzji."
    )

    val ZlotoGlupcow = Spell(
        name = "Złoto głupców",
        icon = "",
        power = 17,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "skamieniały kwiat",
        componentPower = 2,
        duration = "liczba godzin równa wartości Magii czarodzieja",
        description = "Czarodziej zmienia wygląd dowolnego przedmiotu, sprawiając że zdaje się być znacznie cenniejszy. Pensy wyglądają jak złote korony, zardzewiały miecz jak oręż króla. W trakcie trwania czaru wartość przedmiotu wzrasta 10-krotnie."
    )

    // ŚCIEŻKA ŻYWIOŁU
    val PrawoLogiki = Spell(
        name = "Prawo logiki",
        icon = "",
        power = 7,
        timeToCast = CastingTime.DZIESIECAKCJIPODWOJNYCH,
        range = "12 metrów",
        componentName = "czysta karta papieru",
        componentPower = 1,
        duration = "5 minut lub do momentu wykonania wybranego testu",
        description = "Czarodziej czerpie moc z Wiatru Magii, by znaleźć logiczne rozwiązanie problemu. Czarodziej lub towarzysz w zasięgu 12 metrów otrzymuje +20 do dowolnego testu umiejętności lub cechy. Losowy czas rzucania odpowiada rozważaniom nad naturą problemu."
    )

    val Korozja = Spell(
        name = "Korozja",
        icon = "",
        power = 9,
        timeToCast = CastingTime.AKCJA,
        range = "12 metrów",
        componentName = "zardzewiały ćwiek",
        componentPower = 1,
        duration = "chwilowy",
        description = "Czarodziej sprawia, że dowolny metalowy przedmiot w odległości do 12 metrów koroduje i rdzewieje, stając się przez to bezużyteczny."
    )

    val Utwardzenie = Spell(
        name = "Utwardzenie",
        icon = "",
        power = 8,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "żelazny pręt",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii czarodzieja",
        description = "Magiczne strumienie Chamon przepływają przez przedmiot, wzmacniając jego strukturę. Przedmiot w dotyku wydaje się metalowy, zwiększa się jego Obciążenie i wytrzymałość. Wszystkie modyfikatory ustala MG."
    )

    val PancerzZOlowiu = Spell(
        name = "Pancerz z ołowiu",
        icon = "",
        power = 14,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "45 metrów",
        componentName = "miniaturowy hełm z ołowiu",
        componentPower = 2,
        duration = "1 minuta (6 rund)",
        description = "Czarodziej otacza magią grupę przeciwników. Ich zbroje stają się ciężkie jak ołów. Wszystkie postacie w pancerzu w promieniu 5 metrów otrzymują -10 do WW, US i Zręczności oraz -1 do Szybkości."
    )

    val PrzeksztalcenieMetalu = Spell(
        name = "Przekształcenie metalu",
        icon = "",
        power = 18,
        timeToCast = CastingTime.TURA,
        range = "dotykowy",
        componentName = "talizman w kształcie młota i kowadła",
        componentPower = 2,
        duration = "trwały",
        description = "Czarodziej przemienia dowolny metalowy przedmiot w inny (bez zmiany rodzaju metalu). Jakość zależy od testu splatania magii: najlepsza (-30), dobra (-20), zwykła (0), kiepska (porażka). Jest to czar dotykowy, nie działa na przedmioty magiczne."
    )

    val SilaUmyslu = Spell(
        name = "Siła umysłu",
        icon = "",
        power = 23,
        timeToCast = CastingTime.DZIESIECMINUT,
        range = "dotykowy",
        componentName = "strona z księgi napisanej przez szaleńca",
        componentPower = 3,
        duration = "chwilowy",
        description = "Czarodziej korzysta z mocy umysłu, by uzdrowić obłąkaną postać. Udany test splatania magii: postać traci 1k10 Punktów Obłędu. Nieudany: otrzymuje 1k10 PO. Jest to czar dotykowy, nie działa na zwierzęta, czarodziej nie może go rzucić na siebie."
    )
}
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////         TRADYCJA NIEBIOS          /////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////

object HeavensTradition {
    // ŚCIEŻKA GŁÓWNA
    val Wrozba = Spell(
        name = "Wróżba",
        icon = "",
        power = 4,
        timeToCast = CastingTime.TURA,
        range = "zasięg wzroku",
        componentName = "wątroba małego zwierzęcia",
        componentPower = 1,
        duration = "2k10 godzin",
        description = "Czarodziej wróży z gwiazd, przepowiadając najbliższą przyszłość. Po rzuceniu czaru może spróbować określić, czy dana chwila sprzyja wykonaniu określonego działania. MG wykonuje w tajemnicy test Inteligencji - udany oznacza trafną przepowiednię, nieudany błędną (choć BG nie zdaje sobie z tego sprawy)."
    )

    val NiebianskaBuneta = Spell(
        name = "Niebiańska luneta",
        icon = "",
        power = 8,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "ziarenko czystego piasku",
        componentPower = 1,
        duration = "dopóki czarodziej nie rozproszy zaklęcia",
        description = "Czarodziej zawiesza przed sobą nieruchomą magiczną soczewkę, która przybliża obraz. Zapewnia +20 do testów obserwowania odległych obiektów, przy ograniczonej widoczności +10. Używane do obserwacji nieba, budowli, krajobrazu czy osób."
    )

    val Blyskawica = Spell(
        name = "Błyskawica",
        icon = "",
        power = 10,
        timeToCast = CastingTime.AKCJA,
        range = "36 metrów",
        componentName = "kamerton",
        componentPower = 1,
        duration = "chwilowy",
        description = "Czarodziej ciska błyskawicą w dowolnego przeciwnika znajdującego się w odległości do 36 metrów. Jest to magiczny pocisk o Sile 3."
    )

    val Prejasnienie = Spell(
        name = "Przejaśnienie",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "zasięg wzroku",
        componentName = "fiolka z zamkniętym w środku oddechem orła",
        componentPower = 3,
        duration = "zależny od pogody",
        description = "Strumienie Azyr usuwają z nieba wybraną chmurę lub tworzą prześwit o promieniu 50 metrów przy zachmurzeniu. Rzucony w czasie deszczu powstrzymuje na krótko opady. Długość obserwacji zależy od pogody, gdyż chmury mogą się ponownie uformować."
    )

    val LaskaLosu = Spell(
        name = "Łaska losu",
        icon = "",
        power = 13,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "24 metry",
        componentName = "królicza łapka",
        componentPower = 2,
        duration = "do następnego dnia",
        description = "Postać wskazana przez czarodzieja natychmiast uzyskuje Punkty Szczęścia w takiej liczbie, jaką otrzymałaby następnego dnia. Jednak następnego dnia nie otrzymuje żadnych PS - dopiero dzień później wraca do normalnych zasad. Nie działa ponownie na tę samą osobę do odzyskania PS."
    )

    val Klatwa = Spell(
        name = "Klątwa",
        icon = "",
        power = 16,
        timeToCast = CastingTime.AKCJA,
        range = "24 metry",
        componentName = "pęknięte zwierciadło",
        componentPower = 2,
        duration = "24 godziny",
        description = "Czarodziej rzuca klątwę na postać w zasięgu 24 metrów. Ofiara otrzymuje -10 do wszystkich testów, wszystkie wymierzone w nią ataki zadają dodatkowy 1 punkt obrażeń. Postać może być pod wpływem tylko jednej klątwy jednocześnie."
    )

    val ProjekcjaAstralna = Spell(
        name = "Projekcja astralna",
        icon = "",
        power = 18,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "dotykowy",
        componentName = "szczypta chrzanu",
        componentPower = 2,
        duration = "liczba godzin równa wartości Magii czarodzieja",
        description = "Czarodziej uwalnia swego ducha, który staje się niewidzialny, ale zachowuje słuch i wzrok. Nie może wpływać na obiekty fizyczne, latać ani przenikać przez ściany. Może przechodzić przez otwory. Musi powrócić przed upływem czasu - inaczej test SW (-20) lub 1 PO."
    )

    val ZnakiNaNiebie = Spell(
        name = "Znaki na niebie",
        icon = "",
        power = 24,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "zasięg wzroku",
        componentName = "fiolka z inkaustem zrobionym z krwi orła",
        componentPower = 3,
        duration = "trwały",
        description = "Czarodziej zapisuje wiadomość w gwiazdach. Informacja jest ogólnikowa i może służyć jako szyfr. Rozpoznanie wymaga testu nauki (astronomia). Czarodzieje Kolegium Niebios używają szyfru znaków do przekazywania informacji o zagrożeniach i wielkich wydarzeniach."
    )

    val Nawalnica = Spell(
        name = "Nawałnica",
        icon = "",
        power = 25,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "48 metrów",
        componentName = "chorągiewka służąca do ustalania kierunku i siły wiatru",
        componentPower = 3,
        duration = "chwilowy",
        description = "Czarodziej przywołuje magiczną burzę z piorunami na obszar w zasięgu 48 metrów. Nawałnica może pojawić się wszędzie, także w zamkniętych pomieszczeniach. Wszystkie postacie w promieniu 5 metrów otrzymują trafienie z Siłą 5."
    )

    val MrocznePrzeznaczenie = Spell(
        name = "Mroczne przeznaczenie",
        icon = "",
        power = 31,
        timeToCast = CastingTime.GODZINA,
        range = "kilometr",
        componentName = "pętla wisielca",
        componentPower = 3,
        duration = "trwały",
        description = "Czarodziej splata moc Chaosu wokół pukla włosów lub kropel krwi istoty w zasięgu 1 km. Ofiara wykonuje Bardzo Trudny (-30) test SW - porażka oznacza utratę 1 PP. Bez PP następne trafienie krytyczne ma automatycznie WK +10. Wszyscy czarodzieje w promieniu 3 km wyczuwają zakłócenie Eteru."
    )

    // ŚCIEŻKA MISTYCZNA
    val Wypolerowanie = Spell(
        name = "Wypolerowanie",
        icon = "",
        power = 4,
        timeToCast = CastingTime.AKCJA,
        range = "12 metrów",
        componentName = "czysta szmatka",
        componentPower = 1,
        duration = "trwały",
        description = "Czar umożliwia oczyszczenie i wypolerowanie dowolnego przedmiotu służącego do obserwacji - szyby, lunety, lustra itp. Młodzi adepci używają go potajemnie do czyszczenia instrumentów starszych astrologów, a potem lekko brudzą powierzchnię, by zamaskować magiczny efekt."
    )

    val MowaPtakow = Spell(
        name = "Mowa ptaków",
        icon = "",
        power = 10,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "ptasi język",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii czarodzieja",
        description = "Czarodziej zyskuje umiejętność rozumienia i przemawiania w języku ptaków. Ptaki nie muszą rozmawiać, mogą kłamać lub żądać przysługi. Czarodziej zyskuje instynktowną wiedzę o zachowaniu ptaków - może się dowiedzieć, dlaczego stado zachowuje się w określony sposób."
    )

    val TrzecieProroctwoAmul = Spell(
        name = "Trzecie proroctwo Amul",
        icon = "",
        power = 14,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "dotykowy",
        componentName = "kropla własnej krwi",
        componentPower = 1,
        duration = "24 godziny lub do wykorzystania przerzutu",
        description = "Czarodziej odczytuje znaki przyszłości. Jeśli otrzyma trafienie krytyczne, rzut w Tabeli: Trafienie krytyczne zostaje automatycznie powtórzony i może wybrać lepszy wynik. Nie może ponownie rzucić zaklęcia do wykorzystania przerzutu."
    )

    val Przeczucie = Spell(
        name = "Przeczucie",
        icon = "",
        power = 16,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "królicza łapka",
        componentPower = 2,
        duration = "24 godziny lub do wykorzystania przerzutu",
        description = "Czarodziej odgaduje przebieg przyszłych wydarzeń. Otrzymuje dodatkowy Punkt Szczęścia, który może wykorzystać do powtórzenia dowolnego nieudanego testu. Nie działa ponownie na tę samą osobę do wykorzystania PS."
    )

    val Lokalizacja = Spell(
        name = "Lokalizacja",
        icon = "",
        power = 21,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "ukruszona soczewka",
        componentPower = 3,
        duration = "liczba minut równa wartości Magii czarodzieja",
        description = "Znaki na niebie pomagają określić miejsce zagubionego przedmiotu. Może być ogólny ('koń', 'czysta woda') lub konkretny ('moja sakiewka'). Ujawnia kierunek, ale nie odległość. Dla konkretnych przedmiotów czarodziej musi je znać osobiście. Podaje kierunek w linii prostej."
    )

    // ŚCIEŻKA ŻYWIOŁU
    val PierwszeProroctwoAmul = Spell(
        name = "Pierwsze proroctwo Amul",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "odłamek szkła",
        componentPower = 1,
        duration = "1 runda",
        description = "Czarodziej przepowiada najbliższą przyszłość, wróżąc z sobie tylko widocznych znaków na niebie. W swojej następnej turze gracz może przerzucić wynik jednej kostki użytej podczas dowolnego rzutu (test, obrażenia, poziom mocy itp.)."
    )

    val DrugieProroctwoAmul = Spell(
        name = "Drugie proroctwo Amul",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "odłamek barwionego szkła",
        componentPower = 2,
        duration = "1 godzina lub do wykorzystania obu przerzutów",
        description = "Zaklęcie działa podobnie jak Pierwsze proroctwo Amul, z tą różnicą że gracz może powtórzyć rzuty dowolnych dwóch kostek."
    )

    val PodmuchWiatru = Spell(
        name = "Podmuch wiatru",
        icon = "",
        power = 14,
        timeToCast = CastingTime.AKCJA,
        range = "48 metrów",
        componentName = "zwierzęcy pęcherz",
        componentPower = 2,
        duration = "liczba rund równa wartości Magii czarodzieja",
        description = "Czarodziej przyzywa gwałtowny wicher na obszar w zasięgu 48 metrów. Postacie w promieniu 5 metrów przewracają się i wykonują test Odporności (porażka = ogłuszenie na 1 rundę). Nie można używać broni strzeleckiej. Poruszanie wymaga testu Krzepy, ataki wręcz z -20."
    )

    val NiebianskieSkrzydla = Spell(
        name = "Niebiańskie skrzydła",
        icon = "",
        power = 15,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "gołębie pióro",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii czarodzieja",
        description = "Czarodziej przywołuje moc niebios, która unosi go w powietrze. W trakcie trwania czaru może latać z Szybkością 6. Czarodziej może rzucić to zaklęcie tylko na siebie."
    )

    val GwiezdnyBlask = Spell(
        name = "Gwiezdny blask",
        icon = "",
        power = 22,
        timeToCast = CastingTime.TRZY_AKCJE,
        range = "45 metrów",
        componentName = "mapa gwiezdna",
        componentPower = 3,
        duration = "liczba minut równa wartości Magii czarodzieja",
        description = "Czarodziej przywołuje światło gwiazd. Wskazany obszar w promieniu 45 metrów zostaje oświetlony łagodnym blaskiem, który rozprasza ciemność (zwykłą i magiczną), ujawnia niewidzialne lub ukryte postacie oraz odkrywa tajemne przejścia i skrytki."
    )
}

/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////         TRADYCJA OGNIA            /////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////

object FireTradition {
    // ŚCIEŻKA GŁÓWNA
    val Przypalenie = Spell(
        name = "Przypalenie",
        icon = "",
        power = 4,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "kawałek węgla drzewnego",
        componentPower = 1,
        duration = "chwilowy",
        description = "Czarodziej kładzie dłonie na otwartej ranie i wypala ją dotykiem. Nie przywraca to punktów Żywotności, ale jest traktowane jako pomoc medyczna, która może ocalić od śmierci ciężko ranną postać. Ten czar przydaje się też do innych celów, na przykład można za jego pomocą kogoś napiętnować."
    )

    val OgnistKorona = Spell(
        name = "Ognista korona",
        icon = "",
        power = 8,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "złota moneta",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii czarodzieja",
        description = "Nad głową czarodzieja pojawia się korona z płomieni. W trakcie trwania czaru czarodziej otrzymuje modyfikator +20 do testów dowodzenia i zastraszania. Każdy przeciwnik, który zamierza zaatakować go w walce wręcz, musi wykonać test Siły Woli. Nieudany test oznacza, że strach uniemożliwił mu zaatakowanie czarodzieja i musi wykonać inną akcję. Korona zapewnia tyle światła co zwykła pochodnia i może zostać użyta do podpalenia łatwopalnych materiałów. Czarodziej nie otrzymuje żadnych obrażeń od ognistej korony."
    )

    val OgnistaKula = Spell(
        name = "Ognista kula",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA,
        range = "45 metrów",
        componentName = "bryłka siarki",
        componentPower = 2,
        duration = "chwilowy",
        description = "Czarodziej tworzy kilka ognistych kul (tyle, ile wynosi wartość jego Magii). Może cisnąć nimi w jednego lub w kilku przeciwników znajdujących się w promieniu 45 metrów. Ogniste kule są magicznymi pociskami o Sile 3."
    )

    val TarczaAqshy = Spell(
        name = "Tarcza Aqshy",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "żelazny amulet",
        componentPower = 2,
        duration = "1k10 minut",
        description = "Czarodziej otacza się wirującymi strumieniami czerwonego Wiatru Magii, które chronią go przed płomieniami. W trakcie trwania czaru otrzymuje modyfikator +20 do Odporności przeciwko ognistym atakom (zionięcie smoka, ogniste kule, itp.). Czarodziej może rzucić to zaklęcie wyłącznie na siebie."
    )

    val GorejacyMiecz = Spell(
        name = "Gorejący miecz",
        icon = "",
        power = 14,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "pochodnia",
        componentPower = 2,
        duration = "liczba rund równa wartości Magii czarodzieja, ale może on przedłużyć działanie czaru, wykonując udany test Siły Woli w każdej kolejnej rundzie",
        description = "W dłoni czarodzieja pojawia się ognisty miecz. Traktuje się go jako broń magiczną z cechą oręża 'druzgoczący' i Siłą 4. W trakcie trwania czaru czarodziej otrzymuje +1 do Ataków."
    )

    val ZarSerc = Spell(
        name = "Żar serc",
        icon = "",
        power = 16,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "30 metrów",
        componentName = "fiolka z mieszanką krwi i oleju",
        componentPower = 2,
        duration = "10 minut",
        description = "Czarodziej rozpala gniew w sercach swoich towarzyszy znajdujących się w promieniu 30 metrów. W trakcie trwania czaru otrzymują oni modyfikator +20 do Siły Woli podczas testów Strachu i Grozy. Jeśli oddalą się od czarodzieja na odległość przekraczającą 30 metrów, czar przestaje na nich działać."
    )

    val OgnistyPodmuch = Spell(
        name = "Ognisty podmuch",
        icon = "",
        power = 22,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "45 metrów",
        componentName = "sztylet z potrójnie hartowanej stali",
        componentPower = 3,
        duration = "chwilowy",
        description = "Czarodziej ogniskuje moc i posyła 1k10 ognistych podmuchów w kierunku jednego lub kilku przeciwników znajdujących się w odległości do 45 metrów. Podmuchy należy traktować jak magiczne pociski o Sile 4. Minimalna liczba wyczarowanych podmuchów nie może być mniejsza od wartości Magii czarodzieja."
    )

    val OgnistyDech = Spell(
        name = "Ognisty dech",
        icon = "",
        power = 25,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "16 metrów",
        componentName = "łuska smoka",
        componentPower = 3,
        duration = "chwilowy",
        description = "Czarodziej zieje ogniem niczym smok rodem z legend. Płomień bucha na odległość do 16 metrów, rozszerzając się i przyjmując kształt stożka o szerokości od 1 metra przy czarodzieju do 5 metrów na końcu jęzora ognia. Wszystkie postacie ogarnięte płomieniami natychmiast otrzymują trafienie z Siłą 5. Udany test Siły Woli pozwala uniknąć części efektu zionięcia (trafienie z Siłą 4). Zwykli ludzie, widząc taki pokaz mocy, mogą uznać, że mają do czynienia z demonem Chaosu."
    )

    val PozogaZaglady = Spell(
        name = "Pożoga zagłady",
        icon = "",
        power = 31,
        timeToCast = CastingTime.TRZY_AKCJE,
        range = "48 metrów",
        componentName = "ząb smoka",
        componentPower = 3,
        duration = "do śmierci wszystkich istot znajdujących się w sferze działania czaru",
        description = "To najbardziej niszczycielski czar w arsenale płomienistego czarodzieja. Wskazany obszar w odległości do 48 metrów zamienia się w ogniste piekło. Wszystkie postacie w promieniu 5 metrów wokół wskazanego miejsca otrzymują tyle trafień z Siłą 4, ile wynosi wartość Magii czarodzieja. W trakcie trwania czaru każda objęta nim postać musi wykonać test Siły Woli. Nieudany test oznacza, że po raz kolejny otrzymuje obrażenia. Jest to czar tak potężny i niszczycielski, że wszyscy czarodzieje w promieniu 5 kilometrów wyczuwają wywołane nim zakłócenie Eteru. Czarodzieje z Kolegium Płomienia zawzięcie ścigają tych, którzy nierozważnie zdecydowali się na rzucenie tego zaklęcia. Arcymagowie ognia słusznie uznają, że pewnych granic nie można przekraczać."
    )

    // ŚCIEŻKA MISTYCZNA
    val Podgrzanie = Spell(
        name = "Podgrzanie",
        icon = "",
        power = 4,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "metalowy widelec",
        componentPower = 1,
        duration = "trwały",
        description = "Czarodziej podgrzewa dowolną potrawę lub doprowadza do wrzenia około 1 litra wody (lub podobnej cieczy)."
    )

    val Gniew = Spell(
        name = "Gniew",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "12 metrów",
        componentName = "odrobina żółci",
        componentPower = 1,
        duration = "do przełamania",
        description = "Czarodziej wskazuje dowolną postać w zasięgu 12 metrów, która musi wykonać test Siły Woli. Nieudany test oznacza, że postać odczuwa nagły gniew względem innej osoby wskazanej przez czarodzieja. Jeśli postać uzyska w teście 2 lub więcej poziomów porażki, natychmiast atakuje wyznaczoną osobę. W każdej rundzie może przełamać zaklęcie, wykonując udany test Siły Woli."
    )

    val OgnistyPosmak = Spell(
        name = "Ognisty posmak",
        icon = "",
        power = 9,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "papryka",
        componentPower = 1,
        duration = "trwały",
        description = "Czarodziej doprawia smak dowolnej potrawy lub napoju, dodając im pikantności. Dzięki temu zaklęciu każda potrawa (podana na talerzu lub w misie, a nawet garniec zupy) staje się ostrzejsza, natomiast dowolny napój (od zawartości pucharu aż po beczkę wina lub piwa) zyskuje właściwości mocnego napitku alkoholowego. Zjedzenie takiej potrawy przez osobę nieprzyzwyczajoną do pikantnego jedzenia (czarodziej rzucający ten czar jest na to odporny) wymaga wykonania testu Odporności. Nieudany test powoduje kilkugodzinne bóle brzucha. Rzucenie czaru na napój alkoholowy podnosi jego 'moc' do poziomu spirytusu/gorzałki."
    )

    val NiegasnacyPlomien = Spell(
        name = "Niegasnący płomień",
        icon = "",
        power = 11,
        timeToCast = CastingTime.AKCJA,
        range = "12 metrów",
        componentName = "miech kowalski",
        componentPower = 2,
        duration = "zależny od wartości Magii czarodzieja (1 = dzień; 2 = tydzień; 3 = miesiąc; 4 = rok)",
        description = "Czarodziej podsyca dowolny ogień (do wielkości sporego ogniska) w zasięgu 12 metrów, powodując, że nie da się go ugasić wodą ani przez silny powiew, zarówno w normalny sposób, jak też magicznie. Płomień nie potrzebuje podsycania, nie zużywa też paliwa. Jeśli źródło płomienia zostanie rozbite lub rozproszone (np. ognisko zostanie rozgrzebane), poszczególne kawałki płoną dalej. Po upływie czasu trwania czaru ogień płonie dalej, dopóki nie zostanie ugaszony lub nie wypali się paliwo."
    )

    val PlomienistZaslona = Spell(
        name = "Płomienista zasłona",
        icon = "",
        power = 14,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "12 metrów",
        componentName = "strzęp nadpalonego dywanu",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii czarodzieja",
        description = "Czarodziej rozpościera w powietrzu ognistą zasłonę o szerokości 12 i wysokości 4 metrów. Można ją zawiesić na dowolnej wysokości (także pod kątem albo owiniętą wokół jakiegoś obiektu), choć należy pamiętać, że kotara zwisa ku ziemi, zgodnie z kierunkiem działania siły ciążenia. Dotknięcie zasłony, przebywanie tuż obok niej lub jej przekroczenie oznacza automatyczne trafienie z Siłą 3. Płomienie i dym ograniczają widoczność (-20 do testów spostrzegawczości oraz do US przy atakowaniu postaci po drugiej stronie zasłony). Zasłona faluje na wietrze, a silne podmuchy mogą ją odchylać nawet na znaczną odległość."
    )

    val Wscieklosc = Spell(
        name = "Wściekłość",
        icon = "",
        power = 16,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "kosmyk rudych włosów",
        componentPower = 2,
        duration = "10 minut",
        description = "Czarodziej podsyca ogień nienawiści w dowolnej osobie. Może ona odeprzeć czar, wykonując udany Wymagający (-10) test Siły Woli. Nieudany test powoduje modyfikator +10 do Walki Wręcz i Odporności postaci, która jednak w każdej rundzie traci 1 punkt Żywotności ze względu na płonący w niej ogień wściekłości. Ofiara zawsze atakuje najbliższą postać, nie zważając, czy jest to sprzymierzeniec czy przeciwnik. Na końcu każdej swojej tury może próbować przełamać zaklęcie, wykonując Wymagający (-10) test Siły Woli (akcja natychmiastowa)."
    )

    val Spopielenie = Spell(
        name = "Spopielenie",
        icon = "",
        power = 18,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "dotykowy",
        componentName = "rozgrzany do białości węgielek",
        componentPower = 2,
        duration = "chwilowy",
        description = "Czarodziej dotyka dowolnego przedmiotu lub kilku przedmiotów. Ich rozmiary (określone w punktach Obciążenia) zależą od wartości Magii czarodzieja (1 = 10; 2 = 50; 3 = 200; 4 = 1 000). Dotknięte przedmioty natychmiast zostają zniszczone, tak jakby spłonęły w ogniu. Dokładne określenie, co pozostaje po danym przedmiocie, zależy od jego konstrukcji, a także od decyzji MG. Z karty pergaminu zostanie jedynie popiół. Masywne dębowe krzesło zamieni się w kupkę zwęglonych szczap drewna. Natomiast miecz zostanie osmalony (a skórzana pochwa zniszczona), ale po oczyszczeniu będzie nadawał się do użytku. Tym czarem można zniszczyć każdy przedmiot, który mógłby spłonąć w naturalnie wznieconym ogniu. Jest to czar dotykowy."
    )

    val WrzacaKrew = Spell(
        name = "Wrząca krew",
        icon = "",
        power = 21,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "śledziona ogra",
        componentPower = 3,
        duration = "liczba rund równa wartości Magii czarodzieja",
        description = "Czarodziej rozpala ogień w żyłach dowolnej postaci. Ofiara może odeprzeć czar, wykonując udany Wymagający (-10) test Odporności. Nieudany test oznacza, że nagle odczuwa okropny ból, gdy krew w jej żyłach zaczyna wrzeć. W trakcie trwania czaru w każdej rundzie otrzymuje automatyczne trafienie z Siłą 3 (bez uwzględnienia noszonego pancerza). Dodatkowo, ze względu na niewyobrażalny ból i halucynacje, otrzymuje modyfikator -20 do testów spostrzegawczości. Ciało postaci zabitej tym czarem eksploduje w rozbryzgu płonącej krwi, która zadaje trafienie z Siłą 1 wszystkim postaciom w zasięgu 2 metrów."
    )

    val LancuchAqshy = Spell(
        name = "Łańcuch Aqshy",
        icon = "",
        power = 24,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "dotykowy",
        componentName = "miniaturowa tarcza ze złota",
        componentPower = 3,
        duration = "liczba minut równa wartości Magii czarodzieja",
        description = "Czarodziej spowija Czerwonym Wiatrem Magii towarzyszy tworzących z nim łańcuch połączonych rąk. W trakcie trwania czaru wszyscy zyskują odporność na ogień. Jeśli łańcuch zostanie przerwany, każda osoba, która nie jest połączona (bezpośrednio lub pośrednio) łańcuchem rąk z czarodziejem, natychmiast traci magiczną odporność na ogień. Łańcuch Aqshy chroni przed każdym ogniem pochodzenia naturalnego, ognistymi efektami zaklęć o wymaganym poziomie mocy niższym od 24, jak również przed ognistymi atakami stworzeń o Sile Woli niższej od SW czarodzieja. Czarodziej może to zaklęcie rzucić tylko na siebie i on zawsze stanowi główne ogniwo łańcucha dłoni."
    )

    val PlomienZemsty = Spell(
        name = "Płomień zemsty",
        icon = "",
        power = 26,
        timeToCast = CastingTime.TURA,
        range = "12 metrów",
        componentName = "trzy krople krwi ofiary",
        componentPower = 3,
        duration = "rok i 1 dzień lub do zabicia wyznaczonej osoby",
        description = "Czarodziej wznieca płomień nienawiści w duszy dowolnej postaci, namawiając ją do wymierzenia kary innej osobie. W trakcie rzucania zaklęcia czarodziej musi wypowiedzieć imiona obu postaci. Ofiara zaklęcia może próbować odeprzeć czar, wykonując udany Wymagający (-10) test Siły Woli. Nieudany test oznacza, że obsesyjnie zaczyna myśleć o wywarciu zemsty na wyznaczonej przez czarodzieja osobie. Nie potrafi racjonalnie uzasadnić swojej bezgranicznej żądzy zemsty, którą może zaspokoić tylko śmierć znienawidzonego wroga. W trakcie trwania czaru ofiara może raz w miesiącu próbować przełamać zaklęcie, jednak wymaga to udanego Bardzo Trudnego (-30) testu Siły Woli. Trudno ugasić raz rozpalony płomień zemsty..."
    )

    // ŚCIEŻKA ŻYWIOŁU
    val OgienUZhul = Spell(
        name = "Ogień U'Zhul",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "36 metrów",
        componentName = "zapałka",
        componentPower = 1,
        duration = "chwilowy",
        description = "Czarodziej ciska ognistym pociskiem w dowolnego przeciwnika znajdującego się w odległości do 36 metrów. Jest to magiczny pocisk o Sile 4."
    )
}

/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////        TRADYCJA ŚMIERCI          /////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////

object DeathTradition {
    // ŚCIEŻKA GŁÓWNA
    val WizjaSmierci = Spell(
        name = "Wizja śmierci",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "garść ziemi zebranej z mogiły",
        componentPower = 1,
        duration = "1 godzina",
        description = "Czarodziej widzi duchy i zjawy, normalnie niewidoczne dla zwykłych ludzi. Obserwując śmierć żywej istoty, czarodziej może dostrzec duszę opuszczającą martwe ciało."
    )

    val PoslaniecSmierci = Spell(
        name = "Posłaniec śmierci",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "ostry nóż",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Czarodzieja napełnia moc Shyish, wzbudzając strach wśród jego przeciwników. W trakcie trwania czaru czarodziej otrzymuje modyfikator +10 do testów zastraszania."
    )

    val KosaZniwiarza = Spell(
        name = "Kosa żniwiarza",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "miniaturowa żelazna kosa",
        componentPower = 1,
        duration = "liczba rund równa wartości Magii czarodzieja, ale może on przedłużyć działanie czaru, wykonując udany test Siły Woli w każdej kolejnej rundzie",
        description = "W ręku czarodzieja pojawia się kosa stworzona z ametystowej energii. Jest to broń magiczna (Siła 5) z cechą oręża Szybki. Władający kosą czarodziej otrzymuje dodatkowo modyfikator +10 do Walki Wręcz."
    )

    val Odretwienic = Spell(
        name = "Odrętwienie",
        icon = "",
        power = 11,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "24 metry",
        componentName = "ćwiek z żelaza skuwanego na zimno",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii czarodzieja",
        description = "Czarodziej wskazuje dowolną postać w zasięgu 24 metrów. W trakcie trwania czaru wybrana przez niego kończyna ofiary (ręka albo noga) jest traktowana jakby była bezwładna."
    )

    val KragSmierci = Spell(
        name = "Krąg śmierci",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "4x Mag",
        componentName = "kawałek kamienia lub szczapa drewna z cmentarnego muru lub płotu",
        componentPower = 2,
        duration = "trwały do rozproszenia",
        description = "Czarodziej otacza się magicznym kręgiem, którego nie może przekroczyć żaden ożywieniec. Promień kręgu wynosi czterokrotność wartości Magii czarodzieja. Mumie, upiory, wampiry i widma mogą wykonać przeciwstawny test Siły Woli przeciwko SW czarodzieja, aby przełamać moc kręgu. Inne, równie potężne nieumarłe istoty mogą także spróbować przełamać krąg śmierci (wykonując podobny test)."
    )

    val AkceptacjaPrzeznaczenia = Spell(
        name = "Akceptacja przeznaczenia",
        icon = "",
        power = 14,
        timeToCast = CastingTime.TRZY_AKCJE,
        range = "12 metrów",
        componentName = "gwóźdź z trumny",
        componentPower = 2,
        duration = "1 minuta (6 rund)",
        description = "Czarodziej sprawia, że wszyscy jego towarzysze w promieniu 12 metrów przestają bać się śmierci. W trakcie trwania czaru są traktowani, jakby posiadali zdolność nieustraszony."
    )

    val WyssanieZycia = Spell(
        name = "Wyssanie życia",
        icon = "",
        power = 16,
        timeToCast = CastingTime.AKCJA,
        range = "12 metrów",
        componentName = "fiolka wypełniona krwią",
        componentPower = 2,
        duration = "chwilowy",
        description = "Czarodziej sięga strumieniem mocy w stronę dowolnego przeciwnika znajdującego się w odległości do 12 metrów. Wysysa z niego życiową energię, wykorzystując ją do uzdrowienia własnego ciała. Postać może odeprzeć czar, wykonując udany test Siły Woli. Nieudany test oznacza, że natychmiast traci 1k10 punktów Żywotności, bez względu na Wytrzymałość i noszoną zbroję. Punkty te są dodawane do Żywotności czarodzieja, nie mogą jednak przekroczyć jej wartości maksymalnej. Pozostałe punkty są stracone, choć postać, która stała się celem zaklęcia, otrzymuje pełną sumę obrażeń. Wyssanie życia nie działa na ożywieńców i demony."
    )

    val PukajacDoBramZaswiatow = Spell(
        name = "Pukając do bram zaświatów",
        icon = "",
        power = 18,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "skrawek ubrania zmarłego",
        componentPower = 2,
        duration = "chwilowy",
        description = "Czarodziej może zadać jedno pytanie martwej postaci pod warunkiem, że możliwe jest udzielenie odpowiedzi za pomocą odgłosów przypominających pukanie do drzwi. Może to być na przykład pytanie: 'Jak wielu napastników było w bandzie, która cię zaatakowała?'. Duch postaci może też odpowiedzieć 'tak' lub 'nie', wydając odpowiednio 1 lub 2 dźwięki. Zapytana dusza nie musi odpowiadać zgodnie z prawdą ani w ogóle udzielać odpowiedzi. Zaklęcie musi zostać rzucone w obecności zwłok martwej osoby lub jego żyjącego potomka. Czarodzieje twierdzą, że zmarli udzielają odpowiedzi, pukając w bramy królestwa Morra."
    )

    val KlatwaStarosci = Spell(
        name = "Klątwa starości",
        icon = "",
        power = 23,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "12 metrów",
        componentName = "gałązka bluszczu rosnącego na mogile kapłana",
        componentPower = 2,
        duration = "trwały",
        description = "Dowolna postać znajdująca się w odległości 12 metrów od czarodzieja w ciągu kilku sekund starzeje się o całe lata. Może odeprzeć czar, wykonując udany test Siły Woli. Nieudany test oznacza, że na stałe traci 1k10 punktów Krzepy i Odporności. Klątwa starości działa na zwierzęta, ale nie na demony i ożywieńców. Czar nie działa na rośliny i przedmioty."
    )

    val UwiezieniieDuszy = Spell(
        name = "Uwięzienie duszy",
        icon = "",
        power = 29,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "dotykowy",
        componentName = "szkielet klatki piersiowej strażnika więziennego",
        componentPower = 3,
        duration = "do odwrócenia",
        description = "Czarodziej zamyka duszę dowolnej postaci w pojemniku (flaszka, słój, sakiewka, itp.). Ciało ofiary pozostaje przy życiu, lecz musi być karmione i pojone, w przeciwnym wypadku może umrzeć z głodu lub pragnienia. Ciało zachowuje podstawowe funkcje życiowe (oddychanie, przełykanie, wydalanie), but nie może poruszać się samodzielnie. Może zostać zranione lub zabite, ale także wyleczone. Czarodziej (lub dowolny kapłan Morra albo Ametystowy czarodziej, który zna to zaklęcie) może w dowolnej chwili odwrócić zaklęcie, otwierając pojemnik z duszą w pobliżu ciała postaci. W takim przypadku postać natychmiast otrzymuje 1k10/2 (min. 1) Punktów Obłędu. Jeśli pojemnik zostanie otwarty z dala od ciała postaci lub przez osobę, która nie zna tego zaklęcia, dusza zostanie skazana na wieczną egzystencję w formie ducha. Wywołane nim zakłócenie Eteru jest wyczuwalne dla wszystkich czarodziejów w promieniu 5 kilometrów."
    )

    // ŚCIEŻKA MISTYCZNA
    val SlowaPociechy = Spell(
        name = "Słowa pociechy",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "6 metrów",
        componentName = "klepsydra",
        componentPower = 1,
        duration = "trwały",
        description = "Czarodziej wypowiada pocieszające słowa, które koją smutek osoby cierpiącej z powodu śmierci kogoś bliskiego. Zaklęcie powstrzymuje efekty Strachu, Grozy lub obłędu, wywołane przez to tragiczne zdarzenie."
    )

    val KlatwaZlodziejGrobowcow = Spell(
        name = "Klątwa złodziei grobowców",
        icon = "",
        power = 10,
        timeToCast = CastingTime.TURA,
        range = "12 metrów",
        componentName = "ziemia z rozkopanego grobu",
        componentPower = 2,
        duration = "1 rok",
        description = "Czarodziej musi rzucić to zaklęcie w pobliżu grobu (także krypty lub grobowca) lub zwłok. Jeśli w trakcie trwania czaru ktoś zbezcześci zwłoki lub okradnie grób, pada ofiarą klątwy. Otrzymuje 1 Punkt Obłędu, a także na 1 tydzień otrzymuje modyfikator -10 do Inteligencji, Siły Woli i Ogłady."
    )

    val UkojenieDucha = Spell(
        name = "Ukojenie ducha",
        icon = "",
        power = 14,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "12 metrów",
        componentName = "ludzka czaszka",
        componentPower = 2,
        duration = "do rozstrzygnięcia",
        description = "Czarodziej przyzywa Fioletowy Wiatr Magii, którego pasma oplątują dowolnego ducha (istotę posiadającą zdolność eteryczny), znajdującego się w zasięgu 12 metrów. Istota musi wykonać test Siły Woli. Nieudany test oznacza, że uświadamia sobie, że jest tylko duchem (otrzymuje modyfikator -10 do WW, a w następnej turze może wykonać tylko 1 akcję zwykłą). W następnej rundzie musi ponownie wykonać test Siły Woli z tymi samymi konsekwencjami. Jeśli także następny (trzeci) test Siły Woli okaże się nieudany, dusza istoty odzyskuje spokój i odchodzi w zaświaty."
    )

    val LodowatyUsciskSmierci = Spell(
        name = "Lodowaty uścisk śmierci",
        icon = "",
        power = 16,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "48 metrów",
        componentName = "różana łodyga z kolcami",
        componentPower = 2,
        duration = "do odparcia",
        description = "Lodowate strumienie Shyish paraliżują swoim dotykiem dowolną grupę istot w zasięgu 48 metrów od czarodzieja. Wszystkie postacie objęte działaniem czaru (w promieniu 5 metrów wokół wskazanego miejsca) muszą wykonać test Siły Woli. Nieudany test oznacza, że zostają sparaliżowane (traktowane są jak ogłuszone). Na początku swojej tury każda z nich może ponownie spróbować odeprzeć zaklęcie, wykonując udany test Siły Woli. Postać pozostaje sparaliżowana do momentu wykonania udanego testu SW."
    )

    val KresZycia = Spell(
        name = "Kres życia",
        icon = "",
        power = 31,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "12 metrów",
        componentName = "oko ściętego mordercy",
        componentPower = 3,
        duration = "chwilowy",
        description = "Czarodziej przyzywa potężną moc, dosłownie wydzierając duszę z dowolnej istoty w zasięgu 12 metrów. Należy wykonać test przeciwstawny Siły Woli. Jeśli postać będąca celem czaru przegra test, natychmiast ginie w strasznych męczarniach. Wywołane czarem zakłócenie Eteru jest wyczuwalne dla wszystkich czarodziejów w promieniu 5 kilometrów. Arcymagowie Kolegium Ametystu bez pobłażania traktują wszystkich czarodziejów, którzy zbyt pochopnie używają tego zaklęcia."
    )

    // ŚCIEŻKA ŻYWIOŁU
    val DotykSmierci = Spell(
        name = "Dotyk śmierci",
        icon = "",
        power = 7,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "dwa miedziane pensy",
        componentPower = 1,
        duration = "chwilowy",
        description = "Czarodziej dotyka ciężko rannej osoby, pomagając jej umrzeć. Dotyk śmierci zabija dowolną postać, która ma 0 punktów Żywotności i otrzymała przynajmniej 1 trafienie krytyczne. Jest to czar dotykowy, który działa na potwory, zwierzęta, a nawet na innych BG. Dusze odesłane w ten sposób są odporne na czary typu ostatnie słowa, ale zwłoki wciąż można ożywić dzięki sztuce nekromancji."
    )

    val UplywLat = Spell(
        name = "Upływ lat",
        icon = "",
        power = 11,
        timeToCast = CastingTime.AKCJA,
        range = "6 metrów",
        componentName = "niewielka klepsydra",
        componentPower = 2,
        duration = "trwały",
        description = "Czarodziej sprawia, że jeden niemagiczny przedmiot błyskawicznie starzeje się i niszczeje. Przedmioty kiepskiej i zwykłej jakości rozpadają się w pył. Przedmioty dobrej jakości stają się przedmiotami kiepskiej jakości, natomiast przedmioty najlepszej jakości zmieniają się w zwykłej jakości."
    )

    val OstatnieSlowa = Spell(
        name = "Ostatnie słowa",
        icon = "",
        power = 18,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "12 metrów",
        componentName = "skrawek papieru welinowego",
        componentPower = 2,
        duration = "chwilowy",
        description = "Czarodziej może zadać jedno pytanie odchodzącej w zaświaty duszy zabitej postaci, która znajduje się w odległości do 12 metrów. Czarodziej musi rzucić czar w ciągu 1 minuty (6 rund) od momentu śmierci. W przeciwnym razie dusza zdąży odejść do królestwa Morra. Zapytana dusza nie musi odpowiadać zgodnie z prawdą ani w ogóle udzielać odpowiedzi. Zaklęcie nie działa na istoty pozbawione duszy, takie jak ożywieńcy lub demony."
    )

    val DoOstatniegoCchu = Spell(
        name = "Do ostatniego tchu",
        icon = "",
        power = 20,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "24 metry",
        componentName = "fiolka z substancją balsamiczną",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii czarodzieja",
        description = "Czarodziej przyzywa moc, która powstrzymuje na chwilę nieuniknioną śmierć. Wszyscy towarzysze czarodzieja w promieniu 24 metrów walczą jak natchnieni, czując, że są nieśmiertelni. Jeśli w trakcie trwania czaru któryś odniesie śmiertelną ranę, może w swojej turze wykonać jeszcze jedną akcję, ostatnią w życiu. Po rozpatrzeniu jej efektów postać natychmiast umiera."
    )

    val WicherSmierci = Spell(
        name = "Wicher śmierci",
        icon = "",
        power = 27,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "45 metrów",
        componentName = "ametyst o wartości nie mniejszej niż 50 zk",
        componentPower = 3,
        duration = "chwilowy",
        description = "Czarodziej przyzywa potężną moc, przywołując zabójczy wicher czystej energii Shyish w dowolnym miejscu w odległości do 45 metrów. Wszystkie postacie w promieniu 5 metrów wokół wskazanego miejsca natychmiast tracą 1k10 punktów Żywotności, bez względu na Wytrzymałość i noszoną zbroję. Wywołane czarem zakłócenie Eteru jest wyczuwalne dla wszystkich czarodziejów w promieniu 5 kilometrów. Arcymagowie Kolegium Ametystu dysponują całym zestawem okrutnych i wymyślnych kar dla tych czarodziejów, którzy zbyt pochopnie lub zbyt często używają tego zaklęcia."
    )
}

/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////        TRADYCJA ŚWIATŁA          /////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////

object LightTradition {
    // ŚCIEŻKA GŁÓWNA
    val Rozblysk = Spell(
        name = "Rozbłysk",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "36 metrów",
        componentName = "niewielkie zwierciadło",
        componentPower = 1,
        duration = "1k10 rund",
        description = "Czarodziej wywołuje rozbłysk światła w dowolnym miejscu w odległości do 36 metrów. Wszystkie postacie w promieniu 3 metrów wokół wskazanego miejsca otrzymują modyfikator -10 do Wilki Wręcz, Umiejętności Strzeleckich, Zręczności i wszystkich testów związanych ze wzrokiem."
    )

    val JasnoscUmyslu = Spell(
        name = "Jasność umysłu",
        icon = "",
        power = 7,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "paciorek z czystego szkła",
        componentPower = 2,
        duration = "liczba godzin równa wartości Magii czarodzieja",
        description = "Dotyk czarodzieja przywraca jasność myślenia dowolnej postaci, dodając 10 do pojedynczego, ujemnego modyfikatora do Inteligencji, Siły Woli lub Ogłady. Jest to czar dotykowy, ale czarodziej może go rzucić również na siebie."
    )

    val MigotliwaTarcza = Spell(
        name = "Migotliwa tarcza",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "świeca",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii czarodzieja",
        description = "Wokół czarodzieja pojawia się świetlista sfera, która chroni go przed wszelkimi niemagicznymi pociskami. W trakcie trwania czaru każdy atak bronią strzelecką wymierzony w czarodzieja ma Siłę zmniejszoną do 0. Podejmowane przez czarodzieja próby ukrywania się automatycznie kończą się porażką."
    )

    val SwietlistyOrez = Spell(
        name = "Świetlisty oręż",
        icon = "",
        power = 9,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "srebrny talizman",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii czarodzieja",
        description = "Czarodziej owija smugami Hysh dowolną broń białą, tymczasowo napełniając ją magiczną mocą. W trakcie trwania czaru broń jest traktowana jako magiczna i zadaje demonom dodatkowe 2 punkty obrażeń. Jest to czar dotykowy."
    )

    val OczyszczajacaSwiatlosc = Spell(
        name = "Oczyszczająca światłość",
        icon = "",
        power = 12,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "dotykowy",
        componentName = "woskowa świeca pobłogosławiona przez kapłankę Shallyi",
        componentPower = 2,
        duration = "do wygaśnięcia ognia",
        description = "W trakcie rzucania zaklęcia czarodziej rozpala ogień. Dopóki nie zgaśnie, wszystkie testy Odporności przeciwko chorobom, wykonywane przez postacie pozostające w kręgu światła automatycznie są udane. Zaklęcie nie powoduje wyleczenia choroby, a tylko wstrzymuje jej odczuwalne objawy."
    )

    val Natchnienie = Spell(
        name = "Natchnienie",
        icon = "",
        power = 16,
        timeToCast = CastingTime.TURA,
        range = "dotykowy",
        componentName = "strona z książki",
        componentPower = 2,
        duration = "chwilowy",
        description = "Czarodziej czerpie energie z Wiatrów Magii, pozwalając by świetlista moc natchnęła go mądrością, która zapewni rozwiązanie jednej zagadki lub problemu. Pomyślnie rzucony czar powoduje, że czarodziej otrzymuje modyfikator +30 do następnego testu wiedzy."
    )

    val SilaPrawdy = Spell(
        name = "Siła prawdy",
        icon = "",
        power = 18,
        timeToCast = CastingTime.TRZY_AKCJE,
        range = "dotykowy",
        componentName = "czysta karta pergaminu",
        componentPower = 1,
        duration = "chwilowy",
        description = "Moc czaru sprawia, że słowa prawdy brzmią bardziej przekonująco. Postać otrzymuje modyfikator +30 do testów przekonywania i może oddziaływać na dwukrotnie większą grupę słuchaczy."
    )

    val OczyPrawdy = Spell(
        name = "Oczy prawdy",
        icon = "",
        power = 20,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "szklana kula",
        componentPower = 2,
        duration = "liczba rund równa wartości Magii czarodzieja",
        description = "Oczy czarodzieja zyskują moc odróżniania świata rzeczywistego od ułudy. W trakcie trwania czaru czarodziej dostrzega niewidzialne obiekty i postacie, przenika wzrokiem iluzje i próby kamuflażu, zauważa ukryte istoty i sekretne przejścia, a także widzi w ciemnościach. Zasięg działania czaru to 45 metrów."
    )

    val BlogoslawienistwoHysh = Spell(
        name = "Błogosławieństwo Hysh",
        icon = "",
        power = 27,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "dotykowy",
        componentName = "kosmyk włosów osoby będącej celem czaru – ścięty, gdy była zdrowa",
        componentPower = 3,
        duration = "chwilowy",
        description = "Czarodziej oplata dowolną postać kojącymi strumieniami Białego Wiatru, w pełni ją uzdrawiając. Dotyczy to zarówno wszelkich obrażeń, jak też chorób i trucizn toczących ciało rannej osoby."
    )

    val KolumnaSwiatlisci = Spell(
        name = "Kolumna światłości",
        icon = "",
        power = 25,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "48 metrów",
        componentName = "diament o wartości przynajmniej 100 zk",
        componentPower = 3,
        duration = "chwilowy",
        description = "Czarodziej koncentruje się, splatając energię Hysh w kolumnę oślepiającej jasności która pojawia się w dowolnym miejscu w odległości do 48 metrów. Wszystkie postacie w promieniu 5 metrów wokół wskazanego miejsca otrzymują trafienie z Silą 4 i muszą wykonać test Zręczności. Tak potężne skupisko mocy jest wyczuwalne przez wszystkich czarodziejów w promieniu 3 kilometrów."
    )

    // ŚCIEŻKA MISTYCZNA
    val BlaskCzystosci = Spell(
        name = "Blask czystości",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "6 metrów",
        componentName = "kawałek mydła",
        componentPower = 1,
        duration = "chwilowy",
        description = "Przyćmiony blask spowija dowolny przedmiot lub postać, całkowicie je oczyszczając. Zaklęcie usuwa kurz, czyści na połysk metalowe powierzchnie, usuwa brud i tłuszcz, a nawet ślady zarostu. Rzucony na potrawę lub napój, usuwa wszelkie zanieczyszczenia i pleśń. Jest to czar dotykowy."
    )

    val RozswietlenieBudowli = Spell(
        name = "Rozświetlenie budowli",
        icon = "",
        power = 11,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "12 metrów",
        componentName = "nieużywana świeca woskowa",
        componentPower = 1,
        duration = "trwały do rozproszenia",
        description = "Czarodziej dzięki mocy zaklęcia wypełnia światłem dziennym wnętrze dowolnej budowli. Rozmiar budowli zależy od poziomu Magii czarodzieja. Światło rozświetla pokoje, korytarze, piwnice i wszelkie inne pomieszczenia przykryte dachem. Jest to czar dotykowy."
    )

    val SwietlistyStraznik = Spell(
        name = "Świetlisty strażnik",
        icon = "",
        power = 14,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "puklerz",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii czarodzieja",
        description = "Czarodziej tworzy świetlistą kulę wielkości głowy, która krąży wokół jego ciała. Kula odbija ciosy wymierzone w czarodzieja, raz na rundę parując pojedynczy atak (do testu stosuje się Siłę Woli czarodzieja). To parowanie nie wlicza się do limitu parowań w rundzie."
    )

    val KragUzdrowienia = Spell(
        name = "Krąg uzdrowienia",
        icon = "",
        power = 16,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "8 metrów",
        componentName = "okład",
        componentPower = 1,
        duration = "chwilowy",
        description = "Czarodziej przywołuje energię Hysh, aby uzdrowić jedną lub więcej osób (maksymalnie tyle, ile wynosi wartość jego Magii) znajdujących się w zasięgu 8 metrów od niego. Pomyślnie rzucony czar pozwala zneutralizować dowolną truciznę w ciele każdej osoby, albo skrócić o połowę czas trwania dręczących ją chorób."
    )

    val SnopSwiatla = Spell(
        name = "Snop światła",
        icon = "",
        power = 21,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "16 metrów",
        componentName = "lustro bez skazy",
        componentPower = 3,
        duration = "liczba rund równa wartości Magii czarodzieja, ale może on przedłużyć działanie czaru, poświęcając punkt Żywotności w każdej kolejnej rundzie",
        description = "Z dłoni czarodzieja tryska oślepiająco jasny snop światła. Snop światła ma długość 16 metrów, rozszerzając się i przyjmując kształt stożka. Wszystkie istoty Chaosu muszą wykonać test Siły Woli z modyfikatorem -10 za każdy punkt Magii czarodzieja. Nieudany test oznacza, że postać nie może się ruszać, dopóki pozostaje oświetlona."
    )

    // ŚCIEŻKA ŻYWIOŁU
    val GorejacyWzrok = Spell(
        name = "Gorejący wzrok",
        icon = "",
        power = 7,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "16 metrów",
        componentName = "soczewka",
        componentPower = 1,
        duration = "chwilowy",
        description = "Z oczu czarodzieja tryska promień oślepiającego światła, który trafia we wskazaną postać znajdującą się w odległości do 16 metrów. Jest to magiczny pocisk o Sile 6. Czasami wzrok naprawdę potrafi zabijać."
    )

    val Uzdrowienie = Spell(
        name = "Uzdrowienie",
        icon = "",
        power = 10,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "przezroczysty szklany paciorek",
        componentPower = 2,
        duration = "chwilowy",
        description = "Dotyk czarodzieja uzdrawia ranną postać. Przywraca jej tyle punktów Żywotności, ile wynosi wartość Magii czarodzieja. Uzdrowienie to czar dotykowy. Czarodziej może go rzucić również na siebie."
    )

    val OdeslaniedemDemona = Spell(
        name = "Odesłanie demona",
        icon = "",
        power = 13,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "24 metry",
        componentName = "dębowa różdżka",
        componentPower = 2,
        duration = "do rozstrzygnięcia",
        description = "Czarodziej spowija oślepiającymi strumieniami Hysh dowolnego demona znajdującego się w odległości do 24 metrów i odsyła go z powrotem do Domeny Chaosu. Jest to rozstrzygane za pomocą przeciwstawnego testu Siły Woli. W przypadku remisu mentalny pojedynek trwa nadal. Odesłanie może zostać użyte do uzdrowienia postaci opętanej przez demona."
    )

    val OslepiajacyBlask = Spell(
        name = "Oślepiający blask",
        icon = "",
        power = 24,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "48 metrów",
        componentName = "wypolerowany dysk ze srebra",
        componentPower = 3,
        duration = "1k10 rund",
        description = "Czarodziej czerpie moc z białego Wiatru Magii, wywołując rozbłysk oślepiającego światła w dowolnym miejscu w odległości do 48 metrów. Wszystkie postacie w promieniu 5 metrów wokół wskazanego miejsca muszą wykonać test Zręczności. Nieudany test oznacza, że tracą wzrok na czas trwania czaru."
    )

    val ZgubaDemonow = Spell(
        name = "Zguba demonów",
        icon = "",
        power = 26,
        timeToCast = CastingTime.TRZY_AKCJE,
        range = "48 metrów",
        componentName = "różdżka wykonana z trafionego piorunem dębu",
        componentPower = 3,
        duration = "chwilowy",
        description = "Czarodziej rozrywa barierę Eteru, odsyłając grupę demonów znajdujących się w odległości do 48 metrów z powrotem do Domeny Chaosu. Wszystkie demony w promieniu 3 metrów wokół wskazanego miejsca muszą wykonać test Siły Woli. Nieudany test oznacza, że zostają odesłane."
    )
}

/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////        TRADYCJA ZWIERZĄT         /////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////

object BeastTradition {
    // ŚCIEŻKA GŁÓWNA
    val Poskromienie = Spell(
        name = "Poskromienie",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "45 metrów",
        componentName = "grudka cukru",
        componentPower = 1,
        duration = "liczba godzin równa wartości Magii czarodzieja. Jeśli czarodziej zaatakuje zwierzę, czar natychmiast przestaje działać",
        description = "Łagodny, hipnotyzujący głos czarodzieja uspokaja dowolne zwierzę znajdujące się w odległości do 45 metrów. Może ono odeprzeć czar, wykonując udany test Siły Woli. Nieudany test oznacza, że bursztynowy czarodziej będzie mógł bez obaw podejść do zwierzęcia, a nawet go dotknąć."
    )

    val Oswojenie = Spell(
        name = "Oswojenie",
        icon = "",
        power = 7,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "12 metrów",
        componentName = "wędzidło",
        componentPower = 1,
        duration = "trwały",
        description = "Dzięki swojej mocy czarodziej może oswoić dowolne zwierzę hodowlane znajdujące się w odległości do 12 metrów. Może ono odeprzeć czar, wykonując udany test Siły Woli. Nieudany test oznacza, że zwierzę zawsze będzie zachowywać się przyjaźnie wobec ludzi, elfów, krasnoludów i niziołków."
    )

    val UleczenieZwierzecia = Spell(
        name = "Uleczenie zwierzęcia",
        icon = "",
        power = 9,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "trochę maści",
        componentPower = 1,
        duration = "chwilowy",
        description = "Czarodziej dotknięciem dłoni leczy zranione zwierzę, przywracając mu tyle punktów Żywotności, ile wynosi wartość Magii czarodzieja. Jest to czar dotykowy, który nie działa na stworzenia magiczne oraz potwory."
    )

    val MowaZwierzat = Spell(
        name = "Mowa zwierząt",
        icon = "",
        power = 11,
        timeToCast = CastingTime.AKCJA,
        componentName = "język zwierzęcia, w które chce zmienić się czarodziej",
        range = "dotykowy",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii czarodzieja",
        description = "Czarodziej, który rzuci to zaklęcie bezpośrednio przed przemianą w zwierzę po przemianie nadal będzie mógł mówić ludzkim głosem. Zaklęcie to można stosować także w nieco inny sposób. Czar, rzucony na dowolne zwierzę znajdujące się w odległości do 24 metrów, pozwala mu przemawiać ludzkim głosem."
    )

    val GlosPana = Spell(
        name = "Głos pana",
        icon = "",
        power = 13,
        timeToCast = CastingTime.AKCJA,
        range = "24 metry",
        componentName = "miniaturowy bicz ukręcony ze zwierzęcej sierści",
        componentPower = 2,
        duration = "1 runda",
        description = "Wykorzystując moc Ghur, czarodziej zmusza do posłuszeństwa dowolne zwierzę znajdujące się w odległości do 24 metrów. Może ono odeprzeć czar, wykonując udany test Siły Woli. Nieudany test oznacza, że w następnej rundzie będzie całkowicie posłuszne rozkazom czarodzieja."
    )

    val SenZimowy = Spell(
        name = "Sen zimowy",
        icon = "",
        power = 16,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "dotykowy",
        componentName = "ząb niedźwiedzia",
        componentPower = 2,
        duration = "do następnej równonocy lub przesilenia (czyli do końca obecnej pory roku i przez całą następną)",
        description = "Dotyk czarodzieja powoduje, że dowolna istota (musi wyrazić na to zgodę) zapada w długi sen, podobny do snu zimowego zwierząt. W trakcie trwania czaru postać nie musi jeść ani pić, a efekty działania chorób i trucizn zostają zatrzymane. Sen zimowy jest czarem dotykowym, ale czarodziej może go rzucić również na siebie."
    )

    val Odstraszenie = Spell(
        name = "Odstraszenie",
        icon = "",
        power = 18,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "sierść tchórzliwego psa",
        componentPower = 2,
        duration = "do rozstrzygnięcia",
        description = "Czarodziej donośnym krzykiem próbuje przerazić przeciwników, wzywając ich, aby niczym zwierzęta ukorzyli się przed swoim panem. Efekt czaru działa na 2k10 postaci w zasięgu 48 metrów. Postacie objęte czarem muszą wykonać test Strachu."
    )

    val ZwierzeciSzal = Spell(
        name = "Zwierzęcy szał",
        icon = "",
        power = 19,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "12 metrów",
        componentName = "serce wilka",
        componentPower = 2,
        duration = "zgodnie z zasadami zdolności szał bojowy",
        description = "Czarodziej wyzwala w swoich sprzymierzeńcach najdziksze instynkty. Każda przyjazna mu postać znajdująca się w odległości do 12 metrów natychmiast wpada w szał. Zaklęcie nie działa na zwierzęta."
    )

    val OdrazajacaPrzemiana = Spell(
        name = "Odrażająca przemiana",
        icon = "",
        power = 21,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "12 metrów",
        componentName = "skóra ropuchy błękitnej",
        componentPower = 3,
        duration = "do odparcia",
        description = "Wiatry Magii ogarniają postać będącą celem czaru, zmieniając jej kształt i ujawniając prawdziwą naturę. Ofiara zaklęcia musi wykonać Wymagający (-10) test Siły Woli. Nieudany test oznacza, że przechodzi okropną przemianę – traci zdolność mówienia i zaczyna dziwnie się zachowywać, a jej ciało pokrywa sierść."
    )

    val SkrzydlaSokola = Spell(
        name = "Skrzydła sokoła",
        icon = "",
        power = 25,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "dotykowy",
        componentName = "żywy sokół",
        componentPower = 3,
        duration = "liczba minut równa wartości Magii czarodzieja",
        description = "Z pleców czarodzieja wyrastają skrzydła na tyle mocne, by unieść go w powietrze. W trakcie trwania zaklęcia czarodziej może latać z Szybkością 4. Zwykli ludzie, widząc kogoś odmienionego w ten sposób, mogą uznać, że mają do czynienia z demonem Chaosu."
    )

    // ŚCIEŻKA MISTYCZNA
    val CenaOkrucienstwa = Spell(
        name = "Cena okrucieństwa",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "odrobina odchodów nietoperza",
        componentPower = 2,
        duration = "do drugiej pełni księżyca",
        description = "Czarodziej rzuca zaklęcie, jednocześnie dotykając dowolne zwierzę (dzikie lub oswojone). Każda inteligentna istota, która do najbliższej pełni księżyca zrani lub w inny sposób skrzywdzi to zwierzę, otrzymuje modyfikator -10 do Ogłady. Ten stan utrzymuje się aż do następnej pełni księżyca."
    )

    val OsliUpor = Spell(
        name = "Ośli upór",
        icon = "",
        power = 11,
        timeToCast = CastingTime.AKCJA,
        range = "48 metrów",
        componentName = "kopyto osła",
        componentPower = 2,
        duration = "chwilowy",
        description = "Czarodziej krzykiem zachęca sprzymierzeńców (znajdujących się w zasięgu 48 metrów) do wytrwałości i męstwa. Wszyscy towarzysze ogarnięci Strachem lub Grozą opanowują się i mogą działać normalnie. Jeśli pojawi się nowe zagrożenie, muszą jednak wykonać odpowiedni test Strachu lub Grozy."
    )

    val SkoraDzika = Spell(
        name = "Skóra dzika",
        icon = "",
        power = 14,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "pasek wyprawionej skóry dzika",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii czarodzieja",
        description = "Skóra czarodzieja staje się gruba niczym u odyńca. W trakcie trwania czaru Wartość Krytyczna każdego otrzymanego przez czarodzieja trafienia krytycznego maleje o 1. Sztywność skóry powoduje jednak modyfikator -10 do Zręczności."
    )

    val SparcialaskOra = Spell(
        name = "Sparciała skóra",
        icon = "",
        power = 15,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "fiolka ze sproszkowanym byczym rogiem",
        componentPower = 2,
        duration = "chwilowy",
        description = "Czarodziej dotyka dłonią dowolną postać albo zwierzę. Swoją mocą powoduje, że wszelkie noszone przez tę istotę skórzane przedmioty (sakwy, pasy, rzemienie, a nawet pancerz) natychmiast parcieją i rozpadają się w pył. Jest to czar dotykowy."
    )

    val PrzemianaWRumaka = Spell(
        name = "Przemiana w rumaka",
        icon = "",
        power = 18,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "dotykowy",
        componentName = "włos z grzywy rumaka",
        componentPower = 2,
        duration = "1 godzina, ale czarodziej może w dowolnym momencie przerwać czar i powrócić do swojej prawdziwej postaci",
        description = "Czarodziej (razem z całym ekwipunkiem podręcznym) zamienia się w rumaka. W trakcie trwania czaru zachowuje wszystkie zdolności umysłowe. Pozostałe cechy przybierają wartości posiadane przez zwykłego rumaka. Czarodziej zamieniony w rumaka nie może mówić ani rzucać czarów."
    )

    // ŚCIEŻKA ŻYWIOŁU
    val PrzemianaWKruka = Spell(
        name = "Przemiana w kruka",
        icon = "",
        power = 7,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "krucze pióro",
        componentPower = 1,
        duration = "1 godzina, ale czarodziej może w dowolnym momencie przerwać czar i powrócić do swojej prawdziwej postaci",
        description = "Czarodziej (razem z całym ekwipunkiem podręcznym) zamienia się w kruka. W trakcie trwania czaru zachowuje wszystkie zdolności umysłowe. Pozostałe cechy przybierają wartości posiadane przez zwykłego kruka. Czarodziej zamieniony w kruka nie może mówić ani rzucać czarów."
    )

    val SzponyFurii = Spell(
        name = "Szpony furii",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "kuci pazur",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii czarodzieja",
        description = "Paznokcie czarodzieja zamieniają się w ostre jak brzytwy pazury, zapewniające +1 do Ataków i modyfikator +10 do Walki Wręcz. Pazury traktuje się jako broń jednoręczną z cechą oręża szybki. W trakcie trwania zaklęcia czarodziej nie może trzymać w rękach żadnej innej broni."
    )

    val PrzemianaWWilka = Spell(
        name = "Przemiana w wilka",
        icon = "",
        power = 15,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "dotykowy",
        componentName = "wilcza łapa",
        componentPower = 2,
        duration = "1 godzina, ale czarodziej może w dowolnym momencie przerwać czar i powrócić do swojej prawdziwej postaci",
        description = "Czarodziej (razem z całym ekwipunkiem podręcznym) zamienia się w wilka. W trakcie trwania czaru zachowuje wszystkie zdolności umysłowe. Pozostałe cechy przybierają wartości posiadane przez zwykłego wilka. Czarodziej zamieniony w wilka nie może mówić ani rzucać czarów."
    )

    val UczataKrukow = Spell(
        name = "Uczta kruków",
        icon = "",
        power = 17,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "45 metrów",
        componentName = "żywy kruk",
        componentPower = 2,
        duration = "chwilowy",
        description = "Czarodziej przywołuje chmarę morderczych nadnaturalnych kruków, które pojawiają się w dowolnym miejscu w odległości do 45 metrów i natychmiast atakują wskazane postacie. Wszystkie postacie w promieniu 5 metrów wokół wskazanego miejsca zostają zaatakowane przez kruki i otrzymują po jednym trafieniu z Siłą 3. Chwilę później chmara rozprasza się, a ptaki znikają równie błyskawicznie, jak się pojawiły."
    )

    val PrzemianaWNiedzwiedzia = Spell(
        name = "Przemiana w niedźwiedzia",
        icon = "",
        power = 21,
        timeToCast = CastingTime.TRZY_AKCJE_PODWOJNE,
        range = "dotykowy",
        componentName = "pazur niedźwiedzia",
        componentPower = 3,
        duration = "1 godzina, ale czarodziej może w dowolnym momencie przerwać czar i powrócić do swojej prawdziwej postaci",
        description = "Czarodziej (razem z całym ekwipunkiem podręcznym) zamienia się w niedźwiedzia. W trakcie trwania czaru zachowuje wszystkie zdolności umysłowe. Pozostałe cechy przybierają wartości posiadane przez zwykłego niedźwiedzia. Czarodziej zamieniony w niedźwiedzia nie może mówić ani rzucać czarów."
    )
}

////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////// TRADYCJA ŻYCIA //////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////

object LifeTradition {

    // ŚCIEŻKA GŁÓWNA
    val Fermentacja = Spell(
        name = "Fermentacja",
        icon = "",
        power = 4,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "kropla wody z czystego źródła",
        componentPower = 1,
        duration = "24 godziny",
        description = "Czarodziej zmienia dowolnie mętną lub zanieczyszczoną ciecz (w ilości wystarczającej do zaspokojenia pragnienia kilkunastu osób) w lekko sfermentowany napój (piwo, wino, miód pitny, itp.). Po 24 godzinach zaklęcie przestaje działać, a nie wypity napój powraca do pierwotnego stanu."
    )

    val KlatwaGcierni = Spell(
        name = "Klątwa cierni",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "36 metrów",
        componentName = "cierń",
        componentPower = 1,
        duration = "1k10 rund",
        description = "W ciało dowolnej postaci znajdującej się w odległości do 36 metrów wrastają kolce, powodując okropny ból. Na początku każdej rundy trwania czaru postać musi wykonać test Siły Woli. Nieudany test oznacza, że traci 1 punkt Żywotności, bez względu na Wytrzymałość i noszoną zbroję, oraz otrzymuje modyfikator -20 do wszystkich testów wykonywanych w tej rundzie."
    )

    val KrewZiemi = Spell(
        name = "Krew ziemi",
        icon = "",
        power = 9,
        timeToCast = CastingTime.JEDNA_DZIESIEC,
        range = "dotykowy",
        componentName = "sztylet",
        componentPower = 1,
        duration = "chwilowy",
        description = "Czarodziej wchłania energię życiową z ziemi, na której stoi. Czar ten przywraca mu tyle punktów Żywotności, ile akcji przeznaczył na rzucenie zaklęcia. Czarodziej nie może użyć tego czaru do uzdrowienia innej postaci."
    )

    val DzikieSciezki = Spell(
        name = "Dzikie ścieżki",
        icon = "",
        power = 11,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "kępka nienaruszonego od dziesięciu dni mchu",
        componentPower = 2,
        duration = "dopóki nie zostanie przerwany",
        description = "Napełniony mocą Zielonego Wiatru Magii czarodziej przemierza dzikie obszary równie łatwo, jak gdyby podróżował po najlepiej utrzymanej imperialnej drodze. Nie pozostawia również żadnych śladów. Zaklęcie przestaje działać przy kontakcie z cywilizacją lub po przejściu 150 kilometrów. Jest to czar dotykowy obejmujący liczbę osób równą wartości Magii czarodzieja."
    )

    val JesienneListcie = Spell(
        name = "Jesienne liście",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "liść dębu",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii czarodzieja",
        description = "Liście leżące w pobliżu czarodzieja zaczynają wirować wokół niego, ograniczając przeciwnikom widoczność. W trakcie trwania czaru wszystkie wymierzone w czarodzieja ataki bronią strzelecką i rzucaną wykonywane są z modyfikatorem -20. Wirujące liście nie ograniczają natomiast pola widzenia czarodzieja. To zaklęcie może on rzucić wyłącznie na siebie."
    )

    val WrotaZiemi = Spell(
        name = "Wrota ziemi",
        icon = "",
        power = 14,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "48 metrów",
        componentName = "żelazny klucz",
        componentPower = 2,
        duration = "chwilowy",
        description = "Czarodziej nagle zapada się pod ziemię i pojawia się w dowolnym miejscu w odległości do 48 metrów. Zarówno miejsce zniknięcia, jak i pojawienia się, muszą znajdować się na obszarze pokrytym ziemią. Czarodziej nie może więc użyć tego zaklęcia wewnątrz budynku lub na wybrukowanej ulicy."
    )

    val ZakleteDrzewo = Spell(
        name = "Zaklęte drzewo",
        icon = "",
        power = 16,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "pasek kory",
        componentPower = 1,
        duration = "liczba godzin równa wartości Magii czarodzieja",
        description = "Czarodziej napełnia mocą natury dowolną istotę (za jej zgodą), pozwalając jej przybrać kształt drzewa. Gatunek rośliny zależy od cech charakteru osoby. W trakcie trwania czaru postać zachowuje zmysły, jednakże pozostaje wrażliwa na wszelkie ciosy, jakie mogą zranić drzewo (a także na ogień i pasożytnicze grzyby)."
    )

    val SzumDrzew = Spell(
        name = "Szum drzew",
        icon = "",
        power = 18,
        timeToCast = CastingTime.GODZINA,
        range = "dotykowwy",
        componentName = "garść wilgotnej ziemi",
        componentPower = 1,
        duration = "1 godzina",
        description = "Siedząc wśród konarów, czarodziej rozmawia z drzewem. Może uzyskać od niego informacje o tym, czego drzewo było świadkiem. Drzewa nie potrafią kłamać, ale myślą wolno i nie rozumieją pobudek bardziej 'pochopnych' ras. Rozmowa z drzewem zajmuje godzinę, ale jest to odpowiednik zaledwie minutowej rozmowy między dwoma osobami."
    )

    val Gejzer = Spell(
        name = "Gejzer",
        icon = "",
        power = 22,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "24 metry",
        componentName = "różdżka do poszukiwania wody, poświęcona przez kapłana Taala",
        componentPower = 3,
        duration = "1 godzina",
        description = "Czarodziej przyzywa moc wód głębinowych. Z dowolnego pokrytego ziemią obszaru w odległości do 24 metrów tryska w niebo gejzer wody. Wszystkie postacie w promieniu 3 metrów wokół niego otrzymują trafienie z Siłą 4 i zostają odrzucone przez strumienie wody o 4 metry w kierunku wskazanym przez czarodzieja. Padają na ziemię i zostają ogłuszone na 1k10 rund."
    )

    val Zlodowacenie = Spell(
        name = "Zlodowacenie",
        icon = "",
        power = 25,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "48 metrów",
        componentName = "fiolka z roztopionym śniegiem ze szczytu górskiego",
        componentPower = 3,
        duration = "liczba minut równa wartości Magii czarodzieja",
        description = "Czarodziej przywołuje magiczną moc, pokrywając grubą warstwą lodu dowolny obszar w odległości do 48 metrów. Wszystkie postacie w promieniu 5 metrów wokół wskazanego miejsca otrzymują trafienie z Siłą 4 i muszą wykonać test Siły Woli. Nieudany test oznacza, że przez 1 rundę są traktowane jako bezbronne. W trakcie trwania czaru wszystkie postacie poruszają się z połową Szybkości."
    )

    // ŚCIEŻKA MISTYCZNA*/

    val CzytanieZeSladow = Spell(
        name = "Czytanie ze śladów",
        icon = "",
        power = 7,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "gałąź z drzewa",
        componentPower = 1,
        duration = "dopóki nie zostanie przerwany",
        description = "Czarodziej wsłuchuje się w cichy poszum drzew i szept ziemi. Dzięki temu z łatwością (otrzymuje modyfikator +20) może odczytywać ślady lub zdobyć informacje o istotach, które przechodziły w pobliżu. Zaklęcie przestaje działać, gdy czarodziej dotrze do sztucznie stworzonej drogi lub wejdzie na ziemię zamieszkaną albo uprawianą."
    )

    val MalpiaZrecznosc = Spell(
        name = "Małpia zręczność",
        icon = "",
        power = 8,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "odrobina soku roślinnego",
        componentPower = 1,
        duration = "nie określony",
        description = "Czarodziej obdarza dowolną postać nadnaturalną zdolnością wspinania się i poruszania w trudnym terenie. Postać otrzymuje modyfikator +20 do testów wspinaczki oraz wszelkich związanych z ruchem w terenie dzikim. Jest to czar dotykowy, ale czarodziej może go rzucić również na siebie."
    )

    val PoleCierniowe = Spell(
        name = "Pole cierniowe",
        icon = "",
        power = 14,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "48 metrów",
        componentName = "cierń z nabitym kawałkiem ciała",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii czarodzieja",
        description = "Czarodziej przywołuje ciernie i kolczaste krzewy, które w okamgnieniu wyrastają z ziemi, w dowolnym miejscu w zasięgu 48 metrów. Wszystkie postacie w promieniu 5 metrów wokół wskazanego miejsca zostają oplątane przez magiczne pnącza. Takie postacie mogą się przemieszczać (z połową Szybkości), ale każdy ruch powoduje automatycznie trafienie z Siłą 4."
    )

    val Rozkwitanie = Spell(
        name = "Rozkwitanie",
        icon = "",
        power = 15,
        timeToCast = CastingTime.DWA_PLUS,
        range = "dotykowy",
        componentName = "kiełek rośliny",
        componentPower = 1,
        duration = "trwały",
        description = "Przez ciało czarodzieja przepływa moc Ghyran, napełniając magiczną energią dowolną roślinę lub nasionko znajdujące się w zasięgu jego ręki. Za każdą rundę koncentracji roślina dojrzewa, jakby minął 1 dzień. Dzięki temu w ciągu godziny roślina dojrzeje o niecały rok. Rośliny będą rosły tylko w naturalnej dla siebie glebie."
    )

    val CialoZGliny = Spell(
        name = "Ciało z gliny",
        icon = "",
        power = 24,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "niewielka gliniana figurka przypominająca czarodzieja",
        componentPower = 3,
        duration = "liczba minut równa wartości Magii czarodzieja",
        description = "Skóra czarodzieja gęstnieje i twardnieje niczym zaschnięta glina. Wartości jego Krzepy i Odporności zostają podwojone, jednak znaczny ciężar powoduje ograniczenie Zręczności i Szybkości o połowę (zaokrąglane w dół)."
    )

    // ŚCIEŻKA ŻYWIOŁU*/

    val ZiemiaKarmicielka = Spell(
        name = "Ziemia karmicielka",
        icon = "",
        power = 8,
        timeToCast = CastingTime.TURA,
        range = "dotykowy",
        componentName = "garść karmy dla zwierząt",
        componentPower = 1,
        duration = "1 tydzień",
        description = "Czarodziej dotknięciem dłoni sprawia, że dowolna postać napełnia się energią Ghyran, niczym zwierzę, które obrasta w tłuszcz przed zapadnięciem w sen zimowy. W trakcie trwania czaru postać może całkowicie powstrzymywać się od jedzenia, chociaż musi pić. Jest to czar dotykowy. Czarodziej może go rzucić również na siebie."
    )

    val ZarZNieba = Spell(
        name = "Żar z nieba",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA,
        range = "zasięg wzroku",
        componentName = "fiolka wypełniona potem zacnego człowieka",
        componentPower = 2,
        duration = "1k10 rund",
        description = "Czarodziej przywołuje magiczną moc, która sprawia, że dowolnie wybrany obszar w zasięgu wzroku ogarnia skwar niczym w najgorętsze lato. Wszystkie postacie w promieniu 5 metrów wokół wskazanego miejsca pocą się niemiłosiernie i są zmęczone, jakby przez cały dzień pracowały w upale. W trakcie trwania czaru otrzymują modyfikator -20 do wszystkich testów."
    )

    val SzeptRzeki = Spell(
        name = "Szept rzeki",
        icon = "",
        power = 15,
        timeToCast = CastingTime.TURA,
        range = "dotykowy",
        componentName = "flaszka wina",
        componentPower = 2,
        duration = "liczba rund równa wartości Magii czarodzieja",
        description = "Czarodziej koncentruje się, stojąc zanurzony do pasa w rzece lub głębszym strumieniu. Moc przepływa przez jego ciało, łącząc się z wodą, co pozwala czarodziejowi komunikować się z duchem rzeki. W trakcie trwania czaru czarodziej może z nim rozmawiać na temat tego, co zdarzyło się w odmętach rzeki lub na jej powierzchni w odległości do 1 kilometra w górę i w dół biegu rzeki, w przeciągu minionych 24 godzin."
    )

    val WiosennyRozkwit = Spell(
        name = "Wiosenny rozkwit",
        icon = "",
        power = 18,
        timeToCast = CastingTime.DZIESIECMINUT,
        range = "48 metrów",
        componentName = "garść nawozu",
        componentPower = 2,
        duration = "trwały",
        description = "Czarodziej wzbudza życiodajną moc w dowolnej istocie (bez względu na rasę) lub na wybranym obszarze o wielkości pola uprawnego, zwiększając ich płodność. Ziemia wyda obfite plony, natomiast żywa istota w ciągu miesiąca zajdzie w ciążę, oczywiście po zaistnieniu pozostałych niezbędnych do tego okoliczności."
    )

    val SilaNatury = Spell(
        name = "Siła natury",
        icon = "",
        power = 27,
        timeToCast = CastingTime.DZIESIECMINUT,
        range = "dotykowy",
        componentName = "fiolka wypełniona wodą z poświęconej sadzawki",
        componentPower = 3,
        duration = "do końca trwającej pory roku",
        description = "Magia natury przenika czarodzieja, który dzięki niej oczyszcza z zarazy obszar o powierzchni jednego kilometra kwadratowego. Wszystkie rośliny na wskazanym obszarze zostają magicznie wyleczone z trawiącej je zarazy. W trakcie trwania czaru obszar chroniony jest przed wszelkimi efektami tej plagi. Czar może również zostać wykorzystany do wyleczenia 2k10 postaci dotkniętych chorobą. Czas jej trwania zmniejsza się o połowę (zaokrąglane w dół)."
    )
}

/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////// TRADYCJA CHAOSU ///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////

object ChaosTradition {

    val WizjaMeki = Spell(
        name = "Wizja męki",
        icon = "",
        power = 7,
        timeToCast = CastingTime.AKCJA,
        range = "24 metry",
        componentName = "niewielka maska",
        componentPower = 1,
        duration = "1 runda",
        description = "Czarnoksiężnik sprawia, że dowolną postać znajdujący się w odległości do 24 metrów nawiedzają piekielne wizje. Ofiara musi wykonać test Siły Woli. Nieudany test oznacza, że postać zostaje ogłuszona. Gdy otrząśnie się z szoku, musi wykonać kolejny test Siły Woli. Nieudany test oznacza, że otrzymuje 1 Punkt Obłędu."
    )

    val LaskaChaosu = Spell(
        name = "Łaska Chaosu",
        icon = "",
        power = 9,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "amulet z symbolem jednego z bogów Chaosu",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Czarnoksiężnik zwraca się do Mrocznych Potęg Chaosu z prośbą o błogosławieństwo. W trakcie trwania czaru otrzymuje modyfikator +10 do Walki Wręcz, Odporności, Siły Woli i Oglądy."
    )

    val PrzyzwaniePomniejszegoDemona = Spell(
        name = "Przyzwanie pomniejszego demona",
        icon = "",
        power = 12,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "12 metrów",
        componentName = "wciąż bijące serce istoty humanoidalnej",
        componentPower = 2,
        duration = "1k10 minut",
        description = "Czarnoksiężnik przyzywa pomniejszego demona który pojawia się w dowolnym miejscu w odległości do 12 metrów. Udany test Siły Woli umożliwia czarnoksiężnikowi kontrolę nad poczynaniami demona."
    )

    val PalacaKrew = Spell(
        name = "Paląca krew",
        icon = "",
        power = 13,
        timeToCast = CastingTime.AKCJA,
        range = "24 metry",
        componentName = "fiolka wypełniona krwią demona",
        componentPower = 3,
        duration = "chwilowy",
        description = "Czarnoksiężnik pluje krwią, która pali niczym kwas. Jest to magiczny pocisk o Sile 4. Wybrana postać znajdująca się w odległości do 24 metrów otrzymuje tyle trafień, ile wynosi Magia czarodzieja."
    )

    val PokusaChaosu = Spell(
        name = "Pokusa Chaosu",
        icon = "",
        power = 16,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "24 metry",
        componentName = "zbezczeszczony święty symbol",
        componentPower = 2,
        duration = "1 runda",
        description = "Czarnoksiężnik roztacza wizję Chaosu, która oczarowuje dowolną postać znajdującą się w odległości do 24 metrów. Ofiara może odeprzeć czar, wykonując udany test Siły Woli. Nieudany test oznacza, że w swojej następnej turze postać wykonuje polecenia czarnoksiężnika. To zaklęcie nie działa na ożywieńców."
    )

    val MrocznaOlonZniszczenia = Spell(
        name = "Mroczna dłoń zniszczenia",
        icon = "",
        power = 17,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "dłoń wisielca",
        componentPower = 2,
        duration = "liczba rund równa wartości Magii czarnoksiężnika",
        description = "Czarnoksiężnik przyzywa moc i skupia ją wokół swojej dłoni. W trakcie trwania czaru ręka czarnoksiężnika jest traktowana jako magiczna broń o Sile 7 z cechą oręża \"przebijający zbroję\". Czarnoksiężnik otrzymuje +10 do Walki Wręcz, gdy wykonuje ataki zaczarowaną ręką."
    )

    val DotykChaosu = Spell(
        name = "Dotyk Chaosu",
        icon = "",
        power = 20,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "róg zwierzoczłeka",
        componentPower = 2,
        duration = "chwilowy",
        description = "Dotyk czarnoksiężnika wtłacza czystą energię Chaosu w ciało dowolnej postaci. Ofiara może odeprzeć czar, wykonując udany test Siły Woli. Nieudany test oznacza że w jej ciele zachodzi błyskawiczna przemiana. Losowo wyznacz mutację Chaosu. Postać musi wykonać kolejny test Siły Woli. Nieudany test oznacza, że wskutek gwałtownego tempa przemiany zostaje ogłuszona na 1 rundę. Jest to czar dotykowy; który nie działa na ożywieńców."
    )

    val WelonZepsucia = Spell(
        name = "Welon zepsucia",
        icon = "",
        power = 24,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "36 metrów",
        componentName = "miecz wojownika Chaosu",
        componentPower = 3,
        duration = "do chwili wykonania udanego testu Siły Woli przez każdą postać objętą działaniem czaru",
        description = "Czarnoksiężnik przyzywa mroczną chmurę zepsucia w dowolnym miejscu w odległości do 36 metrów. Wszystkie postacie w promieniu 5 metrów wokół wskazanego miejsca muszą wykonać test Siły Woli. Nieudany test oznacza, że tracą 1 punkt Żywotności, bez względu na Wytrzymałość i noszoną zbroję. Odniesione w ten sposób rany zaczynają gwałtownie gnić, co powoduje, że postać w każdej turze automatycznie traci punkt Żywotności, dopóki nie wykona udanego testu Siły Woli."
    )

    val PrzyzwanieGrupyDemonow = Spell(
        name = "Przyzwanie grupy demonów",
        icon = "",
        power = 25,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "12 metrów",
        componentName = "wciąż bijące serca sześciu humanoidów",
        componentPower = 3,
        duration = "1k10 minut",
        description = "Zaklęcie działa podobnie jak przyziemie pomniejszego demona z tą różnicą, że czarnoksiężnik przywołuje kilka pomniejszych demonów (tyle, ile wynosi jego Magia). Pojawiają się w dowolnym miejscu w odległości do 12 metrów."
    )

    val SlowoBolu = Spell(
        name = "Słowo bólu",
        icon = "",
        power = 27,
        timeToCast = CastingTime.AKCJA,
        range = "zasięg słuchu",
        componentName = "krew demona",
        componentPower = 3,
        duration = "chwilowy",
        description = "Czarnoksiężnik głośno wypowiada jedno z tajemnych imion Bóstw Chaosu. Samo jego brzmienie sprawia okropne cierpienie istotom znajdującym się dookoła. Wszystkie postacie w promieniu 10 metrów wokół czarnoksiężnika otrzymują trafienie z Siłą 8 i muszą wykonać test Siły Woli. Nieudany test oznacza, że na 1 rundę zostają ogłuszone. Zaklęcie nie działa na rzucającego go czarnoksiężnika."
    )
}

/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////// TRADYCJA NEKROMANCJI ////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////

object NecromancyTradition {

    val Ozywienie = Spell(
        name = "Ożywienie",
        icon = "",
        power = 5,
        timeToCast = CastingTime.JEDNA_DZIESIEC,
        range = "36 metrów",
        componentName = "pył z mogiły",
        componentPower = 1,
        duration = "dopóki nie zostanie przerwany",
        description = "Nekromanta ożywia zwłoki, tworząc zombi lub szkielety w liczbie równej wartości jego Magii. Podczas rzucania zaklęcia nekromanta musi znajdować się nie dalej niż 12 metrów od świeżych zwłok (z których powstają zombi) lub kości (z których powstają szkielety)."
    )

    val ObliceSmierci = Spell(
        name = "Oblicze śmierci",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "czaszka",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Twarz nekromanty przybiera wygląd wyszczerzonej czaszki - symbolu śmierci. W trakcie trwania czaru czarnoksiężnik wzbudza Strach."
    )

    val Witalnosc = Spell(
        name = "Witalność",
        icon = "",
        power = 11,
        timeToCast = CastingTime.TRZY_AKCJE,
        range = "dotykowy",
        componentName = "kły nietoperza wampira",
        componentPower = 1,
        duration = "chwilowy",
        description = "Nekromanta pije krew trupa i w ten sposób leczy swoje rany. Musi mieć do dyspozycji zwłoki istoty, która umarła najwyżej godzinę wcześniej. Czar przywraca nekromancie 1k10 punktów Żywotności."
    )

    val SmiertelnyDotyk = Spell(
        name = "Śmiertelny dotyk",
        icon = "",
        power = 13,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "dłoń mordercy",
        componentPower = 2,
        duration = "chwilowy",
        description = "Dotyk nekromanty rani ciało przeciwnika. Ofiara traci 1k10 punktów Żywotności, bez względu na Wytrzymałość i noszoną zbroję. Jest to czar dotykowy, który nie działa na ożywieńców."
    )

    val ZewVanhela = Spell(
        name = "Zew Vanhela",
        icon = "",
        power = 13,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "24 metry",
        componentName = "niewielka srebrna trąbka",
        componentPower = 2,
        duration = "chwilowy",
        description = "Nekromanta napełnia energią Dhar kontrolowanych przez siebie ożywieńców: 1k10 szkieletów, zombi lub upiorów natychmiast może wykonać akcję \"ruch\" lub \"zwykły atak\", nawet jeśli to nie jest ich tura działania. Akcja taka jest uznawana za akcję natychmiastową, która nie ma wpływu na ograniczenie liczby akcji, jakie ożywieńcy mogą wykonać w tej rundzie."
    )

    val PrzyzwanieDucha = Spell(
        name = "Przyzwanie ducha",
        icon = "",
        power = 17,
        timeToCast = CastingTime.AKCJA,
        range = "24 metry",
        componentName = "kawałek drewna ze zbezczeszczonej trumny",
        componentPower = 2,
        duration = "24 godziny",
        description = "Nekromanta przyzywa i zmusza do posłuszeństwa dowolnego ducha, widmo lub zjawę, znajdujące się w odległości do 24 metrów. Ożywieńiec musi wykonać test Siły Woli. Nieudany test oznacza, że w trakcie trwania czaru pozostaje posłuszny rozkazom nekromanty."
    )

    val Martwica = Spell(
        name = "Martwica",
        icon = "",
        power = 19,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "kawałek ciała upiora",
        componentPower = 3,
        duration = "1 minuta (6 rund)",
        description = "Moc Dhar przenika ciało nekromanty, nadając mu twardość zesztywniałego pośmiertnie trupa. W trakcie trwania czaru Wartość Krytyczna każdego trafienia krytycznego, jakie otrzyma czarnoksiężnik, zmniejsza się o wartość jego Magii."
    )

    val OzywienieUmarlych = Spell(
        name = "Ożywienie umarłych",
        icon = "",
        power = 22,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "24 metry",
        componentName = "pył z mumii",
        componentPower = 3,
        duration = "dopóki nie zostanie przerwany",
        description = "Zaklęcie działa podobnie jak ożywienie z tą różnicą, że nekromanta ożywia 2k10 szkieletów lub zombi, które powstają z dowolnych zwłok znajdujących się w odległości do 24 metrów."
    )

    val PrzebudzenieUpiora = Spell(
        name = "Przebudzenie upiora",
        icon = "",
        power = 24,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        componentName = "korona z żelaza hartowanego w ludzkiej krwi",
        range = "24 metry",
        componentPower = 3,
        duration = "dopóki nie zostanie przerwany",
        description = "Zaklęcie działa podobnie jak ożywienie z tą różnicą, że nekromanta ożywia upiora. Wykorzystane zwłoki muszą należeć do postaci, która za życiu wykonywała profesję zaawansowaną."
    )

    val ZProchuPowstales = Spell(
        name = "Z prochu powstałeś...",
        icon = "",
        power = 26,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "48 metrów",
        componentName = "fiolka wypełniona wodą święconą",
        componentPower = 3,
        duration = "chwilowy",
        description = "Nekromanta zaklina moc Dhar, tworząc magiczny wir w dowolnym miejscu w odległości do 48 metrów. Połączone osiem Wiatrów Magii wysysa magiczną energię ze wszystkich ożywieńców, które znajdują się na wybranym obszarze. Wszyscy ożywieńcy w promieniu 5 metrów wokół wskazanego miejsca otrzymują trafienie z Siłą 5. Zaklęcie automatycznie niszczy szkielety i zombi."
    )
}

///////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////// TRADYCJA NAGASHA //////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////

object NagashTradition {

    // ŚCIEŻKA NAGASHA

    val FontannyKrwi = Spell(
        name = "Fontanny krwi",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "12 metrów",
        componentName = "pijawka",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii",
        description = "Wszystkie żywe istoty w zasięgu działania zaklęcia krwawią silniej niż normalnie, jakby krew 'chciała' opuścić ich ciała. Każda śmiertelna istota w zasięgu 1 metrów, która straci co najmniej 1 punkt Żywotności, natychmiast traci następny punkt Żywotności (bez uwzględnienia pancerza i Wytrzymałości). To zaklęcie jest szczególnie przydatne dla wampirów, ponieważ ułatwia im wysysanie krwi z ofiary. Rzucenie tego zaklęcia podwaja tempo daru krwi 'wyssanie krwi', co oznacza, że ofiara za każdym razem traci 2k10 punktów Krzepy. W przypadku kontrolowanego żerowania wampir wykonuje rzut 3k10 i wybiera dwa wyniki. Jeśli wypadnie dublet, należy zsumować liczbę oczek na wszystkich trzech kostkach i właśnie tyle punktów Krzepy wampir wysysa ze swojej ofiary."
    )

    val NocnaJazda = Spell(
        name = "Nocna jazda",
        icon = "",
        power = 11,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "ząb konia rasy arabskiej",
        componentPower = 2,
        duration = "patrz opis",
        description = "Wierzchowiec wampira (oraz maksymalnie pięć innych) zostaje nasycony mocą Dhar. Od zmierzchu do świtu zyskuje +1 do Szybkości i może wykonywać akcję 'bieg', nawet jeśli dotyczą go zasady zdolności specjalnej powolny. Zyskuje także zdolność wrodzoną eteryczny, podobnie jak jego jeździec i ciągnięty wóz lub powóz. Tego zaklęcia używają wampiry, żeby jeszcze przed świtem dogonić uciekinierów. W trakcie pościgu gnają w linii prostej za ściganym, nie zważając na śmiertelników i budynki, przez które przenikają. Zasięg 12 metrów"
    )

    val SpojrzenieNagasha = Spell(
        name = "Spojrzenie Nagasha",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA,
        range = "24 metry",
        componentName = "oko nekromanty wyrwane z oczodołu",
        componentPower = 2,
        duration = "liczba rund równa wartości Magii",
        description = "Z oczu nekromanty tryskają magiczne pociski Dhar. Trafione nimi ciało czernieje i wysycha na popiół, odsłaniając pobielałe kości. Jest to magiczny pocisk o Sile 3. Nekromanta może rzucić jedno takie zaklęcie. Zasięg 24 metry"
    )

    val PiekielnaWerwa = Spell(
        name = "Piekielna werwa",
        icon = "",
        power = 15,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "24 metry",
        componentName = "kość z palca wojownika",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii",
        description = "Nekromanta przekazuje energię Dhar kontrolowanym przez siebie ożywieńcom (maksymalnie tylu, ile wynosi podwójna wartość jego Magii). Każdy objęty działaniem zaklęcia nieumarły porusza się szybciej, przepełniony surową mocą gniewu. W każdej rundzie może przerzucić jeden nieudany test Walki Wręcz. Zasięg 24 metry"
    )

    val FalaSmierci = Spell(
        name = "Fala śmierci",
        icon = "",
        power = 21,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "18 metrów",
        componentName = "pięć szczypt spopielonego ciała wampira",
        componentPower = 3,
        duration = "natychmiastowy",
        description = "Ruchem ręki nekromanta wyzwala niszczycielskie nekromanckie moce, które wysysają życie z jego przeciwników, wysuszając im skórę, zmieniając krew w pył i krusząc kości. Zaklęcie działa na maksymalnie tylu śmiertelników znajdujących się w zasięgu, ile wynosi wartość Magii nekromanty. Każdy z nich traci 1k10 punktów Żywotności (bez uwzględnienia Wytrzymałości i pancerza). Zasięg 18 metrów"
    )

    val Pomor = Spell(
        name = "Pomór",
        icon = "",
        power = 27,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "2,5 kilometra kwadratowego",
        componentName = "korzeń mięsożernej rośliny",
        componentPower = 3,
        duration = "natychmiastowy",
        description = "Nekromanta wysysa życie z wyznaczonego obszaru. Rośliny więdną, zwierzęta chorują i zdychają, woda staje się trująca, gleba zmienia się w popiół i pył. Zwierzęta będą instynktownie omijać ten teren, a ludzie nazywać go nawiedzonym. Moc Dhar gromadzi się tam samoistnie, zapewniając czarnoksiężnikom dodatkową kostkę przy ustalaniu uzyskanego poziomu mocy. Na obszarze dotkniętym pomorem nie można uprawiać żadnych roślin do czasu, aż Magister Kolegium Jadeitu odwróci efekt zaklęcia, rzucając czar siła natury."
    )
}

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////// TRADYCJE MAGII SKAVEŃSKIEJ ////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////

object SkavenTraditions {

    // TRADYCJA SKRYTOŚCI
    object SkrytosiTradition {

        val SuchaNoga = Spell(
            name = "Suchą nogą",
            icon = "",
            power = 6,
            timeToCast = CastingTime.AKCJA,
            range = "dotykowy",
            componentName = "kawałek korka",
            componentPower = 1,
            duration = "liczba minut równa wartości Magii czarownika",
            description = "Skaven nabiera pływalności kawałka drewna, co umożliwia mu chodzenie po powierzchni cieczy, takich jak woda, ścieki lub olej, zupełnie jakby były ciałem stałym."
        )

        val HycHyc = Spell(
            name = "Hyc-hyc",
            icon = "",
            power = 8,
            timeToCast = CastingTime.AKCJA,
            range = "12 metrów",
            componentName = "tylna łapa szczura",
            componentPower = 1,
            duration = "chwilowy",
            description = "Z odgłosem zasysanego powietrza i w kłębie cuchnącego siarką dymu czarownik teleportuje siebie lub jednego sprzymierzeńca znajdującego się w promieniu 12 metrów do dowolnego miejsca w polu widzenia. Jeśli teleportuje sprzymierzeńca, ta postać musi być najwyżej rozmiaru człowieka. Czarownik musi widzieć lokację, do której teleportuje siebie lub sprzymierzeńca, a lokacja ta musi być wolna od przeszkód i oddalona o co najmniej 2 metry od wszelkich innych obiektów (poza powierzchnią, na której stanie przeniesiona osoba) lub stworzeń."
        )

        val TrujacyRopien = Spell(
            name = "Trujący ropień",
            icon = "",
            power = 10,
            timeToCast = CastingTime.AKCJA,
            range = "dotykowy",
            componentName = "zardzewiały lancet",
            componentPower = 2,
            duration = "",
            description = "Skaven tworzy pulsujący, ociekający ropą wrzód na jednej ze swych kończyn. Gdy wrzód zostanie przebity (powodując utratę 1 punktu Żywotności, bez uwzględnienia Wytrzymałości i pancerza), wyciekającą z niego ropą można natrzeć ostrze dowolnej broni jednoręcznej. Jeśli cios tym orężem spowoduje utratę choć 1 punktu Żywotności, ofiara musi wykonać Trudny (-20) test Odporności. Nieudany test oznacza, że traci tyle punktów Żywotności, ile wynosi wartość Magii czarownika."
        )

        val LepkieLapy = Spell(
            name = "Lepkie łapy",
            icon = "",
            power = 12,
            timeToCast = CastingTime.AKCJA,
            range = "dotykowy",
            componentName = "kropla kleju lub miodu",
            componentPower = 2,
            duration = "liczba minut równa wartości Magii czarownika",
            description = "Skaven zyskuje zdolność chodzenia lub pełzania po ścianach i sklepieniach z normalną Szybkością. Noszone przez niego przedmioty nadal podlegają grawitacji i upuszczone, spadną na podłoże."
        )

        val Chyzobieg = Spell(
            name = "Chyżobieg",
            icon = "",
            power = 14,
            timeToCast = CastingTime.AKCJA,
            range = "dotykowy",
            componentName = "skalp elfa",
            componentPower = 2,
            duration = "1 minuta (6 rund) plus jedna dodatkowa runda za każdy punkt uzyskanej mocy powyżej wymaganego poziomu mocy",
            description = "Skaven uzyskuje zdolność poruszania się w zwiększonym tempie. W trakcie trwania czaru jego Szybkość wzrasta o wartość jego Magii."
        )

        val FutroSkrytobojcy = Spell(
            name = "Futro skrytobójcy",
            icon = "",
            power = 16,
            timeToCast = CastingTime.AKCJA,
            range = "dotykowy",
            componentName = "skóra kameleona",
            componentPower = 2,
            duration = "liczba minut równa wartości Magii czarownika",
            description = "Przywołując wiecznie zmieniającą się energię spaczenia, skaven przekształca strukturę własnego futra, by zmieniało kolor zależnie od otoczenia. Gdy czarownik stoi w idealnym bezruchu, otrzymuje modyfikator +30 do testów ukrywania się."
        )

        val ZabojczaFuria = Spell(
            name = "Zabójcza furia",
            icon = "",
            power = 18,
            timeToCast = CastingTime.AKCJA_PODWOJNA,
            range = "18 metrów",
            componentName = "dwie krople krwi zwierzęcia chorego na wściekliznę",
            componentPower = 2,
            duration = "liczba rund równa wartości Magii czarownika + 1k10",
            description = "Skaven wzbudza w dowolnym towarzyszu w zasięgu 18 metrów straszliwy głód, od którego występuje piana na pysku, a ślepia zaczynają szaleńczo obracać się w oczodołach. W trakcie trwania czaru postać zyskuje zdolność czarny głód, ale musi natychmiast po rzuceniu czaru wywołać w sobie czarny głód, w przeciwnym razie zaklęcie nie odnosi skutku."
        )

        val CzarnyWir = Spell(
            name = "Czarny wir",
            icon = "",
            power = 20,
            timeToCast = CastingTime.AKCJA_PODWOJNA,
            range = "48 metrów",
            componentName = "szklana fiolka wypełniona popiołem",
            componentPower = 3,
            duration = "liczba rund równa wartości Magii czarownika",
            description = "W dowolnym miejscu w zasięgu 48 metrów skaven przywołuje cuchnący wir paskudnego dymu i ostrych drobinek popiołu. Każda postać w promieniu 3 metrów od wskazanego miejsca otrzymuje trafienie z Siłą 2 i musi wykonać udany test Odporności, w przeciwnym razie na 1k10 minut otrzyma modyfikator -20 do testów Walki Wręcz, Umiejętności Strzeleckich, Zręczności oraz testów spostrzegawczości związanych ze wzrokiem. W czasie trwania czaru w każdej rundzie wir może przesunąć się na odległość do 10 metrów w kierunku wskazanym przez czarownika."
        )

        val ZnikniecieTwlok = Spell(
            name = "Zniknięcie zwłok",
            icon = "",
            power = 22,
            timeToCast = CastingTime.GODZINA,
            range = "18 metrów",
            componentName = "30 gramów spaczenia połkniętego przez cel(e) zaklęcia",
            componentPower = 3,
            duration = "liczba godzin równa wartości Magii czarownika",
            description = "Jeśli postać poddana mocy tego zaklęcia umrze, jej ciało rozpuszcza się w paskudnie cuchnący, czarny śluz. Zniknięcie zwłok jest zwykle rzucane na skrytobójców z klanu Eshin, zanim wyruszą na misję, dzięki czemu na miejscu akcji nie pozostaną żadne trupy skavenów. To zaklęcie może być rzucone na tylu towarzyszy czarownika, ile wynosi czterokrotna wartość jego Magii."
        )

        val SpaczenioeGwiazdki = Spell(
            name = "Spaczeniowe gwiazdki",
            icon = "",
            power = 26,
            timeToCast = CastingTime.AKCJA,
            range = "36 metrów",
            componentName = "pokryta runami Chaosu srebrna gwiazdka do rzucania",
            componentPower = 3,
            duration = "chwilowy",
            description = "Skaven wywołuje tyle zatrutych spaczeniowych gwiazdek, ile wynosi wartość jego Magii, i rzuca nimi w jednego lub więcej przeciwników w zasięgu 36 metrów. Są to magiczne pociski o Sile 2. Jeśli trafienie spowoduje utratę choć 1 punktu Żywotności, ofiara musi wykonać Trudny (-20) test Odporności. Nieudany test oznacza, że traci kolejne 5 punktów Żywotności."
        )
    }

    // TRADYCJA SPACZENIA
    object SpaczenieTradition {

        val IskrzacaZaglada = Spell(
            name = "Iskrząca zagłada",
            icon = "",
            power = 7,
            timeToCast = CastingTime.AKCJA,
            range = "12 metrów",
            componentName = "zwój miedzianego drutu",
            componentPower = 1,
            duration = "chwilowy",
            description = "Skaven ciska iskrzącym wyładowaniem zielonej energii w dowolny cel w promieniu 12 metrów. Jest to magiczny pocisk o Sile 2. Ugodzona postać musi wykonać udany Prosty (+10) test Odporności, w przeciwnym razie zostaje ogłuszona na 1 rundę."
        )

        val PancerzCiemnosci = Spell(
            name = "Pancerz ciemności",
            icon = "",
            power = 13,
            timeToCast = CastingTime.AKCJA,
            range = "dotykowy",
            componentName = "kawałek poczerniałej skóry",
            componentPower = 2,
            duration = "liczba minut równa wartości Magii czarownika",
            description = "Skaven zagęszcza cienie wokół swego ciała. Trudniej go dostrzec w słabym oświetleniu, a zbroja z cieni chroni go też przed obrażeniami. Czarownik uzyskuje 1 Punkt Zbroi na każdej lokacji trafienia oraz modyfikator +20 do wszystkich testów ukrywania się, wykonywanych w ciemnych miejscach. Skaven nie może rzucić tego zaklęcia, jeśli ma na sobie jakikolwiek zwykły pancerz. Jeśli założy zbroję podczas działania zaklęcia, czar natychmiast się rozprasza."
        )

        val SpaczeniwyGrom = Spell(
            name = "Spaczeniowy grom",
            icon = "",
            power = 11,
            timeToCast = CastingTime.AKCJA,
            range = "48 metrów",
            componentName = "wąski pręt miedziany",
            componentPower = 2,
            duration = "chwilowy",
            description = "Skaven ciska iskrzącą błyskawicę spaczenia w dowolną postać w zasięgu 48 metrów. Jest to magiczny pocisk o Sile 5. Za każdą '1' wyrzuconą na kostce podczas określania uzyskanego poziomu mocy, czarownik otrzymuje trafienie z Siłą 1, z powodu utraty kontroli nad wyładowaniem energii spaczeniowej."
        )

        val RojSzkodnikow = Spell(
            name = "Rój szkodników",
            icon = "",
            power = 14,
            timeToCast = CastingTime.AKCJA_PODWOJNA,
            range = "5 metrów",
            componentName = "krąg sera dobrej jakości",
            componentPower = 2,
            duration = "liczba rund równa wartości Magii czarownika",
            description = "Skaven przywołuje masę żarłocznych szczurów, które całym rojem atakują jego przeciwników. Każda postać w promieniu 5 metrów od czarownika otrzymuje trafienie z Siłą 1 w każdej rundzie, gdy jest atakowana przez rój. W następnej rundzie rój szczurów przemieszcza się o 12 metrów w kierunku wskazanym przez czarownika. Potem skaven traci nad nim kontrolę i w kolejnych rundach rój przesuwa się w losowym kierunku."
        )

        val SpaczeniowaBurza = Spell(
            name = "Spaczeniowa burza",
            icon = "",
            power = 18,
            timeToCast = CastingTime.AKCJA_PODWOJNA,
            range = "48 metrów",
            componentName = "podobizna Rogatego Szczura wyryta w miedzi",
            componentPower = 2,
            duration = "chwilowy",
            description = "Czarownik wywołuje burzę spaczeniowych gromów w dowolnym miejscu w zasięgu 48 metrów. Stworzona z czystej energii spaczenia i zasilana złowrogą mocą Rogatego Szczura burza może pojawić się w dowolnym miejscu, nawet pod ziemią. Każda postać w promieniu 5 metrów od wskazanego miejsca otrzymuje trafienie z Siłą 5. Za każdą '1' wyrzuconą na kostce podczas określania uzyskanego poziomu mocy, czarownik otrzymuje trafienie z Siłą 3, z powodu utraty kontroli nad wyładowaniem energii spaczeniowej."
        )

        val SkórowanieZywcem = Spell(
            name = "Skórowanie żywcem",
            icon = "",
            power = 25,
            timeToCast = CastingTime.AKCJA_PODWOJNA,
            range = "10 metrów",
            componentName = "kawałek wyprawionej skóry człowieka, elfa lub krasnoluda",
            componentPower = 3,
            duration = "liczba rund równa wartości Magii czarownika",
            description = "Zielone wstęgi spaczonej energii oddzierają ciało od kości ofiary. W trakcie trwania czaru dowolna postać w zasięgu 10 metrów od czarownika otrzymuje co rundę trafienie z Siłą 5, bez uwzględnienia Wytrzymałości i pancerza."
        )
    }

    // TRADYCJA ZARAZY
    object ZarazaTradition {

        val OponcaZakazenia = Spell(
            name = "Opończa zakażenia",
            icon = "",
            power = 6,
            timeToCast = CastingTime.AKCJA,
            range = "dotykowy",
            componentName = "kawałek ciała wyciętego z pleców ofiary zarazy",
            componentPower = 1,
            duration = "",
            description = "Skaven zakaża koc, płaszcz lub fragment ubrania zarazkami świerzbu. Każdy, kto będzie dotykał lub nosił zakażony materiał przez minutę lub dłużej, musi wykonać udany Wymagający (-10) test Odporności, inaczej zapada na tę chorobę."
        )

        val Przegnicie = Spell(
            name = "Przegnicie",
            icon = "",
            power = 8,
            timeToCast = CastingTime.AKCJA,
            range = "6 metrów",
            componentName = "garść zgniłego ziarna",
            componentPower = 1,
            duration = "",
            description = "Wykonując gest i wypowiadając słowa klątwy, skaven powoduje zepsucie pewnej ilości jedzenia, które gnije i rozkłada się, stając się całkowicie niejadalne. Czarownik wybiera miejsce, psując całą żywność znajdującą się w promieniu 5 metrów od wskazanego punktu. To zaklęcie jest używane z wielką skutecznością, by wywoływać klęskę głodu wśród populacji na powierzchni. Dowolna postać, która zje zepsutą żywność, natychmiast zostaje zarażona chorobą smrodliwych wiatrów."
        )

        val RopiejaceRany = Spell(
            name = "Ropiejące rany",
            icon = "",
            power = 14,
            timeToCast = CastingTime.AKCJA,
            range = "24 metry",
            componentName = "brudny pazur goblina",
            componentPower = 2,
            duration = "",
            description = "Skaven sprawia, że zadawane przeciwnikowi rany stają się paskudnie zainfekowane. Ropiejące rany to magiczny pocisk o zasięgu 24 metrów. Jeśli trafi w postać, która otrzymała już przynajmniej jedno trafienie krytyczne, w jej rany wdaje się zakażenie, które utrzymuje się przez 7 dni. Ofiara nie leczy ran w normalny sposób i otrzymuje modyfikator -10 do wszystkich cech głównych. Postacie posiadające umiejętność leczenie mogą skrócić czas trwania tej choroby według normalnych zasad, ale trudność testu leczenia wykonywanego w tym celu rośnie do poziomu Wymagającego (-10)."
        )

        val ZarazliweTchnienie = Spell(
            name = "Zaraźliwe tchnienie",
            icon = "",
            power = 16,
            timeToCast = CastingTime.AKCJA,
            range = "16 metrów",
            componentName = "pałeczka kadzidła ze spaczenia, zapalona na obu końcach",
            componentPower = 2,
            duration = "chwilowy",
            description = "Skaven wydycha zaraźliwy, trujący obłok prosto w swoich wrogów. Długość wydychanej chmury wynosi 16 metrów, zaś szerokość od 1 metra przy czarowniku do 5 metrów na końcu. Każda postać w tym zasięgu musi wykonać udany Wymagający (-10) test Odporności, w przeciwnym razie otrzymuje trafienie z Siłą 4, bez uwzględnienia Wytrzymałości i pancerza. Czarownik jest odporny na własne zaraźliwe tchnienie."
        )

        val ZaslonazMuch = Spell(
            name = "Zasłona z much",
            icon = "",
            power = 18,
            timeToCast = CastingTime.AKCJA_PODWOJNA,
            range = "3 metry",
            componentName = "kawałek łajna nurglinga",
            componentPower = 2,
            duration = "liczba rund równa dwukrotnej wartości Magii czarownika",
            description = "Złorzecząc wrogom i młócąc ramionami, skaven przywołuje chmurę gzów i kąśliwych much. Owady roją się wokół niego, gryząc i kąsając jego wrogów. Każda postać w promieniu 3 metrów od czarownika otrzymuje modyfikator -20 do wszystkich testów. Zasłona z much utrudnia także dostrzeżenie otoczonego rojem skavena, co skutkuje modyfikatorem -20 do wszystkich testów US przeciwko niemu. Rój porusza się wraz ze skavenem."
        )

        val PizmoGrozy = Spell(
            name = "Piżmo grozy",
            icon = "",
            power = 20,
            timeToCast = CastingTime.AKCJA,
            range = "36 metrów",
            componentName = "żelazny krążek z wyrytym symbolem Rogatego Szczura",
            componentPower = 3,
            duration = "liczba rund równa wartości Magii czarownika",
            description = "W dowolnym miejscu w zasięgu 36 metrów skaven wywołuje wielki obłok demonicznego piżma, którego zapach przeraża wszystkie stworzenia. Każda postać w promieniu 5 metrów od wskazanego miejsca musi wykonać test Grozy. Skaveny otrzymują modyfikator -10 do tego testu. Jeśli test okazał się nieudany, a postać wydostała się poza zasięg obłoku piżma, przez dodatkową minutę (6 rund) nadal odczuwa efekty Grozy."
        )

        val KwasnyDeszcz = Spell(
            name = "Kwaśny deszcz",
            icon = "",
            power = 24,
            timeToCast = CastingTime.AKCJA_PODWOJNA,
            range = "36 metrów",
            componentName = "młoda żmija jaskiniowa",
            componentPower = 3,
            duration = "1 minuta (6 rund) plus liczba rund równa wartości Magii czarownika",
            description = "Wzywając moc Rogatego Szczura, skaven wywołuje trującą chmurę, która pojawia się w odległości do 36 metrów od niego, unosząc się kilka metrów nad ziemią. W następnej rundzie z chmury spada trujący deszcz. Każda postać w promieniu 5 metrów od wskazanego miejsca musi wykonać udany test Odporności, w przeciwnym razie zapada w koszmarny sen. Dodatkowo w trakcie trwania czaru każda postać poddana działaniu kwaśnego deszczu musi w każdej rundzie wykonać Wymagający (-10) test Odporności. Nieudany test oznacza trafienie z Siłą 2, bez uwzględnienia Wytrzymałości i pancerza. Śpiące postacie, którym powiodą się trzy testy Odporności z rzędu, uwalniają się spod wpływu zaklęcia. W innym przypadku muszą zostać obudzone w normalny sposób."
        )

        val Zaraza = Spell(
            name = "Zaraza",
            icon = "",
            power = 26,
            timeToCast = CastingTime.AKCJA_PODWOJNA,
            range = "18 metrów",
            componentName = "kropidło z martwych pcheł",
            componentPower = 3,
            duration = "",
            description = "Skaven zrasza zarazkami zielonej ospy dowolne miejsce w zasięgu 18 metrów. Każda postać w promieniu 3 metrów od wskazanego miejsca musi wykonać udany test Odporności, w przeciwnym razie natychmiast zaczyna odczuwać efekty choroby, tracąc po 5 punktów każdej cechy głównej. Za pierwszym razem, gdy inne postacie wejdą w bliski kontakt z kimkolwiek zarażonym tą plagą (także w czasie walki w zwarciu), również muszą wykonać udany test Odporności, albo same zarażą się zieloną ospą. Wtórne ofiary odczuwają normalne efekty choroby zamiast przyspieszonej wersji, jaka dotyka pierwszych zarażonych. Mogą dalej roznosić zarazę, lecz już w normalny sposób. Udany powyższy test Odporności oznacza, że postać na 24 godziny staje się odporna na działanie następnych zaklęć zarazy, nawet rzucanych przez innych czarowników."
        )
    }
}

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////// MAGIA DUCHÓW ///////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////

object SpiritMagic {

    val ZakletyKostur = Spell(
        name = "Zaklęty kostur",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "kropla krwi",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Szaman zaklina broń (tylko drewniany kij), nasycając ją mocą duchów swojego plemienia. W trakcie trwania czaru broń jest traktowana jak magiczna (Siła broni = S), natomiast użyta przeciwko istotom eterycznym posiada cechę oręża \"druzgoczący\"."
    )

    val OgienZemsty = Spell(
        name = "Ogień zemsty",
        icon = "",
        power = 8,
        timeToCast = CastingTime.AKCJA,
        range = "36 metrów",
        componentName = "2 miedziane monety",
        componentPower = 1,
        duration = "natychmiastowy",
        description = "Szaman kieruje swój gniew przeciwko wrogom plemienia. Z jego oczu tryskają zielone płomienie, uderzając w dowolnego przeciwnika znajdującego się w zasięgu 36 metrów. Jest to magiczny pocisk o Sile 4 (jeśli przeciwnikiem jest istota eteryczna, Siła czaru wynosi 6)."
    )

    val GlosDuchow = Spell(
        name = "Głos duchów",
        icon = "",
        power = 11,
        timeToCast = CastingTime.AKCJA,
        range = "12 metrów",
        componentName = "talizman ze znakiem plemienia",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Szaman przemawia w imieniu duchowych opiekunów, zachęcając współplemieńców do wielkich czynów. W trakcie trwania czaru szaman i wszyscy sprzymierzeńcy w zasięgu 12 metrów od niego otrzymują modyfikator +1 do zadawanych obrażeń oraz +10 do testów Strachu."
    )

    val OdegnanieDuchaChoroby = Spell(
        name = "Odegnanie ducha choroby",
        icon = "",
        power = 13,
        timeToCast = CastingTime.TURA,
        range = "dotykowy",
        componentName = "kubek świeżo stopionego śniegu",
        componentPower = 2,
        duration = "natychmiastowy",
        description = "Szaman dotykiem rąk potrafi pokonać złośliwego ducha choroby i wygnać go z ciała pacjenta po udanym teście Siły Woli. Jeśli szaman osiągnie dwa poziomy skuteczności, udaje mu się pokonać ducha choroby, a pacjent natychmiast zostaje wyleczony - objawy i efekty schorzenia ustępują. Za pomocą tego zaklęcia nie można wskrzesić postaci, która zmarła na skutek choroby. Jest to czar dotykowy."
    )

    val KoszmarnySen = Spell(
        name = "Koszmarny sen",
        icon = "",
        power = 15,
        timeToCast = CastingTime.TURA,
        range = "nie dotyczy",
        componentName = "lalka przedstawiająca ofiarę zaklęcia",
        componentPower = 2,
        duration = "do następnego spotkania",
        description = "Szaman pojawia się w snach ofiary, ukazując jej wizję okropnej śmierci z rąk szamana. Ponieważ są to tylko koszmarne wizje, szaman nie musi znać języka, którym posługuje się ofiara zaklęcia. Następnym razem, gdy ofiara zaklęcia zobaczy tego szamana, musi wykonać Wymagający (-10) test Grozy. Ofiara musi spać w momencie rzucania tego zaklęcia przez szamana."
    )

    val TarczaDuchow = Spell(
        name = "Tarcza duchów",
        icon = "",
        power = 20,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "12 metrów",
        componentName = "kieł olbrzymiego dzika",
        componentPower = 2,
        duration = "liczba rund równa wartości Magii szamana",
        description = "Duchy czuwają nad szamanem i otaczają opieką jego współplemieńców. Każdy z towarzyszy szamana w zasięgu 12 metrów od niego może w każdej rundzie powtórzyć rzut po jednym nieudanym teście parowania lub uniku."
    )
}

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////// TRADYCJA WIEDŹM ///////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////

object WitchTradition {

    val WiedzmaKlatwa = Spell(
        name = "Wiedźmia klątwa",
        icon = "",
        power = 8,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotyk",
        componentName = "kosmyk włosów ofiary",
        componentPower = 1,
        duration = "natychmiastowy",
        description = "Duchy umożliwiają wiedźmie wejrzenie w przyszłość dowolnej dotkniętej postaci. Jeśli postać nie doświadcza efektów Klątwy wiedźmy, natychmiast pada jej ofiarą. Dodatkowo wiedźma otrzymuje modyfikator +10 do następnego testu zastraszania lub torturowania przeciwko tej postaci."
    )

    val RozkazywanieDuchowi = Spell(
        name = "Rozkazywanie duchowi",
        icon = "",
        power = 11,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "12 metrów",
        componentName = "mózg lisa",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii",
        description = "Wiedźma próbuje zmusić ducha do posłuszeństwa. Jeśli wygra przeciwstawny test Siły Woli, będzie kontrolowała ducha przez cały czas trwania zaklęcia. Na jej rozkaz musi on wykonać wyznaczone, w ramach swoich umiejętności, działanie."
    )

    val SzczesliwyPazur = Spell(
        name = "Szczęśliwy pazur",
        icon = "",
        power = 11,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotyk",
        componentName = "pazur trzyogiego psa",
        componentPower = 2,
        duration = "liczba godzin równa wartości Magii lub do zużycia",
        description = "Wiedźma zaklina ducha szczęścia w składniku. Osoba, która go nosi, zyskuje +1 Punkt Szczęścia. Talizman rozpada się, gdy zostanie użyty, bądź też po upływie zaklętego czasu. Nie można w ten sposób korzystać z więcej niż jednego takiego zaklęcia."
    )

    val OstrzezenieOSkazie = Spell(
        name = "Ostrzeżenie o skazie",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "12 metrów",
        componentName = "relikwia kultystów Mrocznych Bogów",
        componentPower = 2,
        duration = "liczba godzin równa wartości Magii",
        description = "Duchy szeptem przekazują wiedźmie ostrzeżenie, gdy w pobliżu znajduje się sługa Mrocznych Bogów albo przedmiot lub miejsce skażone ich plugawą mocą. Jeśli wiedźma znajdzie się w zasięgu 12 metrów od takiej istoty, przedmiotu lub miejsca, otrzymuje modyfikator +20 do powiązanych z nimi testów wykrywania magii."
    )

    val PowstrzymanieDucha = Spell(
        name = "Powstrzymanie ducha",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "12 metrów",
        componentName = "kolec traszki",
        componentPower = 2,
        duration = "patrz opis",
        description = "Wiedźma wybiera dowolne miejsce w zasięgu zaklęcia. Jeden z duchów w promieniu pięciu metrów od tego miejsca musi wygrać przeciwstawny test Siły Woli, w przeciwnym razie w następnej akcji zmuszony jest uciec poza chronioną zaklęciem strefę."
    )

    val PrzywolanieDucha = Spell(
        name = "Przywołanie ducha",
        icon = "",
        power = 12,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "12 metrów",
        componentName = "określony przez MG zależnie od typu przywołanego ducha",
        componentPower = 2,
        duration = "1k10 minut",
        description = "Wiedźma wybiera dowolne miejsce w zasięgu zaklęcia i przywołuje w nim ducha. Może to być migotnik, najada, upiór czy inny duch. Musi wykonać udany test Siły Woli, żeby kontrolować ducha."
    )

    val OczyszczenieCiala = Spell(
        name = "Oczyszczenie ciała",
        icon = "",
        power = 13,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "dotyk",
        componentName = "guzik rybiej łuski",
        componentPower = 2,
        duration = "natychmiastowy",
        description = "Wiedźma z pomocą duchów wymazuje chorobę lub infekcję z ciała osoby. Udany test Siły Woli pozwala usunąć dolegliwość."
    )

    val Nawiedzenie = Spell(
        name = "Nawiedzenie",
        icon = "",
        power = 14,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "dotyk",
        componentName = "przedmiot wielkości pięści z docelowego miejsca",
        componentPower = 2,
        duration = "zależnie od składnika",
        description = "Wiedźma rzuca klątwę na wybrany budynek lub jego część. W miejscu tym pojawiają się efekty nawiedzenia: trzaskanie drzwi, złośliwe szepty, samoczynne poruszanie się przedmiotów, zimne powiewy powietrza."
    )

    val WrozbaPrzyszlosci = Spell(
        name = "Wróżba przyszłości",
        icon = "",
        power = 14,
        timeToCast = CastingTime.GODZINA,
        range = "patrz opis",
        componentName = "przedmiot bezpośrednio powiązany z pytaniem",
        componentPower = 2,
        duration = "patrz opis",
        description = "Oczy wiedźmy nabierają barwy błękitu, gdy wchodzi w trans i nawiązuje kontakt z duchami. W tym czasie jest traktowana jak bezbronna, ale dzięki jej mocy duchowa postać może zadać pytanie dotyczące przyszłego wydarzenia. Duchy udzielają odpowiedzi w formie zagadki, a Mistrz Gry może wykorzystać wizję, aby zdradzić wskazówki dotyczące bieżącej lub przyszłych przygód. Po uzyskaniu odpowiedzi z zadanym pytaniem, duchy mogą przekazać trzy nieudolne testy bezpośrednio związane z danym pytaniem (o zasadności tego związku decyduje Mistrz Gry)."
    )


    val OdganianieDucha = Spell(
        name = "Odganianie ducha",
        icon = "",
        power = 16,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "12 metrów",
        componentName = "wnętrzności lisa",
        componentPower = 2,
        duration = "patrz opis",
        description = "Wiedźma wskazuje dowolną istotę ze zdolnością wrodzoną eteryczność. Jeśli duch przegra przeciwstawny test Siły Woli, zostaje wygnany do Eteru lub do innego miejsca, z którego przybył."
    )

    val StrasznaKlatwa = Spell(
        name = "Straszna klątwa",
        icon = "",
        power = 16,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "12 metrów",
        componentName = "przedmiot związany z daną osobą",
        componentPower = 2,
        duration = "natychmiastowy",
        description = "Wiedźma przyzywa duchy, żeby przekląć dowolną istotę w zasięgu. Może się ona oprzeć mocy zaklęcia, wykonując udany Wymagający (-10) test Siły Woli. Nieudany test oznacza, że spada na nią wybrana przez wiedźmę klątwa (z ramki Przykładowa klątwa). Postać może być obiektem tylko jednej strasznej klątwy, ale powtórne rzucenie tego zaklęcia przez wiedźmę usuwa efekty poprzedniego."
    )

    val OdpornoscNaChaos = Spell(
        name = "Odporność na Chaos",
        icon = "",
        power = 17,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "12 metrów",
        componentName = "żądło śnieżnej sowy",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii",
        description = "Wiedźma przywołuje duchy, które niweczą wpływ Mrocznych Bogów z północy. Zaklęcie wywiera wpływ na wiedźmę oraz maksymalnie trzy inne postaci w zasięgu, nie wyższy podwojonej wartości jej Magii. Każda postać może się oprzeć mocy zaklęcia, wykonując udany Trudny (-20) test Siły Woli. Każda postać pod wpływem czaru (włącznie z wiedźmą) zyskuje tymczasową zdolność odporność na Chaos, ale w trakcie jego trwania nie może w ogóle rzucać zaklęć."
    )

    val PrzekleteZobowiazania = Spell(
        name = "Przeklęte zobowiązania",
        icon = "",
        power = 18,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "12 metrów",
        componentName = "przedmiot związany z daną osobą",
        componentPower = 2,
        duration = "natychmiastowy do wypełnienia",
        description = "Wiedźma nakłada na wybraną postać klątwę, która zadała jej wyjątkowo wysoki, duchowy lub inny równie ważny uszczerbek. Postać może się oprzeć mocy zaklęcia, wykonując udany Wymagający (-10) test Siły Woli. Nieudany test oznacza, że jeśli postać otrzyma polecenie zrobienia sobie krzywdy lub podjęcia działania wyraźnie dla niej szkodliwego, otrzymuje modyfikator +30 do powyższego testu Siły Woli."
    )

    val PrzeszloscUjawniona = Spell(
        name = "Przeszłość ujawniona",
        icon = "",
        power = 20,
        timeToCast = CastingTime.TRZY_AKCJE_PODWOJNE,
        range = "osobisty",
        componentName = "przedmiot bezpośrednio powiązany z pytaniem",
        componentPower = 2,
        duration = "patrz opis",
        description = "Oczy wiedźmy zmieniają barwę na czerwoną, gdy wchodzi w trans i spogląda w przeszłość przez szklaną magię. W tym czasie jest traktowana jak bezbronna. Żeby ujrzeć wizję, musi najpierw zadać pytanie duchom. Ponieważ jednak postrzega wydarzenia z punktu widzenia miejscowych duchów (często ulotnych), wizje mogą być zagadkowe i niejasne. Wizja trwa, dopóki wiedźma utrzymuje się w transie."
    )

    val OczyszczenieDuszy = Spell(
        name = "Oczyszczenie duszy",
        icon = "",
        power = 24,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "dotyk",
        componentName = "kubek niedźwiedziego moczu",
        componentPower = 3,
        duration = "natychmiastowy",
        description = "Wybrana postać wypija cały kubek mocy wiedźmianek, umożliwiając wiedźmie zaatakowanie duchów Mrocznej Bogów, które zagnieździły się w duszy spaczonej postaci. Wiedźma musi wykonać udany Wymagający (-10) test Siły Woli. Jeśli wskazana postać wciąż żyje, jest gotowa poddać się mocy zaklęcia i wykonać udany Wymagający (-10) test Odporności, tracąc wpływ przed wiedźmę umarłca."
    )

    val AvatarStarejWdowy = Spell(
        name = "Avatar Starej Wdowy",
        icon = "",
        power = 26,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "osobisty",
        componentName = "dwie garście kislevskiej ziemi zmieszanej z krwią wiedźmy",
        componentPower = 3,
        duration = "patrz opis",
        description = "Wiedźma pozwala, aby wniknęły w nią duchy Starej Wdowy. Razem z ubraniem i wyposażeniem przemienia się w eteryczne wcielenie potwora o sylwetce wysokiej, rozciągniętej wąsami, zębach z podrzeźwionej twarzy i długich zielonych pazurach. Otrzymuje modyfikator +20 do testów Walki Wręcz, Krzepy i Odporności, a także +1 do Ataków. Zyskuje również zdolności wrodzone: broń naturalna, nieustraszony, straszny i wyostrzone zmysły. Zaklęcie kończy się, gdy wiedźma otrzyma trafienie krytyczne, zaśnie lub sama przerwie jego działanie, poświęcając akcję podwójną."
    )

}

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////// TRADYCJA LODU ///////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////

object IceTradition {

    val LodowaKlinga = Spell(
        name = "Lodowa klinga",
        icon = "",
        power = 8,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "metrowej długości sopel",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii",
        description = "W dłoni lodowej czarownicy materializuje się migocząca lodowa klinga. Traktowana jest jako broń magiczna z cechą oręża Precyzyjny i obrażeniami S+2. Jeśli czarownica wypuści ją z dłoni, broń natychmiast się rozpada. Żeby przedłużyć działanie tego zaklęcia po upływie wyznaczonego czasu, czarownica musi w każdej następnej rundzie wykonać udany test Siły Woli."
    )

    val LodowatyGlos = Spell(
        name = "Lodowaty głos",
        icon = "",
        power = 9,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "język wyrzeźbiony z lodu",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii",
        description = "Lodowa czarownica przemawia surowym, lodowatym głosem chants z dawnych wieków. Otrzymuje modyfikator +10 do testów dowodzenia, targowania, torturowania i zastraszania, ale -10 do testów gadania i przekonywania."
    )

    val ScianaLodu = Spell(
        name = "Ściana lodu",
        icon = "",
        power = 12,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "12 metrów",
        componentName = "bryła lodu długości 30 centymetrów",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii",
        description = "W wybranym przez lodową czarownicę miejscu z ziemi wyrasta ściana z litego lodu, maksymalnie o długości dziesięciu metrów i wysokości sześciu. Musi znajdować się w zasięgu zaklęcia i nie może zakrywać obszaru wydzielającego ciepło (np. palenisko). Ściana blokuje linie wzroku, ma Wytrzymałość 5 oraz 10 punktów Żywotności za każdy punkt Magii wiedźmy. Ogień zadaje ścianie lodowej podwójne obrażenia."
    )

    val Slizgawka = Spell(
        name = "Ślizgawka",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA,
        range = "24 metry",
        componentName = "tafla lodu o wymiarach 30 x 30 centymetrów",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii",
        description = "Lodowa czarownica pokrywa określony obszar cienką warstwą lodu. Wszystkie postacie w promieniu pięciu metrów od wyznaczonego punktu muszą wykonać test Zręczności z modyfikatorem -10 lub się przewrócić. Nieuważny przeciwnik może się poślizgnąć i upaść, odnosząc 1k10 obrażeń od uderzenia."
    )

    val Gradobicie = Spell(
        name = "Gradobicie",
        icon = "",
        power = 14,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "18 metrów",
        componentName = "kula gradu",
        componentPower = 2,
        duration = "liczba rund równa wartości Magii",
        description = "Lodowa czarownica kieruje magię lodu ku niebu, a po chwili na ziemię spadają duże bryły lodu. Wszystkie postacie w promieniu pięciu metrów od wyznaczonego miejsca otrzymują automatyczne trafienie z Siłą 2 w każdej rundzie przebywania w tym obszarze. Zmniejsza to ich Szybkość o połowę. Jeśli czarownica wykona test Siły Woli, może przesunąć chmurę gradową o 2 metry za każdy punkt jej Magii."
    )

    val KryształowyPlaszcz = Spell(
        name = "Kryształowy płaszcz",
        icon = "",
        power = 15,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "osobisty",
        componentName = "groszostaj",
        componentPower = 2,
        duration = "1 minuta (6 rund)",
        description = "Lodowa czarownica tworzy wirujący obłok mgły i lodowych drobin. Postacie w promieniu sześciu metrów otrzymują modyfikator -10 do testów Walki Wręcz, Umiejętności Strzeleckich i Zręczności. Każdy przeciwnik próbujący zaatakować czarownicę bronią białą musi wykonać udany test Odporności lub odczuć przeszywający ziąb, zmniejszając skuteczność ataku."
    )

    val WStopieSzerokim = Spell(
        name = "W stopie szerokim",
        icon = "",
        power = 15,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "osobisty",
        componentName = "kulka zmrożonego niedźwiedziego sadła",
        componentPower = 2,
        duration = "liczba dni równa wartości Magii",
        description = "Lodowa czarownica obniża temperaturę własnego ciała, dzięki czemu zyskuje odporność na mróz oraz niewrażliwość na ataki z użyciem zimna."
    )

    val ZewSzojki = Spell(
        name = "Zew Szojki",
        icon = "",
        power = 15,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "36 metrów",
        componentName = "garść sopli",
        componentPower = 2,
        duration = "liczba godzin równa wartości Magii",
        description = "Lodowa czarownica wzywa ducha Starej Wody, pierwszej zamarzniętej rzeki Kisleva. W odpowiedzi z ziemi wyrastają lodowe macki o długości do metra. Każda z macek atakuje raz na rundę przeciwnika w zasięgu, zadając 1k10 obrażeń i zmniejszając jego Szybkość o połowę. Macki można zniszczyć, zadając im obrażenia równe 10 punktom Wytrzymałości."
    )

    val ChmuraOdpryskow = Spell(
        name = "Chmura odprysków",
        icon = "",
        power = 18,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "48 metrów",
        componentName = "garść lodowych bryłek",
        componentPower = 2,
        duration = "natychmiastowy",
        description = "Lodowa czarownica wyrzuca w kierunku celu chmurę (1k10) ostrych jak diamenty lodowych drzazg. Każda jest traktowana jak magiczny pocisk z Siłą 3."
    )

    val SokolyMiszki = Spell(
        name = "Sokoły Miszki",
        icon = "",
        power = 18,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "36 metrów",
        componentName = "kryształowy sokół",
        componentPower = 2,
        duration = "patrz opis",
        description = "Lodowa czarownica powołuje się na pakty zawarte przez pierwsze czarownice i przyzywa sokoły Miszki, mrożące duszę strachu, nienawiści i trwogi. Kryształowe ptaki materializują się w mroźnym powietrzu, wydając przenikliwe krzyki. Postacie w promieniu 5 metrów wykonują test Strachu, a w promieniu 5–15 metrów test Grozy (-10). Efekt trwa, dopóki żadna postać w zasięgu nie wykona udanego testu Strachu."
    )

    val Sniezyca = Spell(
        name = "Śnieżyca",
        icon = "",
        power = 18,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "patrz opis",
        componentName = "płatek śniegu",
        componentPower = 2,
        duration = "liczba rund równa wartości Magii",
        description = "Wirujący zimny obłok śniegu i lodowych okruchów zasypuje pole, ograniczając widoczność i ruch. Postacie w zasięgu otrzymują obrażenia i kary do testów umiejętności, a ich prędkość jest zmniejszona."
    )

    val PocalunekLodowejPanny = Spell(
        name = "Pocałunek lodowej panny",
        icon = "",
        power = 20,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "zasięg wzroku",
        componentName = "garść śniegu",
        componentPower = 2,
        duration = "natychmiastowy",
        description = "Lodowa czarownica wydycha obłok przenikliwego zimna, zamieniając przeciwników w posągi pokryte warstwą lodu. Każda postać w zasięgu otrzymuje trafienie z Siłą 5 bez uwzględnienia pancerza. Możliwe natychmiastowe zabicie celu."
    )

    val WiecznaZmarzlina = Spell(
        name = "Wieczna zmarzlina",
        icon = "",
        power = 20,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "48 metrów",
        componentName = "zamrożona grudka tundrowej gleby",
        componentPower = 2,
        duration = "liczba dni równa wartości Magii",
        description = "Lodowa czarownica zamraża górną warstwę gruntu w szerokim obszarze. Każdy w zasięgu otrzymuje obrażenia od mrozu i jest spowolniony. Teren staje się oblodzony i niebezpieczny."
    )

    val MroznyWicher = Spell(
        name = "Mroźny wicher",
        icon = "",
        power = 23,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "36 metrów",
        componentName = "kieł białego smoka",
        componentPower = 3,
        duration = "natychmiastowy",
        description = "Lodowa czarownica kształtuje lodowy pływ magii w potężny podmuch zimnego wiatru, który uderza z siłą 4. Trafieni muszą zdać test Krzepy lub upadają na ziemię."
    )

    val ZabojczeZimno = Spell(
        name = "Zabójcze zimno",
        icon = "",
        power = 25,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "dotyk",
        componentName = "odłamek lodu z Urszebii",
        componentPower = 3,
        duration = "natychmiastowy",
        description = "Lodowa czarownica przywołuje morderczy dotyk mrozu. Ofiara musi wykonać trudny test Odporności (-20) lub zginąć, zamieniając się w bryłę lodu."
    )

    val PrzemianaWCzortmorozka = Spell(
        name = "Przemiana w czortmorozka",
        icon = "",
        power = 27,
        timeToCast = CastingTime.TRZY_AKCJE_PODWOJNE,
        range = "osobisty",
        componentName = "szpon czortmorozka",
        componentPower = 3,
        duration = "patrz opis",
        description = "Lodowa czarownica przeobraża się w czortmorozka, zyskując jego zdolności, naturalne uzbrojenie i mroźną aurę. Po utracie przytomności lub z końcem efektu wraca do swojej postaci."
    )
}