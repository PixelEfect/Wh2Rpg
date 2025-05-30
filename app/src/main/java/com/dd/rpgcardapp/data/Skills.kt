package com.dd.rpgcardapp.data

data class Skill (val name: String, val description: String){
    // Tworzymy metodę do konwersji obiektu na mapę
    fun toMap(): Map<String, String> {
        return mapOf(
            "name" to this.name,
            "description" to this.description
        )
    }
}

object CommonSkills {
    val artylerzysta = Skill("Artylerzysta", "Ładowanie broni palnej krótsze o 1 akcję")
    val bezksztaltny = Skill("Bezkształtny", "Bezustanna zmiana kształtu, trafienie zawsze w korpus. TK = nagła śmierć")
    val bezrozumny = Skill("Bezrozumny", "Istota bez Int, Sw i Ogd")
    val biegPoScianach = Skill("Bieg po ścianach", "+20 wspinaczka, wysokość = szybkość")
    val bijatyka = Skill("Bijatyka", "Walka bez broni: WW +10, obrażenia +1")
    val blyskawicznePrzadowanie = Skill("Błyskawiczne przeładowanie", "Skróca przeładowanie broni strzeleckiej o 1 akcję")
    val blyskawicznyJezdziec = Skill("Błyskawiczny jeździec", "+1Sz/dzień dla konia bez cieżkiej zbroi po udanym teście jeździectwa")
    val blyskawicznyBlok = Skill("Błyskawiczny blok", "Parowanie w ataku wielokrotnym")
    val brawura = Skill("Brawura", "Skok jako akcja pojedyncza, zasięg skoku +5")
    val bronNaturalna = Skill("Broń naturalna", "Szpony, kły itp., działają jak broń ręczna")
    val bystryWzrok = Skill("Bystry wzrok", "+10 do testów opartych na wzroku")
    val chirurgia = Skill("Chirurgia", "+10 leczenie, +2pkt Żyw, +20 Odp dla pacjenta")
    val chodu = Skill("Chodu!", "Sz +1 na k10 rund podczas ucieczek")
    val cialoksztaltowanie = Skill("Ciałokształtowanie", "Test leczenia, żeby stworzyć wynaturzenie skaveńskie")
    val czarnoksiestwo = Skill("Czarnoksięstwo", "+20 do testów zaklęcia; większa szansa na Przekleństwa Tzeentcha")
    val czarostwo = Skill("Czarostwo","Możliwość kupowania zaklęć ze wszystkich 8 tradycji do 15 poziomu mocy za 200PD")
    val czarnyGlod = Skill("Czarny głód", "Natychmiastowe wpadnięcie w szał; +1A, +2Sz, na koniec rundy cierpienie z S3(50% na 2x)")
    val czlowiekGuma = Skill("Człowiek-guma", "+10 do wyzwalania się z węzłów, kuglarstwo (akrobatyka) +10")
    val czulySluch = Skill("Czuły słuch", "+20 do testów opartych na słuchu")
    val czulyWech = Skill("Czuły węch", "+20 do testów opartych na węchu")
    val demonicznaAura = Skill("Demoniczna aura", "+2 Odp na niemagiczną broń")
    val dodatkoweZaklecie = Skill ("Dodatkowe zaklecie", "Każdorazowe wykupienie daje nowe zaklęcie")
    val dotykMocy = Skill ("Dotyk mocy", "+20 do WW podczas zaklęć dotykowych")
    val dziecieGor = Skill ("Dziecię gór ", "Brak kar do szybkości na górskim terenie")
    val eteryczny = Skill("Eteryczny", "Przenikanie ścian, +30 ukrywanie się, odporność na niemagiczną broń")
    val etykieta = Skill("Etykieta", "+10 do testów związanych z arystokracją")
    val geniuszArytmetyczny = Skill("Geniusz arytmetyczny", "+10 do hazardu i nawigacji; +20 do szacowania")
    val grotolaz = Skill("Grotołaz", "+10 do skradania i ukrywania pod ziemią i w jaskiniach")
    val grozny = Skill("Groźny", "+10 do zastraszania i torturowania")
    val gusla = Skill("Gusła", "Dodatkowa kość przy określaniu poziomu mocy; służy do sprawdzania Przekleństwa Tzeentcha")
    val intrygant = Skill("Intrygant", "+10 do przekonywania i testów SW podczas intryg")
    val inzynieriaSpaczeniowa = Skill("Inżynieria spaczeniowa", "nauka inżynieria pozwala na tworzenie spaczeniowych wynalazków")
    val kontrolowanaMutacja = Skill("Kontrolowana mutacja", "2 rzuty na mutacje i wybór. Następnie -10(odp) do testów na kolejne mutacje")
    val krasnoludzkifach = Skill("Krasnoludzki fach", "+10 do rzemiosła krasnoludzkiego")
    val krasomowstwo = Skill("Krasomówstwo", "Oddziaływanie na grupę osób 100 razy większą niż normalnie; wymaga Przemawianie")
    val krzepki = Skill("Krzepki", "BG nosi pancerz ciężki i zbroję płytową")
    val latanie = Skill("Latanie", "Postać potrafi latać")
    val lewitacja = Skill("Lewitacja", "Postać potrafi unosić się nad ziemią")
    val lotrzyk = Skill("Łotrzyk", "+10 do plotkowania i przekonywania w półświadku")
    val luski1 = Skill("Łuski(1)", "Naturalny pancerz 1PZ")
    val luski2 = Skill("Łuski(2)", "Naturalny pancerz 2PZ")
    val luski3 = Skill("Łuski(3)", "Naturalny pancerz 3PZ")
    val luski4 = Skill("Łuski(4)", "Naturalny pancerz 4PZ")
    val luski5 = Skill("Łuski(5)", "Naturalny pancerz 5PZ")
    val medytacja = Skill("Medytacja", "Poziom mocy rytuału + Mag BG")
    val mieczRodowy = Skill("Miecz rodowy", "Miecz rodowy daje +5WW, +1obr, +10 na strach i grozę")
    val mierzonyCios = Skill("Mierzony cios", "+20 do WW podczas akcji 'celowanie'")
    val mistrzTresury = Skill("Mistrz tresury", "+20 dowodzenie/tresura skaveńskimi stworzeniami")
    val morderczyAtak = Skill("Morderczy atak", "Traficie krytyczne zadanie bronią w walce wręcz +1")
    val morderczyPocisk = Skill("Morderczy pocisk", "Zaklęcia typu 'magiczy pocisk' obrażenia +1")
    val nasladowca = Skill("Naśladujący", "+10 do testów wymagających udawania kogoś innego")
    val niekompletny = Skill("Niekompletny", "Trafienie krytyczne = nagła śmierć")
    val niepokojacy = Skill("Niepokojący", "Test SW przeciwnika albo kara -10 do WW i US")
    val nieustraszony = Skill("Nieustraszony", "Strach nie działa; Groza działa jak strach")
    val obiezyswiat = Skill("Obieżyświat", "+10 do wiedzy i znajomości języka")
    val oburecznosc = Skill("Oburęczność", "Brak kary dla broni w drugiej ręce")
    val odpornoscNaChaos = Skill("Odporność na Chaos", "+10 SW przeciwko chaosowi i magii, brak mutacji")
    val odpornoscNaChoroby = Skill("Odporność na choroby", "+10 do ODP przeciw chorobom")
    val odpornoscNaMagie = Skill("Odporność na magię", "+10 do SW przeciw magii")
    val odpornoscNaTrucizny = Skill("Odporność na Trucizny", "+10 do ODP przeciw truciznom")
    val odpornoscPsychiczna = Skill("Odporność psychiczna", "choroba umysłow dopiero od 14 PO")
    val odwaga = Skill("Odwaga", "+10 do SW przeciwko zastraszaniu, Strachowi i Grozie")
    val ogluszenie = Skill("Ogluszenie", "Przeciwstawny test K i test Odp")
    val oporny = Skill("Oporny", "Przy rozwoju test tresury. Nieudany - utrata PD i brak rozwinięcia")
    val ozywieniec = Skill("Ożywieniec", "Jesteś nieumarłym stworem!")
    val pancerzWiary = Skill("Pancerz wiary", "+3 do rzucania zaklęć w zbroi")
    val poliglota = Skill("Poliglota", "+10 do czytania i pisania oraz znajomości języka")
    val polityk = Skill("Polityk", "+10 do gadaniny, przekonywania, targowania")
    val poteznyCios = Skill("Potężny cios", "-30 do parowania ciosu dla przeciwnika")
    val przemawianie = Skill("Przemawianie", "Oddziaływanie na grupę osób 10 razy większą niż normalnie")
    val przerazajacy = Skill("Przerażający", "Postać wzbudza Grozę!")
    val rozbrajanie = Skill("Rozbrajanie", "Po trafieniu przeciwnostwa test ZR; wróg gubi broń")
    val silnyCios = Skill("Silny cios", "Obrażenia w walce wręcz +1")
    val skavenskiKonstrukt = Skill("Skaveński Konstrukt", "Mech sterowany przez skavena telepatycznie")
    val straszny = Skill("Straszny", "Postać wzbudza Strach!")
    val strzalMierzony = Skill("Strzał mierzony", "+20 do US podczas akcji 'celowanie'")
    val strzalPrecyzyjny = Skill("Strzał precyzyjny", "Obrażenia od broni strzeleckiej +1")
    val strzalPrzebijajacy = Skill("Strzał przebijający", "Pociski ignorują 1 PZ celu")
    val szalBojowy = Skill("Szał bojowy", "+10 SW i K; -10 WW i US; zawsze szarża lub szaleńczy")
    val szczescie = Skill("Szczęście", "dodatkowy punkt szczęścia dziennie")
    val szostyZmysl = Skill("Szósty zmysł", "Wyczucie zasadzek - test SW")
    val sztukaCichejSmierci = Skill("Sztuka cichej śmierci", "Walka wręcz, S -3, PZ nie liczą się podwójnie")
    val szybkieWyciagniecie = Skill("Szybkie wyciągnięcie", "Dobycie broni jako akcja natychmiastowa")
    val talentArtystyczny = Skill("Talent artystyczny", "+10 do rzemiosła/sztuki; +10 do wyceny dzieł sztuki")
    val tobarskiPilot = Skill("Tobarski pilot", "+10/20 do testów związanych ze Skałami Głupców")
    val ulicznik = Skill("Ulicznik", "+10 do skradania i ukrywania się w mieście")
    val uodpornionyNaChaos = Skill("Uodporniony na Chaos", "mutant otrzymuje +10 przeciwko kolejnym przemianom")
    val urodzonyWspinacz = Skill("Urodzony wspinacz", "W ramach akcji po udanym teście wspinaczki przebyto (Sz) metrów")
    val walkaOgonem = Skill("Walka ogonem", "Władanie bronią za pomocą ogona")
    val warzenieZarazy = Skill("Warzenie zarazy", "Rzemiosło piwowarstwo do tworzenia piwa z chorobą ze spaczenia")
    val wedrowiec = Skill("Wędrowiec", "+10 do skradania i ukrywania się poza miastem")
    val widzenieWCiemnosci = Skill("Widzenie w ciemności", "Widzenie w ciemności do 30 metrów")
    val woltyzerka = Skill("Woltyżerka", "+10 do jeździectwa; testy w ekstremalnych sytuacjach")
    val wybraniecChaosu = Skill("Wybraniec Chaosu", "2 testy na rodzaj mutacji + wybór")
    val wyczucieKierunku = Skill("Wyczucie kierunku", "+10 do nawigacji; naturalny kompas")
    val wykrywaniePulapek = Skill("Wykrywanie pułapek", "+10 do spostrzegawczości i otwierania zamków")
    val wyostrzoneZmysly = Skill("Wyostrzone zmysły", "+20 do spostrzegawczości")
    val zapasy = Skill("Zapasy", "+10 do spostrzegawczości i otwierania zamków")
    val zapieklaNienawisc = Skill("Zapiekła nienawiść", "+5 do WW przeciw Zielonoskórym")
    val zaspiew = Skill("Zaśpiew", "Test kuglarstwa - śpiewu przy asystowaniu daja rzucającemu rytuał 1 pkt mocy")
    val zawodnyKonstrukt = Skill("Zawodny konstrukt", "Konstrukt ma wady za każdym poleceniem k10 - jeśli 1 lub 2 to robi coś źle")
    val zelaznaWola = Skill("Żelazna wola", "Odporność na strach i grozę")
    val zmyslMagii = Skill("Zmysł magii", "+10 do testów splatania magii")
    val znajomoscRegionu = Skill("Znajomość regionu", "+10 do testów wiedzy na temat wybranego regionu")
    val zrodzonyWMorzu = Skill("Zrodzony w morzu", "Można pić wode morską, +5pływanie,żeglarstwo.Utrata zdolności po zejściu na ląd")
    val zylkaHandlowa = Skill("Żyłka handlowa", "+10 do testów targowania i wyceny")
}

