import java.io.*;
import java.util.*;
public class AllPalindromicPartitions {




        public static boolean  isPalindrome(String str){
            int i = 0 ;
            int j = str.length() -1;
            while( i < j){
                char left = str.charAt(i);
                char right = str.charAt(j);
                if(left != right){
                    return false;
                }


                i++;
                j--;
            }
            return true;
        }

        public static void solution(String str, String asf) {
            //write you code here
            if(str.length() == 0){
                System.out.println(asf);
                return;
            }


            for(int i = 0 ; i < str.length() ;i++){
                String prefix = str.substring(0 , i+ 1);
                String ros = str.substring(i + 1);
                if(isPalindrome(prefix)){
                    solution(ros , asf + "(" + prefix + ") ");
                }
            }

        }
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String str = scn.nextLine();
            solution(str, "");
        }

    }
/*
1. You are given a string of length n.
2. You have to partition the given string in such a way that every partition is a palindrome.

Note -> Check out the question video and write the recursive code as it is intended without
               changing signature. The judge can't force you but intends you to teach a concept.


Sample Input
pep
Sample Output
(p) (e) (p)
(pep)
 */
