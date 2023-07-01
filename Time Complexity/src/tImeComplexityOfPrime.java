import java.util.Scanner;

public class tImeComplexityOfPrime {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();


        for (int x = 2; x <= n; x++) {   // n
            boolean xisPrime = true;

            for (int div = 2; div * div <= x; div++) { //  rootn
                if (x % div == 0) {
                    xisPrime = false;
                    break;
                }
            }
            if (xisPrime == true) {
                System.out.println(x);
            }
        }

    }

}

//So the time complexity of prime numbers is nrootn