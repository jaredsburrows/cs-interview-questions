package api

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class TrieNodeSpec extends Specification {

    def node = new TrieNode<>()
    def nextNode = new TrieNode<>(123)

    def "default values"() {
        expect:
        node.children.length == 26
        nextNode.children.length == 123
        !node.isEnd
        !nextNode.isEnd
    }

    def "getters/setters"() {
        given:
        def list = [new TrieNode<>(1)]

        when:
        node.children = list
        node.isEnd = true

        then:
        node.children as List == list
        node.isEnd
    }

    def "equals"() {
        when:
        EqualsVerifier.forClass(TrieNode.class)
                .usingGetClass()
                .withPrefabValues(TrieNode.class, new TrieNode<>(1), new TrieNode<>(2))
                .suppress(Warning.NONFINAL_FIELDS)
                .verify()

        then:
        noExceptionThrown()
    }
}
