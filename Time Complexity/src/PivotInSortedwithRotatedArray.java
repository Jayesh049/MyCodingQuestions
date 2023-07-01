import java.util.Scanner;

public class PivotInSortedwithRotatedArray {



    public static int findPivot(int[] arr){
        int lo = 0 ;
        int hi = arr.length-1;
        while(lo < hi){
            int mid = (lo+hi)/2;
            if(arr[mid] <arr[hi]){
                hi = mid;
            }
            else{
                lo = mid+1;
            }

        }
        return arr[hi];
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = scn.nextInt();

        }
        int pivot = findPivot(arr);
        System.out.println(pivot);
    }
}
