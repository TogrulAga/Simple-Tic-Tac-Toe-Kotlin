const val SQUARE = 1
const val CIRCLE = 2
const val TRIANGLE = 3
const val RHOMBUS = 4

fun main(args: Array<String>) {
    val shape = readln().toInt()

    println(
        when (shape) {
            SQUARE -> "You have chosen a square"
            CIRCLE -> "You have chosen a circle"
            TRIANGLE -> "You have chosen a triangle"
            RHOMBUS -> "You have chosen a rhombus"
            else -> "There is no such shape!"
        }
    )
}