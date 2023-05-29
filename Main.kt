import java.lang.NumberFormatException
import java.util.*
import kotlin.ArithmeticException

enum class CalculatorOperator{
    ADD,
    SUB,
    MUL,
    DIV
}

fun cal(choice : CalculatorOperator, x : Double = 0.0, y : Double = 0.0) : Double{
    when(choice){
        CalculatorOperator.ADD -> return x + y
        CalculatorOperator.SUB -> return x - y
        CalculatorOperator.MUL -> return x * y
        CalculatorOperator.DIV -> if(y != 0.0) return x/y else throw ArithmeticException()
    }
}

fun main(){
    val input = Scanner(System.`in`)

    print("Enter a: ")
    val x = input.next()
    print("Enter b: ")
    val y = input.next()

    x.toDoubleOrNull() ?: throw NumberFormatException()
    y.toDoubleOrNull() ?: throw NumberFormatException()

    val x1 = x.toDouble()
    val y1 = y.toDouble()


    println(" 1. a + b\n 2. a - b\n 3. a * b\n 4. a / b\n 0. Exit")

    var choice : Int? = null

    while(choice != 0){
        print("Choose a number: ")
        choice = input.next().toIntOrNull() ?: throw NumberFormatException()
        when(choice){
            0 -> return
            1 -> println("$x + $y = ${cal(CalculatorOperator.ADD, x1, y1)}")
            2 -> println("$x - $y = ${cal(CalculatorOperator.SUB, x1, y1)}")
            3 -> println("$x * $y = ${cal(CalculatorOperator.MUL, x1, y1)}")
            4 -> println("$x / $y = ${cal(CalculatorOperator.DIV, x1, y1)}")
            else -> println("Wrong Number")
        }
    }
}