import java.util.Scanner;

public class factorialOfNUmber {

    public static void main(String[] args) {
        System.out.println("enter the numer to find factorial ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int factorial= 1;

        while(n>0){
            factorial = factorial*n;
            n--;

        }
        System.out.println("factorial of the number is "+ factorial);
    }

}
