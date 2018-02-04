package api

data class GraphNode<T>(var value: T? = null, var neighbors: List<GraphNode<T>>?) {
    var next: GraphNode<T>? = null
    val visited: Boolean = false

    constructor() : this(null)
    constructor(value: T?): this(value, null)
}
