import java.util.*;
public class longest0s1s {



        public static int solution(int[] arr) {
            // write your code here
            int ans = 0;
            int sum = 0;
            HashMap<Integer , Integer> map = new HashMap<>();
            map.put(sum , -1);

            for(int i = 0 ;i < arr.length ; i++){
                int val = arr[i];
                sum+= (val ==0 ? -1 :1);

                if(map.containsKey(sum)){
                    int idx = map.get(sum);
                    int length = i - idx;
                    if(length > ans){
                        ans = length;
                    }

                }else{
                    map.put(sum , i);
                }
            }

            return ans;
        }
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            System.out.println(solution(arr));
        }

    }


