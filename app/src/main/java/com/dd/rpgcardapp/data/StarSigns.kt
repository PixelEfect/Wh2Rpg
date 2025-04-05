package com.dd.rpgcardapp.data

data class StarSign(val name: String, val attribute: String ="Uzupelnic")

object StarSigns {
    val bebniarz = StarSign("Bębniarz", "Znak Zabawy i Radości")
    val dudy = StarSign("Dudy", "Znak Oszustwa")
    val dwaByki = StarSign("Dwa Byki", "Znak Płodności i Rzemiosła")
    val glupiecMummit = StarSign("Głupiec Mummit", "Znak Instynktu")
    val gwiazdaUroku = StarSign("Gwiazda Uroku", "Znak Magii")
    val gwiazdaWieczorna = StarSign("Gwiazda Wieczorna", "Znak Tajemnicy i Iluzji")
    val kociolRhyi = StarSign("Kocioł Rhyi", "Znak Łaski, Śmierci i Tworzenia")
    val lancet = StarSign("Lancet", "Znak Nauki i Talentu")
    val medrzecMarmit = StarSign("Mędrzec Marmit", "Znak Mądrości")
    val pasGrungniego = StarSign("Pas Grungniego", "Znak Sprawności Wojennej")
    val rozbityWoz = StarSign("Rozbity Wóz", "Znak Dumy")
    val smokDragomas = StarSign("Smok Dragomas", "Znak Odwagi")
    val sznurLimnera = StarSign("Sznur Limnera", "Znak Dokładności")
    val tancerka = StarSign("Tancerka", "Znak Miłości i Pożądania")
    val tlustyKoziol = StarSign("Tłusty Kozioł", "Znak Ukrytej Namiętności")
    val vobistUlotny = StarSign("Vobist Ulotny", "Znak Ciemności i Niepewności")
    val wielkiKrzyz = StarSign("Wielki Krzyż", "Znak Czystości")
    val wolGnuthus = StarSign("Wół Gnuthus", "Znak Wiernej Służby")
    val wymundPustelnik = StarSign("Wymund Pustelnik", "Znak Wytrzymałości")
    val zlotyKogut = StarSign("Złoty Kogut", "Znak Kupców i Bogactwa")
}

object AllStarSigns {
    val All = listOf(
    StarSigns.bebniarz,
    StarSigns.dudy,
    StarSigns.dwaByki,
    StarSigns.glupiecMummit,
    StarSigns.gwiazdaUroku,
    StarSigns.gwiazdaWieczorna,
    StarSigns.kociolRhyi,
    StarSigns.lancet,
    StarSigns.medrzecMarmit,
    StarSigns.pasGrungniego,
    StarSigns.rozbityWoz,
    StarSigns.smokDragomas,
    StarSigns.sznurLimnera,
    StarSigns.tancerka,
    StarSigns.tlustyKoziol,
    StarSigns.vobistUlotny,
    StarSigns.wielkiKrzyz,
    StarSigns.wolGnuthus,
    StarSigns.wymundPustelnik,
    StarSigns.zlotyKogut)
}