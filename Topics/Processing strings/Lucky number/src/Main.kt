fun main() {
    val number = readln().toCharArray().map { it.code }.toMutableList()

    println(
        if (number.slice(0 until number.count() / 2).sum()
            == number.slice(number.count() / 2 until number.count()).sum()
        ) {
            "YES"
        } else {
            "NO"
        }
    )
}