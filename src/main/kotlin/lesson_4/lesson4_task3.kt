package org.example.lesson_4

fun main() {

    var sunnyWeather: Boolean = true
    var openAwning: Boolean = true
    var airHumidity: Int = 20
    var timeOfYear: String = "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(sunnyWeather == true) && (openAwning == true) && (airHumidity == 20) && (timeOfYear != "Зима")}")

}