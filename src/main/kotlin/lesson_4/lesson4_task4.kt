package org.example.lesson_4

fun main() {

    var day = 5
    val dayParity = day % 2
    val isEven = dayParity == 0

    println(
        """
        Упражнения для рук:    ${isEven != true}
        Упражнения для ног:    ${isEven == true}
        Упражнения для спины:  ${isEven == true}
        Упражнения для пресса: ${isEven != true}
    """.trimIndent()
    )

}