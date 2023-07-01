import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Cryptoarithemetic {




        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String s1 = scn.nextLine();
            String s2 = scn.nextLine();
            String s3 = scn.nextLine();

            HashMap<Character, Integer> charIntMap = new HashMap<>();
            String unique = "";
            for (int i = 0; i < s1.length(); i++) {
                if (!charIntMap.containsKey(s1.charAt(i))) {
                    charIntMap.put(s1.charAt(i), -1);
                    unique += s1.charAt(i);
                }
            }

            for (int i = 0; i < s2.length(); i++) {
                if (!charIntMap.containsKey(s2.charAt(i))) {
                    charIntMap.put(s2.charAt(i), -1);
                    unique += s2.charAt(i);
                }
            }

            for (int i = 0; i < s3.length(); i++) {
                if (!charIntMap.containsKey(s3.charAt(i))) {
                    charIntMap.put(s3.charAt(i), -1);
                    unique += s3.charAt(i);
                }
            }

            boolean[] usedNumbers = new boolean[10];
            solution(unique, 0, charIntMap, usedNumbers, s1, s2, s3);
        }

        public static int getNum(String str , HashMap<Character , Integer> map ){
            String nstr = "";

            for(char ch : str.toCharArray()){
                int val = map.get(ch);
                nstr += val;
            }

            return Integer.parseInt(nstr);
        }


        public static void solution(String unique, int idx, HashMap<Character, Integer> charIntMap, boolean[] usedNumbers, String s1, String s2, String s3) {

            //base case
            if(idx == unique.length()){
                int ns1 = getNum(s1 , charIntMap);
                int ns2 = getNum(s2 , charIntMap);
                int ns3 = getNum(s3 , charIntMap);

                if(ns1 + ns2 == ns3){
                    for(char ch = 'a' ; ch <= 'z' ; ch++){
                        if(charIntMap.containsKey(ch)){
                            System.out.print(ch + "-" + charIntMap.get(ch) +" ");
                        }
                    }
                    System.out.println();
                }
                return;
            }

            char ch = unique.charAt(idx);
            //main code
            for(int val  = 0  ; val <= 9 ; val++){

                if(usedNumbers[val] == false){
                    usedNumbers[val] = true;
                    charIntMap.put(ch , val);
                    solution(unique , idx + 1  , charIntMap , usedNumbers , s1 ,s2 , s3);
                    usedNumbers[val] = false;
                    charIntMap.put(ch , -1);
                }
            }
        }

    }


