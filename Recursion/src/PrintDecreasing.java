import java.util.Scanner;

public class PrintDecreasing {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDecreasing1(n);
    }
    public static void printDecreasing1(int n){
      if(n == 0){
          return;
      }
        System.out.println(n);
        printDecreasing1(n-1);
    }
}
