fun main() {
    val n = readln().toInt()
    val numbers = MutableList(n) { readln().toInt() }
    val shiftN = readln().toInt()

    repeat(shiftN % n) {
        numbers.add(0, numbers.removeAt(numbers.lastIndex))
    }
    println(numbers.joinToString(separator = " "))
}