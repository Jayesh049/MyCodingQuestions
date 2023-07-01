import java.io.*;
import java.util.*;
public class CheckDivisibilityBy3Official {

        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            String str = scn.nextLine();

            //write your code here
            int oddposition = 0;
            int evenposition = 0;

            for(int i = 0  ; i < str.length() ;i++){
                int bit  = str.charAt(i) - '0';

                if(i % 2 == 0){
                    evenposition += bit;

                }else{
                    oddposition += bit;
                }
            }

            int delta = evenposition - oddposition;

            if(delta % 3 == 0){
                System.out.println(true);
            }else{
                System.out.println(false);
            }

        }


}

//1. You are given a binary string which represents a number.
//2. You have to check whether this number is divisible by 3 or not.
//3. Print 'true' if it is divisible by 3, otherwise print 'false'.
/*
Sample Input
10010101010001

Sample Output
false
 */
