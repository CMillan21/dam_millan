fun main(args: Array<String>){
    print("Ingrese la medida del lado cuadrado: ")
    val lado = readLine()!!.toInt()
    val perimetro = lado * 4
    println("El perimetro del cuadrado es $perimetro")

}