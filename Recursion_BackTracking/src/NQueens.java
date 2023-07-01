import java.util.Scanner;

public class NQueens {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] chess = new int[n][n];

    }

    public static void printNQueens(int [][] chess , String qsf ,int row){
        if(row == chess.length){
            System.out.println(qsf);
            return;
        }
        for(int col = 0 ; col < chess.length ; col++){
//            if(isItaSafePlaceForTheQueen(chess , row , col ) == true){
//                chess[row][col] = 1 ;

            }
        }
    }

