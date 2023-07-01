import java.util.*;
public class AllRepeatingExceptTwo {





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
            for(int val : arr){
                ans = ans ^ val;

            }

            int rmsb = (ans & -ans);
            System.out.println(rmsb);
            int setA = 0;
            int setB =0;
            for(int val : arr){
                if((val & rmsb) == 0){
                    setA = setA ^ val;
                }else{
                    setB = setB  ^ val;
                }
            }


            if(setA < setB){
                System.out.println(setA);
                System.out.println(setB);
            }else{
                System.out.println(setB);
                System.out.println(setA);
            }
        }


    static int findOnlySetBitPos(int n){
        return (int)((Math.log10(n)) / Math.log10(2)) + 1;
    }

    static int positionOfRightmostSetBit(int num){
        if((num & 1) != 0) return 1;

        // Step 1
        int andOp = num & (num - 1);
        // Step 2
        int xorOp = num ^ andOp;
        // Step 3
        return findOnlySetBitPos(xorOp);
    }
    }

