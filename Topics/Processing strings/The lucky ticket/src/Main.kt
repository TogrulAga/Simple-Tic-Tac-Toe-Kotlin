fun main() {
    val ticket = readln().toCharArray()

    val sum1 = ticket[0].code + ticket[1].code + ticket[2].code
    val sum2 = ticket[ticket.lastIndex].code + ticket[ticket.lastIndex - 1].code + ticket[ticket.lastIndex - 2].code

    println(if (sum1 == sum2) "Lucky" else "Regular")
}