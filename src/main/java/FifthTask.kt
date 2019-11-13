fun main() {
    println(getWordNumber(readLine().toString()))
}

fun getWordNumber(input: String): String {
    try {
        val number = input.toInt()
        var word = ""
        val hundreds = arrayOf("Сто", "Двести", "Триста", "Четыреста", "Пятьсот", "Шестьсот", "Семьсот", "Восемьсот", "Девятьсот")
        val dozens = arrayOf("двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто")
        val units = arrayOf("один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять")
        val uniqueNumbers = arrayOf("Десять", "Одинадцать", "Двенадцать", "Тринадцать", "Четырнадцать", "Пятнадцать", "Шестнадцать", "Семнадцать", "Восемнадцать", "Девятнадцать")
        if (number % 100 in 10..19 && number / 100 > 0) {
            return hundreds[(number / 100) - 1] + " " + uniqueNumbers[number % 10]
        }
        if (number % 100 in 10..19) {
            return uniqueNumbers[number % 10]
        }
        if (number == 0) return "Ноль"
        if (number == 1000) return "Тысяча"
        if (number / 100 > 0) {
            word += hundreds[(number / 100) - 1] + " "
        }
        if (((number / 10) % 10) > 1) {
            word += dozens[((number / 10) % 10) - 2] + " "
        }
        if ((number % 100) % 10 > 0) {
            word += units[((number % 100) % 10) - 1]
        }
        return word
    } catch (e: Exception) {
        return ("Некорректный ввод")
    }
}