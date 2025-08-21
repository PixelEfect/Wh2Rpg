package com.dd.rpgcardapp.data

data class ProfessionDescription(
    val quote: String,
    val description: String,
)

object ProfessionDescriptions {
    val descriptions: Map<Profession, ProfessionDescription> = mapOf(
        BasicProfessions.Akolita to ProfessionDescription(
            quote = "Wiara nie jest dana za darmo. Trzeba ją sobie zasłużyć. Próbuję to uczynić od wielu lat.",
            description = "Religia zeszła na drugi plan w życiu wielu mieszkańców Starego Świata, ustępując miejsca pieniądzom, lecz wciąż istnieje wielu młodych mężczyzn i kobiet gotowych poświęcić swoje życie bogom. Aby zostać Kapłanem, potrzebne są ogromne poświęcenie i szkolenie. Inicjaci są kapłanami w trakcie nauki. Poddawani są surowej edukacji pod okiem wymagających nauczycieli i dopóki nie ukończą szkolenia, nie mają prawa głosić kazań ani prowadzić obrzędów. Ich nauka obejmuje czytanie i pisanie, kaligrafię, studiowanie pism świętych oraz sztukę kaznodziejstwa. Uczą się także podstaw posługiwania się bronią, aby móc bronić świątyni w razie potrzeby.",
        ),
        BasicProfessions.AkolitaKultuKhorna to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.AkolitaKultuNurgla to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.AkolitaKultuSlaanesha to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.AkolitaKultuTzeentcha to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Aptekarz to ProfessionDescription(
            quote = "„Dwie części alkoholu, jedna część sproszkowanego niedźwiedziego zęba i jedna część pasty z flegmoberu. Napawaj stałe składniki aż pojawią się bąbelki, a następnie odparuj alkohol. Doda ci to siły w ramionach na dobrą godzinę, jeśli tylko wytrzymasz skurcze.”",
            description = "Podczas gdy lekarze przepisują leki na różne dolegliwości pacjentów, to aptekarz faktycznie przygotowuje medykamenty. Specjalizując się w minerałach, chemikaliach i solach pochodzenia organicznego, aptekarz miesza proszki do spożycia z winem, maści do nakładania na zakażone miejsca oraz lecznicze kadzidła do odstraszania szkodliwych oparów. Prawo cechowe pozwala im przepisywać leki na drobne dolegliwości, takie jak przeziębienie czy ból brzucha, ale niewielu to robi, ponieważ wielu lekarzy niechętnie patrzy na konkurencję. Niektórzy aptekarze przechodzą do wyższych karier w medycynie lub nauce, inni wykorzystują swoją wiedzę dla osobistej chciwości lub ulegają pragnieniu szkodzenia innym. Niektórzy aptekarze znani są z tego, że podają swoim klientom środki w przebraniu lekarstwa, zmuszając ich do powrotu i płacenia wyższych cen dla podtrzymania uzależnienia, podczas gdy inni sprzedają swoje usługi jako truciciele, dzieląc zyski z poszkodowaną wdową lub spadkobiercą."
        ),
        BasicProfessions.Bagiennik to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Bajarz to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Balsamista to ProfessionDescription(
            quote = "Tak piękna, tak doskonała… Spójrzcie tylko na tę skórę. Zachowała całe ciepło, całą giętkość, którą miała za życia. To niemal tak, jakby wasza ukochana wciąż żyła, panie.",
            description = "Nie każdy pragnie spoczynku w Ogrodach Morra. Niektórzy wolą po śmierci poddać się procesowi konserwacji – czy to dla siebie, czy dla swych zwierzęcych towarzyszy – i wtedy zwracają się do balsamistów. Ci mistrzowie peklowania, konserwacji i taksydermii nie są już jedynie kaprysem bogaczy. Coraz częściej mają swój udział w rozwijającej się medycynie, a fortuna czeka na tych, którzy potrafią sprzedać swe osobliwe wyroby klientom o szczególnych potrzebach. Wielu kapłanów Morra (i znaczna część społeczeństwa) uważa jednak odcinanie fragmentów ciała i zamykanie ich w słoikach za obrazę zarówno dla ciała, jak i duszy zmarłego, a Łowcy Czarownic dobrze wiedzą, jak łatwo tacy handlarze mogą skłonić się ku mrocznym sztukom. Dlatego wielu balsamistów ukrywa ludzkie preparaty za wystawami zwierzęcymi lub usługami chirurgicznymi, czekając na dzień, w którym nauka ich poziomu wreszcie zyska należny szacunek i uznanie. Balsamiści zazwyczaj nie mają do czynienia z Nieumarłymi, ale ściśle współpracują z hienami cmentarnymi i rabusiami grobowców, którzy już ich spotykają. Zazwyczaj też dobrze znają nekromantów – choć, rzecz jasna, nigdy nie ujawniliby tożsamości swoich klientów."
        ),
        BasicProfessions.Banita to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.BerserkerZNorski to ProfessionDescription(
            quote = "Nie gniewaj Skorriego. Nie tak jak kiedy gniewny. Zapłać teraz.",
            description = "Norsca to ponura północna kraina pełna złowrogich bestii, takich jak Trolle Lodowe i Potwory Chaosu, która wyhodowała twardych wojowników. Berserkerzy są słusznie budzącym strach kultem wojowników. Wchodzą do bitwy bez zbroi, aby udowodnić, że nie znają strachu. Wzbudzają w sobie niesamowitą furię, często gryząc własne tarcze. Ich wyczyny opisują sagi i pozostają w pamięci żołnierzy Imperium, którzy ich spotkali. Nieliczni berserkerzy trafiają do Cesarstwa, bo zostali wygnani lub chcą zobaczyć więcej świata. Rzadko pozostają w jednym miejscu, gdyż żaden strażnik nie chce mieć przy sobie wściekłego szaleńca. Berserkerzy są wysoko cenionymi najemnikami ze względu na swoją rzadkość i skuteczność.",
        ),
        BasicProfessions.BlednyRycerz to ProfessionDescription(
            quote = "Nie słyszałeś o mnie ani o moich wielkich czynach? Pozwól, że to naprawię.",
            description = "Rycerze Imperium rozpoczynają swoją karierę jako giermkowie, służąc innym rycerzom i nie pełniąc większej roli niż zwykli słudzy. Czego innego można oczekiwać od narodu, który zapomniał prawdziwego znaczenia rycerskości, honoru i odwagi? W Bretonnii natomiast rycerze rozpoczynają swą drogę samodzielnie, wyruszając na tournee erranckie. Tam uczą się w najlepszej szkole – poprzez prawdziwe doświadczenie. Początkowo brak im praktyki, lecz nadrabiają to zapałem i entuzjazmem. Rycerze Errant wędrują szeroko, często samotnie, poszukując niebezpieczeństw, w których mogą dowieść swej wartości. Z tego powodu można ich spotkać w całym Starym Świecie – czasem ku rozpaczy jego mieszkańców.",
        ),
        BasicProfessions.BylySkazaniec to ProfessionDescription(
            quote = "Och tak, panie, jestem całkowicie naprawiony. Nauczyłem się lekcji, mój panie. Od teraz będą mnie nazywać Uczciwy Rickard, strewth.",
            description = "Więzienia Starego Świata to brutalne podkrainy same w sobie, gdzie przetrwają tylko najsilniejsi i bezwzględni. Spośród nielicznych skazanych, którzy przeżyją swoje wyroki, większość powraca do społeczeństwa jako bardziej bezwzględni przestępcy niż przed uwięzieniem. Shallyanie mogą głosić nauki o przebaczeniu i drugich szansach, ale prawda jest taka, że rzadki były więzień, który uda się poprawić, spotyka się z taką samą podejrzliwością i niechęcią jak ci, którzy się nie poprawili. W końcu większość byłych skazanych zostaje wypuszczona do nieprzyjaznego świata, z niewieloma możliwościami poza popełnianiem nowych przestępstw, powrotem do więzienia i rozpoczęciem cyklu od nowa."
        ),
        BasicProfessions.Cenobita to ProfessionDescription(
            quote = "Cierpienie? Tak, to najsłodsza lekcja, jakiej można się nauczyć. A ja nauczyłem się jej dobrze.",
            description = "Zenobici żyją w wspólnotach, zwykle nazywanych klasztorami, i podążają za radami lidera. Lider jest często charyzmatyczny, lecz równie często szalony. Przynajmniej są fanatycznymi wyznawcami bardzo osobistej wizji prawdy (oszuści nie osiedlają się na Ziemiach Granicznych). Większość Zenobitów to ludzie; członkowie innych ras rzadko wykazują zainteresowanie, choć większość klasztorów przyjęłaby ich, gdyby poprosili. Niechciane dzieci czasem zostają pozostawione na progu klasztorów. Te dzieci są przyjmowane; ci, którzy nie uciekają, zostają zaakceptowani jako Zenobici. Większość ucieka."
        ),
        BasicProfessions.Chlop to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.CiuraObozowa to ProfessionDescription(
            quote = "Na marszu musi być strasznie zimno i samotnie. Mogę pomóc w obu tych sprawach.",
            description = "W Imperium armie ciągle się przemieszczają. Siły obejmują od lokalnych jednostek milicji przeszukujących lasy w poszukiwaniu bandytów po pełną zbrojną potęgę Cesarza stawiającego czoła Zielonoskórym lub siłom Chaosu. Żadna armia nie podróżuje samotnie. Za armią zawsze podąża karawana obozowych towarzyszy. Są to drobni handlarze chcący dorobić, wojenne wdowy szukające zarobku przy gotowaniu lub szyciu oraz grabieżcy ciał mający nadzieję na zdobycie łupów na polach bitew. Choć pogardzani przez szlacheckich dowódców wielu armii, obozowi towarzysze zapewniają kluczowe wsparcie dla żołnierzy w polu."
        ),
        BasicProfessions.Cyrkowiec to ProfessionDescription(
            quote = "Pozwólcie, że urzeknę was moją czarującą wersją *Siedmiu Tańczących Krasnoludów*.",
            description = "Od akrobatów po siłaczy, od nożowników po hipnotyzerów, od tancerzy po brzuchomówców – Imperium pełne jest Artystów. Jedni robią to dla aplauzu tłumu, inni dla pieniędzy. Wielu zostaje artystami, by uciec od trudnego życia cesarskiego wieśniaka. Artyści często podróżują – czasem samotnie, lecz częściej w trupach występujących w wsiach, miasteczkach i miastach. Szczęśliwe trupy dostają ciągłe angaże, spędzając niekiedy całe miesiące w jednym miejscu. Mniej szczęśliwi klepią biedę, wciąż szukając bardziej wdzięcznej publiczności (albo mniej podejrzliwej straży) za następnym wzgórzem. Najlepsi spośród artystów zdobywają patronat szlachty i zarabiają niewyobrażalne sumy, występując dla najwyższych warstw społeczeństwa."
        ),
        BasicProfessions.Cyrulik to ProfessionDescription(
            quote = "To nie zaboli wcale. Zanim zacznę, może chcesz przygryźć ten skórzany pasek.",
            description = "Cyrulicy zapewniają bolesne, ale skuteczne leczenie zwykłym ludziom Cesarstwa. Nie są tak wykształceni jak lekarze, którzy utrzymują własne gildie, ale sporo wiedzą o anatomii. Choć strzygą włosy i golą, bardziej znani są z upuszczania krwi, operacji i amputacji. Cyrulicy noszą różne ostre narzędzia, od małych skalpeli po ogromne piły kostne. Mają też narzędzia o jeszcze bardziej złowrogim wyglądzie do najgorzej znanych zajęć: stomatologii. Wiele dużych statków ma dedykowanego cyrulika w załodze; są też powszechni w miastach i miasteczkach."
        ),
        BasicProfessions.Czekista to ProfessionDescription(
            quote = "Czy to boli, towarzyszu? Przepraszam; czasem Sasha nie zna własnej siły. Wierz mi, że dowiem się, co przede mną ukrywasz; gdy to nastąpi, nasze następne spotkanie nie będzie już tak przyjemne.",
            description = "Głównym celem czekisty – tajnej policji Królowej Lodu – jest zapewnienie osobistego i politycznego bezpieczeństwa carowej i jej rodziny. Zadanie to realizowane jest wszelkimi możliwymi metodami, niezależnie od lokalnych praw; w końcu w Kislevie to, co czekista uzna za prawo, jest prawem. Techniki używane do badania różnych kultów Chaosu, rewolucjonistów, przestępców, wrogich organizacji, szpiegów i wielu innych „zagrożeń” bywają brutalne, przez co czekista cieszy się niepochlebną reputacją. Ich kwatera główna znajduje się w Kislev, ale krążą pogłoski, że posiadają biura w całym kraju, wszystkie przekazujące informacje do stolicy. Niektórzy sugerują, że czekistowie mają agentów nawet w Imperium i poza jego granicami, monitorujących działania zagranicznych zagrożeń dla Królowej Lodu i jej rządów; oczywiście jest to oficjalnie zaprzeczane."
        ),
        BasicProfessions.CzeladnikRun to ProfessionDescription(
            quote = "„Może za pięćdziesiąt lat uda mi się udoskonalić tę prostą runę, aby poznać głębsze tajemnice.”",
            description = "Runesmithowie to w istocie klan obejmujący kilka starych rodzin, które przekazywały wiedzę i umiejętności wytwarzania run z pokolenia na pokolenie. Każdy Mistrz Runesmith uczy podstaw ognia i kuźni młodych członków swojej rodziny, wybierając najbardziej utalentowanych, aby zostali Uczniami Runesmitha. Choć wybór jest wielkim zaszczytem, oznacza długie lata nauki i służby u swojego mistrza przy tworzeniu bardziej skomplikowanych run. Runesmithowie rzadko zapisują sekrety swojego rzemiosła, a gdy to robią, wiedza jest ukryta w zagadkach i łamigłówkach. Uczniowie muszą być cierpliwi, bystrzy i spostrzegawczy, aby awansować w hierarchii. W tym czasie Uczniowie Runesmitha często opuszczają służbę u swojego mentora, aby zdobywać składniki, narzędzia i materiały do kuźni nowych run."
        ),
        BasicProfessions.Doker to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Dylentant to ProfessionDescription(
            quote = "To przypomina mi coś ciekawego, co napisał von Halmith, i... Och! Czy to Kwiat Gryfa?",
            description = "Dyletanci lubią uważać się za uczonych i w istocie mogą za takich uchodzić w oczach większości ludzi – potrafią czytać i pisać, co już ich wyróżnia. Jednak często brakuje im dyscypliny i pasji, które pozwalają prawdziwym uczonym skupić się na jednym zagadnieniu i osiągnąć w nim mistrzostwo. Zamiast tego rozpraszają swoje wysiłki na wiele kierunków naraz. Większość dyletantów pochodzi z bogatych rodzin, gdyż bieda i groźba głodu zazwyczaj skutecznie skupiają umysł na praktyczniejszych sprawach. Dyletant szczyci się tym, że wie trochę o niemal wszystkim, zaczyna wiele projektów i rozwija tuzin zainteresowań jednocześnie. To zawodowy amator – ciekawi go sztuka, rodząca się nauka, literatura, religia i praktycznie każda inna dziedzina. Przynajmniej dopóki nie pojawi się kolejny temat, który skradnie jego uwagę."
        ),
        BasicProfessions.Fanatyk to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Flisak to ProfessionDescription(
            quote = "Szukasz przejażdżki w górę rzeki, proszę pana? My – mój kapitan i ja – możemy ci w tym pomóc, oczywiście za niewielką opłatą.",
            description = "Rzeki Imperium są życiowymi arterami komunikacji i handlu. Zapewniają szybki transport i łączą większość głównych miast w królestwie. Flisacy przemierzają te ruchliwe szlaki wodne, przewożąc pasażerów i towary w całym Imperium, a nawet do Kislevu. Chociaż rzeki są bezpieczniejsze niż ciemne leśne drogi, nie są pozbawione niebezpieczeństw. Wiele tras prowadzi przez dzikie tereny niezmienione przez cywilizację. Flisacy muszą być gotowi chronić swoje ładunki i pasażerów przed najeźdźcami i bandytami. Doświadczeni flisacy są twardzi i zaradni, równie biegli w obsłudze łodzi, nawigacji i walce."
        ),
        BasicProfessions.Gazeciarz to ProfessionDescription(
            quote = "Extra! Extra! Historia stulecia! Potwory sieją spustoszenie w Wissenland! Damy dobrej cnoty ścigane przez nieumarłych! Kultystów, dworzan i zbirów odpowiedzialnych! Czytajcie wszystko!",
            description = "Dawniej skrybowie mieli monopol na słowo pisane, ale zmieniło się to wraz z wynalezieniem prasy drukarskiej. Obecnie gazetki stały się powszechne w miastach Cesarstwa. Zwykle ukazują się raz dziennie i zawierają lokalne wiadomości oraz sensacyjne historie. Duża sensacja może doczekać się specjalnego wydania. Sprzedawcy gazetek chodzą po ulicach, ogłaszając najważniejsze nagłówki i starając się prześcignąć konkurencję w teatralności. W każdym mieście działa wielu wydawców, a rywalizacja między nimi bywa zaciekła. Nie jest rzadkością, że sprzedawcy walczą ze sobą na ulicach. Ironią jest to, że takie bójki często stają się głównym tematem gazet następnego dnia.",
        ),
        BasicProfessions.Giermek to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Gladiator to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Goniec to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Gornik to ProfessionDescription(
            quote = "Jeśli usłyszysz stukot, a nie pochodzi on od ciebie, najlepiej opuścić kopalnię i wrócić innym razem.",
            description = "Góry otaczają Cesarstwo. Na wschodzie znajdują się Góry Krańca Świata, na południu Góry Czarne, a na zachodzie Góry Szare. Krasnoludy i Ludzie eksploatują te góry od niepamiętnych czasów, mimo ciągłych ataków Goblinów i innych podziemnych potworów. Górnicy ryzykują w takich warunkach, poszukując żelaza, srebra, złota, kamieni szlachetnych i innych cennych surowców. Inni wolą poszukiwania na powierzchni, szczególnie w Górach Środkowych, które rozciągają się na prowincje Ostland i Hochland. Chociaż te zalesione góry znajdują się w granicach Cesarstwa, są schronieniem dla Trolli i Bestii Ludzkich.",
        ),
        BasicProfessions.Grabaz to ProfessionDescription(
            quote = "Sam Morr nie mógłby się prześlizgnąć obok mnie, by niepokoić tych grobów. Nie za mojej zmiany.",
            description = "W Starym Świecie obowiązki strażnika cmentarnego są ciężkie. Nie tylko musi grzebać zmarłych sześć stóp pod ziemią, ale także strzec przed tymi, którzy chcieliby zakłócić ich spoczynek – czy to szczury, zbieracze kości, grabarze, czy coś gorszego. W małych miastach i wsiach strażnik cmentarza nie może polegać na milicji ani Czarnej Gwardii Morra, by powstrzymać nieśmiertelnych lub głodne ghule. Niewielu docenia jego towarzystwo, bo niesie ze sobą zapach śmierci i przemokłej ziemi. Jest to samotne życie, ale wielu strażników cmentarzy woli towarzystwo zmarłych od żywych."
        ),
        BasicProfessions.Grabiezca to ProfessionDescription(
            quote = "Krew! Śmierć! Krew! Śmierć!",
            description = "Większość Nordów to wspaniali wojownicy, obdarzeni siłą w walce i dzikim usposobieniem, lecz marzeniem niemal każdego jest dołączyć do grona największych wojowników, stać się Mistrzem Chaosu i nosić znaki łaski swoich bogów. Dopóki nie udowodnią swojej wartości Mrocznym Bogom, są po prostu Plądrowcami (Marauderami). Większość Marauderów stanowi trzon Hord Chaosu. Gromadzą się pod sztandarami swoich Mistrzów, wspierając każdą sprawę, czy to polecenie bogów, czy wezwanie do bitwy. Poza udziałem w wielkiej armii spędzają czas na napadach na wsie Cesarstwa (w przypadku Marauderów z Węg plądrują regiony Hung). Są naturalnymi wojownikami, zahartowanymi przez surowy krajobraz i wychowanymi do walki. Wszystkich innych traktują z pogardą.",
        ),
        BasicProfessions.Guslarz to ProfessionDescription(
            quote = "Magia? Nic o tym nie wiem. Jestem tylko prostym zielarzem.",
            description = "Guslarz to osoby obdarzone zdolnościami magicznymi, które nie przeszły formalnego szkolenia w magii. Posługując się instynktem, szczęściem i przesądami, potrafią wykonywać drobne, wyspecjalizowane zaklęcia. Choć nie zawsze są tego świadomi, Hedge Wizardzy igrają z niebezpieczeństwem za każdym razem, gdy używają swoich uroków i czarów. Z tego powodu Łowcy Wiedźm chętnie tropią i egzekwują tych nieszczęśników, którzy zbyt często nieświadomie sprowadzają na świat demony i katastrofy. Niektórzy Hedge Wizardzy wybierają rozsądną drogę i dołączają do Zakonów Magii, podczas gdy inni ukrywają swój haniebny sekret."
        ),
        BasicProfessions.HienaCmentarna to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Kadet to ProfessionDescription(
            quote = "Sir! Tak jest, proszę pana! Natychmiast, proszę pana!",
            description = "Kadeci to oficerowie w trakcie szkolenia. Mogą uczęszczać do formalnych szkół, takich jak Akademie Orła, lub uczyć się bezpośrednio od oficerów w terenie. Choć kadeci uczą się walczyć, główny nacisk kładzie się na rozwój umiejętności przywódczych. Niektórzy pochodzą ze szlacheckich rodzin, ale nie jest to regułą. Ci, którzy zdobyli miejsce dzięki osiągnięciom na polu bitwy, cieszą się większym szacunkiem, ponieważ znają wojnę z własnego doświadczenia, a nie tylko z książek."
        ),
        BasicProfessions.Kanciarz to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Kartograf to ProfessionDescription(
            quote = "Hmm... Co za ciekawa anomalia. Szczegóły wybrzeża sugerują zatokę w tym odcinku. Może moglibyśmy tam wylądować, a ja mógłbym sporządzić mapę wnętrza?",
            description = "Kartografowie tworzą mapy dla bogatych mecenasów, wytrwałych odkrywców i kolekcjonerów. Towarzyszą ekspedycjom w dziczy, a także przekształcają nieudolne prace innych w bardziej czytelną formę. Mapy w Starym Świecie są notorycznie zawodnie – czy to badania lokalnych szlaków, ambitne przewodniki po regionach, czy w większości fikcyjne przedstawienia samego Starego Świata. Mimo to usługi kartografów wciąż cieszą się dużym popytem."
        ),
        BasicProfessions.Koczownik to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Kominiarz to ProfessionDescription(
            quote = "Nie jest tak źle, kiedy się wchodzi. To utknięcie w środku to już inna sprawa, tego nie lubię.",
            description = "W miastach i miasteczkach Imperium gospodarstwa domowe, które mogą sobie na to pozwolić, palą węglem drzewnym, aby odeprzeć zimowy chłód. Wiele gałęzi przemysłu również intensywnie wykorzystuje węgiel drzewny, szczególnie kuźnie w Nuln. Częste używanie zatkanych kominów powoduje wzrost zapotrzebowania na kominiarzy. Wielu z tych pracowników to dzieci, ale także krasnoludy i szczególnie szczupli mężczyźni. Pracując na dachach, oczyszczają kominy, usuwając przeszkody – zwykle sadzę, ale czasem, o wiele dziwniejsze rzeczy."
        ),
        BasicProfessions.Koniarz to ProfessionDescription(
            quote = "Oczywiście, że ten koń jest zdrowy, panie. Czyraki? Nie widzę żadnych… ach to; to tylko ukąszenia pcheł, szybko się zagoją. Wyraźnie znasz się na koniach; dorzucę świeży koc pod siodło i sakwy, jeśli kupisz tego wspaniałego zwierza teraz. Mam pilne spotkanie w innym mieście…",
            description = "Koniarze słyną z bycia nadętymi i nieuczciwymi. Każda stajnia wydaje się mieć uśmiechniętego handlarza oferującego „najlepszą końską krew na rynku, panie”, pochodzącą z „najsilniejszych linii Ostermarker Veldt, panie”. Ponieważ konie są centralnym elementem życia Kislevitów, rynek jest niezwykle konkurencyjny, a kupujący mają trudności ze znalezieniem uczciwego handlarza, szczególnie że wielu z nich stosuje podstępne triki, aby dokonać sprzedaży. Niektórzy nieuczciwi sprzedawcy malują gnijące zęby na biało, przedstawiają chore konie jako „nieśmiałe” i chlubnie twierdzą, że bezpłodne ogiery „spłodzą linię piękności, panie”. Jedynym miejscem, gdzie sprzedawcy koni nigdy nie sprzedają, są rzeźnie, choć są one dobrym źródłem zwierząt.",
        ),
        BasicProfessions.Korsarz to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.KozakKislevski to ProfessionDescription(
            quote = "Zachowamy trochę kwasu po walce, śpiewaj hej kalinka hej! Tylko przetrwaj noc, śpiewaj hej kalinka hej! Zimno na tyle, by pękały kamienie, śpiewaj hej kalinka hej! Jeszcze jeden kwas, by rozgrzać kości, śpiewaj hej kalinka hej!",
            description = "Kossarzy pierwotnie byli plemieniem Ungoli zamieszkującym północno-wschodnie tereny Cesarstwa. Lud wschodni zwany Gospodarami najechał ten region, podbił Ungoli i założył państwo Kislev. W trakcie tego konfliktu Kossarzy sprzedawali swoje umiejętności Gospodarom jako najemnicy, walcząc przeciwko innym plemionom Ungoli. Ich unikalny styl walki zrobił wrażenie na szlachcie Gospodarów, i od tego czasu pułki Kossarów służą carom Kislevu. Obecnie Kossarzy nie są już plemieniem, lecz twardą jednostką wojskową z całego Kislevu. Uzbrojeni w łuki i wielkie topory, są bardzo wszechstronni na polu bitwy. Wielu Kossarów, zmęczonych nieustannymi wojnami w swojej ojczyźnie, wyjeżdża do Cesarstwa jako najemnicy lub poszukiwacze przygód.",
        ),
        BasicProfessions.Latarnik to ProfessionDescription(
            quote = "Nie ma piękniejszego widoku niż słońce wschodzące nad ulicami Altdorfu… ach… pora spać!",
            description = "Największe miasta Imperium mają coś, czego nie spotka się nigdzie indziej w Starym Świecie: latarnie uliczne. Oświetlają one główne ulice i trakty, szczególnie w bogatszych dzielnicach. Altdorf był pierwszym miastem, które je zainstalowało, a te stojące wokół Pałacu Cesarza są wyjątkowo ozdobne. Latarnicy odpowiadają za ich utrzymanie i codzienne zapalanie o zmierzchu. Noszą ze sobą różne świece i zapałki, a niektórzy używają nawet wolno żarzących się lontów znanych z broni palnej. Mieszkańcy miast są dumni ze swoich latarni, traktując je jako symbol wyrafinowania i cywilizacji. Z uwagi na ogromne zagrożenie pożarowe w gęsto zabudowanych dzielnicach, przeszkadzanie latarnikowi jest karane śmiercią.",
        ),
        BasicProfessions.Lesnik to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Lowca to ProfessionDescription(
            quote = "Ścieżka jest stara, ale potrafię ją śledzić. Wracaj do obozu i rozpal ognisko. Dziś jemy królika.",
            description = "Chociaż Imperium rozwinęło się znacznie od czasów plemion, które je założyły 2500 lat temu, niektóre rzeczy pozostały niezmienne. Mimo że chłopi uprawiają ziemię, ogromne obszary Imperium wciąż pokrywają lasy lub są nieprzyjazne dla rolnictwa. To właśnie tam najlepiej czują się Łowcy i Traperzy. Korzystają z technik swoich przodków, by upolować zwierzynę – czy to przy użyciu pułapki, czy precyzyjnego strzału. Wymaga to umiejętności śledzenia dzikich zwierząt przy jednoczesnym unikaniu mrocznych stworzeń lasu. Łowcy w swoich skórzanych ubraniach i futrzanych czapkach mogą wydawać się nieokrzesani mieszczanom, ale niewiele sobie robią z tego, co inni o nich myślą.",
        ),
        BasicProfessions.LowcaNagrod to ProfessionDescription(
            quote = "Przyprowadzę cię z powrotem. Żywy, martwy – dla mnie bez różnicy. Więcej wart żywy, ale wydajesz się być tym, który nie podda się spokojnie. Niech będzie martwy.",
            description = "Łowcy Nagród zarabiają na życie, tropiąc poszukiwanych przestępców, bandytów i zbiegów, aby doprowadzić ich przed wymiar sprawiedliwości. Samotny Łowca Nagród może docierać tam, gdzie niezdarne jednostki wojskowe nie mają szans, co czyni go cennym wsparciem dla straży i milicji. Lokalne władze, gildie i rady płacą nagrody. Mogą uważać Łowców Nagród za odrażających, ale są skuteczną przeciwwagą dla zbójów, band Goblinów i podobnych zagrożeń. Łowcy Nagród to profesjonalni zabójcy, którzy przywiązują niewielką wartość do świętości życia. Są bezwzględni, wykorzystując swoje imponujące umiejętności do tropienia i eliminowania swoich celów. Biedni patrzą na nich ze strachem, gdyż niejednego Chłopa zabito i przedstawiono jako prawdziwego winowajcę. Władze uważają ich za konieczne zło, nigdy jednak za mile widziane."
        ),
        BasicProfessions.Mieszczanin to ProfessionDescription(
            quote = "Hmm? Czego potrzebujesz? Nie widzisz, że jestem teraz strasznie zajęty? To miasto samo się nie prowadzi.",
            description = "Mieszczanie stali się nową klasą obywateli w miastach Imperium. Burgherowie – lub ich przodkowie – wywędrowali z chłopstwa, by zbudować nowe życie w miastach. Teraz stanowią spoiwo miejskiego społeczeństwa. Są właścicielami sklepów, drobnymi kupcami, urzędnikami celnymi, handlarzami i lokalnymi urzędnikami. Nie są ani tak pogardzani jak chłopi, ani tak wywyższeni jak szlachta. Choć najbardziej cierpią z powodu zarazy, żyjąc w ciasno zabudowanych dzielnicach, nie zamieniliby życia w mieście na ciężką pracę na wsi. W ich przekonaniu miasta niosą szanse, nie tylko choroby."
        ),
        BasicProfessions.Mytnik to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Najemnik to ProfessionDescription(
            quote = "Mógłbym spokojnie przeżyć kilka żywotów, nie tłumiąc kolejnego chłopskiego powstania. O ile, oczywiście, powstanie dobrze płaci. Ale życie samo się nie sfinansuje, wiesz.",
            description = "W Starym Świecie wojna nigdy się nie kończy, a to oznacza, że zawsze jest zapotrzebowanie na walecznych ludzi. Choć Cesarstwo utrzymuje stałą armię, jej siła jest wspierana przez najemników. Szlachta i bogaci kupcy również wynajmują takich wojowników do ochrony swoich interesów, wielu z nich posiada praktycznie prywatne armie. Najemnicy to zarówno młodzi poszukiwacze przygód, jak i doświadczeni żołnierze, którzy uczestniczyli w dziesiątkach bitew. Pochodzą z całego świata, przy czym szczególną renomą cieszą się pułki z Tilei. Wszyscy najemnicy marzą o niezmierzonych bogactwach; dla większości z nich rzeczywistość to wczesna śmierć i nieoznaczony grób.",
        ),
        BasicProfessions.Ochotnik to ProfessionDescription(
            quote = "Słyszałem, że książę zwołuje milicję, aby rozprawić się z orkami. Jeśli myślą, że pójdę w te dziury za tymi zielskórymi, to kompletnie zwariowali.",
            description = "Milicje są częściowo zawodowymi lokalnymi siłami obrony, głównie złożonymi z wiejskich chłopów. Członkowie zobowiązują się poświęcić określoną ilość czasu w roku – zazwyczaj siedem dni – na wspólne ćwiczenia na polach. Nawet taki niewielki trening może przesądzić o życiu lub śmierci na krwawych polach bitew Starego Świata. Kapitanowie milicji są albo lokalnymi przywódcami cywilnymi, albo emerytowanymi wojskowymi. Niektóre jednostki muszą zapewnić sobie własny sprzęt, podczas gdy lokalna szlachta wyposaża inne. W efekcie niektóre milicje pojawiają się na służbie w schludnych mundurach i dobrze utrzymanym ekwipunku, podczas gdy inne dysponują jedynie łatającymi się ubraniami i łukami myśliwskimi.",
        ),
        BasicProfessions.Obszarnik to ProfessionDescription(
            quote = "…świetny interes; dziękuję. A tak przy okazji, to złoto? Macie tu naprawdę zamożne miasteczko; mam nadzieję, że bezlitośni najeźdźcy z mojej ziemi nie zdecydują się wam złożyć wizyty.",
            description = "Jedną z największych nagród, jakie Jarl może przyznać swoim Wiernym i lojalnym Chłopom, jest ziemia. Po uzyskaniu własności, tym mężczyznom i kobietom nadawany jest specjalny status. Dla tych, którzy nie byli wojownikami, mają oni taki sam status jak Wierni. Dla tych, którzy kiedyś byli wojownikami, ziemia zwykle jest darem w zamian za długą i cenioną służbę. Wielu Wolnych Ziemian ostatecznie zostaje Jarlami, jeśli wybierze ich Król. W przeciwnym razie zyskują kawałek ziemi i kilku Niewolników do jej uprawy."
        ),
        BasicProfessions.Ochroniarz to ProfessionDescription(
            quote = "Stój! Nikt nie tknie pana Garibaldiego!",
            description = "Mieszkańcy Starego Świata twierdzą, że kupcy z Altdorfu są tak nieuczciwi, że nie mogą nawet ufać sobie w kwestii własnego życia – dlatego płacą ochroniarzom, aby strzegli ich majątku. Stary Świat jest, oczywiście, niebezpiecznym miejscem, a jego miasta nie stanowią wyjątku. Zbyt łatwo jest skończyć z nożem w plecach na zatłoczonych ulicach wielkiej metropolii, takiej jak Nuln czy Middenheim. Bogaci i wpływowi używają ochroniarzy, aby chronić siebie przed złodziejami i zwykłym elementem. Podczas gdy wielu wygląda jak zbirzy, jakimi są w rzeczywistości, inni występują w uniformach szlacheckich lub kupieckich domów, którym służą. Niektóre grupy są tak duże, że praktycznie stanowią prywatne armie."
        ),
        BasicProfessions.Oprych to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Pacholek to ProfessionDescription(
            quote = "Będziesz walczył na rozkaz i wedle widzimisię jego Wysokości. Będziesz lepszy niż byłeś, bo dzierżysz i nosisz broń jego Ekscelencji! I umrzesz, jeśli tego będzie wymagała sprawa, ale umrzesz dobrze dla sprawy naszego Pana.",
            description = "Choć rycerze stanowią trzon armii Bretonnii, większość to chłopi. Niektórzy nie przechodzą żadnego szkolenia i są po prostu zebrani i ustawieni przeciw wrogowi. Ci, którzy zostają uznani za zdolnych do walki i przeszkoleni, stają się żołnierzami (Men-at-Arms). Ich szkolenie i wyposażenie nie są najlepsze, a chociaż otrzymują pewne wynagrodzenie, jest ono znacznie mniejsze niż można by oczekiwać za ryzyko życia. Najważniejsze jest to, że nie mają wyboru w tej kwestii. W rezultacie wielu żołnierzy korzysta z każdej okazji do dezercji, a wielu dezerterów podejmuje życie pełne przygód.",
        ),
        BasicProfessions.PasterzZCarcassonne to ProfessionDescription(
            quote = "Cisza, moje małe owieczki. Ani człowiek, ani zwierzę nie zakłóci Wam spokoju, dopóki tu jestem.",
            description = "Pasterze z Karaksonny stanowią pierwszą linię obrony księstwa przed najazdami Orków, którzy zaludniają góry. Często pracują w pojedynkę, choć nowicjusz może zostać sparowany z doświadczonym pasterzem. Oczywiście pojedynczy człowiek, nawet dobrze wyszkolony, nie może oczekiwać, że stawi czoła całej orczej bandzie, dlatego pasterze szkoleni są w zbieraniu informacji, spowalnianiu grupy i przekazywaniu jej lokalnej szlachcie. Opiekują się też stadami owiec. Pasterz, który straci owce, jest bezlitośnie wyśmiewany przez swoich towarzyszy, co prowadzi wielu z nich do podejmowania absurdalnego ryzyka, aby odzyskać choćby jedną zagubioną owieczkę."
        ),
        BasicProfessions.Paz to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Pielgrzym to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.PielgrzymGraala to ProfessionDescription(
            quote = "Jestem jedynie prostym człowiekiem. Służba tej najświętszej misji jest dla mnie wystarczającą nagrodą.",
            description = "Pielgrzymi Graala to chłopi oddani Damie Jeziora, tak jak reprezentują ją Rycerze Graala. Wierzą, że Rycerze Graala są wzorcami odwagi, sprawiedliwości i uprzejmości, a najlepszym sposobem, w jaki oni, jako prosti chłopi, mogą służyć Damie, jest służba Rycerzowi Graala.\n\nW tym celu wybierają Rycerza Graala i podążają za nim. Jeśli rycerz coś zgubi (stare łyżki, guziki itp.), pielgrzymowie zabierają te przedmioty i traktują je jako relikwie, środek kontaktu ze świętym. Jeśli Rycerz Graala potrzebuje czegoś, przynoszą mu to. A jeśli Rycerz Graala jest w niebezpieczeństwie, starają się walczyć za niego. Większość Pielgrzymów Graala nie żyje długo.\n\nJeśli Rycerz Graala zginie podczas wyprawy, jego pielgrzymi rzucają się na ciało, zabierając relikwie. Wielu z nich następnie tworzy z tego ciało Graalowych Relikwii, które noszą ze sobą zamiast samego Rycerza."
        ),
        BasicProfessions.PiratRzeczny to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Podzegacz to ProfessionDescription(
            quote = "„Przyjacielu – podejdź bliżej! Chciałbym uświadomić ci poważną sytuację... okropieństwo, o którym być może nie wiesz. Jest problem, mój przyjacielu, problem tutaj, w Altdorfie.”",
            description = "Dla większości mieszkańców Imperium polityka ma niewielkie znaczenie, Imperator i Elektorowie hrabiowie tworzą i egzekwują prawo, przy wsparciu różnych kościołów (najbardziej widocznie Sigmara i Ulrica), Artykułowo, zagorzali działacze polityczni są powszechnym widokiem w miastach Imperium. Ci Agitatorzy organizują się w imieniu różnych spraw, rozdając ulotki, wygłaszając porywające przemówienia i podburzając ludność. Skrajni fanatycy są po prostu ignorowani, ale skuteczni Agitatorzy – ci, którzy potrafią wykorzystać źródło gniewu chłopów i mieszczan – zwykle są postrzegani jako zagrożenie dla państwa. Są ścigani przez lokalną straż, oskarżani o herezję przez przedstawicieli kościoła lub zmuszani do poddania się łaskawości Łowców Czarownic. Agitatorzy kontynuują swoją działalność mimo ryzyka. Niektórzy naprawdę wierzą w swoją sprawę, inni są cynicznymi poszukiwaczami władzy, tak skorumpowanymi jak ci, przeciw którym się wypowiadają."
        ),
        BasicProfessions.Poganiacz to ProfessionDescription(
            quote = "Chwileczkę... Czyż nie było sześćdziesięciu sztuk naliczonych dziś rano?",
            description = "Wielkie stada udomowionych zwierząt bez końca przemierzają wietrzne obłasti, eskortowane z pastwisk na targ, a potem od kupca do klienta. Niestrudzeni poganiacze, którzy nadzorują te przeprawy, potrafią pokonywać setki mil wraz ze swoimi stadami, a niektórzy docierają nawet na odległe rynki w Ostermarku czy Ostlandzie. Większość poganiaczy korzysta z zajadłych psów, aby kierować i pilnować zwierząt, a charakterystyczne szczeknięcia i gwizdy używane do ich komenderowania to znajomy dźwięk obłasti. W bardziej cywilizowanym południu odbywają się regularne zawody między poganiaczami, mające wyłonić tego, kto najlepiej potrafi prowadzić stada przy pomocy psów – zwycięzca zaś zyskuje najbardziej intratne kontrakty."
        ),
        BasicProfessions.PoganiaczMulow to ProfessionDescription(
            quote = "Powinniśmy dotrzeć do następnej karczmy przed zmrokiem, jeśli trochę przyspieszymy. Albo to, albo ryzykujemy noc na otwartym terenie z napastnikami i wilkami.",
            description = "Przewoźnicy mułów prowadzą karawany zwierząt jucznych, zwykle mułów, przez Księstwa Graniczne, transportując niezbędne zaopatrzenie między osadami. Niezbędne, ale tanie towary mogą przewozić pojedynczy przewoźnik, podczas gdy cenniejsze dobra wymagają kilku osób, a czasem także najemnych strażników. Czasami przewoźnicy nie zdradzają, że przewożą coś wartościowego, i liczą na to, że bandyci ich zignorują. Dzięki swoim podróżom przewoźnicy często znają Księstwa Graniczne lepiej niż ktokolwiek inny, a niektórzy wykorzystują tę wiedzę, by zarobić na życie w inny sposób. Przewoźnicy mułów organizują także konkursy w oskórowywaniu mułów. Rekord dla martwego muła wynosi poniżej minuty; rekord dla żywego muła, niekwestionowany przez Alberica „Płaska Twarz” Schilpa, to pięć i pół minuty.",
        ),
        BasicProfessions.Pogranicznik to ProfessionDescription(
            quote = "„Życie tutaj jest trudne, więc jesteśmy twardsi. Jedyną nadzieją jest marzenie o opuszczeniu tych skał.”",
            description = "Badlanderzy, jak sama nazwa wskazuje, żyją w złych ziemiach Księstw Granicznych. Te obszary to często labirynty połamanych skał, z małą ilością wody i jeszcze mniejszą ilością życia, a to, co istnieje, jest co najwyżej niejadalne, a w najgorszym przypadku wrogie. Muszą stale wędrować po okolicy, aby znaleźć pożywienie i wodę, co również ułatwia im ukrywanie się. Zaskakująco wysoki odsetek Badlanderów ma wcześniejsze kariery, przed którymi się ukrywa; ci, którzy ich nie mają, zwykle marzą o czymś, przed czym warto byłoby się ukrywać."
        ),
        BasicProfessions.Pokutnik to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.PorywaczZwlok to ProfessionDescription(
            quote = "Nie chcę mieć nic wspólnego z paleniem na stosie. Zabieranie ciężkiej pracy uczciwych ludzi, oto co to jest.",
            description = "Porywacz Zwlok zarabiają na życie wśród zmarłych. Profesje medyczne i magiczne tworzą stałe zapotrzebowanie na świeże zwłoki, niektóre do badań, inne do bardziej złowieszczych celów. Zdobycie takich zwłok legalnie jest bardzo trudne, dlatego lekarze i czarodzieje często polegają na grabarzach. Jest to odrażający zawód, ale opłacalny. Najświeższe zwłoki mogą osiągać wygórowane ceny. Ryzyko w tej branży jest znaczne: straże, kapłani Morra (Boga Śmierci) oraz Łowcy Czarownic pilnie strzegą cmentarzy i surowo karzą intruzów."
        ),
        BasicProfessions.PoskramiaczNiedzwiedzi to ProfessionDescription(
            quote = "Ja i Bruno, jesteśmy jak bracia… dzielimy jedzenie, dzielimy łóżko… co takiego śmiesznego, co, człowieku z Imperium?",
            description = "Niedźwiedź jest święty w Kislevie. Pojawia się w mitach i legendach obu plemion i jest czczony przez potężny Kult Ursuna. Niedźwiedzie są postrzegane jako żywe uosobienia trwałej siły i mocy ziemi oraz trudów, które muszą znosić wszyscy Kislevici. Dlatego bojarowie często rekrutują treserów niedźwiedzi do swoich sił zbrojnych, utrzymując niedźwiedzie jako inspirujące maskotki, a czasem do użycia w wojnie. Ponieważ Kislevici zbierają się w dużych liczbach, by oglądać niedźwiedzie, treserzy niedźwiedzi są także powszechnie spotykani w słynnych cyrkach Kislevu oraz na ulicach podczas festiwali, gdzie tańczą lub pokazują walki niedźwiedzi za pieniądze."
        ),
        BasicProfessions.Poslaniec to ProfessionDescription(
            quote = "Mam pilną wiadomość dla Barona. Nie, nie zostawię jej u ciebie – to tylko dla oczu Barona.",
            description = "W ogromnym Cesarstwie, gdzie ważne miasta i zamki dzielą wielkie odległości, posłańcy są niezbędnym środkiem komunikacji. Szlachta, kupcy i dowódcy wojskowi szeroko korzystają z ich usług, najlepiej konnych. Ci odważni jeźdźcy przemierzają drogi Cesarstwa samotnie, polegając na swojej szybkości, by unikać niebezpieczeństw. Strażnicy dróg wspierają oficjalnych posłańców, ale istnieją długie, samotne odcinki, gdzie pomoc jest niedostępna. Chociaż powinni być chronieni przed napaścią, wielu posłańców spotkał krwawy koniec po dostarczeniu szczególnie nieprzyjemnej wiadomości.",
        ),
        BasicProfessions.Prawnik to ProfessionDescription(
            quote = "Cóż, jest piętnastu świadków, którzy twierdzą, że to ty, a Straż złapała cię na gorącym uczynku. Poza tym, nie sądzę, żeby mieli przeciwko tobie sprawę.",
            description = "Prawnicy są powszechnym widokiem zarówno w Talabheim, jak i we wszystkich większych miastach Starego Świata. Sporządzają dokumenty prawne, interpretują prawo i reprezentują osoby w sądzie, które mogą sobie pozwolić na opłacenie ich usług. Pozwani są niemal powszechnie pogardzani, chyba że ktoś znajduje się w tarapatach prawnych i potrzebuje pomocy. Muszą być dobrze obeznani zarówno z prawem Cesarstwa, jak i regionu, w którym zamierzają praktykować, oraz posiadać dużą wiedzę na temat codziennych spraw. Nawet najniżej urodzony pozwany uważany jest przez ogół społeczeństwa za „osobę piśmienną” i może być proszony o wykonanie zadań wykraczających poza jego szkolenie.",
        ),
        BasicProfessions.Przemytnik to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Przepatrywacz to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Przewoznik to ProfessionDescription(
            quote = "Podróż to coś więcej niż tylko nurt między brzegami… a podróż skończy się szybko, jeśli nie zapłacisz odpowiedniej opłaty.",
            description = "Rzeki, zarówno duże, jak i małe, przecinają Cesarstwo. Chociaż niektóre są na tyle płytkie, że można je bez problemu przeprawić pieszo, większość wymaga transportu, aby bezpiecznie je przekroczyć. Ferrymani zarabiają na życie przewożeniem ludzi i towarów przez rzeki Cesarstwa – oczywiście za opłatą. Preferują barki o płaskim dnie, ponieważ mają niewielki zanurzenie i dużo miejsca na pokładzie. Ferrymani w bardziej odległych rejonach często posługują się też muszkietem. Rozbójnicy są stałym zagrożeniem, a muszkiet skutecznie zniechęca do opóźnień. Wielu Ferrymanów jest również mistrzami wyłudzania, arbitralnie zmieniając ceny w zależności od widocznego bogactwa i desperacji pasażerów."
        ),
        BasicProfessions.Pustelnik to ProfessionDescription(
            quote = "„Ból? Jaki ból? Nie ma bólu. Jest tylko pokuta.”",
            description = "Niektórzy uważają, że mogą podążać za swoimi mistycznymi skłonnościami tylko w samotności, z dala od rozproszeń cywilizacji, rozmów i mydła. Tacy ludzie stają się Pustelnikami, zajmując jaskinię lub szczyt filara skalnego gdzieś na Pograniczu. Posiadają niewiele lub wcale żadnych dóbr, więc rzadko są niepokojeni przez bandytów. Zielonoskóre bestie i inne potwory nadal mogą ich zabić, jeśli tylko złapią, dlatego Pustelnicy uczą się, jak ukrywać się i uciekać."
        ),
        BasicProfessions.RogatyLowca to ProfessionDescription(
            quote = "Służ lasowi, a las będzie służył tobie.",
            description = "Rytuały Taala wymagają od praktyków wielkiej siły fizycznej, emocjonalnej i umysłowej. Niektórzy postrzegają oznaki cywilizacji – miasta, dwory i tym podobne – jako błędy w interpretacji woli Taala. Rogaci Łowcy są głęboko religijni i unikają miast. W odróżnieniu od Wybranych Taala, Rogaci Łowcy rezygnują z wielu aspektów życia materialnego. Odrzucają normalne ubrania i zbroje, nosząc skóry zwierzęce, przepaski biodrowe lub mniej. Częścią inicjacji w tej grupie jest szerokie tatuowanie klatki piersiowej i twarzy. Rogaci Łowcy przemierzają lasy zarówno w Taalbaston, jak i w całym Talabecland, uznając jedynie władzę Taala. Choć nie mają ognistej retoryki typowej dla większości fanatyków, pozostają gorliwi w swoich przekonaniach i wierzą, że prawdziwa przemiana dokonuje się przez czyny, a nie słowa.",
        ),
        BasicProfessions.Rolnik to ProfessionDescription(
            quote = "Spalcie miasta, ale zostawcie farmy, a miasta odrodzą się z popiołów. Ale jeśli spalicie farmy, trawa przebije się przez bruk każdej ulicy w mieście.",
            description = "Stary porządek feudalny w Imperium nie jest już tym, czym był kiedyś, a nowa przedsiębiorcza klasa wypełnia lukę między chłopami a szlachtą. W miastach pojawili się burżuowie. Ich odpowiednikiem na wsi jest wyłaniająca się klasa ziemiaństwa.\n\nZiemia często jest przydzielana chłopom jako nagroda za służbę wojskową, albo kupcy inwestują swoje bogactwo, nabywając posiadłości ubogich szlachciców. Rzadko się zdarza, że dzierżawcy oszczędzają wystarczająco, by kupić pola, które uprawiają, od swojego pana. Ziemia jest dziedziczona, ale żaden rolnik nie utrzymuje jej w posiadaniu dłużej niż przez kilka pokoleń. Rolnik zatrudnia wielu ludzi do pracy na roli, ale sam pracuje równie ciężko jak każdy chłop, ponieważ bogactwo przyniesione ciężką pracą zapewnia mu znaczący status społeczny w społeczności wiejskiej."
        ),
        BasicProfessions.Rozjemca to ProfessionDescription(
            quote = "Proszę, panowie. Jestem pewien, że możemy dojść do wzajemnego porozumienia.",
            description = "Chłopi w Brettonii starają się żyć bez ingerencji szlachty. Gdy szlachta się wtrąca, ludzie są bici lub wieszani, a żywność zabierana, co tylko pogarsza sytuację. Jednak życie chłopów dalekie jest od idylicznej współpracy, a spory między wioskami zdarzają się często. Mediatorzy to wybrani chłopi, którzy rozwiązują te konflikty. Mieszkają w jednej wiosce i kontaktują się z przedstawicielami, zazwyczaj innymi Mediatorami, wiosek, z którymi mają spory. Mediatorzy zwykle nie mają uprawnień decyzyjnych, więc muszą szukać rozwiązań, które będą akceptowalne dla sąsiadów. Większość Mediatorów to oficjalnie pasterze, co daje im pretekst do przebywania w różnych miejscach, jeśli szlachta ich szuka. Choć zdecydowaną większość stanowią mężczyźni, zdarzają się także kobiety Mediatorzy.",
        ),
        BasicProfessions.Rybak to ProfessionDescription(
            quote = "Jeśli chcesz złapać Stirpike’a, będziesz musiał poświęcić palec, bo tyle właśnie biorą za przynętę. Ja, na Taal, nie dam już więcej swoich!",
            description = "Rybacy szukają darów morza. Wiele wiosek na wybrzeżu Nordlandu jest domem dla niezliczonych rybaków. Ci hartowani ludzie odważnie stawiają czoła Morzu Pazurów w małych łodziach, pomimo stałego zagrożenia ze strony piratów i najeźdźców z Norski. Istnieją także społeczności rybackie w głębi lądu, nad jeziorami i rzekami, chociaż te wioski zajmują się również rolnictwem. Rybacy są z natury niezależni. Pracują w małych załogach, a na wodzie każda decyzja należy do nich. Ten żywiołowy charakter jest jednym z powodów, dla których tawerny przy nabrzeżu zawsze są hałaśliwe."
        ),
        BasicProfessions.RzecznikRodu to ProfessionDescription(
            quote = "Wasze sposoby są mi obce, człowiecze. Lecz wierzę, że możemy dojść do obopólnie korzystnego porozumienia.",
            description = "Starszyzna wielkich elfickich rodzin kupieckich jest daleka od codziennego życia w Imperium. Dla nich Ludzie żyją i umierają tak szybko, że trudno nadążyć za aktualnymi trendami i polityką Starego Świata. Gdy potrzebują takiej wiedzy, zwracają się do swoich Wysłanników. Ci młodzi Elfowie stanowią publiczną twarz Domów Kupieckich. Negocjują kontrakty, zawierają umowy i utrzymują pokój z Ludźmi w ośrodkach handlowych, takich jak Altdorf, Nuln czy Marienburg. Nawet Elfowie mają swoje granice cierpliwości, więc nic dziwnego, że wielu Wysłanników opuszcza rodziny, by prowadzić życie awanturników."
        ),
        BasicProfessions.Rzemieslnik to ProfessionDescription(
            quote = "„Kluczem do mistrzowskiego rzemiosła jest prostota. Usuń wszystko, co przeszkadza w osiągnięciu perfekcji.”",
            description = "Rzemieślnicy to wykwalifikowani fachowcy i mistrzowie w swoim rzemiośle. Najczęściej spotykani w miastach i miasteczkach, rzemieślnicy zrzeszeni są w zaskakująco różnorodnych gildiach. Najlepsi fachowcy przyciągani są do największych miast, takich jak Altdorf, Marienburg i Nuln. Tam mogą żądać wysokich cen od najbogatszych klientów lub współpracować z Kupcami, którzy sprzedadzą ich towary w dalszych regionach. Niektórzy rzemieślnicy są tak sławni, że nawet Szlachta musi wpisywać się na listy oczekujących, ponieważ posiadanie dzieła renomowanego mistrza jest oznaką statusu. Mistrzowskie dzieło rzemieślnika naprawdę zapiera dech w piersiach."
        ),
        BasicProfessions.Rzezimieszek to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Skald to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Skarbnik to ProfessionDescription(
            quote = "Zgubiłeś tegoroczny dowód zapłaty podatku? Co za pech, mistrzu szewcu. Przewróćcie mu dom, chłopcy! Chcę, aby każda moneta została znaleziona! Czas zapłacić, mój przyjacielu.",
            description = "Wszystkie miasta wymagają podatków i ceł, aby mogły funkcjonować. Stały przepływ pieniędzy zapewnia finansowanie robót publicznych i utrzymanie służby, a także zasila kieszenie polityków. Jednak bez względu na szlachetny cel czy powód, nikt nie lubi płacić podatków. Ponieważ jest to niepopularna rzeczywistość, większość prawodawców dystansuje się od samego poboru pieniędzy, polegając na specjalnie zatrudnionych Poborcach Podatkowych, którzy wykonują tę pracę zamiast nich. Spośród wszystkich ludzi w mieście Poborca Podatkowy jest prawdopodobnie najbardziej nielubiany, tuż obok farbiarzy, żebraków i reszty plebsu. Mimo że spotykają się z wrogością na każdym kroku, większość Poborców wie, że ich obowiązek jest konieczny. Ciężko jednak o to, aby byli dobrze opłacani za tę niewdzięczną pracę. W rezultacie niewielu cieszy się tym, co robią, i szuka najszybszej drogi do poprawy swojej sytuacji, poprzez sprytne podbieranie pieniędzy lub dodatkową pracę w nikłej nadziei na zdobycie lepszej pozycji w administracji."
        ),
        BasicProfessions.Skryba to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Sluga to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Straznik to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.StraznikDrog to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.StraznikKanalow to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.StraznikPol to ProfessionDescription(
            quote = "I trzymaj się z daleka, chyba że chcesz, żeby kolejny kamień trafił w coś bardziej wrażliwego.",
            description = "Dla osób z zewnątrz, Moot wygląda na bezpieczną i szczęśliwą krainę. W dużej mierze jest to zasługa Strażników Polnych. Ci Półkrasnoludkowie patrolują granice Moot, odstraszając zagrożenia i niechcianych intruzów. Są zręcznymi zwiadowcami, którzy wykorzystują swoją dogłębną znajomość Moot do maksymalnej przewagi. Wolą atakować z zasadzki, używając przewagi w obsłudze broni dystansowej, aby zneutralizować przewagę liczebną przeciwników. Ponieważ Moot graniczy z Sylvania, Strażnicy Polni mają szczególne doświadczenie w walce z żywymi trupami. Niejedna grupa zombie została unicestwiona przez serię pocisków z procy wystrzelonych przez zdeterminowanych Strażników Polnych."
        ),
        BasicProfessions.StraznikRzeczny to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.StraznikSwiatynny to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.StraznikTuneli to ProfessionDescription(
            quote = "Zobaczyć słońce ponownie po długiej Straży Głębin. Nie było jaśniejszej złotej korony ani bogatszej nagrody.",
            description = "Straż Tuneli składa się z tych, którzy są zbyt pochłonięci opowieściami o przygodach i chwale, by zwracać uwagę na inherentne niebezpieczeństwa, lub z tych, którzy są zbyt zdesperowani, by się tym przejmować. W istocie Straż Tuneli to gildia profesjonalnych poszukiwaczy przygód, z grupami wysyłanymi do tuneli pod miastem, by utrzymywać je wolne od potworów i powstrzymywać wszelkie stworzenia przed dotarciem do miasta. To niebezpieczna praca, ale ktoś musi ją wykonywać."
        ),
        BasicProfessions.StraznikWiezienny to ProfessionDescription(
            quote = "Dzień dobry, mistrzu złodziej. Podobało Ci się znakowanie twarzy wczoraj? Widzę, że tak. A jak podobają Ci się warunki? Jeszcze jedno słowo od Ciebie, a z przyjemnością oznakuję Ci drugą policzek.",
            description = "Imperium to naród praw, co oznacza również naród więzień. Pomimo wysiłków kapłanów Vereny, Bogini Sprawiedliwości, niewinni równie często trafiają do więzienia, co winni. Prawo uznaje lepiej być zbyt surowym niż zbyt łagodnym. Więzienia imperialne to odrażające lochy, pachnące zarówno strachem, jak i ekskrementami. Więzienni strażnicy nadzorują te instytucje, używając kombinacji brutalności i upokorzenia, aby utrzymać porządek. Zwykle nie mają poczucia sprawiedliwości ani litości i rzadko ulegają błaganiom lub przemowom (choć łapówki przyjmują chętnie). Najgorsi są jawnie sadystyczni, czerpiąc przyjemność z władzy nad swoimi podopiecznymi.",
        ),
        BasicProfessions.Strielec to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.StrzyganskiMistyk to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Szczurolap to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.SzermierzEstalijski to ProfessionDescription(
            quote = "Odbiję twoje pierwsze ataki na moim trzecio-ćwiartkowym radiale i zajmę wyższy grunt. Z zasięgiem zaledwie pięćdziesięciu trzech cali nie wygrasz tej walki, używając ostrza tnącego. Nie z tak słabą postawą, señor.",
            description = "Królewstwa Estalii leżą na południowy zachód od Imperium. Tam zagrożenie ze strony Chaosu wydaje się odległe. Pustkowia Chaosu są dość daleko od tej słonecznej krainy, która nigdy nie doświadczyła gniewu krwiożerczych hord tak jak Imperium czy Kislev. Mieszkańcy Estalii zajmują się różnymi sprawami, od nauki i badań po przestępczość i vendettę. Jedną z ich największych pasji jest szermierka. Miasta Estalii mają wiele szkół szermierczych, z których każda kultywuje własny styl. Wiele z tych stylów wywodzi się z nauk Mistrza Figueroi, legendarnego szermierza, który stosował najnowsze teorie naukowe w szermierce z oszałamiającymi efektami. Zwolennicy stylu Figueroi, zwani Diestro, walczą i pojedynkują się w całej Estalii. Niektórzy, znudzeni swoją ojczyzną, szukają wrażeń gdzie indziej, najczęściej w Tilei i Bretonni. Najodważniejsi podróżują na północny wschód do Imperium, by sprawdzić swoje szpady w starciu z godnymi przeciwnikami i zobaczyć krainę stojącą na pierwszej linii walki z Chaosem."
        ),
        BasicProfessions.Szlachcic to ProfessionDescription(
            quote = "Bycie członkiem szlacheckiego rodu nie jest tak łatwe, jak się wydaje. Stale staje się przed dylematami. Którą jedwabną tunikę dziś założyć? Jakie wino podać do pieczonego bażanta?",
            description = "Szlachta stanowi klasę rządzącą Cesarstwem. Posiadają władzę, kontrolują ziemię i stanowione są przez nich prawa. Najważniejsze rody szlacheckie to rodziny elektorów cesarskich, a oczywiście sam Cesarz. Istnieją setki innych rodów, które rywalizują o większy majątek i władzę. Niektórzy szukają szczęścia na wojnie, inni w biznesie lub polityce. Żaden z nich nie zniżyłby się do wykonywania zwykłego rzemiosła. Najbardziej pogardzani szlachcice nic nie robią, żyjąc wyłącznie z rodzinnego majątku i uczestnicząc w niezliczonych przyjęciach, balach i galach. Młodsze dzieci rodów szlacheckich mają jednak trudniej. Ponieważ spadek przypada najstarszemu, często muszą radzić sobie same, nawet jeśli oznacza to obcowanie z niższymi klasami i wchodzenie w towarzystwo awanturników i łobuzów.",
        ),
        BasicProfessions.Szperacz to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Szuler to ProfessionDescription(
            quote = "Nie trzeba bać się tych, którzy zawsze wygrywają… trzeba bać się tych, którzy zawsze wydają się przegrywać.",
            description = "Hazardziści unikają ciężkiej pracy niższych i średnich warstw społecznych. W końcu po co trudzić się dla tak małych nagród, skoro miesięczne dochody można zdobyć jedną dobrze rozegraną ręką? Hazardziści wykorzystują swoje umiejętności w grach losowych, aby zdobywać pieniądze od bogatych i niezdarnych. Przemierzają zajazdy i domy gier, gotowi oddzielić łatwowiernych od ich monet. Czasem jednak coś idzie nie tak i hazardziści tracą duże sumy pieniędzy. W takich przypadkach konieczna jest szybka ucieczka, zanim wierzyciele odkryją, że długi nie mogą zostać spłacone. Hazardziści z natury są włóczęgami, ciągle w ruchu, aby unikać starych długów i urażonych przegranych."
        ),
        BasicProfessions.Smieciarz to ProfessionDescription(
            quote = "Tu jest przepiękny kawałek śmieci...",
            description = "Zbieracz Kości (Bone Picker) to padlinożerca, który zarabia na życie, grzebiąc w odpadkach innych. Prowadzą swoje wózki przez wsie i miasta, zbierając stare kości, szmaty i inne śmieci, a następnie wymieniając je na kilka groszy lub drobny przedmiot w handlu. Czasami znani są jako zbieracze szmat i kości albo po prostu zbieracze odpadków. Są powszechnym widokiem w miastach Imperium, które generują ogromne ilości odpadów. Ponieważ wiele dóbr przechodzi przez ich ręce, Zbieracze Kości są też drobnymi handlarzami. To, co jest śmieciem dla bogatego mieszczanina, jest skarbem dla biednego chłopa."
        ),
        BasicProfessions.Tarczownik to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.UczenCzarodzieja to ProfessionDescription(
            quote = "„Moje egzaminy zbliżają się szybko. Jeśli uda mi się zapalić świecę z dziesięciu kroków, nie podpaliwszy sobie włosów, jestem pewien, że tym razem zdam.”",
            description = "Ludzie obdarzeni talentem magicznym są niebezpieczni i budzą strach. Demony i nieszczęścia gromadzą się wokół nieprzeszkolonego Czarodzieja. Aby poradzić sobie z tym zagrożeniem, Imperium wysyła takie osoby do jednej z ośmiu Gildii Czarodziejów. Podczas nauki młodzi Czarodzieje uczą się, jak praktykować magię bezpiecznie, oraz rozważają, do której Gildii ostatecznie dołączą. Niektórzy uczniowie są zobowiązani służyć Czarodziejowi, który odkrył ich talenty, podczas gdy inni wyruszają na przygody, aby zebrać wystarczająco pieniędzy na naukę w Kolegiach Magii. Elfy posiadają naturalne zdolności magiczne i nie muszą uczęszczać do ludzkich instytucji, ucząc się od własnych mistrzów wiedzy. Zobacz Rozdział 7: Magia w Podręczniku Podstawowym, aby poznać szczegóły dotyczące Gildii Magii."
        ),
        BasicProfessions.UczennicaCzarownicy to ProfessionDescription(
            quote = "„Zimowy chłód jest moim nauczycielem. A potrafi być okrutnym mistrzem.”",
            description = "Co roku lodowe czarownice wyłaniają się z mroźnego obszaru, aby ocenić drżące dziewczęta Gospodar. Rzadkie dziewczęta wykazujące talent magiczny są zabierane i mało prawdopodobne, że zobaczą swoją rodzinę ponownie. Ledwie wystarczająco dorosłe, by można je było nazwać kobietami, przyszłe uczennice prowadzone są w głąb okrutnej zimy Kislevu, gdzie uczone są starożytnych metod Królowych-Chanów. Te, które przeżyją (a wiele nie przeżywa), zmieniają się na zawsze: stają się zimne, zdystansowane, dojrzałe poza swój wiek i bardzo świadome swojej nieistotności wobec mocy lodowego serca Starodawnej Wdowy. Ostatecznie te pomyślnie przeszkolone uczennice zostaną uwolnione od swoich mistrzyń i będą mogły wyruszyć jako „panny lodu”."
        ),
        BasicProfessions.UczenZielarza to ProfessionDescription(
            quote = "Mało wiem o sztukach hedge… ale chętnie się nauczę.",
            description = "Praktykujący Hedgecraft wybierają swoich uczniów ostrożnie. Większość z nich to członkowie rodzin już istniejących Hedgefolk, ale znacząca mniejszość jest wybierana ze względu na naturalne talenty lub dlatego, że należą do Błogosławionej Nielicznej grupy: tych, których bogowie obdarzyli mocą wzmacniania ich Hedgecraft. Życie ucznia jest zazwyczaj ciężkie, a większość pełni jedynie funkcję służebną wobec mistrza, wykonując polecenia, rąbiąc drewno, myjąc podłogi i tym podobne. W końcu uczeń nauczy się wszystkich umiejętności Mistrza Hedge i będzie mógł samodzielnie kroczyć swoją ścieżką w świecie."
        ),
        BasicProfessions.Weglarz to ProfessionDescription(
            quote = "Nie przejmuj się dymem, chłopcze. Z czasem (kaszel, prychnienie) przyzwyczaisz się do niego. (kaszel)",
            description = "Wypalacze węgla drzewnego można znaleźć w każdej wiosce Imperium. Palą drewno, aby uzyskać węgiel drzewny, ważne paliwo na zimowe miesiące. Ich praca jest zarówno brudna, jak i potencjalnie niebezpieczna, dlatego działają na obrzeżach wiosek. Najlepsze są skraje lasów, skąd łatwo dostępne jest drewno. Bliskość lasu sprawia również, że praca jest ryzykowna, ponieważ izolowane grupy takich ludzi są łatwym łupem dla złowrogich stworzeń lasu. Obóz wypalaczy węgla zawsze ma pod ręką broń, nawet jeśli są to tylko kije ścięte z pobliskich drzew."
        ),
        BasicProfessions.Wielorybnik to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Wloczykij to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Woj to ProfessionDescription(
            quote = "Jarl mówi, że masz umrzeć. Powoli. A ja jestem niczym, jeśli nie lojalny wobec Jarla.",
            description = "Woj to wojownik służący konkretnemu Jarlowi. Oczekuje się od niego, że będzie mieszkał w Hali Jarla, dzielił jego jedzenie i pozostawał niezachwianie lojalny. W zamian za przysięgę lojalności, Jarl nagradza służbę prezentami, takimi jak broń i zbroja, a najlepszych także ziemią i tytułem. Wartość prezentu nie jest mierzona jego faktyczną wartością, lecz prestiżem, jaki nadaje Wojowi. Ważne jest, aby pamiętać, że takie prezenty nie czynią Woja najemnikiem; są one nagrodą za stałą i wierną służbę."
        ),
        BasicProfessions.WojownikKlanowy to ProfessionDescription(
            quote = "W tych lasach czają się mroczne istoty. Bądźcie czujni.",
            description = "Niektóre Elfy żyją w odosobnionych polanach głęboko w wielkich lasach. W miarę pogarszania się skażenia Chaosem, te elfie ziemie podupadły. W Cesarstwie pozostało niewiele elfich społeczności, z których największa znajduje się w Laurelorn. Pod konarami lasu Elfy toczą ukrytą walkę z Bestiami i innymi plugawymi stworzeniami. Małe jednostki wojowników, zwane Kithbandami, przenoszą walkę do wroga. Jak wskazuje ich nazwa, Kithbandy składają się z Elfów pochodzących z powiązanych rodzin i walczą pod swoimi rodowymi emblemami. Ci wykwalifikowani łucznicy chronią elfie osady przed mrocznymi istotami lasu. Każdy łuk jest potrzebny, aby powstrzymać zniszczenie pozostałych elfich ziem Cesarstwa.",
        ),
        BasicProfessions.Woznica to ProfessionDescription(
            quote = "Upewnię się, że dotrze tam bezpiecznie i nienaruszone. Jeśli będę musiał odstrzelić każdego bestiaka i goblina odtąd aż do Nuln, to tak zrobię.",
            description = "Choć Imperium jest potężnym państwem, jego ziemie są dalekie od bezpieczeństwa. Duże obszary nigdy nie zostały ujarzmione ani zagospodarowane. Niepewny system dróg łączy wsie, miasta i metropolie, a właśnie tutaj zarabiają na życie Woźnice, pracując dla jednej z licznych cesarskich firm przewozowych. Drogi często są w złym stanie lub pełne goblinów, bestii i bandytów. Niemniej, Woźnice ryzykują życie i zdrowie, by bezpiecznie przewieźć pasażerów i ładunki przez niebezpieczne szlaki Imperium. Każdy dzień to wyścig, aby dotrzeć do kolejnej osady lub zajazdu przed zachodem słońca. Nikt nie chce podróżować nocą, zwłaszcza gdy na niebie świeci księżyc Chaosu."
        ),
        BasicProfessions.Wrozbita to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Zabiarka to ProfessionDescription(
            quote = "Nóż wchodzi, wnętrzności wychodzą. Nóż wchodzi, wnętrzności wychodzą. A tak przy okazji… słyszeliście nowiny o Madam de Verre? Mówią, że jej syn ma dziesięć palców… ale nie po pięć na każdej ręce…",
            description = "Żabie żony są powszechnym widokiem we wioskach Mousillon. Przetwarzają wiadra ślimaków i żab złowionych przez wiejskich Bagienników (często swoich mężów, synów lub ojców), czyszcząc je do późnych godzin wieczornych. Żaba-żona to nie tylko ekspertka w patroszeniu i oczyszczaniu żab i ślimaków, ale także kluczowy element struktury społecznej wioski. Zwykle posiadają sporą wiedzę o otaczającym świecie, czasem mogą opuszczać wioskę na krótkie okresy, by zdobyć użyteczne zioła lub inne niezbędne rzeczy w sąsiednich wsiach. Niektóre żabie żony są ekspertkami w ziołolecznictwie, medycynie ludowej lub innych ezoterycznych, lecz użytecznych dziedzinach. Rzadko zdarza się żabia żona, która nie zna większości wydarzeń w swojej wiosce, a żabie żony słyną z plotkarstwa, opowiadania historii i tworzenia dziwnych przesądów. Żaba-żona jest prawie zawsze kobietą, a praca mężczyzny przy wiadrze z bagna jest wielką rzadkością."
        ),
        BasicProfessions.ZabojcaTrolli to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Zakapturzony to ProfessionDescription(
            quote = "Kiedy szlachecka cnota nie sięga dalej niż miecz, nasze strzały i ostrza ujawniają ten wstyd. Ludzie wiedzą, że nasze trafienia nie dorównują naszej czci.",
            description = "Zakapturzeni to bretońscy banici, którzy trzymają się ścisłego kodeksu moralnego, działając poza prawem tylko dlatego, że jest ono niesprawiedliwe. Chociaż wielu szlachciców i chłopów nie widzi różnicy między nimi a zwykłymi przestępcami, Herrimaultowie dążą do wymierzania sprawiedliwości tam, gdzie prawo zawodzi. Ich reputacja wynikająca z etycznych działań przynosi im uznanie wśród chłopstwa, a czasami nawet odważni szlachcice dołączają do ich sprawy."
        ),
        BasicProfessions.Zarzadca to ProfessionDescription(
            quote = "„Otwórz, Johann. Wiem, że tam jesteś. Zawsze wydajesz się być nieprzytomny, kiedy trzeba ściągnąć czynsz.”",
            description = "Zarzadca to urzędnik dworski w służbie szlacheckiego pana. Choć wiele jego obowiązków wiąże się z utrzymaniem majątku i zasobów dworu, wieśniacy kojarzą go głównie z czymś innym. Zarzadca ściąga czynsze i podatki z okolicznych wiosek oraz egzekwuje obowiązki pracownicze chłopów wobec pana. Te zadania sprawiają, że jest głęboko niepopularny wśród mieszkańców, szczególnie w trudnych czasach. Jako znienawidzona twarz pańskiej władzy, zarzadca jest często pierwszą ofiarą, gdy chłopi wpadną w gniew i zbuntują się."
        ),
        BasicProfessions.ZbieraczLajna to ProfessionDescription(
            quote = "Weź gnój koński albo krowi. To dobry nawóz, a po wysuszeniu dobrze się pali, jeśli nie przeszkadza ci smród. Ze świńskim to już inna sprawa...",
            description = "Dbając o czystość ulic, ci dzielni pracownicy przemierzają zaułki i trakty ze szpadlem oraz sporą dozą hartu ducha, usuwając najgorsze odchody, by ludzie mogli swobodnie chodzić. Niektórzy to przedsiębiorczy handlarze działający w dzielnicach, które mogą sobie na nich pozwolić, inni zaś pracują dla miasta, patrolując te obszary, gdzie im płacą. Choć z pewnością nie jest to zajęcie chwalebne, zbieracze gnoju często dorabiają sobie, sprzedając wysuszony nawóz jako tani opał na zimę."
        ),
        BasicProfessions.Zlodziej to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Zak to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Zeglarz to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Znachorka to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.Zolnierz to ProfessionDescription(
            quote = " ",
            description = " "),
        BasicProfessions.ZolnierzOkretowy to ProfessionDescription(
            quote = "Więc myślą, że mogą sobie tutaj wparować i plądrować nasze fortece? Pokażmy im, kto tu rządzi, chłopaki!",
            description = "Żołnierz Okrętowy to żołnierze desantowi, którzy służą w flocie Imperialnej oraz na większych prywatnych statkach. Chronią swoje okręty przed piratami, nordyckimi plądrowcami i innymi najeźdźcami. W przeciwieństwie do marynarzy, których głównym zadaniem jest żeglowanie, Marines znajdują się na pokładzie wyłącznie w celu walki. W portach często tworzą grupy przymusowego werbunku, by uzupełnić załogę statku. Niejedna nieostrożna osoba obudziła się na morzu po otrzymaniu belayingu od nadgorliwego rekrutera. Z powodu tych działań oraz własnych pijackich bójek Marines bywają niechętnie przyjmowani w wielu nadmorskich społecznościach. Jednak gdy napastnicy atakują, ci sami mieszkańcy chętnie przyjmują pomoc doświadczonych Marines.",
        ),
        AdvancedProfessions.Admiral to ProfessionDescription(
            quote = "„Nie obchodzi mnie mielizna. Jeśli Bruckmeier i Lowenstein nie odbiją o dwie ligi na wschód-południowy wschód od swojej pozycji do godziny czternastej, będziemy jeść na obiad katapultowe odłamki. A potem ci orkowi piraci będą jeść nas.”",
            description = "Dowodząc flotą okrętów, admirałowie są prawdziwymi władcami mórz. Choć większość służy w jednej z flot Starego Świata, niektórzy admirałowie to piraci dowodzący flotyllą żądnych krwi maruderów. Wielu kapitanów morskich zazdrości im ich pozycji, więc admirałowie muszą być bystrzy i charyzmatyczni, aby odpierać ataki; w końcu na morzu może wydarzyć się niemal wszystko, a tylko ci, którzy przeżyją, mogą opowiedzieć historię. Z tego powodu wielu admirałów to paranoicy zazdrośnie strzegący swojej władzy, a większość z nich szybko tłumi każdy domniemany bunt za pomocą lojalnych marines lub piratów."
        ),
        AdvancedProfessions.AgentCalunu to ProfessionDescription(
            quote = "„Martwy? Tak. Na razie. Ale spójrz na ślady po ugryzieniach. Czy może być co do tego jakakolwiek wątpliwość? Wiem, że był twoim bratem, ale teraz potrzebuje cię po raz ostatni… Potrzebuje, byś dał mu wieczny spokój.”",
            description = "Odłam zakonu wyznawców Morra, znany jako Bractwo Całunu, podchodzi do swoich obowiązków wobec boga znacznie aktywniej niż główny nurt kultu. W jego szeregach znajdują się wojownicy, kapłani i łowcy wampirów, lecz w wielu sytuacjach potrzebna jest o wiele subtelniejsza ręka — i właśnie takie zdolności posiadają Agenci Całunu. Ci uczeni specjaliści szkolą się w uważnej obserwacji, badaniach medycznych oraz logicznym rozumowaniu, aby móc wykrywać działalność wampirów lub nieumarłych, nie zdradzając własnej obecności. Część z nich przekazuje wyniki badań bardziej wojowniczym członkom zakonu, lecz sami również potrafią wymierzać sprawiedliwość i kończyć żywoty tych, których Bractwo nazywa „Wrogami Życia”. Agenci Całunu badają każdą podejrzaną śmierć pod kątem nekromancji lub mrocznej magii, dlatego często trafiają na sprawy morderstw, które ostatecznie okazują się pozbawione elementów mistycznych. Ich usługi są jednak doceniane przez rodziny ofiar, a sami Agenci chętnie pomagają każdemu niespokojnemu duchowi odnaleźć odpoczynek."
        ),
        AdvancedProfessions.Ambasador to ProfessionDescription(
            quote = "„Walczyć o własne ziemie to przywilej. Przemawiać w imieniu własnych ziem to zaszczyt.”",
            description = "Obdarzeni prawem do przemawiania w imieniu swojego władcy, ambasadorowie mogą posiadać ogromną władzę w różnych stolicach narodowych i prowincjonalnych Starego Świata, W Kislevie ambasadorowie pracują niestrudzenie ze swoich dobrze strzeżonych ambasad, gotowi zrobić wszystko, by przyciągnąć uwagę Królowej Lodu. Niektórzy ambasadorowie są wybierani ze względu na wysublimowany gust i zdolność do rozpuszczania zarówno rywali, jak i sojuszników odpowiednio dobranymi słowami i prezentami, inni mogą być wybierani ze względu na bystry umysł, znajomość sieci wywiadowczych lub niezaprzeczalną charyzmę. Niezależnie od indywidualnych zalet, wszyscy ambasadorowie pochodzą z szlacheckich rodów, gdyż Czarownica nigdy nie zniżyłaby się, by spotkać się z zagranicznym chłopem."
        ),
        AdvancedProfessions.Arcykaplan to ProfessionDescription(
            quote = "Błogosławiony Sigmar za swoje liczne łaski. Obdarzył nas dziś wielką siłą, aby pokonać naszych wrogów i szerzyć jego najświętsze słowo.",
            description = "Najwyższy Kapłan jest żywym ucieleśnieniem woli swojego Boga w Starym Świecie. Są dość rzadcy, ponieważ niewielu posiada zarówno siłę charakteru, jak i niezachwianą wiarę potrzebną do osiągnięcia tak wysokiego stanowiska. Z bardzo nielicznymi wyjątkami Najwyżsi Kapłani działają w jednym z głównych ośrodków swojej religii. Pielgrzymi przemierzają całe Cesarstwo, aby móc choćby przez chwilę przemówić do takiej istoty. Najwyżsi Kapłani zwykle albo odrzucają świat materialny, wycofując się do klasztoru, albo przyjmują władzę świecką, stając się potężnymi liderami temporalnymi.",
        ),
        AdvancedProfessions.Arcymag to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.Arcymistrz to ProfessionDescription(
            quote = "Prowadzić godnych podziwu rycerzy do honorowej walki przeciw Chaosowi to zaszczyt dla dowódcy. A stać na czele takiego oddziału jak ty to błogosławieństwo, jakby od samych bogów.",
            description = "Wielki Mistrz to wzór rycerskich cnót i przywódca jednego z zakonów rycerskich. Nie jest on tylko jednym z najbardziej przerażających wojowników Starego Świata, lecz również legendarnym dowódcą i liderem ludzi. Wielu rycerzy, nawet posiadających umiejętności i siłę umysłu, aby zostać Rycerzem Wewnętrznego Kręgu, nigdy nie osiąga tego poziomu. Wielki Mistrz zawsze stoi na czele armii w czasie wojny, prowadząc swoich rycerzy, a często całą armię, do bitwy. Jest zwykle jednym z najbardziej zaufanych doradców wojskowych i generałów, a gdy nie bierze udziału w walkach, zajmuje się ich planowaniem. Wielki Mistrz zakonu templariuszy często odgrywa również znaczącą rolę w kulcie religijnym, ciesząc się całkowitą lojalnością swoich wojowników."
        ),
        AdvancedProfessions.ArcymistrzRun to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.ArcymistrzZielarstwa to ProfessionDescription(
            quote = "Dla niektórych nasz sposób życia to czary. My po prostu postrzegamy go jako sposób lepszego zrozumienia zarówno świata widzialnego, jak i niewidzialnego.",
            description = "Hedgewise to najstarsi i najbardziej doświadczeni Hedgefolk. Kierują swoimi pobratymcami i są odpowiedzialni za ochronę ich przed wszelkim złem. Hedgewise mogą stawić czoła wielu różnym zagrożeniom, od wędrownych Kapłanów-Wojowników pragnących szerzyć Słowo Sigmara przy końcu młota, po tajemnicze Kulty, które mogłyby sprowadzić gniew Łowców Czarownic na lokalną społeczność. Wiele Hedgewise szybko nabywa głębokiej nienawiści wobec sług Mocy Zguby, ponieważ przyciągają niechcianą uwagę do Hedgefolk i są sprzeczni z ich sposobem życia. Z tego powodu nie jest rzadkością, że niektórzy Hedgewise przekraczają Granicę, by polować na prawdziwe Czarownice z równie wielką, jeśli nie większą, gorliwością niż Magistrowie i Kult Sigmara."
        ),
        AdvancedProfessions.Artylerzysta to ProfessionDescription(
            quote = "„Co? Co? Będziesz musiał mówić głośniej, chłopcze? Działa dzisiaj strzelają jak szalone.”",
            description = "Artylerzysta jest wyszkolony w obsłudze wszelkiego rodzaju machin oblężniczych, od balisty po katapulty, a także urządzeń prochowych, takich jak armata, moździerz czy karabin piekielny Imperium. Często konieczne są naprawy w polu, gdy pęknie koło lub rama działa, a sprytny Artylerzysta szybko uczy się tymczasowych napraw, by zapewnić minimalne przerwy w strzelaniu. Artylerzyści polegają na pracy zespołowej i dowodzą grupami Inżynierów, aby efektywnie obsługiwać swoje działa. Rzadko można ich spotkać poza dużą armią. Częściowo inżynier, częściowo żołnierz, całkowicie cel – Artylerzyści muszą nauczyć się dbać o siebie na polu bitwy. Zazwyczaj stoją wystarczająco daleko za liniami frontu, by uniknąć niebezpieczeństwa, ale skuteczność ich broni czyni ich ulubionymi celami dla wrogiego ognia, latających stworzeń i ataków magicznych. Przenoszenie machin w trudnym terenie jest wyczerpujące i wymaga dużej wytrzymałości. Kariera Artylerzysty to nie same chwały, jak się często uważa."
        ),
        AdvancedProfessions.Arystokrata to ProfessionDescription(
            quote = "Mój ojciec i ojciec mojego ojca ciężko pracowali, aby zbudować majątek i wpływy naszej rodziny. Cieszę się, że mogę nimi władać w ich imieniu.",
            description = "Lordowie szlacheccy są członkami szlachty posiadającymi realną władzę i odpowiedzialność, w przeciwieństwie do wielu dyletantów wypełniających dwory Starego Świata. Niektórzy dziedziczą swoje stanowiska, inni forsownie do nich dochodzą. Wszyscy cechują się silną wolą, biegłością w publicznych wystąpieniach oraz umiejętnościami bojowymi. Muszą sprawnie rozwiązywać lokalne spory, prowadzić negocjacje na dworze i dowodzić oddziałami w polu. Do najpotężniejszych lordów w Cesarstwie należą elektorzy hrabiowie, którzy spośród siebie wybierają kolejnego Cesarza.",
        ),
        AdvancedProfessions.Astrolog to ProfessionDescription(
            quote = "„Znaki gwiezdne Dragomasa Smoczego zgadzają się z Mammitem Mądrym. Mannslieb wschodzi i jest w pełni ujawniony. Takie przepowiednie są rzeczywiście pomyślne, mój panie. A teraz, jeśli chodzi o moją zapłatę…”",
            description = "Przyszłość jest dla wielu osób przerażająca: wojna, zagrożenie chaosem, choroby, bankructwo i zdrada – jest tak wiele powodów do niepokoju. Ludzie mają wiele pytań o przyszłość, a astrolog jest tam, aby dostarczyć odpowiedzi, niezależnie od tego, czy naprawdę wie, o czym mówi. Otoczony mapami gwiazd i tajemniczym sprzętem, astrolog poszukuje odpowiedzi, śledząc ruchy i wzajemne położenie planet na niebie. Niektórzy są naprawdę utalentowani i starają się wykonywać swoją pracę najlepiej, jak potrafią, podczas gdy inni niewiele się różnią od oszustów, którzy mówią klientom to, co chcą usłyszeć. Szlachta i inni wpływowi ludzie są podejrzliwi wobec tych, którzy potrafią przewidywać przyszłość, i pilnie strzegą czasu swoich narodzin. Sporządzenie horoskopu władcy bez pozwolenia jest uważane za zdradę, i wielu astrologów musiało uciekać w pośpiechu, tylko za próbę zaspokojenia ciekawości."
        ),
        AdvancedProfessions.Ataman to ProfessionDescription(
            quote = "„Zbierzmy się jako społeczność i świętujmy więzi, które nas łączą.”",
            description = "Większość społeczności w obwodach jest kierowana przez atamanów (kobieta: atamanki). Gospodarscy atamani to zazwyczaj druzhiny, których rodziny rządziły lokalnie przez pokolenia. W porównaniu do tego, większość Ungolów wybiera swoich atamanów w drodze wyborów lub według niejasnych (często wojskowych) tradycji, ponieważ większość ich szlacheckich rodów została dawno wyeliminowana przez Gospodarów. Atamani ponoszą wielką odpowiedzialność, gdyż wszystkie ważne sprawy lokalne są przez nich rozstrzygane, zwłaszcza te dotyczące bezpieczeństwa i prawa. Ponadto, jeśli w danej okolicy nie ma lokalnych kapłanów, atamani przejmują również odpowiedzialność za duchowe dobro swoich ludzi, prowadząc obrzędy i ceremonie religijne."
        ),
        AdvancedProfessions.Bard to ProfessionDescription(
            quote = "Piosenka może dotknąć serca łatwiej niż przemowa, a ta piosenka może nauczyć tyle samo o pięknie, ile przekazuje w swoich słowach.",
            description = "Minstrele to wędrowni muzycy, którzy przemierzają drogi Starego Świata, niosąc swoje pieśni i rozrywkę tym, którzy najbardziej tego potrzebują. Pierwotnymi i najbardziej znanymi Minstrelami byli Elfy, lecz dziś wielu Ludzi podąża ich śladami. Minstrele są w Starym Świecie niemal świętymi postaciami. Mogą wejść do najniebezpieczniejszych kryjówek złoczyńców i wyjść bez szwanku (oczywiście, jeśli zapewnią darmową rozrywkę). Czasami Minstrel przyjmuje patronat od Szlachcica lub Kupca i osiedla się na pewien czas, komponując pieśni na życzenie swojego protektora. Jednak w końcu otwarta droga znów wzywa, i Minstrel wyrusza dalej.",
        ),
        AdvancedProfessions.Bezimienny to ProfessionDescription(
            quote = "Honor wśród złodziei? Nie jesteśmy złodziejami. Nie mamy takich ograniczeń.",
            description = "Wszystkie bandy Herrimaultów mają przywódcę; jeśli grupa zbiera się przypadkiem, albo pojawia się lider, albo grupa znów się rozprasza. Najczęściej udane bandy Herrimaultów prowadzi Faceless – osoba wysoko doświadczona w dochodzeniu sprawiedliwości i prawdy w sposób niekonwencjonalny.\n\nFaceless, w przeciwieństwie do zwykłych szefów band, rzadko muszą martwić się o zdradę własnych podwładnych. Większość z nich wspiera potencjalnych Faceless w grupie, pozwalając im się rozwijać i w końcu zakładać własne bandy. Etyka ma swoje zalety. Z drugiej strony, Faceless muszą dbać o wyżywienie swojej grupy, schronienie i naprawianie krzywd – wszystko bez naruszania zasad moralnych, które sami sobie ustanowili. Niektórzy w końcu ulegają presji.\n\nWiększość Faceless pielęgnuje aurę tajemniczości, nosząc głębokie kaptury, by ukryć twarz. Niektóre osoby krążące w plotkach to wpływowi szlachcice, a nawet Rycerze Graala, naprawiający krzywdy, których nie mogą ujawnić publicznie."
        ),
        AdvancedProfessions.BiczBozy to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.Biczownik to ProfessionDescription(
            quote = "Czuję od ciebie odór Chaosu, bluźnierco! Może mój bicz uwolni go z twojego ciała!",
            description = "Biczownicy to oszalałe fanatyczne jednostki religijne, które ledwo przejmują się własnym życiem, o ile mogą zadać cios Chaosowi i wszystkiemu, co uważają za plugawstwo, zanim odejdą. Często są to wyjątkowo charyzmatyczne osoby, które prowadzą innych złamanych ludzi, gdyż siła ich osobowości i mocne przekonania religijne przyciągają innych do nich. Flagelanci zawsze używają ogromnych broni, aby skutecznie zadawać ciosy swoim wrogom, i unikają pancerza, wierząc, że ich Bogowie ochronią ich aż nadejdzie odpowiedni czas śmierci. Zdrowsi na umyśle ludzie zwykle aktywnie unikają ich towarzystwa."
        ),
        AdvancedProfessions.Bosman to ProfessionDescription(
            quote = "Pan Garbach to człowiek, którego należy odwiedzić. Kapitan Soarsteiger może być właścicielem Nettle’s Sting, ale nic na tym statku nie dzieje się bez zgody Garbacha.",
            description = "Bosman pełni funkcję drugiego dowódcy na statku, odpowiadając bezpośrednio przed Kapitanem. Odpowiada za wykonanie rozkazów Kapitana, co może być trudnym zadaniem nawet przy najbardziej profesjonalnej załodze. Starszy Wodnik musi być surowy, lecz sprawiedliwy, zdobywając szacunek załogi, w przeciwnym razie szybko stanie się obiektem żartów, a w razie buntu – czymś znacznie gorszym. Starsi Wodnicy to zawsze doświadczeni żeglarze, często z wieloma rejsami za sobą, a niewiele portów nie zna ich picia, walki i hulanki.",
        ),
        AdvancedProfessions.Brygadzista to ProfessionDescription(
            quote = "Dalej, nieroby! Nie płacą wam za siedzenie i zbieranie kurzu! Wstańcie i do pracy, jest co robić.",
            description = "Głębokie głosy rozbrzmiewają po zatłoczonych miastach Starego Świata, gdy Majstrowie kierują swoimi spoconymi zespołami za pomocą ostrych słów i rubasznych pieśni. Na tętniących życiem nabrzeżach pisk gwizdka Majstra zmusza bezrobotnych do ucieczki z zadymionych tawern, wszyscy desperacko próbują przenieść ciężki ładunek z nabrzeża do magazynu w zamian za grosze. Ponieważ Majstrowie często są opłacani według tempa pracy swoich ludzi, mogą być bezwzględnymi nadzorcami, „motywując” swoich tymczasowych pracowników wszelkimi możliwymi sposobami. W przeciwieństwie do nich, Majstrowie Stevedore prowadzą swoje stałe zespoły z prawdziwą dumą, pewnie negocjując z właścicielami doków i kupcami dodatkową pracę i wynagrodzenie, a także aktywnie uczestnicząc w sprawach gildii i sporach terytorialnych. Z tego powodu zazwyczaj patrzą z nieukrywanym pogardą na swoich współczesnych kierujących pracownikami tymczasowymi."
        ),
        AdvancedProfessions.Budowniczy to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.Ceremoniarz to ProfessionDescription(
            quote = "Atakują teraz? Nie? W takim razie możesz powiedzieć wysokiemu kapłanowi o szalejących mutantach po porannych modlitwach.",
            description = "Asystent kultu to pomocnik kapłanów kultu, odpowiedzialny za organizowanie wszystkich przyziemnych spraw związanych z funkcjonowaniem świątyni. Asystenci zajmują się logistyką, planują porządek nabożeństw, koordynują działalność duchowieństwa i wiernych, i dbają o to, by rytuały i modlitwy przebiegały jak najsprawniej. Asystent kultu działa za kulisami świątyni i wielu z nich szczyci się tym, że pozostają jak najmniej widoczni."
        ),
        AdvancedProfessions.Czarownik to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.Czarnoksieznik to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.CzarnyStraznik to ProfessionDescription(
            quote = "Nie przejdziesz. Chyba że przez Bramy Morra chcesz wędrować.",
            description = "Podczas gdy kult Morra ma niewielu, jeśli w ogóle, oficjalnych templariuszy, posiadają Czarną Gwardię. Ci zawsze posępni i poważni wojownicy mają jeszcze poważniejszą odpowiedzialność: strzec zarówno żywych, jak i zmarłych przed nieustającą złośliwością Nieumarłych oraz tych, którzy chcieliby ich wskrzeszać. W większości są to wojownicy defensywni, chroniący wielkie świątynie i cmentarze Imperium oraz dostojników kultu, wyruszając na wojnę tylko w wyjątkowych okolicznościach, na przykład podczas krucjaty przeciwko hrabiom wampirów. W przeciwieństwie do większości rycerzy, są szkoleni w użyciu broni dystansowej, aby przeciwnicy nie mogli wykorzystać swojej siły w zwarciu. W połączeniu z ich ponurą czarną, obsydianową zbroją oraz surową przysięgą milczenia podczas służby, sprawia to, że są unikani przez większość innych zakonów rycerskich, ale taka jest cena obowiązku."
        ),
        AdvancedProfessions.Demagog to ProfessionDescription(
            quote = "Na pewno, dobrzy ludzie, nie będziecie tolerować tej niesprawiedliwości w naszym mieście?",
            description = "Demagodzy to najbardziej wpływowi Agitatorzy, mówcy publiczni obdarzeni takim talentem, że swoimi przekonującymi słowami potrafią poruszyć całe kraje. Zawsze stoją na czele spraw, które zdecydują się wspierać. Władza patrzy na Demagogów z dużą podejrzliwością, gdyż są zdolni wzniecać bunt i siać nieufność wobec rządu lub kościoła. Jeśli jednak uda się odpowiednio skierować ich zapał, mogą być niezwykle użyteczni w mobilizowaniu ludzi przeciwko Chaosowi i innym zagrożeniom. Z tego powodu władze traktują popularnych Demagogów ostrożnie, a czasem nawet z pewną przychylnością."
        ),
        AdvancedProfessions.Dworak to ProfessionDescription(
            quote = "Życie na pograniczu jest naprawdę ciężkie. Dobrze, że tu jestem, żeby dbać o twoje interesy.",
            description = "Dworzanie Pogranicza żyją w dworach Książąt Pogranicza, gdzie życie jest znacznie bardziej dosłowne niż w cywilizowanych krainach. Oczernianie przeciwnika obejmuje fizyczne błoto, zdrada wymaga noża, a przegrani w politycznych rozgrywkach naprawdę są ranni lub zabici. Dworzanie z tego regionu są więc nieco bardziej fizyczni niż ich odpowiednicy w innych krainach. Dworzanie Pogranicza przebywają w domu Księcia Pogranicza, licząc na to, że przeżyją wystarczająco długo, aby sami objąć tę pozycję. Intrygi, morderstwa i zdrada to ich normalne metody działania. Paranoja jest zawodowym zagrożeniem, a hipokryzja – wymogiem zawodu."
        ),
        AdvancedProfessions.Dworzanin to ProfessionDescription(
                quote = "Słyszałeś o wicehrabi? Plotki na dworze mówią, że znowu ma kochankę, a tym razem – jest ona mężatką. Głowy polecą, Stephan. Głowy polecą. A cóż to mnie obchodzi? Stephan, powinieneś już wiedzieć, że własne sprawy wydają mi się strasznie nudne. Zdecydowanie wolę sprawy innych.",
        description = "Dworzanie otaczają arystokrację na dworze, przypochlebiając się swoim władcom i damom w nadziei na awans. Są różni – od pochlebców desperacko pragnących przypodobać się, po przebiegłych intrygantów, którzy szukają kluczy do bogactwa i prestiżu. Dworzanie często są dobrze wykształceni i biegli w retoryce, gdyż często proszeni są o wygłaszanie erudycyjnych opinii na różne tematy dla swoich szlacheckich protektorów. Żaden dworzanin, bez względu na spryt, nie może być w pełni pewny swojej pozycji, gdyż zawsze pojawia się ktoś inny, który jej pragnie i jest gotów zrobić niemal wszystko, by ją zdobyć. Kobiety-dworzaniny zazwyczaj znane są jako damy dworu."
    ),
        AdvancedProfessions.Egzorcysta to ProfessionDescription(
            quote = "Pacjent reaguje na święty symbol Ulrica, ale nie na Sigmara; będę musiał to zbadać, aby określić najlepszy sposób działania. Jestem pewien, że podczas mojej następnej wizyty uda nam się zidentyfikować i wypędzić ducha.",
            description = "Wśród wielu niebezpieczeństw (naturalnych i nienaturalnych), które zagrażają mieszkańcom Starego Świata, znajduje się opętanie przez złowrogie duchy. Duchy te, chcąc wyrządzić krzywdę w świecie żywych, przejmują ciała swoich ofiar, dążąc do jak największego spustoszenia. Niektóre są prawie bezmyślne, zmuszając swoich gospodarzy do gwałtownych szaleństw, które najczęściej kończą się śmiercią wszystkich uczestników. Inne działają bardziej subtelnie, wykorzystując nieświadomych przyjaciół, rodzinę i znajomych ofiary do wykonywania przerażających czynów. W przypadku Nieumarłych opętanie zwykle odzwierciedla pragnienie powrotu do życia, ponownego bycia blisko ukochanej osoby lub zemsty.\n\nAby stawić czoła temu nikczemnemu zagrożeniu i, jeśli to możliwe, ocalić życie i duszę opętanej ofiary, niektóre kultury wyznaczyły specjalistów do wypędzania duchów. Egzorcyści spędzają niezliczone godziny nad tomami zakazanej wiedzy. Są to ludzie oddani swojej pracy i silnej woli – muszą być, ponieważ egzorcyzm jest próbą wiary i siły woli pomiędzy egzorcytą a duchem.\n\nNiektórzy jednak pękają pod naporem i załamują się, tracąc licencje i kończąc kariery. Inni ulegają korupcji przez wiedzę, którą studiowali tak pilnie, i zaczynają służyć tym samym siłom, którym niegdyś stawiali opór."
        ),
        AdvancedProfessions.Falszerz to ProfessionDescription(
            quote = "Nakaz cesarski aresztowania Magistrata Leopolda? A, mogę to zrobić – ale będzie kosztować niejedną koronę.",
            description = "Fałszerze są artystami świata przestępczego, ale ich powołanie polega na naśladowaniu, a nie tworzeniu oryginałów. Fałszerze utrzymują się, kopiując dzieła innych i podszywając się pod oryginały – czy to obraz cesarza, pieczęć na „oficjalnym” dokumencie, czy podpis na kompromitującym liście. Fałszerze wolą działać w względnej anonimowości; nie tylko ich praca jest przestępstwem często karanym okaleczeniem, ale ujawnienie fałszerstwa psuje część satysfakcji odczuwanej po udanej akcji."
        ),
        AdvancedProfessions.Fechtmistrz to ProfessionDescription(
            quote = "Na moją cześć, nie ustąpię!",
            description = "Fechtmistrzowie to wojownicy, którzy poświęcają swoje życie walce wręcz, przewyższając wszystkich innych na polu bitwy. Nie są przywódcami ludzi, ale jako indywidualni wojownicy są bezkonkurencyjni. Żyją dla momentów, gdy ich umiejętności są wystawione na najwyższą próbę, bo tylko wtedy naprawdę wiedzą, jak dobrzy są. Wielu Mistrzów służy w armiach, bandach wojennych i zakonach rycerskich, inni wędrują po Imperium, sprzedając swoje niezwykłe umiejętności najwyższemu oferentowi. Ich broń jest zawsze jedną z najlepszych, jakie można znaleźć w Starym Świecie."
        ),
        AdvancedProfessions.HandlarzNiewolnikami to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.Herold to ProfessionDescription(
            quote = "Per pale, sable and or, two scorpions tergant, counterchanged...to zarejestrowany herb jednego z wielkich domów kupieckich Remas. Ciekawe, że jeden z ich najemników znalazł się tak daleko na północy. Hm. Jeśli nie ukradł tego herbu podczas najazdu... cóż. Może być ciekawie.",
            description = "Heroldowie są głosem szlachty, zobowiązani do ogłaszania przybycia swoich panów i patronów lub czasami przekazywania wieści o ważnych wydarzeniach z daleka. Są niezmiennie biegli w mowie, posiadają szybki umysł i są dobrze wykształceni jak na swoje czasy. Heroldowie powinni rozpoznawać heraldykę setek szlachciców na pierwszy rzut oka, stąd ich nazwa. Rzadko sami są szlachcicami, ale ich stanowisko jest uważane za jedno z nielicznych, które stanowi krok w stronę niższej szlachty. Heroldowie dbają o swój wygląd, gdyż jest on odbiciem ich pana."
        ),
        AdvancedProfessions.HersztBanitow to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.Husarz to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.Inzynier to ProfessionDescription(
            quote = "Teraz, jeśli tylko wyreguluję zębatkę celownika o jeden stopień… ups! Dzięki Sigmarowi, że to byli tylko najemnicy!",
            description = "To Krasnoludy jako pierwsze wprowadziły naukę inżynierii do Starego Świata. Wśród nich Gildia Inżynierów cieszy się wielkim szacunkiem, a jej dzieła mają wysoką rangę – o ile przestrzegają tradycyjnych metod i wartości. Ludzie przejęli krasnoludzką wiedzę i poszli dalej, zwłaszcza w zakresie prochu strzelniczego i innych urządzeń nadających się do użytku wojennego. Cesarska Szkoła Inżynierów w Altdorfie słynie ze swoich dziwacznych wynalazków, które potrafią być niezwykle przydatne – pod warunkiem, że w ogóle działają. Poza Imperium szczególną sławą cieszą się Tileańczycy, znani ze śmiałych pomysłów inżynieryjnych."
        ),
        AdvancedProfessions.Kapitan to ProfessionDescription(
            quote = "Szukamy kilku dobrych ludzi, aby poprowadzić samobójczy rajd przeciw armii Orków. Ochotnicy?",
            description = "Kapitanowie to dowódcy wojskowi w pełnym konfliktów Starym Świecie. Dowodzą Żołnierzami, Milicjantami, Najemnikami, a nawet Strażnikami Dróg na krwawych polach bitew i ulicach pełnych trupów w niekończących się kampaniach wojskowych Imperium i poza nim. Większość kapitanów to twardzi, zawodowi żołnierze, którzy przetrwali dziesiątki zaciekłych bitew, aby dotrzeć tam, gdzie są. Nic dziwnego, że niechętnie służą niedoświadczonym Szlachcicom, co jest zbyt częstym zjawiskiem. Kapitanowie cenią doświadczenie i umiejętności bardziej niż urodzenie i pozycję społeczną. Wiedzą, co naprawdę się liczy na polu bitwy."
        ),
        AdvancedProfessions.Kaplan to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.KaplanSwiecki to ProfessionDescription(
            quote = "Bogowie nie mogą odpowiedzieć na każde wołanie o pomoc. Dlatego musimy być wdzięczni za otrzymaną pomoc i zawsze gotowi, by pomagać sobie sami.",
            description = "Kapłani, którzy służą woli swoich bogów poprzez uczynki doczesne, znani są jako kapłani świeccy. W przeciwieństwie do swoich magicznych odpowiedników, kapłani świeccy nie spędzają dnia i nocy studiując ezoteryczne pisma, aby osiągnąć kontakt z boskością. Zamiast tego wygłaszają kazania dla zwykłych ludzi, gdyż ostatecznie wiara mas wynosi bogów ponad demony i duchy. Kapłani świeccy nie są jedynie kaznodziejami; są także rzemieślnikami, uczonymi i administratorami. Sfera wpływów boga przejawia się w fachowości kapłana świeckiego, a ideał boski ukazuje się poprzez jego publiczne postępowanie.",
        ),
        AdvancedProfessions.KaplanWojownik to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.Karczmarz to ProfessionDescription(
            quote = "Prywatny pokój kosztuje złotą monetę. Nie obwiniaj mnie, obwiniaj festiwal. W przeciwnym razie wspólne kwatery kosztują tylko pół szylinga. Plus gratis – pluskwy.",
            description = "Karczmarze posiadają i prowadzą zajazdy, które pozwalają gospodarce Starego Świata kwitnąć. Wiele rodzin karczmarzy prowadzi swoje przybytki od pokoleń. Obsługują wszystkich klientów, niezależnie od klasy społecznej, pod warunkiem, że ci potrafią zapłacić. W czasach, gdy większość ludzi jest zamknięta w swoich społecznościach, karczmarze nauczyli się, że informacje są cenne, i zwykle dysponują wiadomościami z odległych miejsc. Niektórzy karczmarze zwiększają swoje dochody, łącząc klientów – od znajdowania odpowiedniego towarzystwa dla gości, po stwarzanie kontaktu z osobami, które mogą definitywnie usunąć kłopotliwych ludzi bez zadawania pytań.",
        ),
        AdvancedProfessions.Katecheta to ProfessionDescription(
            quote = "Inicjacie Borgas, jeśli tak bardzo chcecie mówić podczas lekcji, może staniecie i recytujecie Siedemnaście Cnót Shallyi reszcie klasy?",
            description = "Katechiści to nauczyciele religijni biegli w studiowaniu świętych pism i reguł, którzy uczą subtelności obu dziedzin każdemu, kto chce słuchać (lub jest zmuszony słuchać). Rzadko są tak otwarci umysłem czy bystrzy jak uczeni, wolą tradycję od postępu i naukę na pamięć zamiast prawdziwego zrozumienia. Katechista zwykle odpowiada za religijne wychowanie inicjatów w świątyni, nawet jeśli sam jest tylko członkiem świeckim. Nie wszyscy katechiści mają charakter religijny – niektórzy koncentrują się na studiowaniu magii, lecz brak im talentu, by zostać czarodziejem, zamiast tego uczą teorii uczniów w jednej z Akademii Magii."
        ),
        AdvancedProfessions.Koniuszy to ProfessionDescription(
            quote = "Dobry koń i piękna kobieta to wszystko, czego mężczyzna naprawdę potrzebuje. Ale ufaj tylko koniowi.",
            description = "Mistrzowie koni są odpowiedzialni za dobrostan, trening i hodowlę koni, zajmując istotne stanowiska na wszystkich poziomach społeczeństwa Kislevitów. Wśród nomadów stepowych, mistrz koni często ustępuje jedynie atamanowi, ponieważ jego umiejętności gwarantują przetrwanie społeczności. Żaden mistrz koni w Kislev nie posiada większej władzy niż koniuszy, własny Mistrz Koni Królowej Lodu. Ten wpływowy bojar zarządza nie tylko stajniami carowej, lecz również jej psami. Jego urząd ma więc dostęp do znacznej części skarbca Królowej Lodu, wszystko po to, aby szkolić i wyposażać jej zwierzęta na najwyższym możliwym poziomie.",
        ),
        AdvancedProfessions.KonnyLucznik to ProfessionDescription(
            quote = "Gdy siedzisz przy moim stole, jestem twoim sługą. Gdy śpisz przy moim ogniu, jestem twoim obrońcą. Gdy wyruszamy do bitwy, nic ci nie jestem winien.",
            description = "Ungolscy łucznicy konni to wybitni strzelcy i uznawani są za jedną z najlepszych lekkich kawalerii w Starym Świecie. Ich umiejętności w posługiwaniu się scymitarą, włócznią i łukiem końskim szlifowane są podczas polowań na kyazak na Nieskończonej Stepie, którą patrolują na rozkaz Czaresy. Ich najczęstszą taktyką jest okrążanie wroga i zasypywanie go strzałami. Wśród walczących Ungolów z Kraju Trolli wszyscy zdolni do walki są zobowiązani do uczestnictwa, zwłaszcza podczas ataków najemników Chaosu. Dlatego w rotach północnych łuczników konnych często znajdują się kobiety, co czasem trudno zaakceptować południowym Kislevitom.",
        ),
        AdvancedProfessions.KowalRun to ProfessionDescription(
            quote = "Dobre. Ale niewystarczająco dobre. Możesz nim władać, jeśli chcesz, człowieku. Nie chcę tego już więcej widzieć.",
            description = "Czeladnicy Runesmith kończą podstawowe szkolenie i są wywyższani przez swojego mistrza, aby poznać głębsze tajemnice swojego rzemiosła. Zamiast dalszej instrukcji, oczekuje się od nich, że wyruszą w świat w poszukiwaniu starożytnych magicznych skarbów do studiowania. Ponadto, ci krasnoludy muszą wykorzystać zdobytą wiedzę i samodzielnie nauczyć się dodatkowych run poprzez własne badania i eksperymenty. Po zakończeniu okresu czeladniczego, Runesmith może wrócić do mistrza, aby zaprezentować swoje umiejętności. Jeśli zostanie uznany za godnego, mistrz może awansować ucznia do pełnego statusu Mistrza Runesmitha i nauczyć go sekretów Mistrzowskich Run.",
        ),
        AdvancedProfessions.Krzyzowiec to ProfessionDescription(
            quote = "Czy los ludzkości ma sprowadzać się do biernego siedzenia i pozwalania, by ciemność ją pochłonęła? Nie, mówię wam! Musimy uderzyć w cienie!",
            description = "Najwspanialszym czynem, jaki może dokonać templariusz, jest pójście na wojnę w imię Bogów. W dawnych czasach, zwłaszcza podczas krucjat przeciwko Arabi, było rzadkością, by rycerz nie wyruszał na krucjatę ze swoim zakonem. W ostatnich czasach krucjaty są znacznie rzadsze, szczególnie na taką skalę. Krzyżowcy to rycerze-weterani krucjat, którzy zdobyli wielką chwałę dla swojego zakonu i wiary poprzez czyny na obcych ziemiach przeciwko wrogom kultu. Są obyci w świecie, wykwalifikowani w walce w różnych warunkach i przeciw różnorodnym wrogom, a wielu rycerzy powracających z krucjaty znajduje swoje czyny na zawsze uwiecznione w legendach zakonu. Nie wszyscy krzyżowcy pochodzą z szlachty czy z zakonu rycerskiego, choć większość tak. Niektórzy są pobożnymi żołnierzami walczącymi u boku templariuszy i rycerzy, a ich czyny nie są mniej szlachetne mimo niższego statusu."
        ),
        AdvancedProfessions.KsiazeZlodziei to ProfessionDescription(
            quote = "Szkoda, że nasze interesy musiały skończyć się w ten sposób. Mogliśmy tak dobrze współpracować, gdybyś tylko... och, przestań krzyczeć, ledwo oderwał ci połowę palców.",
            description = "Większość miast Starego Świata ma jedną lub więcej zorganizowanych grup przestępczych, takich jak gildie złodziejów czy asasynów. Władcy przestępczości są przywódcami tych grup i są potężni oraz niebezpieczni. Aby znaleźć się w ich szeregach, trzeba być sprytnym, ambitnym i bezwzględnym. Większość wspina się po szczeblach kariery od samego dołu, ucząc się wszystkich brudnych sztuczek po drodze. Władcy przestępczości rzadko mogą sobie pozwolić na zaufanie. Są ekspertami w ocenie ludzi i sytuacji, aby zdobyć każdą możliwą przewagę. Wielu z nich angażuje się w lokalną politykę, by zwiększyć swoją władzę."
        ),
        AdvancedProfessions.Kupiec to ProfessionDescription(
            quote = "Te belki egzotycznych jedwabi z Cathay? Pf. Kto by tego chciał? Dam ci pięćdziesiąt koron złota za cały wóz, bo mi cię żal. Robię ci przysługę.",
            description = "Kupcy to spekulanci, którzy zajmują się przewożeniem dużych ilości towarów z miasta do miasta, szukając rynku, na którym osiągną największy zysk. Rzadko wchodzą w interakcje z ogółem ludności, gdyż handlują hurtowo, zazwyczaj sprzedając swoje towary mieszczanom i rzemieślnikom. Gildie kupieckie mają ogromny wpływ w Cesarstwie i stopniowo wypierają pozycję, którą niegdyś zajmowała szlachta w Starym Świecie. Nawet najbiedniejszy kupiec jest zwykle bardzo zamożny; wielu z nich wykorzystuje swoje bogactwo, by kupić legitymację, nabywając tytuły lub wydając swoje dzieci za członków rodzin szlacheckich.",
        ),
        AdvancedProfessions.Lajdak to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.LesnyDuch to ProfessionDescription(
            quote = "Ci, którzy zagrażają świętości lasu, poczują gniew lasu w każdym strzale.",
            description = "Prawie nadprzyrodzenie cisi i zwinni, Duchowi Wędrowcy przemierzają Stary Świat, tropiąc siły Chaosu i inne zagrożenia dla przyrody. Najbardziej czują się w lasach, choć w razie potrzeby potrafią niepostrzeżenie poruszać się po górach i innych terenach. Duchowi Wędrowcy są zabójczymi łucznikami, słynącymi z tego, że nigdy nie chybią celu. Zwykle są cisi lub powściągliwi i uważani za osobliwych i budzących respekt, nawet w oczach własnego ludu. Często czują się bardziej komfortowo wśród przyrody niż w towarzystwie innych istot rozumnych."
        ),
        AdvancedProfessions.LodowaCzarownica to ProfessionDescription(
            quote = "Teraz przyzywam lód, a lód odpowiada. To wszystko, co musisz wiedzieć.",
            description = "Czarownice lodu z Kislevu są zarówno budzące strach, jak i szanowane w całym Starym Świecie. Są najciemniejszą zimą, najzimniejszym lodem i najokrutniejszą zamiecią, a niewielu jest w stanie znieść ich obecność przez dłuższy czas. Bycie czarownicą lodu to jednak coś więcej niż posługiwanie się Magią Lodu i obrona Kislevu przed wrogami. Czarownice lodu należą do starożytnego zakonu sióstr, który od dawna wpływał na plemię Gospodar i wciąż odgrywa w nim znaczącą rolę. Utrzymują kontakt z zimowymi duchami ziemi i zamarzniętymi przepływami magii, dzięki czemu dbają o zachowanie starych zwyczajów i dawnych miejsc, starając się, aby ich nieskalana magia pozostała czysta i nietknięta.",
        ),
        AdvancedProfessions.LodowaPanna to ProfessionDescription(
            quote = "Lód mnie zawołał, i odpowiedziałam. To wszystko, co musisz wiedzieć.",
            description = "Gdy adeptki czarownictwa kończą szkolenie, zostają uwolnione przez swoje mistrzynie, aby zgłębić Magię Lodu. W tym celu muszą jak najwierniej naśladować Starą Wdowę, składając śluby czystości (symbolizujące stan wdowieństwa), po czym wyruszają z zimną determinacją w sercach. Panny lodu można spotkać w najbardziej nieoczekiwanych miejscach podczas ich poszukiwań wiedzy, lecz najczęściej wędrują po mroźnym obwodzie, stawiając czoła kyazakom, duchom ziemi i dzikim Zielonoskórym z równą niezłomnością. Śluby czystości panny lodu kończą się, gdy osiągnie ona pełną wiedzę o swej zimowej magii i staje się pełnoprawną czarownicą lodu; jednak niektóre nigdy nie osiągają tego zrozumienia i pozostają samotne na zawsze.",
        ),
        AdvancedProfessions.LowcaCzarownic to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.LowcaWampirow to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.MagisterRewizor to ProfessionDescription(
            quote = "Czas na skruchę minął, Magisterze Festusie. Teraz nadszedł sąd.",
            description = "Kolegium Magii niechętnie pozwala, by ich brudy były prane publicznie przez Łowców Czarownic lub inne władze. W związku z tym każda Orden zatrudnia własnych strażników i śledczych, poświęconych dyskretnemu ujawnianiu tych, którzy łamią swoje śluby i praktykują czarną magię, nekromancję lub diabolizm. Ponieważ wampiry często są uczniami tych czarnych sztuk, obserwatorzy ci z dumą polują także na książąt ciemności i ich niszczą. Magistrowie Strażnicy nadal płacą składki swojemu Kolegium, zgodnie z zasadami magistra-lorda, ale nie oczekuje się od nich przyjmowania uczniów. Ich obowiązki w całym Cesarstwie uniemożliwiają im zdobycie takiej kontroli nad magią, jaką posiada wielu ich kolegów, ale posiadają liczne inne umiejętności i talenty przydatne w różnych sytuacjach, zdobywając tym samym wielki szacunek i strach wśród swoich rówieśników.",
        ),
        AdvancedProfessions.Majordomus to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.Medyk to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.MistrzCieni to ProfessionDescription(
            quote = "Nic nigdy nie jest całkowicie bezpieczne. Jeśli ktoś czegoś naprawdę pragnie, znajdzie… sposoby… by to zdobyć.",
            description = "We wszystkich profesjach są ci, którzy osiągają szczyt. Mistrzowie Złodziei są wielkimi artystami świata przestępczego. Są najlepszymi złodziejami, biegłymi we wszystkich umiejętnościach potrzebnych do nielegalnego zdobywania cudzej własności. Mistrzowie Złodziei zazwyczaj działają w strukturach lokalnej gildii złodziei, ale jako bravos, którzy regularnie lekceważą prawo, wielu z nich woli działać, ironicznie, „nielegalnie”, czyli bez aprobaty lokalnego Władcy Przestępczego. Cesarstwo od dawna potajemnie podziwia odważnych złodziei, choć jeśli zostaną przyłapani, nadal ponoszą karę.",
        ),
        AdvancedProfessions.MistrzGildii to ProfessionDescription(
            quote = "Na następnym ogólnym zebraniu chciałbym, aby Zigmund i Greta wspólnie poprowadzili seminarium na temat realizacji celów wydajnościowych poprzez praktyczne inicjatywy ograniczania kosztów. Och, i składki gildii są należne 23 Jahrdrunga.",
            description = "Mistrzowie gildii to jedni z najbardziej wpływowych ludzi w Starym Świecie, cicho dyktując, jak ma funkcjonować handel w różnych rejonach i ułatwiając przepływ towarów. W ich szeregach znajdują się mistrzowie kupiectwa i przebiegli złodzieje, którzy wszyscy prowadzą subtelną grę o władzę i kontrolę z arystokratami. Mistrzowie gildii rzadko są wielkimi wojownikami, ponieważ mają wielu innych do zajmowania się takimi sprawami. Są raczej quasi-politykami, którzy prowadzą interesy z politykami Imperium na własnych warunkach. W zależności od tego, jaką gildię kontrolują, Mistrzowie gildii mogą być traktowani z najwyższym szacunkiem lub z niechętną grzecznością."
        ),
        AdvancedProfessions.MistrzMagii to ProfessionDescription(
            quote = "Z Wiatrami Magii nie wolno igrać. Nauczyłem się je szanować, a to było kluczem do odblokowania ich mocy.",
            description = "Mistrz Czarodziej to ten, kto posługuje się magią z pewnością i finezją. Elfickim Czarodziejom łatwo jest osiągnąć ten poziom rzucania zaklęć, lecz dla Człowieka jest to praca całego życia. Gdy osiągają ten poziom mistrzostwa, większość Czarodziejów zaczyna wykazywać ekscentryczności i zmiany fizyczne wynikające z bliskiego obcowania z magią. Mistrzowie Czarodzieje zazwyczaj wolą spędzać czas na badaniach lub politykowaniu z innymi magistrami. Jednak ich Zakon zwykle wymaga, by wyruszali w świat, rozwijając sztukę magii i szukając młodych adeptów do nauki.",
        ),
        AdvancedProfessions.MistrzRun to ProfessionDescription(
            quote = "Uważajcie. Nie zamierzam się powtarzać.",
            description = "Mistrzowie Runiczni są nauczycielami i strażnikami wiedzy runicznej. Niewielu Runistów osiąga ten status, a spośród tych, którzy go zdobywają, wielu pozostaje w swoich twierdzach, przekazując zdobytą wiedzę młodym i utalentowanym Krasnoludom z rodzin. Inni Mistrzowie Runiczni poświęcają lata życia na poszukiwanie starożytnych sekretów, podróżując po świecie w celu odnalezienia pradawnych broni i artefaktów oraz odzyskania utraconych Run od dawnych, legendarnych Runistów. Takie wyprawy prowadzą Mistrzów Runicznych w niebezpieczne miejsca, jak zrujnowane twierdze, legowiska smoków, głębiny elfich lasów i inne, gdyż znaczna część krasnoludzkiego terytorium na przestrzeni wieków przeszła w ręce wrogów.",
        ),
        AdvancedProfessions.MistrzRzemiosla to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.MistrzZakonny to ProfessionDescription(
            quote = "Do mnie, dzielni rycerze! Razem oczyścimy tę ziemię z zagrożenia dla Imperium!",
            description = "W każdym zakonie rycerskim są tacy, którzy wznoszą się na sam szczyt – najlepsi z najlepszych. Raz po raz dowiedli swej odwagi i lojalności, za co zostali włączeni do wewnętrznego kręgu zakonu. Dowodzą rycerzami na polu bitwy, reprezentują zakon na dworach i podejmują najważniejsze decyzje. To jedni z najpotężniejszych wojowników, jakich ma do zaoferowania Stary Świat, a wielu z nich powierzono niebezpieczne sekrety dotyczące fundamentów ich bractwa. Każdy z nich marzy o tym, by pewnego dnia zostać Wielkim Mistrzem swojego zakonu – szczytem rycerskiej kariery.",
        ),
        AdvancedProfessions.MistrzZielarstwa to ProfessionDescription(
            quote = "Rozumiem, że szukasz mikstury. Mogę ją dla Ciebie przygotować, jeśli chcesz… ale może przydadzą się również słowa rady.",
            description = "Osoby w pełni wtajemniczone w starożytne tajemnice Hedgecraft nazywane są Mistrzami Hedge, choć osoby z zewnątrz często znają ich jako Mądre lub Przebiegłe. Większość mieszka na obrzeżach społeczności, którym służą, i są znani ze swoich umiejętności leczniczych oraz mikstur, toników i talizmanów, które sprzedają. Prowadzą życie prywatne, starając się unikać tych, którzy mogliby obrazić się ich handlem i wierzeniami, a lokalni mieszkańcy zazwyczaj doceniają ich usługi. Wybrani Mistrzowie Hedge pracują bezpośrednio dla swoich Hedgewise, poszukując i neutralizując zagrożenia dla Hedgefolk. Jest to niebezpieczna praca, ponieważ często wiąże się z bezpośrednim kontaktem z Łowcami Czarownic i Magistrem Imperialnym, aby lepiej poznać ich ruchy i zrozumieć motywacje."
        ),
        AdvancedProfessions.Mistyk to ProfessionDescription(
            quote = "A potem, z paszczy siódmego węża wyłonił się tłusty cielak i przemówił do mnie…",
            description = "Niektórzy Anachoreci i Cenobici stają się tak pełni mądrości (lub czegokolwiek, w każdym razie), że awansują do rangi Mistyków. Nie zadowalając się już poszukiwaniem wiedzy w samotności, nalegają, by dzielić się swoimi odkryciami z innymi, starając się prowadzić ich ku oświeceniu. Wielu przywódców klasztorów to Mistycy, gdyż większość rozsądnych wspólnot wypędza ich, gdy tylko uświadamia sobie, jacy naprawdę są. Nieliczni Mistycy faktycznie odkrywają sekrety nadprzyrodzonej mocy, prezentując to jako dowód wartości swoich „wnikliwości”.",
        ),
        AdvancedProfessions.Mnich to ProfessionDescription(
            quote = "Cisza, proszę. Próbuję tu medytować.",
            description = "Mnisi są członkami zakonów żebraczych, którzy poszukują odosobnienia, aby lepiej poświęcić się swojej wierze. Niektórzy mnisi żyją całkowicie samotnie jako pustelnicy, podczas gdy inni gromadzą się z innymi mnichami w klasztorach, zazwyczaj położonych w odległych rejonach Starego Świata. Większość religii posiada własne zakony żebracze, chociaż zasady Vereny i Shallyi sprzyjają monastycyzmowi bardziej niż w innych przypadkach. Mnisi poświęcają swoje życie studiom i modlitwie, debatowaniu nad subtelnościami teologii oraz objaśnianiu pism religijnych.",
        ),
        AdvancedProfessions.Nawigator to ProfessionDescription(
            quote = "Według moich obliczeń, musimy zmienić kurs na dziesięć stopni w prawo. Rób, jak uważasz, ale nie narzekaj potem, jeśli przegapimy następny port.",
            description = "Nawigatorzy mają krytycznie ważne zadanie – doprowadzić statek tam, gdzie powinien dotrzeć. W Starym Świecie zwykle korzystają z map do wyznaczania kursu, choć często potrafią też nawigować przy użyciu słońca i gwiazd. Znają tajniki wiatru i przypływów, co czyni ich nieco mistycznymi w oczach innych marynarzy, a ich rzadkością i umiejętnościami często darzy się podziwem. Nawigatorzy, z konieczności, są także kartografami, sporządzając mapy swoich podróży, aby mogli je powtórzyć lub umożliwić innym podążanie tą samą trasą. Ponieważ w świecie nie ma kompasów, każdy statek i niektóre ekspedycje lądowe zatrudniają wykwalifikowanego Nawigatora.",
        ),
        AdvancedProfessions.Opat to ProfessionDescription(
            quote = "„Moje śluby ubóstwa uczyniły mnie bogatym, śluby posłuszeństwa uczyniły mnie panem. A śluby czystości? Ach…”",
            description = "Najstarsi i najmądrzejsi z mnichów ostatecznie wyrastają na przywódców swoich klasztorów. Wierni często szukają opatów, aby zasięgnąć ich rady w sprawach wiary lub by uzyskać głębsze zrozumienie religijnego świata, podczas gdy kapłani i nowicjusze we wszystkim im podlegają. Większość opatów wybiera życie w odosobnieniu w swoich klasztorach aż do śmierci, lecz niektórzy raz jeszcze wyruszają w szerszy świat. Niewielu opatów raczy angażować się w politykę świątynną, przedkładając samotność swojego świata lub wędrówki ponad machinacje własnego kultu. Z tego powodu opat rzadko bywa głową zakonu żebraczego, pozostawiając kwestie organizacji i politykowania arcykapłanowi."),
        AdvancedProfessions.Odkrywca to ProfessionDescription(
            quote = "Co za niesamowita budowla w oddali. Nie przypomina niczego, co widziałem w tych stronach. Zostańcie przy obozie, jeśli chcecie, ja idę zobaczyć ją z bliska.",
            description = "Odkrywcy cierpią na silną żądzę podróży i przemierzają rozległe obszary Starego Świata i poza nim. Swoją wielką potrzebę poznawania tego, co kryje się za kolejnym horyzontem, przekuwają w odkrywanie nowych ziem i poszukiwanie możliwości handlowych. Odkrywcy regularnie zapuszczają się w nieznane, co może uczynić ich zręcznymi wojownikami i dyplomatami lub sprawić, że ich życie będzie bardzo krótkie.\n\nSą biegli w podróżowaniu zarówno lądem, jak i morzem. Odkrywcy zazwyczaj są bardzo kompetentnymi jednostkami. Różnorodność ról, jakie przychodzi im pełnić, zmusza ich do dużej elastyczności – potrafią dowodzić oddziałami lub negocjować w językach, których ledwie rozumieją."
        ),
        AdvancedProfessions.Oficer to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.Oprawca to ProfessionDescription(
            quote = "Oszczędzimy język na koniec. Będzie go potrzebował, żeby wyznać prawdę. Resztę... wybierz kończynę i podaj mi szczypce.",
            description = "Interrogatorzy wiedzą, jak skłonić ludzi do mówienia. Stosują zarówno metody psychologiczne, jak i fizyczne, a żadna z nich nie należy do przyjemnych. Pracują dla Łowców Czarownic, szlachty, a czasem dla bardziej gorliwych kościołów. Szczycą się swoją skutecznością, choć wielu osiąga ją poprzez nadmierną brutalność. Najlepsi Interrogatorzy wiedzą, że odkrywanie prawdy to forma sztuki. Ludzie kłamią i zmyślają, powiedzą niemal wszystko, by przerwać ból. Wyciągnięcie przyznania się do winy jest łatwe; dotarcie do prawdy jest znacznie trudniejsze.",
        ),
        AdvancedProfessions.Pamflecista to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.Paser to ProfessionDescription(
            quote = "Chłopcze, jeśli nie warto ryzykować szyi, żeby mi to przynieść, to prawdopodobnie nie warto mojego czasu.",
            description = "Większość mieszczan i rzemieślników jest skłonna handlować towarami o wątpliwej legalności. \n\nTakie towary są domeną i zajęciem Fence’a. Są ekspertami w zbywaniu skradzionych dóbr. Za procent zysku biorą zdobycz złodzieja i przenoszą ją do innego miasta, miasteczka, a nawet kraju, gdzie można ją bezpieczniej zbyć. Fence’e doskonale oceniają wartość danego przedmiotu i potrafią przewidzieć, jak bardzo jest „gorący”. Im większe ryzyko, tym większy procent zysku żądają."
        ),
        AdvancedProfessions.PielgrzymBitewny to ProfessionDescription(
            quote = "Milord ofiarował mi tę relikwię za moją zaszczytną służbę. Zaniedbanie mojej służby, a przez mnie Jego Świętość, ujawni, jakie święte moce ten rękawicznik zesłałby na twoją nędzną czaszkę.",
            description = "Pielgrzymi Bitewni to pielgrzymi Grala, którzy przeżyli służbę swojemu Rycerzowi Grala przez pewien czas. W rezultacie stali się kompetentnymi wojownikami. W większości przypadków stali się również jeszcze gorliwszymi wielbicielami swojego Rycerza Grala i czcicielami Pani Jeziora, widząc, do czego zdolny jest kwiat bretońskiego rycerstwa. Pielgrzymi Bitewni skutecznie dowodzą grupami pielgrzymów Grala, ponieważ Rycerz Grala nigdy nie poniża się, by wydawać rozkazy chłopskiej hołocie. Niektórzy pielgrzymi Grala niechętnie przyjmują rozkazy od kogoś, kto nie jest od nich lepszy, więc Pielgrzymi Bitewni często muszą narzucać porządek siłą. Mądrzejsi pielgrzymi Grala wiedzą, że ich szanse przeżycia znacznie wzrastają, gdy postępują zgodnie z poleceniami Pielgrzymów Bitewnych."
        ),
        AdvancedProfessions.Prawiedzma to ProfessionDescription(
            quote = "Gdybyś tylko mógł usłyszeć, co duchy mówią o tobie. To zmazałoby uśmiech z twojej twarzy.",
            description = "Legendaryczne Matki Czarownic są bardzo potężnymi wiedźmami, znanymi ze swoich zdolności wieszczących, leczniczych i wpływu na duchy Starej Wdowy. Większość z nich wiedzie proste życie w rustykalnych chatkach, daleko od społeczności, którymi się opiekują. Matki czarownic rzadko opuszczają swoje nawiedzone domy, zmuszając tych, którzy szukają ich pomocy, do odbycia trudnych podróży. Jednak niektóre wędrują po Kislevie, podążając tam, gdzie prowadzą duchy, dzieląc się swoją wiedzą. Choć większość wygląda na niezwykle starą i pochyloną – ich skrzywione kręgosłupy skrzypią alarmująco przy najmniejszym ruchu – wiele zachowuje młodzieńczą wigor i może być zaskakująco zwinna."
        ),
        AdvancedProfessions.Prelat to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.Psalterzysta to ProfessionDescription(
            quote = "Podnoszę głos w śpiewie, aby dodać ducha naszym wiernym i wzmocnić energię naszego boga.",
            description = "Psalterzyści to utalentowani śpiewacy, którzy poświęcili się występowaniu w chórach świątynnych i podczas rytuałów. Kantorzy prowadzą chóry podczas nabożeństw oraz uczą indywidualnych chórzystów. Niektórzy kantorzy są także biegłymi muzykami i tworzą nowe hymny ku czci swoich Bogów. Poza śpiewaniem hymnów wielu kantorów potrafi wykonywać inkantacje i rytmiczne śpiewy wspomagające kapłanów w prowadzeniu rytuałów boskich, a przy najbardziej potężnych rytuałach arcykapłan może zażądać obecności wielu kantorów. Powszechnym symbolem urzędu kantora jest krótki berło, używane do uderzania o ziemię (lub fałszywych chórzystów, jeśli zajdzie taka potrzeba), aby utrzymać rytm muzyki podczas prowadzenia chóru. Umiejętny kantor może znacząco podnieść renomę świątyni i jej kapłanów."
        ),
        AdvancedProfessions.Rajtar to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.Reketer to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.Rozbojnik to ProfessionDescription(
            quote = "To nie zajmie długo. Po prostu oddaj swoje kosztowności. Jeśli się opierasz, wszystko skończy się znacznie szybciej.",
            description = "Rozbójnicy drogowi napadają na powozy przemierzające drogi Starego Świata, okradając skrytki i pasażerów z ich kosztowności. Przyjmują styl wyższej szlachty, nosząc wyszukane maski i okazując ofiarom wszelkie maniery, woląc postrzegać siebie jako śmiałych łotrów, a nie prostych złodziei. Rozbójnicy muszą być zręcznymi jeźdźcami, potrafiącymi prowadzić konie po nierównym i zdradliwym terenie z dużą prędkością. Są także doskonałymi strzelcami, ponieważ muszą radzić sobie nie tylko z szybko poruszającymi się celami, ale także z licznymi niebezpiecznymi mieszkańcami lasu.",
        ),
        AdvancedProfessions.Rycerz to ProfessionDescription(
            quote = "Kiedy walczymy z honorem, przynosimy honor naszemu rodowi.",
            description = "Rycerze to zawodowi żołnierze, zazwyczaj, ale nie zawsze pochodzący z szlacheckiej krwi. Specjalizują się w walce w ciężkiej zbroi, używając dużych broni, często z konia, i stanowią najelitarniejsze oddziały szturmowe generała. Wielu rycerzy ma obowiązek chronić niższe klasy społeczne, choć nie wszyscy to uznają. Istnieje wiele zakonów rycerskich zarówno w Cesarstwie, jak i w Bretonnii, takich jak Rycerze Białego Wilka, Rycerze Pantery, Rycerze Reiksgardu oraz Grail Knights. Zakony religijne rycerzy znane są jako templariusze.",
        ),
        AdvancedProfessions.RycerzGraala to ProfessionDescription(
            quote = "Ciemność nadchodzi! Każde serce musi zdecydować: czy porzucę moje królestwo, mój święty honor, samą Damę? Nie! Powstaniemy jako jeden i wykrzyczymy: 'Cofajcie się, demony! Cofajcie się do piekła, które was stworzyło!'",
            description = "Rycerze Graala to kwiat bretońskiego rycerstwa, ideał, do którego aspirują wszyscy inni rycerze, przynajmniej w teorii. Król Bretonnii zawsze jest Rycerzem Graala, podobnie jak wielu książąt. Istnieje jednak również wielu Rycerzy Graala niższego stopnia, w tym pustelnicy, którzy spędzają życie opiekując się Kaplicami Graala.\n\nCi, którzy pili z Graala, są przemienieni. Ich oddanie ideałom rycerstwa staje się absolutne, a większość lśni światłem Fey. Światło to zanika po kilku dniach od spożycia Graala, ale może ponownie rozbłysnąć, gdy rycerz walczy wyjątkowo odważnie dla Damy Jeziora.\n\nNie można rozpocząć tej kariery, chyba że Dama Jeziora objawiła się i podała łyk Graala. Dama pojawia się jedynie przed prawdziwymi synami Bretonnii, których uznaje za godnych, więc cudzoziemcy, kobiety i chłopi nie mogą wejść na tę ścieżkę kariery."
        ),
        AdvancedProfessions.RycerzKrolestwa to ProfessionDescription(
            quote = "Będę chronił tę ziemię aż do mojego ostatniego tchnienia. To mój święty obowiązek i nie zawiodę.",
            description = "Rycerze Królestwa stanowią trzon bretońskiej armii i są najpowszechniejszymi członkami jej rządzącej elity. Wyróżnili się podczas wypraw rycerskich i otrzymali lenno lub stanowisko w gospodarstwie innego szlachcica. Oczekuje się od nich, że będą honorowo bronić swojego pana, jak i samego Królestwa. Rycerze opisani w ósmym rozdziale *Rycerzy Graala* to przede wszystkim Rycerze Królestwa.",
        ),
        AdvancedProfessions.RycerzKruka to ProfessionDescription(
            quote = "Zwrócimy te plugastwa ziemi, która je wypluła!",
            description = "Bractwo Całunu wierzy w przenoszenie walki prosto do wroga. Ich najlepsi wojownicy tworzą zakon znany jako Rycerze Kruka, a ich mandat jest jasny: zniszczyć każdego Szkieleta, Zombie i Cień na ziemi oraz wytępić nekromantów i Wampiry, które je przywołują. W przeciwieństwie do swego siostrzanego zakonu, Czarnej Straży, Rycerze Kruka są bezlitośni i agresywni – to oni poszukują wroga, zamiast czekać, aż Nieumarli przyjdą do nich. Obecnie wielu rycerzy stacjonuje w mieście Siegfriedhof w Stirlandzie, na granicy Sylvanii. Do tej pory prowadzili jedynie rajdy, lecz wraz ze wzrostem ich liczebności i wiedzy, a także gdy prawda o powrocie Mannfreda stanie się nie do podważenia, rozpoczną krucjatę, by raz jeszcze odebrać te ponure ziemie ich mrocznym władcom.",
        ),
        AdvancedProfessions.RycerzPantery to ProfessionDescription(
            quote = "Po cóż płynąć do odległych krain po zdobyczną skórę? W Imperium nie brakuje górskich lwów. To byłoby jak wyprawa do Norski w poszukiwaniu kultu Chaosu.",
            description = "Rycerze Pantery wyróżniają się spośród innych rycerzy wysokimi hełmami zwieńczonymi podobizną głowy Zwierzoczłeka. To zmiana względem dawnych tradycji, gdy symbolem zakonu był cętkowany wielki kot, choć wzór jego futra wciąż zdobi ich czapraki. Aby zostać przyjętym do zakonu, giermek musi w pojedynkę upolować wielkiego leśnego kota, którego skórę składa pod siodłem w chwili pasowania. Od tego momentu Rycerz Pantery dzieli swój czas między służbę u Grafa a prywatne wyprawy, w których tropi i niszczy sługi Chaosu, gdziekolwiek się pojawią.",
        ),
        AdvancedProfessions.RycerzPlonacegoSlonca to ProfessionDescription(
            quote = "Za chwałę! Za honor! Za Myrmidię!",
            description = "Rycerze Płonącego Słońca to zakon templariuszy poświęcony Myrmidii, bogini żołnierzy i strategii. Ich zakon, wywodzący się z Tilei i Estalii, w ostatnich stuleciach rozprzestrzenił się po całym Starym Świecie, głosząc ideały swojego kultu na polach bitew. Rzadko gromadzą się w większe siły, zamiast tego podróżują samotnie lub w małych grupach, doradzając możnym i ich generałom w sztuce wojny. Czasem dowodzą oddziałami lub całymi armiami, wykorzystując swoje umiejętności i reputację, aby powstrzymywać milicję przed ucieczką i utrzymywać lojalność najemników. Coraz częściej na południu Imperium Zakon Płonącego Słońca oraz kult Myrmidii postrzegane są jako wyzwanie dla wojskowej dominacji kultu Ulryka i Rycerzy Białego Wilka. W pewnym momencie swojej kariery każdy rycerz zakonu zostaje wysłany samotnie na rok lub dwa, by sprawdzić nabytą wiedzę i zahartować umiejętności w ogniu walki. Niejedna samotna wioska, gospodarstwo czy zajazd zostały ocalone dzięki temu, że młody rycerz stanął na czele ich obrony.",
        ),
        AdvancedProfessions.RycerzProby to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.RycerzZakonuZielonejChoragwi to ProfessionDescription(
            quote = "Nasza praca nie jest jeszcze skończona. Większe zło czai się w sercu Drakwaldu.",
            description = "Rycerze Zielonego Pola to zakon templariuszy poświęcony ochronie Talabheim w imię swojej wojowniczej bogini, Myrmidii. Są prawdziwymi wojownikami, szkolonymi do prowadzenia walk w lasach i dzikich ostępach swojej ojczyzny. Choć rzadko opuszczają granice Talabheim, ich umiejętności sprawdzają się równie dobrze zarówno w Wielkiej Puszczy, jak i w Drakwaldzie. Rycerze Zielonego Pola wywodzą się z różnych warstw społecznych, lecz wszystkich łączy jeden cel: służyć swojej bogini i chronić swój lud.",
        ),
        AdvancedProfessions.Sierzant to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.Skrytobojca to ProfessionDescription(
            quote = "„Wystarczy wyszeptać imię i zapłacić złoto. Do końca tygodnia będzie martwy.”",
            description = "Zabijanie za pieniądze nie jest w Starym Świecie niczym niezwykłym. Żołnierze i najemnicy robią to codziennie. Nieliczni jednak osiągają poziom śmiertelności Zabójcy. Ci najemnicy są doskonale wyszkoleni i zabójczy w użyciu różnych broni. Wielu z nich opanowuje także sztukę trucicielstwa. Najlepsi Zabójcy potrafią wyeliminować cel w ciągu kilku sekund, nie pozostawiając żadnych dowodów swojej obecności. Ich usługi są bardzo pożądane przez władze polityczne, a nawet instytucje religijne. Niewielu Zabójców przejmuje się źródłem zleceń. Chcą tylko wymagającej misji i solidnej zapłaty. Podczas gdy większość Zabójców działa samotnie, nieliczni zorganizowali się w gildie."
        ),
        AdvancedProfessions.StarszyWioskowy to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.StrozPrawa to ProfessionDescription(
            quote = "Nie obchodzi mnie, co książę Olbert mówi o granicy. To tutaj są wolne ziemie Southwick, a ty wtargnąłeś bez pozwolenia. Kara to wysoka grzywna albo siedem batów. Wybór należy do ciebie.",
            description = "Egzekutorzy przemierzają Księstwa Graniczne, wymierzając sprawiedliwość albo – jeśli ta zawiedzie – zemstę. Czasem też po prostu zsyłają przypadkową przemoc, bo każdy może się pomylić. Na ogół jednak Egzekutorzy kierują się własnym kodeksem dobra i zła, który starają się podtrzymywać. Nie zwracają uwagi ani na prawo, ani na władzę książąt, polegając wyłącznie na swoim poczuciu etyki oraz zdolności do odnajdywania prawdziwych złoczyńców. Większość Egzekutorów uważa swoich zbuntowanych pobratymców za najczarniejszych z łotrów, ponieważ przez ich działania każdy Egzekutor ryzykuje, że zostanie przepędzony z danej okolicy. Poza Księstwami Granicznymi Egzekutorów niemal się nie spotyka, gdyż lokalne władze bardzo źle patrzą na samowolne wymierzanie prawa. Zresztą, książęta Graniczni również, lecz zazwyczaj nie mogą nic z tym zrobić."
        ),
        AdvancedProfessions.Strzelec to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.Szampierz to ProfessionDescription(
            quote = "Nie masz się czego obawiać, jeśli jesteś niewinny. Ale mój miecz jeszcze nie spotkał niewinnych ludzi.",
            description = "W wielu krajach Starego Świata prawo dopuszcza dowodzenie niewinności poprzez sąd boju. Oskarżeni zazwyczaj stają naprzeciw lokalnego Mistrza Sądowniczego, zawodowego wojownika specjalizującego się w szybkim i skutecznym pokonaniu pojedynczego przeciwnika. Wiele przepisów dotyczących takich walk wymaga użycia określonych broni, dzięki czemu Mistrzowie Sądowniczy są biegli w różnych rodzajach uzbrojenia. W konsekwencji są oni zarówno szanowanymi, jak i budzącymi strach wojownikami, a ich umiejętności często wyprzedzają ich reputację. Czasami zamożni oskarżeni mogą wynająć Mistrza Sądowniczego, aby walczył w ich imieniu.",
        ),
        AdvancedProfessions.Szarlatan to ProfessionDescription(
            quote = "Chcę wyssać z mojej ofiary każdą chwilę spokoju, nie tylko jej monety. Niech w jej portfelu zagości tylko zwątpienie i rozpacz.",
            description = "Szarlatani to nadzwyczajni oszuści, przebiegli kłamcy, którzy potrafią przekonać ludzi niemal o wszystkim. Dzięki elokwentnym językom i bystrym umysłom wyłudzają majątek od naiwnych i uciekają zarówno z pieniędzmi, jak i z życiem. Dla szarlatana kłamstwo jest jak oddychanie. Zwykli szarlatani zadowalają się sprzedażą bezwartościowych cudownych leków i talizmanów mających rzekomo odstraszać czarną magię, podczas gdy bardziej utalentowani podszywają się pod różne profesje, pobierając opłaty konsultacyjne i sprzedając nieruchomości, do których nie mają prawa. Legendarnie zdolni szarlatani organizują oszustwa, mające na celu zrabowanie szlachty i bogatych kupców do ostatniego grosza."
        ),
        AdvancedProfessions.Szpieg to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.SledczyVereny to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.TreserZwierzat to ProfessionDescription(
            quote = "„Spójrzcie, panowie! To zwierzę jest mniej dzikie niż stara wiedźma. Patrzcie, jak wkładam całą stopę do pyska tańczącego niedźwiedzia... czekaj... nie Vinny! Stop... urk!”",
            description = "Treserzy zwierząt rozmnażają i szkolą zwierzęta do transportu, polowań lub rozrywki. Ich najczęstsza praca polega na hodowli koni wierzchowych i bojowych na targi koni, ale treserzy są również biegli w tresurze psów i ptaków, które towarzyszą szlacheckim wyprawom łowieckim. Cyrki zatrudniają treserów zwierząt jako mistrzów ceremonii, aby zachwycać publiczność tańczącymi niedźwiedziami i kłusującymi kucykami. Treserzy mogą również pełnić rolę opiekunów zwierząt w arenach walk zwierząt, choć niewiele wysiłku wkłada się w szkolenie nieposłusznych zwierząt bojowych, które zostały pierwotnie schwytane na wolności. Chociaż kislevscy treserzy niedźwiedzi są znani ze swojej zdolności szkolenia dzikich niedźwiedzi, większość tresowanych zwierząt rodzi się w niewoli."
        ),
        AdvancedProfessions.Tropiciel to ProfessionDescription(
            quote = "„Nie musisz mnie zatrudniać; jest wielu przewodników, którzy zabiorą cię w złe ziemie. Niewielu jednak zna zaginioną kopalnię lub potrafi znaleźć świeżą wodę w Spalonej Dolinie. Śmiało, znajdź kogoś, kto poprowadzi cię tanio; może zostanie ci jeszcze pieniądze na własny pogrzeb.”",
            description = "Badlands Ranger to doświadczona osoba zaznajomiona z niebezpieczeństwami tego obszaru i potrafiąca bezpiecznie prowadzić innych przez złe ziemie. Godny zaufania Badlands Ranger jest wart wiele pieniędzy i żąda wysokiej stawki za swoje usługi. Grożenie mu rzadko działa, ponieważ potrafi przetrwać niemal każdą sytuację w regionie, zostawiając swoich nieprzyjemnych pracodawców na pastwę losu. Mniej uczciwi Badlands Rangerzy postępują podobnie wobec bogatych pracodawców – bogatych, czyli tych, którzy w ogóle mogą sobie pozwolić na ich wynajęcie. Później wracają po pieniądze."
        ),
        AdvancedProfessions.Uczony to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.Urzednik to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.Vitki to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.Weteran to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.WedrownyCzarodziej to ProfessionDescription(
            quote = "Uczenie się rzeczy, których człowiek nie powinien znać, to nasza praca. My je poznajemy, abyś ty nie musiał.",
            description = "Ludzie Czeladnicy Czarodzieje zakończyli swój okres nauki i dołączyli do Zakonu Czarodziejstwa. Mają teraz dostęp do wszystkich zaklęć wybranej dziedziny magii, ale muszą zrównoważyć nowo zdobyte moce z własną ograniczoną zdolnością do ich kontrolowania. Większość czeladników ma do spłacenia znaczne opłaty edukacyjne wobec swojej Akademii i musi wyruszać na przygody, aby uregulować dług. Czeladnicy Czarodzieje oferują swoje usługi, często na prośbę swojego Zakonu, za złoto, wiedzę lub w celu wzmocnienia pozycji Akademii. Elfy są oczywiście zwolnione z systemu Akademii i niczego nie są winne.",
        ),
        AdvancedProfessions.Wiedzma to ProfessionDescription(
            quote = "O Wielkie Duchy, obdarzcie mnie swoim wzrokiem, abym mogła dostrzec niebezpieczeństwa na mojej drodze.",
            description = "Niewiele kobiet Ungol rozwija magiczne moce bez uprzedniego wykazania się „widzeniem”. Większość czarownic wiedźm – kobiet, które potrafią przywoływać duchy Kislevu – była najpierw mądrą kobietą. Ich moce uważane są zarówno za błogosławieństwo, jak i przekleństwo, ponieważ choć wiedźmy mogą bez wątpienia wspierać swoje lokalne społeczności, duchy żądają wysokiej ceny za swoją zgodę: przedwczesnego starzenia się. Z tego powodu większość mądrych kobiet obawia się możliwości, że duchy odpowiedzą na ich wezwanie. Oprócz mądrych kobiet, ci którzy doświadczyli wielkiej straty – np. śmierci męża lub dziecka – mogą również zostać wybrani przez Starą Wdowę i uzyskać intymne zrozumienie udręczonych duchów Kislevu. Czarownice wiedźmy, które zdobywają władzę w ten sposób, często żyją samotnie, opłakując utraconych bliskich i przemijającą młodość."
        ),
        AdvancedProfessions.Wlamywacz to ProfessionDescription(
            quote = "Sekret wejścia to wybór odpowiedniego okna. Sekret wyjścia to wybór odpowiednich drzwi.",
            description = "Włamywacze uważają się za lepszych od zwykłych złodziei i bandytów. Pozostawiają rozcinanie portfeli i gardel do ulicznego elementu, woląc kraść z większą finezją. Sztuka Włamywacza wymaga obserwacji, planowania i nienagannego wyczucia czasu. Dobrze wykonana kradzież może nie zostać wykryta przez miesiące, a w tym czasie Włamywacz jest już daleko. Większość Włamywaczy należy do gildii złodziejskiej, choć niektórzy ryzykują i działają samodzielnie. Tacy samotnicy muszą unikać zarówno prawa, jak i gildii – to niewątpliwie niebezpieczna gra."
        ),
        AdvancedProfessions.Wodz to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.WtajemniczonyKultuKhorna to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.WtajemniczonyKultuNurgla to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.WtajemniczonyKultuSlaanesha to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.WtajemniczonyKultuTzeentcha to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.WybraniecBozy to ProfessionDescription(
            quote = "„Odkryj przede mną głębsze tajemnice mojej wiary, o mądra Vereno, abym mógł ci lepiej służyć.”",
            description = "Kapłan, który konsekwentnie przestrzega zasad swojego kościoła, zostaje wybrany przez swoje bóstwo do przyjęcia większej mocy i odpowiedzialności. Namaszczeni Kapłani obdarzeni są Boską Wiedzą bóstwa, któremu służą, i w związku z tym oczekuje się od nich podejmowania wyzwań odpowiednich dla ich nowych błogosławieństw. Często posiadają wszystkie cechy, które podziwia ich bóstwo, działając jako latarnie wiary dla innych w Starym Świecie. Namaszczeni Kapłani cieszą się dużym zaufaniem zwykłych ludzi, którzy często słuchają ich bardziej niż Szlachty i Polityków, co daje im znaczną władzę doczesną, uzupełniającą władzę duchową."
        ),
        AdvancedProfessions.ZabojcaDemonow to ProfessionDescription(
            quote = "Phaw. To wcale nie było trudne. Obudź mnie, gdy znajdziemy coś wartego mojego topora.",
            description = "W każdym pokoleniu zdarzają się jeden lub dwóch Zabójców, którzy nie mogą znaleźć śmierci, której pragną. Na każdym kroku los ich oszukuje lub popycha naprzód, a wraz z upływem lat stają się coraz bardziej zaciekli, zdeterminowani, by stawić czoła potężnemu przeznaczeniu, które na nich czeka. Gdy Trollowie czy Giganci nie są w stanie pokonać Zabójcy, stają naprzeciw najpotężniejszym wrogom ze wszystkich: Demonom Chaosu. Zabójcy Demonów to przerażające jednostki, w najlepszym wypadku ledwo przy zdrowych zmysłach, obciążone ciężarem własnego przetrwania, a jednocześnie należą do największych wojowników, jakich zna Stary Świat."
        ),
        AdvancedProfessions.ZabojcaNieumarlych to ProfessionDescription(
            quote = "Kuj w serce, utnij głowę, spopiel, oblej wodą święconą, rozsyp popioły w czterech prowincjach. Zabija dziewięć razy na dziesięć.",
            description = "Niewielu przeżywa życie Łowcy Wampirów. Ci, którzy przetrwają, często szybko zmieniają zawód – stając się np. Inkwizytorami lub rycerzami. Ci, którzy nie rezygnują, stają się Zabójcami Umarłych. Widząc prawdziwy horror Wampirów i nieskończone legiony nieumarłych, nie mogą oderwać wzroku i poświęcają każdą chwilę życia na niszczenie tego bezlitosnego wroga. Jeszcze bardziej wykluczeni i nieufni niż łowcy wampirów, zazwyczaj stają się pustelnikami lub banitami, kradnąc to, czego potrzebują do przetrwania, aby nic nie odciągało ich od misji. Ich oddanie sprawie sprawia, że stają się na tyle biegli, by zyskać sławę wśród Wampirów – a świadomość tego powoduje, że każdy Zabójca Umarłych śpi niespokojnie, z kołkiem w ręku, czekając na ugryzienie i dźwięk mściwego śmiechu ucha.",
        ),
        AdvancedProfessions.ZabojcaOlbrzymow to ProfessionDescription(
            quote = "Ah, to podniosło krew na duchu. Szkoda, że łajdak padł, zanim zdążył mnie jeszcze kilka razy trafić.",
            description = "Wielu Pogromców Trolli pragnie znaleźć śmierć, lecz potajemnie jej się boi. Są jednak tacy, którzy są po prostu zbyt zaciekli, by łatwo umrzeć. Ci nieliczni stają się Pogromcami Gigantów: obsesyjnymi Krasnoludami, którzy odkryli, że nawet Trolle nie stanowią wystarczającego wyzwania, by zapewnić im wymarzone, chwalebne zakończenie. Ci wojownicy wciąż szukają walki i odpowiedniej śmierci, a gdy nie walczą, często stają się melancholijnymi pijakami. Pogromcy Gigantów noszą nadal kolczasty, pomarańczowy znak Pogromcy, ale zwykle są pokryci znacznie większą liczbą tatuaży."
        ),
        AdvancedProfessions.ZakapturzonyBrat to ProfessionDescription(
            quote = "Naprawdę? Krąży plotka, że biedny Bertram wplątał się w jakiś kult? Opowiedz mi więcej, dobry bracie...",
            description = "Zakapturzeni Bracia to ukryci agenci luźno związani z Łowcami Czarownic Sigmara. Choć nie są prawdziwą gałęzią Templariuszy, często mają powód, by łączyć siły z ich czasami przesadnie gorliwymi współbraćmi. Jednak równie często mogą ich zdradzić, jak każdą inną organizację, z którą mają do czynienia. Zakapturzeni Bracia są mistrzami pozyskiwania informacji. Infiltrowują organizacje, aby dowiedzieć się, co mogą, raportując swoje ustalenia przełożonym – choć nie wiadomo dokładnie, kim oni są. Organizacja ta rekrutuje różnorodne talenty, od byłych Łowców Czarownic po Mutantów."
        ),
        AdvancedProfessions.Zakonnik to ProfessionDescription(
            quote = "Nie lękajcie się, bracia i siostry. Te trudności również przeminą. Miejcie wiarę w bogów, aby oni mogli mieć wiarę w was.",
            description = "Zakonnicy to żebracy wędrujący po Imperium, nauczający cnoty religijnej poprzez własny przykład. Ich zakony sięgają czasów Magnusa Pobożnego. Łowca Czarownic, Berndt z Wurtbad, był szczególnym przeciwnikiem kultów Slaanesha, Chaosowego Boga Zmysłowości i Przyjemności. Berndt dostrzegł, jak dekadencja i pożądanie nieuchronnie prowadzą do objęcia Slaanesha. Po latach krwi i ognia odłożył miecz i pochodnię, rozdał swoje dobra i zaczął wędrować po Imperium, głosząc przesłanie ubóstwa, czystości i posłuszeństwa. Nie nosił nic poza włosienicą i żył z jałmużny zwykłych ludzi. Jego gorliwe przekonanie było takie, że pokorne życie w ubóstwie jest najpewniejszą metodą walki z podstępnym uwodzeniem Chaosu. Zakon Św. Berndta był pierwszym żebraczym zakonem w Imperium, choć od tego czasu powstało kilka innych."
        ),
        AdvancedProfessions.Zbrojny to ProfessionDescription(
            quote = " ",
            description = " "),
        AdvancedProfessions.Zwadzca to ProfessionDescription(
            quote = "Czy śmiałeś splamić me dobre imię swym niestosownym żartem? Mam szczerą nadzieję, że tak...",
            description = "Na terenie Imperium wieki temu ustanowiono skomplikowany system prawny regulujący formalne pojedynki. Szermierze to specjaliści w śmiertelnym zastosowaniu szpady i pistoletu, wynajmujący się do obrony cudzej czci, choć wielu z nich wywodzi się z młodszych rodów szlacheckich i pojedynkuje się dla własnych celów. Szermierze dzielą się na dwie odmiany: beztroskich awanturników, którzy traktują swe wyczyny jak nieustającą przygodę, oraz śmiertelnie poważnych wojowników, noszących swój honor na ramieniu i gotowych obrazić się o najdrobniejszą, prawdziwą bądź wyimaginowaną zniewagę."
        ),
        AdvancedProfessions.Zwiadowca to ProfessionDescription(
            quote = " ",
            description = " "),
        SkavenProfessions.Czarnoszczur to ProfessionDescription(
            quote = " ",
            description = " "),
        SkavenProfessions.CzcicielZarazy to ProfessionDescription(
            quote = " ",
            description = " "),
        SkavenProfessions.Harcownik to ProfessionDescription(
            quote = " ",
            description = " "),
        SkavenProfessions.Klanbrat to ProfessionDescription(
            quote = " ",
            description = " "),
        SkavenProfessions.Niewolnik to ProfessionDescription(
            quote = " ",
            description = " "),
        SkavenProfessions.PoganiaczSkavenski to ProfessionDescription(
            quote = " ",
            description = " "),
        SkavenProfessions.PoslaniecNocy to ProfessionDescription(
            quote = " ",
            description = " "),
        SkavenProfessions.UczenSzaregoProroka to ProfessionDescription(
            quote = " ",
            description = " "),
        SkavenProfessions.DiakonZarazy to ProfessionDescription(
            quote = " ",
            description = " "),
        SkavenProfessions.HersztKlanu to ProfessionDescription(
            quote = " ",
            description = " "),
        SkavenProfessions.InzynierSpaczenia to ProfessionDescription(
            quote = " ",
            description = " "),
        SkavenProfessions.Kadzielnik to ProfessionDescription(
            quote = " ",
            description = " "),
        SkavenProfessions.KaplanZarazy to ProfessionDescription(
            quote = " ",
            description = " "),
        SkavenProfessions.MistrzCialoksztaltowania to ProfessionDescription(
            quote = " ",
            description = " "),
        SkavenProfessions.MistrzMutator to ProfessionDescription(
            quote = " ",
            description = " "),
        SkavenProfessions.MistrzSkrytobojca to ProfessionDescription(
            quote = " ",
            description = " "),
        SkavenProfessions.Nadprorok to ProfessionDescription(
            quote = " ",
            description = " "),
        SkavenProfessions.Rynsztokowiec to ProfessionDescription(
            quote = " ",
            description = " "),
        SkavenProfessions.SkavenskiZaklinacz to ProfessionDescription(
            quote = " ",
            description = " "),
        SkavenProfessions.SzaryProrok to ProfessionDescription(
            quote = " ",
            description = " "),
        SkavenProfessions.Szponowlad to ProfessionDescription(
            quote = " ",
            description = " "),
        SkavenProfessions.Szturmoszczur to ProfessionDescription(
            quote = " ",
            description = " "),
        TribeProfessions.UczenSzamana to ProfessionDescription(
            quote = " ",
            description = " "),
        TribeProfessions.Szaman to ProfessionDescription(
            quote = " ",
            description = " "),
        TribeProfessions.WielkiSzaman to ProfessionDescription(
            quote = " ",
            description = " "),
        TribeProfessions.Knuj to ProfessionDescription(
            quote = " ",
            description = " "),
        TribeProfessions.Silacz to ProfessionDescription(
            quote = " ",
            description = " "),
        TribeProfessions.WodzPlemienny to ProfessionDescription(
            quote = " ",
            description = " "),
        AnimalProfessions.TresowanyNiedzwiedz to ProfessionDescription(
            quote = " ",
            description = " "),
        BeastmenProfessions.Bestigor to ProfessionDescription(
            quote = " ",
            description = " "),
        BeastmenProfessions.WodzZwierzoludzi to ProfessionDescription(
            quote = " ",
            description = " "),
        BeastmenProfessions.SzamanRykowcowK to ProfessionDescription(
            quote = " ",
            description = " "),
        BeastmenProfessions.SzamanRykowcowNST to ProfessionDescription(
            quote = " ",
            description = " "),
        BeastmenProfessions.WielkiSzamanRykowcowK to ProfessionDescription(
            quote = " ",
            description = " "),
        BeastmenProfessions.WielkiSzamanRykowcowNST to ProfessionDescription(
            quote = " ",
            description = " "),
    )
}