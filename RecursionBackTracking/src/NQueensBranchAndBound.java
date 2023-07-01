import java.io.*;
import java.util.*;
public class NQueensBranchAndBound {


    public static void queenBnB(boolean[][] board, boolean[] cols, boolean[] dld, boolean[] drd, int qpsf, int tq, String asf) {

        if (qpsf == tq) {
            System.out.println(asf + ".");
            return;
        }


        for (int i = 0; i < board.length; i++) {
            //yaha par qpsf = row hai and col  = i hai apna
            if (cols[i] == false && dld[qpsf + i] == false && drd[qpsf - i + board.length - 1] == false) {
                board[qpsf][i] = true;

                cols[i] = true;
                dld[qpsf + i] = true;
                drd[qpsf - i + board.length - 1] = true;

                queenBnB(board, cols, dld, drd, qpsf + 1, tq, asf + qpsf + "-" + i + ", ");

                board[qpsf][i] = false;
                cols[i] = false;
                dld[qpsf + i] = false;
                drd[qpsf - i + board.length - 1] = false;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean[][] board = new boolean[n][n];
        //write your code here4
        boolean[] cols = new boolean[board.length];
        boolean[] dld = new boolean[2 * board.length - 1];
        boolean[] drd = new boolean[2 * board.length - 1];
        queenBnB(board, cols, dld, drd, 0, board.length, "");

    }

}