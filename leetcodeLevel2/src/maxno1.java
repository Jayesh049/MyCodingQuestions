//import java.util.Scanner;
import java.util.*;
public class maxno1 {
//Leetcode 485
//maximum consecutive ones




    public static void main (String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i  < n; i++) {
            arr[i] = scn.nextInt();
        }
            int tl  = 0 ;
            int ml = 0;

            for (int i = 0 ; i < arr.length ; i++) {
                if (arr[i] == 1) {
                    tl++;
                    if (tl > ml) {
                        ml = tl;
                    }
                }  else if (arr[i] == 0) {
                        if(tl > ml){
                            ml = tl;
                        }
                        tl = 0;
                    }
//                    Math.max(ml , tl);
            }
        System.out.println(Math.max(ml , tl));
        }

    }

