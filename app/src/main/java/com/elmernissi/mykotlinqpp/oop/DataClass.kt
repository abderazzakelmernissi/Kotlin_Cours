package com.elmernissi.mykotlinqpp.oop

// Déclaration d'une data class pour représenter un étudiant
data class Etudiant(val nom: String, val age: Int, val moyenne: Double)

fun main() {
    // Création de plusieurs objets Etudiant
    val etudiant1 = Etudiant("Ahmed", 20, 15.5)
    val etudiant2 = Etudiant("Sara", 22, 17.0)
    val etudiant3 = Etudiant("Ahmed", 20, 15.5)

    // Utilisation de toString() (généré automatiquement par la data class)
    println(etudiant1)  // Affiche : Etudiant(nom=Ahmed, age=20, moyenne=15.5)

    // Comparaison d'égalité avec equals() (généré automatiquement)
    println(etudiant1 == etudiant3)  // Affiche : true car les objets ont les mêmes valeurs

    // Utilisation de copy() pour créer une nouvelle instance en modifiant certains champs
    val etudiant4 = etudiant1.copy(nom = "Yassine")
    println(etudiant4)  // Affiche : Etudiant(nom=Yassine, age=20, moyenne=15.5)

    // Accès aux propriétés d'un objet
    println("${etudiant2.nom} a une moyenne de ${etudiant2.moyenne}")

    // Liste d'étudiants
    val listeEtudiants = listOf(etudiant1, etudiant2, etudiant4)
    listeEtudiants.forEach { etudiant ->
        println("${etudiant.nom}, Âge : ${etudiant.age}, Moyenne : ${etudiant.moyenne}")
    }
}
