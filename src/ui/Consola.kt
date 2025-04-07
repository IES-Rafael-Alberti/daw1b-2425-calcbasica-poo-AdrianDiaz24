package ui

import model.Operador

class Consola(var operador: Operador = Operador.SUMAR): IEntradaSalida {

    fun ejecutarPrograma(){
        var salida = false
        while (!salida){
            mostrarMensaje("Introduce el primer número")
            val num1 = pedirDouble()
            mostrarMensaje("Introduce el operador (+, -, *, /) -> Default +")
            operador = operador.getOperador(pedirString())
            mostrarMensaje("Introduce el segundo número")
            val num2 = pedirDouble()
            when (operador) {
                Operador.SUMAR -> mostrarMensaje("$num1 + $num2 = ${num1+num2}")
                Operador.RESTAR -> mostrarMensaje("$num1 - $num2 = ${num1-num2}")
                Operador.DIVIDIR -> mostrarMensaje("$num1/$num2 = ${num1/num2}")
                Operador.MULTIPLICAR -> mostrarMensaje("$num1 * $num2 = ${num1*num2}")
            }
            salida = preguntarSalida()
        }
    }

}