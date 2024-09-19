package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {

    val hourOfDeparture = 9
    val minuteOfDeparture = 39
    val travelTimeInMinutes = 457

    val hourOfArrival = (((hourOfDeparture * MINUTES_IN_HOUR) + minuteOfDeparture) + travelTimeInMinutes) / MINUTES_IN_HOUR
    val minuteOfArrival = (((hourOfDeparture * MINUTES_IN_HOUR) + minuteOfDeparture) + travelTimeInMinutes) % MINUTES_IN_HOUR

    print(hourOfArrival)
    print(':')
    println(minuteOfArrival)

}