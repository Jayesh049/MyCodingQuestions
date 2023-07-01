import java.util.*;
public class countofsubstringshavingatmostkuniquecharactersofficial {
//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/hashmap-and-heaps/count-of-substrings-having-at-most-k-unique-characters-official/ojquestion
    //iske andar hum log less than equal to k nikaal rahe hai which is <= k



        public static int solution(String str, int k) {


            int i = -1;
            int j = -1;
            int ans = 0;
            HashMap<Character ,Integer> map = new HashMap<>();

            while(true){
                boolean flag1 = false;
                boolean flag2 = false;

                while(i < str.length() -1 ){
                    flag1 = true;
                    i++;
                    char ch = str.charAt(i);
                    map.put(ch , map.getOrDefault(ch , 0) + 1);

                    if(map.size() <= k){
                        ans += i - j;
                    }
                    else{
                        break;
                    }
                }
                ////last waale element ke liye aur agar map ka size badaa hai ya baraabar hai k ke toh release karne ka scope hai
                if(i == str.length() -1 && map.size() <= k){
                    break;
                }

                while(j< i){
                    flag2 = true;
                    j++;
                    char ch = str.charAt(j);
                    if(map.get(ch) == 1){
                        map.remove(ch);
                    }
                    else{
                        map.put(ch , map.get(ch) -1);
                    }


                    if(map.size() > k){
                        continue;
                    }
                    else{
                        ans+= i- j;
                        break;
                    }
                }
                if(flag1 == false && flag2 == false){
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

