package com.dd.rpgcardapp.data

data class Blessing(
    val name: String,
    val icon: String,
    val power: Int = 3,
    val timeToCast: CastingTime,
    val range: String,
    val componentName: String,
    val componentPower: Int = 1,
    val duration: String,
    val description: String,
    val note: String = "",
)

/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
////////////////////////         BŁOGOSŁAWIEŃSTWA          //////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
object Common {
    val BlogoslawienistwoOdwagi = Blessing(
        name = "Błogosławieństwo odwagi",
        icon = "",
        power = 3,
        timeToCast = CastingTime.AKCJA,
        range = "24 metry",
        componentName = "kłębek sierści psa",
        componentPower = 1,
        duration = "natychmiastowy",
        description = "Inspirujące słowa kapłana wzbudzają nadzieję w sercu towarzysza. Dowolna postać w odległości 24 metrów, która znajduje się pod wpływem Strachu lub Grozy, natychmiast opanowuje się i może działać normalnie."
    )

    val BlogoslawienistwoChyzosci = Blessing(
        name = "Błogosławieństwo chyżości",
        icon = "",
        power = 4,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "łuska węża",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Kapłan modli się o przychylność swego bóstwa. Dowolna dotknięta przez niego postać otrzymuje modyfikator +5 do Zręczności oraz +1 do Szybkości. Postać może znajdować się pod wpływem najwyżej jednego błogosławieństwa chyżości w danej chwili. Jest to czar dotykowy. Kapłan może go rzucić również na siebie."
    )

    val BlogoslawienistwoHartuDucha = Blessing(
        name = "Błogosławieństwo hartu ducha",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "kawałek skorupy żółwia",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Kapłan prosi boskiego patrona o łaskę i natchnienie. Dowolna dotknięta przez niego postać otrzymuje modyfikator +5 do Odporności i Siły Woli. Postać może znajdować się pod wpływem najwyżej jednego błogosławieństwa hartu ducha w danej chwili. Jest to czar dotykowy. Kapłan może go rzucić również na siebie."
    )

    val BlogoslawienistwoUzdrawiania = Blessing(
        name = "Błogosławieństwo uzdrawiania",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "wianek ostrokrzewu",
        componentPower = -1,
        duration = "natychmiastowy",
        description = "Bóstwo zsyła na kapłana moc uzdrawiania ran. Jego dotyk przywraca rannej postaci 1 punkt Żywotności. W ten sposób można uzdrowić postać tylko raz w czasie potyczki, podczas której odniosła rany, lub bezpośrednio po jej zakończeniu. Jest to czar dotykowy. Kapłan może go rzucić również na siebie."
    )

    val BlogoslawienistwoSily = Blessing(
        name = "Błogosławieństwo siły",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "żelazny ćwiek",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Kapłan prosi boga o odrobinę boskiej siły. Dowolna dotknięta przez niego postać otrzymuje modyfikator +5 do Walki Wręcz i Krzepy. Postać może znajdować się pod wypływem najwyżej jednego błogosławieństwa siły w danej chwili. Jest to czar dotykowy. Kapłan może go rzucić również na siebie."
    )

    val BlogoslawienistwoOchrony = Blessing(
        name = "Błogosławieństwo ochrony",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "niewielki amulet z symbolem boga",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Bóstwo czuwa nad swoim żarliwym wyznawcą. Otrzymuje on modyfikator +10 do Odporności oraz do Siły Woli podczas testów przeciwko magii. Kapłan może znajdować się pod wpływem najwyżej jednego błogosławieństwa ochrony w danej chwili."
    )

    val BlogoslawienistwoZeglarza = Blessing(
        name = "Błogosławieństwo żeglarza",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "kawałek liny",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Dzięki modlitwie kapłana dowolna dotknięta przez niego postać otrzymuje modyfikator +5 do testów pływania, wioślarstwa i żeglarstwa."
    )

    val BlogoslawienistwoMananna = Blessing(
        name = "Błogosławieństwo Mananna",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "ryba",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Dzięki modlitwie kapłana dowolna dotknięta przez niego postać może dłużej wstrzymać oddech pod wodą. W trakcie trwania czaru nie podlega zasadom dotyczącym uduszenia. Kapłan nie może rzucić tego zaklęcia pod wodą."
    )

    val BlogoslawienistwoOdejscia = Blessing(
        name = "Błogosławieństwo odejścia",
        icon = "",
        power = 4,
        timeToCast = CastingTime.AKCJA,
        range = "6 metrów",
        componentName = "porwany całun",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Kapłan zaklina w błogosławieństwie gniew Morra skierowany przeciw nieumarłej istocie. W trakcie trwania zaklęcia każda broń postaci wybranej przez kapłana traktowana jest jako magiczna w walce z nieumarłym przeciwnikiem."
    )

    val BlogoslawienistwoMorra = Blessing(
        name = "Błogosławieństwo Morra",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "zasięg słuchu",
        componentName = "pióro kruka",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Poruszające słowa kapłana pozwalają wybranej przez niego postaci zrozumieć, jak godna pożałowania jest egzystencja nieumarłego. W trakcie trwania zaklęcia jest odporna na Grozę i Strach wzbudzaną przez ożywieńców."
    )

    val BlogoslawienistwoMyrmidii = Blessing(
        name = "Błogosławieństwo Myrmidii",
        icon = "",
        power = 4,
        timeToCast = CastingTime.AKCJA,
        range = "12 metrów",
        componentName = "kamień orle oko",
        componentPower = 1,
        duration = "1 runda",
        description = "Kapłan udziela błogosławieństwa wybranej postaci, przekazując jej cząstkę militarnego geniuszu bogini. W następnej rundzie postać działa jako pierwsza, niezależnie od ustalonej Inicjatywy. Jeśli więcej postaci zostało obdarowanych tym błogosławieństwem, działają zgodnie z ustaloną wcześniej Inicjatywą, lecz przed pozostałymi uczestnikami walki."
    )

    val BlogoslawienistwoGniewu = Blessing(
        name = "Błogosławieństwo gniewu",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "12 metrów",
        componentName = "wypolerowana miedziana kulka",
        componentPower = 1,
        duration = "1 minuta (6 rund) albo do aktywacji",
        description = "Pełne pasji słowa kapłana napełniają wybraną postać słusznym gniewem, który umożliwia jej przerzucenie jednego nieudanego rzutu na trafienie w walce wręcz."
    )

    val BlogoslawienistwoRanalda = Blessing(
        name = "Błogosławieństwo Ranalda",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "12 metrów",
        componentName = "rękawiczka w mieszku",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Kapłan błogosławi wybraną postać, zapewniając jej zręczny dotyk Ranalda Łotrzyka oraz modyfikator +5 do testów otwierania zamków i zwinnych palców."
    )

    val BlogoslawienistwoSzczescia = Blessing(
        name = "Błogosławieństwo szczęścia",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "6 metrów",
        componentName = "kostka do gry",
        componentPower = 1,
        duration = "1 minuta (6 rund) albo do aktywacji",
        description = "Pobłogosławiona postać może liczyć na szczęście i możliwość przerzucenia następnego nieudanego testu, ale z modyfikatorem. Jeśli wynik rzutu oznaczać będzie sukces, test jest uznawany za udany."
    )

    val BlogoslawienistwoShallyi = Blessing(
        name = "Błogosławieństwo Shallyi",
        icon = "",
        power = 3,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "6 metrów",
        componentName = "ziołowy napar",
        componentPower = 1,
        duration = "natychmiastowy",
        description = "Kapłan obdarza wybraną postać łaską Shallyi, osłabiając symptomy choroby. Postać może natychmiast wykonać test Odporności i zmniejszyć czas trwania choroby o 1 dzień za każdy uzyskany poziom sukcesu. Tego błogosławieństwa można użyć tylko raz na daną chorobę u wybranej postaci."
    )

    val BlogoslawienistwoSpokoju = Blessing(
        name = "Błogosławieństwo spokoju",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "6 metrów",
        componentName = "kubek z wodą",
        componentPower = 1,
        duration = "natychmiastowy",
        description = "Kojące słowa kapłana pozwalają wybranej postaci poradzić sobie z szokiem po przerażającym wydarzeniu. Jeśli w ciągu poprzedniej minuty postać otrzymała Punkt Obłędu, może wykonać test Siły Woli. Udany test oznacza, że przetrwała szok bez uszczerbku i może skreślić ten Punkt Obłędu. Tego błogosławieństwa można użyć tylko raz na daną walkę lub wydarzenie, które spowodowały przyznanie Punktu Obłędu."
    )

    val BlogoslawienistwoSigmara = Blessing(
        name = "Błogosławieństwo Sigmara",
        icon = "",
        power = 4,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "odprysk żelaza z meteorytu",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Kapłan napełnia ulubioną broń Sigmara jego mocą. W trakcie trwania zaklęcia młot zadaje obrażenia zwiększone o 1."
    )

    val BlogoslawienistwoZjednoczenia = Blessing(
        name = "Błogosławieństwo zjednoczenia",
        icon = "",
        power = 7,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "6 metrów",
        componentName = "dwa kawałki magnetytu",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Modlitwa kapłana porusza patriotyczne nuty i poczucie braterstwa w sercu jednego człowieka z Imperium pozostającego w zasięgu zaklęcia. Żeby zaatakować innego mieszkańca Imperium (człowieka lub krasnoluda) albo obrazić go słownie, musi on najpierw wykonać udany Prosty (+10) test Siły Woli. Nieudany test oznacza, że w tej rundzie traci możliwość działania, tylko kręci z niedowierzaniem głową, rozmyślając o tym, czego zamierał się dopuścić."
    )

    val BlogoslawienistwoLowcy = Blessing(
        name = "Błogosławieństwo łowcy",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "6 metrów",
        componentName = "strzała",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Pobłogosławiona przez kapłana postać otrzymuje modyfikator +5 do testów tropienia i zastawiania pułapek."
    )

    val BlogoslawienistwoTaala = Blessing(
        name = "Błogosławieństwo Taala",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "6 metrów",
        componentName = "bukłak",
        componentPower = 1,
        duration = "1 minuta (6 rund) albo do aktywacji",
        description = "Błogosławieństwo kapłana zapewnia wybranej postaci modyfikator +10 do następnego testu nawigacji lub sztuk przetrwania wykonanego w trakcie trwania czaru."
    )

    val BlogoslawienistwoKrwawejDloni = Blessing(
        name = "Błogosławieństwo krwawej dłoni",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "zasięg słuchu",
        componentName = "posoka zabitego wilka",
        componentPower = 1,
        duration = "patrz opis",
        description = "Pełne zapału i gniewu słowa kapłana wzburzają krew wybranej postaci, która natychmiast wpada w szał bojowy. Jeśli postać posiada tę zdolność, pozostaje w szale do zakończenia walki. Jeśli nie, szał bojowy trwa przez 1 minutę (6 rund) albo do końca walki, jeśli nastąpi przed upływem tego czasu."
    )

    val BlogoslawienistwoUlryka = Blessing(
        name = "Błogosławieństwo Ulryka",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "18 metrów",
        componentName = "kieł wilka",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Ostre słowa kapłana i zwieńczona rykiem inkantacja napełniają wybraną postać dzikością Ulryka, zapewniając jej +1 do wyników zadanych trafień krytycznych."
    )

    val BlogoslawienistwoVereny = Blessing(
        name = "Błogosławieństwo Vereny",
        icon = "",
        power = 3,
        timeToCast = CastingTime.AKCJA,
        range = "12 metrów",
        componentName = "kępka psiej sierści",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Modlitwa kapłana uświadamia dowolnej postaci w zasięgu zaklęcia, jaką krzywdą są tyrania i niesprawiedliwość. Aby w trakcie trwania czaru postać popełniła przestępstwo, musi najpierw wykonać udany Prosty (+10) test Siły Woli. Nieudany test oznacza, że nie podejmuje żadnych działań, nagle zdjęta wyrzutami sumienia."
    )

    val BlogoslawienistwoMadrosci = Blessing(
        name = "Błogosławieństwo mądrości",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "6 metrów",
        componentName = "pióro do pisania z sowiej lotki",
        componentPower = 1,
        duration = "1 minuta (6 rund) albo do aktywacji",
        description = "Uroczyste słowa kapłana napełniają mądrością wybraną postać, umożliwiając przerzucenie jednego nieudanego testu Inteligencji."
    )
    val BlogoslawienstwoOgnia = Blessing(
        name = "Błogosławieństwo ognia",
        icon = "",
        power = 4,
        timeToCast = CastingTime.AKCJA,
        range = "2 metry",
        componentName = "garść popiołu z paleniska",
        componentPower = 1,
        duration = "1 godzina",
        description = "Modlitwa kapłana sprawia, że w dowolnym miejscu w zasięgu nagle rozpala się ognisko. Nie wymaga drewna ani innego paliwa, a płomienie nie mogą niczego podpalić, ale ogień wydziela ciepło, przy którym mogą się ogrzać żywe istoty (i tylko one). Zaklęcie ulega rozproszeniu, jeśli żywa istota podejdzie do ognia na tyle blisko, że w normalnych okolicznościach odniosłaby obrażenia od ognia."
    )

    val BlogoslawienstwoDaza = Blessing(
        name = "Błogosławieństwo Daża",
        icon = "",
        power = 7,
        timeToCast = CastingTime.AKCJA,
        range = "dotyk",
        componentName = "pióro żar-ptaka",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Dotyk kapłana obdarza postać łaską Daża. W trakcie trwania czaru odnosi ona połowę obrażeń (zaokrąglając w górę) od dowolnego rodzaju ognia, po uwzględnieniu innych modyfikatorów obrażeń."
    )





    val BlogoslawienstwoTora = Blessing(
        name = "Błogosławieństwo Tora",
        icon = "",
        power = 4,
        timeToCast = CastingTime.AKCJA,
        range = "dotyk",
        componentName = "srebrny amulet Tora",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Wyładowania energii na krótko spowijają broń, napełniając ją łaską Tora. W trakcie trwania zaklęcia oręż zadaje obrażenia zwiększone o 1."
    )

    val BlogoslawienstwoNadchodzacejBurzy = Blessing(
        name = "Błogosławieństwo nadchodzącej burzy",
        icon = "",
        power = 7,
        timeToCast = CastingTime.AKCJA,
        range = "48 metrów",
        componentName = "drewno z drzewa rozszepeionego piorunem",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Modliwy kapłana powoduje zmianę w powietrzu. Walczące zwierzęta są przerażone, a wściekłe nadciąga burza. Małe stworzenia i zwierzęta stada w panice uciekają przed kapłanem, szukając schronienia lub biją się w ciasną grupę. Inne zwierzęta, a także istoty żywe tłumiące odczuwanie strachu wykonują udany łatwy (+20) test Siły Woli, przerywając wszelkie trwające uniki."
    )

    val BlogoslawienstwoLzacejLapy = Blessing(
        name = "Błogosławieństwo łzającej łapy",
        icon = "",
        power = 3,
        timeToCast = CastingTime.AKCJA,
        range = "dotyk",
        componentName = "pazur niedźwiedzia",
        componentPower = 1,
        duration = "natychmiastowy",
        description = "Kapłan modli się do Ursuna, aby osłabił ból, jaki powoduje odniesiona rana. Dotknięta przez niego postać jest traktowana tak, jakby udzielono jej pomocy medycznej."
    )

    val BlogoslawienstwoUrsuna = Blessing(
        name = "Błogosławieństwo Ursuna",
        icon = "",
        power = 4,
        timeToCast = CastingTime.AKCJA,
        range = "dotyk",
        componentName = "świeża ryba",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Modlitwy kapłana zapewniają modyfikator +10 do testów nawigacji i sztuki przetrwania wykonywanych w śnieżne lub zimowe warunki."
    )

}

//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////// DZIEDZINA NURGLA /////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////

object NurgleTradition {

    // ŚCIEŻKA GŁÓWNA

    val RadosneOblicze = Blessing(
        name = "Radosne oblicze",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "pępowina martwego noworodka",
        componentPower = 1,
        duration = "liczba godzin równa wartości Magii lub do utraty punktu Żywotności",
        description = "Czarnoksiężnik dotyka twarzy dowolnej postaci, jednocześnie wypowiadając inkantację. W jej trakcie wyrastają mu z dłoni niewielkie, zielonkawe macki, które przywierają do twarzy postaci. Po kilku bolesnych chwilach jej rysy ulegają wygładzeniu, znikają wszelkie objawy choroby oraz ubytki i przebarwienia, ukryte teraz pod złudną maską zdrowia. Po bliższym przyjrzeniu się widać jednak, że twarz wygląda sztucznie. Policzki są zbyt zaróżowione, zęby zbyt równie i białe, a oczy lśnią niepokojącym blaskiem."
    )

