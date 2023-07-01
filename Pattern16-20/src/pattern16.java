import java.util.Scanner;

public class pattern16 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
          int nsp = 2*n - 3;
          int nst = 1 ;
          int  val =1 ;
          for( int i =1  ; i<=n ; i++){
              for( int j =1 ; j<= nst ; j++){
                  System.out.print(val +"\t");
                  val++;
              }
              for( int j =1 ; j <=nsp ;j++){
                  System.out.print("\t");
              }
              if( i ==n ) {
                  nst--; // number of stars
                  val--; // value should be decreased
              }
              for (int j =1 ; j<=nst ; j++){
                  val--; //value should be declared once again,so that last line give correct value
                  System.out.print(val +"\t");

              }
              nst++;
              nsp-=2;
              System.out.println();
          }


    }

}
