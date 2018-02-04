package api

import java.lang.reflect.Array.newInstance

class TrieNode<T> {
    companion object {
        private const val ALPHABET_COUNT = 26
    }

    var children: Array<TrieNode<T>>
    var isEnd: Boolean = false

    constructor() : this(ALPHABET_COUNT)

    @Suppress("UNCHECKED_CAST")
    constructor(length: Int) {
        children = newInstance(TrieNode::class.java, length) as Array<TrieNode<T>>
    }
}
