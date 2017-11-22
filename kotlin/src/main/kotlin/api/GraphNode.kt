package api

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
data class GraphNode<T>(var value: T? = null, var neighbors: List<GraphNode<T>>?) {
    var next: GraphNode<T>? = null
    val visited: Boolean = false

    constructor() : this(null)
    constructor(value: T?): this(value, null)
}
