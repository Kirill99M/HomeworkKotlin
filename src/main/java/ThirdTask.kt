fun main() {
    println("Введите номер месяца")
    val numberMonth = readLine().toString()
    getSeason(numberMonth)
}

fun getSeason(numberMonth: String) {
    try {

        if (numberMonth.toInt() > 12 || numberMonth.toInt() < 1) {
            throw Exception()
        }
        val seasons = arrayOf("Зима", "Весна", "Лето", "Осень", "Зима")
        print(seasons[numberMonth.toInt() / 3])
    } catch (e: Exception) {
        print("Неккоректный ввод номера месяца")
    }
}