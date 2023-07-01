import java.util.Scanner;

public class firstIndexOfArrayRecursion {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int[]arr = new int[n];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        System.out.println(FirstIndexOfArrayUsingRecursion(arr,0,data));
    }

    public static int FirstIndexOfArrayUsingRecursion(int[]arr, int idx , int data){

        if(idx ==arr.length){
            return -1;
        }
        if(arr[idx] ==data){
              return idx;
        }
        else{
            int fisa = FirstIndexOfArrayUsingRecursion(arr,idx+1 , data);
                   return fisa;
        }



    }
}
