package api

import spock.lang.Specification

class QueueSpec extends Specification {

    Queue queue = new Queue()
    TreeNode valueNode = new TreeNode(1)
    TreeNode valueNode2 = new TreeNode(2)
    TreeNode valueNode3 = new TreeNode(3)
    TreeNode blankNode = new TreeNode(0)
    TreeNode blankNode2 = new TreeNode(0)

    def "Test - Queue - getFirst [Correct Values]"() {

        expect:
        queue.getFirst() == null
        queue.enqueue(blankNode)
        queue.getFirst() == blankNode
    }

    def "Test - Queue - getFirst - multiple [Correct Values]"() {

        expect:
        queue.getFirst() == null
        queue.enqueue(blankNode)
        queue.getFirst() == blankNode
        queue.enqueue(blankNode2)
        queue.getFirst() == blankNode
    }

    def "Test - Queue - getLast [Correct Values]"() {

        expect:
        queue.getLast() == null
        queue.enqueue(blankNode)
        queue.getLast() == blankNode
    }

    def "Test - Queue - getLast - multiple [Correct Values]"() {

        expect:
        queue.getLast() == null
        queue.enqueue(blankNode)
        queue.getLast() == blankNode
        queue.enqueue(blankNode2)
        queue.getLast() == blankNode2
    }

    def "Test - Queue - enqueue - single [Correct Values]"() {

        expect:
        queue.getFirst() == null
        queue.enqueue(null)
        queue.getFirst() == null
        queue.enqueue(blankNode)
        queue.getFirst() == blankNode
    }

    def "Test - Queue - enqueue - multiple [Correct Values]"() {

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
