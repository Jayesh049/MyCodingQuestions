import java.util.Scanner;

public class FloodFill2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][] arr= new int[n][m];
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j < m ; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
        floodfill(arr , 0 , 0 , "" , visited);
    }
    public static void floodfill(int[][] maze, int rows , int cols , String asf , boolean[][]visited ){
        if(rows < 0 || cols < 0 || rows == maze.length || cols == maze[0].length || maze[rows][cols] ==1  || visited[rows][cols] == true){
            return;
        }
        else if(rows == maze.length -1 && cols == maze[0].length -1 ){
            System.out.println(asf + ".");
            return;
        }
        visited[rows][cols] = true;
        floodfill(maze , rows -1 , cols , asf + "t" , visited );
        floodfill(maze , rows  , cols -1, asf + "l" , visited );
        floodfill(maze , rows +1 , cols , asf + "d" , visited );
        floodfill(maze , rows  , cols +1, asf + "r" , visited );
        visited[rows][cols] = false;

    }
}
