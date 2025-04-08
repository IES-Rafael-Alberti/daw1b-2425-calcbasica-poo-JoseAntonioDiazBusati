package ui

interface IConsola {
    fun mostrar(msg: String)
    fun mostrarError(msg: String)
    fun pedirDouble(): Double
    fun pedirOperador(): Char
    fun hacerOperacion(num1: Double, num2: Double, operador: Char)
    fun calculadora()
}