fun main() {
    val number = readLine()!!.toInt()
    reverseNumber(number)
}

fun reverseNumber(number: Int) {
    try {
        if (number / 100 < 1 || number / 100 > 9) {
            throw Exception()
        } else {
            val answer: String = ((number % 100) % 10).toString() + ((number % 100 - ((number % 100) % 10)) / 10).toString() + (number / 100).toString()
            print(answer)
        }
    } catch (e: Exception) {
        print("Некорректный ввод")
    }
}