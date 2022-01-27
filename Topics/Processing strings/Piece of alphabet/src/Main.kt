fun main() {
    val string = readln().toCharArray()

    var sorted = true
    for ((index, c) in string.slice(0 until string.size - 1).withIndex()) {
        if (c + 1 != string[index + 1]) {
            sorted = false
            break
        }
    }
    println(sorted)
}