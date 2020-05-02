import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    print("Please, enter the first number: ")
    var number1: Int = scan.nextInt()
    print("Please, enter the second number: ")
    var number2: Int = scan.nextInt()
    print("Please, enter the third number: ")
    var number3: Int = scan.nextInt()

    var count: Int = 0
    var count2: Int = 0
    if (number1 > 0) {
        count++
    } else count2++

    if (number2 > 0) {
        count++
    } else count2++

    if (number3 > 0) {
        count++
    } else count2++
    println("The quantity of positive numbers is " + count)
    println("The quantity of negative numbers is " + count2)
}