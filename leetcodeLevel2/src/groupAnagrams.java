import java.util.*;
//leetcode 49
public class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {


        HashMap<HashMap<Character , Integer> , List<String>> map = new HashMap<>();

        for(String str:strs){
            HashMap<Character , Integer> fmap = new HashMap<>();
            for(int i = 0 ;i < str.length() ;i++){
                char ch = str.charAt(i);
                int chf = fmap.getOrDefault(ch , 0);
                fmap.put(ch , chf + 1);
            }

            if(map.containsKey(fmap) == true){
                List<String> list = map.get(fmap);
                list.add(str);

            }
            else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(fmap , list);
            }
        }


        List<List<String>> ans = new ArrayList<>();
        for(List<String> val: map.values()){
            ans.add(val);
        }
        return ans;
    }

}
