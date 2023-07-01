import java.util.Scanner;

public class roateofnumberlasttime {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =  scn.nextInt();
        int k =  scn.nextInt();

        int temp = n ;//we are using temp for storing temporary number to protect number n
        int nod = 0 ; // we are initialyy storing number of digits to 0
        while( temp != 0){ // loop will run until or unless becomes 0
            temp = temp/10; // number/10 so that number got decrease
            nod++; // number of digits increasing as number is decreasing means temp is decreasing
        }
          k = k % nod;//this is for larger number
        if( k < 0 ){
         k =  k  + nod ;  // this is for negative numbers
        }

        int div = 1 ;//initially div is 1
        int multi = 1 ; // initially multiplier is 1
        for( int i = 1 ; i <= nod ; i++){ // loop will run until i will be able to touch number of digits
            //suppose nod is 5 loop will run 5 times

            if(i<=k){ // condition for increasing divisor and multiplier
                div = div*10;//div will increase so that we can rotate the number
            }
            else{
                multi = multi *10;//multiplier will increase so that we can increase the number value
            }
        }

        int q = n /div ;//quotient = number/ divisor = 456/100= 4
        int r = n %div;//remainder = number % divisor = 456%100= 56
        int ans = r*multi + q ; //ans = 56*100+4= 564
        System.out.println(ans);//such that answer is 564
    }
}