    val PlugawyPoslaniec = Blessing(
        name = "Plugawy posłaniec",
        icon = "",
        power = 8,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "bez ograniczeń",
        componentName = "garść ludzkich odchodów",
        componentPower = 1,
        duration = "chwilowy",
        description = "Czarnoksiężnik wypluwa chmarę zielononiebieskich much i innych insektów, które tworzą rój o kształcie z grubsza przypominającym głowę żaby. Mag może przekazać rojowi wiadomość, liczącą nie więcej niż 25 słów. Chmara odlatuje (poruszając się mniej więcej z prędkością 10 km/h), aby przekazać przesłanie wybranej przez maga postaci. Znalazłszy adresata, przekazuje zapamiętaną wiadomość chrapliwym szeptem, który brzmi jak odgłos wymiotowania. Potem insekty włażą do wszelkich otworów w ciele adresata i znikają. Za pierwszym razem, gdy postać dostanie w ten sposób wiadomość, musi wykonać test Siły Woli. Nieudany test oznacza, że otrzymuje 1 Punkt Obłędu."
    )

    val SmrodNurgla = Blessing(
        name = "Smród Nurgla",
        icon = "",
        power = 8,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "zepsute jajko",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii",
        description = "Z ciała czarnoksiężnika wydobywa się ohydnie śmierdząca mgła, przyprawiając o mdłości i torsje (modyfikator -10 do Walki Wręcz w trakcie trwania czaru) wszystkie postacie przebywające blisko niego (w odległości do 2 metrów). Każda z nich musi wykonać test Odporności. Nieudany test oznacza, że postać jest traktowana jako bezbronna przez tyle rund, ile wynosi wartość Magii czarnoksiężnika (który jest odporny na działanie własnego zaklęcia)."
    )

    val UrokDojrzalosci = Blessing(
        name = "Urok dojrzałości",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "kawałek zgniłego i robaczywego owocu",
        componentPower = 2,
        duration = "trwały",
        description = "Dowolny obiekt lub postać nagle się starzeje. Jakość wykonania przedmiotów nieorganicznych maleje o 1 poziom. Przedmioty organiczne psują się, ukazując gnijące wnętrze. Żywa istota może odeprzeć czar, wykonując udany test Odporności. Nieudany test oznacza, że postać natychmiast starzeje się o 2k10 lat i trwale traci 1k10 punktów Walki Wręcz, Umiejętności Strzeleckich, Odporności i Zręczności (osobny rzut dla każdej cechy). Urok dojrzałości jest czarem dotykowym."
    )

    val LaskaNurgla = Blessing(
        name = "Łaska Nurgla",
        icon = "",
        power = 16,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "odrobina wymiocin",
        componentPower = 1,
        duration = "liczba godzin równa wartości Magii",
        description = "Czarnoksiężnik wchłania chorobę z dowolnej zarażonej osoby i przetrzymuje ją we własnym ciele. Może przekazać ją dowolnej innej istocie (za pomocą dotyku), która może uchronić się przed tym losem, wykonując udany test Odporności. W takim przypadku czarnoksiężnik może znów spróbować przekazać chorobę (nawet tej samej istocie). Jeśli nie przekaże jej przed upływem czasu trwania czaru, sam zostaje zarażony. Łaska Nurgla jest czarem dotykowym."
    )

    val MglaZepsucia = Blessing(
        name = "Mgła zepsucia",
        icon = "",
        power = 18,
        timeToCast = CastingTime.AKCJA,
        range = "5 metrów",
        componentName = "łzy zmarłego dziecka",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii",
        description = "Wokół ciała czarnoksiężnika zaczyna wirować zielonkawa mgła. W trakcie trwania czaru wszystkie postacie w zasięgu 5 metrów otrzymują modyfikator -20 do wszelkich testów cech i umiejętności. Zaklęcie nie działa na rzucającego je czarnoksiężnika."
    )

    val StrugaZepsucia = Blessing(
        name = "Struga zepsucia",
        icon = "",
        power = 18,
        timeToCast = CastingTime.AKCJA,
        range = "16 metrów",
        componentName = "kawałek ciała zmarłego dziecka",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii",
        description = "Czarnoksiężnik wyrzuca z siebie strugę cuchnącej krwi, śluzu, robaków i innego obrzydlistwa. Strumień plugastwa sięga 16 metrów, rozszerzając się i przyjmując kształt stożka o szerokości od 1 metra przy magu do 5 metrów w najszerszym miejscu. Wszystkie postacie objęte działaniem czaru muszą wykonać Wymagający (-10) test Odporności lub otrzymują 3 trafienia z Siłą 4. Niezależnie od wyniku tego testu, każda postać objęta działaniem czaru cierpi na mdłości, otrzymując modyfikator -10 do wszystkich testów cech i umiejętności."
    )

    val ZarazliwyDech = Blessing(
        name = "Zaraźliwy dech",
        icon = "",
        power = 25,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "24 metry",
        componentName = "mózg wybrańca Nurgla",
        componentPower = 3,
        duration = "chwilowy",
        description = "Wszystkie żywe postacie w zasięgu 24 metrów od czarnoksiężnika zapadają na straszliwą chorobę. Jej rodzaj można ustalić, wykonując rzut 1k100 i sprawdzając wynik w tabeli: 01-16 Febra, 17-32 Zgnilizna oczna, 33-48 Wrzodzienica, 49-64 Drżączka kostna, 65-80 Szara gorączka, 81-96 Zielona, 97-00 Zgnilizna Nurgla. Choroby rozwijają się normalnie, zgodnie z ich opisem."
    )

    val JestNasLegion = Blessing(
        name = "Jest nas legion...",
        icon = "",
        power = 26,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "narząd z ciała osoby zmarłej na zarazę",
        componentPower = 1,
        duration = "liczba godzin równa wartości Magii, ale czarnoksiężnik może przerwać działanie czaru w dowolnym momencie",
        description = "Ciało czarnoksiężnika zamienia się w człekokształtną chmurę brzęczących much. Ekwipunek, ubranie oraz wszelkie trzymane w rękach przedmioty upadają na ziemię. Postać zyskuje zdolność latanie z Szybkością Lotu równą normalnej Szybkości. Staje się też odporna na obrażenia zadawane bronią niemagiczną i zaklęcia (oprócz rozproszenia magii i czarów obszarowych). Może dowolnie zmieniać kształt, ale musi pozostać w obrębie jednej chmury. Może przeciskać się przez szczeliny, w których zmieściłaby się mucha. Jeśli czarnoksiężnik zostanie zmuszony do przybrania naturalnej postaci, a znajduje się w pomieszczeniu zbyt małym, żeby móc się w nim normalnie zmieścić, natychmiast ginie."
    )

    val WicherZarazy = Blessing(
        name = "Wicher zarazy",
        icon = "",
        power = 29,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "24 metry",
        componentName = "fiolka ze smrodem Wielkiego Nieczystego",
        componentPower = 3,
        duration = "liczba minut równa wartości Magii",
        description = "Czarnoksiężnik przyzywa śmiercionośne wichry zarazy, rozsiewające chorobę i zepsucie w wybranym miejscu w odległości 24 metrów od czarnoksiężnika. W trakcie trwania czaru wszystkie żywe istoty w promieniu 5 metrów od wskazanego miejsca muszą wykonać Trudny (-20) test Odporności. Nieudany test oznacza zarażenie zgnilizną Nurgla. Dodatkowo każda z postaci musi wykonać test Grozy."
    )
}

//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////// DZIEDZINA SLAANESHA /////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////

object SlaaneshTradition {

    // ŚCIEŻKA GŁÓWNA

    val Idylla = Blessing(
        name = "Idylla",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "symbol Slaanesha",
        componentPower = 1,
        duration = "liczba rund równa wartości Magii",
        description = "Dotyk czarnoksiężnika wywołuje wrażenie szczęśliwości i spokoju. W trakcie trwania czaru postać, która chce coś uczynić, musi wykonać udany test Siły Woli. W przeciwnym wypadku po prostu stoi bezczynnie, z rozmarzonym uśmiechem na twarzy. Jeśli postać wykona 3 kolejne udane testy SW, wyzwala się spod mocy uroku. Idylla jest czarem dotykowym."
    )

    val CietaRiposta = Blessing(
        name = "Cięta riposta",
        icon = "",
        power = 7,
        timeToCast = CastingTime.AKCJA,
        range = "12 metrów",
        componentName = "pokruszone płatki róży",
        componentPower = 1,
        duration = "liczba rund równa wartości Magii",
        description = "Język czarnoksiężnika zamienia się w długi i wijący się wężowato bicz, którym można smagać przeciwników. Poświęcając akcję, postać może zaatakować językiem dowolnego przeciwnika w zasięgu 12 metrów, zadając trafienie z Siłą 3. Język wciska się w każdą szczelinę zbroi i ubrania, dlatego należy zignorować Punkty Zbroi trafionej postaci. Cięta riposta jest magicznym pociskiem."
    )

    val PrzypływNatchnienia = Blessing(
        name = "Przypływ natchnienia",
        icon = "",
        power = 11,
        timeToCast = CastingTime.AKCJA,
        range = "dotykowy",
        componentName = "odrobina likieru migdałowego",
        componentPower = 2,
        duration = "liczba dni równa wartości Magii",
        description = "Przesycony aromatem migdałów oddech czarnoksiężnika owiewa twarz postaci będącej celem zaklęcia, wzbudzając u niej myśli o własnym geniuszu i nieograniczonych możliwościach. Równocześnie wywołuje poczucie przytłaczającego wstydu z powodu dotychczasowego braku sukcesów i bezradności w obliczu problemów. W trakcie trwania czaru postać otrzymuje modyfikator do dowolnego pojedynczego testu, w wysokości +10 x wartość Magii czarnoksiężnika."
    )

    val MaskaPozadania = Blessing(
        name = "Maska pożądania",
        icon = "",
        power = 14,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "język ladacznicy",
        componentPower = 2,
        duration = "liczba godzin równa wartości Magii",
        description = "Różowa mgiełka osadza się na ciele wybranej postaci, wywołując podniecenie i zmieniając jej zachowanie. Zaklęcie natychmiast likwiduje nieprzyjemne efekty przejedzenia, opilstwa i braku snu. Maskuje także zewnętrzne ślady przemocy i zmęczenia (przekrwione oczy, siniaki, otarcia skóry itp.), aczkolwiek w żaden sposób ich nie leczy. W trakcie trwania czaru postać otrzymuje modyfikator +10 do testów Ogłady. Maska pożądania jest czarem dotykowym."
    )

    val RozkosznyBol = Blessing(
        name = "Rozkoszny ból",
        icon = "",
        power = 16,
        timeToCast = CastingTime.AKCJA,
        range = "12 metrów",
        componentName = "kropla potu kochanka",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii",
        description = "Czarnoksiężnik wybiera dowolną postać w zasięgu 12 metrów, która może odeprzeć zaklęcie, wykonując udany test Siły Woli. W trakcie trwania czaru postać postrzega ból jako przyjemność, a rozkosz jako cierpienie. W każdej rundzie, podczas której zada lub otrzyma obrażenia, otrzymuje na 1 rundę modyfikator +10 do Walki Wręcz i Odporności."
    )

    val KontredansSlaanesha = Blessing(
        name = "Kontredans Slaanesha",
        icon = "",
        power = 18,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "24 metry",
        componentName = "flaszka wina",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii",
        description = "Wszystkie postacie w zasięgu 24 metrów od czarnoksiężnika nagle zaczynają kołysać się w rytm powolnego kontredansu, zasłuchane w dźwięki Eterycznej muzyki Slaanesha. Mogą próbować odeprzeć zaklęcie, wykonując udany Wymagający (-10) test Siły Woli. W trakcie trwania czaru nie mogą wykonywać żadnych akcji i są traktowane jako bezbronne. Ofiara zaatakowana w dowolny sposób natychmiast uwalnia się spod mocy czaru. Każda minuta spędzona na tańczeniu i słuchaniu nieziemskiej melodii oznacza konieczność wykonania Trudnego (-20) testu SW. Nieudany test oznacza przyznanie 1 lub 2 (50% szans) Punktów Obłędu."
    )

    val ZlotyBlask = Blessing(
        name = "Złoty blask",
        icon = "",
        power = 21,
        timeToCast = CastingTime.AKCJA,
        range = "24 metry",
        componentName = "ćwierć litra moczu",
        componentPower = 2,
        duration = "do momentu wykonania 3 kolejnych udanych testów SW",
        description = "Z dłoni czarnoksiężnika tryska promień złocistego światła, padając na wybraną postać w zasięgu 24 metrów na linii wzroku maga. Ofiara odczuwa nagły przypływ spokoju i szczęśliwości. W każdej rundzie musi wykonać udany test Siły Woli, żeby podjąć jakiekolwiek działanie. Nieudany test oznacza, że po prostu stoi bezczynnie, z rozmarzonym wyrazem twarzy. Trzy kolejne udane testy SW wyzwalają postać spod mocy zaklęcia."
    )

    val Marionetka = Blessing(
        name = "Marionetka",
        icon = "",
        power = 22,
        timeToCast = CastingTime.AKCJA,
        range = "zasięg wzroku",
        componentName = "kukiełka przedstawiająca daną postać",
        componentPower = 3,
        duration = "liczba godzin równa wartości Magii",
        description = "Czarnoksiężnik przejmuje kontrolę nad dowolną istotą w zasięgu wzroku. Postać zaczyna się pocić i denerwować, tak jakby jednocześnie była podekscytowana i zaniepokojona. Jeśli nie wykona Wymagającego (-10) testu Siły Woli, jej oczy przybierają barwę oczu czarnoksiężnika. Marionetka spełnia każdy telepatyczny rozkaz maga. Jeśli otrzyma polecenie zaatakowania swoich towarzyszy, zrobi to bez wahania. Czarnoksiężnik sprawuje nad nią całkowitą kontrolę; może nawet przemawiać jej ustami. W trakcie trwania czaru nie może jej spuścić z oka, a dodatkowo w każdej rundzie musi poświęcić akcję na utrzymanie kontroli, w przeciwnym razie marionetka natychmiast uwalnia się spod wpływu zaklęcia. Ofiara może sprzeciwić się rozkazowi podjęcia działania graniczącego z samobójstwem (w takim wypadku musi wykonać udany test SW aby odeprzeć moc zaklęcia). Po odzyskaniu świadomości ofiara czaru czuje się zbrukana i poniżona. Musi wykonać udany test SW w przeciwnym wypadku otrzymuje 2 Punkty Obłędu."
    )

    val KlatwaRozrostu = Blessing(
        name = "Klątwa rozrostu",
        icon = "",
        power = 25,
        timeToCast = CastingTime.AKCJA,
        range = "24 metry",
        componentName = "odcięta kończyna w worku ze 144 żywymi pająkami",
        componentPower = 3,
        duration = "do przerwania czaru, rozproszenia go lub śmierci ofiary",
        description = "Dowolna postać w zasięgu 24 metrów nagle zaczyna gwałtowanie mutować. Jej ciało rozrasta się, wykształcając zdeformowane kończyny i bezkształtne bryły mięśni. Postać może odeprzeć zaklęcie, wykonując udany Trudny (-20) test Siły Woli. W każdej rundzie należy wykonać rzut 1k10 i sprawdzić efekt zaklęcia w tabeli mutacji. Efekty zaklęcia są trwałe, zaś rozrost trwa do momentu rozproszenia lub przerwania czaru. Śmierć ofiary kończy działanie czaru, podobnie jak rozproszenie magii, które przy okazji likwiduje wszystkie macki i części ciała, powstałe w wyniku zaklęcia. W trakcie trwania czaru ofiara nie może wykonywać żadnych akcji i jest traktowana jako bezbronna."
    )

