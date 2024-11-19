fun main() {
    val t = readLine()!!.toInt() // Número de casos de prueba
    for (case in 1..t) {
        val (n, m) = readLine()!!.split(" ").map { it.toInt() }
        var sumOfDigits = 0

        for (num in n..m) {
            sumOfDigits += num.toString().sumOf { it - '0' }
        }

        println("Case #$case = $sumOfDigits")
    }
}