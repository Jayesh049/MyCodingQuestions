import java.io.*;
import java.util.*;
public class onerepeatingandonemissingofficial {



        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n; i++){
                arr[i] = scn.nextInt();
            }
            solution(arr);
        }

        public static void solution(int[] arr){
            //write your code here
            int ans = 0;
            //finding xor of given value
            for(int val : arr){
                ans  =ans ^ val;
            }

            //inserting normal values in order
            for(int i = 1 ; i <= arr.length ;i++){
                ans = ans ^ i;
            }

            //finding xor for given values
            int rmsb = (ans & -ans);

            int setA  = 0;
            int setB = 0;

            for(int val : arr){
                if(( val & rmsb ) == 0){
                    setA = setA ^ val;
                }else{
                    setB = setB ^ val;
                }
            }

            //finding xor for created values
            for(int i = 1; i <= arr.length ;i++){
                if(( i & rmsb) ==0){
                    setA = setA ^ i;
                }else{
                    setB = setB ^ i;
                }
            }

            //printing
            for(int val : arr){
                if(val  == setA){
                    System.out.println("Missing Number -> " + setB);
                    System.out.println("Repeating Number -> " + setA);
                    break;
                }else if(val == setB){
                    System.out.println("Missing Number -> " + setA);
                    System.out.println("Repeating Number -> " + setB);
                    break;
                }
            }

        }

    }
