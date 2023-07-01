public class StringInterning {


    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";//interning
        String s3 = new String("hello");//interning

        //{==}  just checks on stack(example:-Address) and not on the content
        //{equals} first check the stack (if equal returns true ,otherwise check the content)

        System.out.println(s1 == s2);//true(just checks the stack)
        System.out.println(s1 == s3);//false(just checks the stack)

        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true

     }
}




