package org.example.lesson_4

const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_PROVISIONS = 50
const val IS_DAMAGE = true
const val IS_FAVORABLE_WEATHER = true

fun main() {

    var damage: Boolean
    var crew: Int
    var provisions: Int
    var weather: Boolean

    println("Введите информацию о повреждении (true/false):")
    damage = readln().toBoolean()

    println("Введите информацию о количестве экипажа:")
    crew = readln().toInt()

    println("Введите информацию о количестве ящиков с провизией:")
    provisions = readln().toInt()

    println("Введите информацию о благоприятности метеоусловий (true/false):")
    weather = readln().toBoolean()

    val flightClearance: Boolean =
        ((damage != IS_DAMAGE) && (crew >= MIN_CREW) && (crew <= MAX_CREW) && (provisions > MIN_PROVISIONS) &&
                ((weather == IS_FAVORABLE_WEATHER) || (weather != IS_FAVORABLE_WEATHER))) ||
                ((damage == IS_DAMAGE) && (crew == MAX_CREW) &&
                        (weather == IS_FAVORABLE_WEATHER) && (provisions >= MIN_PROVISIONS))

    println("Корабль готов к полёту: $flightClearance")

}