package com.elmernissi.mykotlinqpp

fun main() {

    val uniqueNames = mutableSetOf("Ahmed", "Sara")
    println(uniqueNames)

    // Ahmed will not be added (duplicate)
    uniqueNames.add("Yassine")
    uniqueNames.add("Younnes")
    uniqueNames.add("Ahmed")
    println(uniqueNames)
//
    println("Ahmed est est présent ? ${uniqueNames.contains("Ahmed")}")
//
    // create a read only view of the MutableSet
    val namesView: Set<String> = uniqueNames
    println("Liste des noms en foreach")
    for (name in namesView) {
        println(name)
    }
    println("élément à l'indice 0: ${namesView.elementAt(0)}")

    // filter still works, returns a List rather than a Set
    val list: List<String> = namesView
        .filter { it.startsWith("y") }
        .sorted()
    println("Set filtré par la lettre y: $list")

}