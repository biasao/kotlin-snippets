fun containsEven(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0 }

fun main() {
    println(containsEven(listOf(1,5,3)))
}