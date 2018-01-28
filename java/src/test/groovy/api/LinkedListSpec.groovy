package api

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import test.BaseSpec

final class LinkedListSpec extends BaseSpec {
    def sut = new LinkedList<>(0)

    def "addtoFront"() {
        when:
        sut.addToEnd(6)
        sut.add(5)
        sut.addToFront(1)

        then:
        sut.getHead().value == 1
        sut.next.value == 0
        sut.next.next.value == 6
        sut.next.next.next.value == 5
    }

    def "addToEnd"() {
        when:
        sut.addToEnd(1)
        sut.add(2)
        sut.addToEnd(3)

        then:
        sut.getHead().value == 0
        sut.next.value == 1
        sut.next.next.value == 2
        sut.next.next.next.value == 3
    }

    def "removeFront"() {
        given:
        def linkedList2 = new LinkedList<>(0)
        // 1 element

        when:
        sut.addToEnd(6) // 2 elements
        sut.removeFront()
        linkedList2.removeFront()

        then:
        sut.getHead().value == 6
        linkedList2.getHead() == null
    }

    def "removeLast"() {
        when:
        sut.addToEnd(6)
        sut.add(7)
        sut.removeLast()

        then:
        sut.getHead().value == 0
        sut.next.value == 6
        sut.next.next == null
    }

    def "equals/hashCode"() {
        when:
        EqualsVerifier.forClass(LinkedList.class)
            .withPrefabValues(LinkedList.class, new LinkedList<>(1), new LinkedList<>(2))
            .withPrefabValues(Node.class, new Node<>(1), new Node<>(2))
            .suppress(Warning.NONFINAL_FIELDS)
            .verify()

        then:
        noExceptionThrown()
    }
}
