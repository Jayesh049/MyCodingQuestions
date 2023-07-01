import java.util.Scanner;

public class RingRotate {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        int n = scn.nextInt();
        int m = scn.nextInt();
         int[][]twodarr = new int[n][m];
         for (int i = 0 ; i<twodarr.length ; i++){
             for( int j =0 ; j<twodarr[0].length ; j++){
                 int[i][j] = scn.nextInt();

             }
         }

         int s  = scn.nextInt();
         int r = scn.nextInt();


         //make a 1d array and fill it with the ring (Spiral display)

        int[]onedarr = fillOnedArray(twodarr,s);

        //rotate the 1d array
        rotate(onedarr);

        //fill the ring back from the rotated 1d array
        fillTwodArray(onedarr,twodarr,s);
    }

    public static void fillOnedArray(int[][]twodarr,int s ) {
        int r2d = twodarr.length;
        int c2d = twodarr[0].length;
        int rshell = r2d - 2 * (s - 1);
        int cshell = c2d - 2 * (s - 1);
        int szshell = 2 * (rshell + cshell) - 4;

        int[] larr = new int[szshell];

        int rmin = s - 1;
        int cmin = s - 1;
        int rmax = twodarr.length - 1 - (s - 1);
        int cmax = twodarr[0].length - 1 - (s - 1);

        // left wall
        int idx = 0;
        for (int i = rmin; i <= rmax; i++) {
            larr[idx] = twodarr[i][cmin];
            idx++;
        }

        // bottom wall
        for (int j = cmin + 1; j <= cmax; j++) {
            larr[idx] = twodarr[rmax][j];
            idx++;
        }

        // right wall
        for (int i = rmax - 1; i >= rmin; i--) {
            larr[idx] = twodarr[i][cmax];
            idx++;
        }

        // top wall
        for (int j = cmax - 1; j >= cmin + 1; j--) {
            larr[idx] = twodarr[rmin][j];
            idx++;
        }

        return ;
    }


    public static void fillTwodArray(int[]onedarr,int[][]twodarr,int s ) {

        int rows = twodarr.length;
        int cols = twodarr[0].length;

        int rmin = s-1 ;
        int cmin = s-1;
        int rmax = rows -s ;
        int cmax = cols -s ;
        int idx = 0;


       //left wall( col at cmin , row varies from rmin to rmax)
       for( int i = rmin , j = cmin ; i<= rmax ;i++){
           twodarr[i][j] = onedarr[idx];
           idx++;
       }
   // bottom wall ( row at rmax , col varies from cmin to cmax)
        for( int i = rmax ,  j = cmin ; j <= cmax ; j++ ){
            twodarr[i][j] = onedarr[idx];
            idx++;
        }

        //right wall ( col at cmax , row varies from rmax to rmin)
        for (int i  = rmax , j =cmax ; i>= cmin ; i++){
            twodarr[i][j] = onedarr[idx];
            idx++;
        }

        //to wall ( rrow att rmin , col varies from cmax to cmin)
        for( int i = rmin ,  j = cmax ; j>= cmin ; j--){
            twodarr[i][j] = onedarr[idx];
            idx++;
        }
        rmin++;


    }

    public static void rotate( int []onedarr , int r ){
        r = r % onedarr.length;
        if( r<0){
            r = r+ onedarr.length;
        }
        reverse(onedarr , 0 , onedarr.length- r -1 );
    }

    public static void reverse( int[]onedarr , int left ,int right  ){
        while(left<= right){
            int temp = onedarr[left];
            onedarr[left] = onedarr[right];
            onedarr[right] = temp;
            left++;
            right--;
        }
    }


}
