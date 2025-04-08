package ui

import java.util.InputMismatchException
import java.util.Scanner


class Consola: IConsola {

    val scanner = Scanner(System.`in`)

    override fun mostrar(msg: String) {
        println(msg)
    }

    override fun mostrarError(msg: String) {
        println("Error - " + msg)
    }

    override fun pedirDouble(): Double {
        mostrar("Introduce un numero: ")
        val num = scanner.nextDouble()
        return num
    }

    override fun pedirOperador(): Char {
        mostrar("Introduce un operador ( + , - , * , / ): ")
        val operador = scanner.next()[0]
        return operador
    }

    override fun hacerOperacion(num1: Double, num2: Double, operador: Char) {
        val resultado = when(operador){
            '+' -> num1 + num2
            '-' -> num1 - num2
            '*' -> num1 * num2
            '/' -> num1 / num2
            else -> mostrar("No es un operador válido!!!")
        }
        mostrar("${resultado}")
    }

    override fun calculadora() {
        try{
            val num1 = pedirDouble()
            val operador = pedirOperador()
            val num2 = pedirDouble()
            hacerOperacion(num1, num2, operador)
        }catch(e: InputMismatchException){
            mostrarError("${e}")
        }
    }
}