import java.io.*;
import java.util.*;
public class WordsKSelection2 {

    public class Main {

        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            String str = scn.nextLine();
            int k = scn.nextInt();

            HashSet<Character> unique = new HashSet<>();
            String ustr = "";
            for (char ch : str.toCharArray()) {
                if (unique.contains(ch) == false) {
                    unique.add(ch);
                    ustr += ch;
                }
            }
            combination( 1 , k , ustr , -1 , "");

        }

        public static void combination(int cs , int ts , String ustr , int ls , String asf){
            if(cs > ts){
                System.out.println(asf);
                return;
            }


            for(int i = ls + 1 ; i <ustr.length() ;i++ ){
                char ch = ustr.charAt(i);
                combination(cs + 1, ts , ustr , i , asf + ch);
            }
        }

    }
}
