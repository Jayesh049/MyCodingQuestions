import java.util.*;
public class AvoidFlood {
    //leetcode 1488

        public int[] avoidFlood(int[] rains) {

            TreeSet<Integer> ts = new TreeSet<Integer>();

            int n = rains.length;

            int ans[] = new int[n];

            //we are making value and their index hashmap
            HashMap<Integer , Integer> map = new HashMap<>();



            for(int i = 0 ;i  < rains.length ; i++){
                int val  = rains[i];
                if(val == 0){
                    ts.add(i);

                }else{
                    if(map.containsKey(val)){
                        int index = map.get(val);

                        Integer ceil = ts.ceiling(index);

                        if(ceil == null){//tumhara ceiling hi null padaa hua hai treeset me toh 0 return kar do
                            return new int[0];
                        }
//jo humaara ceil tha jo ki 0 hai ab humne usko use karke dry kiya toh value[rains[i]] ke ke saamne jo sabse
// paas waala ceil hai jo ki 0 hai uspr hum wo value daal denge jisse humne dry kiya

                        ans[ceil]= val;
//fir dry karne k baad kaam khtm treeset se remove kar denge
                        ts.remove(ceil);//add karne ke bad ts se remove kar do uss ceiling value ko
                    }
                    ans[i] = -1;
                    map.put(val , i);

                }

            }
            for(int i : ts){
                ans[i] = 1;
            }
            return ans;
        }

    }


