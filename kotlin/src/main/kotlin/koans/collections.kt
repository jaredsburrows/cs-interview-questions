package koans

data class Shop(val name: String, val customers: List<Customer>)

data class Customer(val name: String, val city: City, val orders: List<Order>) {
    override fun toString(): String = "$name from ${city.name}"
}

data class Order(val products: List<Product>, val isDelivered: Boolean)

data class Product(val name: String, val price: Double) {
    override fun toString(): String = "'$name' or $price"
}

data class City(val name: String) {
    override fun toString(): String = name
}

// Introduction
// https://play.kotlinlang.org/koans/Collections/Introduction/Task.kt
fun Shop.getSetOfCustomers(): Set<Customer> = customers.toSet()

// Filter map
// https://play.kotlinlang.org/koans/Collections/Filter%20map/Task.kt
fun Shop.getCitiesCustomersAreFrom(): Set<City> = customers.map { it.city }.toSet()

fun Shop.getCustomersFrom(city: City): List<Customer> = customers.filter { it.city == city }

// All Any and other predicates
// https://play.kotlinlang.org/koans/Collections/All%20Any%20and%20other%20predicates/Task.kt
fun Shop.checkAllCustomersAreFrom(city: City): Boolean = customers.all { it.city == city }

fun Shop.hasCustomerFrom(city: City): Boolean = customers.any { it.city == city }

fun Shop.countCustomersFrom(city: City): Int = customers.count { it.city == city }

fun Shop.findAnyCustomerFrom(city: City): Customer? = customers.find { it.city == city }

// FlatMap
// https://play.kotlinlang.org/koans/Collections/FlatMap/Task.kt
val Customer.orderedProducts: Set<Product>
    get() = orders.flatMap { it.products }.toSet()

val Shop.allOrderedProducts: Set<Product>
    get() = customers.flatMap { it.orders }.flatMap { it.products }.toSet()

// Max min
// https://play.kotlinlang.org/koans/Collections/Max%20min/Task.kt
fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? = customers.maxByOrNull { it.orders.size }

fun Customer.getMostExpensiveOrderedProduct(): Product? = orders.flatMap { it.products }.maxByOrNull {
    it.price
}

// Sort
// https://play.kotlinlang.org/koans/Collections/Sort/Task.kt
fun Shop.getCustomersSortedByNumberOfOrders(): List<Customer> = customers.sortedBy {
    it.orders.size
}

// Sum
// https://play.kotlinlang.org/koans/Collections/Sum/Task.kt
fun Customer.getTotalOrderPrice(): Double = orders.flatMap { it.products }.sumOf { it.price }

// GroupBy
// https://play.kotlinlang.org/koans/Collections/GroupBy/Task.kt
fun Shop.groupCustomersByCity(): Map<City, List<Customer>> = customers.groupBy { it.city }

// Partition
// https://play.kotlinlang.org/koans/Collections/Partition/Task.kt
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> =
    customers.filter { customer ->
        val (delivered, undelivered) = customer.orders.partition { order -> order.isDelivered }
        delivered.size < undelivered.size
    }.toSet()

// Fold
// https://play.kotlinlang.org/koans/Collections/Fold/Task.kt
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    val productSet = customers.flatMap { it.orders.flatMap { order -> order.products } }.toSet()
    return customers.fold(productSet) { order, customer ->
        order.intersect(customer.orders.flatMap { it.products }.toSet())
    }
}

// Compound Tasks
// https://play.kotlinlang.org/koans/Collections/Compound%20tasks/Task.kt
fun Customer.getMostExpensiveDeliveredProduct(): Product? = orders
    .filter { it.isDelivered }
    .flatMap { it.products }
    .maxByOrNull { it.price }

fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int = customers
    .flatMap { it.orders }.flatMap { it.products }.count { it == product }

// Get used to new style
// https://play.kotlinlang.org/koans/Collections/Get%20used%20to%20new%20style/Task.kt
fun doSomethingStrangeWithCollection(collection: Collection<String>): Collection<String>? {
    val groupsByLength = collection.groupBy { s -> s.length }
    val maximumSizeOfGroup = groupsByLength.values.map { group -> group.size }.maxOrNull()
    return groupsByLength.values.firstOrNull { group -> group.size == maximumSizeOfGroup }
}

