import java.util.Scanner;

public class rotateofnumber {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int nod =0;
        int temp = n;
        while( temp != 0 ){
            temp = temp/10; // for getting qoutient
            nod++;
        }
        k = k%nod;
        if( k< 0 ){
            k = k+nod;
        }
        int div = 1 ; // divisor
        int multi = 1 ;  // mulitplier
        for( int i  = 1 ; i<= nod ;i++){
            if( i <= k){ // k is number of digits you want to rotate
                div = div *10;
            }else{
                multi=multi * 10;
            }
        }
        int q  = n /div ; //for getting quotient
        int r = n % div ; // for getting remainder
        int ans = r *multi + q ;  // for getting answer
        System.out.println(ans); //print ans
    }
}
