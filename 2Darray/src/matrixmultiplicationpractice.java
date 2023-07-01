import java.util.Scanner;

public class matrixmultiplicationpractice {
    /*
        1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to display the contents of 2d array as suggested by output format below
     */

    public static void main(String[] args) {
        Scanner scn  = new Scanner( System.in);
        int n = scn.nextInt();

        int n1 = scn.nextInt();
        int m1 = scn.nextInt();

        int[][]one = new int[n1][m1];
        for( int i =0 ; i <one.length ; i++){
            for( int j =0 ; j< one[0].length ; j++){
                one[i][j] = scn.nextInt();
            }
        }
    }
}
