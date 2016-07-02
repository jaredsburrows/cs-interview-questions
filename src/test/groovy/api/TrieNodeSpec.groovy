package api

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class TrieNodeSpec extends BaseSpec {

    def sut = new TrieNode<>()
    def nextNode = new TrieNode<>(123)

    def "default values"() {
        expect:
        sut.children.length == 26
        nextNode.children.length == 123
        !sut.isEnd
        !nextNode.isEnd
    }

    def "getters/setters"() {
        given:
        def list = [new TrieNode<>(1)]

        when:
        sut.children = list
        sut.isEnd = true

        then:
        sut.children as List == list
        sut.isEnd
    }

    def "equals/hashcode"() {
        when:
        EqualsVerifier.forClass(TrieNode.class)
                .withPrefabValues(TrieNode.class, new TrieNode<>(), new TrieNode<>(1))
                .suppress(Warning.NONFINAL_FIELDS)
                .verify()

        then:
        noExceptionThrown()
    }

    def "test toString"() {
        given:
        def actual = sut.toString()
        def expected = "TrieNode{children=[null, null, null, null, null, null, null, null, null, null, null, null, " +
                "null, null, null, null, null, null, null, null, null, null, null, null, null, null], isEnd=false}"

        expect:
        actual == expected
    }
}
