import java.io.*;
import java.util.*;
public class WordsKLengthWords3 {


        public static void fun(String str , HashMap<Character , Integer> map ,int idx , Character[]spots , int ssf , int ts ){


            if(idx == str.length()){
                if(ssf == ts){
                    for(int i = 0 ;i  < spots.length ;i++){
                        System.out.print(spots[i]);
                    }
                    System.out.println();
                }

                return;
            }





            char ch = str.charAt(idx);
            int lo = map.get(ch);
            for(int i = lo + 1; i < spots.length ;i++){
                if(spots[i] == null){
                    spots[i] = ch;
                    map.put(ch , i);
                    fun(str , map , idx + 1 , spots , ssf + 1 , ts);
                    spots[i] = null;
                    map.put(ch , lo);
                }
            }

            if(lo == -1){
                fun(str , map , idx + 1, spots ,ssf+ 0 ,ts);
            }


        }


        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            int k = Integer.parseInt(br.readLine());
            HashMap<Character , Integer> map = new HashMap<>();

            for(int i =  0 ; i < str.length() ;i++){
                char ch = str.charAt(i);
                if(!map.containsKey(ch)){
                    map.put(ch , -1);
                }
            }
            Character[]spots = new Character[k];
            fun(str , map ,0 , spots ,0 , k );

        }






    }
/*
1. You are given a word (may have one character repeat more than once).
2. You are given an integer k.
3. You are required to generate and print all k length words by using chars of the word.

Note -> Use the code snippet and follow the algorithm discussed in question video. The judge can't force you but the intention is to teach a concept. Play in spirit of the question.
Input Format
Input is managed for you
Output Format
Check the sample ouput and question video.
Question Video

Constraints
0 < str.length() < 15
0 < k <= str.length()
Sample Input
aaabb
3
Sample Output
aaa
aab
aba
baa
abb
bab
bba
 */