package com.dd.rpgcardapp.data;

import android.provider.SimPhonebookContract.ElementaryFiles

object StartingProfessions {    //Wszyskie rasy
    val Common = listOf(
        BasicProfessions.Akolita,
        BasicProfessions.Bajarz,
        BasicProfessions.Banita,
        BasicProfessions.BerserkerZNorski,
        BasicProfessions.Cyrkowiec,
        BasicProfessions.Dylentant,
        BasicProfessions.Kanciarz,
        BasicProfessions.Kartograf,
        BasicProfessions.Lowca,
        BasicProfessions.LowcaNagrod,
        BasicProfessions.Najemnik,
        SkavenProfessions.Niewolnik,
        BasicProfessions.Oprych,
        BasicProfessions.Pielgrzym,
        BasicProfessions.Przemytnik,
        BasicProfessions.Rzemieslnik,
        BasicProfessions.Skryba,
        BasicProfessions.Szlachcic,
        BasicProfessions.Szuler,
        BasicProfessions.Wloczykij,
        BasicProfessions.Zak,
        BasicProfessions.Zlodziej,
    )
    val HalflingHuman = listOf(          // niziolek czlowiek
        BasicProfessions.Balsamista,
        BasicProfessions.Chlop,
        BasicProfessions.Cyrulik,
        BasicProfessions.Gazeciarz,
        BasicProfessions.Grabaz,
        BasicProfessions.Kominiarz,
        BasicProfessions.Latarnik,
        BasicProfessions.Skarbnik,
        BasicProfessions.Pogranicznik,
        BasicProfessions.PorywaczZwlok,
        BasicProfessions.Prawnik,
        BasicProfessions.Przewoznik,
        BasicProfessions.Rolnik,
        BasicProfessions.Rybak,
        BasicProfessions.Weglarz,
        BasicProfessions.Zarzadca,
        BasicProfessions.ZbieraczLajna,
    )
    val DwarfHuman = listOf(          // krasnolud czlowiek
        BasicProfessions.Doker,
        BasicProfessions.Rzezimieszek,
        BasicProfessions.StraznikWiezienny,
        BasicProfessions.Woznica,
    )
    val ElfHalfElfHuman = listOf(        //elf polelf czlowiek
        BasicProfessions.Lesnik,
        BasicProfessions.Przepatrywacz,
        BasicProfessions.StraznikRzeczny,
        BasicProfessions.ZolnierzOkretowy,
    )
    val DwarfHalfelfHalflingHuman = listOf(      //Krasnolud Polelf Niziolek Czlowiek
        BasicProfessions.BylySkazaniec,
        BasicProfessions.HienaCmentarna,
        BasicProfessions.Mieszczanin,
        BasicProfessions.Mytnik,
        BasicProfessions.Ochotnik,
        BasicProfessions.Podzegacz,
        BasicProfessions.PoganiaczMulow,
        BasicProfessions.Straznik,
        BasicProfessions.StraznikKanalow,
        BasicProfessions.StraznikSwiatynny,
        BasicProfessions.Szczurolap,
        BasicProfessions.Zolnierz,
        )
    val DwarfElfHalfelfHuman = listOf(      //krasnolud, elf, Polelf, czlowiek
        BasicProfessions.Gladiator,
        BasicProfessions.Ochroniarz,
        BasicProfessions.Zeglarz,
    )
//////////////////////////////////////////////////////////////////////////////
    val Dwarf = Common + DwarfHuman + DwarfHalfelfHalflingHuman + DwarfElfHalfelfHuman + listOf(
        BasicProfessions.CzeladnikRun,
        BasicProfessions.Goniec,
        BasicProfessions.Gornik,
        BasicProfessions.Sluga,
        BasicProfessions.Tarczownik,
        BasicProfessions.ZabojcaTrolli,
    )
    val Elf = Common + ElfHalfElfHuman + DwarfElfHalfelfHuman + listOf(
        BasicProfessions.Aptekarz,
        BasicProfessions.Poslaniec,
        BasicProfessions.RzecznikRodu,
        BasicProfessions.UczenCzarodzieja,
        BasicProfessions.WojownikKlanowy,
    )
    val HalfElf = Common + ElfHalfElfHuman + DwarfHalfelfHalflingHuman + DwarfElfHalfelfHuman + listOf(
        BasicProfessions.Aptekarz,
        BasicProfessions.CiuraObozowa,
        BasicProfessions.Poslaniec,
        BasicProfessions.Sluga,
        BasicProfessions.UczenCzarodzieja,
        BasicProfessions.UczenZielarza,
    )
    val Halfling = Common + HalflingHuman + DwarfHalfelfHalflingHuman + listOf(
        BasicProfessions.Aptekarz,
        BasicProfessions.CiuraObozowa,
        BasicProfessions.Paz,
        BasicProfessions.Poslaniec,
        BasicProfessions.Sluga,
        BasicProfessions.StraznikPol,
    )
    val Human = Common + HalflingHuman + DwarfHuman + ElfHalfElfHuman + DwarfHalfelfHalflingHuman + DwarfElfHalfelfHuman + listOf(
        BasicProfessions.Aptekarz,
        BasicProfessions.Bagiennik,
        BasicProfessions.BlednyRycerz,
        BasicProfessions.Cenobita,
        BasicProfessions.CiuraObozowa,
        BasicProfessions.Czekista,
        BasicProfessions.Fanatyk,
        BasicProfessions.Flisak,
        BasicProfessions.Giermek,
        BasicProfessions.Gornik,
        BasicProfessions.Grabiezca,
        BasicProfessions.Guslarz,
        BasicProfessions.Kadet,
        BasicProfessions.Koczownik,
        BasicProfessions.Koniarz,
        BasicProfessions.Korsarz,
        BasicProfessions.KozakKislevski,
        BasicProfessions.Obszarnik,
        BasicProfessions.Pacholek,
        BasicProfessions.PielgrzymGraala,
        BasicProfessions.PiratRzeczny,
        BasicProfessions.Poganiacz,
        BasicProfessions.PasterzZCarcassonne,
        BasicProfessions.Paz,
        BasicProfessions.Pokutnik,
        BasicProfessions.PoskramiaczNiedzwiedzi,
        BasicProfessions.Poslaniec,
        BasicProfessions.Pustelnik,
        BasicProfessions.RogatyLowca,
        BasicProfessions.Rozjemca,
        BasicProfessions.Skald,
        BasicProfessions.Sluga,
        BasicProfessions.StraznikDrog,
        BasicProfessions.StraznikTuneli,
        BasicProfessions.Strielec,
        BasicProfessions.StrzyganskiMistyk,
        BasicProfessions.SzermierzEstalijski,
        BasicProfessions.Szperacz,
        BasicProfessions.Smieciarz,
        BasicProfessions.UczenCzarodzieja,
        BasicProfessions.UczennicaCzarownicy,
        BasicProfessions.UczenZielarza,
        BasicProfessions.Wielorybnik,
        BasicProfessions.Woj,
        BasicProfessions.Wrozbita,
        BasicProfessions.Zabiarka,
        BasicProfessions.Zakapturzony,
        BasicProfessions.Znachorka,
    )
    val Gnome = Common + listOf(
        BasicProfessions.Aptekarz,
        BasicProfessions.Goniec,
        BasicProfessions.Gornik,
        BasicProfessions.Paz,
        BasicProfessions.Sluga,
        BasicProfessions.UczenCzarodzieja,
    )
}



