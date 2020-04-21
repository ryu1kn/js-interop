import kotlin.test.*

class SimpleTest {
    @Test fun bar() {
        assertEquals(1, 1)
    }

    @Ignore fun baz() {
        fail("Doesn't work")
    }
}
