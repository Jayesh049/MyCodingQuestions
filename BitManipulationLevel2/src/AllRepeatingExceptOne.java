import java.util.*;
public class AllRepeatingExceptOne {


    public class Main {

        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n; i++){
                arr[i] = scn.nextInt();
            }

            int ans = 0;
            for(int i = 0 ;i < arr.length ; i++){
                int val = arr[i];
                ans = ans ^ val;

            }
            System.out.println(ans);

        }

    }
}