package com.elmernissi.mykotlinqpp.oop

class Outer {
    private val bar: Int = 1
    class Nested {
        fun foo() = 2
    }
}


class Universite(val name: String) {

    class Departement(val nom: String, val nbEtudiants: Int) {
        fun afficherDetails() {
            println("Département: $nom, Nombre d'étudiants: $nbEtudiants")
        }
    }

    fun afficherUniversite() {
        println("Université: $name")
    }
}



class Car(val wheelsCount: Int) {

    inner class Engine {
        fun displayHorsepower() {
            println("La voiture a ${wheelsCount * 34} chevaux")
        }
    }
}

fun main() {
    val demo = Outer.Nested().foo() // == 2

    val universite = Universite("Université de Safi")
    universite.afficherUniversite()

    val departement = Universite.Departement("Informatique", 150)
    departement.afficherDetails()


    val car = Car(4)
    car.Engine().displayHorsepower()


}
