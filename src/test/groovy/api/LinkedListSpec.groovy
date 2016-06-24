package api

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class LinkedListSpec extends Specification {

    def linkedList = new LinkedList<>(0)

    def "addtoFront"() {
        when:
        linkedList.addToEnd(6)
        linkedList.add(5)
        linkedList.addToFront(1)

        then:
        linkedList.getHead().value == 1
        linkedList.next.value == 0
        linkedList.next.next.value == 6
        linkedList.next.next.next.value == 5
    }

    def "addToEnd"() {
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
        def linkedList2 = new LinkedList<>(0) // 1 element

        when:
        linkedList.addToEnd(6) // 2 elements
        linkedList.removeFront()
        linkedList2.removeFront()

        then:
        linkedList.getHead().value == 6
        linkedList2.getHead() == null
    }

    def "removeLast"() {
        when:
        linkedList.addToEnd(6)
        linkedList.add(7)
        linkedList.removeLast()

        then:
        linkedList.getHead().value == 0
        linkedList.next.value == 6
        linkedList.next.next == null
    }

    def "equals/hashcode"() {
        when:
        EqualsVerifier.forClass(LinkedList.class)
                .withPrefabValues(LinkedList.class, new LinkedList<>(1), new LinkedList<>(2))
                .withPrefabValues(Node.class, new Node<>(1), new Node<>(2))
                .suppress(Warning.NONFINAL_FIELDS)
                .verify()

        then:
        noExceptionThrown()
    }

    def "string"() {
        given:
        def actual = linkedList.toString()
        def expected = "LinkedList{mHead=Node{value=0, next=null, previous=null}}"

        expect:
        actual == expected
    }
}
