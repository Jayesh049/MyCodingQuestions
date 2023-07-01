import java.util.HashMap;

public class Leetcode290PatternMatching {
    class Solution {
        //T.C - O(logn)
        //SC - O(logn)
        public boolean wordPattern(String pattern, String s) {
            String[]words = s.split(" ");

            //base case
            if(words.length != pattern.length()){
                return false;
            }



            //real solution
            HashMap<Character , String> map1 = new HashMap<>();
            HashMap<String , Boolean> map2 = new HashMap<>();


            //checking for pattern characters
            for(int i = 0 ;i < pattern.length() ;i++){
                char ch = pattern.charAt(i);

                //dhyan rahe agar map
                if(map1.containsKey(ch) == false){

                    if(map2.containsKey(words[i]) == true){
                        return false;
                    }else{
                        map2.put(words[i] , true);
                        map1.put(ch , words[i]);
                    }
                }else{
                    String mapped = map1.get(ch);
                    if(mapped.equals(words[i]) == false){
                        return false;
                    }
                }
            }
            return true;
        }

    }

}
