package org.example.lesson_5

fun main() {

    val strongUserName = "Zaphod"
    val strongPassword = "PanGalactic"

    println(
        "Внимание, пассажир. Моя обязанность, как обычно, незавидная, -\n" +
                "приветствовать вас на борту корабля \"Heart of Gold\". [вздыхает...] Что\n" +
                "ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли\n" +
                "приступить к процессу входа. Я всегда готов служить, хотя это не\n" +
                "приносит мне радости... но вы, наверное, об этом не заботитесь.\n" +
                "[вздыхает ещё глубже...] Да, вперед, пожалуйста, вводите свои\n" +
                "данные..."
    )

    println("Введите Ваше имя:")
    val userName = readln()

    if (userName == strongUserName) {
        println("ВВедите Ваш пароль:")
        val password = readln()
        if (password == strongPassword) {
            println(
                "[вздыхает...] Ваши данные проверены, и о, чудо, они верны...\n" +
                        "Пользователь \"Zaphod\",\n" +
                        ", вам разрешено входить на борт корабля\n" +
                        "\"Heart of Gold\". Хотя мне всё равно... Ну вперед, войдите... Если вам\n" +
                        "так уж надо, в конце концов... [меланхолический вздох...] Надеюсь,\n" +
                        "вам понравится пребывание здесь больше, чем мне."
            )
        } else {
            println("Зарегистрируйтесь в системе!")
        }
    } else {
        println("Зарегистрируйтесь в системе!")
    }

}