package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val downPayment = 70000
    val annualPercentage = 0.167
    val depositTerm = 20

    val finalAmount = downPayment * (1 + annualPercentage).pow(depositTerm)

    println(String.format("%.3f" , finalAmount))

}