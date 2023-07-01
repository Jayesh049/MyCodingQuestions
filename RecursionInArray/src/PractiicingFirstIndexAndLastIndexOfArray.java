import java.util.Scanner;

public class PractiicingFirstIndexAndLastIndexOfArray {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int[]arr = new int[n];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = scn.nextInt();

        }
        int data = scn.nextInt();
        int li = firstIndex(arr , 0 , data );
        System.out.println(li);
    }

    public static int firstIndex(int[] arr , int idx , int data ) {
        if (arr.length == idx) {
            return -1;
        }


        if(arr[idx] == data){
            return idx;
        }
        else{
            int fiisa = firstIndex(arr, idx + 1, data);
            return fiisa;
        }

    }
}
