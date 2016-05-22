package questions.linkedlist

import api.Node
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class MergeTwoSortedLinkedListsSpec extends Specification {

    def "constructor"() {
        expect:
        new MergeTwoSortedLinkedLists() != null
    }

    def "merge"() {
        given:
        def left = new Node<>(0)
        left.next = new Node<>(2)
        left.next.next = new Node<>(4)

        def right = new Node<>(1)
        right.next = new Node<>(3)
        right.next.next = new Node<>(5)

        when:
        def answer = MergeTwoSortedLinkedLists.merge(left, right)

        then:
        answer.value == 0
        answer.next.value == 1
        answer.next.next.value == 2
        answer.next.next.next.value == 3
        answer.next.next.next.next.value == 4
        answer.next.next.next.next.next.value == 5
    }
}
