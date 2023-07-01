import java.util.Scanner;

public class matricmultiplication {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt(); //representing input in number of rows in 1st matrix
        int m1 = scn.nextInt(); // representing input in number of columns in 1st matrix
        int[][] one = new int[n1][m1]; //taking input for array for both n1 mulitply by m1
        for (int i = 0; i < one.length; i++) { // Taking loop for number of rows
            for (int j = 0; j < one[0].length; j++) { // taking loop for number of columns
                one[i][j] = scn.nextInt();  //Inserting  i and j for taking input

            }
        }
        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] two = new int[n2][m2];
        for (int i = 0; i < two.length; i++) {
            for (int j = 0; j < two[0].length; j++) {
                two[i][j] = scn.nextInt();
            }
        }

        if (m1 != n2) { //if row1 is not equal to column2
            System.out.println("invalid value");
            return;//program will end
        }
        int[][]prd= new int[n1][m2];
        for( int i = 0 ; i< prd.length ; i++){
            for (int j = 0 ; j< prd[0].length ; j++ ){
                int val = 0 ;

                for(int k = 0 ; k < m1 ; k++){
                    val  = val + one[i][k] * two[k][j];
                }
                prd[i][j] = val;
            }
        }

    }

}