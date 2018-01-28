package api

import com.google.common.truth.Truth.assertThat
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
object NodeSpec : Spek({
    describe("Node for answer coding questions") {
        val node = Node<Int>()
        on("basic usage with no value") {
            node.value = 123
            it("should be 123") {
                assertThat(node.value).isEqualTo(123)
            }
        }

        on("basic usage with inital value") {
            it("should be 123") {
                assertThat(Color.values().size).isEqualTo(3)
            }
        }
    }
})
