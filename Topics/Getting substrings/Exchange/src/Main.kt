fun main() {
    var string = readln()
    val first = string.first()
    string = string.replaceFirst(string.first(), string.last())
    string = string.substring(0, string.length - 1) + first
    println(string)
}