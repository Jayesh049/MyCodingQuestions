fun main() {
//Create a program in Kotlin to calculate the factorial of number 7.
  /*
    var factorial = 1

    for (i in 7 downTo 1){
        factorial *= i
    }

    println(factorial)
  */
/*Create a program to print the first 10 numbers of Fibonacci series.
 The Fibonacci Sequence is a series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 The next number is found by adding up the two numbers before it.
 The 2 is found by adding the two numbers before it (1+1). The 3 is found by adding the two numbers before it (1+2) and so on!
Example: the next number in the sequence above is 21+34 = 55.
*/
 /*
    fun main() {

        var i = 0
        var j = 1
        var k = 0
        print("$i, $j")
        for (r in 1..8) {
            k = i + j
            print(", $k")
            i = j
            j = k
        }
    }
    */
  /*Create a list which contains math function operators (+, -, *, /) as characters. Iterate through this list and pass two variables along with the list item (operator) to a function and perform all the math functions on them. Perform the operation corresponding to the character encountered by the iterator.
Given:
Index of + is 0
Index of - is 1
Index of * is 2
Index of / is 3
In case of division check if the divisor is 0 or not.
*/
    /*
    fun main() {
   val operatorList = listOf('+', '-', '*', '/')
   for (i in operatorList) {
       val output = performOperation(100, 20, i)
       println("The output of the operation $i is $output")
   }
}

fun performOperation(a: Int, b: Int, operator: Char): Int {
   var c = 0
   if (operator == '+') {
       c = a + b
   }
   if (operator == '-') {
       c = a - b
   }
   if (operator == '*') {
       c = a * b
   }
   if (operator == '/') {
       if (b != 0) {
           c = a / b
       } else {
           c = 0
       }
   }
   return c
}
   */

}