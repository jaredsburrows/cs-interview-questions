package api

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class StackSpec extends BaseSpec {

    def sut = new Stack<>()
    def valueNode = new Node<>(1)
    def valueNode2 = new Node<>(2)
    def valueNode3 = new Node<>(3)
    def blankNode = new Node<>(0)
    def blankNode2 = new Node<>(0)

    def "test peek"() {
        expect:
        !sut.peek()
        sut.push(blankNode)
        sut.peek() == blankNode
    }

    def "test peek - multiple"() {
        expect:
        !sut.peek()
        sut.push(blankNode)
        sut.peek() == blankNode
        sut.push(blankNode2)
        sut.peek() == blankNode2
    }

    def "test push - single"() {
        def blankNode = new Node<>(0)

        expect:
        !sut.peek()
        sut.push(null)
        !sut.peek()
        sut.push(blankNode)
        sut.peek() == blankNode
    }

    def "test push - multiple"() {
        expect:
        !sut.peek()
        sut.push(null)
        !sut.peek()
        sut.push(valueNode)
        sut.peek() == valueNode
        sut.push(valueNode2)
        sut.peek() == valueNode2
        sut.push(valueNode3)
        sut.peek() == valueNode3
    }

    def "test pop"() {
        expect:
        !sut.peek()
        sut.push(null)
        !sut.peek()
        sut.push(blankNode)
        sut.peek() == blankNode
        sut.pop()
        !sut.peek()
    }

    def "test pop - multiple"() {
        expect:
        !sut.peek()
        sut.push(null)
        !sut.peek()
        sut.push(valueNode)
        sut.peek() == valueNode
        sut.push(valueNode2)
        sut.peek() == valueNode2
        sut.push(valueNode3)
        sut.peek() == valueNode3
        sut.pop()
        sut.peek() == valueNode2
        sut.pop()
        sut.peek() == valueNode
        sut.pop()
        !sut.peek()
        sut.pop()
        !sut.peek()
    }

    def "test equals/hashCode"() {
        when:
        EqualsVerifier.forClass(Stack.class)
                .withPrefabValues(Stack.class, new Stack<>(), new Stack<>(1))
                .withPrefabValues(Node.class, new Node<>(), new Node<>(1))
                .suppress(Warning.NONFINAL_FIELDS)
                .verify()

        then:
        noExceptionThrown()
    }

    def "test toString"() {
        given:
        def actual = sut.toString()
        def expected = "Stack{top=null}"

        expect:
        actual == expected
    }
}
