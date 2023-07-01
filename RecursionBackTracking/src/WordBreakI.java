import java.io.*;
import java.util.*;
public class WordBreakI {

    public class Main {

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            HashSet<String> set = new HashSet<>();
            for(int i = 0  ; i  < n; i++){
                set.add(scn.next());
            }
            String sentence = scn.next();
            wordBreak(sentence,"", set);
        }

        public static void wordBreak(String str, String ans, HashSet<String> set){
            // write your code here
            if(str.length() == 0){
                System.out.println(ans);
                return;
            }


            for(int i = 0 ; i < str.length(); i++){
                String left = str.substring(0 , i + 1);//mi
                String right = str.substring(i + 1);//
                if(set.contains(left)){
                    wordBreak(right , ans + left + " " , set);
                }
            }
        }

    }
}
