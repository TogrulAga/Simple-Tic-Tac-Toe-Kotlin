fun main() {
    val number = readln().toInt()

    println(
        when (number) {
            in 0..9 -> 1
            in 10..99 -> 2
            in 100..999 -> 3
            in 1000..9999 -> 4
            else -> "too big"

        }
    )
}