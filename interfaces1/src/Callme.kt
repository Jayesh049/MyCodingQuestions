class Callme:myInterface,Newinterface {  //this showing error because we have not defined hello function

    override fun hello() {
        println("function hello is called here")//we have override the function hello
    }

    override fun greeting() {
        println("new greeting can even be here")
    }

    override fun newMethod() {
        println("function of new interface ")
    }

}

