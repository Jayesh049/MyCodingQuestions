import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {

    public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
           String str = scn.nextLine();
           System.out.println( GSS(str));

    }
    public static ArrayList<String> GSS(String str){
            if(str.length() == 0){
                ArrayList<String> bres = new ArrayList<>();
                String theSS = "";
                bres.add(theSS);
                return bres;
            }
            char ch = str.charAt(0);
            String res = str.substring(1);

            ArrayList<String> rres = GSS(res);
            ArrayList<String> mres = new ArrayList<>();

            for(String rstr:rres){
                mres.add(rstr);//- adding
            }
            for(String rstr:rres) {
                mres.add(ch + rstr);
            }
            return mres;
                 }
}
