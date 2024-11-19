fun main(){

    print("Ingrese el sueldo del empleado: ")
    val sueldo = readLine()!!.toDouble()
    if (sueldo > 3000)
    {
        print("Debe pagar impuestos")
    }
    else
    {
        print("NO paga impuestos")
    }
}