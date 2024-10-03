package com.elmernissi.mykotlinqpp

import com.elmernissi.mykotlinqpp.myvar.aaaa
import com.elmernissi.mykotlinqpp.myvar.descripPeopleVar

class personne {
}



fun main(){

    //aaaa = "sddd"
    descripPeopleVar("khaled")
    val age = 10
    val name = "Ahmed"


    if (name == "Ahmed") {
        println("${name} est un garçon")
    } else if (name == "Sara") {
        println("${name} est une fille")
    } else {
        println("On ne connait pas le genre de ${name}")
    }

    when (name) {
        "Ahmed" -> println("${name} est un garçon")
        "Sara" -> println("${name} est une fille")
        else -> println("On ne connait pas le sexe de ${name}")
    }

    when (age) {
        in 1..5 -> println("${name} est trop jeune")
        in 6 until  10 -> println("${name} peut jouer au basket")
        !in 1..18 -> println("${name} ne peut pas jouer avec les enfants")

        else -> println("Condition non gérée")
    }

    val canPlayBasketBall = when (age) {
        in 5..10 -> true
        else -> false
    }

    println(canPlayBasketBall)



}