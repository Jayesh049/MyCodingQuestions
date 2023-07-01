public class practice {

        public static void main(String[] args) {

            String str="NitiN", reverseStr="";

            int strLength=str.length();

            for (int i= (strLength-1); i>=0; --i) {
                reverseStr=reverseStr+str.charAt(i);
            }

            if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
                System.out.println(str +" is a Palindrome");
            } else {
                System.out.println(str +"is Not a Palindrome");
            }
        }
    }


