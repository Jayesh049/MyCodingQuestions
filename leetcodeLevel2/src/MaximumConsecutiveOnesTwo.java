import java.util.*;
public class MaximumConsecutiveOnesTwo {

//1. You are given an array(arr) which contains only 0's and 1's and a number K.
//2. You have to find the maximum number of consecutive 1's in the given array if you can flip at most K zeroes.


    //INPUT
    //6
    //1 1 0 0 1 1
    //1


    //OUTPUT
    //    3

//solution by sumeet sir alcohol + drink
        public static int solution(int[] arr, int k){
            int len = 0;

            int i = 0;
            int j = -1;
            int zc = 0;
            while(i < arr.length && j < i){
                while(i < arr.length){
                    if(arr[i] == 1){
                        // nothing to do
                    } else if(arr[i] == 0){
                        zc++;
                    }
//acquire strategy
                    if(zc <= k){
                        int tlen = i - j;
                        len = Math.max(len, tlen);
                        i++;
                    } else {
                        i++;
                        break;
                    }
                }
//release strategy
                while(j < i){
                    j++;
                    if(arr[j] == 0){
                        zc--;
                    }

                    if(zc <= k){
                        break;
                    }
                }
            }

            return len;
        }

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i  < n; i++){
                arr[i] = scn.nextInt();
            }
            int k = scn.nextInt();
            System.out.println(solution(arr,k));
        }

    }


