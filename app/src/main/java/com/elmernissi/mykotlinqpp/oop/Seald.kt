package com.elmernissi.mykotlinqpp.oop

sealed class Operation(){
    class Add(val value :Int, operation: Operation) : Operation()
    class Substract(val value :Int, operation: Operation) : Operation()
    object Increment: Operation()
    object Decrement: Operation()
}


fun calc( a:Int, operation:Operation) = when(operation){
    is Operation.Add -> operation.value + a
    is Operation.Substract -> operation.value - a
    Operation.Increment -> a+1
    Operation.Increment -> a-1
    else -> {
        println("jjjjj")
    }
}


sealed class MediaEvent {
    // Classes avec paramètres
    data class Play(val mediaId: String) : MediaEvent()
    data class Seek(val position: Long) : MediaEvent()

    // Objets singletons
    object Pause : MediaEvent()
    object Stop : MediaEvent()
}

fun handleMediaEvent(event : MediaEvent){
    when(event){
        is MediaEvent.Play -> println("Playing music")
        is MediaEvent.Seek -> println("Psition od ${event.position}")
        MediaEvent.Pause -> println("Music paused")
        MediaEvent.Stop -> println("Music Stopped")
    }
}

fun main() {
    val playEVent = MediaEvent.Play("123252")
    val seekEvent = MediaEvent.Seek(3000)
    val pauseEvent = MediaEvent.Pause
    val stopEvent = MediaEvent.Stop

    handleMediaEvent(playEVent)
    handleMediaEvent(seekEvent)
    handleMediaEvent(pauseEvent)
    handleMediaEvent(stopEvent)
}