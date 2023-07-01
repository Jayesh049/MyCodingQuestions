import java.util.*;
public class fourSumTwo {
//Leetcode 454
        public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            int n = nums1.length;
            int res=  0;
            HashMap<Integer , Integer> map =new HashMap<>();

            for(int i = 0 ; i < n ; i++){//nums 1 ke andar loop lagaa lo
                for(int j = 0 ; j< n;j++){
                    map.put(nums1[i] + nums2[j] , map.getOrDefault(nums1[i] + nums2[j] , 0) + 1);
                }
            }

            for(int i = 0 ; i< n ;i++){
                for(int j = 0 ; j< n;j++){
                    res += map.getOrDefault(-1 *(nums3[i]+ nums4[j]) , 0);
                }
            }
            return res;
        }
    }
//// Tc  O(n^2);
// Sc O(n^2);

// class Solution {
//     public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

//         HashMap<Integer,Integer> map = new HashMap<>();

//         for(int n1 :nums1){   //nums1 array ke andar loop lagaa diya
//             for(int n2:nums2){//nums1 array ke andar loop lagaa diya
//                 int sum = n1+n2;
//                 map.put(-sum,map.getOrDefault(-sum,0)+1);
//             }
//         }
//         int tuple_Count =0;
//         for(int n3 :nums3){
//             for(int n4:nums4){
//                 int sum = n3+n4;
//                tuple_Count+=map.getOrDefault(sum,0);
//             }
//         }
//         return tuple_Count;
//     }
// }
