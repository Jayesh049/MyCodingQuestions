public class Leetcode1835 {
    class Solution {
        public int getXORSum(int[] arr1, int[] arr2) {

            int ans1 = 0 ;
            int ans2  =0;
            int sum = 0;
            for(int val : arr1){
                ans1 ^= val;
            }
            for(int val1 : arr2){
                ans2 ^= val1;
            }
            int   ans =ans1 & ans2;
            return  ( sum ^= ans);
        }

    }

}
