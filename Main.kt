import java.lang.ArithmeticException
import java.lang.NumberFormatException
import java.util.*

class Calculator(val x : Double = 0.0, val y : Double = 0.0) {
    fun add() = x + y
    fun sub() = x - y
    fun mul() = x * y
    fun div() = if(y == 0.0) -1 else x/y
}

fun main(){
    val input = Scanner(System.`in`)

    print("Enter a: ")
    val x = input.next()
    print("Enter b: ")
    val y = input.next()

    x.toDoubleOrNull() ?: throw NumberFormatException()
    y.toDoubleOrNull() ?: throw NumberFormatException()

    val calculator = Calculator(x.toDouble(), y.toDouble())

    println(" 1. a + b\n 2. a - b\n 3. a * b\n 4. a / b\n 0. Exit")

    var choice : Int? = null

    while(choice != 0){
        print("Choose a number: ")
        choice = input.next().toInt()
        when(choice){
            0 -> return
            1 -> println("$x + $y = ${calculator.add()}")
            2 -> println("$x - $y = ${calculator.sub()}")
            3 -> println("$x * $y = ${calculator.mul()}")
            4 -> if(calculator.div() != -1) println("$x / $y = ${calculator.div()}") else throw ArithmeticException()
        }
    }
}