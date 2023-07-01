import java.util.Scanner;

public class DisplayReverseArrayInRecursion {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int i = 0 ; i <arr.length ; i++){
            arr[i] = scn.nextInt();
        }

        DisplayArrayReverse(arr, 0);
    }
    public static void DisplayArrayReverse( int[]arr , int i){
        if( i == arr.length){
            return;
        }
        DisplayArrayReverse(arr , i+1);
            System.out.println(arr[i]);

    }
}
