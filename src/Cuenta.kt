
class Cuenta (
    val numeroCuenta:Int,
    val saldo:Int
)
{
    var saldoTotal:Double = 0.0


    /*
    * Retorna el saldo que haya en la cuenta
    */
    fun consultarSaldo(){
        println("Su saldo es de: $saldo€")

    }


    //No recibe nada de parámetros pero para comentar las funciones indicamos las variables de la clase que hemos usado como parámetros??
    fun recibirAbono(){
        println("De cuanto es el abono? -> ")

       try {
           var abono = readln().toDouble()

           saldoTotal = abono + saldo
           println("El saldo total después de recibir el abono es de $saldoTotal€")
       }catch (e: NumberFormatException){
           println("ERROR, no se puede hacer la conversión.")
       }

    }

    fun realizarPago(){
        println("Cuanto vas a pagar? -> ")

        try {
            var pagar = readln().toDouble()

            if (pagar > saldo){
                throw Exception("**Error, no se puede realizar el pago por no tener saldo suficiente")
            }else{
                saldoTotal = saldo - pagar
                println("Su saldo después de realizar el pago es de $saldoTotal€")
            }
        }catch (e: NumberFormatException){
            println("**ERROR, el numero debe ser correcto")
        }catch (e: Exception){
            println(e.message)
        }


    }


    //Debe contener un método que devuelva si la persona es morosa (si tienen alguna cuenta con saldo negativo). Recibirá como parámetro el objeto Persona y devolverá un booleano.
    /*
    fun comprobacionMoroso(paco:Persona):Boolean{

        //como compruebo el saldo de la cuenta de paco?

    }

     */

    //Debe contener un método que realice una transferencia entre dos cuentas. Recibirá como parámetro dos objetos PersonaB, dos identificacdors de cuentas y la cantidad a transferir. Devolverá un booleano indicando si se ha podido realizar o no la operación.
/*
    fun realizarTransferencia(manuel:Persona, jose:Persona) : Boolean{


    }

 */

}