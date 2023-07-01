import java.util.*;
import java.lang.*;
import java.io.*;
public class isithotorcold {
    /* package codechef; // don't place package name! */



    /* Name of the class has to be "Main" only if the class is public. */


        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();

            int[]arr = new int[n];
            for(int i = 0 ; i  < arr.length ; i++){
                arr[i] = scn.nextInt();
            }

            for(int i = 0 ; i <arr.length ;i++){
                if(arr[i] > 20){
                    System.out.println("HOT");
                }
                else{
                    System.out.println("COLD");
                }
            }
//            for(int i = 0 ; i < arr.length ; i++){
//                if(i <= 20){
//                    System.out.println("COLD");
//                }
//            }
        }


    }


