package api

data class Node<T>(var value: T? = null) {
    var next: Node<T>? = null
    var previous: Node<T>? = null

    constructor() : this(null)
}
