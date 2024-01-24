/*
Crear también una clase Persona, que se caracteriza por un DNI y una lista de cuentas bancarias.

La Persona puede tener asociada hasta 3 cuentas bancarias, y debe tener un método que permita añadir cuentas (hasta 3 el máximo permitido). Las cuentas se almacenarán en un array/vector. No usar una lista.
* */

class Persona(
    val dni:String,
    val cuentaBancaria:Int
)
{

    fun añadirCuentas(): IntArray{
        var arrayCuentas = IntArray(3)
        var pinguino = true

        while (pinguino){
            print("Quieres añadir una cuenta? (s/n)-> ")
            val respuesta = readln()
            if (respuesta != "s" && respuesta != "si"){
                println("saliendo...")
                pinguino = false
            }else{
                print("Introduzca un numero de cuenta")
                try {
                    val numcuenta = readln().toInt()

                    //No se como añadir de manera automatica que no se guarde siempre en el primer valor, y cuando hago print del array me sale como un identificador
                    arrayCuentas[0] = numcuenta
                    println(arrayCuentas)
                    //CONTROLAR QUE NO TENGA MAS DE 3 CUENTAS
                }catch (e: NumberFormatException){
                    println("ERROR no se pudo hacer la conversión")
                }
            }
        }
        return arrayCuentas

    }







}

// arrayCuentas = [123123123, 123123123, 123123123]