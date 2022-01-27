const val JAVA = 1
const val KOTLIN = 2
const val SCALA = 3
const val PYTHON = 4

fun main() {
    val language = readln().toInt()

    println(
        when (language) {
            JAVA, SCALA, PYTHON -> "No!"
            KOTLIN -> "Yes!"
            else -> "Unknown number"
        }
    )
}