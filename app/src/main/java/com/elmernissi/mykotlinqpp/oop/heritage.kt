package com.elmernissi.mykotlinqpp.oop

import java.util.jar.Attributes.Name

abstract class Personne(val nom: String, val age: Int) {
    abstract fun afficherDetails()
}

// Classe Formateur qui hérite de Personne
class Formateur(nom: String, age: Int, val specialite: String) : Personne(nom, age) {
    override fun afficherDetails() {
        println("Formateur: $nom, Âge: $age, Spécialité: $specialite")
    }
}

// Classe Stagiaire qui hérite de Personne
class Stagiaire(nom: String, age: Int, val niveau: String) : Personne(nom, age) {
    override fun afficherDetails() {
        println("Stagiaire: $nom, Âge: $age, Niveau: $niveau")
    }
}
fun main() {

    val formateur = Formateur("Ahmed", 35, "Développement Mobile")
    val stagiaire = Stagiaire("Sara", 22, "1er annee")

    formateur.afficherDetails()
    stagiaire.afficherDetails()

}