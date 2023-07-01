import java.util.Scanner;

public class targetsum {

    public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();

          int [] arr = new int[n];
          for(int i = 0 ; i<n ; i++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        printtargetsumsubsets(arr , 0 ,"", 0 ,tar);
    }
    public static void printtargetsumsubsets(int[]arr , int idx ,String set, int sos , int tar){
        if(sos > tar){
            return;
        }
        if(idx == arr.length){
            if(sos == tar){
                System.out.println(set + ".");
            }
            return;
        }
        printtargetsumsubsets(arr , idx +1 , set + arr[idx] +"," ,sos + arr[idx] , tar);
        printtargetsumsubsets(arr , idx +1 ,set , sos ,tar);
    }
}
