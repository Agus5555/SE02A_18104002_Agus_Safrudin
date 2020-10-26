fun main() {
    val user = setUser("Agus", 20)
    println(user)
    printUser("Agus ")
}
fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"
fun printUser(name: String) {
    println("Your name is $name")
}