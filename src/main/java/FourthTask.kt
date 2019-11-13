fun main() {
    println("Введите массив целых чисел через пробел")
    val inputString = readLine().toString()
    filterArray(inputString)
}

fun filterArray(inputString: String) {
    try {
        val firstArray = inputString.split(" ")
        val secondArray: Array<Int> = Array(firstArray.size) { 0 }
        var min = 0
        var max = firstArray.size - 1
        firstArray.forEach { i ->
            if (i.toInt() < 0) {
                secondArray[min] = i.toInt()
                min++
            } else {
                secondArray[max] = i.toInt()
                max--
            }
        }
        secondArray.forEach { i -> print("$i ") }
    } catch (e: Exception) {
        print("Некорректный ввод")
    }
}