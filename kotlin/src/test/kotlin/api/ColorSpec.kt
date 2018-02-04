package api

import com.google.common.truth.Truth.assertThat
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
object ColorSpec : Spek({
    describe("Color Enum") {
        on("'valueOf' should handle colors") {
            it("should") {
                assertThat(Color.valueOf("BLUE")).isEqualTo(Color.BLUE)
            }
        }

        on("'values' size should be") {
            it("should") {
                assertThat(Color.values().size).isEqualTo(3)
            }
        }
    }
})