    val InkubSukub = Blessing(
        name = "Inkub/Sukub",
        icon = "",
        power = 28,
        timeToCast = CastingTime.TRZY_AKCJE_PODWOJNE,
        range = "dotykowy",
        componentName = "język dziewicy",
        componentPower = 3,
        duration = "2x liczba godzin równa wartości Magii",
        description = "Czarnoksiężnik kończy wypowiadać inkantację i zapada w letarg, zaś jego duch przenika do Eteru, przybierając formę męską (inkub) lub żeńską (sukub). Nie może fizycznie zaistnieć w świecie materialnym, lecz zachowuje wszystkie zmysły. Jest niewidzialny i nie może zostać zraniony przez niemagiczną broń. Nadal obowiązują go prawa natury - nie może latać, przechodzić przez ściany i wykonywać czynności, których do tej pory nie był w stanie robić. Nie może też rzucać czarów. Przed upływem czasu trwania zaklęcia musi powrócić do swojego ciała. Jeśli w jakiś sposób zostanie mu to uniemożliwione, duch i tak wraca, ale czarnoksiężnik musi wykonać udany Trudny (-20) test Siły Woli, gdyż w przeciwnym wypadku otrzyma 1 Punkt Obłędu. Czarnoksiężnik może rzucić ten czar tylko na siebie. Dzięki mocy Slaanesha ofiara czuje dotyk ducha, mimo iż nie jest w stanie go zobaczyć, usłyszeć ani poczuć jego zapachu. Czarnoksiężnik nie może jej zranić, jedynie podniecać, kusić i subtelnie działać na zmysły. Każda godzina spędzona przez niego na dotykaniu i kuszeniu ofiary wymaga od niej testu Odporności i Siły Woli. Nieudany test Odp oznacza, że traci 1k10 punktów Żywotności, gdy jej dusza powoli odrywa się od ciała. Nieudany test SW oznacza przyznanie 1 Punktu Obłędu, ze względu na nienaturalne pożądanie i odczuwaną rozkosz obcowania z duchem. Postać zachowuje się i działa normalnie, aczkolwiek pewnych objawów podniecenia nie da się ukryć."
    )
}

//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////// DZIEDZINA TZEENTCHA /////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////

object TzeentchTradition {

    // ŚCIEŻKA GŁÓWNA

    val PlomieniePrzeznaczenia = Blessing(
        name = "Płomienie przeznaczenia",
        icon = "",
        power = 7,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "niewielki kawałek meteorytu",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii",
        description = "Wokół czarnoksiężnika nagle rozbłyskują bladopomarańczowe ogniki. W płomieniach widać postacie i wydarzenia z przyszłości. W trakcie trwania zaklęcia czarnoksiężnik może powtórzyć dowolny test umiejętności lub cechy."
    )

    val PlomienSzalenstwa = Blessing(
        name = "Płomień szaleństwa",
        icon = "",
        power = 10,
        timeToCast = CastingTime.AKCJA,
        range = "48 metrów",
        componentName = "płyn mózgowy szaleńca",
        componentPower = 2,
        duration = "chwilowy",
        description = "Z dłoni czarnoksiężnika tryska karmazynowy płomień, trafiając w dowolną postać w zasięgu 48 metrów. Jeśli postać nie posiada Punktów Obłędu, natychmiast otrzymuje ich 1k10/2. Jeśli posiada Punkty Obłędu, traci ich 1k10/2 i otrzymuje trafienie z Siłą 1, bez uwzględnienia Wytrzymałości i pancerza. Jeśli postać straci wszystkie Punkty Obłędu, traci również wszystkie choroby umysłu. Płomień szaleństwa jest magicznym pociskiem."
    )

    val Zmiekczenie = Blessing(
        name = "Zmiękczenie",
        icon = "",
        power = 11,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "dotykowy",
        componentName = "odrobina wosku",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii",
        description = "Dłoń czarnoksiężnika pokrywają dziwne, niebieskie plamy. Pierwszy dotknięty nią przedmiot traci twardość, stając się miękki i plastyczny. Stal z łatwością się wygina, szkło można formować na zimno, a kamień nabiera konsystencji gliny. Użyta w walce zmiękczona broń ugina się lub łamie; Pancerz przestaje zapewniać ochronę (traci wszystkie PZ), a trafienie w to miejsce automatycznie przebija i niszczy zbroję. Moc czaru pozwala na zmiękczenie przedmiotu o objętości maksymalnie 2 m³. Czarnoksiężnik może uformować plastyczną bryłę w dowolny kształt, aczkolwiek stworzenie skomplikowanej formy może wymagać testu Zręczności lub rzemiosła."
    )

    val RozowyPlomienTzeentcha = Blessing(
        name = "Różowy płomień Tzeentcha",
        icon = "",
        power = 15,
        timeToCast = CastingTime.AKCJA,
        range = "6 metrów",
        componentName = "płonąca strzała",
        componentPower = 2,
        duration = "chwilowy",
        description = "Z palców czarnoksiężnika tryskają różowe ogniki destruktywnej energii Tzeentcha. Dowolna postać w zasięgu 6 metrów otrzymuje dwa trafienia z Siłą 4, bez uwzględnienia pancerza. Różowy płomień Tzeentcha jest magicznym pociskiem."
    )

    val BlogoslawiensTzeentcha = Blessing(
        name = "Błogosławieństwo Tzeentcha",
        icon = "",
        power = 18,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "palec czarodzieja",
        componentPower = 2,
        duration = "1 dzień",
        description = "Czarnoksiężnik wykrzykuje imię swego mrocznego patrona, prosząc o jego łaskę, mimo iż niekiedy bywa ona dość przewrotna. Należy wykonać rzut 1k10. Nieparzysty wynik oznacza natychmiastową mutację (wybierz losowo). Parzysty wynik oznacza, że w trakcie trwania zaklęcia czarnoksiężnik zyskuje możliwość rzucania jednego dowolnego czaru z wybranej Tradycji lub Dziedziny."
    )

    val NiewolnikChaosu = Blessing(
        name = "Niewolnik Chaosu",
        icon = "",
        power = 18,
        timeToCast = CastingTime.AKCJA,
        range = "48 metrów",
        componentName = "garść piasku",
        componentPower = 1,
        duration = "2 x liczba rund równa wartości Magii",
        description = "Duch czarnoksiężnika próbuje zyskać kontrolę nad dowolną żywą istotą w zasięgu 48 metrów, która może odeprzeć zaklęcie, wykonując udany test Siły Woli. W przeciwnym wypadku czarnoksiężnik przejmuje władzę nad jej poczynaniami. Ofiara może sprzeciwić się rozkazowi działania graniczącego z samobójstwem (w takim wypadku musi wykonać udany test SW, aby odeprzeć zaklęcie). W trakcie sprawowania kontroli nad śmiertelnikiem ciało czarnoksiężnika pogrążone jest w letargu. Po upływie czasu trwania zaklęcia ofiara musi wykonać udany Wymagający (-10) test SW w przeciwnym razie ulega mutacji (wybierz losowo)."
    )

    val PrzemianaTzeentcha = Blessing(
        name = "Przemiana Tzeentcha",
        icon = "",
        power = 18,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "12 metrów",
        componentName = "serce mutanta",
        componentPower = 2,
        duration = "liczba rund równa wartości Magii",
        description = "Dowolna postać w zasięgu 12 metrów od czarnoksiężnika musi wykonać Prosty (+10) test Siły Woli. Nieudany test oznacza, iż pada na ziemię (jest traktowana jako bezbronna), a jej ciało przechodzi potworna przemianę. W każdej rundzie trwania czaru ofiara musi wykonać Prosty (+10) test Odporności. Każdy nieudany test oznacza losowo wybraną mutację, która ujawnia się po upływie czasu trwania zaklęcia."
    )

    val WygaszenieMagii = Blessing(
        name = "Wygaszenie magii",
        icon = "",
        power = 20,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "6 metrów",
        componentName = "krew strachulca Tzeentcha",
        componentPower = 3,
        duration = "1k10 minut",
        description = "Czarnoksiężnik wypowiada inkantację w bluźnierczej mowie demonów, wysysając energię Eteru z dowolnego przedmiotu magicznego w zasięgu 6 metrów. W trakcie trwania czaru artefakt traci wszelkie specjalne zdolności. Czarnoksiężnik musi wykonać Wymagający (-10) test Odporności. Nieudany test oznacza natychmiastową mutację (wybierz losowo)."
    )

    val PozogaTzeentcha = Blessing(
        name = "Pożoga Tzeentcha",
        icon = "",
        power = 25,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "5 metrów",
        componentName = "ognisko z kości 13 mutantów",
        componentPower = 3,
        duration = "chwilowy",
        description = "W dowolnym miejscu w zasięgu 24 metrów czarnoksiężnik wywołuje silną eksplozję fioletowego ognia. Wszystkie postacie w promieniu 5 metrów otrzymują 4 trafienia z Siłą 4. Ciała osób zabitych przez pożogę Tzeentcha natychmiast ulegają spaleniu. Pozostają po nich jedynie różowe popioły, które wirują przez 2 rundy, a następnie gęstnieją, przybierając postać różowych strachulców Tzeentcha. Demony atakują najbliższą postać, nie reagując na polecenia czarnoksiężnika. Po 1k10 rundach wracają do Domeny Chaosu, znudzone światem śmiertelników."
    )

    val WygnanieSmiertelnika = Blessing(
        name = "Wygnanie śmiertelnika",
        icon = "",
        power = 30,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "6 metrów",
        componentName = "oczy czarodzieja",
        componentPower = 3,
        duration = "chwilowy",
        description = "Dowolna postać w zasięgu 6 metrów od czarnoksiężnika musi wykonać Bardzo Trudny (-30) test Siły Woli, gdyż w przeciwnym wypadku jej dusza zostanie wyrwana z ciała i rzucona na pożarcie demonom Domeny Chaosu. Porzucone ciało oczywiście umiera."
    )
}

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////// DZIEDZINA MANANNA ////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////

object ManannDomain {

    // SCIEZKA GLOWNA - WLADCA PODROZY

    val BlogoslawinyRejs = Blessing(
        name = "Błogosławiony rejs",
        icon = "",
        power = 5,
        timeToCast = CastingTime.TURA,
        range = "dotykowy",
        componentName = "flaszka wina",
        componentPower = 1,
        duration = "jedna podróż morska, do momentu zawinięcia do portu",
        description = "Na początku morskiej podróży kapłan modli się do Mananna, prosząc go o przychylność i opiekę. Tak długo, jak na pokładzie statku znajduje się kapłan, wszystkie testy nawigacji wykonywane są z modyfikatorem +10."
    )

    val OddychaniePodWoda = Blessing(
        name = "Oddychanie pod wodą",
        icon = "",
        power = 7,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotykowy",
        componentName = "żywa ryba",
        componentPower = 1,
        duration = "1 godzina",
        description = "Dotyk kapłana powoduje, że dowolna postać może oddychać pod wodą. Jest to czar dotykowy. Kapłan może go rzucić również na siebie."
    )

    val BiczWodny = Blessing(
        name = "Bicz wodny",
        icon = "",
        power = 10,
        timeToCast = CastingTime.AKCJA,
        range = "36 metrów",
        componentName = "fiolka wypełniona wodą morską",
        componentPower = 1,
        duration = "chwilowy",
        description = "Z wyciągniętych dłoni kapłana tryskają strumienie morskiej wody. Uderzają w dowolnego przeciwnika znajdującego się w odległości do 36 metrów. Jest to magiczny pocisk o Sile 4. Trafiona postać musi wykonać test Krzepy. Nieudany test oznacza, że pada na ziemię."
    )

    val ChodzeniePodWodzie = Blessing(
        name = "Chodzenie po wodzie",
        icon = "",
        power = 14,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "osobisty",
        componentName = "wyschnięty żuk wodny",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii kapłana",
        description = "Bóg morza tchnie w kapłana moc chodzenia po wodzie, mokradłach i bagnach. W trakcie trwania czaru kapłan może poruszać się w takim terenie tak, jakby stąpał po twardym gruncie."
    )

    val CiszaMorska = Blessing(
        name = "Cisza morska",
        icon = "",
        power = 16,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "96 metrów",
        componentName = "sztylet z fiszbinu wieloryba",
        componentPower = 2,
        duration = "1 godzina",
        description = "Kapłan modli się do Mananna, prosząc go o łaskę. Kapłan wskazuje dowolny statek znajdujący się w odległości do 96 metrów. W jego pobliżu natychmiast cichnie wiatr. Żagle opadają bezwładnie. Jeśli statek nie ma wioseł, to do końca trwania czaru stoi w miejscu lub dryfuje, znoszony prądami."
    )

    val KlatwaAlbatrosa = Blessing(
        name = "Klątwa albatrosa",
        icon = "",
        power = 19,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "48 metrów",
        componentName = "pióro albatrosa",
        componentPower = 2,
        duration = "1 minuta (6 rund)",
        description = "Kapłan kieruje klątwy Mananna przeciwko swoim wrogom znajdującym się w odległości do 48 metrów. Wszystkie postacie w promieniu 5 metrów wokół wskazanego miejsca zostają objęte czarem. W trakcie jego trwania Wartość Krytyczna wszystkich trafień krytycznych zadanych tym postaciom zwiększa się o 2."
    )

    // SCIEZKA DRUGA - WLADCA SZTORMOW

    val SilnePrady = Blessing(
        name = "Silne prądy",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "zasięg wzroku",
        componentName = "garść soli",
        componentPower = 1,
        duration = "1 godzina",
        description = "Kapłan kieruje inwokację przeciwko łodzi lub statkowi, które znajdują się w jego zasięgu wzroku. Wszystkie testy wiosłarstwa i żeglarstwa podejmowane na pokładzie tej jednostki wykonywane są z modyfikatorem -10."
    )

    val TwarzTopielca = Blessing(
        name = "Twarz topielca",
        icon = "",
        power = 8,
        timeToCast = CastingTime.AKCJA,
        range = "36 metrów",
        componentName = "kubek morskiej wody",
        componentPower = 1,
        duration = "liczba rund równa wartości Magii",
        description = "Kapłan odmawia modlitwę i kieruje moc w kierunku dowolnej postaci w zasięgu. Jej płuca natychmiast napełniają się morską wodą, uniemożliwiając mówienie i utrudniając podjęcie innych działań. Tak długo, jak woda wypełnia jej płuca, postać otrzymuje modyfikator -10 do wszystkich testów. W każdej rundzie może poświęcić akcję, żeby wykonać test Odporności. Udany test oznacza, że wykaszlała wodę z płuc, przerywając działanie zaklęcia. Jeśli postać nie zdoła tego zrobić w trakcie trwania czaru, na koniec otrzymuje automatyczne trafienie z Siłą 2."
    )

    val ChodMarynarza = Blessing(
        name = "Chód marynarza",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA,
        range = "36 metrów",
        componentName = "drzazga z deski wyciągniętej z wraku",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii",
        description = "Kapłan odmawia modlitwę i dowolna postać w zasięgu nagle ma wrażenie, jakby znalazła się na pokładzie statku w czasie sztormu. W każdej rundzie musi wykonać udany test Zręczności, żeby utrzymać się na nogach. Jeśli się przewróci, musi wykonać udany test Zręczności i poświęcić akcję, żeby wstać. Jeśli i tak musiałaby wykonać takie testy (bo na przykład naprawdę znajduje się na pokładzie statku w czasie sztormu), zaklęcie powoduje modyfikator -30 do testów, kumulatywny z innymi, które mogą obowiązywać w tej sytuacji."
    )

    // SCIEZKA TRZECIA - WLADCA DAROW

    val OkoRybaka = Blessing(
        name = "Oko rybaka",
        icon = "",
        power = 9,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "cienka wędkarska linka",
        componentPower = 1,
        duration = "chwilowy",
        description = "Moc Mananna pozwala kapłanowi w niewytłumaczalny sposób wyczuwać, gdzie najszybciej da się znaleźć określone stworzenie morskie. W trakcie rzucania zaklęcia kapłan wymienia nazwę pospolitego zwierzęcia. Instynktownie wyczuwa, gdzie w polu widzenia znajduje się najlepsze miejsce, żeby je znaleźć. Jeśli jest to ryba, tam należy zarzucić przynętę lub sieci. Jeśli małże, to tam należy nurkować."
    )

    val SprzyjajacyWiatr = Blessing(
        name = "Sprzyjający wiatr",
        icon = "",
        power = 16,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "statek kapłana",
        componentName = "miech",
        componentPower = 2,
        duration = "1 godzina",
        description = "Manann obdarza statek, na którym znajduje się kapłan, łaską przyjaznego wiatru. Wieje z właściwego kierunku i z taką siłą, żeby statek płynął z maksymalną bezpieczną prędkością. Zaklęcie działa nawet wtedy, gdy kapłan nie potrafi wyznaczyć kursu, pod warunkiem, że płynie do miejsca, w którym już wcześniej był. W przeciwnym razie musi wskazać kierunek. Z wszelkimi utrudnieniami na kursie załoga musi sobie poradzić w normalny sposób, ale zaklęcie i sprzyjające wiatry zapewniają modyfikator +10 do tych testów."
    )

