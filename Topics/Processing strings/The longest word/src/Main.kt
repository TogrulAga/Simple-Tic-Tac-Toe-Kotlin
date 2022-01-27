fun main() {
    val words = readln().split(" ")
    val maxLength = words.maxOf { it.length }

    println(words.filter { it.length == maxLength }[0])
}