import java.lang.IllegalArgumentException
import java.util.Scanner

class Calculator(private var a: Double = 0.0, private var b: Double = 0.0) {
    fun add() = a + b
    fun subtract() = a - b
    fun multiply() = a * b
    fun divide() = if (b == 0.0) -1.0 else a / b
}

fun showMenu() {
    println("-----Choose an option-----")
    println("1. Add")
    println("2. Subtract")
    println("3. Multiply")
    println("4. Divide")
    println("5. Exit")
    print("Enter your choice: ")
}

fun option() {
    println("1. Continue to calculate with the last result")
    println("2. Create new calculating")
    println("3. Exit")
    print(" Enter your option: ")
}


fun main() {
    val input = Scanner(System.`in`)
    println("Enter two number to begin calculating")
    print("Enter a: ")
    var a = input.next().toDouble()
    print("Enter b: ")
    var b = input.next().toDouble()
    var calculator = Calculator(a, b)
    var choice: Int? = null
    while (true) {
        showMenu()
        choice = input.nextInt()
        if (choice == 5) break
        when (choice) {
            1 -> {
                println("$a + $b = ${calculator.add()}")
                a = calculator.add()
            }

            2 -> {
                println("$a - $b = ${calculator.subtract()}")
                a = calculator.subtract()
            }

            3 -> {
                println("$a * $b = ${calculator.multiply()}")
                a = calculator.multiply()
            }

            4 -> {
                val x = calculator.divide()
                if (x == -1.0) {
                    throw IllegalArgumentException("Error divided by zero")
                } else {
                    println("$a / $b = ${calculator.divide()}")
                    a = calculator.divide()
                }
            }
        }
        option()
        var opt: Int? = null
        opt = input.nextInt()
        if(opt == 3) break
        when (opt) {
            1 -> {
                println("Enter b: ")
                b = input.next().toDouble()
                calculator = Calculator(a, b)
            }

            2 -> {
                println("Enter two number to begin calculating")
                println("Enter a: ")
                a = input.next().toDouble()
                println("Enter b: ")
                b = input.next().toDouble()
                calculator = Calculator(a, b)
            }
        }
    }
}