import java.util.Scanner;

public class gcdandlcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();



        int tn1 = n1;
        int tn2 = n2 ;
        while( tn1 % tn2 != 0){
            int r = tn1%tn2;
            tn1 = tn2 ; //yaha tn2 tn1 ko assgin ho jaega
            tn2 = r; // jo remainder(r) aaya hai wo tn2 ko assgin ho jaega


        }
        int gcd = tn2;
        int lcm = n1 *n2/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