    val LaskaAlbatrosa = Blessing(
        name = "Łaska albatrosa",
        icon = "",
        power = 20,
        timeToCast = CastingTime.TURA,
        range = "statek kapłana",
        componentName = "butelka wina i ryba",
        componentPower = 2,
        duration = "do zawinięcia do portu lub śmierci albatrosa",
        description = "Kapłan odmawia modlitwę do Mananna na pokładzie statku, który może stać w porcie, ale musi być zwodowany. Po zakończeniu inkantacji z nieba zlatuje albatros i będzie podążał za statkiem, gdziekolwiek popłynie. Odczeka godzinę, żeby statek wypłynął w morze, a potem pozostanie w pobliżu, dopóki nie zginie albo statek nie zawinie do portu. Tak długo, jak albatros jest obecny w pobliżu, statek nie może zatonąć, niezależnie od stopnia uszkodzenia. Załoga nie jest wszakże chroniona przed wypadnięciem za burtę, lub przez dziury w kadłubie."
    )
}

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////// DZIEDZINA MORRA /////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////

object MorrDomain {

    // SCIEZKA GLOWNA - MORR O ZMIERZCHU

    val Mumifikacja = Blessing(
        name = "Mumifikacja",
        icon = "",
        power = 5,
        timeToCast = CastingTime.TURA,
        range = "dotyk",
        componentName = "kawałek świeżego owocu",
        componentPower = 1,
        duration = "24 godziny",
        description = "Kapłan na pewien czas powstrzymuje proces gnicia zwłok. W trakcie trwania czaru poddane mumifikacji zwłoki nie mogą zostać ożywione za pomocą magii nekromanckiej."
    )

    val ZnakKruka = Blessing(
        name = "Znak kruka",
        icon = "",
        power = 9,
        timeToCast = CastingTime.AKCJA,
        range = "12 metrów",
        componentName = "krucze pióro",
        componentPower = 1,
        duration = "1 runda",
        description = "Kapłan przywołuje symbol Morra - widmowego kruka który spowija go cieniem śmierci. W trakcie trwania czaru kapłan, a także wszyscy jego towarzysze znajdujący się w odległości do 12 metrów, zadają obrażenia zwiększone o 1."
    )

    val PoslaniecZeSnu = Blessing(
        name = "Posłaniec ze snu",
        icon = "",
        power = 10,
        timeToCast = CastingTime.TURA,
        range = "nieograniczony",
        componentName = "kłębek wełny",
        componentPower = 1,
        duration = "30 sekund (3 rundy)",
        description = "Kapłan objawia się we śnie wybranej postaci. Wizja trwa 30 sekund (3 rundy). W tym czasie kapłan może przekazać dowolną wiadomość. Odbiorca musi być osobą, którą kapłan spotkał osobiście, musi rozumieć język, w którym przemawia kapłan i oczywiście, musi spać w momencie rzucenia zaklęcia."
    )

    val WiecznyOdpoczynek = Blessing(
        name = "Wieczny odpoczynek",
        icon = "",
        power = 13,
        timeToCast = CastingTime.AKCJA,
        range = "dotyk",
        componentName = "drewniany kołek",
        componentPower = 2,
        duration = "chwilowy",
        description = "Kapłan modli się do boga, prosząc go, by uspokoił ożywionego trupa. Dotyk kapłana zadaje ożywieńcowi trafienie z Siłą 8. Jest to czar dotykowy."
    )

    val WizjaMorra = Blessing(
        name = "Wizja Morra",
        icon = "",
        power = 15,
        timeToCast = CastingTime.TURA,
        range = "osobisty",
        componentName = "grzyb zebrany z mogiły",
        componentPower = 2,
        duration = "chwilowy",
        description = "Kapłan modli się do Morra, prosząc go o objawienie i wyjaśnienie zaistniałego problemu lub zagadki. Powinieneś wykonać w tajemnicy test Ogłady Bohatera Gracza. Udany test oznacza, że kapłan otrzymuje wizję, która zawiera pomocne wskazówki. Nieudany test oznacza, że wizja nie przybliża go do rozwikłania problemu."
    )

    val Letarg = Blessing(
        name = "Letarg",
        icon = "",
        power = 20,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "24 metry",
        componentName = "mała srebrna kosa",
        componentPower = 2,
        duration = "1k10 rund",
        description = "Kapłan wykorzystuje moc Morra, by uśpić dowolną grupę osób znajdujących się w odległości do 24 metrów. Wszystkie postacie w promieniu 5 metrów wokół wskazanego miejsca muszą wykonać test Siły Woli. Nieudany test oznacza, że zapadają w sen, który jest nie do odróżnienia od śmierci. W trakcie trwania czaru postacie są traktowane jako bezbronne."
    )

    // SCIEZKA DRUGA - MORR W NOCY

    val PrzeblyskPrzyszlosci = Blessing(
        name = "Przebłysk przyszłości",
        icon = "",
        power = 8,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "małe lusterko",
        componentPower = 2,
        duration = "24 godziny albo do aktywacji",
        description = "Po rzuceniu zaklęcia kapłan nagle doświadcza krótkiej wizji dotyczącej pewnego wydarzenia z przyszłości. W ciągu następnych 24 godzin otrzymuje modyfikator +10 do dowolnego pojedynczego testu i może zdecydować o jego zastosowaniu już po rzucie kostkami. Kapłan może znajdować się pod wpływem tylko jednego przebłysku przyszłości."
    )

    val ProgZycia = Blessing(
        name = "Próg życia",
        icon = "",
        power = 11,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "8 metrów",
        componentName = "kawałek węgla drzewnego",
        componentPower = 2,
        duration = "do świtu następnego dnia",
        description = "Kapłan zanosi modły do Morra, jednocześnie rysując na ziemi linię o długości maksymalnie do ośmiu metrów. Każdy ożywieniec, który spróbuje ją przekroczyć, musi najpierw wykonać udany test Siły Woli. Nieumarli nieposiadający tej cechy nie mogą przekroczyć tej linii. Każdy ożywieniec może tylko raz podjąć próbę przekroczenia linii."
    )

    val WizjaZguby = Blessing(
        name = "Wizja zguby",
        icon = "",
        power = 12,
        timeToCast = CastingTime.TURA,
        range = "osobisty",
        componentName = "włosy, ścinki paznokci oraz kropla krwi wybranej osoby",
        componentPower = 2,
        duration = "natychmiastowy",
        description = "Morr zsyła na kapłana wizję ważnego wydarzenia z przyszłości danej osoby. Najczęściej, ale nie zawsze, jest to wizja jej śmierci ale nigdy nie zdradza wszystkich okoliczności. Kapłan może się dowiedzieć, że wybrana osoba zginie z ręki orka, ale nie wie, gdzie ani kiedy. Dana osoba tylko raz może być celem tego zaklęcia."
    )

    val PoroczySen = Blessing(
        name = "Proroczy sen",
        icon = "",
        power = 15,
        timeToCast = CastingTime.TURA,
        range = "osobisty",
        componentName = "kadzidełko",
        componentPower = 2,
        duration = "natychmiastowy",
        description = "Morr nawiedza kapłana we śnie, zsyłając mu wizję działań, które powinien podjąć. Sen jest wyraźny, lecz niekompletny i nie wyjaśnia powodów, które kierują bóstwem. Kapłan widzi siebie podejmującego konkretne działanie i potrafi stwierdzić, gdzie i kiedy to się odbędzie. Powtórne rzucenie tego zaklęcia ukazuje ten sam sen, do czasu, aż kapłan wypełni proroctwo."
    )

    val SłowaMorra = Blessing(
        name = "Słowa Morra",
        icon = "",
        power = 20,
        timeToCast = CastingTime.TURA,
        range = "dotyk ciała",
        componentName = "duże zwierciadło",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii",
        description = "Przed kapłanem pojawia się duch zmarłego człowieka, zmuszony przez Morra, aby odpowiedzieć na pytania kapłana (maksymalnie tyle, ile wynosi wartość jego Magii). Duch nie kłamie i musi udzielić odpowiedzi, lecz sam decyduje, jak wiele szczegółów ujawni, i nie może wyjawić informacji, których nie posiadał za życia. Dane ciało może tylko raz być obiektem tego zaklęcia."
    )

    // SCIEZKA TRZECIA - MORR ZA DNIA

    val ZniszczanieOzywienacow = Blessing(
        name = "Zniszczenie ożywieńca",
        icon = "",
        power = 13,
        timeToCast = CastingTime.AKCJA,
        range = "dotyk",
        componentName = "drewniany kołek",
        componentPower = 2,
        duration = "chwilowy",
        description = "Kapłan modli się do boga, prosząc go, by uspokoił ożywionego trupa. Dotyk kapłana zadaje ożywieńcowi trafienie z Siłą 8. Jest to czar dotykowy."
    )

    val WiecznyOdpoczynekUlepszona = Blessing(
        name = "Wieczny odpoczynek (ulepszona)",
        icon = "",
        power = 16,
        timeToCast = CastingTime.DZIESIECMINUT,
        range = "dotyk",
        componentName = "kołek z wonnego drewna",
        componentPower = 2,
        duration = "natychmiastowy",
        description = "Kapłan odmawia uroczystą modlitwę nad ciałem zmarłego, kierując jego duszę bezpośrednio do Królestwa Morra i zabezpieczając doczesne szczątki przed mocą nekromancji. Jeśli celem jest nieumarły musi wykonać udany test Siły Woli; w przeciwnym razie zostanie natychmiast unicestwiony. Przez cały czas rzucania zaklęcia kapłan musi dotykać ciała."
    )

}

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////// DZIEDZINA MYRMIDII //////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////

object MyrmiidiaDomain {

    // SCIEZKA GLOWNA - MŚCIWA MYRMIDIA

    val WloczniaMyrmiidii = Blessing(
        name = "Włócznia Myrmidii",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "osełka",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Włócznia trzymana przez kapłana zostaje napełniona mocą Myrmidii. W trakcie trwania czaru jest traktowana jako broń magiczna z cechą oręża 'przebijający zbroję'."
    )

    val MściwaFuria = Blessing(
        name = "Mściwa furia",
        icon = "",
        power = 7,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "osobisty",
        componentName = "krew skrzywdzonej kobiety",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii",
        description = "Modlitwa wyzwala w kapłanie nieokiełznaną furię i nienawiść. W trakcie trwania czaru może raz przerzucić każdy nieudany test Walki Wręcz lub Umiejętności Strzeleckich, ale w walce wręcz zawsze atakuje najbliższego przeciwnika i wykonuje 'szaleńczy atak' albo 'szarżę', albo 'atak wielokrotny'. Nie może też uciekać ani wykonywać akcji 'odwrót'."
    )

    val BłyskawicznyCios = Blessing(
        name = "Błyskawiczny cios",
        icon = "",
        power = 14,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "osobisty",
        componentName = "amulet z wygrawerowaną błyskawicą",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Kapłan, natchniony mocą Myrmidii, otrzymuje +1 do Ataków i może wykonywać atak wielokrotny, poświęcając na to zwykłą akcję. Wciąż obowiązuje go ograniczenie, dopuszczające tylko jedną akcję 'atak' w rundzie."
    )

    val ZewFurii = Blessing(
        name = "Zew furii",
        icon = "",
        power = 15,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "24 metry",
        componentName = "strzaskany grot włóczni",
        componentPower = 2,
        duration = "liczba rund równa wartości Magii",
        description = "Pełna pasji modlitwa kapłana napełnia towarzyszy żarliwą nienawiścią do wroga. W każdej rundzie wszyscy sojusznicy w zasięgu mogą przerzucić pierwszy nieudany rzut na trafienie."
    )

    val GrozaWojny = Blessing(
        name = "Groza wojny",
        icon = "",
        power = 16,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "miedziana maska",
        componentPower = 2,
        duration = "liczba rund równa wartości Magii kapłana",
        description = "Kapłan, obdarzony łaską Myrmidii, staje się przerażającym przeciwnikiem. Za każdym razem, gdy wykona udany atak w walce wręcz, jego przeciwnik musi wykonać test Grozy, zgodnie ze zwykłymi zasadami."
    )

    val GorejąceSłońce = Blessing(
        name = "Gorejące słońce",
        icon = "",
        power = 20,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty (do 5 metrów)",
        componentName = "strona z Bellona Myrmidia ze wzmianką o Furii",
        componentPower = 2,
        duration = "natychmiastowy",
        description = "Myrmidia odpowiada na modły kapłana w formie oślepiających płomieni słusznej pomsty. Wszystkie postacie w promieniu pięciu metrów od niego (sojusznicy i wrogowie, z wyłączeniem samego kapłana) otrzymują trafienie z Siłą 3 (bez uwzględnienia pancerza), a dodatkowo muszą wykonać test Siły Woli. Nieudany test oznacza, że w następnej rundzie są ogłuszeni, na wpół oślepieni i mogą jedynie gasić płomienie."
    )

    // SCIEZKA DRUGA - KAPITAN MYRMIDIA

    val RozkazyDlaWojska = Blessing(
        name = "Rozkazy dla wojska",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "zasięg wzroku",
        componentName = "orli dziób",
        componentPower = 1,
        duration = "1 runda",
        description = "Kapłan modli się do Myrmidii, żeby wzmocniła jego słowa, a potem wykrzykuje rozkaz. Do końca rundy każda postać w zasięgu jego wzroku, niezależnie od odległości, słyszy rozkazy kapłana, a on sam otrzymuje modyfikator +10 do dowolnego testu dowodzenia wobec postaci (lub grupy) będącej celem tego zaklęcia."
    )

    val GeniuszTaktyczny = Blessing(
        name = "Geniusz taktyczny",
        icon = "",
        power = 7,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "12 metrów",
        componentName = "buława",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii kapłana",
        description = "Kapłan otacza się aurą męstwa, co działa pokrzepiająco na jego towarzyszy. W trakcie trwania czaru otrzymuje +20 do testów dowodzenia i nauki (taktyka/strategia). Dodatkowo, dopóki czar trwa, towarzysze kapłana, znajdujący się w promieniu 12 metrów od niego, mogą powtórzyć każdy nieudany test Strachu lub Grozy."
    )

    val Waleczność = Blessing(
        name = "Waleczność",
        icon = "",
        power = 10,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "24 metry",
        componentName = "wiązka patyków",
        componentPower = 1,
        duration = "liczba rund równa wartości Magii kapłana",
        description = "Kapłan modli się do Myrmidii, by natchnęła jego sprzymierzeńców niedoścignioną maestrią bojową. W trakcie trwania czaru wszyscy towarzysze kapłana, znajdujący się w promieniu 24 metrów wokół niego, otrzymują modyfikator +10 do Walki Wręcz."
    )

    val TarczaMyrmiidii = Blessing(
        name = "Tarcza Myrmidii",
        icon = "",
        power = 20,
        timeToCast = CastingTime.TRZY_AKCJE,
        range = "24 metry",
        componentName = "tarcza",
        componentPower = 2,
        duration = "1 minuta (6 rund)",
        description = "Myrmidia wysłuchuje próśb kapłana. Wszyscy sprzymierzeńcy w promieniu 24 metrów wokół niego otrzymują +1 Punkt Zbroi na wszystkich lokacjach ciała (wciąż obowiązuje ograniczenie do 5 PZ na każdej lokacji)."
    )

    // SCIEZKA TRZECIA - GENERAŁ MYRMIDIA

    val ZLotuOrła = Blessing(
        name = "Z lotu orła",
        icon = "",
        power = 13,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "osobisty",
        componentName = "soczewica w złotej oprawce",
        componentPower = 2,
        duration = "1 minuta (6 rund)",
        description = "Myrmidia odpowiada na modły kapłana, ukazując mu obraz toczonej w pobliżu bitwy (w odległości do pięciu kilometrów za każdy punkt Magii kapłana) z perspektywy orła szybującego wysoko nad polem walki. Duchowny dostrzega wszystkie ruchy wojsk, co zapewnia mu modyfikator +10 do testów nauki (strategia/taktyka) dotyczących tej bitwy. W trakcie trwania czaru jest jednak rozkojarzony i przeciwnicy, którzy go atakują, otrzymują modyfikator +30 do testu Walki Wręcz."
    )

