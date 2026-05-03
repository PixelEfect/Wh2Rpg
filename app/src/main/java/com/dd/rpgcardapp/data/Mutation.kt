package com.dd.rpgcardapp.data

enum class MutationType {
    SINGLE, // pojedyncza
    MULTIPLE // wielokrotna
}
data class StatModifiers(
    val ww: IntRange = 0..0,
    val us: IntRange = 0..0,
    val k: IntRange = 0..0,
    val odp: IntRange = 0..0,
    val zr: IntRange = 0..0,
    val int: IntRange = 0..0,
    val sw: IntRange = 0..0,
    val ogd: IntRange = 0..0,
    val a: IntRange = 0..0,
    val zyw: IntRange = 0..0,
    val mag: IntRange = 0..0,
    val sz: IntRange = 0..0
)
enum class MutationTag {
    PHYSICAL,
    MENTAL,
    CHAOS,
    BENEFICIAL,
    DETRIMENTAL,
    COSMETIC,
    DANGEROUS,
    NURGLE,
    TZEENTCH,
    SLAANESH,
    KHORNE
}
data class MutationVariant(
    val range: IntRange, // np. 1..25
    val name: String,
    val description: String = "",
    val statModifiers: StatModifiers = StatModifiers(),
    val subvariants: List<MutationSubvariant> = emptyList()
)
data class MutationSubvariant(
    val range: IntRange,
    val name: String,
    val description: String = "",
    val statModifiers: StatModifiers = StatModifiers()
)
data class Mutation(
    val name: String,
    val range: IntRange,
    val fearPoints: Int,
    val type: MutationType,
    val maxLevel: Int = 1,
    val description: String,

    val statModifiers: StatModifiers = StatModifiers(),

    val variants: List<MutationVariant> = emptyList(),
    val variants2: List<MutationVariant> = emptyList(),

    val tags: List<MutationTag> = emptyList(),

    val imagePath: String? = null // opcjonalna grafika
)

/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
////////////////////////         MUTACJE          ///////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
object Mutations {

    val Albinos = Mutation(
        name = "Albinos",
        range = 1..5,
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Twoja skóra staje się mlecznobiała, a oczy czerwone. Tracisz k10 punktów Odporności i otrzymujesz modyfikator -5 do testów spostrzegawczości związanych ze wzrokiem, wykonywanych w jasnym świetle.",
        statModifiers = StatModifiers(
            odp = -1..-10,
        ),
        tags = listOf(
            MutationTag.COSMETIC,
        ),
    )

    val Atrofia = Mutation(
        name = "Atrofia",
        range = 6..10,
        fearPoints = 0,
        type = MutationType.MULTIPLE,
        maxLevel = 5,
        description = "Jedna z części twojego ciała obumiera i kurczy się w zastraszająco szybkim tempie. Należy wykonać rzut 1k100 i sprawdzić w tabeli, który fragment twojego ciała stał się bezużyteczny. Za każdym razem, kiedy wylosujesz tę mutację, musisz od nowa wykonać rzut i wyznaczyć dotkniętą zanikiem część ciała.",
        variants = listOf(
            MutationVariant(
                range = 1..20,
                name = "Głowa",
                statModifiers = StatModifiers(
                    odp = -1..-10,
                    int = -2.. -20,
                ),
                description = "Twoja głowa kurczy się, a pewna ilość szarej materii mózgu wycieka przez uszy i nos. Tracisz 2k10 punktów Inteligencji oraz 1k10 punktów Odporności."
            ),
            MutationVariant(
                range = 21..60,
                name = "Ramię",
                statModifiers = StatModifiers(
                    odp = -1..-10,
                    zr = -1.. -10,
                ),
                description = "Jedna z twoich rąk kurczy się do rozmiarów uschniętego kikuta. Tracisz 1k10 zręczności i Odporności (osobny rzut). Co więcej, broń trzymanaw tej ręce jest traktowana jak trzymana w słabszej dłoni."
            ),
            MutationVariant(
                range = 61..100,
                name = "Noga",
                statModifiers = StatModifiers(
                    odp = -1..-10,
                    zr = -1.. -10,
                ),
                description = "Jedna z twoich nóg w niewyjaśniony sposób się skraca. Tracisz 1k10 Zręczności i Odporności (osobny rzut), a szybkość spada o połowę zaokrąglając w dół."
            )
        )
    )
    val BestiaOTysiacu = Mutation(
        name = "Bestia o tysiącu...",
        range = 11..15,
        fearPoints = 3,
        type = MutationType.MULTIPLE,
        description = "Twoje ciało wytwarza tysiące rąk, uszu, palców, oczu, sutków lub innych części ciała. Wyrastają z każdego miejsca ciała i nie sposób ich ukryć. Obniżają Ogładę o 2k10.",
        statModifiers = StatModifiers(
            ogd = -2..-20
        ),
        variants = listOf(
            MutationVariant(1..10, "Oczy"),
            MutationVariant(11..20, "Nosy"),
            MutationVariant(21..30, "Uszy"),
            MutationVariant(31..40, "Wrzody"),
            MutationVariant(41..50, "Języki"),
            MutationVariant(51..60, "Sutki"),
            MutationVariant(61..70, "Nogi lub ręce"),
            MutationVariant(71..80, "Stopy lub dłonie"),
            MutationVariant(81..90, "Palce"),
            MutationVariant(91..99, "Odbyty"),
            MutationVariant(100..100, "Twarze"),
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.CHAOS,
            MutationTag.DANGEROUS
        )
    )

