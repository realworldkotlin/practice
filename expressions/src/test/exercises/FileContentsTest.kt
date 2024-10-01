import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.File

class FileContentsTest {

    @Test
    fun `reads and returns contents of existing file`() {
        assertEquals(
            listOf("alice.txt:Alice was ", "curious.txt:‘What a cu"),
            FileContents().contentsOf(file("alice.txt") + "," + file("curious.txt"))
        )
    }

    @Test
    fun `reads and returns contents of file with no txt extension`() {
        assertEquals(listOf("alice.txt:Alice was "), FileContents().contentsOf(file("alice.txt").replace(".txt", "")))
    }

    @Test
    fun `returns expected for non-existent file`() {
        assertEquals(listOf("rabbit.txt:<empty fil"), FileContents().contentsOf("rabbit.txt"))
    }

    @AfterEach
    fun cleanup() {
        File(".").listFiles().filter { it.name.endsWith(".txt") }.forEach { it.delete() }
    }
}

private fun FileContentsTest.file(s: String) = File(javaClass.getResource(s).toURI()).absolutePath
