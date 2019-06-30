package api

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.test.assertEquals

object NodeSpec : Spek({
    describe("Node for answer coding questions") {
        val node = Node<Int>()
        context("basic usage with no value") {
            node.value = 123
            it("should be 123") {
                assertEquals(node.value, 123)
            }
        }

        context("basic usage with initial value") {
            it("should be 123") {
                assertEquals(Color.values().size, 3)
            }
        }
    }
})
