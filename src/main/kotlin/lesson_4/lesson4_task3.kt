package org.example.lesson_4

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val FAVORABLE_AIR_HUMIDITY = 20
const val ADVERSE_TIME_OF_YEAR = "Зима"

fun main() {

    var sunnyWeather: Boolean = true
    var openAwning: Boolean = true
    var airHumidity: Int = 20
    var timeOfYear: String = "Зима"

    val favorableCondition =
        (sunnyWeather == IS_SUNNY) && (openAwning == IS_AWNING_OPEN) &&
                (airHumidity == FAVORABLE_AIR_HUMIDITY) && (timeOfYear != ADVERSE_TIME_OF_YEAR)

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableCondition")

}