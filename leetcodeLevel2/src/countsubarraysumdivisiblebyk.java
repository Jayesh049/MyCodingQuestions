import java.util.*;
public class countsubarraysumdivisiblebyk {




        public static int solution(int[] arr, int k) {
            // write your code here
            int sum = 0;
            int ans = 0;
            HashMap<Integer ,Integer> map = new HashMap<>();
            int rem =0;
            map.put(sum , 1);

            for(int i = 0 ; i < arr.length ;i++){
                int val = arr[i];
                sum += val;

                rem = sum % k;
                if(rem < 0){
                    rem += k;
                }

                if(map.containsKey(rem)){
                    int grmval = map.get(rem);
                    ans += grmval;
                    map.put(rem , grmval + 1);
                }
                else{
                    map.put(rem , 1);
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
            int k = scn.nextInt();
            System.out.println(solution(arr, k));
        }

    }

