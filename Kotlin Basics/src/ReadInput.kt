fun main(args: Array<String>) {
    //Reading User Input

    println("===============")
    println("Welcome <User>")
    println("===============")

    println("Enter a username")

    var userEnter = readLine()
    println("Welcome,")
    println(userEnter)
    println("==================================")
    println("Would you like to play a game?")

    var answer = readLine()

    if (answer == "yes") {
        println("Chess")
        println("Poker")
        println("Fighter Combat")
        println("Guerrilla Engagement")
        println("Desert Warfare")
        println("Air-to-Ground Actions")
        println("Theaterwide Tactical Warefare")
        println("Theaterwide Biotoxic and Chemical Warfare")

        println("Global ThermoNuclear War")
        return
    } else if (answer == "no") {
        println("Ending process")
        val reset = readLine()
        if (reset == "reset") {

        }
    } else {
        println("Error has occurred, Process Terminated")
    }
}