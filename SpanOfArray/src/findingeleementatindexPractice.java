import java.util.Scanner;

public class findingeleementatindexPractice {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number");
        int n = scn.nextInt();
        int[]arr = new int[n];


        int number = 1;
        for(int i = 0 ; i< arr.length ; i++,number++){
            System.out.println("enter the number" + number);
                arr[i] = scn.nextInt();
        }
        System.out.println("enter the number to find");
        int num = scn.nextInt();  // numebr to be find


        int erika = -1 ; //erika is initially initiliased to -1
        for(int i = 0 ; i <arr.length ; i++ ){
            if( arr[i] == num){
                erika = i;
                break;
            }
        }
        System.out.println(erika);

    }
}
