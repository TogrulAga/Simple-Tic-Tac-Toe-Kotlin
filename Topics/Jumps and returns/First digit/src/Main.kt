fun main() {
    val string = readln()

    for (c in string) {
        if (c in '0'..'9') {
            println(c)
            break
        }
    }
}