import java.util.Scanner;

public class TowerOfHanoi {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t1id = scn.nextInt();
        int t2id = scn.nextInt();
        int t3id = scn.nextInt();
           toh( n , t1id , t2id , t3id);
    }

    //E => toh(3 , a, b ,c) => It is supposed to print valid (r123) instructions to move 3 discs from a to b using c
    //F2 =>toh(2 , a , c, b) => It will print valid r(123) instructions to move 2 discs from a to c using b
    //F2 => toh(2 , c ,b , a) => It will print valid r(123) instructions to move 2 discs from c to b using a

        public static void toh(int n , int t1id , int t2id , int t3id){
        if(n == 0){
            return;
        }
        toh( n -1 , t1id , t3id , t2id);
        System.out.println(n + "[" + t1id + " -> " + t2id + "]" );
        toh(n-1 , t3id , t2id ,t1id );

    }
}
