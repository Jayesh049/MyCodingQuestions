import java.io.*;
import java.util.*;

public class SameNumberOfSetBitsAsThatOfN {
//pepcoder and bits

       //permutation and combination formula
        public static long ncr(long n, long r){
            if(n < r){
                return 0L;
            }

            long res = 1L;

            for(long i = 0L; i < r; i++){
                res = res * (n - i);
                res = res / (i + 1);
            }

            return res;
        }

         //solution
        public static long solution(long n, int k, int i) {
            if(i == 0){
                return 0;
            }
            long mask = 1L << i;

            long res =0;

            //what if n & mask is 0 then we will reduce i to -1
            if( (n & mask) == 0 ){
                res = solution(n , k  , i - 1);
            }
            //what if n & mask is 1 then we will make res0 and res1
            //we will do i -1 and k - 1 , if number is 1 and if number is 0 we will simple find the ncr formula
            else{
                long res0 = solution(n , k - 1, i -1);
                long res1 = ncr(i , k);
                res = res1 + res0;

            }
            return res;

        }

        //count set bit
        public static int csb(long n){
            int res = 0;

            //if n is positive
            while(n > 0){
                //finding the rightsetbit
                long rsb = n & -n;
                n -= rsb;
                res++;
            }

            return res;
        }

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            long n = scn.nextLong();
            int k = csb(n);
            System.out.println(solution(n, k, 63));
        }


    }
