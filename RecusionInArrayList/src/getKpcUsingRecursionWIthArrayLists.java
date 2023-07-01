import java.util.ArrayList;
import java.util.Scanner;

public class getKpcUsingRecursionWIthArrayLists {

    public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          String str = scn.nextLine();
          ArrayList<String> kpc = getKpc(str);
          System.out.println(kpc);
    }

    public static String[] codes = {".;" ,"abc" , "def" ,"ghi" ,"jkl" ,"mno" ,"pqrs" ,"tu" , "vwx" ,"yz"};


    public static ArrayList<String> getKpc(String str){
      if(str.length()==0){
          ArrayList<String> bres = new ArrayList<>();
          bres.add("");
          return bres;
      }
       char ch = str.charAt(0);//ye zeroth element dega

       String ros = str.substring(1);//ye first element ke baad waale saare dega
       ArrayList<String> rres = getKpc(ros);//rres ke andar saare element ko print karwa dega for example
        //67 manga hai toh= pt pu qt qu rt ru st su dega mtlb ye faith hai

       ArrayList<String> mres = new ArrayList<>();//ye empty string bna dega taaki sab empty ke under enter ho jaaaye

       int ii = ch -48; // number se character convert ke liye
       String code = codes[ii]; // ye character me print karega

       for(int i = 0 ; i <code.length() ; i++){//ye one by one loop lagayega 367 me
           char chCode = code.charAt(i);// i = 0 ,g dega ya phir i =1  h ya phir i = 2 ho gya toh i
            for(String rstr :rres){//isme saare results pehle se hi hai 67 ke
                mres.add(chCode + rstr);//ab bas add kar demge chCode ko aur phir rstr ko mtlb
                //f(367) = f(3) _ f(67)
            }
       }

       return mres;

    }
}
