import java.util.Scanner;

public class PrintPermutaionUsingRecursionArrayAllWayUp {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printPermutation(str ,"");
    }
    public static void printPermutation(String str , String ans ){
        if(str.length() == 0 ){
            System.out.println(ans);
            return;
        }

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            String lpart = str.substring(0 , i);
            String rpart = str.substring(i+1);
            String ros = lpart+ rpart;

            printPermutation(ros , ans + ch);
        }
    }
}
