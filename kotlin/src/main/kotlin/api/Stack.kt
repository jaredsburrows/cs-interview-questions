package api

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
data class Stack<T>(private var value: T?) {
    var peek: Node<T>? = null

    constructor() : this(null)

    fun push(node: Node<T>?) {
        if (node != null) {
            node.next = peek
            peek = node
        }
    }

    fun pop() {
        if (peek != null) {
            peek = peek?.next
        }
    }
}
