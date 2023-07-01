public class introductionOfStrings {
    public static void main(String[] args) {

        String s1="hello";
        System.out.println(s1);



        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            System.out.println(ch);
        }

       s1+="world";
        System.out.println(s1);
        System.out.println(10+20+"hello+10+22");

        String s = "hello";

        System.out.println(s.substring(0,1));
        System.out.println(s.substring(1,2));
        System.out.println(s.substring(2,3));
        System.out.println(s.substring(3));
        }
    }

