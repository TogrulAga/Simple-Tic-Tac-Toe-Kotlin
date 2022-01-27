fun main() {
    val string = readln().toMutableList()

    println(string.filter { it in string }.groupingBy { it }.eachCount().count { it.value == 1 })
}