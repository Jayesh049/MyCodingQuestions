import java.util.Scanner;

public class spanOfArray {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the number for which you want to find span");
        int n = scn.nextInt();
        int[]arr = new int[n];

        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = scn.nextInt(); //Taking input in array
        }
        int  max = arr[0]; // we have letting arr[0] is max
        int min = arr[0]; // we are assuming ar[0] is min
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i]> max){    //if arr[i] is greater than max
                max = arr[i];  // max is assigning to arr[i]
            }
            if(arr[i] < min){   // if arr[i] is less than max
                min  = arr[i];  // min is assgning and will move forward
            }

        }
        int span = max-min ;
        System.out.println(span);
    }
}
