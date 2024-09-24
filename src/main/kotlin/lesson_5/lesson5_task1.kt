package org.example.lesson_5

fun main() {

    val verificationNumber1 = 2
    val verificationNumber2 = 3
    val verificationAddition = verificationNumber1 + verificationNumber2

    println("Введите правильный ответ на $verificationNumber1+$verificationNumber2:")
    val answer = readln().toInt()

    if (answer == verificationAddition) println("Добро пожаловать!")
    else println("Доступ запрещён.")

}