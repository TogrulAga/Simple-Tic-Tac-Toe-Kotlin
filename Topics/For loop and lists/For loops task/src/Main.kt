fun main() {
    val size = readln().toInt()
    val numbers = MutableList(size) { readln().toInt() }
    val (p, m) = readln().split(" ").map { it.toInt() }.toMutableList()

    if (p in numbers && m in numbers) {
        println("YES")
    } else {
        println("NO")
    }
}