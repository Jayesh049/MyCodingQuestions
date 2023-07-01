import java.util.Arrays;
import java.util.Scanner;

public class CheckDuplicated {

    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i <arr.length ; i++){
            arr[i] = scn.nextInt();
        }
//jaise arr me elements ye the 5 10 7 9 12 5
        Arrays.sort(arr);//nlogn
//sort hone ke baad ye aise ho gaye 5 5 7 9 10 12

        //sorting pehle hi ho gayi hai n
        //toh woh saath me aajaega


        int dup =-1 ;
        for(int i = 0 ; i <= arr.length -2 ; i++){//n // ye second last tak hi chalega kyunki arr[i+1] uske aage waale element ko lapet lega
            if(arr[i] == arr[i+1]){//yaha pr un saare elements ko 5 5 7 9 10 12 arr[i] and arr[i+1 ] se comparison karwa diya eaz peazy
                dup = arr[i];
                break;
            }
        }
        System.out.println(dup);
    }
}

//NOTE- {sorting ki time complexity nlogn hoti hai}
//(n2)