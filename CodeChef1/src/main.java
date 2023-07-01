/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        //number of test cases
        int n = scn.nextInt();

        //first line number of items and minfreshness separated by spaces
        int nitms = scn.nextInt();//2
        int minfreshness = 0;//20
        //second line n space separated integers number of freshness value of each item

        int[] freshness = new int[nitms];
        for(int i = 0 ; i < nitms ; i++){
            freshness[i] = scn.nextInt();
        }

        //decided to purchase all items having freshness value greater than equel to X

        int[] costofeachitem = new int[nitms];
        for(int  j = 0 ; j < nitms  ; j++){
            costofeachitem[j] = scn.nextInt();
        }

        for(int k = 0 ; k < nitms ; k++){
            minfreshness = scn.nextInt();
            if(freshness[k] <= minfreshness){
                System.out.print(minfreshness + " ");
            }
            System.out.println();
        }














// 		int ans = 0;
//         for(int k  = 0 ; k < n ; k++){
//             for(int val : nitms){
//                 if(minfreshness >= val ){
//                     ans += val;
//                 }else {
//                     ans = 0;
//                 }
//             }
//         }
//         System.out.println(ans);

    }
}
