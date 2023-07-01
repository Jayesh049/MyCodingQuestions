import java.util.*;
public class longestSubstringWithExactlyKUniqueCharacters {




        public static int solution(String str, int k) {
            int plen = 0;
            int i = -1;
            int j = - 1;
            // write your code here
            HashMap<Character, Integer> map = new HashMap<>();

            while (true) {
                boolean f1 = false;
                boolean f2 = false;

                //acquire until it is invalid
                while (i < str.length() - 1) {
                    f1 = true;

                    i++;
                    char ch = str.charAt(i);
                    map.put(ch, map.getOrDefault(ch, 0) + 1);

                    if (map.size() < k) {
                        //agar map ka size chota hai k se
                        continue;
                    }        else if (map.size() == k) {
                        //agar map ka size baraabar hai k ke toh naya answer aagya
                        int len = i  - j;
                        if (len > plen) {
                            plen = len;
                        }
                    }        else { //agar map ka size badaa hai k se toh release krne ka time aagyela hai
                        break;//toh break kar do
                    }
                }

                //collect and release
                while ( j < i ) {
                    // int len = i - j;
                    // if (plen > len) {
                    //   len = plen;
                    // }

                    f2 = true;

                    j++;
                    char ch = str.charAt(j);
                    if (map.get(ch) == 1) {
                        map.remove(ch);
                    }
                    else {
                        map.put(ch, map.get(ch) - 1);
                    }


                    if (map.size() > k) {
                        continue;//agar map ka size badaa hai k se toh continue kar do
                    }
                    else if (map.size() == k) { //agar map ka size release karte time baraabar hai k ke toh print kr do length
                        int len = i - j;
                        if (len > plen ) {
                            plen = len;
                        }
                        break;
                    }
                    //agar na badaa hai na chota hai toh break kar do acquire karne do bechare ko
                }

                if (f1 == false && f2 == false) {
                    break;
                }

            }



            return plen;
        }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();
        System.out.println(solution(str, k));
    }

}
