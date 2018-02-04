package api

data class LinkedList<T>(val value: T? = null) {
    var head: Node<T>? = null
    var next: Node<T>? = head?.next

    constructor() : this(null)

    fun addToFront(value: T) {
        val node = Node(value)
        node.next = head
        head = node
    }

    fun add(value: T) {
        addToEnd(value)
    }

    fun addToEnd(value: T) {
        var temp = head
        while (temp?.next != null) {
            temp = temp.next
        }
        temp?.next = Node(value)
    }

    fun removeFront() {
        head = head?.next
    }

    fun removeLast() {
        var temp = head
        while (temp?.next?.next != null) {
            temp = temp.next
        }
        temp?.next = null
    }
}
