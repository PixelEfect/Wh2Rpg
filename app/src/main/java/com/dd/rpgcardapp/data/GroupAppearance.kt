package com.dd.rpgcardapp.data

object HairColor {
    val All = listOf(
        Hair.brazowy,
        Hair.ciemnobrazowy,
        Hair.czarny,
    )
    val WithoutElf = All + listOf(
        Hair.popielaty,
        Hair.blond,
        Hair.rudy,
        Hair.ciemnoRudy,
    )
    val WithoutDwarf = listOf(
        Hair.ciemnyBlond,
        Hair.jasnobrazowy
    )

    val ElfHalfElf = All + WithoutDwarf + listOf(
        Hair.srebrny,
        Hair.bialy,
        Hair.jasnyBlond,
        Hair.miedziany,
        Hair.kasztanowy,
    )
    val DwarfGnom = WithoutElf + listOf(
        Hair.czerwony,
        Hair.kruczoczarny,
    )
    val HumanHalfling = WithoutElf + WithoutDwarf
}

object EyesColor{
    val All = listOf(
        Eyes.brazowy,
        Eyes.ciemnobrazowy,
    )

    val Elf = All + listOf(
        Eyes.szaroniebieski,
        Eyes.niebieski,
        Eyes.orzechowy,
        Eyes.kasztanowy,
        Eyes.srebrny,
        Eyes.fioletowy,
        Eyes.czarny,
    )
    val HalfElf = Elf + listOf(
        Eyes.szary,
        Eyes.piwny,
    )
    val Dwarf = All + listOf(
        Eyes.szary,
        Eyes.ciemnoniebieski,
        Eyes.piwny,
        Eyes.jasnobrazowy,
        Eyes.fioletowy,
    )
    val Human = All + Dwarf + listOf(
        Eyes.niebieski,
        Eyes.zielony,
        Eyes.czarny
    )
    val Halfling = All + listOf(
        Eyes.niebieski,
        Eyes.orzechowy,
        Eyes.jasnobrazowy,
    )
    val Gnome = Halfling + listOf(
        Eyes.piwny,
        Eyes.zielony,
        Eyes.fioletowy,
    )
}

val szary = Appearance("Szary")
val ciemnoniebieski = Appearance("Ciemnoniebieski")
val niebieski = Appearance("Szary")
val zielony = Appearance("Szary")
val piwny = Appearance("Szary")
val jasnobrazowy = Appearance("Szary")
val ciemnobrazowy = Appearance("Szary")
val fioletowy = Appearance("Szary")
val czarny = Appearance("Szary")
val szaroniebieski = Appearance("Szary")
val orzechowy = Appearance("Szary")
val kasztanowy = Appearance("Szary")
val srebrny = Appearance("Szary")