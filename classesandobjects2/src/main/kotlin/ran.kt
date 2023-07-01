data class Student(val name: String,val rollnumber: Int, val percentagemarks: Double)



fun main() {
    val stu1 = Student("raju",1,94.5)
    val stu2 = Student("shyam",2,95.5)
    val stu3 = Student("anuradha",3,96.5)
    val stu4 = Student("anjali",4,97.5)
    val stu5 = Student("pappu",5,98.5)
    val stu6 = Student("munna bhai",6,99.5)
    val stu7 = Student("baburaoganpatrao",7,99.9)
    val stu8 = Student("kachra seth",8,93.5)
    val stu9 = Student("tiwari",9,97.6)
    val stu10 = Student("chhote",10,91.3)

    var Studentlist = mutableListOf(stu1,stu2,stu3,stu4,stu5,stu6,stu7,stu8,stu9,stu10)

    for (stu in Studentlist){
        println(stu)
    }
}