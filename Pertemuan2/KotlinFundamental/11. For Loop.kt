fun main() {
    val ranges1 = 1.rangeTo(10) step 3
    for ((index, value) in ranges1.withIndex()) {
        println("value $value with index $index")
    }
    val ranges2 = 1.rangeTo(10) step 3
    for ((index, value) in ranges2.withIndex()) {
        println("value $value with index $index")
    }
}