object StatsSkills {
    val bardzoSilny = Skill("Bardzo silny", "Krzepa +5 na stałe")
    val bardzoSzybki = Skill("Bardzo szybki", "Szybkość +1 na stałe")
    val blyskotliwosc = Skill("Błyskotliwość", "Inteligencja +5 na stałe")
    val charyzmatyczny = Skill("Charyzmatyczny", "Ogłada +5 na stałe")
    val niezwykleOdporny = Skill("Niezwykle odporny", "Odporność +5 na stałe")
    val opanowanie = Skill("Opanowanie", "+5 do SW na stałe")
    val strzelecWyborowy = Skill("Strzelec wyborowy", "US +5 na stałe")
    val szybkiRefleks = Skill("Szybki refleks", "+5 do Zr na stałe")
    val twardziel = Skill("Twardziel", "+1 Żywność na stałe")
    val urodzonyWojownik = Skill("Urodzony wojownik", "WW +5 na stałe")
}
object WeaponSkills {
    val bronDwureczna = Skill("Broń specjalna: Dwureczna", "Posługiwanie się bronią dwuręczną bez kar")
    val bronKawaleryjska = Skill("Broń specjalna: Kawaleryjska", "Posługiwanie się bronią kawaleryjską bez kar")
    val korbacze = Skill("Broń specjalna: Korbacz", "Posługiwanie się korbaczami bez kar")
    val kusze = Skill("Broń specjalna: Kusza", "Posługiwanie sie kuszami bez kar")
    val dlugieLuki = Skill("Broń specjalna: Łuki", "Posługiwanie się łukami bez kar")
    val bronMechaniczna = Skill("Broń specjalna: Mechaniczna", "Posługiwanie się bronią mechaniczną bez kar")
    val bronPalna = Skill("Broń specjalna: Palna", "Posługiwanie się bronią palną bez kar")
    val bronParujaca = Skill("Broń specjalna: Parująca", "Posługiwanie się bronią parującą bez kar")
    val proce = Skill("Broń specjalna: Proce", "Posługiwanie się procą bez kar")
    val ostrzeJadowe = Skill("Broń specjalna: Ostrze jadowe", "Posługiwanie się ostrzem jadowym bez kar")
    val bronRzucana = Skill("Broń specjalna: Rzucana", "Posługiwanie się bronią rzucaną bez kar")
    val bronSzermiercza = Skill("Broń specjalna: Szermiercza", "Posługiwanie się bronią szermierczą bez kar")
    val bronUnieruchamiajaca = Skill("Broń specjalna: Unieruchamiająca", "Posługiwanie się bronią unieruchamiającą bez kar")
}
object MagicSkills {
    val magiaProstaChaos = Skill("Magia prosta: Chaos", "Dostęp do czarów magii prostej - Chaos")
    val magiaProstaGusla = Skill("Magia prosta: Gusła", "Dostęp do czarów magii prostej - gusła")
    val magiaProstaKaplanska = Skill("Magia prosta: Kapłańska", "Dostęp do czarów magii prostej - kapłańskiej")
    val magiaProstaSpaczeniowa = Skill("Magia prosta: Spaczeniowa", "Dostęp do czarów magii prostej - spaczeniowej")
    val magiaProstaLodu = Skill("Magia prosta: Lodu", "Dostęp do czarów magii prostej - lodu")
    val magiaProstaWiedzm = Skill("Magia prosta: Wiedźm", "Dostęp do czarów magii prostej - wiedźm")
    val magiaProstaTajemna = Skill("Magia prosta: Tajemna", "Dostęp do czarów magii prostej - tajemnej")
    val magiaProstaManannitow = Skill("Magia prosta: Manannitów", "Dostęp do błogosławieństw - Manann")
    val magiaProstaMorrytow = Skill("Magia prosta: Morrytów", "Dostęp do błogosławieństw - Morr")
    val magiaProstaMyrmidian = Skill("Magia prosta: Myrmidian", "Dostęp do błogosławieństw - Myrmidia")
    val magiaProstaRanaldian = Skill("Magia prosta: Ranaldian", "Dostęp do błogosławieństw - Ranald")
    val magiaProstaShallyan = Skill("Magia prosta: Shallyan", "Dostęp do błogosławieństw - Shallya")
    val magiaProstaSigmarytow = Skill("Magia prosta: Sigmarytów", "Dostęp do błogosławieństw - Sigmar")
    val magiaProstaTaalitow = Skill("Magia prosta: Taalitów", "Dostęp do błogosławieństw - Taal i Rhyia")
    val magiaProstaUlrykan = Skill("Magia prosta: Ulrykan", "Dostęp do błogosławieństw - Ulryk")
    val magiaProstaVerenian = Skill("Magia prosta: Verenian", "Dostęp do błogosławieństw - Verena")
    val magiaProstaZielarska = Skill("Magia prosta: Zielarska", "Dostęp do magii prostej - zielarskiej (mieszanka z krolestwa lodu i podrecznika glownego")
    val magiaCzarnoksieskaChaos = Skill("Magia czarnoksięska: Chaos", "Dostęp do czarów magii chaosu")
    val magiaCzarnoksieskaNagasha = Skill("Magia czarnoksięska: Nagasha", "Dostęp do czarów tradycji Nagasha")
    val magiaCzarnoksieskaNekromacja = Skill("Magia czarnoksięska: Nekromancja", "Dostęp do czarów magii nekromanckiej")
    val magiaCzarnoksieskaNurgl = Skill("Magia czarnoksięska: Nurgl", "Dostęp do czarów magii Nurgla")
    val magiaCzarnoksieskaSkrytosci = Skill("Magia czarnoksięska: Tradycja skrytości", "Dostęp do czarów magii Skaveńskiej - tradycja skrytości")
    val magiaCzarnoksieskaSlaanesh = Skill("Magia czarnoksięska: Slaanesh", "Dostęp do czarów magii Slaanesha")
    val magiaCzarnoksieskaSpaczenia = Skill("Magia czarnoksięska: Tradycja spaczenia", "Dostęp do czarów magii Skaveńskiej - tradycja spaczenia")
    val magiaCzarnoksieskaTzeentch = Skill("Magia czarnoksięska: Tzeentch", "Dostęp do czarów magii Tzeentcha")
    val magiaCzarnoksieskaZarazy = Skill("Magia czarnoksięska: Tradycja zarazy", "Dostęp do czarów magii Skaveńskiej - tradycja zarazy")
    val magiaKaplanskaDuchow = Skill("Magia kapłańska: Duchów", "Dostep do czarów magii szamańskiej")
    val magiaKaplanskaDazha = Skill("Magia kapłańska: Dazha", "Dostep do czarów kapłańskich Dazha")
    val magiaKaplanskaMannan = Skill("Magia kapłańska: Mannan", "Dostep do czarów kapłańskich Mannana")
    val magiaKaplanskaMorr = Skill("Magia kapłańska: Morr", "Dostep do czarów kapłańskich Morra")
    val magiaKaplanskaMyrmidia = Skill("Magia kapłańska: Myrmidia", "Dostep do czarów kapłańskich Myrmidii")
    val magiaKaplanskaRanald = Skill("Magia kapłańska: Ranald", "Dostep do czarów kapłańskich Ranalda")
    val magiaKaplanskaSigmar = Skill("Magia kapłańska: Sigmar", "Dostep do czarów kapłańskich Sigmara")
    val magiaKaplanskaShallya = Skill("Magia kapłańska: Shallya", "Dostep do czarów kapłańskich Shallyi")
    val magiaKaplanskaTaalRhyia = Skill("Magia kapłańska: Taal i Rhyia", "Dostep do czarów kapłańskich Taala i Rhyi")
    val magiaKaplanskaKhaina = Skill("Magia kapłańska: Khain", "Dostep do czarów kapłańskich Khaina")
    val magiaKaplanskaUlryk = Skill("Magia kapłańska: Ulryk", "Dostep do czarów kapłańskich Ulryka")
    val magiaKaplanskaTora = Skill("Magia kapłańska: Tora", "Dostep do czarów kapłańskich Tora")
    val magiaKaplanskaUrsuna = Skill("Magia kapłańska: Ursuna", "Dostep do czarów kapłańskich Ursuna")
    val magiaKaplanskaVerena = Skill("Magia kapłańska: Verena", "Dostep do czarów kapłańskich Vereny")
    val magiaKaplanskaGunndreda = Skill("Magia kapłańska: Gunndred", "Dostep do czarów kapłańskich Gunndreda")
    val magiaKaplanskaHandricha = Skill("Magia kapłańska: Handrich", "Dostep do czarów kapłańskich Handricha")
    val magiaPowszechnaAnatema = Skill("Czar magii powszechnej: Anatema", "uzupelnic")
    val magiaPowszechnaAzyl = Skill("Czar magii powszechnej: Azyl", "uzupelnic")
    val magiaPowszechnaBarieraCzystosci = Skill("Czar magii powszechnej: Bariera czystości", "uzupelnic")
    val magiaPowszechnaBarieraDuchow = Skill("Czar magii powszechnej: Bariera duchów", "uzupelnic")
    val magiaPowszechnaDotykNaOdleglosc = Skill("Czar magii powszechnej: Dotyk na odległość", "uzupelnic")
    val magiaPowszechnaEgzorcyzm = Skill("Czar magii powszechnej: Egzorcyzm (dziedzictwo)", "uzupelnic")
    val magiaPowszechnaGlosKaznodziei = Skill("Czar magii powszechnej: Głos kaznodziei", "uzupelnic")
    val magiaPowszechnaKrwistyPlomien = Skill("Czar magii powszechnej: Krwisty płomień", "uzupelnic")
    val magiaPowszechnaMagicznaBron = Skill("Czar magii powszechnej: Magiczna broń", "uzupelnic")
    val magiaPowszechnaMagiczneZamkniecie = Skill("Czar magii powszechnej: Magiczne zamknięcie", "uzupelnic")
    val magiaPowszechnaMagicznyAlarm = Skill("Czar magii powszechnej: Magiczny alarm", "uzupelnic")
    val magiaPowszechnaMocnePostanowienie = Skill("Czar magii powszechnej: Mocne postanowienie", "uzupelnic")
    val magiaPowszechnaPalecBozy = Skill("Czar magii powszechnej: Palec boży", "uzupelnic")
    val magiaPowszechnaPancerzEteru = Skill("Czar magii powszechnej: Pancerz Eteru", "uzupelnic")
    val magiaPowszechnaPeta = Skill("Czar magii powszechnej: Pęta", "uzupelnic")
    val magiaPowszechnaPieknaMaska = Skill("Czar magii powszechnej: Piękna maska", "uzupelnic")
    val magiaPowszechnaPobranieMocy = Skill("Czar magii powszechnej: Pobranie mocy", "uzupelnic")
    val magiaPowszechnaPodniebnyChod = Skill("Czar magii powszechnej: Podniebny chód", "uzupelnic")
    val magiaPowszechnaPowstrzymanieMutacji = Skill("Czar magii powszechnej: Powstrzymanie mutacji", "uzupelnic")
    val magiaPowszechnaPrzeskok = Skill("Czar magii powszechnej: Przeskok", "uzupelnic")
    val magiaPowszechnaRozproszenieMagii = Skill("Czar magii powszechnej: Rozproszenie magii", "uzupelnic")
    val magiaPowszechnaSlubowanie = Skill("Czar magii powszechnej: Ślubowanie", "uzupelnic")
    val magiaPowszechnaUcienie = Skill("Czar magii powszechnej: Uciszenie", "uzupelnic")
    val magiaPowszechnaWazila = Skill("Czar magii powszechnej: Wazila", "uzupelnic")
    val magiaPowszechnaWiezn = Skill("Czar magii powszechnej: Więź", "uzupelnic")
    val magiaPowszechnaWspinacz = Skill("Czar magii powszechnej: Wspinacz", "uzupelnic")
    val magiaPowszechnaWstrzas = Skill("Czar magii powszechnej: Wstrząs", "uzupelnic")
    val magiaPowszechnaWytlumienie = Skill("Czar magii powszechnej: Wytłumienie", "uzupelnic")
    val magiaTajemnaTradycjaPlomienia = Skill("Aqshy - Tradycja Płomienia", "Dostęp do magii ognia, płomieni i gorąca")
    val magiaTajemnaTradycjaMetalu = Skill("Chamon - Tradycja Metalu", "Dostęp do magii metalu i transmutacji")
    val magiaTajemnaTradycjaZwierzat = Skill("Ghur - Tradycja Zwierząt", "Dostęp do magii dzikiej natury i kontroli zwierząt")
    val magiaTajemnaTradycjaZycia = Skill("Ghyran - Tradycja Życia", "Dostęp do magii wzrostu, leczenia i wody")
    val magiaTajemnaTradycjaSwiatla = Skill("Hysh - Tradycja Światła", "Dostęp do magii ochronnej i oczyszczającej")
    val magiaTajemnaTradycjaSmierci = Skill("Shyish - Tradycja Śmierci", "Dostęp do magii umierających i duchów")
    val magiaTajemnaTradycjaNiebios = Skill("Azyr - Tradycja Niebios", "Dostęp do magii wróżbiarskiej i kontroli pogody")
    val magiaTajemnaTradycjaCienia = Skill("Ulgu - Tradycja Cienia", "Dostęp do magii iluzji i manipulacji umysłem")
    val magiaCzarownicTradycjaWiedzm = Skill("Tradycja Wiedźm", "Dostęp do magii duchów")
    val magiaCzarownicTradycjaLodu = Skill("Tradycja Lodu", "Dostęp do magii lodu")
}
object KnightSkills {
    val cnotaRycerskosci = Skill("Cnota rycerskości", "Możliwość otrzymania błogosławieństwa po modlitwie")
    val cnotaDoskonalosci = Skill("Cnota doskonałości", "+1A jak przeciwnik ma przewagę liczebną")
    val cnotaDyscypliny = Skill("Cnota dyscypliny", "Ignorowanie modyfikatorów do WW u przeciwników wynikających z przewagi")
    val cnotaMestwa = Skill("Cnota męstwa", "Obrażenia powyżej 10 są traktowane jako trafienie krytyczne")
    val cnotaOpanowania = Skill("Cnota opanowania", "Przerzut przy nieudanym teście strachu, grozy lub przeciwko zastraszaniu")
    val cnotaPoboznosci = Skill("Cnota pobożności", "+1 Pkt szczęścia i błogosławieństwo bez konieczności modlitwy")
    val cnotaPokory = Skill("Cnota pokory", "Bez magicznych artefaktów i tylko koń. Oręż staje się magiczny i -1 do otzymanego krytyka")
    val cnotaSlusznegoGniewu = Skill("Cnota słusznego gniewu", "Po udanej szarży dodatkowy atak natychmiastowy")
    val cnotaSprawiedliwosci = Skill("Cnota sprawiedliwości", "+10 do ogd z pospólstwem bretońskim")
    val cnotaSprawnosciBojowej = Skill("Cnota sprawności bojowej", "+10 WW w walce kopią")
    val cnotaSzlachetnosci = Skill("Cnota szlachetności", "+10 WW przeciw isotą które użyły broni zasięgowej przeci niemu, -10US na stałe")
    val cnotaWiernosci = Skill("Cnota wierności", "3x kompanów(wybranych jednorazowo) dostaje +5WW. -10WW jak któregoś brakuje w bitwie dla rycerza")
    val cnotaWyszkolenia = Skill("Cnota wyszkolenia", "+1 obrażeń przeciwko wyzwanemu rycerzowi, który przyjął wyzwanie")
    val cnotaZrecznosci = Skill("Cnota zręczności", "W walce z silniejszym przeciwnikiem używa się jego Siły")
    val cnotaZuchwalosci = Skill("Cnota zuchwałości", "Szarża jako akcja pojedyńcza, +1 obrażeń celowi")
    val cnotaWyprawyRycerskiej = Skill("Cnota wyprawy rycerskiej", "-50WW w walce kopią, 1k10 Żyw za 1pkt szczęścia")
    val blogoslawienstwoDoskonalosci = Skill("Błogosławieństwo doskonałości", "+5WW, +5K")
    val blogoslawienstwoDyscypliny = Skill("Błogosławieństwo dyscypliny", "+1A do ataków wielokrotnych przeciwko dwóm przeciwnikom +")
    val blogoslawienstwoMestwa = Skill("Błogosławieństwo męstwa", "Ignorowanie pancerza o ile bez ignorowania zadanoby obrażenia")
    val blogoslawienstwoOpanowania = Skill("Błogosławieństwo opanowania", "Odporność na strach, grozę i zastraszanie, 20do odporności na magię umysłu")
    val blogoslawienstwoPoboznosci = Skill("Błogosławieństwo pobożności", "Zawsze ma 1 wybrane błogosławieństwo")
    val blogoslawienstwoPokory = Skill("Błogosławieństwo pokory", "Można zamienić cyfry na wyniku k100 po otrzymaniu krytyka")
    val blogoslawienstwoSlusznegoGniewu = Skill("Błogosławieństwo słusznego gniewu", "Szarża z atakiem wielokrotnym, każdy atak +10WW")
    val blogoslawienstwoSprawiedliwosci = Skill("Błogosławieństwo sprawiedliwości", "Rycerz po teście strachu/grozy ochrania podległych chłopów. Za 2pkt szcz. dostają jego błogosławieństwo")
    val blogoslawienstwoSprawnosciBojowej = Skill("Błogosławieństwo sprawności bojowej", "kopia +2pkt obrażeń/+3 jeśli była magiczna. Staje sie magiczna i nie jest już ciężka")
    val blogoslawienstwoSzlachetnosci = Skill("Błogosławieństwo szlachetności", "2x siła krytyka przeciwko przeciwnikowi który użył US przeciw rycerzowi lub towarzyszom")
    val blogoslawienstwoWiernosci = Skill("Błogosławieństwo wierności", "3x kompanów(wybranych jednorazowo) dostaje +1A,10K. -10K,Odp jak któregoś brakuje w bitwie dla rycerza")
    val blogoslawienstwoWyszkolenia = Skill("Błogosławieństwo wyszkolenia", "-30WW dla rycerza lub wroga jeśli chcą trafić kogoś innego podczas pojedynku. +10 Odp dla rycerza w walce")
    val blogoslawienstwoZrecznosci = Skill("Błogosławieństwo zręczności", "Brak obrażeń jeśli nie zadał ich przeciwnikowi - przestaje działać jeśli przez turę rycerz tylko się bronił")
    val blogoslawienstwoZuchwalosci = Skill("Błogosławieństwo zuchwałości", "2 szarże w rundzie")
}

