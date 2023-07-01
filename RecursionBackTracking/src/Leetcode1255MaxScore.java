public class Leetcode1255MaxScore {
    /*
    255. Maximum Score Words Formed by Letters
Hard
876
47
Companies
Given a list of words, list of  single letters (might be repeating) and score of every character.

Return the maximum score of any valid set of words formed by using the given letters (words[i] cannot be used two or more times).

It is not necessary to use all characters in letters and each letter can only be used once. Score of letters 'a', 'b', 'c', ... ,'z' is given by score[0], score[1], ... , score[25] respectively.



Example 1:

Input: words = ["dog","cat","dad","good"], letters = ["a","a","c","d","d","d","g","o","o"], score = [1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0]
Output: 23
Explanation:
Score  a=1, c=9, d=5, g=3, o=2
Given letters, we can form the words "dad" (5+1+5) and "good" (3+2+2+5) with a score of 23.
Words "dad" and "dog" only get a score of 21.
Example 2:

Input: words = ["xxxz","ax","bx","cx"], letters = ["z","a","b","c","x","x","x"], score = [4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,10]
Output: 27
Explanation:
Score  a=4, b=4, c=4, x=5, z=10
Given letters, we can form the words "ax" (4+5), "bx" (4+5) and "cx" (4+5) with a score of 27.
Word "xxxz" only get a score of 25.
Example 3:

Input: words = ["leetcode"], letters = ["l","e","t","c","o","d"], score = [0,0,1,1,1,0,0,0,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0]
Output: 0
Explanation:
Letter "e" can only be used once.
     */


    class Solution {
        public int maxScoreWords(String[] words, char[] letters, int[] score) {

            int[] farr = new int[26];
            for(char ch : letters) farr[ch - 'a']++;

            return solve(words,farr,score,0);
        }

        public int solve(String[] words, int[] farr, int[] score, int idx){
            if(idx == words.length) return 0;




            //condition for no
            //agar mai nahi aaunga
            int sno = 0 +solve(words,farr,score,idx + 1);

            boolean flag = true;//true if yes call can be made

            int sword = 0;


            String word = words[idx];

            //Iss for loop ke andar include karne ki condition hai
            for(int i = 0; i < word.length(); ++i){
                char ch = word.charAt(i);
/*                                                                                                        agar frquency 0 ho jaaye toh,toh aapka frequency hi nahi hai iss character ka ki aap isko include kar paaye
agar iss word ko nahi include kiya jaa skta toh ye false ho jaayega
*/
                if(farr[ch-'a'] == 0) flag = false; // not possible to include word(for negative case or 0)
/*
iss character ke liye frquency array ke andar bta dijiye jo character current me hai wo
frequency array me se subtract jar dijiye
*/
                farr[ch-'a']--;
//  decrease the frequency of that particular character inside the frequency array
                sword += score[ch-'a'];
// increase the particular word score
            }



            //condition for yes
            //for agar mai haa bolta hu ki mai aunga toh jo humne word nikala hai usko add karke do recursion
            int syes = 0;
            //mai currentword ka score add karunga
            if(flag) syes = sword+ solve(words,farr,score,idx+1);

            //this loop for  backtrack and undo the changes
            for(int i =0; i < word.length(); ++i){
                char ch = word.charAt(i);
                farr[ch-'a']++;
            }

            return Math.max(syes,sno); // find the max score
            //no aur yes me adhik hoga uska max return kar do
        }
    }
}
