import java.util.Scanner;

public class pattern4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nstars = n  ;
        int nspaces = 0;
        for ( int i = 1; i<=n ;i++){
            for(int j = 1 ; j<=nspaces ; j++){
                System.out.print(" \t");
            }
            for( int j =1 ; j<= nstars ; j ++){
                System.out.print("*\t");
            }
            nspaces++;
            nstars--;
            System.out.println();
        }
    }
}
