import java.util.Scanner;

public class AllIndecesOfArray {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();//value
        int[] iarr = allIndices(arr, x, 0, 0);//new public array hai jisme sab define kar rahe hai

        //ye loop bhi smjha do please
        if(iarr.length == 0){//iarr.length 0 hai toh space print kar dena aur return kar dena
            System.out.println();
            return;
        }
        //ye loop kyo lagaya hai please explain
        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);//
        }
    }

    public static int[] allIndices(int[]arr , int x , int idx, int fsf){

        if(idx == arr.length){//base case
            return new int[fsf];//returning new address of array
        }
        if(arr[idx] == x){
            int[] iarr = allIndices(arr , x , idx+1, fsf+1);//if value is equal to arr[idx](means inside the array)then we will increase index+1 and found so far value +1

            iarr[fsf] = idx;//we are initializing fsf to index to that we can store it into in new array
            return iarr;//we are returning new array
        }
        else{
            int[] iarr = allIndices(arr , x, idx+1 ,fsf);//if value is not equal to value then just index will increase
            return iarr;//returning a new array
        }

    }
}
