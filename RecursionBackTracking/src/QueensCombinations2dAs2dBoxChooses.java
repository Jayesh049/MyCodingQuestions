import java.io.*;
import java.util.*;
public class QueensCombinations2dAs2dBoxChooses {



        public static void queensCombinations(int qpsf, int tq, int row, int col, String asf) {
            if(row == tq){
                if (qpsf == tq) {
                    System.out.println(asf);
                }
                return;
            }



            //agar aap aakhri column nahi ho
            if(col != tq - 1){
                queensCombinations(qpsf + 1, tq, row  ,col + 1, asf + "q" );
                queensCombinations( qpsf + 0,  tq, row , col + 1 , asf + "-");
            }else{//agar queen humaari last column me hai toh col = 0 ho jaega , aur row humaara row + 1 ho jaega
                queensCombinations(qpsf + 1, tq, row +1   ,0, asf + "q\n" );
                queensCombinations( qpsf + 0,  tq, row + 1, 0 , asf + "-\n");

            }


        }


        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            queensCombinations(0, n, 0, 0, "");
        }
    }
