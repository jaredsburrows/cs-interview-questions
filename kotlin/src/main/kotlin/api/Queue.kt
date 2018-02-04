package api

// FIFO - First in first out
data class Queue<T>(private var value: T?) {
    var first: Node<T>? = null
    var last: Node<T>? = null

    init {
        enqueue(Node(value))
    }

    constructor() : this(null)

    fun enqueue(node: Node<T>) {
        if (first == null) {
            first = node
            last = first
        } else {
            last?.next = node
            last = node
        }
    }

    fun dequeue() {
        if (first != null) {
            first = first?.next
        }
    }
}
