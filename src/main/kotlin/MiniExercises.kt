fun main() {

    val trafficLightColor = "yellow"

    val massage = when (trafficLightColor) {
        "red" -> "Stop! __O==O__"
        "yellow" -> "Slow! O==O"
        "green" -> "Go! O==O"
        else -> "the TrafficLight is Brok ! -o- "
    }

    val cond =
        if (trafficLightColor == "green") "GO" else if (trafficLightColor == "yellow") "Slow" else "Invalid Traffic"
    println(massage)
    println(cond)

}