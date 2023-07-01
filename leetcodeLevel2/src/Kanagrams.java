import java.util.*;


public class Kanagrams {



        public static boolean areKAnagrams(String s1, String s2, int k) {

            Map<Character, Integer> m1 = new HashMap<>();
            if(s1.length() != s2.length())
                return false;
            //string1 frequency map
            for(char c : s1.toCharArray())
                m1.put(c, m1.getOrDefault(c, 0) + 1);
            //string2 frequency map
            for(char c : s2.toCharArray()){
                //agar map ke andar character hai
                if(m1.containsKey(c)){
                    m1.put(c, m1.get(c)-1);
                    //toh map ke andar uss character ki frequency ek kum kar do
                    m1.remove(c, 0);
                    //aur jiske frequency 0 hai usko remove kar do
                }
            }
            for(char c : m1.keySet())
                k -= m1.get(c);//
            return k >= 0;
        }

        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            String str1 = s.next();
            String str2 = s.next();
            int k = s.nextInt();
            System.out.println(areKAnagrams(str1, str2, k));

        }

    }


