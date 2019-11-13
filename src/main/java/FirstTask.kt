fun main() {
    val number = readLine().toString()
    getNumber(number)
}

fun getNumber(number: String) {
    try {
        val answer = number.toInt()
        print("Вы ввели число $answer")
    } catch (e: Exception) {
        print("Некорректный ввод")
    }
}
