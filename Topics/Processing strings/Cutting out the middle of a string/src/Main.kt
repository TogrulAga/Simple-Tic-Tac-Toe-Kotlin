fun main() {
    val word = readln().toCharArray().toMutableList()
    if (word.count() % 2 == 0) {
        word.removeAt(word.count() / 2)
        word.removeAt(word.count() / 2)
    } else {
        word.removeAt(word.count() / 2)
    }

    println(word.joinToString(""))
}