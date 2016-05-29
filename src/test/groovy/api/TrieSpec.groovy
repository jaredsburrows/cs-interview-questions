package api

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class TrieSpec extends Specification {

    def trie = new Trie<>()

    def "setup"() {
        trie.insert("jar")
        trie.insert("red")
        trie.insert("are")
    }

    def "insert/get"() {
        expect:
        !trie.get(null)
        !trie.get("")
        trie.get("jar")
        trie.get("red")
        trie.get("are")
    }

    def "search"() {
        expect:
        !trie.search(null)
        !trie.search("")
        trie.search("jar")
        trie.search("red")
        trie.search("are")
    }

    def "startsWith"() {
        expect:
        !trie.startsWith(null)
        !trie.startsWith("")
        trie.startsWith("ja")
        trie.startsWith("re")
        trie.startsWith("ar")
    }
}
