package org.example.lesson_1

const val MINUTE_IN_SECONDS = 60
const val HOUR_IN_MINUTES = 60
const val HOUR_IN_SECONDS = 3600

fun main() {

    val numberOfSeconds = 6480
    val second = numberOfSeconds % MINUTE_IN_SECONDS
    val minute = (numberOfSeconds / MINUTE_IN_SECONDS) % HOUR_IN_MINUTES
    val hour = numberOfSeconds / HOUR_IN_SECONDS

    println("%02d:%02d:%02d".format(hour, minute, second))

}