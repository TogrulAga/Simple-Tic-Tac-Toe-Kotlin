fun main() {
    val (x11, y11) = readln().split(" ").map(String::toInt)
    val (x21, y21) = readln().split(" ").map(String::toInt)
    val (x31, y31) = readln().split(" ").map(String::toInt)

    val columns = mutableListOf<Int>()
    val rows = mutableListOf<Int>()

    (1..5).map { if (it != x11 && it != x21 && it != x31) rows.add(it) }
    (1..5).map { if (it != y11 && it != y21 && it != y31) columns.add(it) }

    println("${rows.joinToString(" ")}\n${columns.joinToString(" ")}")
}