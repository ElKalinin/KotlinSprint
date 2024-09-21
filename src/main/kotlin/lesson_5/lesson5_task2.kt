package org.example.lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {

    val currentYear = 2024

    println("Введите Ваш год рождения:")
    val userYear = readln().toInt()

    val age = currentYear - userYear

    if (age >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")

}