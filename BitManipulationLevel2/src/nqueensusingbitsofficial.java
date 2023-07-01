import java.io.*;
import java.util.*;
public class nqueensusingbitsofficial {



        public static void solution(boolean[][] board, int row, int cols, int ndiag, int rdiag, String asf) {
            // write your code here'
            if(row == board.length){
                System.out.println(asf + ".");
                return;
            }


            for(int i = 0 ; i < board.length ;i++){
                //columnd and ndiag and rdiag sabka bitmask nikal karke column & bitmask karke agar 0 aata hai toh hi hum uss column me daal skenge
                if((cols & (1 << i)) == 0 &&
                        (ndiag & (1 << (row +i))) ==0 &&
                        (rdiag & (1 << (row - i + board.length -1 ))) == 0){

                    board[row][i] = true;
                    //toggle ka use karke  hum on kar denge
                    cols ^=   (1 <<i);
                    ndiag ^=  (1 << (row +i));
                    rdiag ^=  (1 << (row - i + board.length -1 ));


                    solution(board , row + 1, cols , ndiag , rdiag , asf + row + "-" + i +", ");
                    board[row][i] = false;
                    //toggle ka use karke hum off kar denge
                    cols ^=   (1 <<i);
                    ndiag ^=  (1 << (row +i));
                    rdiag ^=  (1 << (row - i + board.length -1 ));


                }
            }

        }

        public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            boolean[][] board = new boolean[n][n];
            int cols = 0;
            int ndiag = 0;
            int rdiag = 0;
            solution(board, 0, cols, ndiag, rdiag, "");
        }

    }
