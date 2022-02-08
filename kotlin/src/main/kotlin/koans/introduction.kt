package koans

import java.util.Collections
import java.util.Comparator
import java.util.Locale

// Hello, world!
// https://play.kotlinlang.org/koans/Introduction/Hello,%20world!/Task.kt
fun start(): String = "OK"


// Named arguments
// https://play.kotlinlang.org/koans/Introduction/Named%20arguments/Task.kt
fun joinOptions(options: Collection<String>) = options.joinToString(
    separator = ", ",
    prefix = "[",
    postfix = "]"
)

// Default arguments
// https://play.kotlinlang.org/koans/Introduction/Default%20arguments/Task.kt
fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) =
    (if (toUpperCase) name.uppercase(Locale.getDefault()) else name) + number

fun useFoo() = listOf(
    foo("a"),
    foo("b", number = 1),
    foo("c", toUpperCase = true),
    foo(name = "d", number = 2, toUpperCase = true)
)

// Lambdas
// https://play.kotlinlang.org/koans/Introduction/Lambdas/Task.kt
fun containsEven(collection: Collection<Int>): Boolean = collection.any {
    it % 2 == 0
}

// Strings
// https://play.kotlinlang.org/koans/Introduction/Strings/Task.kt
val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern() = """\d{2} $month \d{4}"""

// Data classes
// https://play.kotlinlang.org/koans/Introduction/Data%20classes/Task.kt
data class Person(val name: String, val age: Int)

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}

// Nullable types
// https://play.kotlinlang.org/koans/Introduction/Nullable%20types/Task.kt
fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    if (client == null || message == null) return
    val personalInfo: PersonalInfo = client.personalInfo ?: return
    val email: String = personalInfo.email ?: return

    mailer.sendMessage(email, message)
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}

// Smart casts
// https://play.kotlinlang.org/koans/Introduction/Smart%20casts/Task.kt
fun eval(expr: Expr): Int =
    when (expr) {
        is Num -> expr.value
        is Sum -> expr.let { eval(it.left) + eval(it.right) }
        else -> throw IllegalArgumentException("Unknown expression")
    }


// Extension functions
// https://play.kotlinlang.org/koans/Introduction/Extension%20functions/Task.kt
interface Expr

class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun Int.r(): RationalNumber = RationalNumber(this, 1)
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(first, second)

data class RationalNumber(val numerator: Int, val denominator: Int)

// Object expressions
// https://play.kotlinlang.org/koans/Introduction/Object%20expressions/Task.kt

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, Comparator<Int> { left, right ->
        compareValues(left, right)
    }.reversed())
    return arrayList
}

// SAM conversions
// https://play.kotlinlang.org/koans/Introduction/SAM%20conversions/Task.kt

fun getList2(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    arrayList.sortWith(Comparator { x, y -> y - x })
    return arrayList
}

// Extensions on collections
// https://play.kotlinlang.org/koans/Introduction/Extensions%20on%20collections/Task.kt
fun getList3(): List<Int> {
    return arrayListOf(1, 5, 2).sortedDescending()
}

fun ArrayList<Int>.sortedDescending(): List<Int> {
    this.sortWith(Comparator { x, y -> y - x })
    return this
}
