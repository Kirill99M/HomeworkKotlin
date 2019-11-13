import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals


class FirstTaskTest {
    private val outContent = ByteArrayOutputStream()
    private fun setUpStreams() {
        System.setOut(PrintStream(outContent))
    }

    private fun cleanUpStreams() {
        System.setOut(null)
    }

    @Test
    fun standardTaskTest() {
        setUpStreams()
        getNumber("1")
        assertEquals("Вы ввели число 1", outContent.toString())
        cleanUpStreams()
    }

    @Test
    fun negativeNumberTest() {

        setUpStreams()
        getNumber("-1")
        assertEquals("Вы ввели число -1", outContent.toString())
        cleanUpStreams()
    }

    @Test
    fun notIntNumberTest() {
        setUpStreams()
        getNumber("0.1")
        assertEquals("Некорректный ввод", outContent.toString())
        cleanUpStreams()
    }

    @Test
    fun notNumberTest() {
        setUpStreams()
        getNumber("qwerty")
        assertEquals("Некорректный ввод", outContent.toString())
        cleanUpStreams()
    }

    @Test
    fun emptyStringTest() {
        setUpStreams()
        getNumber("")
        assertEquals("Некорректный ввод", outContent.toString())
        cleanUpStreams()
    }
}