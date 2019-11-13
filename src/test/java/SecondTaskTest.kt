import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals

class SecondTaskTest {
    private val outContent = ByteArrayOutputStream()
    private fun setUpStreams() {
        System.setOut(PrintStream(outContent))
    }

    private fun cleanUpStreams() {
        System.setOut(null)
    }

    @Test
    fun standardRevere() {
        setUpStreams()
        reverseNumber(123)
        assertEquals("321", outContent.toString(), "Некорректный вывод перевернутого числа 123")
        cleanUpStreams()
    }

    @Test
    fun incorrectInput() {
        setUpStreams()
        reverseNumber(-123)
        assertEquals("Некорректный ввод", outContent.toString(), "Некорректный вывод ошибки")
        cleanUpStreams()
    }

    @Test
    fun checkNumberWithTwoZeroes() {
        setUpStreams()
        reverseNumber(100)
        assertEquals("001", outContent.toString(), "Некорректный вывод числа 100")
        cleanUpStreams()
    }
}