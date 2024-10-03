// Classe abstraite Personne
abstract class Personne(val nom: String, val age: Int) {
    abstract fun afficherDetails()
}

// Interface Enseignable
interface Enseignable {
    fun enseigner()  // Méthode abstraite dans l'interface
}

// Classe Formateur qui hérite de Personne et implémente Enseignable
class Formateur(nom: String, age: Int, val specialite: String) : Personne(nom, age), Enseignable {
    override fun afficherDetails() {
        println("Formateur: $nom, Âge: $age, Spécialité: $specialite")
    }

    override fun enseigner() {
        println("$nom enseigne la spécialité : $specialite.")
    }
}

// Classe Stagiaire qui hérite de Personne et implémente Enseignable
class Stagiaire(nom: String, age: Int, val niveau: String) : Personne(nom, age), Enseignable {
    override fun afficherDetails() {
        println("Stagiaire: $nom, Âge: $age, Niveau: $niveau")
    }

    override fun enseigner() {
        println("$nom apprend au niveau : $niveau.")
    }
}

fun main() {
    val formateur = Formateur("John Doe", 35, "Développement Mobile")
    val stagiaire = Stagiaire("Jane Smith", 22, "Débutant")

    formateur.afficherDetails()
    formateur.enseigner()

    stagiaire.afficherDetails()
    stagiaire.enseigner()
}
