fun main() {
    val word = readln()
    val vowels = "aeouiy"

    var vowelN = 0
    var consonantN = 0
    var charNeededN = 0

    for (i in word) {
        if (i in vowels) {
            vowelN++
            consonantN = 0
        } else {
            consonantN++
            vowelN = 0
        }

        if (vowelN == 3) {
            charNeededN++
            vowelN = 1
        } else if (consonantN == 3) {
            charNeededN++
            consonantN = 1
        }
    }
    println(charNeededN)
}