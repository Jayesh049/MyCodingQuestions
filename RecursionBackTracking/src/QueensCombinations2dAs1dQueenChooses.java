import java.io.*;
import java.util.*;
public class QueensCombinations2dAs1dQueenChooses {


    public static void queensCombinations(int qpsf, int tq, boolean[][] chess, int lcno) {
        if (qpsf == tq) {
            for (int row = 0; row < chess.length; row++) {
                for (int col = 0; col < chess.length; col++) {
                    if (chess[row][col] == false) {
                        System.out.print("-\t");
                    } else {
                        System.out.print("q\t");
                    }
                }
                System.out.println();
            }
            System.out.println();
            return;
        }


        for (int bno = lcno + 1; bno < chess.length * chess.length; bno++) {
            int row = bno / chess.length;
            int col = bno % chess.length;
            if (chess[row][col] == false) {
                chess[row][col] = true;
                queensCombinations(qpsf + 1, tq, chess, bno);
                //or hum ye bhi likh skte hai
                {queensCombinations(qpsf + 1, tq, chess, row * chess.length + col);}
                chess[row][col] = false;
            }


        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] chess = new boolean[n][n];

        queensCombinations(0, n, chess, -1);
    }
}