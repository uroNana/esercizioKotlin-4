fun main() {
    val listInt = listOf(1, 2, 3, 4, 5)
    listInt.map { it -> it.toString() }.forEach{ it-> println("listInt as String $it") }
}