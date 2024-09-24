package org.example.lesson_5

fun main() {

    val strongValue1 = 10
    val strongValue2 = 20

    println("Введите первое число в диапазоне от 0 до 42:")
    val userValue1 = readln().toInt()

    println("Введите второе число в диапазоне от 0 до 42:")
    val userValue2 = readln().toInt()

    println("Правильные числа: 10 и 20")

    if ((userValue2 == strongValue1 || userValue2 == strongValue2) && (userValue1 == strongValue1 || userValue1 == strongValue2)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((userValue2 == strongValue1 || userValue2 == strongValue2) || (userValue1 == strongValue1 || userValue1 == strongValue2)) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

}