    val Bezglowy = Mutation(
        name = "Bezgłowy",
        range = 16..20,
        fearPoints = 1,
        type = MutationType.SINGLE,
        description = "Twoje ciało wchłania głowę do wnętrza. Po kilku chwilach paniki udaje ci się wyjrzeć na świat zewnętrzny, ale zdajesz sobie sprawę, że twarz znajduje się teraz na klatce piersiowej. Choć z grubsza zachowuje dawne rysy, miewasz trudności z rozglądaniem się, dlatego wszystkie testy spostrzegawczości związane ze wzrokiem wykonujesz z modyfikatorem –10. Trafienia w głowę traktowane są jak trafienia w korpus. Co gorsza, założenie pancerza praktycznie cię oślepia, dlatego musisz zamawiać specjalnie dopasowaną zbroję. Zbroja Chaosu automatycznie dostosowuje się do mutacji, co bez wątpienia jest znakiem łaski twoich panów.",
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.DANGEROUS,
            MutationTag.COSMETIC
        )
    )

    val BezpodstawnaNienawisc = Mutation(
        name = "Bezpodstawna nienawiść",
        range = 21..25,
        fearPoints = 0,
        type = MutationType.MULTIPLE,
        description = "Twoim sercem zaczyna targać żarliwa nienawiść. Jej obiekt należy określić, korzystając z tabeli zamieszczonej przy opisie mutacji „Nieuzasadniona fobia”. Jeśli znajdziesz się oko w oko z nienawidzonym obiektem, rzeczą lub osobą, wpadasz w szał bojowy, identyczny z efektem zdolności Szał Bojowy, który trwa do chwili, gdy obiekt zostanie zniszczony, ucieknie lub w inny sposób stracisz z nim kontakt.\n" +
                "Jeżeli napotkasz źródło swej nienawiści i obaw, musisz wykonać test Strachu lub Grozy — tylko w przypadku udanego testu możesz wpaść w szał bojowy.",
        tags = listOf(
            MutationTag.MENTAL,
            MutationTag.DANGEROUS,
            MutationTag.CHAOS
        )
    )

    val Bezrozumny = Mutation(
        name = "Bezrozumny",
        range = 26..30,
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Twój mózg zostaje zastąpiony przez twardy kawałek spaczenia, uniemożliwiający podjęcie jakichkolwiek bardziej złożonych czynności. Istoty o Magii 1 lub większej mocy mogą wydawać ci rozkazy, jednak jesteś zbyt głupi, aby pojąć, o co naprawdę chodzi twojemu panu — jego wolę wypełniasz dosłownie. Choć twoja Inteligencja spada do poziomu 0, nie umierasz, lecz jako istota bezrozumna nie możesz wykonywać żadnych testów Inteligencji. Czas najwyższy pomyśleć o nowym Bohaterze.",
        statModifiers = StatModifiers(
            int = -100..-100
        ),
        tags = listOf(
            MutationTag.MENTAL,
            MutationTag.DANGEROUS
        )
    )

    val Chaosolak = Mutation(
        name = "Chaosolak",
        range = 31..35,
        fearPoints = 2,
        type = MutationType.SINGLE,
        description = "Twoje ciało zmienia się tak, jakby nigdy nie dotknęło go piętno mutacji. Tymczasowo tracisz wszystkie modyfikatory do cech oraz umiejętności i zdolności, jakie były efektem mutacji. Pierwszy nieudany test Siły Woli oznacza, że powracasz do postaci mutanta (włącznie z modyfikatorami do cech). Kolejny nieudany test SW sprawia, że przybierasz „normalną” postać. Jeśli w „normalnej” formie otrzymasz następną mutację, natychmiast przemieniasz się w pomiot Chaosu.",
        tags = listOf(
            MutationTag.CHAOS
        )
    )

    val ChwytnyOgon = Mutation(
        name = "Chwytny ogon",
        range = 36..40,
        fearPoints = 0,
        type = MutationType.MULTIPLE,
        description = "Twoja kość ogonowa rozwija się w pełnych rozmiarów ogon. Jest on na tyle umięśniony i sprawny, że staje się pełnoprawną, chwytną kończyną. Możesz używać go do noszenia różnych rzeczy, a nawet posługiwania się orężem. Za każdym razem, kiedy wylosujesz tę mutację, wyrasta ci kolejny ogon.",
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.BENEFICIAL
        )
    )

    val CielesnaKorona = Mutation(
        name = "Cielesna korona (dziwny wygląd)",
        range = 41..45,
        fearPoints = 1,
        type = MutationType.MULTIPLE,
        description = "Ze skóry wokół twoich skroni wyrasta żywa korona złożona z fragmentów ciała. Aby określić jej dokładny kształt i rodzaj organów, należy wykonać rzut 1k10 i sprawdzić wynik w odpowiedniej tabeli. Organy występują w szczątkowej formie i nie zapewniają żadnych specjalnych zdolności.",
        variants = listOf(
            MutationVariant(1..10, "Języków"),
            MutationVariant(11..20, "Macek"),
            MutationVariant(21..30, "Malutkich rączek"),
            MutationVariant(31..40, "Nosów"),
            MutationVariant(41..50, "Oczu"),
            MutationVariant(51..60, "Palców"),
            MutationVariant(61..70, "Palców stóp"),
            MutationVariant(71..80, "Samych kciuków"),
            MutationVariant(81..90, "Uszu"),
            MutationVariant(91..100, "Warg"),
        ),
        tags = listOf(
            MutationTag.COSMETIC,
            MutationTag.CHAOS
        )
    )

    val Ciernie = Mutation(
        name = "Ciernie",
        range = 46..50, // przykładowy zakres, dostosuj według potrzeb
        fearPoints = 1,
        type = MutationType.SINGLE,
        description = "Przez twoją skórę przebijają się niewielkie ciernie. Wyprowadzając atak bez broni zadajesz obrażenia o S-2. Co dziwniejsze, jeśli odpowiednio napniesz muskuły, jesteś w stanie wystrzelić ciernie w kierunku istoty znajdującej się w zasięgu 10 metrów. Taki atak zajmuje akcję podwójną, wymaga udanego testu US i zadaje obrażenia z Siłą 1.",
        statModifiers = StatModifiers(),
        variants = listOf(
            MutationVariant(
                range = 1..10,
                name = "Zatrucie ciernie",
                description = "10% mutantów dotkniętych tą przemianą wykształca zatrute ciernie. Trafienie jadowitymi kolcami oznacza konieczność wykonania Wymagającego (-10) testu Odporności, którego niepowodzenie oznacza utratę 1k10/2 punktów Odporności, których odzyskanie następuje po uwzględnieniu podniesiena Odporności. Oczywiście mutant jest niewrażliwy na działanie własnej trucizny."
            ),
            MutationVariant(
                range = 11..100,
                name = "Zwykłe ciernie",
            )
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.DANGEROUS
        )
    )

    val CuchnacyDotyk = Mutation(
        name = "Cuchnący dotyk",
        range = 51..55, // przykładowy zakres
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Twoje ręce ustawicznie pokryte są śmierdzącą i lepką wydzieliną. W żaden sposób nie możesz ich domyć, a twój dotyk przenosi chorobę smrodliwych wiatrów (patrz Księga Zasad, str. 141). Zarażenie następuje na skutek spożycia jedzenia, którego dotkniesz gołymi rękami. Jeżeli ktokolwiek będzie spożywał przyrządzony przez ciebie posiłek, musi wykonać test Odporności, którego niepowodzenie oznacza zarażenie się tą chorobą.",
        statModifiers = StatModifiers(),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.DETRIMENTAL,
            MutationTag.NURGLE
        )
    )

    val CzarnaSkora = Mutation(
        name = "Czarna skóra",
        range = 56..60, // przykładowy zakres
        fearPoints = 1,
        type = MutationType.SINGLE,
        description = "Twoja skóra staje się ciemniejsza aż przybiera barwę najczarniejszej smoły. Zdaje się nawet pochłaniać padające na nią światło. Oczy, dla odmiany, zachodzą mętnym bielmem. Tęczówki i źrenice zanikają, a nowy wygląd zapewnia modyfikator +20 do testów ukrywania się.",
        statModifiers = StatModifiers(),
        tags = listOf(
            MutationTag.COSMETIC,
            MutationTag.BENEFICIAL
        )
    )

    val CzworonoznyDwunozny = Mutation(
        name = "Czworonożny/Dwunożny",
        range = 61..65, // przykładowy zakres
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Jeżeli byłeś istotą dwunożną, twoje dwie przednie kończyny (i tylko dwie, jeśli masz ich więcej, reszta nie ulega mutacji), stają się łapami (+2 do Szybkości). Jeżeli do tej pory byłeś istotą czworonożną, dwie przednie łapy przekształcają się w kończyny górne (-2 do Szybkości). Co więcej, jeśli stajesz się istotą czworonożną, zmniejszasz wartość cechy US do 0 i nie możesz używać żadnych broni, chyba że posiadasz dodatkowe ręce lub macki. Jeśli byłeś do tej pory istotą czworonożną i wykształciłeś ręce, zyskujesz umiejętność korzystania z broni oraz cechy US w wysokości 10+1k10. Za każdym razem, kiedy dotknię cię ta mutacja, zmieniasz sposób poruszania się. Z istoty dwunożnej stajesz się czworonożną, potem dwunożną, i tak na zmianę.",
        statModifiers = StatModifiers(
            sz = 2..2,
        ),
        tags = listOf(
            MutationTag.PHYSICAL
        )
    )

    val DemonicznyByt = Mutation(
        name = "Demoniczny byt",
        range = 66..70, // przykładowy zakres
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Tracisz łączność ze światem materialnym, przeobrażając się w istotę rodem z Domeny Chaosu. Podobnie jak demony i cały ich rodzaj, można cię wypędzić z tego świata. W każdej rundzie, w której zostaniesz zraniony w walce wręcz lub bronią białą, ale sam nie zadasz żadnych obrażeń, musisz wykonać udany test SW, w przeciwnym wypadku zostaniesz wygnany do Domeny Chaosu, co w zasadzie zakończy twoje istnienie.",
        statModifiers = StatModifiers(),
        tags = listOf(
            MutationTag.CHAOS,
            MutationTag.DANGEROUS,
            MutationTag.DETRIMENTAL
        )
    )

    val DlugaSzyja = Mutation(
        name = "Długa szyja",
        range = 71..75, // przykładowy zakres
        fearPoints = 0,
        type = MutationType.SINGLE,
        maxLevel = 1,
        description = "Twoja szyja niesamowicie się wydłuża, przypominając bardziej zwój liny niż kark. Pomimo tego, że patrzysz na świat z wyższej perspektywy, nie zyskujesz żadnych specjalnych możliwości. Niestety długa i odsłonięta szyja stanowi kuszący cel, dlatego wartość wszystkich trafień krytycznych w głowę zostaje zwiększona o 2.",
        variants = listOf(
            MutationVariant (
                range = 1..10,
                name = "Szyja bez kośćca",
                description = "10% wszyskich mutantów wykształca długą szyję bez kośćca potrzebnego do jej utrzymaniaw pionie. Tacy nieszczęśnicy muszą trzymać głowę za włosy i unosić ją, ilekroć zechcą rozejrzeć się dookoła. Niektórzy nawet ciągną głowę za sobą po ziemi! Taka długa szyja nie stanowi atrakcyjnego celu, więc nie stosuje się dodatkowego modyfikatora trafień krytycznych. Zamiast tego mutant otrzymuje dodatkowy 1 Punkt Strachu.",
            ),
            MutationVariant (
                range = 11..100,
                name = "Normalny wariant",
                description = ""
            )
            ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.DETRIMENTAL
        )
    )
    val DlugiNos = Mutation(
        name = "Długi nos",
        range = 76..80,
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Twój nos staje się dłuższy i większy, aż osiąga rozmiary marchewki lub innego, równie długiego obiektu. Choć wygląda śmiesznie, zyskujesz modyfikator +10 do testów spostrzegawczości związanych ze węchem. Dodatkowo otrzymujesz umiejętność tropienie.",
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.BENEFICIAL
        )
    )

    val DlugieKolce = Mutation(
        name = "Długie kolce",
        range = 81..85,
        fearPoints = 1,
        type = MutationType.SINGLE,
        description = "Przez twoją skórę przebijają się długie kolce, podobne do tych na grzbiecie jeżozwierza. Kiedy walczysz wręcz lub bronią białą, przeciwnicy muszą w każdej rundzie wykonywać udany test Zręczności, w przeciwnym wypadku otrzymują trafienie 2 Siłą 1.",
        statModifiers = StatModifiers(),
        variants = listOf(
            MutationVariant(
                range = 1..10,
                name = "Jadowe kolce",
                description = "U 10% mutantów wykształcają się kolce jadowe. Trafiona nimi postać musi wykonać Wymagający (-10) test Odporności, którego niepowodzenie oznacza śmierć po tylu rundach, ile wynosi Wytrzymałość trafionej istoty. Właściciel kolców jest oczywiście odporny na działanie trucizny."
            ),
            MutationVariant(
                range = 11..100,
                name = "Zwykłe kolce",
            )
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.DANGEROUS
        )
    )

    val DlugieNogi = Mutation(
        name = "Długie nogi",
        range = 86..90,
        fearPoints = 1,
        type = MutationType.SINGLE,
        description = "Twoje nogi wydłużają się, zupełnie jakby stopy chciały uciec od reszty ciała. W czasie zdajesz sobie sprawę, że są one znacznie dłuższe, niż powinny być u normalnego człowieka. Na początku chodzenie sprawia ci pewne trudności, ale kiedy przyzwyczaisz się do nowej sytuacji, zyskujesz +1 do Szybkości.",
        statModifiers = StatModifiers(
            sz = 1..1
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.BENEFICIAL
        )
    )

    val DoGoryNogami = Mutation(
        name = "Do góry nogami",
        range = 91..95,
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Twoje ramiona i nogi zamieniają się miejscami. Nadal jesteś w stanie władać bronią, ale otrzymujesz modyfikator -20 do WW i US przez pierwszy tydzień (50% szans, że ten efekt utrzyma się w następnym tygodniu). Po upływie tego czasu możesz funkcjonować w miarę normalnie. Broń dwuręczna – zarówno dystansowa, jak i biała – może być przez ciebie używana tylko wtedy, kiedy siedzisz.",
        statModifiers = StatModifiers(
            ww = -20..-20,
            us = -20..-20
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.DETRIMENTAL
        )
    )

    val DodatkowaKonczyna = Mutation(
        name = "Dodatkowa kończyna",
        range = 96..105,
        fearPoints = 1,
        type = MutationType.MULTIPLE,
        description = "Twoje ciało będąc pod wrażeniem sprawności, z jaką nim władasz, nagradza cię dodatkową kończyną. Za każdym razem, kiedy wylosujesz tę mutację, wyrasta ci dodatkowa kończyna. Należy wykonać rzut 1k100, aby określić, jaka kończyna wyrasta, oraz kolejny, aby wyznaczyć lokację, gdzie się pojawia.",
        statModifiers = StatModifiers(),
        variants = listOf(
            MutationVariant(
                range = 1..10,
                name = "Lewa ręka",
                description = "Dodatkowa lewa ręka"
            ),
            MutationVariant(
                range = 11..20,
                name = "Prawa ręka",
                description = "Dodatkowa prawa ręka"
            ),
            MutationVariant(
                range = 21..30,
                name = "Lewa noga",
                description = "Dodatkowa lewa noga"
            ),
            MutationVariant(
                range = 31..40,
                name = "Prawa noga",
                description = "Dodatkowa prawa noga"
            ),
            MutationVariant(
                range = 41..50,
                name = "Lewa dłoń",
                description = "Dodatkowa lewa dłoń"
            ),
            MutationVariant(
                range = 51..60,
                name = "Prawa dłoń",
                description = "Dodatkowa prawa dłoń"
            ),
            MutationVariant(
                range = 61..70,
                name = "Lewa stopa",
                description = "Dodatkowa lewa stopa"
            ),
            MutationVariant(
                range = 71..80,
                name = "Prawa stopa",
                description = "Dodatkowa prawa stopa"
            ),
            MutationVariant(
                range = 81..90,
                name = "Wybór gracza",
                description = "Gracz wybiera dodatkową kończynę"
            ),
            MutationVariant(
                range = 91..100,
                name = "Wybór MG",
                description = "Mistrz Gry wybiera dodatkową kończynę"
            )
        ),
        variants2 = listOf(
            MutationVariant(
                range = 1..10,
                name = "Głowa",
                description = "Na głowie"
            ),
            MutationVariant(
                range = 11..20,
                name = "Klatka piersiowa",
                description = "Na klatce piersiowej"
            ),
            MutationVariant(
                range = 21..30,
                name = "Plecy",
                description = "Na plecach"
            ),
            MutationVariant(
                range = 31..40,
                name = "Brzuch",
                description = "Na brzuchu"
            ),
            MutationVariant(
                range = 41..50,
                name = "Biodro",
                description = "Na biodrze"
            ),
            MutationVariant(
                range = 51..60,
                name = "Lędźwie",
                description = "Na lędźwiu"
            ),
            MutationVariant(
                range = 61..70,
                name = "Łokieć",
                description = "Na łokciu"
            ),
            MutationVariant(
                range = 71..80,
                name = "Kolano",
                description = "Na kolanie"
            ),
            MutationVariant(
                range = 81..90,
                name = "Dłoń",
                description = "Na dłoni"
            ),
            MutationVariant(
                range = 91..100,
                name = "Stopa",
                description = "Na stopie"
            )
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.CHAOS
        )
    )

    val DodatkoweOko = Mutation(
        name = "Dodatkowe oko",
        range = 106..110,
        fearPoints = 1,
        type = MutationType.MULTIPLE,
        description = "Pośrodku twojego czoła otwiera się trzecie oko. Jeżeli nosisz zbroję Chaosu, w hełmie powstaje odpowiedni wziernik. W przeciwnym przypadku wszelkie inne hełmy (oprócz skórzanego) i czepce będą ograniczały patrzenie trzecim okiem. Zyskujesz modyfikator +5 do testów spostrzegawczości związanych ze wzrokiem. Wraz z każdą taką mutacją otwiera się kolejne oko, dodając następne +5 do tego typu testów. Jeżeli którekolwiek ze ślepi zostanie zasłonięte, tracisz modyfikator wynikający z jego posiadania.",
        statModifiers = StatModifiers(),
        variants = listOf(
            MutationVariant(
                range = 1..15,
                name = "Głowa",
                subvariants = listOf(
                    MutationSubvariant(1..15, "Policzek"),
                    MutationSubvariant(16..45, "Czoło"),
                    MutationSubvariant(46..57, "Szczęka"),
                    MutationSubvariant(58..68, "Nos"),
                    MutationSubvariant(69..79, "Język"),
                    MutationSubvariant(80..90, "Cięmię"),
                    MutationSubvariant(91..100, "Szyja")
                )
            ),
            MutationVariant(
                range = 16..35,
                name = "Prawa ręka",
                subvariants = listOf(
                    MutationSubvariant(1..20, "Ramię"),
                    MutationSubvariant(21..40, "Przedramię"),
                    MutationSubvariant(41..60, "Dłoń"),
                    MutationSubvariant(61..80, "Wierzch dłoni"),
                    MutationSubvariant(81..100, "Palec")
                )
            ),
            MutationVariant(
                range = 36..55,
                name = "Lewa ręka",
                subvariants = listOf(
                    MutationSubvariant(1..20, "Ramię"),
                    MutationSubvariant(21..40, "Przedramię"),
                    MutationSubvariant(41..60, "Dłoń"),
                    MutationSubvariant(61..80, "Wierzch dłoni"),
                    MutationSubvariant(81..100, "Palec")
                )
            ),
            MutationVariant(
                range = 56..80,
                name = "Korpus",
                subvariants = listOf(
                    MutationSubvariant(1..20, "Klatka piersiowa"),
                    MutationSubvariant(21..40, "Pępek"),
                    MutationSubvariant(41..60, "Podbrzusze"),
                    MutationSubvariant(61..80, "Plecy"),
                    MutationSubvariant(81..100, "Zadek")
                )
            ),
            MutationVariant(
                range = 81..90,
                name = "Prawa noga",
                subvariants = listOf(
                    MutationSubvariant(1..20, "Udo"),
                    MutationSubvariant(21..40, "Kolano lub jego wewnętrzna strona"),
                    MutationSubvariant(41..60, "Łydka"),
                    MutationSubvariant(61..80, "Stopa"),
                    MutationSubvariant(81..100, "Palec u stopy")
                )
            ),
            MutationVariant(
                range = 91..100,
                name = "Lewa noga",
                subvariants = listOf(
                    MutationSubvariant(1..20, "Udo"),
                    MutationSubvariant(21..40, "Kolano lub jego wewnętrzna strona"),
                    MutationSubvariant(41..60, "Łydka"),
                    MutationSubvariant(61..80, "Stopa"),
                    MutationSubvariant(81..100, "Palec u stopy")
                )
            )
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.BENEFICIAL
        )
    )

    val DodatkowePalce = Mutation(
        name = "Dodatkowe palce",
        range = 111..115,
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Na jednej z twoich dłoni lub stóp wyrastają dodatkowe palce. Pojawia się ich 1k10, ale pozostałemu ich doposażeniu w krwawiączkach lub butów nie wywołuje to żadnych dodatkowych efektów.",
        statModifiers = StatModifiers(),
        variants = listOf(
            MutationVariant(
                range = 1..20,
                name = "Lewa dłoń"
            ),
            MutationVariant(
                range = 21..40,
                name = "Prawa dłoń"
            ),
            MutationVariant(
                range = 41..45,
                name = "Obie dłonie"
            ),
            MutationVariant(
                range = 46..65,
                name = "Lewa stopa"
            ),
            MutationVariant(
                range = 66..85,
                name = "Prawa stopa"
            ),
            MutationVariant(
                range = 86..90,
                name = "Obie stopy"
            ),
            MutationVariant(
                range = 91..95,
                name = "Jedna ręka i dłoń"
            ),
            MutationVariant(
                range = 96..100,
                name = "Obie stopy i dłonie"
            )
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.COSMETIC
        )
    )

    val DodatkoweStawy = Mutation(
        name = "Dodatkowe stawy",
        range = 116..120,
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Twoje ciało wykształca dodatkowe kolana, łokcie, albo jedno i drugie. Aby przekonać się, jak dokładnie działa ta mutacja, należy wykonać rzut 1k100 i sprawdzić wynik w tabeli.",
        statModifiers = StatModifiers(
            k = 1..10,
            zr = 1..10
        ),
        variants = listOf(
            MutationVariant(
                range = 1..40,
                name = "Ręce",
                statModifiers = StatModifiers(
                    zr = 1..10
                ),
                description = "+1k10 do Zręczności."
            ),
            MutationVariant(
                range = 41..80,
                name = "Nogi",
                statModifiers = StatModifiers(
                    zr = 1..10,
                    sz = 1.. 1,
                ),
                description = "+1k10 do Zręczności oraz +1 do Szybkości."
            ),
            MutationVariant(
                range = 81..100,
                name = "Ręce i nogi",
                statModifiers = StatModifiers(
                    zr = 2..20,
                    sz = 1.. 1,
                ),
                description = "+2k10 do Zręczności oraz +1 do Szybkości."
            )
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.BENEFICIAL
        )
    )

    val DodatkoweUcho = Mutation(
        name = "Dodatkowe ucho",
        range = 121..125,
        fearPoints = 0,
        type = MutationType.MULTIPLE,
        description = "Na twojej twarzy formuje się zgrubienie skórne, które rośnie i za czasem przekształca się w ucho. Zyskujesz zdolność czy słuch i choć tą mutację możesz być dotknięty wielokrotnie, dodatkowe uszy nie zapewnią dalszych korzyści.",
        statModifiers = StatModifiers(),
        variants = listOf(
            MutationVariant(
                range = 1..10,
                name = "Dodatkowe ucho - inna lokacja",
                description = "Ucho może wyrosnąć na innej części ciała, nie tylko na twarzy. Mistrz Gry może wybrać miejsce, w którym pojawi się nowy organ."
            ),
            MutationVariant(
                range = 11..100,
                name = "Na twarzy"
            )
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.BENEFICIAL,
            MutationTag.COSMETIC
        )
    )

    val DodatkoweUsta = Mutation(
        name = "Dodatkowe usta",
        range = 126..130,
        fearPoints = 1,
        type = MutationType.MULTIPLE,
        description = "To, co z początku wydawało się jedynie lekkim zadrażnieniem, przekształca się z czasem w dodatkowe usta. Choć możesz nimi jeść, to żaden pożytek nie zaspokaja głodu, jako że pożywienie nie trafia do twojego żołądka. Dodatkowo te usta mówią. Także mówisz i gadają, a dzięki temu zyskujesz umiejętność brzuchomówstwo. Choć kolejne mutacje powodują powstanie dodatkowych ust, nie zapewniają one dalszych korzyści.",
        statModifiers = StatModifiers(),
        variants = listOf(
            MutationVariant(
                range = 1..100,
                name = "Dodatkowe usta standardowe",
                description = "Pośród ludu krąży wiele opowieści o mutantach, u których usta wyrastają w najmniej spodziewanych częściach ciała, na przykład na brzuchu tuż po wewnętrznej stronie dłoni. Jest to dowód na brak ograniczeń w złej woli i spaczonej pomysłowości Mrocznych Bogów."
            )
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.CHAOS,
            MutationTag.BENEFICIAL
        )
    )

    val DodatkowyNos = Mutation(
        name = "Dodatkowy nos",
        range = 131..135,
        fearPoints = 0,
        type = MutationType.MULTIPLE,
        description = "Na twojej głowie wyrasta kolejny nos. Możesz dzięki niemu wyczuwać niedostępne zwykłym ludziom wonie i zyskujesz modyfikator +10 do testów spostrzegawczości związanych z węchem.",
        statModifiers = StatModifiers(),
        variants = listOf(
            MutationVariant(
                range = 1..10,
                name = "Dodatkowy nos inna lokacja - MG",
                description = "Choć większość dodatkowych nosów wyrasta na głowie, niekiedy pechowi mutanci wykształcają je na innych częściach ciała, dzięki czemu zmuszeni są wdychać własne, nie zawsze przyjemne zapachy."
            ),
            MutationVariant(
                range = 1..10,
                name = "Standardowa lokacja",
            )
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.BENEFICIAL,
            MutationTag.COSMETIC
        )
    )

    val Drgawki = Mutation(
        name = "Drgawki",
        range = 136..140,
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Całe ciało jest świadkiem gwałtownych zdarzeń, twój umysł próbuje się przed nimi bronić i padasz ofiarą straszliwych ataków padaczki. Po każdym nieudanym teście Strachu lub Grozy musisz wykonać test SW. Nieudany test oznacza wystąpienie gwałtownych drgawek, które uniemożliwiają ci normalne działanie. Aby się opamiętać, musisz wykonać kolejny udany test SW. W przeciwnym wypadku spazmy wstrząsać będą twoim ciałem bez przerwy.",
        statModifiers = StatModifiers(),
        tags = listOf(
            MutationTag.MENTAL,
            MutationTag.DETRIMENTAL,
            MutationTag.DANGEROUS
        )
    )
    val Dziob = Mutation(
        name = "Dziób",
        range = 141..145,
        fearPoints = 1,
        type = MutationType.SINGLE,
        description = "Twoje oblicze ulega potwornemu zniekształceniu, a z masy stwardniałego ciała wokół ust i nosa formuje się podobny do ptasiego dziób. W walce wręcz możesz go używać jak broni, zadając obrażenia z S-1.",
        statModifiers = StatModifiers(),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.DETRIMENTAL
        )
    )

    val DziwnyChod = Mutation(
        name = "Dziwny chód",
        range = 146..150,
        fearPoints = 0,
        type = MutationType.MULTIPLE,
        description = "Zaczynasz chodzić w dziwny sposób. Może tak się dziać za sprawą niekontrolowanych ruchów nogą, zachwianegoho poczucia równowagi lub dlatego, że co krok okręcasz się wokół własnej osi. Zwykle twój chód jest dziwny, a nawet śmieszny. Za każdym razem, kiedy dotyka cię ta mutacja, sposób poruszania się staje się coraz dziwniejszy, a Szybkość spada o 1.",
        statModifiers = StatModifiers(
            sz = -1..-1
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.DETRIMENTAL
        )
    )

    val DziwnyGlos = Mutation(
        name = "Dziwny głos",
        range = 151..155,
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Twój głos się zmienia, co powoduje modyfikator -10 do Ogłady. Brzmienie głosu można określić, rzucając 1k100 i odczytując wynik z poniższej tabeli.",
        statModifiers = StatModifiers(
            ogd = -10..-10
        ),
        variants = listOf(
            MutationVariant(1..10, "Beczący"),
            MutationVariant(11..20, "Dudniący"),
            MutationVariant(21..30, "Głośny"),
            MutationVariant(31..40, "Jęczący"),
            MutationVariant(41..50, "Niepokojąco cichy"),
            MutationVariant(51..60, "Obleśny"),
            MutationVariant(61..70, "Piskliwy"),
            MutationVariant(71..80, "Warczący"),
            MutationVariant(81..90, "Zachrypnięty"),
            MutationVariant(91..100, "Zawodzący")
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.DETRIMENTAL,
            MutationTag.COSMETIC
        )
    )

    val FalszywyDemon = Mutation(
        name = "Fałszywy demon",
        range = 156..160,
        fearPoints = 5,
        type = MutationType.SINGLE,
        description = "Twoje ciało przebiega straszliwy dreszcz, zwiastujący bolesną i potworną przemianę. Kości trzeszczą i zmieniają kształt, skóra na plecach przebiją załąż niepolerowanej skrzydel, a z czoła wyrastają dwa groteskowe rogi. Skórę na nogach pokrywają szkarłatne plamy i bąble, a całe ciało przybiera czerwonawą barwę. Włosy czernieją, aż zyskują kolor smoły. Oczy zaczynają ulić się ogniem, który trawi gałki i nie zamierza zgasnąć. Zanika wszelkie człowieczeństwo, o jakie można by cię podejrzewać, a ty stajesz się istotą rodem z Chaosu... Tak przynajmniej mogłoby się zdawać. Prawda jest taka, że choć przypominasz demona, to pozostajesz tą samą osobą, którą byłeś. Kiedy transformacja się kończy, zyskujesz zdolność latanie (z Szybkością Lotu równą twojej Szybkości) oraz widzenie w ciemności. Dodatkowo zyskujesz mutację \"Rogi\" (patrz str. 56).",
        statModifiers = StatModifiers(),
        variants = listOf(
            MutationVariant(
                range = 1..100,
                name = "Transformacja demoniczna",
                description = "Twój wygląd po mutacji może zależeć od boga Chaosu, któremu służysz. Mistrz Gry może dowolnie zmodyfikować demoniczny wygląd mutacji, aby odpowiadał naturze konkretnego Mrocznego Bóstwa."
            )
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.CHAOS,
            MutationTag.DANGEROUS,
            MutationTag.BENEFICIAL
        )
    )

    val FutroDziwnyWyglad = Mutation(
        name = "Futro (dziwny wygląd)",
        range = 161..165,
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Całe twoje ciało pokrywa gęsta szczecina, zbliżona pod względem długości do kociego futerka. Pomijając towarzyszące noszeniu ubrań uczucie niewygody, nie ma to większego wpływu na twoje życie, choć zaczynasz pomrukiwać w chwilach zadowolenia.",
        statModifiers = StatModifiers(),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.COSMETIC
        )
    )

    val GarbDziwnyWyglad = Mutation(
        name = "Garb (dziwny wygląd)",
        range = 166..170,
        fearPoints = 1,
        type = MutationType.SINGLE,
        description = "Na twoich plecach wyrasta groteskowy garb, który sprawia, że poruszasz się w nienaturalny i niezgrabny sposób. Żaden normalny nancerz – oprócz zbroi Chaosu, która dostosowuje się do wszelkiego rodzaju dziwactw – nie pasuje na ciebie, chyba że zostanie wykonany na specjalne zamówienie, co podwaja jego cenę.",
        statModifiers = StatModifiers(),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.DETRIMENTAL,
            MutationTag.COSMETIC
        )
    )

    val GestaGrzywa = Mutation(
        name = "Gęsta grzywa",
        range = 171..175,
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Twoje włosy zmieniają się w gęstą grzywę, podobną do lwiej lub końskiej. Nie możesz nosić hełmu, chyba że należy do zbroi Chaosu.",
        statModifiers = StatModifiers(),
        variants = listOf(
            MutationVariant(
                range = 1..100,
                name = "Grzywa",
                description = "Niektórzy mutanci wykształcają prawdziwie żywe włosy, które przy okazji krwawią. Z powodu ich wrażliwości mutant zyskuje modyfikator +10 do testów spostrzegawczości związanych ze słuchem (drgania powietrza)."
            )
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.COSMETIC
        )
    )

    val GesteFutro = Mutation(
        name = "Gęste futro",
        range = 176..180,
        fearPoints = 1,
        type = MutationType.SINGLE,
        description = "Twoje ciało porasta gęsta szczecina, zapewniająca 1 Punkt Zbroi na każdej lokacji trafienia.",
        statModifiers = StatModifiers(),
        variants = listOf(
            MutationVariant(
                range = 1..100,
                name = "Futro czarne",
                description = "W większości przypadków futro jest czarne, ale może być także białe, zielone, niebieskie, czerwone lub kodate. W 25% przypadków mutanta porastają tylko kępy sierści. W takim przypadku dla każdej lokacji istnieje 50% szans, że pokryje ją futro. Jeżeli żadna z nich nie pokryje się szczeciną, należy wylosować inną mutację."
            )
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.BENEFICIAL
        )
    )

    val GietkieKonczyny = Mutation(
        name = "Giętkie kończyny",
        range = 181..185,
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Twoje kończyny stają się giętkie i rozciągliwe, mogą sięgnąć na 1k10x2 metrów. Dzięki temu możesz wykonywać ataki bronią białą na dalszą odległość. Ofiarą ataku jest w stanie walczyć, jednak jej udane trafienie oznacza, że cios trafił w twoje wydłużone ręce. Zbroją, którą nosisz, nie ulega wpływowi mutacji i nie zapewnia osłony dla rozciągniętych członków. Jedynym wyjątkiem jest zbroja Chaosu, która chroni nawet wydłużone ręce.",
        statModifiers = StatModifiers(),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.BENEFICIAL
        )
    )

    val Glowonog = Mutation(
        name = "Głowonóg",
        range = 186..190,
        fearPoints = 1,
        type = MutationType.SINGLE,
        description = "Twoje ciało marnieje i zanika, zaś głowa rozrasta się, zupełnie jakby pochłaniała korpus. Organy wewnętrzne przemieszczają się na nowe miejsce, podobnie jak kończyny, które osadzają się w okolicach szyi. Twoje cechy główne pozostają niezmienione, lecz wszystkie trafienia w korpus rozstrzygane są jako uderzenia w głowę.",
        statModifiers = StatModifiers(),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.CHAOS,
            MutationTag.DANGEROUS
        )
    )

    val Glupawy = Mutation(
        name = "Głupawy",
        range = 191..195,
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Twój mózg kurczy się do jednej czwartej poprzedniego rozmiaru i wagi. -2k10 do Inteligencji.",
        statModifiers = StatModifiers(
            int = -2..-20
        ),
        variants = listOf(
            MutationVariant(
                range = 1..100,
                name = "Głupawy",
                description = "W pewnej starej opinii mieszkańców Starego Świata, mutacja ta nie jest tak często spotykana pośród ludzi, jak się powszechnie uważa."
            )
        ),
        tags = listOf(
            MutationTag.MENTAL,
            MutationTag.DETRIMENTAL,
            MutationTag.DANGEROUS
        )
    )
    val GnijaceCialo = Mutation(
        name = "Gnijące ciało",
        range = 196..200,
        fearPoints = 1,
        type = MutationType.MULTIPLE,
        description = "Z początku zauważasz na skórze kilka bolesnych, czerwonych krost. W ciągu kilku minut rozprzestrzeniają się po całym ciele i zaczynają pękać, tworząc głębokie i bolesne rany, z których wycieka podejrzana maź, cuchnąca rozkładem i śmiercią. Stale wyciskasz spod własnej skóry gnijące ciało, pod pokładami którego dostrzegasz kolejne warstwy brudu, ropy i psującej się tkanki. Co gorsza, smród przyciąga roje much, które pragną się pożywić i złożyć jaja. Za każdym razem, kiedy wylosujesz tę mutację, tracisz 1k10 punktów Odporności i Ogłady. Jeżeli wysokość tej pierwszej cechy spadnie do wartości 0 lub mniej, umierasz. Jeżeli twoja Ogłada spadnie do poziomu 0 lub mniej, przemieniasz się w pomiot Chaosu.",
        statModifiers = StatModifiers(
            odp = -1..-10,
            ogd = -1..-10
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.NURGLE,
            MutationTag.DANGEROUS,
            MutationTag.DETRIMENTAL
        )
    )

    val GrzebienKostnyDziwnyWyglad = Mutation(
        name = "Grzebień kostny (dziwny wygląd)",
        range = 201..205,
        fearPoints = 1,
        type = MutationType.SINGLE,
        description = "Niezwykły kostny grzebień przebija się przez skórę na głowie, formując charakterystyczną ozdobę.",
        statModifiers = StatModifiers(),
        variants = listOf(
            MutationVariant(
                range = 1..100,
                name = "Grzebień kostny",
                description = "Nie wszystkie grzebienie muszą być z kości. Spotykano już mutantów z piórami czy fałdami skóry, jak u jaszczurek wabiących swoje samice."
            )
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.COSMETIC
        )
    )

    val Grzybnia = Mutation(
        name = "Grzybnia",
        range = 206..210,
        fearPoints = 1,
        type = MutationType.SINGLE,
        description = "Na twojej skórze tworzą się niewielkie grzybnie. Za każdym razem, kiedy wykonujesz jakiś ruch, wybuchają one chmurą zarodników. Jeżeli zostaniesz raniony, twoje ciało broni się, wypuszczając duszące kłęby żywych nasion. Przeciwnik, którego ogarnie taki obłok, musi wykonać test Odporności. Nieudany test oznacza, że następną akcję nieszczęśnik musi poświęcić na oczyszczenie nosa i oczu. Ożywieńcy oraz inne istoty, które nie oddychają, są niewrażliwe na tę zdolność.",
        statModifiers = StatModifiers(),
        variants = listOf(
            MutationVariant(
                range = 1..100,
                name = "Grzybnia spaczeniowa",
                description = "Około 10% mutantów wykształca spaczeniową grzybinę. Walcząc z mutantem musi wykonać test Odporności, którego niepowodzenie oznacza utratę następnej akcji, tak jak to opisano wyżej. Jeżeli ofiara spaczonej grzybni nie posiada zdolności odporność na Chaos, występuje u niej mutacja (a postać zmienia rasę na mutanta)."
            )
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.NURGLE,
            MutationTag.DANGEROUS
        )
    )

    val Gwozdzioglowy = Mutation(
        name = "Gwoździogłowy",
        range = 211..215,
        fearPoints = 1,
        type = MutationType.SINGLE,
        description = "Twoja głowa maleje do niewielkich rozmiarów, a w rezultacie zmniejsza się także twój mózg (-2k10 do Inteligencji). Ilekroć będziesz chciał podjąć akcję wymagającą myślenia (atak, ucieczka, przejście przez drzwi – czyli niemal każdą), musisz wykonać test Inteligencji. Nieudany test oznacza, że będziesz tylko stał nieruchomo, dłubiąc w nosie i próbując zrozumieć, dlaczego jesteś taki głupi.",
        statModifiers = StatModifiers(
            int = -2..-20
        ),
        tags = listOf(
            MutationTag.MENTAL,
            MutationTag.PHYSICAL,
            MutationTag.DETRIMENTAL,
            MutationTag.DANGEROUS
        )
    )

    val HipnotycznyTrans = Mutation(
        name = "Hipnotyczny trans",
        range = 216..220,
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Kiedy budzisz się w ciężkiej opresji, wpadasz w niezwykły trans. Ilekroć musisz wykonać test Strachu lub Grozy, twój umysł popada w odrętwienie, a ciało bezbiecznie wędruje 1k10x2 metrów w losowym kierunku. W następnej rundzie odzyskujesz możliwość normalnego działania.",
        statModifiers = StatModifiers(),
        tags = listOf(
            MutationTag.MENTAL,
            MutationTag.DETRIMENTAL
        )
    )

    val HipnotyzujaceSpoJrzenie = Mutation(
        name = "Hipnotyzujące spojrzenie",
        range = 221..225,
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Jedno z twoich oczu staje się całkowicie białe. Jego spojrzenie ma hipnotyczny efekt i jeśli poświęcisz akcję podwójną, możesz nim sparaliżować dowolnego przeciwnika w zasięgu 8 metrów. Musi on wykonać test Siły Woli, którego niepowodzenie oznacza, że nie może podjąć żadnej akcji, dopóki trzymasz go pod kontrolą, co rundę poświęcając na to akcję podwójną. W każdej rundzie, nie licząc pierwszej, przeciwnik może wykonać kolejny test SW, aby oswobodzić się spod twojej władzy. Istota, która raz dostała się pod wpływ twojego hipnotyzującego spojrzenia, nie może ponownie znaleźć się pod jego wpływem do końca walki.",
        statModifiers = StatModifiers(),
        tags = listOf(
            MutationTag.MENTAL,
            MutationTag.BENEFICIAL,
            MutationTag.TZEENTCH
        )
    )

    val Jednonogi = Mutation(
        name = "Jednonogi",
        range = 226..230,
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Z zaskoczeniem stwierdzasz, że twoje nogi od dawna palają do siebie nienawiścią. Teraz w jakiś dziwny sposób jedna zdobyła możliwość pozbycia się konkurentki. Przez krótką chwilę twoim ciałem targają spazmy bólu, a w końcu jedna z nóg usycha i obumiera, pozbawiona sił życiowych. Jej przeciwniczka wychodzi ze starcia silniejsza i bardziej żywotna niż poprzednio. Jednak nie możesz normalnie chodzić i biegać, co sprawia, że twoja Szybkość zostaje zmniejszona o połowę (zaokrąglając w dół).",
        statModifiers = StatModifiers(
            sz = -2..-2
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.DETRIMENTAL,
            MutationTag.DANGEROUS
        )
    )

    val Jednooki = Mutation(
        name = "Jednooki",
        range = 231..235,
        fearPoints = 1,
        type = MutationType.SINGLE,
        description = "Twoja twarz zmienia się w masę drgającego mięsa, jednak po chwili niemal odzyskuje dawny wygląd. Niestety jedno z oczu, uwolnione z czaszki, wykorzystuje okazję i na skrzydłach ze skóry odlatuje w siną dal. Drugie oko zajmuje pozycję pośrodku czoła, ponad nosem. Efekt mutacji jest taki, że należy zmniejszyć wartość cechy US o połowę (zaokrąglając w dół).",
        variants = listOf(
            MutationVariant(
                range = 1..10,
                name = "Oko umiejscowione w innym miejcu",
                description = "W 10% przypadków ocalałe oko nie jest umiejscowione pośrodku czoła, ale w innym miejscu twarzy. Jednym z najbardziej fascynujących przykładów jest ślepie umieszczone wewnątrz jamy ustnej."
            ),
            MutationVariant(
                range = 11..100,
                name = "Oko umiejscowione pośrodku czoła",
            ),
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.DETRIMENTAL
        )
    )

    val Kipiele = Mutation(
        name = "Kipiele",
        range = 236..240,
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Kolana, łokcie i inne stawy w twoim ciele pokrywają paskudne, bolesne i wypełnione śmierdzącą ropą wrzody. Otrzymujesz modyfikator -1k10 do Zręczności oraz -2k10 do Odporności.",
        statModifiers = StatModifiers(
            zr = -1..-10,
            odp = -2..-20
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.DETRIMENTAL,
            MutationTag.NURGLE
        )
    )

    val KlujacyJezor = Mutation(
        name = "Kłujący języer",
        range = 241..245,
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Twój język zmienia się w długi, obscenicznie ociekający śliną kolec. Za jego pomocą możesz razić wrogów oddalonych o 2 metry. Jeżeli trafisz przeciwnika, zadajesz obrażenia z własną Siłą. Język posiada cechę oręża \"precyzyjny\".",
        statModifiers = StatModifiers(),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.BENEFICIAL,
            MutationTag.SLAANESH
        )
    )

    val Kly = Mutation(
        name = "Kły",
        range = 246..250,
        fearPoints = 1,
        type = MutationType.SINGLE,
        description = "Twoje kły wydłużają się i stają się ostrzejsze. Od tej pory możesz nimi gryźć w walce wręcz, zadając obrażenia z S-2. Zębiska posiadają cechę oręża \"precyzyjny\".",
                statModifiers = StatModifiers(),
        variants = listOf(
            MutationVariant(
                range = 1..10,
                name = "Kły siekące",
                description = "Zamiast kłów wyrastają siekacze albo drugi rząd zębów. W skrajnych przypadkach mogą to być kły podobne do uchodzenia dzika lub orka, wystające z dolnej szczęki."
            ),
            MutationVariant(
                range = 11..100,
                name = "Standardowy wariant",
            )
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.BENEFICIAL
        )
    )
    val KlyJadowe = Mutation(
        name = "Kły jadowe",
        range = 251..255,
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Twoje kły stają się dłuższe i ostrzejsze, a w ich wnętrzu tworzą się cienkie kanaliki jadowe. W twojej szyi wyrastają dziwne, pulsujące gruczoły, które pompują jad bezpośrednio do kłów. Możesz wykorzystywać je w walce wręcz — po udanym trafieniu zadajesz obrażenia z Siłą pomniejszoną o 2. Kły posiadają cechę oręża „precyzyjny”. Jeżeli ugryzienie spowoduje utratę przynajmniej 1 Punktu Żywotności, wstrzykujesz do organizmu ofiary truciznę. Trafiony przeciwnik musi wykonać Przeciętny (+0) test Odporności. Nieudany test oznacza utratę 1k10/2 Punktów Żywotności, bez uwzględniania pancerza i Wytrzymałości. Zasób jadu odnawia się po 1k10 rundach — dopiero po tym czasie możesz ponownie użyć trucizny.",
        statModifiers = StatModifiers(),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.BENEFICIAL,
            MutationTag.DANGEROUS
        )
    )

    val KolczastyOgon = Mutation(
        name = "Kolczasty ogon",
        range = 256..260,
        fearPoints = 1,
        type = MutationType.SINGLE,
        description = "Z przerażeniem odkrywasz, że wyrósł ci ogon, zakończony ciężką, kolczastą kulą. Możesz nim atakować w walce wręcz, zadając obrażenia oparte na twojej Siłze. Ogon posiada cechę oręża „ogłuszający”.",
        statModifiers = StatModifiers(),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.BENEFICIAL
        )
    )

    val KolorowaSkora = Mutation(
        name = "Kolorowa skóra (dziwny wygląd)",
        range = 261..265,
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Podczas snu twoje ciało obsiadają maleńkie robaczki. Wgryzają się one w głąb skóry i tam, uwięzione pod jej powierzchnią, umierają. Ich ciała pozostają pod skórą i zaczynają świecić dziwnym, nienaturalnym blaskiem. Kolor poświaty zależy od boga Chaosu, któremu służysz. Słudzy Khorna przybierają barwy czerni, czerwieni lub rozżarzonego żelaza. Wyznawcy Slaanesha miewają skórę w delikatnych, pastelowych odcieniach. Mutanci Nurgla mają barwy zgniłych liści i rozkładających się trupów, natomiast Tzeentch nie nadaje swoim niewolnikom jednego charakterystycznego koloru — aby go określić, należy skorzystać z tabeli opisanej w mutacji „Nietypowe ubarwienie” (str. 50). Jeżeli Bohater nie służy żadnemu z bogów Chaosu, kolor wybiera MG.",
        statModifiers = StatModifiers(),
        variants = listOf(
            MutationVariant(1..10, "Jednobarwne cętki"),
            MutationVariant(11..20, "Wielobarwne cętki"),
            MutationVariant(21..30, "Jedno- lub wielobarwne plamy"),
            MutationVariant(31..40, "Ciemne pasy przypominające umaszczenie zebry"),
            MutationVariant(41..50, "Łaty"),
            MutationVariant(51..60, "Zygzaki"),
            MutationVariant(61..70, "Tygrysie pasy"),
            MutationVariant(71..80, "Plamy kamuflujące (nie zapewniają modyfikatora do testów Ukrywania się)"),
            MutationVariant(81..90, "Ciało przedzielone pionowo na pół, każda połowa w innym, kontrastującym kolorze"),
            MutationVariant(91..100, "Górna lub przednia część ciała ma inny kolor niż dolna lub tylna"),
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.COSMETIC,
            MutationTag.CHAOS
        )
    )

    val KopytaDziwnyWyglad = Mutation(
        name = "Kopyta (dziwny wygląd)",
        range = 266..270,
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Ostry ból przeszywa twoje stopy, gdy palce u nóg zrastają się i przekształcają w coś, co przypomina rozszczepione kopyta. Poza zniszczonym obuwiem mutacja ta nie ma większego wpływu na mechanikę gry.",
        statModifiers = StatModifiers(),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.COSMETIC
        )
    )

    val KostropataSkora = Mutation(
        name = "Kostropata skóra",
        range = 271..275,
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Cała twoja skóra pokrywa się krostami, bąblami, parchami, kurzajkami i liszajem. Choć wyglądają obrzydliwie, te narośle wzmacniają twoje ciało, zapewniając 1 Punkt Zbroi na każdej lokacji trafienia.",
        statModifiers = StatModifiers(),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.BENEFICIAL,
            MutationTag.NURGLE
        )
    )

    val KrotkieNogi = Mutation(
        name = "Krótkie nogi",
        range = 276..280,
        fearPoints = 0,
        type = MutationType.MULTIPLE,
        description = "Za każdym razem, gdy dotknie cię ta mutacja, twoje nogi stają się coraz krótsze, a twoja Szybkość zmniejsza się o 1. Gdy Szybkość spadnie do wartości 1, dolne kończyny ostatecznie zanikają i możesz poruszać się jedynie, pełzając i podpierając się rękami (lub mackami).",
        statModifiers = StatModifiers(
            sz = -1..-1
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.DETRIMENTAL
        )
    )

    val KrysztaloweCialo = Mutation(
        name = "Kryształowe ciało",
        range = 281..285,
        fearPoints = 2,
        type = MutationType.SINGLE,
        description = "Twoje ciało, krew, kości i ścięgna zmieniają się w żywy kryształ. Nowa forma jest twardsza, lecz jednocześnie bardziej krucha i mniej elastyczna niż dawniej. Twoja Odporność wzrasta o 3k10 punktów, lecz maksymalna Żywotność zostaje zmniejszona o połowę (zaokrąglając w dół). Jeżeli ktokolwiek spróbuje odłupać fragment twojego ciała, po 1k10 minutach przekona się, że rzekomy skarb obrócił się w bezwartościowy pył.",
        statModifiers = StatModifiers(
            odp = 3..30,
            zyw = -4..-8
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.CHAOS,
            MutationTag.DANGEROUS,
            MutationTag.TZEENTCH
        )
    )

    val KwasowaWydzielina = Mutation(
        name = "Kwasowa wydzielina",
        range = 286..290,
        fearPoints = 1,
        type = MutationType.MULTIPLE,
        description = "Z porów twojej skóry zaczyna sączyć się zielony, lepki szlam o silnie żrących właściwościach, zwiększając twoją Odporność o 1k10. Kwas rozpuszcza zarówno materiały organiczne, jak i sztuczne — każda noszona zbroja lub ubranie zostają zniszczone w ciągu kilku minut. Za każdym razem, gdy trafisz przeciwnika w walce wręcz lub bronią naturalną, zadajesz mu dodatkowo 1 Punkt Obrażeń, bez uwzględniania pancerza i Wytrzymałości. Każda kolejna mutacja zwiększa te obrażenia o 1. Kwas działa także defensywnie — broń, która ugodzi twoje ciało, może zostać nadtrawiona, o ile atakujący nie wykona udanego testu Zręczności. Dodatkowo każdy przeciwnik, który trafi cię w walce wręcz lub bronią naturalną, otrzymuje 1 Punkt Obrażeń, bez uwzględniania pancerza i Wytrzymałości. Każda runda walki wręcz lub chwytu powoduje kolejne 1 Punkt Obrażeń. Przedmioty magiczne są odporne na działanie kwasu.",
        statModifiers = StatModifiers(
            odp = 1..10
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.BENEFICIAL,
            MutationTag.DANGEROUS,
            MutationTag.NURGLE
        )
    )

    val KwasoweWymioty = Mutation(
        name = "Kwasowe wymioty",
        range = 291..295,
        fearPoints = 2,
        type = MutationType.MULTIPLE,
        description = "Twój żołądek zaczyna wydzielać wyjątkowo żrące kwasy, podobne do tych wytwarzanych przez trolle. Raz na 1k10 rund możesz, poświęcając jedną akcję, zwymiotować kwasem na przeciwnika stojącego bezpośrednio przed tobą. Atak trafia automatycznie i zadaje obrażenia z Siłą 2, zwiększone o 1 za każdą kolejną mutację „Kwasowe wymioty”. Przed działaniem kwasu nie chroni pancerz. Ataku nie można sparować, lecz można próbować go uniknąć. Dodatkowo zyskujesz modyfikator +1k10 do Odporności.",
        statModifiers = StatModifiers(
            odp = 1..10
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.BENEFICIAL,
            MutationTag.DANGEROUS,
            MutationTag.NURGLE
        )
    )

    val Lewitacja = Mutation(
        name = "Lewitacja",
        range = 296..300,
        fearPoints = 2,
        type = MutationType.SINGLE,
        description = "Ku własnemu zdumieniu odkrywasz, że potrafisz unosić się nad ziemią. Możesz poruszać się w powietrzu z Szybkością Lotu równą twojej Szybkości.",
        statModifiers = StatModifiers(),
        tags = listOf(
            MutationTag.BENEFICIAL,
            MutationTag.CHAOS,
            MutationTag.TZEENTCH
        )
    )

    val LuskowataSkora = Mutation(
        name = "Łuskowata skóra",
        range = 301..305,
        fearPoints = 1,
        type = MutationType.SINGLE,
        description = "Twoja skóra twardnieje i pokrywa się łuskami, zapewniając 1 Punkt Zbroi na każdej lokacji trafienia.",
        statModifiers = StatModifiers(),
        variants = listOf(
            MutationVariant(
                range = 1..10,
                name = "Kolorowe łuski",
                description = "Choć u większości mutantów łuski mają zielony lub czarny kolor, zdarzają się również inne, bardziej osobliwe barwy."
            ),
            MutationVariant(
                range = 11..100,
                name = "Zielone lub czarne łuski",
                description = "Choć u większości mutantów łuski mają zielony lub czarny kolor, zdarzają się również inne, bardziej osobliwe barwy."
            )
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.BENEFICIAL
        )
    )
    val MackiZamiastRamion = Mutation(
        name = "Macki zamiast ramion",
        range = 306..310,
        fearPoints = 1,
        type = MutationType.MULTIPLE,
        description = "Jedno z twoich ramion usycha i obumiera, a na jego miejscu wyrasta pęk maleńkich macek pokrytych lepkimi przyssawkami. Możesz opleść nimi rękojeść broni i władać nią bez większych przeszkód, jednak przy wszystkich czynnościach wymagających precyzji otrzymujesz modyfikator –30 do testów Zręczności. Za każdym razem, gdy mutacja ta wystąpi ponownie, zyskujesz dodatkowo +5 do testów związanych z chwytami.",
        statModifiers = StatModifiers(
            zr = -30..-30
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.DETRIMENTAL
        )
    )

    val MackowatePalce = Mutation(
        name = "Mackowate palce",
        range = 311..315,
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Twoje palce odpadają od dłoni i zostają zastąpione niewielkimi mackami. Możesz posługiwać się nimi w miarę normalnie, jednak przy czynnościach wymagających precyzyjnych ruchów otrzymujesz modyfikator –10 do testów Zręczności.",
        statModifiers = StatModifiers(
            zr = -10..-10
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.DETRIMENTAL
        )
    )

    val MagicznaMoc = Mutation(
        name = "Magiczna moc",
        range = 316..320,
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Niszczycielskie Moce nagradzają cię darem magii. Wartość twojej cechy Magia wzrasta o 1. Jeżeli nie posiadasz zdolności Magia czarnoksięska, możesz ją wykupić za 200 Punktów Doświadczenia, pod warunkiem że aktualne żądanie Chaosu jest słuszne.",
        statModifiers = StatModifiers(
            mag = 1..1
        ),
        variants = listOf(
            MutationVariant(
                range = 1..100,
                name = "Nagroda od Khorna",
                description = "Jeżeli służysz Khornowi, Bóg Krwi uznaje cię za zdrajcę. W ciągu 1k3 dni wysyła na twój trop sforę Ogarów Chaosu (patrz str. 176), aby rozszarpały twoje ciało i zawlokły duszę do Domeny Chaosu. Tam, po wiekach tortur, Pan Krwi zmiażdży twojego ducha, a jego resztki rzuci pomiędzy czaszki zgromadzone pod swoim tronem."
            )
        ),
        tags = listOf(
            MutationTag.BENEFICIAL,
            MutationTag.CHAOS,
            MutationTag.TZEENTCH
        )
    )

    val Marionetka = Mutation(
        name = "Marionetka",
        range = 321..325,
        fearPoints = 2,
        type = MutationType.SINGLE,
        description = "Twoje życie staje się koszmarem, gdy znikają wszystkie twoje marzenia i myśli niezależne od cudzej woli. Ból odpadających uszu i nosa ustaje, a oczy zasklepiają się na zawsze. Z czubka twojej głowy wyrasta niewielka figurka — twoja idealna kopia. Ta marionetka mówi za ciebie (możesz ją normalnie odgrywać), lecz jej język jest niewyparzony, chamski, złośliwy i okrutny. Twoja rola sprowadza się do jedzenia tak często i tak dużo, jak to możliwe, by utrzymać miniaturowego władcę przy życiu. Przy każdym trafieniu w głowę istnieje 25% szans, że cios dosięgnie marionetki. Jej Żywotność wynosi 1. Jeśli marionetka zginie — ty również umierasz.",
        statModifiers = StatModifiers(),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.CHAOS,
            MutationTag.DANGEROUS,
            MutationTag.DETRIMENTAL
        )
    )

    val Mechanoid = Mutation(
        name = "Mechanoid",
        range = 326..330,
        fearPoints = 2,
        type = MutationType.MULTIPLE,
        description = "Znikąd pojawiają się niewielkie, złośliwe demony, które rzucają się na ciebie w niszczycielskim roju. Rozrywają twoje ciało na strzępy i zastępują ubytki mechanicznymi częściami. Nowe kończyny są potwornymi, metalowymi kopiami dawnych. Rzuć 1k10 — wynik 1–6 oznacza, że wszystkie twoje kończyny zostają zastąpione mechanicznymi (wynik 7 lub więcej oznacza, że zmieniona zostaje jedynie część ciała; patrz niżej). Otrzymujesz modyfikator +4k10 do Krzepy i Odporności oraz +3 Punkty Zbroi na każdej lokacji trafienia, lecz nie możesz nosić zwykłego pancerza. Zyskujesz także zdolność Broń naturalna i musisz wykonać rzut 1k100, aby określić rodzaj mechanicznych nóg. Nowy sposób poruszania się jest niezgrabny i głośny — wszystkie testy Skradania się wykonujesz z modyfikatorem –30.",
        statModifiers = StatModifiers(
            k = 4..40,
            odp = 4..40
        ),
        variants = listOf (
            MutationVariant(
                range = 1..70,
                name = "Całe ciało",
                description = "Otrzymujesz mechaniczne nogi, zwiększające twoją Szybkość o 1.",
                subvariants = listOf(
                    MutationSubvariant(
                        range = 1..40,
                        name = "Mechaniczne nogi",
                        description = "Otrzymujesz mechaniczne nogi, zwiększające twoją Szybkość o 1."
                    ),
                    MutationSubvariant(
                        range = 41..60,
                        name = "Metalowe koła",
                        description = "Dolne kończyny zostają zastąpione metalowymi kołami. Zyskujesz +3 do Szybkości na równym terenie."
                    ),
                    MutationSubvariant(
                        range = 61..80,
                        name = "Napęd energetyczny",
                        description = "Twoje nogi zmieniają się w urządzenie zasilane energią Chaosu. Twoja Szybkość spada do 0, lecz możesz lewitować z Szybkością Lotu równą wynikowi rzutu 1k10."
                    ),
                    MutationSubvariant(
                        range = 81..100,
                        name = "Gąsienice",
                        description = "Twoje dolne kończyny zostają zastąpione mechanicznymi gąsienicami, zapewniającymi Szybkość równą wynikowi rzutu 1k10."
                    )
                )
            ),
            MutationVariant(
                range = 71..75,
                name = "Tylko głowa",
                description = "Zyskujesz zdolność \"broń naturalna\" oraz 3PZ na głowie.",
            ),
            MutationVariant(
                range = 76..80,
                name = "Tylko korpus",
                description = "2k10 do Odporności oraz 3PZ na korpusie",
                statModifiers = StatModifiers(
                    odp = 2..20,
                )
            ),
            MutationVariant(
                range = 81..85,
                name = "Nogi",
                subvariants = listOf(
                    MutationSubvariant(
                        range = 1..40,
                        name = "Mechaniczne nogi",
                        description = "Otrzymujesz mechaniczne nogi, zwiększające twoją Szybkość o 1."
                    ),
                    MutationSubvariant(
                        range = 41..60,
                        name = "Metalowe koła",
                        description = "Dolne kończyny zostają zastąpione metalowymi kołami. Zyskujesz +3 do Szybkości na równym terenie."
                    ),
                    MutationSubvariant(
                        range = 61..80,
                        name = "Napęd energetyczny",
                        description = "Twoje nogi zmieniają się w urządzenie zasilane energią Chaosu. Twoja Szybkość spada do 0, lecz możesz lewitować z Szybkością Lotu równą wynikowi rzutu 1k10."
                    ),
                    MutationSubvariant(
                        range = 81..100,
                        name = "Gąsienice",
                        description = "Twoje dolne kończyny zostają zastąpione mechanicznymi gąsienicami, zapewniającymi Szybkość równą wynikowi rzutu 1k10."
                    )
                )

            ),
            MutationVariant (
                range = 86..90,
                name = "Ręce",
                description = "2k10 do K i 3PZ na rękach",
                statModifiers = StatModifiers(
                    k = 2..20,
                )
            ),
            MutationVariant (
                range = 91..95,
                name = "Nogi i korpus",
                description = "2k10 do Odporności oraz 3PZ na korpusie",
                statModifiers = StatModifiers(
                    odp = 2..20,
                ),
                subvariants = listOf(
                    MutationSubvariant(
                        range = 1..40,
                        name = "Mechaniczne nogi",
                        description = "Otrzymujesz mechaniczne nogi, zwiększające twoją Szybkość o 1."
                    ),
                    MutationSubvariant(
                        range = 41..60,
                        name = "Metalowe koła",
                        description = "Dolne kończyny zostają zastąpione metalowymi kołami. Zyskujesz +3 do Szybkości na równym terenie."
                    ),
                    MutationSubvariant(
                        range = 61..80,
                        name = "Napęd energetyczny",
                        description = "Twoje nogi zmieniają się w urządzenie zasilane energią Chaosu. Twoja Szybkość spada do 0, lecz możesz lewitować z Szybkością Lotu równą wynikowi rzutu 1k10."
                    ),
                    MutationSubvariant(
                        range = 81..100,
                        name = "Gąsienice",
                        description = "Twoje dolne kończyny zostają zastąpione mechanicznymi gąsienicami, zapewniającymi Szybkość równą wynikowi rzutu 1k10."
                    )
                )
            ),
            MutationVariant (
                range = 96..100,
                name = "Nogi i ręce",
                description = "2k10 do K i 3PZ na rękach",
                statModifiers = StatModifiers(
                    k = 2..20,
                ),
                subvariants = listOf(
                    MutationSubvariant(
                        range = 1..40,
                        name = "Mechaniczne nogi",
                        description = "Otrzymujesz mechaniczne nogi, zwiększające twoją Szybkość o 1."
                    ),
                    MutationSubvariant(
                        range = 41..60,
                        name = "Metalowe koła",
                        description = "Dolne kończyny zostają zastąpione metalowymi kołami. Zyskujesz +3 do Szybkości na równym terenie."
                    ),
                    MutationSubvariant(
                        range = 61..80,
                        name = "Napęd energetyczny",
                        description = "Twoje nogi zmieniają się w urządzenie zasilane energią Chaosu. Twoja Szybkość spada do 0, lecz możesz lewitować z Szybkością Lotu równą wynikowi rzutu 1k10."
                    ),
                    MutationSubvariant(
                        range = 81..100,
                        name = "Gąsienice",
                        description = "Twoje dolne kończyny zostają zastąpione mechanicznymi gąsienicami, zapewniającymi Szybkość równą wynikowi rzutu 1k10."
                    )
                )
            ),

        ),
    )

    val MetalicznaSkora = Mutation(
        name = "Metaliczna skóra",
        range = 331..335,
        fearPoints = 2,
        type = MutationType.SINGLE,
        description = "Twoja skóra pokrywa się drobinami metalu, zapewniając 2 Punkty Zbroi na każdej lokacji trafienia.",
        statModifiers = StatModifiers(),
        variants = listOf(
            MutationVariant(
                range = 1..100,
                name = "Rodzaj metalu",
                description = "Pokrycie skóry może być wykonane z dowolnego metalu — złota, srebra, brązu lub bardziej egzotycznych stopów. Szczegóły określa tabela i opis mutacji „Metalowe ciało”."
            )
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.BENEFICIAL,
            MutationTag.TZEENTCH
        )
    )

    val MetaloweCialo = Mutation(
        name = "Metalowe ciało",
        range = 336..340,
        fearPoints = 3,
        type = MutationType.SINGLE,
        description = "Twoje ciało przemienia się w niezwykłą mieszaninę złota, stali i srebra (dokładne pokrycie określa MG). Zyskujesz 5 Punktów Zbroi na każdej lokacji trafienia, których nie można łączyć z ochroną zapewnianą przez pancerz. Otrzymujesz modyfikator –2k10 do Walki Wręcz i Umiejętności Strzeleckich oraz +3k10 do Krzepy i Odporności. Jesteś odporny na działanie ognia i mrozu, lecz otrzymujesz podwójne obrażenia od ataków opartych na elektryczności. Szczególnie chciwi towarzysze mogą próbować odciąć fragment twojego ciała i sprzedać go z zyskiem — złoci i srebrni mutanci są niezwykle cenni. Odrąbanie palca, ucha lub wykłucie oka powoduje utratę 2 Punktów Żywotności. Odrąbanie kończyny lub głowy zwykle kończy się śmiercią. Każda odcięta część ciała działa mutagennie jak depozyt spaczenia.",
        statModifiers = StatModifiers(
            ww = -2..-20,
            us = -2..-20,
            k = 3..30,
            odp = 3..30
        ),
        variants = listOf(
            MutationVariant(
                range = 1..100,
                name = "Wartość metalowych części",
                description = "Nos lub ucho: 1k10/2 szylinga; Gałka oczna: 1k10/2 szylinga; Dłoń lub stopa: 1k10 szylingów; Ręka: 2k10 szylingów; Noga: 3k10 szylingów; Głowa: 1k10+4 szylingi; Korpus: 8k10 szylingów."
            )
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.CHAOS,
            MutationTag.BENEFICIAL,
            MutationTag.TZEENTCH
        )
    )

    val Mieszaniec = Mutation(
        name = "Mieszaniec",
        range = 341..345,
        fearPoints = 1,
        type = MutationType.SINGLE,
        description = "Twoje ciało ulega potwornej przemianie, stając się hybrydą istoty, którą byłeś wcześniej, oraz innego stworzenia — zwierzęcia, bestii lub potwora. Mistrz Gry wybiera istotę z odpowiedniego bestiariusza i określa, jak bardzo zmieniło się twoje ciało. Za każdym razem, gdy wylosujesz tę mutację, MG powinien wybrać inną istotę. Stopień spaczenia określa poniższa tabela.",
        statModifiers = StatModifiers(),
        variants = listOf(
            MutationVariant(
                range = 1..33,
                name = "Dominacja dawnej formy",
                description = "Twoja pierwotna forma dominuje, a cechy nowej istoty objawiają się jedynie częściowo. Zachowujesz swoje cechy bez zmian."
            ),
            MutationVariant(
                range = 34..66,
                name = "Równowaga",
                description = "Stara i nowa forma łączą się w potworną hybrydę. Cechy główne obu istot zsumuj, a następnie podziel na pół (zaokrąglając w dół). Zyskujesz 1k10 Punktów Żywotności."
            ),
            MutationVariant(
                range = 67..99,
                name = "Dominacja nowej istoty",
                description = "Nowa forma zaczyna dominować nad twoim ciałem. Wszystkie cechy zsumuj i podziel na pół (zaokrąglając w dół). Zyskujesz wszystkie zdolności nowej istoty oraz 1k10 Punktów Żywotności, lecz otrzymujesz 1k10 Punktów Obłędu."
            ),
            MutationVariant(
                range = 100..100,
                name = "Pomiot Chaosu!",
                description = "Więcej informacji o Pomiotach Chaosu znajdziesz na str. 68."
            )
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.CHAOS,
            MutationTag.DANGEROUS
        )
    )

    val MistrzBroni = Mutation(
        name = "Mistrz broni",
        range = 346..350,
        fearPoints = 0,
        type = MutationType.MULTIPLE,
        description = "Bogowie Chaosu obdarzają cię nadludzkim talentem bojowym. Otrzymujesz modyfikator +1k10 do Walki Wręcz lub Umiejętności Strzeleckich (do wyboru).",
        statModifiers = StatModifiers(),
        variants = listOf(
            MutationVariant(
                range = 1..50,
                name = "Walka Wręcz",
                description = "+1k10 do Walki Wręcz"
            ),
            MutationVariant(
                range = 51..100,
                name = "Umiejętności Strzeleckie",
                description = "+1k10 do Umiejętności Strzeleckich"
            )
        ),
        tags = listOf(
            MutationTag.BENEFICIAL,
            MutationTag.KHORNE
        )
    )

    val MyslacaNarosl = Mutation(
        name = "Myśląca narośl",
        range = 351..355,
        fearPoints = 2,
        type = MutationType.MULTIPLE,
        description = "W twoim ciele zaczyna rosnąć przerażający guz. W przeciwieństwie do mutacji „Organ Chaosu” jest on inteligentny (2k10+20). Za każdym razem, gdy mutacja się powtarza, narośl obniża twoją Odporność o 1k10, lecz w zamian zwiększa twoją Żywotność o 4. Narośl posiada własną osobowość i cele. Każdego dnia musisz wykonać test Siły Woli — porażka oznacza, że narośl przejmuje kontrolę nad twoim ciałem. Dopiero kolejnego dnia możesz spróbować odzyskać kontrolę. Gdy narośl rządzi, nie pamiętasz swoich czynów. Jeżeli zginiesz, guz wydostaje się z ciała i ucieka na nowo wykształconych odnóżach. Po pewnym czasie przemienia się w Pomiot Chaosu (patrz str. 68).",
        statModifiers = StatModifiers(
            odp = -1..-10,
            zyw = 4..4
        ),
        variants = listOf(
            MutationVariant(
                range = 1..10,
                name = "Zewnętrzna narośl",
                description = "W 10% przypadków inteligentna narośl wyrasta na zewnątrz ciała. Mutant, który ją odsłania, zyskuje zdolność Straszny."
            ),
            MutationVariant(
                range = 11..100,
                name = "Zwykła narośl",
            ),
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.CHAOS,
            MutationTag.DANGEROUS,
            MutationTag.DETRIMENTAL
        )
    )

    val NiekontrolowaneGazy = Mutation(
        name = "Niekontrolowane gazy",
        range = 356..360,
        fearPoints = 0,
        type = MutationType.SINGLE,
        description = "Cierpisz na osobliwe schorzenie żołądka, które ujawnia się w chwilach zagrożenia. Gdy zostaniesz zaatakowany lub musisz wykonać test Strachu albo Grozy, bezwiednie wypuszczasz chmurę cuchnącego gazu o promieniu 3 metrów. Chmura utrzymuje się przez 1k10/2 rund i co rundę przemieszcza się o 2 metry w losowym kierunku. Przy wyniku 1 na 1k10 pozostaje w miejscu, a przy 10 natychmiast się rozwiewa. Rodzaj gazu określa poniższa tabela lub decyzja Mistrza Gry.",
        statModifiers = StatModifiers(),
        variants = listOf(
            MutationVariant(
                range = 1..2,
                name = "Trujący gaz",
                description = "Każda istota w chmurze musi wykonać Wymagający (–10) test Odporności. Porażka oznacza obrażenia z Siłą 4, bez uwzględniania pancerza."
            ),
            MutationVariant(
                range = 3..4,
                name = "Gaz paraliżujący",
                description = "Istoty w chmurze wykonują Wymagający (–10) test Odporności. Nieudany test oznacza paraliż na 1k10 rund."
            ),
            MutationVariant(
                range = 5..6,
                name = "Oleista mgła",
                description = "Gęsta, śmierdząca mgła powoduje, że wszystkie testy oparte na wzroku wykonywane są z modyfikatorem –20."
            ),
            MutationVariant(
                range = 7..8,
                name = "Mdlący opar",
                description = "Istoty, którym nie powiedzie się Wymagający (–10) test Odporności, przez 1k10 rund mają Krzepę zmniejszoną o połowę (zaokrąglając w dół)."
            ),
            MutationVariant(
                range = 9..10,
                name = "Opar szaleństwa",
                description = "Wszystkie istoty w chmurze zachowują się tak, jakby znajdowały się pod wpływem grzybków Szalonego Kapelusznika (Księga Zasad, str. 126)."
            )
        ),
        tags = listOf(
            MutationTag.PHYSICAL,
            MutationTag.NURGLE,
            MutationTag.DANGEROUS
        )
    )
//    // Funkcja pomocnicza do losowania mutacji
//    fun rollMutation(roll: Int): Mutation? {
//        val allMutations = listOf(
//            DodatkoweOko, OgonMutacja, ZmienionaSkoraMutacja, DodatkoweKonczyny,
//            WyciekMagii, BestialnaGlowa, NieustannyBol, KrwawiaceOczy,
//            TrzyPalce, GnijaceCialo, WielkoscPotworaMutacja, PalaceJezyki,
//            DemoniczyGlos, KostneWyrostki, MetalicznaKrew, PrzemienneOblicze,
//            UchoPrzestrzeni, SrogiWzrok, PrzeziernaSiebie, ToksyczneWyziowy,
//            PlaceholderMutacja
//        )
//
//        return allMutations.firstOrNull { roll in range }
//    }
}

// imagePath = "images/mutations/dodatkowe_oko.png"