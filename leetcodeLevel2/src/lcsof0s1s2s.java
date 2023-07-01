import java.util.*;
public class lcsof0s1s2s {


        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            System.out.println(solution(arr));
        }


        public static int solution(int[] arr) {
            // write your code here

            int ans = 0;

            int c0 = 0;
            int c1 = 0;
            int c2 = 0;
            String key = "0#0";
            HashMap<String, Integer> map = new HashMap<>();
            map.put(key, -1);

            for (int i = 0; i < arr.length; i++) {
                int val =arr[i] ;

                if (val == 0) {
                    c0++;
                } else if (val== 1) {
                    c1++;
                } else if (val == 2) {
                    c2++;
                }

                key = (c1 - c0) + "#" + (c2 - c1);

                if (map.containsKey(key)) {
                    int idx = map.get(key);
                    int length = i - idx;
//                    ans = Math.max(ans , length);
                    if (length > ans) {
                        ans = length;
                    }

                } else {
                    map.put(key, i);
                }


            }
            return ans;
        }
    }




//
//for(int val:arr){
//
//        sum += (val ==0 ? -1 : 1);
//
//
//        if(map.containsKey(sum)){//agar hashmap contain karta hai uss value ko jo dubaara repeat hua hai t
//        int idx  = map.get(sum);//hum uski index nikal lenge jo ki current haii
//        int length = i - idx;//starting se lekar - end waale ko minus karenge toh hum log length nikal lenge starting value ki aur jo value repeat hui hai
//        if(length >ans){
//        ans = length;
//        }//pehle toh ans me initial value jaayegi jo agar length badaa hua ans se toh phir hum answer ko update kar denge
//
//
//        }//agar sum ke andar value pehli baar aarha hai toh phir hum log ye kar skte hai uski jo index hai sum ke saath put kar denge
//        map.put(sum , i);
//
//        }