    val PobożnośćTarczowniczki = Blessing(
        name = "Pobożność tarczowniczki",
        icon = "",
        power = 17,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "36 metrów",
        componentName = "sztandar z orłem",
        componentPower = 2,
        duration = "liczba rund równa wartości Magii",
        description = "Modlitwa kapłana wzbudza w dzieciach Myrmidii religijną pobożność godną jej najodważniejszych tarczowniczek. Wszyscy wyznawcy Myrmidii, Tileańczycy oraz Estalijczycy w zasięgu zyskują zdolność nieustraszony."
    )
}

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////// DZIEDZINA RANALDA ///////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////

object RanaldDomain {

    // SCIEZKA GLOWNA - RANALD ŁOTRZYK

    val SprytRanalda = Blessing(
        name = "Spryt Ranalda",
        icon = "",
        power = 3,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "osobisty",
        componentName = "kocia skórka",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii kapłana",
        description = "Ranald obdarza kapłana niesamowitą zręcznością. W trakcie trwania czaru kapłan otrzymuje modyfikator +20 do testów ukrywania się i skradania się. Jeżeli przejdzie obok miejsca, na które został nałożony magiczny alarm, może wykonać test splatania magii. Udany test oznacza, że kapłan przemyka się niepostrzeżenie przez chroniony obszar."
    )

    val ŚlepyTraf = Blessing(
        name = "Ślepy traf",
        icon = "",
        power = 7,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotyk",
        componentName = "królicza łapka",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Kapłan obdarza dowolną postać łaską Ranalda. Gracz może odwrócić kolejność kostek po jednym teście cechy lub umiejętności, który jego Bohater wykona w ciągu trwania czaru. Na przykład wynik testu ukrywania się wynoszący 82 może zostać zamieniony na 28. Jest to czar dotykowy. Kapłan może go rzucić również na siebie. Postać może znajdować się pod wpływem tylko jednego ślepego trafu w danej chwili."
    )

    val Otwarcie = Blessing(
        name = "Otwarcie",
        icon = "",
        power = 9,
        timeToCast = CastingTime.AKCJA,
        range = "2 metry",
        componentName = "klucz",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Kapłan wykorzystuje magiczną moc do otwarcia dowolnego zamka, rygla lub skobla znajdującego się w odległości do 2 metrów. W trakcie trwania czaru nikt oprócz kapłana, nie może go zamknąć. Udany test splatania magii pozwala kapłanowi przełamać moc zaklęcia magiczne zamknięcie."
    )

    val Urok = Blessing(
        name = "Urok",
        icon = "",
        power = 14,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "24 metry",
        componentName = "kłębek wełny",
        componentPower = 1,
        duration = "1 runda",
        description = "Kapłan wykorzystuje moc oszukańczego bóstwa, by zmusić do posłuszeństwa dowolną istotę humanoidalną (człowieka, elfa, orka, zwierzoczłeka, itp.), znajdującą się w odległości do 24 metrów. Ofiara może odeprzeć czar wykonując udany test Siły Woli. Nieudany test oznacza, że w następnej rundzie jej poczynaniami kieruje kapłan. Zaklęcie urok nie działa na demony i ożywieńców."
    )

    val WykryciePulapek = Blessing(
        name = "Wykrycie pułapek",
        icon = "",
        power = 16,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "12 metrów",
        componentName = "oczy sokoła",
        componentPower = 2,
        duration = "chwilowy",
        description = "Kapłan koncentruje się i magicznie sonduje najbliższą okolicę. Automatycznie wykrywa wszystkie pułapki w promieniu 12 metrów. Zaklęcie nie rozbraja pułapek, a jedynie informuje o ich istnieniu i położeniu."
    )

    val UśmiechLosu = Blessing(
        name = "Uśmiech losu",
        icon = "",
        power = 20,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "24 metry",
        componentName = "posrebrzane kości do wróżenia",
        componentPower = 2,
        duration = "1 minuta (6 rund)",
        description = "Zaklęcie działa podobnie jak ślepy traf, z tą różnicą, że obejmuje działaniem kapłana i wszystkich jego towarzyszy znajdujących się w odległości do 24 metrów. Każdy może odwrócić kolejność kostek po jednym teście cechy lub umiejętności."
    )

    // SCIEZKA DRUGA - RANALD HANDLARZ

    val ŁowcaOkazji = Blessing(
        name = "Łowca okazji",
        icon = "",
        power = 10,
        timeToCast = CastingTime.TURA,
        range = "osobisty",
        componentName = "moneta",
        componentPower = 1,
        duration = "natychmiastowy",
        description = "Ranald prowadzi kapłana do najtańszego źródła określonego towaru. Wypowiadając inkantację, kapłan określa rejon geograficzny, rodzaj oraz ilość danego towaru, a także jego jakość. Jeśli w danym miejscu nie da się go nabyć, Ranald przekazuje kapłanowi wyraźny znak. W normalnych okolicznościach towar można kupić o 10% taniej niż wynosi zwyczajowa cena."
    )

    val OkoRanalda = Blessing(
        name = "Oko Ranalda",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "osobisty",
        componentName = "niewielka waga szalkowa",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii",
        description = "Ranald obdarza kapłana umiejętnością bezbłędnego szacowania wartości towaru, co zapewnia modyfikator +20 do testów targowania i wyceny."
    )

    val RynkowaPogłoska = Blessing(
        name = "Rynkowa pogłoska",
        icon = "",
        power = 16,
        timeToCast = CastingTime.TURA,
        range = "osobisty",
        componentName = "wydrukowana strona gazety",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii",
        description = "Kapłan zaklina Ranalda, żeby wpłynął na ceny określonego towaru lub usługi w danej osadzie lub mieście. Zaklęcie sprawia, że wszyscy mieszkańcy przeczuwają zmianę dostępności towaru. Ceny spadają lub wzrastają o 10%, w zależności od wyboru kapłana. Zaklęcie dotyczy wyłącznie transakcji zawieranych między kapłanem a inną osobą."
    )

    val PełnaEmpatia = Blessing(
        name = "Pełna empatia",
        icon = "",
        power = 20,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "zwierciadło",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii",
        description = "Kapłan doskonale rozumie osobę, z którą rozmawia. Zaklęcie przełamuje nie tylko barierę językową, ale także różnice kulturowe i społeczne, umożliwiając kapłanowi poznanie sposobu myślenia i odczuć danej osoby. W handlu zapewnia to modyfikator +50 do testów targowania w kontaktach z tą osobą."
    )

    // SCIEZKA TRZECIA - RANALD WYZWOLICIEL

    val PospolitaTwarz = Blessing(
        name = "Pospolita twarz",
        icon = "",
        power = 14,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "maska",
        componentPower = 2,
        duration = "liczba godzin równa wartości Magii",
        description = "Kapłan odmawia modlitwę i od tej chwili mało kto zwraca uwagę na jego wygląd. Każda spotkana istota będzie musiała wykonać udany test Siły Woli, żeby przypomnieć sobie więcej niż dwa elementy jego wyglądu. Pamięta je dobrze, ale to kapłan decyduje, co zapamiętała."
    )

    val OblieczeNędzarza = Blessing(
        name = "Oblicze nędzarza",
        icon = "",
        power = 16,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "12 metrów",
        componentName = "szkatułka z podwójnym dnem",
        componentPower = 2,
        duration = "liczba godzin równa wartości Magii",
        description = "Zaklęcie sprawia, że wszelkie kosztowności, które posiadają przy sobie kapłan i jego towarzysze w zasięgu dwunastu metrów, zostają ukryte przed wzrokiem innych osób. Nie da się ich znaleźć żadnym sposobem, chyba że kapłan świadomie wyrazi na to zgodę. Nawet jeśli strażnik wywróci do góry dnem trzos, znajdzie w środku pół suchara i parę okruszków."
    )

}

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////// DZIEDZINA SHALLYI ///////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////

object ShallyaDomain {

    // SCIEZKA GLOWNA - SHALLYA SKUPIONA

    val ZwalczenieTrucizny = Blessing(
        name = "Zwalczenie trucizny",
        icon = "",
        power = 4,
        timeToCast = CastingTime.AKCJA,
        range = "dotyk",
        componentName = "kieł żmii",
        componentPower = 1,
        duration = "chwilowy",
        description = "Dotyk kapłana uzdrawia postać cierpiącą z powodu zatrucia. Cały jad w ciele postaci natychmiast zostaje zneutralizowany, a wszelkie jego efekty ustają. Zaklęciem nie można wskrzesić postaci zmarłej na skutek zatrucia. Jest to czar dotykowy."
    )

    val LeczenieRan = Blessing(
        name = "Leczenie ran",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "dotyk",
        componentName = "pijawka",
        componentPower = 1,
        duration = "chwilowy",
        description = "Dotyk kapłana uzdrawia dowolną postać, przywracając jej 1k10 punktów Żywotności plus tyle, ile wynosi wartość Magii kapłana. Jest to czar dotykowy. Kapłan może go rzucić również na siebie."
    )

    val LeczenieChoroby = Blessing(
        name = "Leczenie choroby",
        icon = "",
        power = 11,
        timeToCast = CastingTime.TRZY_AKCJE,
        range = "dotyk",
        componentName = "kompres",
        componentPower = 1,
        duration = "chwilowy",
        description = "Kapłan uzdrawia dowolną chorą postać. Wszystkie efekty choroby natychmiast ustają. Zaklęciem nie można wskrzesić postaci, która zmarła na skutek choroby. Jest to czar dotykowy."
    )

    val Męczeństwo = Blessing(
        name = "Męczeństwo",
        icon = "",
        power = 14,
        timeToCast = CastingTime.AKCJA,
        range = "24 metry",
        componentName = "kosmyk włosów postaci będącej celem czaru",
        componentPower = 2,
        duration = "1 minuta (6 rund)",
        description = "Kapłan nawiązuje magiczną więź z dowolną postacią znajdującą się w odległości do 24 metrów. W trakcie trwania czaru wszystkie obrażenia zadawane tej postaci zostają przeniesione na kapłana."
    )

    val Oczyszczenie = Blessing(
        name = "Oczyszczenie",
        icon = "",
        power = 16,
        timeToCast = CastingTime.AKCJA,
        range = "48 metrów",
        componentName = "płonąca pochodnia",
        componentPower = 2,
        duration = "1 runda",
        description = "Nurgle - bóg Chaosu, Władca Chorób i Zepsucia - odczuwa szczególną odrazę wobec Shallyi. Kapłan przyzywa oczyszczającą moc Shallyi i kieruje ją przeciwko dowolnemu demonowi lub wyznawcy Nurgla znajdującemu się w odległości do 48 metrów. Ofiara natychmiast traci 1k10 punktów Żywotności, bez względu na Wytrzymałość i noszoną zbroję. Musi także wykonać test Siły Woli. Nieudany test oznacza ogłuszenie na 1 rundę."
    )

    val LeczenieObłędu = Blessing(
        name = "Leczenie obłędu",
        icon = "",
        power = 20,
        timeToCast = CastingTime.GODZINA,
        range = "dotyk",
        componentName = "kropidło",
        componentPower = 2,
        duration = "chwilowy",
        description = "Łaska bogini napełnia kapłana mocą oczyszczania umysłów. Jego dotyk uzdrawia dowolną obłąkaną postać, lecząc ją z jednej choroby umysłu. Jest to czar dotykowy."
    )

    // SCIEZKA DRUGA - SHALLYA ODPORNA

    val ZwiększonaOdporność = Blessing(
        name = "Zwiększona odporność",
        icon = "",
        power = 4,
        timeToCast = CastingTime.TURA,
        range = "dotyk",
        componentName = "łyk czystej wody",
        componentPower = 1,
        duration = "liczba godzin równa wartości Magii",
        description = "Modlitwa kapłanki wzmacnia naturalną odporność wybranej postaci, zapewniając jej w trakcie trwania czaru modyfikator +10 testów Odporności przeciwko chorobom."
    )

    val OdpornośćShallyi = Blessing(
        name = "Odporność Shallyi",
        icon = "",
        power = 8,
        timeToCast = CastingTime.AKCJA,
        range = "dotyk",
        componentName = "bandaż",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Kapłanka prosi Shallyę, żeby na krótko wzmocniła siły witalne postaci. Jej Odporność wzrasta o 10 punktów, co zarazem zwiększa Wytrzymałość o 1."
    )

    val SiłaWoli = Blessing(
        name = "Siła woli",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotyk",
        componentName = "opaska na oczy",
        componentPower = 1,
        duration = "liczba godzin równa wartości Magii",
        description = "Uspokajająca modlitwa wzmacnia umysł postaci oraz jej determinację, żeby nie poddać się grozie świata. W trakcie trwania czaru postać otrzymuje modyfikator +10 do testów Siły Woli wykonywanych w celu uniknięcia Punktów Obłędu."
    )

    val BastionCzystości = Blessing(
        name = "Bastion czystości",
        icon = "",
        power = 20,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "osobisty",
        componentName = "białe szaty",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii (lub do podjęcia agresji)",
        description = "Kapłanka zyskuje całkowitą odporność na wszelkie trucizny i choroby (także magiczne) w trakcie trwania czaru lub do podjęcia agresywnego działania przeciwko komukolwiek. Demony lub wyznawcy Pana Zarazy muszą wykonać udany Trudny (-20) test Siły Woli, żeby zaatakować kapłankę. Nieudany test oznacza zmarnowanie akcji ze strachu przed nieskalaną czystością Shallyi."
    )

    // SCIEZKA TRZECIA - SHALLYA UZDROWICIELKA

    val OpóźnienieSymptomów = Blessing(
        name = "Opóźnienie symptomów",
        icon = "",
        power = 15,
        timeToCast = CastingTime.AKCJA,
        range = "dotyk",
        componentName = "srebrne serce",
        componentPower = 2,
        duration = "liczba dni równa wartości Magii",
        description = "Kapłanka prosi Shallyę o miłosierdzie i odsunięcie w czasie nieuniknionego cierpienia. Dotyk kapłanki tymczasowo neutralizuje efekt choroby, trucizny, choroby umysłu i tym podobnych schorzeń. Po wygaśnięciu czaru symptomy powracają z normalną siłą. Każde schorzenie można poddać temu zaklęciu tylko raz."
    )

    val ZłoteLzy = Blessing(
        name = "Złote łzy",
        icon = "",
        power = 18,
        timeToCast = CastingTime.AKCJA,
        range = "dotyk",
        componentName = "łza",
        componentPower = 2,
        duration = "natychmiastowy",
        description = "Błogosławieństwo Shallyi leczy efekt dowolnego trafienia krytycznego (z wyłączeniem efektu numer 4, 9 i 10), o ile czar został rzucony w ciągu dwóch rund od zadania tego trafienia krytycznego. Zaklęcie musi zostać rzucone, zanim postać umrze, i nie może jej wskrzesić. Pomimo wyleczenia trafienia krytycznego postać otrzymuje Punkty Obłędu zgodnie z normalnymi zasadami."
    )

}

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////// DZIEDZINA SIGMARA ///////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////

object SigmarDomain {

    // SCIEZKA GLOWNA - SIGMAR KOWAL/KOWADŁO

    val MłotSigmara = Blessing(
        name = "Młot Sigmara",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "dotyk",
        componentName = "amulet z wyrytym symbolem Sigmara",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Kapłan napełnia potęgą Sigmara zwykły młot bojowy. W trakcie trwania czaru młot traktowany jest jako broń magiczna z cechą oręża \"druzgoczący\"."
    )

    val PancerzPrawości = Blessing(
        name = "Pancerz prawości",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "osobisty",
        componentName = "żelazny pierścień",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii kapłana",
        description = "Kapłan otacza się ochronną aurą mocy. Otrzymuje +1 Punkt Zbroi na wszystkich lokacjach ciała (wciąż obowiązuje go ograniczenie do 5 PZ na każdej lokacji)."
    )

    val TarczaNaHeretyków = Blessing(
        name = "Tarcza na heretyków",
        icon = "",
        power = 8,
        timeToCast = CastingTime.AKCJA,
        range = "dotyk",
        componentName = "mały srebrny młotek",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii",
        description = "Kapłan odmawia modlitwę i dotykając przedmiotu (na przykład drzwi lub ściany), wzmacnia go mocą wiary. W trakcie trwania zaklęcia przedmiot ma podwójną Wytrzymałość."
    )

    val KojącyDotyk = Blessing(
        name = "Kojący dotyk",
        icon = "",
        power = 12,
        timeToCast = CastingTime.TRZY_AKCJE,
        range = "dotyk",
        componentName = "skórzana rękawica",
        componentPower = 2,
        duration = "chwilowy",
        description = "Dotyk kapłana przywraca rannej postaci 1k10 punktów Żywotności. Jest to czar dotykowy. Kapłan może go rzucić również na siebie."
    )

