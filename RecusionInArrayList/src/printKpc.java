import java.util.Scanner;

public class printKpc {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printKPC(str,"");
    }

    static String[] codes ={".;" ,"abc" , "def" ,"ghi" ,"jkl" ,"mno" ,"pqrs" ,"tu" ,"vwx" ,"yz" };

    public static void printKPC(String str , String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }


        char ch = str.charAt(0);//0th character
        String ros = str.substring(1);//1st to end character

        String codeforch = codes[ch - '0'];//string to number ascii conversion to string codes

        for(int i = 0 ; i<codeforch.length(); i++){//we are applying loop in codeforch so that we can get all the characters
            char cho = codeforch.charAt(i);
            printKPC(ros , ans +cho);
        }

    }
}
