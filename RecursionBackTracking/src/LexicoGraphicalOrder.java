import java.io.*;
import java.util.*;
public class LexicoGraphicalOrder {


        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();

            //  ArrayList<Integer> list = new ArrayList<>();

            //hum 1 se lekar 9 tak loop chalayenge
            for(int i = 1 ; i<= 9 ; i++){
                lexico( i , n );
            }
        }

        public static void lexico(int curr , int n){
            if(curr > n){
                return;
            }

            System.out.println(curr);
            //agar n =1000 hai toh
            //fir hum neeche ki family ka recursion karenge jisse agar 1 paas kiya toh curr * 10 10 aaya phir
            //10 ke liye chalega toh 10 ki family chalengei 10* 10 = 100 *10 = 1000
            for(int i = 0 ;i <= 9 ;i++){
                lexico(curr * 10 + i , n);
            }
        }


}
