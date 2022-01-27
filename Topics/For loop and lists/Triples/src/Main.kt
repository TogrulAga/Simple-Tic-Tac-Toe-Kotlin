fun main() {
    val size = readln().toInt()
    val numbers = MutableList(size) { readln().toInt() }
    var nTriplets = 0

    for (i in 0..size - 3) {
        if (numbers[i] + 1 == numbers[i + 1] && numbers[i + 1] + 1 == numbers[i + 2]) {
            nTriplets++
        }
    }

    println(nTriplets)
}