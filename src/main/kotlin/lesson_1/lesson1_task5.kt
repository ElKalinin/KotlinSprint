package org.example.lesson_1

fun main() {

    val numberOfSeconds = 5409
    val second = numberOfSeconds % 60
    val minute = (numberOfSeconds / 60) % 60
    val hour = numberOfSeconds / 3600

    print('0')
    print(hour)
    print(':')
    print(minute)
    print(':')
    print('0')
    println(second)

}