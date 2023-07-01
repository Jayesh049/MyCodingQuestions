import java.util.HashMap;
import java.util.List;

public class LeetCode139 {
    class Solution {
        HashMap<String,Boolean> map = new HashMap<>();

        public boolean wordBreak(String s, List<String> wordDict) {
            //split s into 2 parts
            for(String str:wordDict){
                map.put(str,true);
            }

            return wordBreakhelper(s , wordDict);
        }


        public boolean wordBreakhelper(String s , List<String> wordDict){
            if(map.containsKey(s)){
                return map.get(s);
            }

            for(int i = 0 ;  i < s.length() ;i++){
                String left = s.substring(0 , i );
                String right = s.substring(i );
                if( wordBreakhelper(left , wordDict) &&wordDict.contains(right) ){
                    map.put(s , true);
                    return true;
                }
            }
            map.put(s , false);
            return false;
        }
    }
}
