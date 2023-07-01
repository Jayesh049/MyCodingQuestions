import java.util.Scanner;

public class ClimbStairsByMem {

    public static void main(String[] args) throws Exception {
           Scanner scn = new Scanner(System.in);
           int n = scn.nextInt();
           int cs = climbStairs(n ,new int[n+1]);
           System.out.println(cs);
      }

      static int climbStairs(int n ,int[]strg ){

        if( n == 0){
            return 1;
        }
        else if( n < 0){
            return 0;
        }

       if( strg[n] != 0 ){
           return strg[n];
       }

       int csnm1 = climbStairs(n - 1, strg);
       int csnm2 = climbStairs(n-2, strg);
       int csnm3 = climbStairs(n -3 , strg);

       int cs = csnm1 + csnm2 + csnm3;
       strg[n] = cs;

       return cs;


      }

}
