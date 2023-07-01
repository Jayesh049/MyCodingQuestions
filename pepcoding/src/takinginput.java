import java.util.Scanner;

public class takinginput {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n= scn.nextInt();

        int div=1;//here divisor is initilaized to 1
       int tn1=n;  //we are doing this because we have to save n for later(so we are gaiving temporary n1)
       while(tn1>=10) {
           tn1 = tn1/10;//it will give quotient
           div = div*10;//it will increase div if divisor is 10 then it will get multiply and increase it to 100
       }
       while(div>=1){
           int q= n/div;//for quotient
           int r= n%div;//for remainder
           System.out.println(q);//quotient
           n=r;//the value of r asisgned to n
           div=div/10;//the value of divisor will got decremented when divided by 10


        }
    }
}
