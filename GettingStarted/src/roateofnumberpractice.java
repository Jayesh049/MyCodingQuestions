import java.util.Scanner;

public class roateofnumberpractice {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of a =");
         int a = scn.nextInt();

        int temp = a ;

        for (int i = 0; i <= 3; i++) {
            if (temp <= 1) {
                System.out.println(temp);
            } else if(a <=5){
                System.out.println(a);
            }
            else{
                return;
            }
            a = temp;
        }
    }
}

