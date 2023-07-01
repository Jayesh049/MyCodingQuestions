import java.util.*;
import java.io.*;
public class GeneralizedAbbreviation {
//lintcode 779
    /**
//     * @param word: the given word
     * @return: the generalized abbreviations of a word
     * we will sort your return value in output
     */
    public static List<String> generateAbbreviations(String str)  {
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < (1 << str.length()); i++) {


            int count = 0;


            for (int j = 0 ; j < str.length() ; j++) {
                char ch = str.charAt(j);
                int b = str.length() - 1 - j;


                if ((i & (1 << b)) == 0) {
                    if (count == 0) {
                        sb.append(ch);
                    }
                    else {
                        sb.append(count);
                        sb.append(ch);
                        count = 0;
                    }
                }
                else {
                    count++;
                }
            }
            //agar count bach gaya toh sb me append kar do
            if (count > 0) {
                sb.append(count);
            }
//            String s = sb.toString();
//            List<String> ans =Arrays.asList(s.split("\\R"));
//
//
//            System.out.println(ans);

        }
        String s = sb.toString();
        List<String> ans =Arrays.asList(s.split("\\R"));


        System.out.println(ans);
        return ans;

    }


    public  static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        generateAbbreviations(str);
    }
}