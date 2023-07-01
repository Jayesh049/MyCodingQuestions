import java.util.Scanner;

public class maxNumberN {

    public static void main(String[] args) {

        System.out.println("enter the limit");

        Scanner scn = new Scanner(System.in);

        int limit = scn.nextInt();
        int max = 0;
        for (int i = 0; i < limit; i++) { // we run the for loop that we ask the user to input

            int n = scn.nextInt();
            if (n > max) {
                max = n;
            }

        }
        System.out.println("maximum number is " + max);
    }
}
