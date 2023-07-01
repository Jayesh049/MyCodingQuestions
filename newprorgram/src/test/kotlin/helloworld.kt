fun main (){
    var characterArray = arrayOf<Char>('i','n','t','e','r')
    val charArray = arrayOf<Char>('a','b','c','d','e')

    val i = 1
    val otherArray = arrayOf<Char>('l','m','n','o','p')

    characterArray = otherArray
    val newArr:Array<Any> = arrayOf("Hello", 12,34.5,true,'X')
}