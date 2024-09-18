package org.example.lesson_2

fun main() {

    val hourOfDeparture = 9
    val minuteOfDeparture = 39
    val travelTimeInMinutes =457

    val hourOfArrival = (((hourOfDeparture * 60) + minuteOfDeparture) + travelTimeInMinutes) / 60
    val minuteOfArrival = (((hourOfDeparture * 60) + minuteOfDeparture) + travelTimeInMinutes) % 60

    print(hourOfArrival)
    print(':')
    println(minuteOfArrival)

}