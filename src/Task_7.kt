import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    print("Please, enter the quantity of programmers: ")
    var programmers:Int = scan.nextInt()
    when{
        (programmers % 10 == 1)-> println("программист")
        (programmers % 10 in 2..4)-> println("программиста")
        (programmers % 10 in 5..9)-> println("программистов")
        (programmers % 100 in 10..14) -> println("программистов")
    }
}