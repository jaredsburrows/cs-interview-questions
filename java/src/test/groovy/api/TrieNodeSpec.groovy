package api

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import spock.lang.Specification

final class TrieNodeSpec extends Specification {
    def sut = new TrieNode<>()
    def nextNode = new TrieNode<>(123)

    def 'default values'() {
        expect:
        sut.children.length == 26
        nextNode.children.length == 123
        !sut.isEnd
        !nextNode.isEnd
    }

    def 'getters/setters'() {
        given:
        def list = [new TrieNode<>(1)]

        when:
        sut.children = list
        sut.isEnd = true

        then:
        sut.children as List == list
        sut.isEnd
    }

    def 'equals/hashCode'() {
        when:
        EqualsVerifier.forClass(TrieNode.class)
            .withPrefabValues(TrieNode.class, new TrieNode<>(), new TrieNode<>(1))
            .suppress(Warning.NONFINAL_FIELDS)
            .verify()

        then:
        noExceptionThrown()
    }
}
