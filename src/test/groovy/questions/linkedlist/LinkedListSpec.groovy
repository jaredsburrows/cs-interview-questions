package questions.linkedlist

import spock.lang.Specification

class LinkedListSpec extends Specification {

    def "addtoFront"() {
        given:
        LinkedList<Integer> linkedList = new LinkedList(0)
        linkedList.addToEnd(6)
        linkedList.addToEnd(5)

        when:
        linkedList.addtoFront(1)

        then:
        linkedList.getHead().getValue() == 1
        linkedList.getNext().getValue() == 0
        linkedList.getNext().getNext().getValue() == 6
        linkedList.getNext().getNext().getNext().getValue() == 5
    }

    def "addToEnd"() {
        given:
        LinkedList<Integer> linkedList = new LinkedList(0)

        when:
        linkedList.addToEnd(1)
        linkedList.addToEnd(2)
        linkedList.addToEnd(3)

        then:
        linkedList.getHead().getValue() == 0
        linkedList.getNext().getValue() == 1
        linkedList.getNext().getNext().getValue() == 2
        linkedList.getNext().getNext().getNext().getValue() == 3
    }

    def "removeFront"() {
        given:
        LinkedList<Integer> linkedList = new LinkedList(0)
        linkedList.addToEnd(6) // 2 elements
        LinkedList<Integer> linkedList2 = new LinkedList(0) // 1 element

        when:
        linkedList.removeFront()
        linkedList2.removeFront()

        then:
        linkedList.getHead().getValue() == 6
        linkedList2.getHead() == null
    }
}
