import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals

class ThirdTaskTest() {
    private val outContent = ByteArrayOutputStream()

    private fun setUpStreams() {
        System.setOut(PrintStream(outContent))
    }

    private fun cleanUpStreams() {
        System.setOut(null)
    }

    @Test
    fun winterTest() {
        setUpStreams()
        getSeason("1")
        getSeason("2")
        getSeason("12")
        assertEquals("ЗимаЗимаЗима", outContent.toString(), "неправильный вывод зимы")
        cleanUpStreams()
    }

    @Test
    fun springTest() {
        setUpStreams()
        getSeason("3")
        getSeason("4")
        getSeason("5")
        assertEquals("ВеснаВеснаВесна", outContent.toString(), "неправильный вывод весны")
        cleanUpStreams()
    }

    @Test
    fun summerTest() {
        setUpStreams()
        getSeason("6")
        getSeason("7")
        getSeason("8")
        assertEquals("ЛетоЛетоЛето", outContent.toString(), "неправильный вывод лета")
        cleanUpStreams()
    }

    @Test
    fun autumnTest() {
        setUpStreams()
        getSeason("9")
        getSeason("10")
        getSeason("11")
        assertEquals("ОсеньОсеньОсень", outContent.toString(), "неправильный вывод осени")
        cleanUpStreams()
    }

    @Test
    fun incorrectInput() {
        setUpStreams()
        getSeason("qwerty")
        assertEquals("Неккоректный ввод номера месяца", outContent.toString(), "неправильный вывод ошибки")
        cleanUpStreams()
    }

    @Test
    fun negativeInput() {
        setUpStreams()
        getSeason("-12")
        assertEquals("Неккоректный ввод номера месяца", outContent.toString(), "неправильный вывод ошибки")
        cleanUpStreams()
    }

    @Test
    fun zeroInput() {
        setUpStreams()
        getSeason("0")
        assertEquals("Неккоректный ввод номера месяца", outContent.toString(), "неправильный вывод ошибки")
        cleanUpStreams()
    }

    @Test
    fun emptyInput() {
        setUpStreams()
        getSeason("")
        assertEquals("Неккоректный ввод номера месяца", outContent.toString(), "неправильный вывод ошибки")
        cleanUpStreams()
    }
}