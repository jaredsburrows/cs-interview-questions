package koans

import java.util.Calendar
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

fun MyDate.toMillis(): Long {
    val c = Calendar.getInstance()
    c.set(year, month, dayOfMonth, 0, 0, 0)
    c.set(Calendar.MILLISECOND, 0)
    return c.timeInMillis
}

fun Long.toDate(): MyDate {
    val c = Calendar.getInstance()
    c.timeInMillis = this
    return MyDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE))
}

// Properties
// https://play.kotlinlang.org/koans/Properties/Properties/Task.kt
class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(value) {
            field = value
            counter++
        }
}

// Lazy property
// https://play.kotlinlang.org/koans/Properties/Lazy%20property/Task.kt
class LazyProperty(val initializer: () -> Int) {
    var value: Int? = null
    val lazy: Int
        get() {
            if (value == null) {
                value = initializer()
            }
            return value!!
        }
}

// Delegates examples
// https://play.kotlinlang.org/koans/Properties/Delegates%20examples/Task.kt
class LazyProperty2(val initializer: () -> Int) {
    val lazyValue: Int by lazy(initializer)
}

// Delegates how it works
// https://play.kotlinlang.org/koans/Properties/Delegates%20how%20it%20works/Task.kt
class D {
    var date: MyDate by EffectiveDate()
}

class EffectiveDate<R> : ReadWriteProperty<R, MyDate> {
    var timeInMillis: Long? = null

    override fun getValue(thisRef: R, property: KProperty<*>): MyDate {
        return timeInMillis!!.toDate()
    }

    override fun setValue(thisRef: R, property: KProperty<*>, value: MyDate) {
        timeInMillis = value.toMillis()
    }
}
