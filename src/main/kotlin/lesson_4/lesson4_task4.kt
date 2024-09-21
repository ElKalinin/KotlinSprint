package org.example.lesson_4

fun main() {

    var day = 5
    val dayParity = day % 2

    println("""
        Упражнения для рук:    ${dayParity == 1}
        Упражнения для ног:    ${dayParity == 0}
        Упражнения для спины:  ${dayParity == 0}
        Упражнения для пресса: ${dayParity == 1}
    """.trimIndent())

}