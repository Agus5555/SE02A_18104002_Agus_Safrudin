fun main() {
    val user = setUser("Agus Jems", 21)
    println(user)
    printUser("Agus Jems ")
}
fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"
fun printUser(name: String) {
 	println("Your name is $name")
}
// Agus safrudin