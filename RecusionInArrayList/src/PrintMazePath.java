import java.util.Scanner;

public class PrintMazePath {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        printMazePath(1 , 1 , rows , cols , "");
    }

    public static void printMazePath(int sr , int sc ,int dr , int dc , String psf){
        if(sr > dr || sc > dc){
            return;
        }
        if(sr ==dr || sc == dc){
            System.out.println(psf);
            return;
        }

        printMazePath(sr , sc+1 , dr , dc , psf + "h");
        printMazePath(sr+ 1 , sc , dr , dc , psf + "v");
    }
}
