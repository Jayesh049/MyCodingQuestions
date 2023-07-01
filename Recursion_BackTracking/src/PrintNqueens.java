import java.util.Scanner;

public class PrintNqueens {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        PrintNqueens1(arr , "" , 0);

    }
    public static void PrintNqueens1(int [][] chess , String qsf , int row){
        if(row == chess.length){
            System.out.println(qsf +".");
            return;
        }
        for(int col = 0 ; col< chess.length ;col++){//column wise we are checking here
            if(isItPlaceFOrTHeQueen(chess , row ,col)){//==true
                chess[row][col] =1;
                PrintNqueens1(chess , qsf +row +"-" +col + "," , row +1);
                chess[row][col] = 0;
            }
        }

    }

    public static boolean isItPlaceFOrTHeQueen(int [][] chess ,int row , int col){
        for(int i  =  row -1 , j  = col-1 ; i>=0 && j>=0 ; i--,j--){//for diagonal direction
            if(chess[i][j] ==1){
                return false;
            }
        }
        for(int i = row-1 ,j = col ;i>= 0 ;i--){  //this is for vertical jisme row minus hoga column wahi rahega
            if(chess[i][j] ==1){
                return false;
            }
        }
        for(int i = row-1 ,j = col+1 ;i>= 0 && j<chess.length;i--,j++){//for right diagonal jisme row ghatega , column badhega
            if(chess[i][j] ==1){
                return false;
            }
        }
        for(int i = row, j = col - 1; j >= 0; j--){//for horizontal jisme row same rahega , column decrease hoga
            if(chess[i][j] == 1){
                return false;
            }
        }
        return true;
    }
}
/*
 1   -   q   -   -
 2   -   -   -   q
 3   q   -   -   -
 4   -   -   q   -

*/
