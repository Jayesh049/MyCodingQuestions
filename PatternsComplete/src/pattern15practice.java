import java.util.Scanner;

public class pattern15practice {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nsp = n / 2;
        int nst = 1;
        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" \t");
            }
            // so we have to increase the number inside the row to do this we have to initialise the new variable
            int ival = val; // ival is initialised to val variable
            for (int j = 1; j <= nst; j++) {
                System.out.print(ival + "\t");
                if (j <= nst / 2) {    //inside the row we will do if else so that  half of the loop val is increase
                    ival++;
                } else {
                    ival--;    // loop will decrease after half
                }
            }
                // val++;
                if (i <= n / 2) {
                    val++; // numbers got increased before half
                } else {    //number got decreased  after half
                    val--;
                }

                System.out.println();
                if (i <= n / 2) {
                    nsp--;
                    nst += 2;
                } else {
                    nsp++;
                    nst -= 2;
                }
            }
        }

    }
