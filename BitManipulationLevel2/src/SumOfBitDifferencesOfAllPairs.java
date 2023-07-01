import java.io.*;
import java.util.*;
public class SumOfBitDifferencesOfAllPairs {



        public static long solution(int[] arr){
            //write your code here
            long ans = 0;

            for(int i = 0 ; i < 32 ; i++){
                long count = 0;
                for(int j = 0 ; j < arr.length ;j++){
                    //counting bits off
                    if((arr[j] & ( 1<< i)) == 0){
                        count++;
                    }
                }
                ans += (count * (arr.length - count ) * 2) ;
            }
            return ans;
        }

        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < arr.length; i++){
                arr[i] = scn.nextInt();
            }
            System.out.println(solution(arr));
        }

    }
/*
1. You are given an array of n numbers.
2. You have to find the sum of bit differences in all pairs that can be formed from n numbers.
3. Bit difference of two numbers is defined as the count of different bits at same positions in binary representations of two numbers.

Sample Input
3
1 2 3
Sample Output
8
 */