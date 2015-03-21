package questions

import questions.util.Node
import spock.lang.Specification

class StackSpec extends Specification {

    Stack stack = new Stack()

    def "Test - Stack - peek [Correct Values]"() {
        Node blankNode = new Node()

        expect:
        stack.peek() == null
        stack.push(blankNode)
        stack.peek() == blankNode
    }

    def "Test - Stack - peek - multiple [Correct Values]"() {
        Node blankNode = new Node()
        Node blankNode2 = new Node()

        expect:
        stack.peek() == null
        stack.push(blankNode)
        stack.peek() == blankNode
        stack.push(blankNode2)
        stack.peek() == blankNode2
    }

    def "Test - Stack - push - single [Correct Values]"() {
        Node blankNode = new Node()

        expect:
        stack.peek() == null
        stack.push(null)
        stack.peek() == null
        stack.push(blankNode)
        stack.peek() == blankNode
    }

    def "Test - Stack - push - multiple [Correct Values]"() {
        Node valueNode = new Node(new Object())
        Node valueNode2 = new Node(new Object())
        Node valueNode3 = new Node(new Object())

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

    def "Test - Stack - pop [Correct Values]"() {
        Node blankNode = new Node()

        expect:
        stack.peek() == null
        stack.push(null)
        stack.peek() == null
        stack.push(blankNode)
        stack.peek() == blankNode
        stack.pop()
        stack.peek() == null
    }

    def "Test - Stack - pop - multiple [Correct Values]"() {
        Node valueNode = new Node(new Object())
        Node valueNode2 = new Node(new Object())
        Node valueNode3 = new Node(new Object())

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
