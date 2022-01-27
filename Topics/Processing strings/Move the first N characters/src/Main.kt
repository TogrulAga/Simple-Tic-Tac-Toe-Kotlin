fun main() {
    var (string, shiftN) = readln().split(" ").toList()

    if (string.length < shiftN.toInt()) {
        println(string)
    } else {
        println(string.substring(startIndex = shiftN.toInt()) + string.substring(0 until shiftN.toInt()))
    }
}