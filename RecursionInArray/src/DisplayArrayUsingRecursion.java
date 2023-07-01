import java.util.Scanner;

public class DisplayArrayUsingRecursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
       for(int i = 0 ; i<arr.length ;i++){
           arr[i] = scn.nextInt();
       }
       displayArr(arr , 0);
    }
    public static void displayArr(int[] arr, int i ){
        if(i == arr.length){
            return;
        }
        System.out.println(arr[i]);//isme array of index ki value print karni hai

        displayArr(arr, i+1);//index ko i+1 karte jaana hai array wahi rahega
    }
}
