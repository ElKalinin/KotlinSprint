package org.example.lesson_2

import kotlin.math.roundToInt

fun main() {

    val crystals = 7
    val iron = 11
    var buff = 20f
    val buffInPercentage: Float = buff / 100


    val buffOfCrystals = (crystals * buffInPercentage).roundToInt()
    val buffOfIron = (iron * buffInPercentage).roundToInt()

    println(buffOfCrystals)
    println(buffOfIron)

}