    val AuraOdwagi = Blessing(
        name = "Aura odwagi",
        icon = "",
        power = 14,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "pryzmat",
        componentPower = 2,
        duration = "chwilowy",
        description = "Majestat Sigmara przepełnia kapłana, który zaczyna jaśnieć aurą męstwa i niezłomnej wiary. Na jego widok wszyscy towarzysze ogarnięci Strachem lub Grozą opanowują się i mogą działać normalnie."
    )

    val SercGryfa = Blessing(
        name = "Serce gryfa",
        icon = "",
        power = 14,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "24 metry",
        componentName = "złote piórko gryfa",
        componentPower = 2,
        duration = "1 minuta (6 rund)",
        description = "Pełna zapału modlitwa kapłana napełnia serca dziedziców Sigmara godną jego samego odwagą i determinacją. Obywatele Imperium oraz krasnoludy przebywający w zasięgu zaklęcia zyskują zdolność nieustraszony."
    )

    val KometaSigmara = Blessing(
        name = "Kometa Sigmara",
        icon = "",
        power = 16,
        timeToCast = CastingTime.AKCJA,
        range = "24 metry",
        componentName = "złoty grot strzały",
        componentPower = 2,
        duration = "chwilowy",
        description = "Kapłan zbiera moc i kształtuje ją w płonący pocisk, który przybiera postać symbolu Sigmara. Miniaturowa kometa o dwóch ogonach uderza w dowolną postać znajdującą się w odległości do 24 metrów. Jest to magiczny pocisk o Sile 6."
    )

    val Pogrom = Blessing(
        name = "Pogrom",
        icon = "",
        power = 16,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "12 metrów",
        componentName = "maleńki młot z brązu",
        componentPower = 2,
        duration = "1 minuta (6 rund)",
        description = "Naglące modlitwy kapłana wzbudzają większy zapal, żeby niszczyć wrogów Sigmara. Wszyscy sojusznicy w zasięgu zaklęcia zwiększają o 1 cechę Ataki w walce z ożywieńcami, zielonoskórymi lub sługami Chaosu."
    )

    val PłomieńWiary = Blessing(
        name = "Płomień wiary",
        icon = "",
        power = 20,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "złoty amulet z wizerunkiem komety o dwóch ogonach",
        componentPower = 2,
        duration = "chwilowy",
        description = "Kapłan przyzywa gniew Sigmara, otaczając się płomieniami, które go nie ranią. Wszystkie postacie w promieniu 10 metrów wokół niego otrzymują trafienie z Siłą 3. Demony i ożywieńcy znajdujący się w zasięgu płomieni otrzymują trafienie z Siłą 5. Od otrzymanych obrażeń nie odejmuje się Punktów Zbroi."
    )

    // SCIEZKA DRUGA - SIGMAR PŁOMIEŃ

    val NieskalaneKało = Blessing(
        name = "Nieskalane ciało",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "osobisty",
        componentName = "skrzydło gołębicy",
        componentPower = 2,
        duration = "1 minuta (6 rund)",
        description = "Kapłan żarliwie przeciwstawia się potędze Chaosu, prosząc Sigmara, aby chronił go przed wypaczającym wpływem Niszczycielskich Potęg. Zyskuje zdolność odporność na Chaos ale w trakcie trwania zaklęcia nie może rzucać żadnych czarów."
    )

    val SłowoPotępienia = Blessing(
        name = "Słowo potępienia",
        icon = "",
        power = 13,
        timeToCast = CastingTime.TRZY_AKCJE,
        range = "12 metrów",
        componentName = "lustro",
        componentPower = 2,
        duration = "1 minuta (6 rund)",
        description = "Modlitwa kapłana wzbudza w heretyku poczucie bezradności, gdy nagle ogarnia go wizja potępienia jego duszy. Wskazana postać otrzymuje modyfikator -20 do testów Siły Woli przeciwko czarom kapłańskim z dowolnej Dziedziny, a także przeciwko zastraszaniu i torturowaniu."
    )

    val MłotNaCzarownice = Blessing(
        name = "Młot na czarownice",
        icon = "",
        power = 15,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "osobisty",
        componentName = "pobłogosławiony pergamin z tekstem modlitwy",
        componentPower = 2,
        duration = "1 minuta (6 rund)",
        description = "Kapłan prosi Sigmara o ochronę przed jego zaprzysięgłymi wrogami. Otrzymuje modyfikator +20 do testów Siły Woli przeciwko zaklęciom z dowolnej Tradycji magii czarnoksięskiej. Jeśli czar nie przewiduje takiego rzutu obronnego, kapłan może uniknąć jego efektu, wykonując Trudny (-20) test Siły Woli."
    )

}

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////// DZIEDZINA TAALA I RHYI ///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////

object TaalRhyaDomain {

    // SCIEZKA GLOWNA - TAAL KRÓL ZWIERZĄT

    val PrzyjacielZwierząt = Blessing(
        name = "Przyjaciel zwierząt",
        icon = "",
        power = 4,
        timeToCast = CastingTime.TRZY_AKCJE,
        range = "12 metrów",
        componentName = "język zwierzęcia",
        componentPower = 1,
        duration = "10 minut",
        description = "Dzięki pomocy Taala kapłan może porozumiewać się z dowolnym zwierzęciem znajdującym się w odległości do 12 metrów. W trakcie trwania czaru kapłan otrzymuje modyfikator +20 do testów oswajania zwierzęcia, z którym rozmawia. Zwierzęta nie są przyzwyczajone do pogawędek z ludźmi i w związku z tym mają kłopoty z wyrażaniem swych myśli."
    )

    val RączyJeleń = Blessing(
        name = "Rączy jeleń",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "kłębek sierści jelenia",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii kapłana",
        description = "Kapłan czuje w sobie moc dzikiego jelenia. W trakcie trwania czaru otrzymuje +1 do Szybkości i może wykonywać \"szarżę\" w ramach akcji zwykłej, a nie podwójnej."
    )

    val ZwierzęcaFuria = Blessing(
        name = "Zwierzęca furia",
        icon = "",
        power = 10,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "osobisty",
        componentName = "kieł dużego drapieżnika",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Kapłan bardziej warczy niż wypowiada modlitwę do Taala, czując budzący się w nim gniew. Zyskuje zdolność straszny, natychmiast wpada w szał bojowy i zwiększa o 1 cechę Ataki."
    )

    val SerceWołu = Blessing(
        name = "Serce wołu",
        icon = "",
        power = 14,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotyk",
        componentName = "większy kawałek skóry wołu",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii",
        description = "Dotyk kapłana zwiększa wytrzymałość postaci. Może ona w każdej rundzie przerzucić jeden nieudany test Odporności."
    )

    val SiłaNiedźwiedzia = Blessing(
        name = "Siła niedźwiedzia",
        icon = "",
        power = 15,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "dotyk",
        componentName = "niedźwiedzi pazur",
        componentPower = 2,
        duration = "1 minuta (6 rund)",
        description = "Moc Taala przepływa przez kapłana, który może obdarzyć dowolną postać silą niedźwiedzia górskiego. W trakcie trwania czaru wzmocniona postać otrzymuje modyfikator +20 do Krzepy (czyli także +2 do Siły). Jest to czar dotykowy. Kapłan może go rzucić również na siebie."
    )

    val WładcaZwierząt = Blessing(
        name = "Władca zwierząt",
        icon = "",
        power = 15,
        timeToCast = CastingTime.AKCJA,
        range = "36 metrów",
        componentName = "szczęka wybranego gatunku zwierzęcia",
        componentPower = 2,
        duration = "1 runda",
        description = "Kapłan przemawia do wybranego zwierzęcia, powołując się na boski autorytet Taala i zmuszając je do posłuszeństwa. W następnej rundzie kapłan decyduje, jakie akcje podejmie zwierzę. Taal nie pozwoli mu skrzywdzić swojego sługi, dlatego kapłan nie może wydać zwierzęciu rozkazu, którego wykonanie sprowadzi pewną śmierć."
    )

    // SCIEZKA DRUGA - TAAL I RHYA

    val Oplątanie = Blessing(
        name = "Oplątanie",
        icon = "",
        power = 8,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "48 metrów",
        componentName = "winorośl",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Kapłan przyzywa moc drzemiącą w roślinach. W dowolnym miejscu, znajdującym się w odległości do 48 metrów, z ziemi wyrastają pnącza. Wszystkie postacie w promieniu 3 metrów wokół wskazanego miejsca muszą wykonać test Krzepy. Nieudany test oznacza unieruchomienie przez pnącza, udany - poruszanie z połową Szybkości."
    )

    val BłogosławieństwoRzeki = Blessing(
        name = "Błogosławieństwo rzeki",
        icon = "",
        power = 10,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "osobisty",
        componentName = "żywa ryba",
        componentPower = 1,
        duration = "(liczba minut równa wartości Magii) x 10",
        description = "Kapłan prosi Taala, Władcę Rzek, aby pozwolił mu na swobodne przebycie jego domeny. Może zignorować negatywne konsekwencje obciążenia podczas pływania w rzece, otrzymuje modyfikator +20 do testów pływania, a Szybkość pływania jest równa jednej dziesiątej wartości Krzepy (zaokrąglając w górę)."
    )

    val Grzmot = Blessing(
        name = "Grzmot",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "48 metrów",
        componentName = "niewielki gong",
        componentPower = 2,
        duration = "chwilowy",
        description = "Kapłan przyzywa moc burzy. W dowolnym miejscu w odległości do 48 metrów rozlega się ogłuszający grzmot. Wszystkie postacie w promieniu 5 metrów wokół wskazanego miejsca muszą wykonać test Odporności. Nieudany test oznacza ogłuszenie na 1 rundę. Odgłos grzmotu słyszalny jest w promieniu 1 kilometra."
    )

    val UkojenieRhyi = Blessing(
        name = "Ukojenie Rhyi",
        icon = "",
        power = 18,
        timeToCast = CastingTime.TURA,
        range = "10 metrów",
        componentName = "kubek świeżego mleka",
        componentPower = 1,
        duration = "chwilowy",
        description = "Kapłan blaga Matkę Ziemię, by wspomogła w potrzebie swoje dzieci. Wszyscy towarzysze kapłana, znajdując się w odległości do 10 metrów, czują się odświeżeni i wypoczęci, jakby odpoczywali przez trzy dni. Odzyskują punkty Żywotności, zgodnie ze zwykłymi zasadami odpoczynku."
    )

    // SCIEZKA TRZECIA - TAAL KRÓL PRZYRODY

    val DzikiWicher = Blessing(
        name = "Dziki wicher",
        icon = "",
        power = 19,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty (5 metrów)",
        componentName = "garść jesiennych liści",
        componentPower = 2,
        duration = "1 minuta (6 rund)",
        description = "Kapłan zanosi modły do Króla Bogów, a on odpowiada z dziką wściekłością. We wszystkie istoty w zasięgu pięciu metrów od kapłana (z wyłączeniem niego samego) nagle uderza porywisty wicher, powodujący modyfikator -20 do Zręczności i Walki Wręcz. Na początku każdej tury muszą wykonać udany test Odporności, w przeciwnym razie zostaną ogłuszone."
    )

    val FuriaTaala = Blessing(
        name = "Furia Taala",
        icon = "",
        power = 26,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "36 metrów",
        componentName = "poroże jelenia olbrzymiego",
        componentPower = 3,
        duration = "chwilowy",
        description = "Kapłan prosi Króla Bogów, żeby okazał swój gniew. Wybrana postać w zasięgu zaklęcia otrzymuje 1k10 trafień z Silą 4 (magicznych pocisków). Taal manifestuje swoją moc, wykorzystując naturalne środowisko, lecz zazwyczaj jest to błyskawica z nieba, rozwierająca się ziemia, nagły przybór wody lub ożywające drzewa."
    )

}

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////// DZIEDZINA ULRYKA //////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////

object UlricDomain {

    // SCIEZKA GLOWNA - ULRYK ŚNIEŻNY KRÓL

    val ZimowyChłód = Blessing(
        name = "Zimowy chłód",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "kłębek zwierzęcej sierści",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Kapłan zaczyna emanować przenikającym do szpiku kości zimnem. W trakcie trwania czaru wszystkie atakujące go postacie otrzymują modyfikator -10 do Walki Wręcz."
    )

    val Odmrożenia = Blessing(
        name = "Odmrożenia",
        icon = "",
        power = 9,
        timeToCast = CastingTime.AKCJA,
        range = "24 metry",
        componentName = "bryła zmrożonej krwi",
        componentPower = 1,
        duration = "chwilowy",
        description = "Kapłan modli się do Ulryka, aby zmroził ciało i krew przeciwnika. Wskazana postać traci 1k10 punktów Żywotności (bez uwzględnienia pancerza i Wytrzymałości) i musi wykonać test Odporności. Nieudany test oznacza, że w następnej rundzie nie może podejmować żadnych akcji (z wyjątkiem defensywnych, uniku i tym podobnych)."
    )

    val Sopel = Blessing(
        name = "Sopel",
        icon = "",
        power = 13,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "osobisty",
        componentName = "garść wilczego sadła",
        componentPower = 2,
        duration = "liczba dni równa wartości Magii",
        description = "Słowa kapłana sprawiają, że przenika go ziąb, a skóra pokrywa się szronem. Staje się odporny na mróz i zimno. To zaklęcie można rzucić tylko raz dziennie (niezależnie od wyniku rzutu)."
    )

    val LodowaZamieć = Blessing(
        name = "Lodowa zamieć",
        icon = "",
        power = 20,
        timeToCast = CastingTime.AKCJA,
        range = "24 metry",
        componentName = "sopel lodu",
        componentPower = 2,
        duration = "1 runda",
        description = "Kapłan przyzywa gwałtowną burzę, która miota na wszystkie strony lodowymi odłamkami. Magiczna chmura formuje się w dowolnym miejscu w odległości do 24 metrów. Wszystkie postacie, znajdujące się w promieniu 5 metrów wokół wskazanego miejsca, otrzymują trafienie z Siłą 5 i muszą wykonać test Siły Woli. Nieudany test oznacza ogłuszenie na jedną rundę."
    )

    val PrawoŚnieżnegoKróla = Blessing(
        name = "Prawo Śnieżnego Króla",
        icon = "",
        power = 21,
        timeToCast = CastingTime.PIEC_AKCJI,
        range = "12 metrów",
        componentName = "topór najlepszej jakości",
        componentPower = 3,
        duration = "liczba rund równa wartości Magii",
        description = "Kapłan wykrzykuje modlitwę, a w jej pogardliwych słowach da się wyczuć nienawiść Ulryka do słabeuszy i ludzi pozbawionych honoru. Wybrana postać w zasięgu zaklęcia nagle zostaje spowita srebrnym, lodowym płomieniem i otrzymuje jedno trafienie z Siłą 8 w każdej rundzie (bez uwzględnienia pancerza). Wierni wyznawcy Ulryka, a także odważne i honorowe istoty są odporni na efekt tego zaklęcia."
    )

    // SCIEZKA DRUGA - ULRYK BIAŁY WILK

    val BitewnyZzał = Blessing(
        name = "Bitewny szał",
        icon = "",
        power = 7,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "osobisty",
        componentName = "odrobina świeżej krwi",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii kapłana",
        description = "W kapłana wstępuje duch Ulryka, wzbudzając w nim żądzę krwi. W trakcie trwania czaru kapłan otrzymuje +1 do Ataków, ale zawsze musi atakować najbliższego przeciwnika (wykonując \"szarżę\", \"szaleńczy atak\" lub \"atak wielokrotny\") i nie może uciekać ani wykonywać akcji \"odwrót\"."
    )

    val WilczyZew = Blessing(
        name = "Wilczy zew",
        icon = "",
        power = 11,
        timeToCast = CastingTime.AKCJA,
        range = "24 metry",
        componentName = "język wilka",
        componentPower = 2,
        duration = "1 runda",
        description = "Kapłan wyje niczym jeden z wilków Ulryka, wzbudzając w towarzyszach żądzę mordu. W trakcie trwania czaru wszyscy towarzysze kapłana w promieniu 24 metrów wokół niego mogą atakować dwukrotnie w czasie \"szarży\", niezależnie od posiadanej liczby Ataków."
    )

