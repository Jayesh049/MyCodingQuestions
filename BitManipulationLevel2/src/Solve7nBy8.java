import java.io.*;
import java.util.*;
public class Solve7nBy8 {



        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            //write your code here
            System.out.println(((n  << 3 ) - n)>> 3);
        }

    }

    /*

    1. You are given a number n.
2. You have to calculate the value of 7n/8 without using division and multiplication.

    Sample Input
      15
    Sample Output
      13
     */