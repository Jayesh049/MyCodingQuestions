import java.util.Scanner;

public class primefactorisationpractice {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for( int j = 2 ; j* j <= n ; j++){
            while( n % j  ==0){ // number % factorial = 432 % 2 ==0 then the loop will run for further process
                System.out.print( j + " "); // we will print j if the number is divisible
                n = n / j; // 432 / 2 =216 so the next number will be n
            }
        }
        if( n> 1 ){
            System.out.print(n);
        }
    }
}
