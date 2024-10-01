import org.junit.Assert.assertEquals
import org.junit.jupiter.api.Test

class ExtensionTests {

    @Test
    fun `converts to camel case`() {
        assertEquals(toCamelCase("my first extension"), "MyFirstExtension")
    }

}