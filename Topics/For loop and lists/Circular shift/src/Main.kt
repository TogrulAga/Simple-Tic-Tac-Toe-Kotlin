fun main() {
    val n = readln().toInt()
    val numbers = MutableList(n) { readln().toInt() }
    numbers.add(0, numbers.removeAt(numbers.lastIndex))
    println(numbers.joinToString(separator = " "))
}