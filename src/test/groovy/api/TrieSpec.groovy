package api

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class TrieSpec extends BaseSpec {

    def sut = new Trie<>()

    def "setup"() {
        sut.insert("jar")
        sut.insert("red")
        sut.insert("are")
    }

    def "insert/get"() {
        when:
        sut.insert(null)
        sut.insert("")
        sut.insert("z")

        then:
        !sut.get(null)
        !sut.get("")
        sut.get("z")
        sut.get("jar")
        sut.get("red")
        sut.get("are")
    }

    def "search"() {
        expect:
        !sut.search(null)
        !sut.search("")
        sut.search("jar")
        sut.search("red")
        sut.search("are")
    }

    def "startsWith"() {
        expect:
        !sut.startsWith(null)
        !sut.startsWith("")
        sut.startsWith("ja")
        sut.startsWith("re")
        sut.startsWith("ar")
    }

    def "test equals/hashCode"() {
        when:
        EqualsVerifier.forClass(Trie.class)
                .withPrefabValues(Trie.class, new Trie<>(), new Trie<>("test"))
                .withPrefabValues(TrieNode.class, new TrieNode<>(), new TrieNode<>(1))
                .suppress(Warning.NONFINAL_FIELDS)
                .verify()

        then:
        noExceptionThrown()
    }

    def "test toString"() {
        given:
        def actual = sut.toString()
        def expected = "Trie{mRoot=TrieNode{children=[TrieNode{children=[null, null, null, null, null, null, null, " +
                "null, null, null, null, null, null, null, null, null, null, TrieNode{children=[null, null, null, " +
                "null, TrieNode{children=[null, null, null, null, null, null, null, null, null, null, null, null, " +
                "null, null, null, null, null, null, null, null, null, null, null, null, null, null], isEnd=true}, " +
                "null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, " +
                "null, null, null, null, null], isEnd=false}, null, null, null, null, null, null, null, null], " +
                "isEnd=false}, null, null, null, null, null, null, null, null, " +
                "TrieNode{children=[TrieNode{children=[null, null, null, null, null, null, null, null, null, null," +
                " null, null, null, null, null, null, null, TrieNode{children=[null, null, null, null, null, null," +
                " null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null," +
                " null, null, null, null], isEnd=true}, null, null, null, null, null, null, null, null]," +
                " isEnd=false}, null, null, null, null, null, null, null, null, null, null, null, null, null, null," +
                " null, null, null, null, null, null, null, null, null, null, null], isEnd=false}, null, null, null," +
                " null, null, null, null, TrieNode{children=[null, null, null, null, TrieNode{children=[null, null," +
                " null, TrieNode{children=[null, null, null, null, null, null, null, null, null, null, null, null," +
                " null, null, null, null, null, null, null, null, null, null, null, null, null, null], isEnd=true}," +
                " null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null," +
                " null, null, null, null, null, null], isEnd=false}, null, null, null, null, null, null, null, null," +
                " null, null, null, null, null, null, null, null, null, null, null, null, null], isEnd=false}, null," +
                " null, null, null, null, null, null, null], isEnd=false}}"

        expect:
        actual == expected
    }
}
