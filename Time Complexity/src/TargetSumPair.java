import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPair {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tsp = scn.nextInt();
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

    //sort
        Arrays.sort(arr);//nlogn time
//element pehle sort ho chukka hai toh obviously badaa waala last me aaega
        //meet in the middle
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] > tsp) {
                right--;
            } else if (arr[left] + arr[right] < tsp) {
                left++;
            } else {
                System.out.println(arr[left] + " " + arr[right]);
                left++;
                right--;
            }

        }
    }
}
