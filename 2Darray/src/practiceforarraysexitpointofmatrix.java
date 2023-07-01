import java.util.Scanner;

public class practiceforarraysexitpointofmatrix {

    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        //Transpose of a number
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int TransposeOfNUmber = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = TransposeOfNUmber;
            }
        }
        //Reverse of a number
        for (int i = 0; i < arr.length; i++) {
            int li = 0;
            int ri = arr[i].length - 1;

            while (li < ri) {
                int TransposeOfNumber = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = TransposeOfNumber;
                li++;
                ri--;
            }
        }
        display(arr);
    }
    //print the value
        public static void display(int[][] arr){
            for (int[] ints : arr) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(ints[j] + " ");
                }
                System.out.println();
            }
        }

    }

