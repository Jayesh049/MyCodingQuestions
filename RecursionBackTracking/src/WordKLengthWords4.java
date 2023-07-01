import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class WordKLengthWords4 {

    public static void generateWords(int cs , int ts , String ustr , HashMap<Character , Integer> map , Character[] spots){
        if(cs == ts){
            for(int i = 0 ;i < spots.length ;i++){
                System.out.print(spots[i]);
            }
            System.out.println();
            return;
        }


        for(int i = 0; i < ustr.length() ;i++){
            char ch = ustr.charAt(i);
            int freq= map.get(ch);

            if(freq > 0){
                map.put(ch , map.get(ch) - 1);
                spots[cs] = ch;
                generateWords(cs +1 , ts ,ustr , map , spots);
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
        generateWords(0 , k ,ustr ,map,  spots);
    }

}
/*
1. You are given a word (may have one character repeat more than once).
2. You are given an integer k.
3. You are required to generate and print all k length words by using chars of the word.

Note -> Use the code snippet and follow the algorithm discussed in question video
. The judge can't force you but the intention is to teach a concept. Play in spirit of the question.

Sample Input
aaabb
3
Sample Output
aaa
aab
aba
abb
baa
bab
bba
 */
