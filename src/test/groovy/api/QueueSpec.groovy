package api

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class QueueSpec extends Specification {

    def queue = new Queue()
    def valueNode = new TreeNode(1)
    def valueNode2 = new TreeNode(2)
    def valueNode3 = new TreeNode(3)
    def blankNode = new TreeNode(0)
    def blankNode2 = new TreeNode(0)

    def "getFirst"() {

        expect:
        queue.getFirst() == null
        queue.enqueue(blankNode)
        queue.getFirst() == blankNode
    }

    def "getFirst - multiple"() {

        expect:
        queue.getFirst() == null
        queue.enqueue(blankNode)
        queue.getFirst() == blankNode
        queue.enqueue(blankNode2)
        queue.getFirst() == blankNode
    }

    def "getLast"() {

        expect:
        queue.getLast() == null
        queue.enqueue(blankNode)
        queue.getLast() == blankNode
    }

    def "getLast - multiple"() {

        expect:
        queue.getLast() == null
        queue.enqueue(blankNode)
        queue.getLast() == blankNode
        queue.enqueue(blankNode2)
        queue.getLast() == blankNode2
    }

    def "enqueue - single"() {

        expect:
        queue.getFirst() == null
        queue.enqueue(null)
        queue.getFirst() == null
        queue.enqueue(blankNode)
        queue.getFirst() == blankNode
    }

    def "enqueue - multiple"() {

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

    def "dequeue"() {

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

    def "dequeue - multiple"() {

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
