import java.util.HashMap;
import java.util.Scanner;
import java.util.*;


public class findAnagrams {

        public static void findAnagrams(String s, String p) {
            HashMap<Character,Integer> smap = new HashMap<>();
            HashMap<Character,Integer> pmap = new HashMap<>();
            ArrayList<Integer> ans = new ArrayList<>();

            for (int i = 0; i < p.length(); i++) {
                char ch = p.charAt(i);
                int chf = pmap.getOrDefault(ch, 0);
                pmap.put(ch, chf + 1);
            }
            for (int i=0;i<p.length();i++){
                char ch = s.charAt(i);
                int chf1 = smap.getOrDefault(ch ,0);
                smap.put(ch, chf1 +1);
            }

        }
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String s = scn.next();
            String p = scn.next();
            findAnagrams(s, p);
        }

    }




//            System.out.println(map);
//           System.out.println(map.keySet());
//           for(Map.Entry<Character , Integer> entry : map.entrySet()){
//        System.out.println(entry.getKey() + " " + entry.getValue());
//        }