package api

import com.google.common.truth.Truth.assertThat
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.context
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it

object NodeSpec : Spek({
    describe("Node for answer coding questions") {
        val node = Node<Int>()
        context("basic usage with no value") {
            node.value = 123
            it("should be 123") {
                assertThat(node.value).isEqualTo(123)
            }
        }

        context("basic usage with initial value") {
            it("should be 123") {
                assertThat(Color.values().size).isEqualTo(3)
            }
        }
    }
})
