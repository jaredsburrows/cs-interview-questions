package api

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.test.assertEquals

object ColorSpec : Spek({
    describe("Color Enum") {
        context("'valueOf' String") {
            it("should 'valueOf' should handle colors") {
                assertEquals(Color.valueOf("BLUE"), Color.BLUE)
            }
        }

        context("'values' size") {
            it("should only have 3 colors") {
                assertEquals(Color.values().size, 3)
            }
        }
    }
})
