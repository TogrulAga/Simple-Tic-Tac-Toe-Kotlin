fun main() {
    val (n1, op, n2) = readln().split(" ")

    println(
        when (op) {
            "+" -> n1.toLong() + n2.toLong()
            "-" -> n1.toLong() - n2.toLong()
            "/" -> if (n2 == "0") "Division by 0!" else n1.toLong() / n2.toLong()
            "*" -> n1.toLong() * n2.toLong()
            else -> "Unknown operator"
        }
    )
}