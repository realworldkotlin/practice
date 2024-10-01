import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DatabaseConnectionBuilderTest {

    @Test
    fun `can build a database connection and connect it up`() {
        assertEquals(DatabaseConnectionBuilder().build("foobar", "password", "localhost", 3306)
            .connect(), true)
    }
}
