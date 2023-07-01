import java.io.*;
import java.util.*;
public class NqueensPermutations2dAs1dQueenChooses {



            public static boolean IsQueenSafe(int[][] chess, int row, int col) {
                //for previous horizontalleft row
                for(int  i = row ,j = col -1 ; j >= 0 ; j--){
                    if(chess[i][j] != 0){
                        return false;
                    }
                }
                //for forward horizontal right row
                for(int  i = row ,j = col +1 ; j  < chess.length ; j++){
                    if(chess[i][j] != 0){
                        return false;
                    }
                }

                //for previous vertical column up
                for( int i = row  -1 ,j = col  ; i >= 0 ; i--){
                    if(chess[i][j]!= 0){
                        return false;
                    }
                }
                //for previous vertical column down
                for( int i = row  + 1 ,j = col  ; i < chess.length ; i++){
                    if(chess[i][j] != 0){
                        return false;
                    }
                }
                //for previous diagonal left up
                for(int  i = row -1 ,j = col -1 ; i>= 0 &&j >= 0 ;i--, j--){
                    if(chess[i][j] != 0){
                        return false;
                    }
                }
                //for diagonal right up
                for(int  i = row -1  ,j = col  +1 ; i>= 0 && j < chess.length; i-- , j++){
                    if(chess[i][j] != 0){
                        return false;
                    }
                }
                //for diagonal right down
                for(int  i = row  +1  ,j = col  +1 ; i < chess.length && j < chess.length; i++ , j++){
                    if(chess[i][j] != 0){
                        return false;
                    }
                }
                //for previous diagonal left down
                for(int  i = row +1 ,j = col -1 ; i < chess.length &&j >= 0 ;i++, j--){
                    if(chess[i][j] != 0){
                        return false;
                    }
                }
                return true;
            }

        public static void nqueens(int qpsf, int tq, int[][] chess) {
                if (qpsf == tq) {
                    for(int i = 0 ; i < chess.length ;i++){
                        for(int j = 0 ; j < chess.length ;j++){
                            if(chess[i][j] ==0){
                                System.out.print("-\t");
                            }else{
                                System.out.print("q" + chess[i][j] + "\t");
                            }
                        }

                        System.out.println();
                    }
                    System.out.println();

                    return;
                }

                for (int i = 0; i < chess.length * chess.length; i++) {
                    int row = i / chess.length;
                    int col = i % chess.length;

                    if (chess[row][col] == 0 && IsQueenSafe(chess, row, col)) {
                        chess[row][col] = qpsf + 1;
                        nqueens(qpsf + 1, tq, chess);
                        chess[row][col] = 0;
                    }
                }
            }


            public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int[][] chess = new int[n][n];

            nqueens(0, n, chess);
        }
    }
