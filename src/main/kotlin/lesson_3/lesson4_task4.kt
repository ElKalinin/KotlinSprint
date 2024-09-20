package org.example.lesson_3

fun main() {

    var numberFrom: String
    var numberTo: String
    var moveNumber: Int

    numberFrom = "E2"
    numberTo = "E4"
    moveNumber = 1

    fun serverLine(from: String?, to: String?, number: Int?): String? = "[$from-$to;$number]"

    println(serverLine(numberFrom, numberTo, moveNumber))

    numberFrom = "D2"
    numberTo = "D4"
    moveNumber = 2

    println(serverLine(numberFrom, numberTo, moveNumber))

}