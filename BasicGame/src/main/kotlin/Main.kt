import java.util.*

class Manager{
    private var number : Int = 0;
    init {
        number = (0..100).random()
    }
    fun compare(answer : Int) : Int{
        if(answer == number){
            return 0
        }
        else if(answer > number){
            return 1
        }
        else{
            return -1
        }
    }
}
fun main() {
    val scanner = Scanner(System.`in`)
    val manager = Manager()
    var answer : Int = 0
    var result : Int = -1
    while(result != 0){
        print("Enter a number : ")
        answer = scanner.nextLine().toInt()
        result = manager.compare(answer)
        if(result == 0){
            println("You win!")
        }
        else if(result == 1){
            println("Too high!")
        }
        else{
            println("Too low!")
        }
    }
}