object RuneSkills {
    val runaSzybkosci = Skill("Runa szybkości", "+1k10 inicjatywy / 1x")
    val runaCiosu = Skill("Runa ciosu", "+10WW / 1 tura")
    val runaOchrony = Skill("Runa ochrony", "+10SW przeciw magii / 1 tura")
    val runaKamienia = Skill("Runa kamienia", "+1PZ na zbroi / 1 tura")
    val runaKrzywd = Skill("Runa krzywd", "Przerzut przeciw wybranemu przeciwnikowi / 1 tura")
    val runaRozproszeniaCzaru = Skill("Runa rozproszenia czaru", "brak trwałej / Rozproszenie magii wykuwanie -10/mag czarodzieja")
    val runaOslony = Skill("Runa oslony", "Siła broni dystansowej przeciwko noszącemu = 0 / 1 tura")
    val runaSily = Skill("Runa sily", "+1 do obrażeń od broni z tą runą / 1 tura")
    val runaMocy = Skill("Runa mocy", "2xS przeciw przeciwniką z Odp > 49 / 1 tura")
    val runaZelaza = Skill("Runa żelaza", "Osłabienie ataków o 1 / 1 tura")
    val runaPrzeznaczenia = Skill("Runa przeznaczenia", "brak trwałej / Powstrzymanie trafienia krytycznego")
    val runaOgnia = Skill("Runa ognia", "+1 obr od ognia / 1 tura")
    val runaPieca = Skill("Runa pieca", "Odporność na ogień / 1 tura")
    val runaZywotnosci = Skill("Runa żywotności", "Daje 4 pkt żywotności / 1 tura")
    val runaWytrzymalosci = Skill("Runa wytrzymałości", "test Odp -5 za każdy stracony pkt życia. Sukces = ignorowanie obrażeń / 1 tura")
    val runaFurii = Skill("Runa furii", "+1A / 1 tura")
    val runaSzczescia = Skill("Runa szczęścia", "Dodatkowy pkt szczęścia dziennie / 1 dzień")
    val runaZdlawieniaMagii = Skill("Runa zdławienia magii", "brak trwałej / Rozprasza magię i uniemożliwia jej odnowienie przez 24h")
    val mistrzowskaRunaRzutu = Skill("Mistrzowska runa rzutu", "+1k10 inicjatywy / 1x")
    val mistrzowskaRunaSzybkosci = Skill("Mistrzowska runa szybkości", "+10WW / 1 tura")
    val mistrzowskaRunaZlosliwosci = Skill("Mistrzowska runa złośliwości", "+10SW przeciw magii / 1 tura")
    val mistrzowskaRunaDiamentu = Skill("Mistrzowska runa diamentu", "+1PZ na zbroi / 1 tura")
    val mistrzowskaRunaStrzaskania = Skill("Mistrzowska runa strzaskania", "Przerzut przeciw wybranemu przeciwnikowi / 1 tura")
    val mistrzowskaRunaTlumieniaMagii = Skill("Mistrzowska runa tłumienia magii", "brak trwałej / Rozproszenie magii wykuwanie -10/mag czarodzieja")
    val mistrzowskaRunaZwiazaniaMagii = Skill("Mistrzowska runa związania magii", "Siła broni dystansowej przeciwko noszącemu = 0 / 1 tura")
    val mistrzowskaRunaAlaryka = Skill("Mistrzowska runa Alaryka Szalonego", "+1 do obrażeń od broni z tą runą / 1 tura")
    val mistrzowskaRunaStali = Skill("Mistrzowska runa stali", "2xS przeciw przeciwniką z Odp > 49 / 1 tura")
    val mistrzowskaRunaZwatpienia = Skill("Mistrzowska runa zwątpienia", "Osłabienie ataków o 1 / 1 tura")
    val mistrzowskaRunaSnorriego = Skill("Mis. runa Snorriego Lśniącego Hełmu", "brak trwałej / Powstrzymanie trafienia krytycznego")
    val mistrzowskaRunaGromrilu = Skill("Mistrzowska runa gromrilu", "+1 obr od ognia / 1 tura")
    val mistrzowskaRunaSkalfa = Skill("Mis. runa Skalfa Czarnego Młota", "Odporność na ogień / 1 tura")
    val mistrzowskaRunaWladzyKrolewskiej = Skill("Mistrzowska runa władzy królewskiej", "Daje 4 pkt żywotności / 1 tura")
}


