fun main() {
    val n = readln().toInt()
    val numbers = MutableList(n) { readln().toInt() }

    println(numbers.indexOf(numbers.maxOrNull()))
}