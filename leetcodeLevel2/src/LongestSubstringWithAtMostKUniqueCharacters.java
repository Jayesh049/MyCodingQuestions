import java.util.*;
public class LongestSubstringWithAtMostKUniqueCharacters {

//https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1
    //https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/hashmap-and-heaps/longest-substring-with-at-most-k-unique-characters-official/ojquestion
    //leetcode 340

        public static int solution(String str, int k) {
            int i = -1 ;
            int j = -1;
            int ans = 0;
            HashMap<Character, Integer > map = new HashMap<>();
            while (true) {

                boolean flag1 = false;
                boolean flag2 = false;
                while (i < str.length() - 1) {
                    flag1 = true;

                    i++;
                    char ch = str.charAt(i);
                    map.put(ch, map.getOrDefault(ch, 0) + 1);

                    //condition for this question
                    if (map.size() <= k) {
                        ans = Math.max(ans, i - j);
                    }
                    else {
                        break;
                    }
                }




                //release
                while ( j < i) {
                    flag2 = true;

                    j++;
                    char ch = str.charAt(j);

                    //release strategy
                    if (map.get(ch) == 1) {
                        map.remove(ch);
                    }
                    else {
                        map.put(ch, map.get(ch) - 1);
                    }


                    if (map.size() > k) {
                        continue;
                    } else {
                        ans = Math.max(ans, i - j);
                    }
                    break;
                }

                if (flag1 == false && flag2 == false) {
                    break;
                }
            }



            return ans;
        }

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String str = scn.next();
            int k = scn.nextInt();
            System.out.println(solution(str,k));
        }

    }

