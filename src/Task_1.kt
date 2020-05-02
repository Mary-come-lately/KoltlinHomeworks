import java.util.Scanner

fun main() {
    var num = Scanner(System.`in`)
    print("Please, enter the number: ")
    var number: Int = num.nextInt()
    var sum: Int = 0

    if(number > 0){
        println("The " + number + " is positive")
    }
    else println("The " + number + " is negative")

    while (number != 0) {
        number = number % 10
        number--
        sum += 1
    }
    println("This numeral has " + sum + " numbers")
}