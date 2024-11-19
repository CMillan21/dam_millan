fun main(){
    print("Ingrese el primer numero: ")
    val valor1 = readLine()!!.toInt()

    print("Ingrese el segundo numero: ")
    val valor2 = readLine()!!.toInt()

    print("Ingrese el tercero numero: ")
    val valor3 = readLine()!!.toInt()

    print("Ingrese el cuarto numero: ")
    val valor4 = readLine()!!.toInt()

    val suma = valor1 + valor2
    println("La suma de $valor1 + $valor2 es $suma")

    val producto = valor3 * valor4
    println("El producto de $valor3 * $valor4 es $producto")

}