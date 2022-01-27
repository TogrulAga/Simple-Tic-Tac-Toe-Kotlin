fun main() {
    val count = readln().toInt()
    val incomes = MutableList(count) { readln().toDouble() }
    val taxPercentages = MutableList(count) { readln().toDouble() }

    val taxMoneys = mutableListOf<Double>()

    for (i in 0 until count) {
        taxMoneys.add(incomes[i] * taxPercentages[i] / 100)
    }

    println(taxMoneys.indexOf(taxMoneys.maxOrNull()) + 1)
}