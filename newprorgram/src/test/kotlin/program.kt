import java.util.*

fun main() {
    val arr1 = arrayOf(0,2,4,6,8)
    val arr2 = arrayOf(1,3,5,7,9)

    arr1[0]+=arr2[0]
    arr1[1]+=arr2[1]
    arr1[2]+=arr2[2]
    arr1[3]+=arr2[3]
    arr1[4]+=arr2[4]
    println(arr1.contentToString())
}