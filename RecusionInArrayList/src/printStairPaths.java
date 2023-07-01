import java.util.Scanner;

public class printStairPaths {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printStairPaths1( n,"");
    }

    public static  void printStairPaths1(int n , String path){
        if( n< 0 ){
            return;
        }
        if( n== 0){
            System.out.println(path);
            return;
        }
        printStairPaths1(n -1 , path + "1");
        printStairPaths1(n -2 , path + "2");
        printStairPaths1(n -3 , path + "3");
    }
}
