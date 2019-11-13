import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FifthTaskTest {
    @Test
    fun standardGetWord() {
        assertEquals("Сто двадцать три", getWordNumber("123"), "некорректный вывод числа")
    }

    @Test
    fun checkUniqueNumbers() {
        val uniqueNumbers = arrayOf("Десять", "Одинадцать", "Двенадцать", "Тринадцать", "Четырнадцать", "Пятнадцать", "Шестнадцать", "Семнадцать", "Восемнадцать", "Девятнадцать")
        for (i in 10..19) {
            assertEquals(uniqueNumbers[i % 10], getWordNumber(i.toString()), "некорректный вывод числа $i")
        }
    }

    @Test
    fun checkZero() {
        assertEquals("Ноль", getWordNumber("0"))
    }

    @Test
    fun checkHundred() {
        assertEquals("Тысяча", getWordNumber("1000"))
    }

    @Test
    fun incorrectInput() {
        assertEquals("Некорректный ввод", getWordNumber(""), "Некорректный вывод ошибки")
    }
}
