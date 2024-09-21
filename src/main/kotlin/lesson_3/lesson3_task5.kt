package org.example.lesson_3

fun main() {

    val serverLine = "D2-D4;0"
    val parsingServerLine = serverLine.split("-", ";")
    val numberFrom = parsingServerLine[0]
    val numberTo = parsingServerLine[1]
    val moveNumber = parsingServerLine[2]

    println(numberFrom)
    println(numberTo)
    println(moveNumber)

}