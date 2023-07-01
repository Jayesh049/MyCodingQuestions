import java.io.*;
import java.util.*;
public class WordsKSelection1 {

    public class Main {


        public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            String str = scn.nextLine();
            int k = scn.nextInt();

            HashSet<Character> unique = new HashSet<>();
            String ustr = "";
            for (char ch : str.toCharArray()) {
                if (unique.contains(ch) == false) {
                    unique.add(ch);
                    ustr += ch;
                }
            }

            combination(0, ustr, 0, k, "");
        }


        public static void combination(int i, String ustr, int ssf, int ts, String asf ) {

            //jab i saare unique characters ke liye chal gaya
            if(i == ustr.length()){
                //agar selectionsofar k numbers tak character me karke aarahe hai toh print maar do
                if(ssf == ts){
                    System.out.println(asf);
                }

                return;
            }

            char ch = ustr.charAt(i);
            //agar mai jaunga toh index badhega selectionsofar ka mtlb select kari hui string 1 badha denge agar mai jaunga toh , answersofar ke andar current character add kar denge
            combination(i + 1, ustr  , ssf + 1 , ts , asf + ch);

            //agar main nahi jaunga toh stringsofar nahi badhega ,answersofar ke andar empty string daalenge kyunki mai nahi aa rhaa lol
            combination(i + 1, ustr  , ssf + 0 , ts , asf + "");

        }

    }
}
/*
1. You are given a word (may have one character repeat more than once).
2. You are given an integer k.
2. You are required to generate and print all ways you can select k distinct characters out of the
     word.
/*

Sample Input
aabbbccdde
        3
        Sample Output
        abc
        abd
        abe
        acd
        ace
        ade
        bcd
        bce
        bde
        cde
*/