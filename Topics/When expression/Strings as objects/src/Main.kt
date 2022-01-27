fun main() {
    val input = readLine()!!

    println(
        when {
            input.isEmpty() -> input
            input.first() == 'i' -> input.slice(1 until input.length).toInt() + 1
            input.first() == 's' -> input.slice(1 until input.length).reversed()
            else -> input
        }
    )
}