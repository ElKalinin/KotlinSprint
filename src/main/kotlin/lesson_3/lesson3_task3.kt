package org.example.lesson_3

fun main() {

    var number: Int
    number = 6

    val multiplicationTable = """
        $number x 1 = $number
        $number x 2 = ${number * 2}
        $number x 3 = ${number * 3}
        $number x 4 = ${number * 4}
        $number x 5 = ${number * 5}
        $number x 6 = ${number * 6}
        $number x 7 = ${number * 7}
        $number x 8 = ${number * 8}
        $number x 9 = ${number * 9}
    """

    println(multiplicationTable)

}