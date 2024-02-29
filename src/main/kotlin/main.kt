

fun main() {
    val seconds = readln().toInt()
    var time = " "

    fun correctMinutesForm(seconds: Int): String {
        if (seconds < 3600) {
            when (seconds / 60) {
                1, 21, 31, 41, 51 -> time = "минуту"
                11, 12, 13, 14 -> time = "минут"
                2, 22, 32, 42, 52, 3, 23, 33, 43, 53, 4, 24, 34, 44, 54 -> time = "минуты"
                5, 25, 35, 45, 55, 6, 26, 36, 46, 56, 7, 27, 37, 47, 57, 8, 28, 38, 48, 58, 9, 29, 39, 49, 59 -> time =
                    "минут"
            }
        } else {
            when (seconds / 3600) {
                1, 21 -> time = "час"
                2, 3, 4, 22, 23, 24 -> time = "часа"
                in 5..20 -> time = "часов"
            }
        }
        return time
    }

    fun agoToText(seconds: Int) {
        when (seconds) {
            in 0..60 -> println("был(а) только что")
            in 61..3599 -> println("был(а) " + (seconds / 60) + " " + time + " назад")
            in (60 * 60)..(24 * 60 * 60) -> println("был(а) " + (seconds / 3600) + " " + time + " назад")
            in (24 * 60 * 60 + 1)..(48 * 60 * 60) -> println("был(а) вчера")
            in (48 * 60 * 60 + 1)..(72 * 60 * 60) -> println("был(а) позавчера")
            else -> {
                println("был(а) давно")
            }
        }

    }
    correctMinutesForm(seconds)
    agoToText(seconds)
}