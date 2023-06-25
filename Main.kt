import java.lang.NumberFormatException
import java.util.*
import kotlin.ArithmeticException

sealed class Calculator(){

    class Add(private val x : Double , private val y : Double) : Calculator(){
        fun print(){
            println("$x + $y = ${x + y}")
        }
    }

    class Sub(private val x : Double , private val y : Double) : Calculator(){
        fun print(){
            println("$x - $y = ${x - y}")
        }
    }

    class Mul(private val x : Double , private val y : Double) : Calculator(){
        fun print(){
            println("$x * $y = ${x * y}")
        }
    }

    class Div(private val x : Double, private val y : Double) : Calculator(){
        fun print(){
            if(y != 0.0) println("$x / $y = ${x / y}") else throw ArithmeticException()
        }
    }
}

enum class CalculatorOperator(){
    ADD{
            override fun print(x : Double, y : Double) {
                println("$x + $y = ${x + y}")
            }
       },
    SUB{
            override fun print(x : Double, y : Double) {
                println("$x - $y = ${x - y}")
            }
       },
    MUL{
            override fun print(x : Double, y : Double) {
                println("$x * $y = ${x * y}")
            }
       },
    DIV{
            override fun print(x : Double, y : Double) {
                if(y != 0.0) println("$x / $y = ${x / y}") else throw ArithmeticException()
            }
    };
    abstract fun print(x : Double, y : Double)
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
            1 -> CalculatorOperator.ADD.print(x1, y1)
            2 -> CalculatorOperator.SUB.print(x1, y1)
            3 -> CalculatorOperator.MUL.print(x1, y1)
            4 -> CalculatorOperator.DIV.print(x1, y1)
            else -> println("Wrong Number")
        }
    }
}