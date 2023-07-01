import java.util.Scanner;

public class SumAndAverageOFEvenNUmbers {

    public static void main(String[] args) {

        System.out.println("enter the limit");
        Scanner scn = new Scanner(System.in);

        int limit = scn.nextInt();

        int esum = 0;
        int eavg = 0;
        int ecount = 0;
        int osum = 0;
        int oavg = 0;
        int ocount = 0;
        for ( int i =0 ;i<limit;i++){
            int n = scn.nextInt();
            if( n%2==0){
               esum = esum + n;
               ecount++;//count is initialise to 0 then we will increment count to
            }
            else{
                osum = osum + n ;
                ocount++;
            }


        }
        eavg = esum/ecount;

        oavg= osum/ocount;

        System.out.println("the sum for even number is "+ esum + "average for even number is "+eavg);
        System.out.println("the sum for odd number is "+ osum + "average for odd number is "+oavg);
    }
}
