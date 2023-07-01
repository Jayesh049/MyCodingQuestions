import java.io.*;
import java.util.*;
public class LargestNumberPossibleAfterAtMostKSwaps {



        static String max;
        public static void findMaximum(String str, int k) {
            //write your code here

        }
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String str = scn.next();
            int k = scn.nextInt();
            max = str;
            findMaximum(str, k);
            System.out.println(max);
        }

    }
/*
1. You are given a string which represents digits of a number.
2. You have to create the maximum number by performing at-most k swap operations on its digits.

Note -> Check out the question video and write the recursive code as it is intended without
               changing signature. The judge can't force you but intends you to teach a concept.

Sample Input
1234567
4
Sample Output
7654321
 */