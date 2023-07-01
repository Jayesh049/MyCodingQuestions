import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);

        int n= scn.nextInt();
        int temp = n;//we have stored n in temporary number
        int r,sum=0;

        while(n>0)
        {
            r = n % 10;//remainder
            n = n / 10;//quotient
            sum = sum + r * r * r;//formula = sum + r^3;
        }
        if (temp==sum) {
            System.out.println("it is armstrong");
        }else{
                System.out.println("it is not armstrong");
            }
        }
    }


