package api

@Suppress("SENSELESS_COMPARISON") // TODO
data class Trie<T>(val value: T?)  {
    private val root = TrieNode<T>()

//    constructor() : this(null)
//    constructor(value: T?) {
//        insert(value.toString())
//    }

    fun insert(word: String) {
        var current = root

        val length = word.length

        for (i in 0 until length) {
            val character = word[i]
            val index = character - 'a'

            val child = current.children[index]
            if (child == null) {
                val node = TrieNode<T>()
                current.children[index] = node
                current = node
            } else {
                current = child
            }

            current.isEnd = true
        }
    }

    fun search(word: String): Boolean {
        val current = get(word)
        return current != null && current.isEnd
    }

    fun get(word: String): TrieNode<T>? {
        if (word.isEmpty()) {
            return null
        }

        var current = root

        val length = word.length

        for (i in 0 until length) {
            val character = word[i]
            val index = character - '0'

            val child = current.children[index]
            if (child == null) {
                return null
            } else {
                current = child
            }
        }

        return if (current == root) null else current
    }
}
