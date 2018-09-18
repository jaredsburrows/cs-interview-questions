package api

import com.google.common.truth.Truth.assertThat
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.context
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it

object ColorSpec : Spek({
    describe("Color Enum") {
        context("'valueOf' String") {
            it("should 'valueOf' should handle colors") {
                assertThat(Color.valueOf("BLUE")).isEqualTo(Color.BLUE)
            }
        }

        context("'values' size") {
            it("should only have 3 colors") {
                assertThat(Color.values().size).isEqualTo(3)
            }
        }
    }
})
