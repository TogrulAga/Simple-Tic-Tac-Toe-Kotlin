fun main() {
    val (a, b, c, n) = readln().split(" ").map { it.toInt() }
    val nRemainder = n - a - b - c

    var password = mutableListOf<Char>()
    password = addUppercase(password, a)
    password = addLowercase(password, b)
    password = addDigits(password, c)
    password = addRemainder(password, nRemainder)

    println(password.joinToString(separator = ""))
}

fun addUppercase(password: MutableList<Char>, nUppercase: Int): MutableList<Char> {
    val upperCase = ('A'..'Z').toMutableList()
    var a = nUppercase
    while (a != 0) {
        val u = upperCase.random()
        if (password.lastOrNull() != u) {
            password.add(u)
            a--
        } else {
            continue
        }
    }
    return password
}

fun addLowercase(password: MutableList<Char>, nLowercase: Int): MutableList<Char> {
    val lowerCase = ('a'..'z').toMutableList()
    var b = nLowercase
    while (b != 0) {
        val l = lowerCase.random()
        if (password.lastOrNull() != l) {
            password.add(l)
            b--
        } else {
            continue
        }
    }
    return password
}

fun addDigits(password: MutableList<Char>, nDigits: Int): MutableList<Char> {
    val digit = ('0'..'9').toMutableList()
    var c = nDigits
    while (c != 0) {
        val d = digit.random()
        if (password.lastOrNull() != d) {
            password.add(d)
            c--
        } else {
            continue
        }
    }
    return password
}

fun addRemainder(password: MutableList<Char>, n: Int): MutableList<Char> {
    val remainder = "!@#%^&*()_+=".toMutableList()
    var nRemainder = n

    if (nRemainder > 0) {
        while (nRemainder != 0) {
            val r = remainder.random()
            if (password.lastOrNull() != r) {
                password.add(r)
                nRemainder--
            } else {
                continue
            }
        }
    }
    return password
}