class Cow2 (var breed: String, var color: String, var age: Int) {


    fun eat() {
        println("${breed} eat grass")
    }

    fun moo() {
        println("${breed}s moo ")
    }

}
fun main(){
        val cow1 = Cow2("ongole", "white",2)//we do this for all 3 variables separating by commas
        cow1.eat()
        cow1.moo()

        val cow2 = Cow2("sahiwal cattle","reddish",3)//we need to pass th values both the times and will also have to call member function at both times
        cow2.eat()
        cow2.moo()


    }


/*
class Dog {
    //state and properties of class,we will write it using variable
    var breed: String = "golden retriever"
    var color: String = "brown"

    var age: Int  = 24//then we put the colon and give datatypes to this variable
    /*why there is intellij ide giving us error because whenenver give an variable always initiaizes
    the variable,how can we initilaize it lets see
     */
    /*Now lets add behaviour for this class
    behaviours are nothing but  functions that are members or objects of the
    class can perform ,so we add functions to this class
     */
    fun eat(){


        println("${breed}s eat gutka")//for eat we use dollar sign breeds eat cabbage


    }
    fun bark() {
        println( "${breed}s does not bark") //for bark we use dollar sign breed s bark
        /*i forgot why we use dollar sign,dollar sign are string templ
    ate and we use them to make the print statement to print the va;ue of the variable
                but when we wil not use the dollar sign then it will print simply the
                name instead of we have given value of them*/

    /*THESE functions are in class are also known as member function(fun eat,fun bark )so
     we have created defintion of the class dog,without declaring we cannot see our output to do this
     we have to do fun main function in an class
     */
    }
}
fun main() {
    val dog1 = Dog()//we need to create object for this class inside the main function so we create an object like this
//dog1 is name created for the class object class dog

    dog1.breed = "german shepherd"//we can declare new values that we have created in our class
    dog1.color = "white"
    dog1.age = 1

    println("The  breed of dog is ${dog1.breed} ,whose color is ${dog1.color} and is ${dog1.age} years old")


    dog1.eat()
    dog1.bark()
     /*name of  the object of the class and then we put the dot operator
     and the name of the function like this
    with paranthesis*/

}

 */
/*class Cow (breed: String,color: String,age: Int){   //constructor variables
    //we write the keyword as "constructor" and then the variables are mentioned inside this paranthesis
    //step2-and now we will remove this initial values form the class.
    //we can also remove constructor from top of the program

    var breed: String = breed                  //member/local variables,lets get suggestio and do it for all this code
    var color: String                  //member/local variables
    var age: Int                       //member/local variables of class
    //we have used same variable names at two places
    //to equate primary and member variable we need to write some code
    //to initialize this we nedd to use init block
    init {
        this.breed = breed
        /*syntax: this.variable name of the member variable =and corresponding n
                         name of constructor variable*/
        //this keyword used to differentiate member variable and constructor variable

        this.color = color
        this.age = age
        /*remember according to he convention,the names of member variables a
     nd constructor variables must always be the same */
        //lhs=member variables ,rhs = constructor variables
        //we know there is 3 times we used the variables and Ide will help us to fix redundancy of this variable.

         //joined declared and assignment operator
    }

    fun eat{} {
        println("${breed} eat grass")
    }

    fun bark{} {
        println("${breed}s sound ")
    }
}
fun main(){

}
*/