class Car(val brandName: String, val color: String,val engineNumber: Int){

    fun accelerate() {
        println("this car can accelerate ")
    }

    fun applyBrakes() {
        println(" if you want to apply brakes apply it men")
    }

}

fun main(){

    val car1 = Car("ferrari" , "red" , 2)
    car1.accelerate()
    car1.applyBrakes() //there should be no spaces  when you declare any variable if you want to do this

    val car2 = Car("audi","black",9)
    car2.accelerate()
    car2.applyBrakes()
}