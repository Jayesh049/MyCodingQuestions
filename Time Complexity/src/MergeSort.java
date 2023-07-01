import java.util.Scanner;

public class MergeSort {





    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n  =scn.nextInt();
        int[]arr = new int[n];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = scn.nextInt();
        }
          arr = mergeSort(arr ,0 , arr.length-1);
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println(".");
    }

    public static int[] mergeSort(int[] arr , int lo ,int hi){
       if(lo == hi){//agar lo hi ke barabar ho jaaye matlab ek hi element bacha hai toh hum
           int[]ba = new int[1];//base array usme ek hi element hai ek size ka array daalenge
           ba[0] = arr[lo];//
           return ba;
       }

        int mid = (lo+hi)/2;
              int[] fsh =    mergeSort(arr,lo , mid);//first sorted half
              int[] lsh=     mergeSort(arr, mid+1 , hi);//second sorted half
               int[] fsa =     merge2SortedArrays(fsh , lsh);
               return fsa;
    }
    public static int[] merge2SortedArrays(int[] a, int[] b){
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


}
