package com.elmernissi.mykotlinqpp

class tableux {
}

fun main(){
    // from a constructor
    val array = Array<Int>(10) { 0 }
    val names: Array<String> = Array<String>(10) { "" }
    names.set(0, "Ahmed")
    println(names.get(0))

    names[0] = "Sara"
    println(names[0])

    // from a factory function
    val ages = arrayOf(4, 7, 15)
    val indexAge = 2
    println("Le 3eme élément est : ${ages[indexAge]}")

    ages[indexAge] = 29
    println("Le 3eme élément est à pésent : ${ages[indexAge]}")





    val myList = mutableListOf(1, 2, 3)
    myList.add(4)
    println(myList)  // [1, 2, 3, 4]


    val myArray = arrayOf(1, 2, 3)
    val myList2 = myArray.toMutableList()
    myList2.add(4)
    println(myList2)  // [1, 2, 3, 4]


}