import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals

class FourthTaskTest {
    private val outContent = ByteArrayOutputStream()

    private fun setUpStreams() {
        System.setOut(PrintStream(outContent))
    }

    private fun cleanUpStreams() {
        System.setOut(null)
    }

    @Test
    fun standardFourthTaskTest() {
        setUpStreams()
        filterArray("25 -44 33 -28 -0 0 9")
        assertEquals("-44 -28 9 0 0 33 25 ", outContent.toString(), "Не правильный вывод")
        cleanUpStreams()
    }

    @Test
    fun allPositiveNumbers() {
        setUpStreams()
        filterArray("25 44 33 28 3 2 9")
        assertEquals("9 2 3 28 33 44 25 ", outContent.toString(), "Не правильный вывод")
        cleanUpStreams()
    }

    @Test
    fun allNegativeNumbers() {
        setUpStreams()
        filterArray("-25 -44 -33 -28 -3 -2 -9")
        assertEquals("-25 -44 -33 -28 -3 -2 -9 ", outContent.toString(), "Не правильный вывод")
        cleanUpStreams()
    }

    @Test
    fun incorrectFourthTaskTest() {
        setUpStreams()
        filterArray("qq ww re")
        assertEquals("Некорректный ввод", outContent.toString(), "Не правильный вывод")
        cleanUpStreams()
    }

    @Test
    fun emptyFourthTaskTest() {
        setUpStreams()
        filterArray("")
        assertEquals("Некорректный ввод", outContent.toString(), "Не правильный вывод")
        cleanUpStreams()
    }
}