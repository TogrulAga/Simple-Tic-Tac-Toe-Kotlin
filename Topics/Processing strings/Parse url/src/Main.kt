fun main() {
    val parameters = readln().split("?")[1].split("&")
    var password = ""

    for (parameter in parameters) {
        if (parameter.split("=")[0] == "pass") {
            password = parameter.split("=")[1]
        }

        if (parameter.split("=")[1].isEmpty()) {
            println("${parameter.split("=")[0]} : not found")
            continue
        }

        println("${parameter.split("=")[0]} : ${parameter.split("=")[1]}")
    }

    if (password.isNotEmpty()) {
        println("password : $password")
    }
}