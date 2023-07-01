import java.util.Scanner;

public class SpiralDisplay {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int nte = n * m;
        int count = 0;
        while (count < nte) {
            //for left wall

            for (int i = minr ; i <= maxr && count < nte; i++) {
                System.out.println(arr[i][minc]);
                count++;
            }
            minc++;
       //for bottom wall
            for (int  j = minc; j<= maxc && count < nte; j++) {
                System.out.println(arr[maxr][j]);
                count++;
            }
            maxr--;
       // for right wall
        for (int i = maxr ; i >= minr && count < nte; i--) {
            System.out.println(arr[i][maxc]);
            count++;
        }
        maxc--;
        //for top wall
            for(int j = maxc ; j >= minc && count < nte; j--){
                System.out.println(arr[minr][j]);
                count++;
            }
            minr++;
    }
}
}

