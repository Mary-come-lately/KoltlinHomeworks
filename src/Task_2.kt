import java.util.Scanner

fun main(){
    var scan = Scanner(System.`in`)
    print("Please, enter the length of first side of triangle: ")
    var side1: Int = scan.nextInt()
    print("Please, enter the length of second side of triangle: ")
    var side2: Int = scan.nextInt()
    print("Please, enter the length of third side of triangle: ")
    var side3: Int = scan.nextInt()
    if(side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2){
        println("The triangle is exist")
    }
    else println("The triangle do not exist")
}