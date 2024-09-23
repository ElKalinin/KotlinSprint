package org.example.lesson_4

const val MIN_WEIGHT_AVERAGE = 35
const val MAX_WEIGHT_AVERAGE = 100
const val MAX_VOLUME_AVERAGE = 100

fun main() {

    val weightCargo1 = 20
    val volumeCargo1 = 80

    val weightCargo2 = 50
    val volumeCargo2 = 100

    val comparisonResultCargo1 =
        (weightCargo1 > MIN_WEIGHT_AVERAGE) && (weightCargo1 <= MAX_WEIGHT_AVERAGE) && (volumeCargo1 < MAX_VOLUME_AVERAGE)
    val comparisonResultCargo2 =
        (weightCargo2 > MIN_WEIGHT_AVERAGE) && (weightCargo2 <= MAX_WEIGHT_AVERAGE) && (volumeCargo2 < MAX_VOLUME_AVERAGE)

    println("Груз с весом $weightCargo1 кг и объемом $volumeCargo1 л соответствует категории 'Average': $comparisonResultCargo1")
    println("Груз с весом $weightCargo2 кг и объемом $volumeCargo2 л соответствует категории 'Average': $comparisonResultCargo2")

}