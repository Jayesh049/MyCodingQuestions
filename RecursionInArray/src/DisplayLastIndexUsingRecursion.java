import java.util.Scanner;

public class DisplayLastIndexUsingRecursion {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();//number
        int[]arr = new int[n];//array
        for(int i = 0 ; i<arr.length ;i++){
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();//uske baad data hai
        System.out.println(lastIndex(arr,0,data));

    }
    public static int lastIndex(int[]arr , int idx , int x) {
              if(arr.length == idx){
                  return -1;
              }

              int liisa =  lastIndex(arr , idx +1, x);
              if(liisa == -1){
                  if(arr[idx] == x ){
                      return idx;
                  }
                  else{
                      return -1;
                  }
              }
                  else{
                      return liisa;
                  }

    }
    }

