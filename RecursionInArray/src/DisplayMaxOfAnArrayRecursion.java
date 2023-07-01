import java.util.Scanner;

public class DisplayMaxOfAnArrayRecursion {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(MaxOfArray(arr,0));
    }


        public static int MaxOfArray(int[] arr , int idx){

           if( idx == arr.length-1){
            return arr[idx];
        }
        int misa = MaxOfArray(arr , idx +1);
       if(arr[idx]>misa){
           return arr[idx];
       }
       else{
           return misa;
       }
    }
}

//        import java.io.*;
//        import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) throws Exception {
//        // write your code here
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int[]arr = new int[n];
//        for(int i = 0; i <arr.length ; i++){
//            arr[i] = scn.nextInt();
//        }
//        System.out.println(maxOfArray(arr , 0));
//        ;    }
//
//    public static int maxOfArray(int[] arr, int idx){
//        if(idx == arr.length -1 ) //-1 we are putting for not getting into out of bound
//        {
//            return arr[idx];    //and we will get return value of arrary of index
//        }
//        int misa = maxOfArray(arr ,idx +1 );//max in smaller array is misa
//
//        if(arr[idx]>misa){
//            return arr[idx];
//        }
//        else{
//            return misa;
//        }
//
//    }
//
//}