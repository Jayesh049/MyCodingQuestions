import java.util.Scanner;

public class pattern14Copy1 {


    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in);
        int n  = scn.nextInt();
        for( int i = 1 ; i <= n ; i ++){
                int val = n * i ;
            System.out.println( n+  " * " +  i + " = "+ val);
        }
    }
}
