import java.util.Scanner;

public class rotqatofanumberpractife {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();


        int temp = n ;
        int nod= 0 ;
        while( temp !=0){
            temp = temp/10;
            nod++;
            int div = 0 ;
            int mul = 0;
            for ( int i = 1; i <=nod ; i++){
                if(i <=k ){//k is number of digits you want to rotate
                    div *=10;
                }
                else{
                    mul*=10;
                }
            }
        }
    }
}
