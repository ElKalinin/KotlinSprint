package org.example.lesson_4

const val FAVORABLE_SUNNY_WEATHER = true
const val FAVORABLE_OPEN_AWNING = true
const val FAVORABLE_AIR_HUMIDITY = 20
const val ADVERSE_TIME_OF_YEAR = "Зима"

fun main() {

    var sunnyWeather: Boolean = true
    var openAwning: Boolean = true
    var airHumidity: Int = 20
    var timeOfYear: String = "Зима"

    val favorableCondition =
        (sunnyWeather == FAVORABLE_SUNNY_WEATHER) && (openAwning == FAVORABLE_OPEN_AWNING) && (airHumidity == FAVORABLE_AIR_HUMIDITY) && (timeOfYear != ADVERSE_TIME_OF_YEAR)

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableCondition")

}