    val DarUlryka = Blessing(
        name = "Dar Ulryka",
        icon = "",
        power = 15,
        timeToCast = CastingTime.TRZY_AKCJE,
        range = "dotyk",
        componentName = "topór",
        componentPower = 2,
        duration = "1 godzina",
        description = "Zadowolony ze swego kapłana Ulryk obdarza jednego z jego towarzyszy silą i odwagą godną berserkera. W trakcie trwania czaru postać, która stała się jego celem, jest traktowana, jakby posiadała zdolność szał bojowy. Jest to czar dotykowy. Kapłan nie może go rzucić na siebie."
    )

    val WilczeSerce = Blessing(
        name = "Wilcze serce",
        icon = "",
        power = 18,
        timeToCast = CastingTime.TRZY_AKCJE,
        range = "osobisty",
        componentName = "serce wilka",
        componentPower = 2,
        duration = "1 minuta (6 rund)",
        description = "Kapłan wzywa moc Ulryka, który napełnia bitewnym duchem towarzyszy kapłana. W trakcie trwania czaru są odporni na Strach i Grozę oraz na efekty umiejętności zastraszanie i zdolności niepokojący."
    )

    // SCIEZKA TRZECIA - ULRYK KRWAWA DŁOŃ

    val PogardaDlaSłabych = Blessing(
        name = "Pogarda dla słabych",
        icon = "",
        power = 10,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "osobisty",
        componentName = "złamany wilczy pazur",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Pełna zjadliwych słów modlitwa wzbudza w kapłanie pogardę boga zimy dla słabeuszy i tchórzy. Raz w rundzie może przerzucić wynik jednego nieudanego ataku przeciwko pojedynczej postaci."
    )

    val Wataha = Blessing(
        name = "Wataha",
        icon = "",
        power = 11,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "24 metry",
        componentName = "mały róg wykonany z kości wilka",
        componentPower = 2,
        duration = "1 minuta (6 rund)",
        description = "Kapłan wyciem zanosi gniewne modły do Ulryka, a jego towarzysze ledwo mogą opanować furię. Wszyscy w zasięgu zaklęcia zyskują zdolność niepokojący."
    )

    val NieposkromionyZzał = Blessing(
        name = "Nieposkromiony szał",
        icon = "",
        power = 21,
        timeToCast = CastingTime.TRZY_AKCJE,
        range = "36 metrów",
        componentName = "łapa zdechłego wilczka",
        componentPower = 3,
        duration = "1 minuta (6 rund)",
        description = "Kapłan rykiem obwieszcza oddanie bogu wojny, a wierni wyznawcy reagują na zew. Wszyscy sojusznicy w zasięgu zaklęcia otrzymują +1 do Ataków i wykonują \"atak wielokrotny\", poświęcając pojedynczą akcję. Nadal obowiązuje ograniczenie jednego ataku w rundzie."
    )

}

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////// DZIEDZINA VERENY //////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////

object VerenaDomain {

    // SCIEZKA GLOWNA - VERENA SPRAWIEDLIWA

    val KajdanyVereny = Blessing(
        name = "Kajdany Vereny",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "zasięg wzroku",
        componentName = "żelazne kajdany",
        componentPower = 1,
        duration = "do rozerwania więzów",
        description = "Czar tworzy niewidzialne kajdany, które unieruchamiają dowolną postać w zasięgu wzroku kapłana. Ofiara może odeprzeć czar wykonując udany test Siły Woli. Nieudany test oznacza, że jest traktowana jako bezbronna. Nie może wykonywać żadnych akcji, za wyjątkiem próby rozerwania więzów (przeciwstawny test Krzepy i splatania magii kapłana)."
    )

    val WetZaWet = Blessing(
        name = "Wet za wet",
        icon = "",
        power = 13,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "osobisty",
        componentName = "srebrna waga szalkowa",
        componentPower = 2,
        duration = "1 minuta (6 rund) albo do aktywacji",
        description = "Kapłan prosi Verenę, aby wymierzyła sprawiedliwość tym, którzy go skrzywdzili. Jeśli w trakcie rzucania czaru albo najdalej minutę wcześniej, padł ofiarą przestępstwa, jego sprawca pada ofiarą takiego samego przestępstwa. Jeśli kapłan złamie prawo, również padnie ofiarą tego zaklęcia."
    )

    val KaraBoga = Blessing(
        name = "Kara boża",
        icon = "",
        power = 14,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "24 metry",
        componentName = "kropla krwi ofiary wskazanego przestępcy",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii",
        description = "Kapłan odmawia modlitwę Słusznej Kary i winny przestępstwa zostaje ukarany przez Verenę. Kapłan musi wiedzieć, że wskazana osoba naprawdę popełniła zbrodnię. Ofiara musi wykonać udany Trudny (-20) test Siły Woli, w przeciwnym razie doświadcza paraliżującego bólu, który pozwala jej na wykonywanie tylko jednej akcji w rundzie."
    )

    val SądNadŁotrem = Blessing(
        name = "Sąd nad łotrem",
        icon = "",
        power = 17,
        timeToCast = CastingTime.TURA,
        range = "dotyk",
        componentName = "kropla krwi ofiary wskazanego przestępcy",
        componentPower = 2,
        duration = "liczba dni równa wartości Magii (do przyznania się)",
        description = "Kapłan formalnie oskarża wskazaną osobę o popełnienie przestępstwa i jeśli jest winna, cierpi katusze, dopóki się nie przyzna. Jeśli rzeczywiście jest winna, co godzinę musi wykonać test Odporności. Nieudany test oznacza wymiotowanie/mdłości i zmniejszenie wszystkich cech głównych o 10 punktów na godzinę. Przyznanie się odpowiednim władzom przerywa działanie zaklęcia."
    )

    val MieczSprawiedliwości = Blessing(
        name = "Miecz sprawiedliwości",
        icon = "",
        power = 18,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "amulet z wygrawerowaną wagą",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Gdy zawodzą inne możliwości, tylko surowa kara może przywrócić poczucie sprawiedliwości. W trakcie trwania czaru miecz kapłana staje się narzędziem Vereny. Jest traktowany jako broń magiczna z cechą oręża \"precyzyjny\". Kapłan otrzymuje dodatkowo modyfikator +10 do Walki Wręcz, gdy tą bronią atakuje winnego popełnionej zbrodni."
    )

    val PróbaOgnia = Blessing(
        name = "Próba ognia",
        icon = "",
        power = 18,
        timeToCast = CastingTime.TURA,
        range = "12 metrów",
        componentName = "opal ognisty o wartości przynajmniej 50 zk",
        componentPower = 2,
        duration = "liczba rund równa wartości Magii kapłana",
        description = "Kapłan poddaje ostatecznej próbie dowolną postać. Wypowiada oskarżenie, a przyzwana moc ogarnia płomieniem wskazaną postać. Jeśli jest niewinna, po jednej rundzie płomienie gasną, nie raniąc postaci. W przeciwnym przypadku płonąca postać co rundę otrzymuje trafienie z Siłą 8. Jest to potężny czar używany tylko wobec największych zbrodniarzy."
    )

    // SCIEZKA DRUGA - VERENA OSĄDZAJĄCA

    val WizjaPrzeszłości = Blessing(
        name = "Wizja przeszłości",
        icon = "",
        power = 8,
        timeToCast = CastingTime.TURA,
        range = "dotyk",
        componentName = "oczy sowy",
        componentPower = 1,
        duration = "chwilowy",
        description = "Kapłan koncentruje się i dotyka przedmiotu, próbując poznać jego historię. Może dowiedzieć się o trzech najważniejszych zdarzeniach należących do historii przedmiotu. Zwykle są to informacje dotyczące osoby, która wykonała przedmiot, jego najważniejszych właścicieli lub znaczących wydarzeń, podczas których został użyty. Ponowne rzucenie tego czaru na ten sam przedmiot nie przynosi żadnego efektu."
    )

    val Prawdomówność = Blessing(
        name = "Prawdomówność",
        icon = "",
        power = 13,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "zasięg głosu",
        componentName = "zwierciadło",
        componentPower = 2,
        duration = "chwilowy",
        description = "Kapłan zadaje jedno pytanie wybranej postaci. Postać może odeprzeć czar wykonując udany test Siły Woli. Nieudany test oznacza, że musi zgodnie z prawdą odpowiedzieć na zadane pytanie (zgodnie ze stanem swojej wiedzy i przekonaniami). Kapłan może rzucić ten czar po raz kolejny na tę samą postać, ale nie może zadać takiego samego pytania - kolejne musi się znacząco różnić."
    )

    val Podsłuchiwanie = Blessing(
        name = "Podsłuchiwanie",
        icon = "",
        power = 15,
        timeToCast = CastingTime.TURA,
        range = "zasięg wzroku",
        componentName = "tuba przyłożona do ucha",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii kapłana",
        description = "Dzięki mocy Vereny kapłan może podsłuchać wszystko, co dzieje się w dowolnie wybranym miejscu w zasięgu jego wzroku. W trakcie trwania czaru słyszy wszystkie dźwięki i odgłosy tak wyraźnie, jakby stał we wskazanym miejscu."
    )

    // SCIEZKA TRZECIA - VERENA MĄDRA

    val VerenaMiŚwiadkiem = Blessing(
        name = "Verena mi świadkiem",
        icon = "",
        power = 14,
        timeToCast = CastingTime.NATYCHMIAST,
        range = "osobisty",
        componentName = "święty symbol Vereny",
        componentPower = 2,
        duration = "liczba rund równa wartości Magii",
        description = "Wystarczy, że kapłan rozpocznie zdanie słowami \"Verena mi świadkiem\", żeby prawdziwość jego wypowiedzi była oczywista dla wszystkich słuchających. Dopóki mówi prawdę, otrzymuje modyfikator +10 do testów przekonywania, podwajając liczbę osób, które ulegają jego wpływowi."
    )

    val ŚlepaDziewica = Blessing(
        name = "Ślepa dziewica",
        icon = "",
        power = 16,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "jedwabna przepaska założona na oczy",
        componentPower = 2,
        duration = "liczba rund równa wartości Magii",
        description = "Modlitwa kapłana umożliwia mu dostrzeżenie prawdy, nawet najlepiej ukrytej. Udany test Inteligencji pozwoli wykryć fałsz w słowach rozmówcy. Udany test Spostrzegawczości pozwala przejrzeć wszelkie iluzje i charakteryzacje, a także dostrzec ukrywające się postacie lub przedmioty. Po rzuceniu kapłan widzi przez opaskę, jakby jej tam nie było."
    )

    val MądrośćSowy = Blessing(
        name = "Mądrość sowy",
        icon = "",
        power = 17,
        timeToCast = CastingTime.TURA,
        range = "osobisty",
        componentName = "czaszka sowy",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii (do przerzutu)",
        description = "Słowa modlitwy napełniają kapłana mądrością jego bogini. W trakcie trwania czaru każdy poziom sukcesu w udanym teście Inteligencji liczy się podwójnie. Kapłan może też przerzucić jeden nieudany test Inteligencji, co natychmiast kończy działanie zaklęcia."
    )

}

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////// DZIEDZINA GUNNDREDA ///////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////

object GunndreDomain {

    val PrzerazajaceSpoJrzenie = Blessing(
        name = "Przerażające spojrzenie",
        icon = "",
        power = 4,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "12 metrów",
        componentName = "maska przedstawiająca trupie oblicze",
        componentPower = 1,
        duration = "natychmiastowy",
        description = "Kapłan wbija wzrok w wybraną postać i odmawia modlitwę. Cel zaklęcia musi natychmiast wykonać test Strachu."
    )

    val BolesneCiosy = Blessing(
        name = "Bolesne ciosy",
        icon = "",
        power = 8,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "laga",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii",
        description = "Ciosy kapłana są o wiele boleśniejsze niż normalnie. Nie powodują większych obrażeń, ale za to wywołują potworny ból. Każdy trafiony w walce wręcz przeciwnik, w następnej rundzie otrzymuje modyfikator -10 do wszystkich testów ze względu na ból. Zaklęcie jest przeważnie używane przeciwko obezwładnionym ofiarom. Jest nieskuteczne w walce z demonami i ożywieńcami."
    )

    val PlaszczBydlokrada = Blessing(
        name = "Płaszcz bydłokrada",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "60 metrów",
        componentName = "gruby, wytłumiający filc",
        componentPower = 2,
        duration = "1 godzina",
        description = "Modlitwa kapłana pozwala mu objąć działaniem testów ukrywania się i skradania towarzyszącą mu grupę ludzi (lub istot podobnej wielkości), a także większych zwierząt, jak konie lub bydło. Za każdy punkt Magii kapłan może objąć działaniem zaklęcia do dziesięciu ludzi i dwudziestu zwierząt wielkości konia lub krosnty bądź dwukrotnie więcej mniejszych zwierząt (wielkości kozy lub owcy)."
    )

    val PrzerazajacyCios = Blessing(
        name = "Przerażający cios",
        icon = "",
        power = 14,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "kropla własnej krwi",
        componentPower = 2,
        duration = "1 minuta (6 rund)",
        description = "W trakcie trwania zaklęcia każda zraniona przez kapłana istota (straciła co najmniej 1 punkt Żywotności) musi wykonać test Grozy."
    )

    val PrzerazajaceOblicze = Blessing(
        name = "Przerażające oblicze",
        icon = "",
        power = 17,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "osobisty",
        componentName = "część ciała ofiary",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii",
        description = "Modlitwa kapłana zapewnia mu zdolność straszny."
    )

    val StrefaGrozy = Blessing(
        name = "Strefa grozy",
        icon = "",
        power = 20,
        timeToCast = CastingTime.AKCJA,
        range = "48 metrów",
        componentName = "bicz",
        componentPower = 2,
        duration = "natychmiastowy",
        description = "Modlitwa kapłana napełnia ogromnym lękiem grupę postaci, które w trakcie panicznej ucieczki nie zważają na nic i odnoszą rany. Kapłan wskazuje dowolne miejsce w zasięgu zaklęcia. Każda postać w promieniu pięciu metrów od tego punktu musi wykonać test Grozy. Nieudany test oznacza, oprócz normalnych konsekwencji, także automatyczne trafienie z Siłą 4."
    )
}

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////// DZIEDZINA HÄNDRICHA ///////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////

object HandrichDomain {

    val PokstanieKupca = Blessing(
        name = "Pozyskanie kupca",
        icon = "",
        power = 9,
        timeToCast = CastingTime.TURA,
        range = "osobisty",
        componentName = "10% wartości transakcji, minimum 5zk",
        componentPower = 2,
        duration = "liczba godzin równa wartości Magii",
        description = "Kapłan umawia się z bogiem, żeby znaleźć miejscowego kupca, który będzie chętny do zawarcia transakcji. W trakcie trwania zaklęcia otrzymuje modyfikator +20 do testów plotkowania w celu określenia Dostępności."
    )

    val DobraOpinia = Blessing(
        name = "Dobra opinia",
        icon = "",
        power = 10,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "24 metry",
        componentName = "5zk",
        componentPower = 1,
        duration = "(liczba minut równa wartości Magii) x 10",
        description = "Żarliwa modlitwa sprawia, że znajomi kapłana, a nie jego konkurenci, mówią o nim wyłącznie pozytywnie. Wszystkie postacie w zasięgu przedstawiają w dobrym świetle dotychczasowe kontakty z nim, nawet jeśli były bardzo złe. W trakcie trwania zaklęcia kapłan otrzymuje modyfikator +20 do testów Ogłady w kontaktach z osobami, które zasłyszały te pozytywne opinie."
    )

    val MowaJestSrebrem = Blessing(
        name = "Mowa jest srebrem",
        icon = "",
        power = 11,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "10% wartości transakcji, minimum 10zk",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii",
        description = "Kapłan cicho odmawia modlitwę do boga kupców i wszystkie transakcje układają się po jego myśli. Otrzymuje modyfikator +10 do testów targowania i podwaja liczbę uzyskanych poziomów sukcesu."
    )

    val NastawienieNaZysk = Blessing(
        name = "Nastawienie na zysk",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "osobisty",
        componentName = "5% wartości wycenianych towarów, minimum 3zk",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii",
        description = "Kapłan modli się do Händricha, żeby pomógł mu w oszacowaniu wartości danego towaru. Otrzymuje modyfikator +20 do testów wyceny i podwaja liczbę uzyskanych poziomów sukcesu."
    )

    val OplaconeLojalnosc = Blessing(
        name = "Opłacona lojalność",
        icon = "",
        power = 16,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "20% wartości transakcji",
        componentPower = 2,
        duration = "patrz opis",
        description = "Kapłan prosi Händricha, żeby pobłogosławił transakcję i zobowiązał wszystkie strony do dochowania jej warunków. Żeby się wycofać, postać musi wykonać udany test Siły Woli. Nieudany test oznacza, że zrobi wszystko, co w jej mocy, żeby dotrzymać zobowiązania. Jeśli nawet wykona udany test i złamie dane słowo, otrzyma modyfikator -10 do testów przekonywania, targowania i wyceny przez tydzień liczony od następnego Dnia Targowego."
    )

