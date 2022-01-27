fun main() {
    val string = readln()
    var temp = '-'
    var counter = 0
    for (char in string) {
        if (char == temp || temp == '-') {
            counter++
        } else {
            print(temp.toString() + counter.toString())
            counter = 1
        }
        temp = char
    }
    print(temp.toString() + counter.toString())
}