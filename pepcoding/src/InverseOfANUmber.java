
import java.util.Scanner;

public class InverseOfANUmber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int p =1 ;
        int inverse= 0;
        while(n>0) {// ok it wil check the number is negative
            int r = n % 10;
            int quotient = n / 10;


            n = quotient;
            //r@p->p@r->p*pow(10,r-1)
            inverse = inverse + p * (int) Math.pow(10, r - 1);
            p++;
        }
        System.out.println(inverse);


    }
}
