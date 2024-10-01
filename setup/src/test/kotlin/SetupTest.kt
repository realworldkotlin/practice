import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.IsEqual.equalTo
import org.junit.jupiter.api.Test

class SetupTest {

    @Test
    fun `You are ready to compile Kotlin and run tests!`() {
        assertThat("kotlin".capitalize(), equalTo("Kotlin"))
    }
}