class Cow(var breed: String,var color: String,var age: Int) {
    /*now since these variables are already there in primary constructor,why do we need another constructor
     Well sometime we want to may have another properties in an different constructor */
/*lets declare a variable name for our secondary constructor
As we have done earlier  that we need to do secondary constructor   we need to declare the variables
and then create the constructer variables
 */
    var name: String? = null

    constructor(breed: String, color: String, age: Int, name: String) : this(breed, color, age) {
        this.name = name
    }
    //we pass the primary constructor variables and here we pass the variable name
    /*then we put a colon then we call
    primary constructor in a secondary constructor
     using this keyword,then use curly braces sto create a constructor body
     */
}
fun main(){
    val cow1 = Cow("ongokula","blue",3,)

    val cow2 = Cow("hisar","red",4,"pruthu")
}
       /*secodary constructor are not mmusch used in kotlin,there are used only
         when we need to initialize the class in multiple ways which is very rare,the reason of learning this to get
         wholesome knowledge of constructors */

