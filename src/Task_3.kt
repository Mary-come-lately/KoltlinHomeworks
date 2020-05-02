import java.util.Scanner

fun main(){
    val scan = Scanner(System.`in`)
    print("Please, enter the number: ")
    var number: Int = scan.nextInt()
    if(number > 0){
        println(number + 1)
    }
    else if(number < 0){
        println(number - 2)
    }
    else if(number == 0){
        println(10)
    }
}