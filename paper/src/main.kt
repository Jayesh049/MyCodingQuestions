class Robot (var name: String ){
    fun Alarm(time: Int ) = println("Wake up ${name}, it's ${time} AM")


    fun coffee(color: String, cubes:Int){
        if(color=="Black"){
            println("${name}, your black coffee is ready with ${cubes} cubes of sugar ")
        }else{
            println("${name}, your coffee with milk is ready with ${cubes} cubes of sugar")
        }
    }


    fun bath( temp:Double){
        println("${name}, water for your bath is ready and is of ${temp} F")
    }


    fun bag( day: String){
        when(day){
            "monday" -> println("Your bag is packed with books of subject English, Mathematics & Chemistry")
            "tuesday" -> println("Your bag is packed with books of subject History, Geography & Biology")
            "wednesday" -> println("Your bag is packed with books of subject Mathematics, Biology & Geography")
            "thursday" -> println("Your bag is packed with books of subject Physics, Mathematics & History")
            "friday" -> println("Your bag is packed with books of subject English, Physics & Geography")
            "saturday" -> println("It is weekend enjoy your day")
            "sunday" -> println("It's weekend time")
            else -> println("This day do not exist in my week")
        }
    }


    fun breakfast( dish:String, lunch:String){
        println("Your ${dish} is ready for breakfast, I'll start to prepare ${lunch} for your Lunch")
    }


    fun Clothes( Shirt:String, Pants:String){
        println("Your ${Shirt} shirt & ${Pants} pant is ready to wear")
    }
}




/*code for fun main(){}*/



fun main(){
    val robot = Robot("Sam")
    robot.Alarm(6)
    robot.bath(84.2)
    robot.Clothes("Raymond", "Lee Cooper")
    robot.bag("monday")
    robot.coffee("Black", 4)
    robot.breakfast("chappati", "rice balls")


}