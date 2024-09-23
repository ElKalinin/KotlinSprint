package org.example.lesson_5

fun main() {

    val strongValue1 = 10
    val strongValue2 = 20
    val strongValue3 = 30

    val strongListOfValues = listOf(strongValue1, strongValue2, strongValue3)

    println("Введите первое число от 0 до 42:")
    val value1 = readln().toInt()

    println("Введите второе число от 0 до 42:")
    val value2 = readln().toInt()

    println("Введите третье число от 0 до 42:")
    val value3 = readln().toInt()

    val listOfValues = listOf(value1, value2, value3)

    val winnerList = strongListOfValues.intersect(listOfValues)
    println(winnerList)
 println(winnerList)
}