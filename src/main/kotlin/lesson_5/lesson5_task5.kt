package org.example.lesson_5

fun main() {

    val strongValue1 = (0..42).random()
    val strongValue2 = (0..42).random()
    val strongValue3 = (0..42).random()

    val strongListOfValues = listOf(strongValue1, strongValue2, strongValue3)

    println("Введите первое число от 0 до 42:")
    val value1 = readln().toInt()

    println("Введите второе число от 0 до 42:")
    val value2 = readln().toInt()

    println("Введите третье число от 0 до 42:")
    val value3 = readln().toInt()

    val listOfValues = listOf(value1, value2, value3)

    val winnerList = strongListOfValues.intersect(listOfValues)
    val numberOfMatches = winnerList.size

    if (numberOfMatches == 3) println("Вы угадали все числа и выиграли джекпот!")
    else if (numberOfMatches == 2) println("Вы угадали два числа и выиграли большой приз!")
    else if (numberOfMatches == 1) println("Вы угадали одно число и выиграли малый приз!")
    else println("Вы не угадали ни одного числа, попробуйте ещё!")

    println("Правильные числа: $strongListOfValues")

}