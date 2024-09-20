package org.example.lesson_3

fun main() {

    val serverLine = "D2-D4;0"
    val numberFrom = "${serverLine.get(0)}${serverLine.get(1)}"
    val numberTo = "${serverLine.get(3)}${serverLine.get(4)}"
    val moveNumber =serverLine.get(6)

    println(numberFrom)
    println(numberTo)
    println(moveNumber)

}