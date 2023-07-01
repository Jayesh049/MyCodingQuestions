import java.util.Scanner;

public class printKPC22 {

    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      String str  = scn.nextLine();
      printKPC(str ,"");

    }

    static String[] codes ={".;" ,"abc","def","ghi" ,"jkl","mno","pqrs","tu","vwx","yz"};

    public static void printKPC(String str , String ans){

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);


        String charofch = codes[ ch - '0'];

        for(int i = 0 ; i <charofch.length() ; i++){
            char cho = charofch.charAt(i);
             printKPC(ros ,ans + cho );


        }
    }
}
