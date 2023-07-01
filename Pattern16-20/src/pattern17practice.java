import java.util.Scanner;

public class pattern17practice {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nsp = n / 2; // we know that why we have taken n/2 i.e 5/2 = 2.
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
          //This part is for 3rd line
                if (i == n / 2 + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            //This is for number of stars
                for (int j = 1; j <= nst; j++) {
                    System.out.print("*\t");
                }
                if (i <= n / 2) {
                    nst++;
                } else {
                    nst--;
                }
            System.out.println();

            }
        }
    }

