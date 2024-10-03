package com.elmernissi.mykotlinqpp.oop

import java.util.Calendar

class Pers (var Name : String,  var year: Int) {

    //constructor(Name : String) : this(Name,4)
    //constructor() : this("Pers",10)
    //constructor() : this("kamal")

    init {
        var thisYear = Calendar.getInstance().get(Calendar.YEAR)
        var Age = thisYear - year

        println("$Name a $Age")
    }

    fun Afficher(){
        var Name:String = "Khaled"
        println("Votre nom est : ${this.Name}")
    }
}

fun main() {

    var P1 = Pers("Ahmed",1998)
    P1.Afficher()

    //this
}