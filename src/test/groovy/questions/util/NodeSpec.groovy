package questions.util

import spock.lang.Specification

class NodeSpec extends Specification {

    def "Test - Node [Correct Values]"() {
        Object value = new Object()
        Node valueNode = new Node(value)
        Node blankNode = new Node()
        blankNode.next = valueNode

        expect:
        valueNode != value
        valueNode.val == value
        valueNode.next == null
        blankNode != null
        blankNode.val == null
        blankNode.next == valueNode
        blankNode.next.val == value
        blankNode.next.next == null
    }
}
