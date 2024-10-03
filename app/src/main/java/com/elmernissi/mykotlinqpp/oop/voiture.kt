package com.elmernissi.mykotlinqpp.oop

class voiture (val wheel : Int){

    fun beep(){
        println("hello car")
        var wheel = 3
        for (i in 1..this.wheel){
            println("beep $i")
        }
    }
}


class personnee (var name :String , var age : Int){

    constructor(name : String) : this(name,18)

    init{
        if(age < 0 ){
            age = 1
        }
    }

    fun afficheInfo(){

        println("Votre nom est : ${name}, Votre Age est : ${age}")
    }

}
fun main() {

    var nisane = voiture(4)

    println(nisane.beep())
    //println(nisane.wheel)

    var ahmed = personnee("Ahmed", 15)
    var yassine = personnee("yassine", -5)
    var sara = personnee("sara")

    ahmed.afficheInfo()
    yassine.afficheInfo()
    sara.afficheInfo()


}