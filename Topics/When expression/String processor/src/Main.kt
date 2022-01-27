fun main() {
    val (s1, operator, s2) = List(3) { readln() }

    println(
        when (operator) {
            "equals" -> s1 == s2
            "plus" -> s1 + s2
            "endsWith" -> s1.endsWith(s2)
            else -> "Unknown operation"
        }
    )
}