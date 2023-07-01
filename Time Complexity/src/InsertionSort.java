import java.util.Scanner;

public class InsertionSort {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[]arr = new int[n];
        for(int i = 0 ; i <arr.length ; i++){
            arr[i] = scn.nextInt();

        }

        for(int journey =1 ; journey <= arr.length-1 ;  journey++){
            for(int j = journey-1 ; j >= 0 ; j--){
                if(arr[j]      >    arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
                else{
                    break;
                }
            }
        }

        for(int val:arr){
            System.out.println(val + " ");
        }
        System.out.println(".");
    }
}
