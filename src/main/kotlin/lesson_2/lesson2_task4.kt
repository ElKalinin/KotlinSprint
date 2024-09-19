package org.example.lesson_2

import kotlin.math.roundToInt

fun main() {

    val crystals = 7
    val iron = 11
    val buff = 0.2

    val buffOfCrystals = (crystals * buff).roundToInt()
    val buffOfIron = (iron * buff).roundToInt()

    println(buffOfCrystals)
    println(buffOfIron)

}