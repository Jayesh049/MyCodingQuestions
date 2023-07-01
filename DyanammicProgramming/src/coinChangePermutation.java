import java.io.*;
import java.util.*;

public class coinChangePermutation {



        public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);

            int n = scn.nextInt();

            int[] coins = new int[n];
            for(int i = 0 ; i <coins.length ; i++ ){
                coins[i] = scn.nextInt();
            }
            int amt = scn.nextInt();

            System.out.println(coinChangePermutation(coins , amt));

        }

        public static int coinChangePermutation(int[] coins , int tar){

            int[]dp = new int[tar + 1];
            dp[0] = 1;//dp ke array me 0th element me jaane ke 2 , 3, 5 ,7 compare karke jaane ka ek tareeka hai

            for(int t = 1 ; t<= tar ; t++){//loop chalayenge 1 se target ke array tak
                for(int coin : coins){//coins par loop lagayenge coin naya element initialise karenge
                    if(t - coin >= 0){//agar t = 7 hai aur coin 2 hai 7-2 = 5 waise hi 3 , 5, 7 ke liye karenge taaki negative numbers enter na ho jaaye
                        dp[t] += dp[t - coin];//agar dp[8] ke liye nikal rahe hai hum log toh
                        //dp[8] me baari baari coins add karenge like 8-2 =6 ,8 -3 =5 , 8-5 =3 ,8-7 =1 toh 6 , 5 , 3 ,1 ki values ko add karenge baari baari uss dp[8] me
                    }
                }

            }
            return dp[tar];//phir target return kar denge

        }
    }

