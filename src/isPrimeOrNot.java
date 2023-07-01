import java.util.*;

class Main{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        for(int i = 1 ; i <= num ; i++){
            int x = scn.nextInt();//num to be tested
        boolean isPrime = true;

        int div = 2;
        while( div *div <= x){

            int rem = num% x;
            if ( rem ==0){
                isPrime = false;

                break;
            }
            div++;
        }
        if( isPrime ==true) {
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
            }


        // write ur code here

    }
}