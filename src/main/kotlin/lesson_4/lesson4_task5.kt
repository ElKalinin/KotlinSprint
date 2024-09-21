package org.example.lesson_4

fun main() {

    var damage: Boolean
    var crew: Int
    var provisions: Int
    var weather: Boolean

    println("Введите информацию о повреждении (true/false):")
    damage = readLine()!!.toBoolean()

    println("Введите информацию о количестве экипажа:")
    crew = readLine()!!.toInt()

    println("Введите информацию о количестве ящиков с провизией:")
    provisions = readLine()!!.toInt()

    println("Введите информацию о благоприятности метеоусловий (true/false):")
    weather = readLine()!!.toBoolean()

    val flightClearance: Boolean = ((damage == false) && (crew >= 55) && (crew <= 70) && (provisions > 50) && ((weather == true) || (weather == false))) || ((damage == true) && (crew == 70) && (weather == true) && (provisions >= 50))

    println("Корабль готов к полёту: $flightClearance")

}