import java.util.Scanner;

public class RadixSort11 {

    public static void radixSort(int[]arr){
        //find the max element
        int max = arr[0];
        for(int i= 0 ; i<arr.length ; i++){
            if(arr[i] > max){
                max =arr[i];
            }

        }
        int place =1 ;
        while(max/place >0){
            countSort(arr, place);
            place = place*10;
        }
    }
    public static void countSort(int[]arr ,int exp){
        int[]farr = new int[10];
        int[]ans = new int[arr.length];

        //fill in the frequency
        for(int i = 0 ; i <arr.length ; i++){
            int val = arr[i]/exp%10;
            farr[val]++;//this is position
        }

        //convert frequency arr to psa
        for(int i = 1 ; i<farr.length ; i++){
            farr[i] += farr[i-1];
        }

        //convert psa to ans
        for(int i = arr.length -1 ; i>= 0 ; i--){
            int val = arr[i]/ exp %10;
            int pos = farr[val];
            ans[pos-1] = arr[i];
            farr[val]--;//going backward so going decrementing
        }

        //convert ans to oarr
        for(int i = 0 ; i<ans.length ; i++){
            arr[i] = ans[i];
        }
        print(arr);

    }
    public static void print(int[]arr){
        for(int i = 0 ; i<arr.length ;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int[]arr = new int[n];
        for(int i = 0 ; i<arr.length ;i++){
            arr[i] = scn.nextInt();
        }
        radixSort(arr);
        print(arr);
    }
}
