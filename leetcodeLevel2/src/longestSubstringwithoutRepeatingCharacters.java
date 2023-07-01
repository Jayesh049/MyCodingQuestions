import java.util.*;
public class longestSubstringwithoutRepeatingCharacters {




//    public class Main {


    //Approach
    //Loop the string, HashSet to store the Character, count++, and use a max to store longest length.
    //Whenever a char exist in hashset, new hashset and count = 0, set i = 1st duplicate char, followed by i++, now start again.

        public static int solution(String s) {
            // write your code here
            HashMap<Character ,Integer> map = new HashMap<>();

            int count =0 ;
            int max =0;
            for(int i = 0 ; i< s.length() ; i++){
                char c = s.charAt(i);

                if(!map.containsKey(c)){
                    map.put(c , i);//map ke andar naya character enter hua hai toh uska aur uska index daal liya ( character aur index ke form me)
                    count++;//count badha diya
                    System.out.println(map.keySet() + " @" + count);
                }
                else{
                    //agar map ke andar character pehle se hi hai toh uske index ko get kar lo
                    i = map.get(c);//s.charAt(i)//humne character ke andar index jo daala hua tha wo get kar liya map.get(s.charAt(c))
                    System.out.println("frequency is " +i);
                    map = new HashMap<Character , Integer>();
                    //fir ek naya map banaa do
                    System.out.println("new map created" +map.keySet());
                    count = 0;
                    //count 0 kar do
                }
                max = Math.max(max , count);
            }
            return max;
        }



    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String str = scn.next();
            System.out.println(solution(str));
        }

    }

