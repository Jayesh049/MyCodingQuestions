import java.util.Scanner;

public class primefactorisation {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();


        for( int f = 2 ; f * f<= n ; f++){//factorisation start from 2 and if number is not multipliable then we are not able to do prime f*f =n
            while( n %f ==0){ //number%factorisd ==0
                System.out.print(f +" " );
                n = n /f;
            }
        }
        if( n > 1 ){
            System.out.print(n);
        }
    }
}
