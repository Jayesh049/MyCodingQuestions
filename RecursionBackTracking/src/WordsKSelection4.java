import java.io.*;
import java.util.*;
public class WordsKSelection4 {


        public static void generateWords(int cs , int ts ,String ustr , HashMap<Character , Integer> map ,   Character[] spots , int ls){
            if(cs == ts){
                for(int i = 0 ;i < spots.length ;i++){
                    System.out.print(spots[i]);
                }
                System.out.println();
                return;
            }


            for(int i = ls ; i < ustr.length() ;i++){
                char ch = ustr.charAt(i);
                int freq= map.get(ch);

                if(freq > 0){
                    map.put(ch , map.get(ch) - 1);
                    spots[cs] = ch;
                    generateWords(cs +1 , ts ,ustr , map , spots , i);
                    spots[cs] = null;
                    map.put(ch , map.get(ch) + 1);
                }
            }
        }



        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            int k = Integer.parseInt(br.readLine());

            HashMap<Character, Integer> map = new HashMap<>();
            String ustr = "";
            for (char ch : str.toCharArray()) {
                if (map.containsKey(ch) == false) {
                    map.put(ch, 1);
                    ustr += ch;
                } else {
                    map.put(ch, map.get(ch) + 1);
                }
            }
            Character[] spots = new Character[k];
            generateWords(0 , k ,ustr ,map,  spots , 0);
        }

    }
