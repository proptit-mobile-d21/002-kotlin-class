import java.lang.NumberFormatException
import java.util.*
import kotlin.ArithmeticException

class Calculator(private val x : Double = 0.0, private val y : Double = 0.0) {

    private fun add() = x + y
    private fun sub() = x - y
    private fun mul() = x * y
    private fun div() = if(y == 0.0) -1.0 else x/y

    public fun cal(choice : Int) : Double? {
        when(choice){
            1 -> return add()
            2 -> return sub()
            3 -> return mul()
            4 -> if (div() != -1.0) return div() else throw ArithmeticException()
        }
        return null
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

    val calculator = Calculator(x.toDouble(), y.toDouble())

    println(" 1. a + b\n 2. a - b\n 3. a * b\n 4. a / b\n 0. Exit")

    var choice : Int? = null

    while(choice != 0){
        print("Choose a number: ")
        choice = input.next().toInt()
        when(choice){
            0 -> return
            1 -> print("$x + $y = ")
            2 -> print("$x - $y = ")
            3 -> print("$x * $y = ")
            4 -> print("$x / $y = ")
        }
        println(calculator.cal(choice))
    }
}