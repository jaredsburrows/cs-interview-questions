package exercism

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HelloWorldTest {
    @Test fun helloWorldTest() {
        assertEquals("Hello, World!", hello())
    }
}
