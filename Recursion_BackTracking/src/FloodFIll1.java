import java.util.Scanner;

public class FloodFIll1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i = 0 ; i< rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                  arr[i][j] = scn.nextInt();
            }
        }
        boolean [][] visited    = new boolean[rows][cols];
        floodfill(arr ,0 , 0 ,"",visited);
    }
    public static void floodfill(int [][]maze , int row,int col,String asf ,boolean[][]visited ){
            if(row < 0 || col < 0 || row == maze.length || col == maze[0].length ||maze[row][col] == 1 || visited[row][col] == true ){
                return;
            }
            else if(row == maze.length - 1 && col == maze[0].length -1 ){
                System.out.println(asf);
                return;
            }
            visited[row][col] = true;
            floodfill(maze , row-1 , col , asf +"t" ,visited);
            floodfill(maze , row , col-1 , asf +"l" , visited);
            floodfill(maze , row +1 , col , asf + "d" , visited);
            floodfill(maze , row , col+1 , asf +"r" , visited);
            visited[row][col] = false;
    }
}
