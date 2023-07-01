import java.util.HashMap;

public class rabbitsinJungle {
    class Solution {
        public int numRabbits(int[] answers) {


            HashMap<Integer, Integer> map = new HashMap<>();
            for(int val :answers){
                int ansf = map.getOrDefault( val , 0);
                map.put(val , ansf + 1);
            }



            int ans = 0;
            for(int key: map.keySet()){
                int gs = key  + 1;
                int pyaarekhargosh = map.get(key);
                int numberofgroupofkhargosh = (int)Math.ceil(pyaarekhargosh * 1.0 / gs * 1.0);
                ans += numberofgroupofkhargosh * gs;
            }
            return ans;
        }

    }
}
