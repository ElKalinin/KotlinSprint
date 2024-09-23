package org.example.lesson_4

const val TABLES = 13

fun main() {

    val bookingToday = 13
    val bookingTomorrow = 9

    println("Доступность столиков на сегодня: ${bookingToday < TABLES}")
    println("Доступность столиков на завтра: ${bookingTomorrow < TABLES}")

}