    val CzasTooPieniadz = Blessing(
        name = "Czas to pieniądz",
        icon = "",
        power = 19,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "10% wartości długu",
        componentPower = 2,
        duration = "patrz opis",
        description = "Kapłan próbuje ubłagać Händricha, żeby nie karał go za niespłacenie należnego mu długu, przekonując, że im dłużej zajmie kapłanowi spłata długu, tym więcej zarobi bóg. Udane rzucenie zaklęcia powoduje, że spłata długu zostaje odroczona o tydzień (do następnego Dnia Targowego). Nieudane rzucenie zaklęcia powoduje, że dług zostaje podwojony, a kapłana natychmiast dopada klątwa boga kupców."
    )
}

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////// DZIEDZINA KHAINA //////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////

object KhainDomain {

    val SztyletKhaina = Blessing(
        name = "Sztylet Khaina",
        icon = "",
        power = 5,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "palec zamordowanego człowieka",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Kapłan odmawia modlitwę i nasącza sztylet khainową żądzą krwi. Broń jest traktowana jako magiczna z cechą oręża \"precyzyjny\"."
    )

    val UkryteOstrze = Blessing(
        name = "Ukryte ostrze",
        icon = "",
        power = 7,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "zmiażdżony ogon skorpiona",
        componentPower = 1,
        duration = "natychmiastowy",
        description = "Kapłan odmawia modlitwę, patrząc przeciwnikowi w oczy i odwracając jego uwagę od prawdziwego zagrożenia. Nagle z niespodziewanej strony uderza ręka uzbrojona w sztylet, która wygląda jak ręka kapłana, choć to przecież niemożliwe. W akcji natychmiastowej kapłan wykonuje test Walki Wręcz. Udany test oznacza automatyczne trafienie z Siłą kapłana, tak jakby zaatakował bronią z cechą oręża \"precyzyjny\"."
    )

    val KolecSkorpiona = Blessing(
        name = "Kolec skorpiona",
        icon = "",
        power = 9,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "fiolka z jadem skorpiona",
        componentPower = 1,
        duration = "liczba rund równa wartości Magii",
        description = "Kapłan zaklina w sztylecie zabójczą moc jadu skorpiona. Broń zadaje obrażenia zwiększone o 1, a jeśli atak spowoduje utratę co najmniej 1 punktu Żywotności, ofiara musi wykonać udany test Odporności, w przeciwnym razie traci dodatkowo tyle punktów Żywotności, ile wynosi Magia kapłana."
    )

    val KrwawaDlon = Blessing(
        name = "Krwawa dłoń",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "fiolka z krwią zamordowanego człowieka",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii",
        description = "Kapłan odmawia modlitwę do Księcia Skorpionów, a po chwili jego dłonie ociekają krwią. Został wybrańcem Khaina. W walce dłonie kapłana pokrywają się krwią zamordowanych ludzi, która ochlapuje przeciwników. Każdy, kto próbuje na niego zaszarżować, musi wykonać udany test Siły Woli. Nieudany test oznacza, że w tej rundzie zmarnował \"szarżę\", w przerażeniu patrząc na krople krwi. Wszystkie istoty, które walczą, otrzymują modyfikator -10 do testów Walki Wręcz i Zręczności, ponieważ instynktownie próbują uniknąć bryzgającej posoki."
    )

    val WiecznaUdreka = Blessing(
        name = "Wieczna udręka",
        icon = "",
        power = 16,
        timeToCast = CastingTime.DZIESIECMINUT,
        range = "dotyk",
        componentName = "nienaruszone serce trupa",
        componentPower = 2,
        duration = "natychmiastowy",
        description = "Kapłan odmawia modły nad ciałem niedawno zmarłej osoby, oddając jej duszę Khainowi. Odtąd jest ona niewrażliwa na moc nekromancji, ale nigdy nie zazna spokoju Morra, ponieważ zostaje odesłana do Mrocznego Królestwa Pana Mordu. Ciało również jest odporne na efekty zaklęć nekromanckich. Podobno dusze oddane Khainowi czasami mogą zostać wezwane, aby służyć jego kapłanom, ale jeśli tak jest w istocie, są to bardzo rzadkie przypadki."
    )

    val PanMordu = Blessing(
        name = "Pan Mordu",
        icon = "",
        power = 20,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "osobisty",
        componentName = "krew istoty o liczbie Ataków równej 5",
        componentPower = 2,
        duration = "patrz opis",
        description = "Kapłan odmawia modły i pozwala, aby napełniła go mordercza potęga Khaina. Otrzymuje +1 do Ataków za każdy punkt Magii i może wykonywać \"atak wielokrotny\" w ramach zwykłej akcji. Jednak dodatkowe ataki może wykonywać tylko sztyletem i nadal obowiązuje go ograniczenie jednej akcji typu \"atak\" w rundzie."
    )
}


////////////////////////////////////////////////////////////////////////////////////////////
// DZIEDZINA DAŻA
////////////////////////////////////////////////////////////////////////////////////////////
object DazhDomain {
    val GoscWDomu = Blessing(
        name = "Gość w domu",
        icon = "",
        power = 5,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "opis",
        componentName = "pergamin z modlitwą do Daża",
        componentPower = 1,
        duration = "patrz opis",
        description = "Kapłan zaklina Daża, aby pobłogosławił jego pobyt w cudzym domu. Jeśli gospodarz użyczył kapłanowi gościnności, Daż rzuca na niego klątwę. Jej rodzaj określa Mistrz Gry, ale może to być nagłe zgaśnięcie paleniska, ogień, który nie daje ciepła, albo drewno, które spala się wyjątkowo szybko. Klątwę można odwrócić w dowolnej chwili przez złożenie solennych przeprosin na ręce gościa, któremu się uchybiło, lub błagając o przebaczenie w świątyni Daża."
    )

    val RozdmuchanieZaru = Blessing(
        name = "Rozdmuchanie żaru",
        icon = "",
        power = 7,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "2 metry",
        componentName = "bryłka węgla",
        componentPower = 1,
        duration = "natychmiastowy",
        description = "Kapłan odmawia krótką modlitwę, aby uczcić pobłogosławienie Daża na jego żar z węgla, a następnie wznieca dowolny obiekt w zasięgu. Jeśli jest to łatwopalny (wedle uznania Mistrza Gry), natychmiast staje w ogniu."
    )

    val TaniecArari = Blessing(
        name = "Taniec Arari",
        icon = "",
        power = 8,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "5 kilometrów",
        componentName = "pozłacany magnezyn",
        componentPower = 1,
        duration = "liczba godzin równa wartości Magii",
        description = "Kapłan prosi Daża, aby oświetlił nocne niebo, a bożyszcza mu na pomoc żony-wojowniczki, zwane Arari. Niebo na północy rozjaśnia się nienazwanymi kolorami, zmieniającymi się w rytm tańca Arari, a iluminacja ta zapewnia znajdującym się na ziemi postaciom oświetlenie wystarczające do wyraźnego widzenia."
    )

    val Blask = Blessing(
        name = "Blask",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA,
        range = "6 metrów",
        componentName = "święty symbol Daża",
        componentPower = 2,
        duration = "natychmiastowy",
        description = "Modlitwa kapłana skutkuje falą oślepiającego światła. Wszystkie postacie w zasięgu działania czaru muszą wykonać udany test Zręczności, w przeciwnym razie zostają oślepione ogniistą poświatą i przez następne 1k10 rund wykonują testy Walki Wręcz, Umiejętności Strzeleckich, Zręczności oraz spostrzegawczości z modyfikatorem –20. Postacie niewidome i te, które przymknęły oczy, są niewrażliwe na moc tego zaklęcia."
    )

    val OgnistyWieniec = Blessing(
        name = "Ognisty wieniec",
        icon = "",
        power = 13,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "płomieni odlany ze złota",
        componentPower = 2,
        duration = "liczba rund równa wartości Magii",
        description = "Po zakończeniu przez kapłana inkantacji otacza go złota poświata świętego płomienia. Każdy przeciwnik, który próbowałby go zaatakować bronią trzymaną w dłoni, musi wykonać test Siły Woli. Nieudany test oznacza, że oślepiony żarem wstrzymuje rękę (–30 do testu Walki Wręcz). Udany test oznacza, że wykonuje atak z modyfikatorem –10. Kapłan z ognistym wieńcem jest niewrażliwy na ataki wykonane z użyciem systemów ognia."
    )

    val OgnieDaza = Blessing(
        name = "Ognie Daża",
        icon = "",
        power = 14,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "18 metrów",
        componentName = "łapa w topie oprawie",
        componentPower = 2,
        duration = "patrz opis",
        description = "Kapłan błaga Daża, żeby spopielił jego wrogów. Po chwili spomiędzy chmur spada deszcz ognistych mieczy. Każda istota w zasięgu 3 metrów od niego musi wykonać test zręczności Wymagającego o modyfikatorze –10; nieudany test oznacza otrzymanie obrażeń równej premii z Siły b4 z cechą zapalającą. Ponadto wszystkie cegły w zasięgu tracą 1 punkt Żywotności, zostają podpalone."
    )
}
////////////////////////////////////////////////////////////////////////////////////////////
// DZIEDZINA TORA
////////////////////////////////////////////////////////////////////////////////////////////
object TorDomain {
    val FuriaTora = Blessing(
        name = "Furia Tora",
        icon = "",
        power = 6,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "oschał",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii",
        description = "Kapłan prosi Tora, żeby wzmógł jego wojenną sprawność w walce wręcz. Za każdym razem, gdy kapłan rzuca lub obniżenia kapłan wyczuwa 10 na koście, Furia Urlyka wstrzykuje automatycznie bez konieczności przerzutu udany test na trafienie."
    )

    val NadchodzacaBurza = Blessing(
        name = "Nadchodząca burza",
        icon = "",
        power = 9,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "12 metrów",
        componentName = "pergamin z modlitwą do Tora",
        componentPower = 2,
        duration = "liczba minut równa wartości Magii × 5",
        description = "Modlitwa kapłana elektryzuje powietrze i osoby w otoczeniu, przygotowując ich do zbliżającej się walki. Za każdym razem, gdy dowolna postać w zasięgu zaklęcia zostanie zaatakowana, może wykonać test Prostoty (+10) i Siły Woli. Udany test oznacza, że błyskawicznie się otrząsa i może działać normalnie."
    )

    val BlyskawicaTora = Blessing(
        name = "Błyskawica Tora",
        icon = "",
        power = 11,
        timeToCast = CastingTime.AKCJA_PODWOJNA,
        range = "12 metrów",
        componentName = "srebrny symbol pioruna",
        componentPower = 1,
        duration = "natychmiastowy",
        description = "Kapłan prosi Tora, żeby okazał giezm i poraził piorunem wskrzeszonego wroga, zadając obrażenia równe 5 Siły S, które ignorują pancerz. Jeśli przeciwnik ginie, piorun uderza w następny cel w zasięgu do 6 metrów i przechodzi przez kolejne cele, dopóki wszyscy nie przetrwają testu."
    )

    val WojennyGrzmot = Blessing(
        name = "Wojenny grzmot",
        icon = "",
        power = 12,
        timeToCast = CastingTime.AKCJA,
        range = "12 metrów",
        componentName = "srebrny cynyel",
        componentPower = 2,
        duration = "patrz opis",
        description = "Modlitwa kapłana wzmacnia odgłosy polskiej walki. Każdy przeciwnik w zasięgu zaklęcia musi wykonać test Strachu."
    )

    val RozdarcieNiebios = Blessing(
        name = "Rozdarcie niebios",
        icon = "",
        power = 15,
        timeToCast = CastingTime.AKCJA,
        range = "5 kilometrów",
        componentName = "folia z pobłogosławioną deszczówką",
        componentPower = 2,
        duration = "liczba dni równa wartości Magii",
        description = "Kapłan zaklina Tora, aby rozszczepił niebo swoim potężnym toporem. Chmury zbierają się wysoko nad ziemią, a po 1k10 rundach rozpościera się ulewa, śnieżyca, gradobicie lub spada deszcz białych świateł (w zależności od warunków atmosferycznych i pory roku). Jeśli kapłan nie zda testu Krzepy w przeciwnym razie ich Szybkość zostaje zmniejszona o połowę."
    )

    val ZewTora = Blessing(
        name = "Zew Tora",
        icon = "",
        power = 16,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "1.5 kilometra",
        componentName = "święty symbol Tora",
        componentPower = 2,
        duration = "1 runda",
        description = "Kapłan wykrzykuje imię Tora ku niebu, a Tor odpowiada ogłuszającym grzmotem. W następnej rundzie wszystkie Kislevczycy w zasięgu zaklęcia mogą zaatakować dwukrotnie w czasie „szarży”. Jednakże Tor nie lubi, gdy jego wyznawcy zbyt pochopnie sięgają po to zaklęcie. Jeśli kapłan nie uzyska wymaganego poziomu mocy, automatycznie pada ofiarą Gniewu Bożego."
    )
}
////////////////////////////////////////////////////////////////////////////////////////////
// DZIEDZINA URSUNA
////////////////////////////////////////////////////////////////////////////////////////////
object UrsunDomain {
    val SilnyJakNiedzwiedz = Blessing(
        name = "Silny jak niedźwiedź",
        icon = "",
        power = 8,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "żebro niedźwiedzia",
        componentPower = 1,
        duration = "1 minuta (6 rund)",
        description = "Inkantacja napełnia kapłana siłą Ursuna. Otrzymuje modyfikator +10 do testów Krzepy oraz dodatkowy +1k10 (aż do +20) do testów podejmowanych w celu utrzymania lub uniesienia się z chwytu. W czasie trwania efektu kapłan nie czuje bólu ani ran."
    )

    val OjciecNiedzwiedzi = Blessing(
        name = "Ojciec niedźwiedzi",
        icon = "",
        power = 9,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "12 metrów",
        componentName = "kieł niedźwiedzia",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii",
        description = "Słowa modlitwy poruszają serce jednego z pomocników Ursuna. Wybrany niedźwiedź w zasięgu zaklęcia nie będzie atakować, chyba że w obronie życia, a dodatkowo odpowie na pytania kapłana (rozumianego w mowie zwierząt)."
    )

    val RyczacaFuria = Blessing(
        name = "Rycząca furia",
        icon = "",
        power = 9,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "pazur niedźwiedzia",
        componentPower = 1,
        duration = "1 minuta (5 rund)",
        description = "Modlitwa wzbudza w kapłanie nieokiełznaną furię. Zyskuje zdolność szału bojowego, a także modyfikator +10 do testów Siły Woli i Odporności."
    )

    val MocNiedzwiedziaLodowego = Blessing(
        name = "Moc niedźwiedzia lodowego",
        icon = "",
        power = 10,
        timeToCast = CastingTime.AKCJA,
        range = "osobisty",
        componentName = "kieł niedźwiedzia lodowego",
        componentPower = 1,
        duration = "liczba minut równa wartości Magii",
        description = "Kapłan błaga niedźwiedzia lodowego, by wstąpił w niego duch lodowego zwierza. Zyskuje zwiększoną wytrzymałość oraz wrodzone niepokojo i wyostrzone zmysły, a także modyfikator +10 do testów spostrzegawczości."
    )

    val SenZimowy = Blessing(
        name = "Sen zimowy",
        icon = "",
        power = 14,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "12 metrów",
        componentName = "śnieżka",
        componentPower = 2,
        duration = "1k10 rund (za każdy cel)",
        description = "Modlitwa kapłana sprowadza sen zimowy na jego wrogów. Każda postać w promieniu 3 metrów od wskazanego miejsca musi wykonać udany test Siły Woli, w przeciwnym razie zapada w sen."
    )

    val NiesustepIowoscUrsuna = Blessing(
        name = "Nieuprępliwość Ursuna",
        icon = "",
        power = 21,
        timeToCast = CastingTime.DWIE_AKCJE_PODWOJNE,
        range = "36 metrów",
        componentName = "czaszka niedźwiedzia lodowego",
        componentPower = 3,
        duration = "1 minuta (6 rund)",
        description = "Zaklęcie wzmacnia wolę walki i poczucie narodowej dumy. Wyższy Kislevczycy w zasięgu zaklęcia zyskują zdolność wrodzonej nieustępliwości."
    )
}
