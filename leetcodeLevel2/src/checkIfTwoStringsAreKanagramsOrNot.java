import java.util.*;
import java.io.*;
public class checkIfTwoStringsAreKanagramsOrNot {


   public static boolean areKAnagrams(String s1, String s2 , int k) {


       HashMap<Character, Integer> map = new HashMap<>();


       if (s1.length() != s2.length()) {
           return false;
       }

       for (char ch : s1.toCharArray()) {
           map.put(ch, map.getOrDefault(ch, 0) + 1);
       }
       for (char ch : s2.toCharArray()) {

           if (map.containsKey(ch)) {
               map.put(ch, map.getOrDefault(ch, 0) - 1);
               map.remove(ch, 0);
           }
       }
       for (char ch : map.keySet()){
           System.out.println(map.keySet()+" ");
            System.out.print(map.get(ch) +" ");
            int chf = map.get(ch);

            k -= chf;
           System.out.println( "@" + k +" ");
   }
            return k >= 0;





}

public static void main(String[]args){
   Scanner scn= new Scanner(System.in);
   String s1 =scn.nextLine();
   String s2 = scn.nextLine();
   int k = scn.nextInt();
    System.out.println(areKAnagrams(s1 , s2, k));
   }
}
