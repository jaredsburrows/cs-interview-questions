package api

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class LinkedListSpec extends Specification {

    def "addtoFront"() {
        given:
        def linkedList = new LinkedList<>(0)
        linkedList.addToEnd(6)
        linkedList.add(5)

        when:
        linkedList.addToFront(1)

        then:
        linkedList.getHead().value == 1
        linkedList.next.value == 0
        linkedList.next.next.value == 6
        linkedList.next.next.next.value == 5
    }

    def "addToEnd"() {
        given:
        def linkedList = new LinkedList<>(0)

        when:
        linkedList.addToEnd(1)
        linkedList.add(2)
        linkedList.addToEnd(3)

        then:
        linkedList.getHead().value == 0
        linkedList.next.value == 1
        linkedList.next.next.value == 2
        linkedList.next.next.next.value == 3
    }

    def "removeFront"() {
        given:
        def linkedList = new LinkedList<>(0)
        linkedList.addToEnd(6) // 2 elements
        def linkedList2 = new LinkedList<>(0) // 1 element

        when:
        linkedList.removeFront()
        linkedList2.removeFront()

        then:
        linkedList.getHead().value == 6
        linkedList2.getHead() == null
    }

    def "removeLast"() {
        given:
        def linkedList = new LinkedList<>(0)
        linkedList.addToEnd(6)
        linkedList.add(7)

        when:
        linkedList.removeLast()

        then:
        linkedList.getHead().value == 0
        linkedList.next.value == 6
        linkedList.next.next == null
    }
}
