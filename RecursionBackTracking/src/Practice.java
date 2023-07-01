import java.util.*;
import java.io.*;
public class Practice {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
     int n = scn.nextInt();
     int [] nums = new int[n];
     for(int i = 0 ;i < nums.length ;i++){
         nums[i] = scn.nextInt();
     }
     int ans = practice(nums);
    }
    public static int practice(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;


        Arrays.sort(nums);
        //0 1 3 4 4 5
        int  i = 0 ;
        int j = nums.length -1;

        while( i < j){


            int a = nums[i];//0
            int b = nums[j];//5
            int sum = a + b / 2;
            System.out.println(sum);
            i++;
            j--;

            map.put(sum , map.getOrDefault(sum , 0) + 1);
            //base case
            // if(a + b <= 2){
            //     return 1;
            // }

        }
        for(int val :map.keySet()){
            int mf = map.get(val);//
//            System.out.println(mf);
//            System.out.println(val);
            if(mf < 2){
                ans = mf;
//                System.out.println(ans);
            }
        }
        return ans;
    }

}

//
//class Solution {
//    public int countGoodStrings(int low, int high, int zero, int one) {
//
//        int ans = 0;
//        //my mind says
//        //agar low 3 hai high 3 hai zero 1 hai one 1 hai
//        //matlab jab mai high bolu toh wo boundary bnaye ki maximum 3 bits aa skte hai mtlb 7 -111
//        //agar low bolu toh toh wo bounday bnaye ki minimum me 3 bots aa skte hai mtlb 0 -000
//        //ab zero aur one decide karenge ki inke bich me 1 kitne aayenge agar one = 1 hai 001 , 010 , 100,
//        //zero = 1 hai toh 110,101,011
//        //aise answer 8 aa jayega count
//
//        // ArrayList<Integer> list = new ArrayList<>();
//
//
//    }
//}
//}

//6238. Count Ways To Build Good Strings
//User Accepted:2728
//User Tried:4280
//Total Accepted:2846
//Total Submissions:8045
//Difficulty:Medium
//Given the integers zero, one, low, and high, we can construct a string by starting with an empty string, and then at each step perform either of the following:
//
//Append the character '0' zero times.
//Append the character '1' one times.
//This can be performed any number of times.
//
//A good string is a string constructed by the above process having a length between low and high (inclusive).
//
//Return the number of different good strings that can be constructed satisfying these properties. Since the answer can be large, return it modulo 109 + 7.


// Split Message Based on Limit
//User Accepted:301
//User Tried:460
//Total Accepted:319
//Total Submissions:855
//Difficulty:Hard
//You are given a string, message, and a positive integer, limit.
//
//You must split message into one or more parts based on limit. Each resulting part should have the suffix "<a/b>", where "b" is to be replaced with the total number of parts and "a" is to be replaced with the index of the part, starting from 1 and going up to b. Additionally, the length of each resulting part (including its suffix) should be equal to limit, except for the last part whose length can be at most limit.
//
//The resulting parts should be formed such that when their suffixes are removed and they are all concatenated in order, they should be equal to message. Also, the result should contain as few parts as possible.
//
//Return the parts message would be split into as an array of strings. If it is impossible to split message as required, return an empty array.
//
//
//
//Example 1:
//
//Input: message = "this is really a very awesome message", limit = 9
//Output: ["thi<1/14>","s i<2/14>","s r<3/14>","eal<4/14>","ly <5/14>","a v<6/14>","ery<7/14>"," aw<8/14>","eso<9/14>","me<10/14>"," m<11/14>","es<12/14>","sa<13/14>","ge<14/14>"]
//Explanation:
//The first 9 parts take 3 characters each from the beginning of message.
//The next 5 parts take 2 characters each to finish splitting message.
//In this example, each part, including the last, has length 9.
//It can be shown it is not possible to split message into less than 14 parts.
//Example 2:
//
//Input: message = "short message", limit = 15
//Output: ["short mess<1/2>","age<2/2>"]
//Explanation:
//Under the given constraints, the string can be split into two parts:
//- The first part comprises of the first 10 characters, and has a length 15.
//- The next part comprises of the last 3 characters, and has a length 8.
//class Solution {
//    public String[] splitMessage(String message, int limit) {
//
//    }
//}
//class Solution {
//    public int distinctAverages(int[] nums) {
//        Arrays.sort(nums);
//        Set<Integer> set = new HashSet<>();
//        for(int i = 0;i < nums.length/2;i++){
//            set.add(nums[i] + nums[nums.length-1-i]);
//        }
//        return set.size();
//    }
//}