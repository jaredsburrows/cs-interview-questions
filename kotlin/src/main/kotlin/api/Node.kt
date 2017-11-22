package api

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
data class Node<T>(var value: T? = null) {
    var next: Node<T>? = null
    var previous: Node<T>? = null

    constructor() : this(null)
}
