package api

data class TreeNode<T>(var value: T? = null) {
    var left: TreeNode<T>? = null
    var right: TreeNode<T>? = null

    constructor() : this(null)
}
