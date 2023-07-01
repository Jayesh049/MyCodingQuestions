import java.util.Scanner;

public class pattern11 {

    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in);
        int n = scn.nextInt();


        int val =1;//this is initialised to 1 so that it can be incremented
        for( int i = 1 ; i <=n ;i ++ ){ // loop will run  for 5 times if we run the program
            for(int j =1 ; j<=i ; j++){ // loop will run if i is initialised to 5 times
                System.out.print(  val +"\t"); // this will
            val++; //val can be incremented
            }
            System.out.println();
        }
    }
}
