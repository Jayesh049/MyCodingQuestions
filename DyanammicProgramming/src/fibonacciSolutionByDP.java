import java.util.Scanner;

public class fibonacciSolutionByDP {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int fb = fib_mem(n , new int[n + 1]);
        System.out.println(fb);

    }
    static int fib_mem(int n ,int[] strg ){
             if( n == 1 ||  n ==0){
                 return n;
             }


             if( strg[n] != 0){
                 return strg[n];
             }

             int fnm1 = fib_mem(n -1, strg);
             int fnm2 = fib_mem(n -2 , strg);

             int fb = fnm1 + fnm2;

             strg[n] = fb;

             return fb;

    }
}
