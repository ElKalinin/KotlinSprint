package org.example.lesson_4

fun main() {

    val tables = 13
    val bookingToday = 13
    val bookingTomorrow = 9

    println("Доступность столиков на сегодня: ${bookingToday < tables}")
    println("Доступность столиков на завтра: ${bookingTomorrow < tables}")

}