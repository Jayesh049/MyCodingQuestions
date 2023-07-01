import java.util.*;
public class longest0s1s2s {

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





