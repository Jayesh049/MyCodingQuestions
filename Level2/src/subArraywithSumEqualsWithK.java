class Solution {
    //leetcode link https://leetcode.com/problems/subarray-sum-equals-k/submissions/
    public int subarraySum(int[] nums, int k) {


        int ans = 0;
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(sum , 1);


        for(int val : nums){
            sum += val;

            int   gsAF= sum -k;//getsubArrayFrequency
            if(map.containsKey( gsAF)){
                ans += map.get(gsAF);
            }


            if(map.containsKey(sum)){
                int val1 = map.get(sum);
                map.put(sum , val1 + 1);
            }else{
                map.put(sum ,1);
            }
        }
        return ans;
    }
}