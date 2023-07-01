class Laptop {
    var ram: Int = 4
    var brand: String = "Dell"
    var hdd: Int = 512

    fun performComputations(){
        println("I perform computations")
    }
}

fun main(){

    val laptop1 = Laptop()
    laptop1.brand = "apple"
    laptop1.ram = 12
    laptop1.hdd = 512

    println(laptop1.brand)
    println(laptop1.ram)
    println(laptop1.hdd)
    laptop1.performComputations()

    val laptop2 = Laptop()
    laptop2.brand = "msi"
    laptop2.ram = 16
    laptop2.hdd = 1024

    println(laptop2.brand)
    println(laptop2.ram)
    println(laptop2.hdd)
    laptop2.performComputations()


}