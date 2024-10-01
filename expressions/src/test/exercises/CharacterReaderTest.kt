import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CharacterReaderTest {

    @Test
    fun `reads set of characters from file`() {
        val expected = "!()*,-.:;?ABCDEFGHIKLMNOPRSTUVWYZ[abcdefghijklmnopqrstuvwxyz‘’“”"
        val actual = CharacterReader().readCharactersFrom("src/test/resources/alice.txt")
            .filterNot { it.isWhitespace() }
            .joinToString("")

        assertEquals(expected, actual, "sorted list of characters")
    }
}
