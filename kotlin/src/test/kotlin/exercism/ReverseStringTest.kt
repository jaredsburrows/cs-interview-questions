package exercism

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReverseStringTest {
    @Test
    fun testAnEmptyString() {
        assertEquals("", reverse(""))
    }

    @Test
    fun testAWord() {
        assertEquals("tobor", reverse("robot"))
    }

    @Test
    fun testACapitalizedWord() {
        assertEquals("nemaR", reverse("Ramen"))
    }

    @Test
    fun testASentenceWithPunctuation() {
        assertEquals("!yrgnuh m'I", reverse("I'm hungry!"))
    }

    @Test
    fun testAPalindrome() {
        assertEquals("racecar", reverse("racecar"))
    }
}
