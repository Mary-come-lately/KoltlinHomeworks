import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    print("Please, enter the first number: ")
    var number1: Int = scan.nextInt()
    print("Please, enter the second number: ")
    var number2: Int = scan.nextInt()

    if(number1 > number2){
        println("The " + number1 + " > " + number2)
    }
    else println("The " + number2 + " > " + number1)
}