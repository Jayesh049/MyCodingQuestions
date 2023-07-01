import java.util.*;
public class fourSum {
//leetcode 18
        public List<List<Integer>> fourSum(int[] nums, int target) {
            int n = nums.length;


            HashSet<List<Integer>> set = new HashSet<>();

            Arrays.sort(nums);
            for(int i =0 ; i< nums.length -3 ;i++){
                for(int j = i + 1; j < nums.length - 2; j++){
                    int left = j+ 1;
                    int right = nums.length - 1;
                    while(left < right){
                        //yaha par long ki wajah se dikkat aa rhi thi
                        long sum = (long)(nums[i] + nums[j]) + (long)(nums[left]+ nums[right]);
                        if(sum == target){
                            ArrayList<Integer> tmp = new ArrayList<>();
                            tmp.add(nums[i]);
                            tmp.add(nums[j]);
                            tmp.add(nums[left]);
                            tmp.add(nums[right]);
                            set.add(tmp);

                            left++;
                            right--;
                        }
                        else if(sum < target){
                            left++;
                        }
                        else{
                            right--;
                        }
                    }

                }
            }
            List<List<Integer>> res = new ArrayList<>();
            for(List<Integer> i: set){
                res.add(i);
            }
            return res;
            //    return new ArrayList<>(set);

        }
    }
