import java.io.*;
import java.util.*;
public class CountSetBitsInFirstNNaturalNumbers {

    public class Main {

        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            System.out.println(solution(n));
        }

        public static int solution(int n){
            if(n == 0){
                return 0;
            }

            int x = biggestPowerof2lessthanOrequalTon(n);
            int bitsStill2x = x * ( 1 << (x -1));//x * 2^ x -1
            int countOfMSbitsafter2x = n - ( 1 << x) + 1;//n - 2^x + 1
            int rob = solution(n - (1 << x ));// n -2^x

            return bitsStill2x  +countOfMSbitsafter2x + rob;

        }
        public  static int biggestPowerof2lessthanOrequalTon(int n){
            int x = 0;
            while( (1<< x) <= n){
                x++;
            }
            return x -1;
        }

    }
}
/*
1. You are given a number n.
2. You have to print the count of set bits of first n natural numbers.

Sample Input
17
Sample Output
35
 */
