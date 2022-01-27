fun main() {
    val sentence = readln().lowercase()
    println(sentence.replace("the", "X").indexOf('X'))
}