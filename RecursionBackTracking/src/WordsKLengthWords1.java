import java.util.*;
import java.io.*;
public class WordsKLengthWords1 {





        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            int k = Integer.parseInt(br.readLine());

            HashSet<Character> unique = new HashSet<>();
            String ustr = "";
            for (char ch : str.toCharArray()) {
                if (unique.contains(ch) == false) {
                    unique.add(ch);
                    ustr += ch;
                }
            }
            Character[] spots = new Character[k];
            combinationwithArrangement(0 , ustr , 0 ,  k , spots);
        }


        public static void combinationwithArrangement(int cc , String ustr , int ssf , int ts,Character[] spots){
            if(cc == ustr.length()){
                if(ssf== ts){
                    for(int i = 0 ; i < spots.length ;i++){
                        System.out.print(spots[i]);
                    }
                    System.out.println();
                }
                return;
            }


            char ch = ustr.charAt(cc);
            for(int i = 0 ; i < spots.length ; i++){
                if(spots[i] == null){
                    spots[i] = ch;
                    combinationwithArrangement( cc+ 1 ,  ustr ,  ssf + 1 , ts , spots );
                    spots[i] = null;
                }
            }
            combinationwithArrangement( cc+ 1 ,  ustr ,  ssf + 0 , ts , spots );

        }

    }
/*
1. You are given a word (may have one character repeat more than once).
2. You are given an integer k.
3. You are required to generate and print all k length words (of distinct chars) by using chars of the
     word.

Note -> Use the code snippet and follow the algorithm discussed in question video. The judge can't
               force you but the intention is to teach a concept. Play in spirit of the question.

               Sample Input
aabbbccdde
3
Sample Output
abc
abd
abe
acb
adb
aeb
acd
ace
adc
aec
ade
aed
bac
bad
bae
cab
dab
eab
cad
cae
dac
eac
dae
ead
bca
bda
bea
cba
dba
eba
cda
cea
dca
eca
dea
eda
bcd
bce
bdc
bec
bde
bed
cbd
cbe
dbc
ebc
dbe
ebd
cdb
ceb
dcb
ecb
deb
edb
cde
ced
dce
ecd
dec
edc



 */