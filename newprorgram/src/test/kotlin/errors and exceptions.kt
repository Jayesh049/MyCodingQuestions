fun main() {
    /*  val d = arrayOf(3, 4, 5, 6)

    try {

        d[4] = 7
        println("I ran and changed the value ")
    } catch (e: ArrayIndexOutOfBoundsException) {
           println("I ran and caught the value of exception")
    } finally {
        println(d[2])//this is totally exception finally operators
    }
*/
/*var nullValue: String? = null //this shows the output null
    println(nullValue)
*/
    /*   var nullValue:String?= null
    println(nullValue?.length)
*/
    /*
    val nullList = listOf(1, 2, 3, null, 4, 5, null, 6)

    val nullArrayList = arrayListOf("this",null,"is","a",null,"statement")

    println("the list without the null values is ${nullList.filterNotNull()}")//remember this always starts with curly braces
    println("the array list without null values is ${nullArrayList.filterNotNull()}")
    //remember we are implementing the filternot null which help us to filter null value which we are using in this main function
*/
    /* val someValue = null
    println(someValue ?: "This was  null") //this is quiz question
*/
/*
Print the value present at index 6 in the given array.
arr = [0, 100, 200, 300, 400, 500].
Use try-catch to catch the exception if any.
 */
/*
    val p = arrayOf(0, 100, 200, 300, 400, 500)
    try {
        println(p[6])
    } catch (e: Exception) {
        println("index 6 is not present in array")


    }
    */
   /* Initialise a String as “Hello, Kotlin” and change its value to null
    . Now print the length of the String using safe call and non-null assertion operator.*/
    /*var myString: String? = "Hello, Kotlin"
    myString = null
    println(myString?.length)
    println(myString!!.length)
    */
//Initialise a variable x = null and print the value as 0.0 while printing x using the Elvis operator.
    /*
    fun main() {
val x: Int? = null
print(x ?: 0.0)
}
     */
    /*Given a list = [1, null, 2, 4, null, 6, 8, 10, null]. Insert the number 12 to the number at inde
    x 7 and then print out the complete list without any exceptions or null values in the output.
     */
/*fun main() {

   val myList = mutableListOf(1, null, 2, 4, null, 6, 8, 10, null)
   myList.add(7, 12)

   print(myList.filterNotNull())
}*/
}




