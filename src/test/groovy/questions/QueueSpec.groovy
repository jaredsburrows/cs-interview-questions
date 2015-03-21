package questions

import questions.util.Node
import spock.lang.Specification

class QueueSpec extends Specification {

    Queue queue = new Queue()

    def "Test - Queue - getFirst [Correct Values]"() {
        Node blankNode = new Node()

        expect:
        queue.getFirst() == null
        queue.enqueue(blankNode)
        queue.getFirst() == blankNode
    }

    def "Test - Queue - getFirst - multiple [Correct Values]"() {
        Node blankNode = new Node()
        Node blankNode2 = new Node()

        expect:
        queue.getFirst() == null
        queue.enqueue(blankNode)
        queue.getFirst() == blankNode
        queue.enqueue(blankNode2)
        queue.getFirst() == blankNode
    }

    def "Test - Queue - getLast [Correct Values]"() {
        Node blankNode = new Node()

        expect:
        queue.getLast() == null
        queue.enqueue(blankNode)
        queue.getLast() == blankNode
    }

    def "Test - Queue - getLast - multiple [Correct Values]"() {
        Node blankNode = new Node()
        Node blankNode2 = new Node()

        expect:
        queue.getLast() == null
        queue.enqueue(blankNode)
        queue.getLast() == blankNode
        queue.enqueue(blankNode2)
        queue.getLast() == blankNode2
    }

    def "Test - Queue - enqueue - single [Correct Values]"() {
        Node blankNode = new Node()

        expect:
        queue.getFirst() == null
        queue.enqueue(null)
        queue.getFirst() == null
        queue.enqueue(blankNode)
        queue.getFirst() == blankNode
    }

    def "Test - Queue - enqueue - multiple [Correct Values]"() {
        Node valueNode = new Node(new Object())
        Node valueNode2 = new Node(new Object())
        Node valueNode3 = new Node(new Object())

        expect:
        queue.getFirst() == null
        queue.enqueue(null)
        queue.getFirst() == null
        queue.getLast() == null
        queue.enqueue(valueNode)
        queue.getFirst() == valueNode
        queue.getLast() == valueNode
        queue.enqueue(valueNode2)
        queue.getFirst() == valueNode
        queue.getLast() == valueNode2
        queue.enqueue(valueNode3)
        queue.getFirst() == valueNode
        queue.getLast() == valueNode3
    }

    def "Test - Queue - dequeue [Correct Values]"() {
        Node blankNode = new Node()

        expect:
        queue.getFirst() == null
        queue.enqueue(null)
        queue.getFirst() == null
        queue.getLast() == null
        queue.enqueue(blankNode)
        queue.getFirst() == blankNode
        queue.getLast() == blankNode
        queue.dequeue()
        queue.getFirst() == null
    }

    def "Test - Queue - dequeue - multiple [Correct Values]"() {
        Node valueNode = new Node(new Object())
        Node valueNode2 = new Node(new Object())
        Node valueNode3 = new Node(new Object())

        expect:
        queue.getFirst() == null
        queue.enqueue(null)
        queue.getFirst() == null
        queue.getLast() == null
        queue.enqueue(valueNode)
        queue.getFirst() == valueNode
        queue.getLast() == valueNode
        queue.enqueue(valueNode2)
        queue.getFirst() == valueNode
        queue.getLast() == valueNode2
        queue.enqueue(valueNode3)
        queue.getFirst() == valueNode
        queue.getLast() == valueNode3
        queue.dequeue()
        queue.getFirst() == valueNode2
        queue.dequeue()
        queue.getFirst() == valueNode3
        queue.dequeue()
        queue.getFirst() == null
        queue.dequeue()
        queue.getFirst() == null
    }
}
