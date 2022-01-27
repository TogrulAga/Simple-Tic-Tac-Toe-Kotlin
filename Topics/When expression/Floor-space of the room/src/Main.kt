import kotlin.math.pow
import kotlin.math.sqrt

const val PI = 3.14

fun main() {
    val type = readln()

    when (type) {
        "triangle" -> {
            val (a, b, c) = List<Double> (3) { readln().toDouble() }
            val s = (a + b + c) / 2
            println(sqrt(s * (s - a) * (s - b) * (s - c)))
        }
        "rectangle" -> {
            val (a, b) = List<Double> (2) { readln().toDouble() }
            println(a * b)
        }
        "circle" -> {
            val r = readln().toDouble()
            println(PI * r.pow(2))
        }
    }
}