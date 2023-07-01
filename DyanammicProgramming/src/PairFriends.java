import java.io.*;
import java.util.*;
public class PairFriends {




        public static void main(String[] args) throws Exception {
            // write your code here
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();

            int[]dp = new int[n+ 1];
            dp[1] = 1;
            dp[2] = 2;

            for(int i = 3; i<= n ; i++){
                dp[i] = dp[i -1 ] + dp[i -2]*(i -1);
                //dp of i -1 ka matlab hai mai nahi aaunga mtlb n-1 <--n
                //dp of i -2 ka matlab hai mai aaunga toh 2 elements banenge [n -2]3 ke liye aur abhi mai khud aaunga toh i -1 bhi hoga toh isliye dp of i -2 ko multiply kiya i-1 k saath
            }

            System.out.println(dp[n]);
        }

    }

