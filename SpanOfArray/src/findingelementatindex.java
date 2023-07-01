import java.util.Scanner;

public class findingelementatindex {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number to be entered");
        int n = scn.nextInt();
        int[]arr = new int[n];

        int number = 1;
        for(int i = 0 ; i < arr.length ; i++ , number++ ){
            System.out.println("enter the number" + number);
            arr[i] = scn.nextInt();


        }
        System.out.print("Enter the number which has to be find");
        int num = scn.nextInt();

        //for finding
        int foundAt = -1 ; //we have initialised foundAt = -1 because question has said that if not find print -1
        for( int i = 0 ; i<arr.length ; i++) {
            if( arr[i] == num ){
                foundAt = i ;
                break;
            }
        }
        System.out.println(foundAt);

     }
}
