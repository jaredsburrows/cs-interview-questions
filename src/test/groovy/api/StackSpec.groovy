package api

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class StackSpec extends Specification {

    def stack = new Stack<>()
    def valueNode = new Node<>(1)
    def valueNode2 = new Node<>(2)
    def valueNode3 = new Node<>(3)
    def blankNode = new Node<>(0)
    def blankNode2 = new Node<>(0)

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
        def blankNode = new Node<>(0)

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
