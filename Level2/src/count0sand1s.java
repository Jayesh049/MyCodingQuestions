import java.util.HashMap;

public class count0sand1s {
    //gfg  https://practice.geeksforgeeks.org/problems/count-subarrays-with-equal-number-of-1s-and-0s-1587115620/1

//User function Template for Java

        //Function to count subarrays with 1s and 0s.
        static int countSubarrWithEqualZeroAndOne(int arr[], int n)
        {
            // add your code here
            int ans = 0;
            int sum = 0;

            HashMap<Integer, Integer> map = new HashMap<>();

            map.put(sum , 1);

            for(int val : arr){
                //2.1
                if(val == 0){
                    sum += -1;
                }
                else{
                    sum += 1;
                }
                //2.2

                if(map.containsKey(sum)){
                    ans += map.get(sum);
                    map.put(sum,map.get(sum) + 1);
                }
                else{
                    map.put(sum , 1);
                }

            }
            return ans;

        }
    }




