fun main() {
    val sequence = readln().lowercase()
    val gcCount = sequence.count { it == 'g' || it == 'c' }
    val length = sequence.count()

    println(gcCount.toDouble() / length * 100)
}