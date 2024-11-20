fun main() {
    print("Ingresa el número de casos de prueba: ")
    val t = readLine()!!.toInt() // Número de casos de prueba

    for (case in 1..t) {
        print("\nIntroduce el valor de N para el caso n° #$case: ")
        val n = readLine()!!.toInt() // Leer el valor de N
        print("Introduce el valor de M para el caso n° #$case: ")
        val m = readLine()!!.toInt() // Leer el valor de M

        if (n > m || n < 1 || m > 1_000_000) {
            println("Error: N debe ser <= M y ambos en el rango [1, 1_000_000]")
            continue
        }

        var suma = 0
        for (num in n..m) {
            suma += num.toString().sumOf { it - '0' }
        }

        println("Case #$case = $suma")
    }
}
