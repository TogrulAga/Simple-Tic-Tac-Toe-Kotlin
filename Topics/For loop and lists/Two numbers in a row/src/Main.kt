fun main() {
    val n = readln().toInt()
    val numbers = MutableList(n) { readln().toInt() }
    val (p, m) = readln().split(" ").map { it.toInt() }.toMutableList()

    for (i in 0 until numbers.lastIndex) {
        if (numbers[i] == p && numbers[i + 1] == m) {
            println("NO")
            return
        } else if (numbers[i] == m && numbers[i + 1] == p) {
            println("NO")
            return
        }
    }

    println("YES")
}