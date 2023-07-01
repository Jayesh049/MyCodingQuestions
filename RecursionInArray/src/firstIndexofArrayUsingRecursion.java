import java.util.Scanner;

public class firstIndexofArrayUsingRecursion {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();///number
        int[] arr = new int[n];//arr
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();//data
        System.out.println(firstIndex(arr, 0, data));
    }


    public static int firstIndex(int[]arr , int idx ,int  x){
        if(arr.length == idx){
            return -1;
    }
        int fiisa = firstIndex(arr , idx+1 , x);
        if(arr[idx] == x){
            return idx;
        }
        else{
            return fiisa;
        }
}
}