// Mapa przypisująca zdolnosci do odpowiednich grup
val skillCategoryMap = mapOf(
    "Common" to setOf(
        CommonSkills.artylerzysta,
        CommonSkills.bezksztaltny,
        CommonSkills.bezrozumny,
        CommonSkills.biegPoScianach,
        CommonSkills.bijatyka,
        CommonSkills.blyskawicznePrzadowanie,
        CommonSkills.blyskawicznyJezdziec,
        CommonSkills.blyskawicznyBlok,
        CommonSkills.brawura,
        CommonSkills.bronNaturalna,
        CommonSkills.bystryWzrok,
        CommonSkills.chirurgia,
        CommonSkills.chodu,
        CommonSkills.cialoksztaltowanie,
        CommonSkills.czarnoksiestwo,
        CommonSkills.czarostwo,
        CommonSkills.czarnyGlod,
        CommonSkills.czlowiekGuma,
        CommonSkills.czulySluch,
        CommonSkills.czulyWech,
        CommonSkills.demonicznaAura,
        CommonSkills.dodatkoweZaklecie,
        CommonSkills.dotykMocy,
        CommonSkills.dziecieGor,
        CommonSkills.eteryczny,
        CommonSkills.etykieta,
        CommonSkills.geniuszArytmetyczny,
        CommonSkills.grotolaz,
        CommonSkills.grozny,
        CommonSkills.gusla,
        CommonSkills.intrygant,
        CommonSkills.inzynieriaSpaczeniowa,
        CommonSkills.kontrolowanaMutacja,
        CommonSkills.krasnoludzkifach,
        CommonSkills.krasomowstwo,
        CommonSkills.krzepki,
        CommonSkills.latanie,
        CommonSkills.lewitacja,
        CommonSkills.lotrzyk,
        CommonSkills.luski1,
        CommonSkills.luski2,
        CommonSkills.luski3,
        CommonSkills.luski4,
        CommonSkills.luski5,
        CommonSkills.medytacja,
        CommonSkills.mieczRodowy,
        CommonSkills.mierzonyCios,
        CommonSkills.mistrzTresury,
        CommonSkills.morderczyAtak,
        CommonSkills.morderczyPocisk,
        CommonSkills.nasladowca,
        CommonSkills.niekompletny,
        CommonSkills.niepokojacy,
        CommonSkills.nieustraszony,
        CommonSkills.obiezyswiat,
        CommonSkills.oburecznosc,
        CommonSkills.odpornoscNaChaos,
        CommonSkills.odpornoscNaChoroby,
        CommonSkills.odpornoscNaMagie,
        CommonSkills.odpornoscNaTrucizny,
        CommonSkills.odpornoscPsychiczna,
        CommonSkills.odwaga,
        CommonSkills.ogluszenie,
        CommonSkills.oporny,
        CommonSkills.ozywieniec,
        CommonSkills.pancerzWiary,
        CommonSkills.poliglota,
        CommonSkills.polityk,
        CommonSkills.poteznyCios,
        CommonSkills.przemawianie,
        CommonSkills.przerazajacy,
        CommonSkills.rozbrajanie,
        CommonSkills.silnyCios,
        CommonSkills.skavenskiKonstrukt,
        CommonSkills.straszny,
        CommonSkills.strzalMierzony,
        CommonSkills.strzalPrecyzyjny,
        CommonSkills.strzalPrzebijajacy,
        CommonSkills.szalBojowy,
        CommonSkills.szczescie,
        CommonSkills.szostyZmysl,
        CommonSkills.sztukaCichejSmierci,
        CommonSkills.szybkieWyciagniecie,
        CommonSkills.talentArtystyczny,
        CommonSkills.tobarskiPilot,
        CommonSkills.ulicznik,
        CommonSkills.uodpornionyNaChaos,
        CommonSkills.urodzonyWspinacz,
        CommonSkills.walkaOgonem,
        CommonSkills.warzenieZarazy,
        CommonSkills.wedrowiec,
        CommonSkills.widzenieWCiemnosci,
        CommonSkills.woltyzerka,
        CommonSkills.wybraniecChaosu,
        CommonSkills.wyczucieKierunku,
        CommonSkills.wykrywaniePulapek,
        CommonSkills.wyostrzoneZmysly,
        CommonSkills.zapasy,
        CommonSkills.zapieklaNienawisc,
        CommonSkills.zaspiew,
        CommonSkills.zawodnyKonstrukt,
        CommonSkills.zelaznaWola,
        CommonSkills.zmyslMagii,
        CommonSkills.znajomoscRegionu,
        CommonSkills.zrodzonyWMorzu,
        CommonSkills.zylkaHandlowa,
    ),
    "Stats" to setOf(
        StatsSkills.bardzoSilny,
        StatsSkills.bardzoSzybki,
        StatsSkills.blyskotliwosc,
        StatsSkills.charyzmatyczny,
        StatsSkills.niezwykleOdporny,
        StatsSkills.opanowanie,
        StatsSkills.strzelecWyborowy,
        StatsSkills.szybkiRefleks,
        StatsSkills.twardziel,
        StatsSkills.urodzonyWojownik,
    ),
    "Weapon" to setOf(
        WeaponSkills.bronDwureczna,
        WeaponSkills.bronKawaleryjska,
        WeaponSkills.korbacze,
        WeaponSkills.kusze,
        WeaponSkills.dlugieLuki,
        WeaponSkills.bronMechaniczna,
        WeaponSkills.bronPalna,
        WeaponSkills.bronParujaca,
        WeaponSkills.proce,
        WeaponSkills.ostrzeJadowe,
        WeaponSkills.bronRzucana,
        WeaponSkills.bronSzermiercza,
        WeaponSkills.bronUnieruchamiajaca,
    ),
    "Magic" to setOf(
        MagicSkills.magiaProstaChaos,
        MagicSkills.magiaProstaGusla,
        MagicSkills.magiaProstaKaplanska,
        MagicSkills.magiaProstaSpaczeniowa,
        MagicSkills.magiaProstaLodu,
        MagicSkills.magiaProstaWiedzm,
        MagicSkills.magiaProstaTajemna,
        MagicSkills.magiaProstaManannitow,
        MagicSkills.magiaProstaMorrytow,
        MagicSkills.magiaProstaMyrmidian,
        MagicSkills.magiaProstaRanaldian,
        MagicSkills.magiaProstaShallyan,
        MagicSkills.magiaProstaSigmarytow,
        MagicSkills.magiaProstaTaalitow,
        MagicSkills.magiaProstaUlrykan,
        MagicSkills.magiaProstaVerenian,
        MagicSkills.magiaProstaZielarska,
        MagicSkills.magiaCzarnoksieskaChaos,
        MagicSkills.magiaCzarnoksieskaNagasha,
        MagicSkills.magiaCzarnoksieskaNekromacja,
        MagicSkills.magiaCzarnoksieskaNurgl,
        MagicSkills.magiaCzarnoksieskaSkrytosci,
        MagicSkills.magiaCzarnoksieskaSlaanesh,
        MagicSkills.magiaCzarnoksieskaSpaczenia,
        MagicSkills.magiaCzarnoksieskaTzeentch,
        MagicSkills.magiaCzarnoksieskaZarazy,
        MagicSkills.magiaKaplanskaDuchow,
        MagicSkills.magiaKaplanskaDazha,
        MagicSkills.magiaKaplanskaMannan,
        MagicSkills.magiaKaplanskaMorr,
        MagicSkills.magiaKaplanskaMyrmidia,
        MagicSkills.magiaKaplanskaRanald,
        MagicSkills.magiaKaplanskaSigmar,
        MagicSkills.magiaKaplanskaShallya,
        MagicSkills.magiaKaplanskaTaalRhyia,
        MagicSkills.magiaKaplanskaKhaina,
        MagicSkills.magiaKaplanskaUlryk,
        MagicSkills.magiaKaplanskaTora,
        MagicSkills.magiaKaplanskaUrsuna,
        MagicSkills.magiaKaplanskaVerena,
        MagicSkills.magiaKaplanskaGunndreda,
        MagicSkills.magiaKaplanskaHandricha,
        MagicSkills.magiaPowszechnaAnatema,
        MagicSkills.magiaPowszechnaAzyl,
        MagicSkills.magiaPowszechnaBarieraCzystosci,
        MagicSkills.magiaPowszechnaBarieraDuchow,
        MagicSkills.magiaPowszechnaDotykNaOdleglosc,
        MagicSkills.magiaPowszechnaEgzorcyzm,
        MagicSkills.magiaPowszechnaGlosKaznodziei,
        MagicSkills.magiaPowszechnaKrwistyPlomien,
        MagicSkills.magiaPowszechnaMagicznaBron,
        MagicSkills.magiaPowszechnaMagiczneZamkniecie,
        MagicSkills.magiaPowszechnaMagicznyAlarm,
        MagicSkills.magiaPowszechnaMocnePostanowienie,
        MagicSkills.magiaPowszechnaPalecBozy,
        MagicSkills.magiaPowszechnaPancerzEteru,
        MagicSkills.magiaPowszechnaPeta,
        MagicSkills.magiaPowszechnaPieknaMaska,
        MagicSkills.magiaPowszechnaPobranieMocy,
        MagicSkills.magiaPowszechnaPodniebnyChod,
        MagicSkills.magiaPowszechnaPowstrzymanieMutacji,
        MagicSkills.magiaPowszechnaPrzeskok,
        MagicSkills.magiaPowszechnaRozproszenieMagii,
        MagicSkills.magiaPowszechnaSlubowanie,
        MagicSkills.magiaPowszechnaUcienie,
        MagicSkills.magiaPowszechnaWazila,
        MagicSkills.magiaPowszechnaWiezn,
        MagicSkills.magiaPowszechnaWspinacz,
        MagicSkills.magiaPowszechnaWstrzas,
        MagicSkills.magiaPowszechnaWytlumienie,
        MagicSkills.magiaTajemnaTradycjaPlomienia,
        MagicSkills.magiaTajemnaTradycjaMetalu,
        MagicSkills.magiaTajemnaTradycjaZwierzat,
        MagicSkills.magiaTajemnaTradycjaZycia,
        MagicSkills.magiaTajemnaTradycjaSwiatla,
        MagicSkills.magiaTajemnaTradycjaSmierci,
        MagicSkills.magiaTajemnaTradycjaNiebios,
        MagicSkills.magiaTajemnaTradycjaCienia,
        MagicSkills.magiaCzarownicTradycjaWiedzm,
        MagicSkills.magiaCzarownicTradycjaLodu,
    ),
    "Knight" to setOf(
        KnightSkills.cnotaRycerskosci,
        KnightSkills.cnotaDoskonalosci,
        KnightSkills.cnotaDyscypliny,
        KnightSkills.cnotaMestwa,
        KnightSkills.cnotaOpanowania,
        KnightSkills.cnotaPoboznosci,
        KnightSkills.cnotaPokory,
        KnightSkills.cnotaSlusznegoGniewu,
        KnightSkills.cnotaSprawiedliwosci,
        KnightSkills.cnotaSprawnosciBojowej,
        KnightSkills.cnotaSzlachetnosci,
        KnightSkills.cnotaWiernosci,
        KnightSkills.cnotaWyszkolenia,
        KnightSkills.cnotaZrecznosci,
        KnightSkills.cnotaZuchwalosci,
        KnightSkills.cnotaWyprawyRycerskiej,
        KnightSkills.blogoslawienstwoDoskonalosci,
        KnightSkills.blogoslawienstwoDyscypliny,
        KnightSkills.blogoslawienstwoMestwa,
        KnightSkills.blogoslawienstwoOpanowania,
        KnightSkills.blogoslawienstwoPoboznosci,
        KnightSkills.blogoslawienstwoPokory,
        KnightSkills.blogoslawienstwoSlusznegoGniewu,
        KnightSkills.blogoslawienstwoSprawiedliwosci,
        KnightSkills.blogoslawienstwoSprawnosciBojowej,
        KnightSkills.blogoslawienstwoSzlachetnosci,
        KnightSkills.blogoslawienstwoWiernosci,
        KnightSkills.blogoslawienstwoWyszkolenia,
        KnightSkills.blogoslawienstwoZrecznosci,
        KnightSkills.blogoslawienstwoZuchwalosci,
    ),
    "Rune" to setOf(
        RuneSkills.runaSzybkosci,
        RuneSkills.runaCiosu,
        RuneSkills.runaOchrony,
        RuneSkills.runaKamienia,
        RuneSkills.runaKrzywd,
        RuneSkills.runaRozproszeniaCzaru,
        RuneSkills.runaOslony,
        RuneSkills.runaSily,
        RuneSkills.runaMocy,
        RuneSkills.runaZelaza,
        RuneSkills.runaPrzeznaczenia,
        RuneSkills.runaOgnia,
        RuneSkills.runaPieca,
        RuneSkills.runaZywotnosci,
        RuneSkills.runaWytrzymalosci,
        RuneSkills.runaFurii,
        RuneSkills.runaSzczescia,
        RuneSkills.runaZdlawieniaMagii,
        RuneSkills.mistrzowskaRunaRzutu,
        RuneSkills.mistrzowskaRunaSzybkosci,
        RuneSkills.mistrzowskaRunaZlosliwosci,
        RuneSkills.mistrzowskaRunaDiamentu,
        RuneSkills.mistrzowskaRunaStrzaskania,
        RuneSkills.mistrzowskaRunaTlumieniaMagii,
        RuneSkills.mistrzowskaRunaZwiazaniaMagii,
        RuneSkills.mistrzowskaRunaAlaryka,
        RuneSkills.mistrzowskaRunaStali,
        RuneSkills.mistrzowskaRunaZwatpienia,
        RuneSkills.mistrzowskaRunaSnorriego,
        RuneSkills.mistrzowskaRunaGromrilu,
        RuneSkills.mistrzowskaRunaSkalfa,
        RuneSkills.mistrzowskaRunaWladzyKrolewskiej,
    )
)

// Funkcja sprawdzająca kategorię zdolnosci
fun getSkillCategory(skill: Skill): String {
    return skillCategoryMap.entries.find { it.value.contains(skill) }?.key ?: "Unknown"
}
