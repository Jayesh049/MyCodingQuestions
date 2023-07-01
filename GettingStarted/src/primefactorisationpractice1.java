import java.util.Scanner;

public class primefactorisationpractice1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int f = 2; f * f <= n; f++) {
            while (n % f == 0) {
                System.out.print(f + " ");
                n = n / f;//have to decrease the number for the further process
            }
        }
        if (n > 1) {
            System.out.print(n);
        }
    }
}
