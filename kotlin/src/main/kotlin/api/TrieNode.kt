package api

class TrieNode<T> {
    companion object {
        private const val ALPHABET_COUNT = 26
    }

    var children: Array<TrieNode<T>>
    var isEnd: Boolean = false

    constructor() : this(ALPHABET_COUNT)

    constructor(capacity: Int) {
        @Suppress("UNCHECKED_CAST")
        children = arrayOfNulls<TrieNode<*>>(capacity) as Array<TrieNode<T>>
    }
}
