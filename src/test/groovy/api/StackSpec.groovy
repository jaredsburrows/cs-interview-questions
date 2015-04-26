package api

import spock.lang.Specification

class StackSpec extends Specification {

    Stack stack = new Stack()
    TreeNode valueNode = new TreeNode(1)
    TreeNode valueNode2 = new TreeNode(2)
    TreeNode valueNode3 = new TreeNode(3)
    TreeNode blankNode = new TreeNode(0)
    TreeNode blankNode2 = new TreeNode(0)

    def "peek"() {

        expect:
        stack.peek() == null
        stack.push(blankNode)
        stack.peek() == blankNode
    }

    def "peek - multiple"() {

        expect:
        stack.peek() == null
        stack.push(blankNode)
        stack.peek() == blankNode
        stack.push(blankNode2)
        stack.peek() == blankNode2
    }

    def "push - single"() {
        TreeNode blankNode = new TreeNode(0)

        expect:
        stack.peek() == null
        stack.push(null)
        stack.peek() == null
        stack.push(blankNode)
        stack.peek() == blankNode
    }

    def "push - multiple"() {

        expect:
        stack.peek() == null
        stack.push(null)
        stack.peek() == null
        stack.push(valueNode)
        stack.peek() == valueNode
        stack.push(valueNode2)
        stack.peek() == valueNode2
        stack.push(valueNode3)
        stack.peek() == valueNode3
    }

    def "pop"() {

        expect:
        stack.peek() == null
        stack.push(null)
        stack.peek() == null
        stack.push(blankNode)
        stack.peek() == blankNode
        stack.pop()
        stack.peek() == null
    }

    def "pop - multiple"() {

        expect:
        stack.peek() == null
        stack.push(null)
        stack.peek() == null
        stack.push(valueNode)
        stack.peek() == valueNode
        stack.push(valueNode2)
        stack.peek() == valueNode2
        stack.push(valueNode3)
        stack.peek() == valueNode3
        stack.pop()
        stack.peek() == valueNode2
        stack.pop()
        stack.peek() == valueNode
        stack.pop()
        stack.peek() == null
        stack.pop()
        stack.peek() == null
    }
}
