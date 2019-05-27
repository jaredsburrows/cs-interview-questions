package koans

// Function literals with receiver
// https://play.kotlinlang.org/koans/Builders/Function%20literals%20with%20receiver/Task.kt
fun task(): List<Boolean> {
    val isEven: Int.() -> Boolean = { this % 2 == 0 }
    val isOdd: Int.() -> Boolean = { this % 2 != 0 }

    return listOf(42.isOdd(), 239.isOdd(), 294823098.isEven())
}

// String and map builders
// https://play.kotlinlang.org/koans/Builders/String%20and%20map%20builders/Task.kt
fun <L, R> buildMap(build: HashMap<L, R>.() -> Unit): Map<L, R> {
    val map = hashMapOf<L, R>()
    map.build()
    return map
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}

// The function apply
// https://play.kotlinlang.org/koans/Builders/The%20function%20apply/Task.kt
fun <T> T.myApply(f: T.() -> Unit): T {
    f()
    return this
}

fun createString(): String {
    return StringBuilder().myApply {
        append("Numbers: ")
        for (i in 1..10) {
            append(i)
        }
    }.toString()
}

fun createMap(): Map<Int, String> {
    return hashMapOf<Int, String>().myApply {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}

