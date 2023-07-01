import kotlin.math.max

fun main() {
    println(sum(2,4))
    println(difference(4,2))
    println(product(5,3))
    println(division(3,6))
    println(calMax(5, 6))
}

fun sum(x:Int,y: Int) = x+y

fun difference(x:Int,y: Int) = x-y

fun product(x:Int,y: Int) =x*y

fun division(x:Int,y: Int) = x/y

fun calMax(a: Int,b: Int) :Int{
    return max(a, b)

}
