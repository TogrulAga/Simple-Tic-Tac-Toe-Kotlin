fun main() {
    val word = readln()

    ('a'..'z').map { if (it !in word) print(it) }
}