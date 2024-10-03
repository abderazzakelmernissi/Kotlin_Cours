package com.elmernissi.mykotlinqpp

class ExempleLateinit {
    lateinit var nom: String

    fun initialiserNom(nouveauNom: String) {
        nom = nouveauNom
    }

    fun afficherNom() {
        if (::nom.isInitialized) {
            println("Le nom est : $nom")
        } else {
            println("Le nom n'est pas encore initialisé")
        }
    }
}


class Utilisateur {
    val nomComplet: String by lazy {
        println("Calcul du nom complet...")
        "Ahmed"
    }
}



fun main() {
    val exemple = ExempleLateinit()
    exemple.afficherNom()  // Affiche : Le nom n'est pas encore initialisé

    exemple.initialiserNom("Kotlin")
    exemple.afficherNom()  // Affiche : Le nom est : Kotlin


    println("***********************")
    val utilisateur = Utilisateur()

    // Le bloc lazy ne s'exécute pas encore à ce moment
    println("L'utilisateur est créé.")

    // Le bloc lazy s'exécute ici lors du premier accès à `nomComplet`
    println("Nom complet de l'utilisateur : ${utilisateur.nomComplet}")

    // Le bloc lazy ne s'exécute plus lors des accès suivants, car la valeur est déjà calculée
    println("Nom complet de l'utilisateur (2ème accès) : ${utilisateur.nomComplet}")
}


