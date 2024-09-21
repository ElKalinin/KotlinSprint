package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val downPayment = 70000
    val annualPercentage = 16.7
    val depositTerm = 20

    val finalAmount = downPayment * (1 + (annualPercentage / 100)).pow(depositTerm)

    println(String.format("%.3f" , finalAmount))

}