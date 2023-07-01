import java.util.Scanner;

public class MergingTwoSortedArrays {





        public static int[] mergeTwoSortedArrays(int[] a, int[] b){
            //write your code here
             int[] ans = new int[a.length + b.length];
             int i = 0 ;
             int j =0;
             int k = 0;
             while(i < a.length && j <b.length){
                 if(a[i] <= b[j]){
                     ans[k] = a[i];
                     i++;
                     k++;
                 }
                 else{
                     ans[k] = b[j];
                     j++;
                     k++;
                 }

             }

             if(i == a.length) { //agar i end par baitha hai toh kiska loop lagega(matlab i khatam ho gaya)
                 while (j < b.length) {//toh jo j ke andar sorted arrays hai wo saare fill kardo kisme
                     ans[k] = b[j];//answer ke andar
                     j++;
                     k++;

                 }
             }
             else if(j == b.length){
                 while(i < a.length){
                     ans[k] = a[i];
                     i++;
                     k++;
                 }
             }


            return ans ;
        }

        public static void print(int[] arr){
            for(int i = 0 ; i < arr.length; i++){
                System.out.println(arr[i]);
            }
        }
        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] a = new int[n];
            for(int i = 0 ; i < n; i++){
                a[i] = scn.nextInt();
            }
            int m = scn.nextInt();
            int[] b = new int[m];
            for(int i = 0 ; i < m; i++){
                b[i] = scn.nextInt();
            }
            int[] mergedArray = mergeTwoSortedArrays(a,b);
            print(mergedArray);
        }

    }

