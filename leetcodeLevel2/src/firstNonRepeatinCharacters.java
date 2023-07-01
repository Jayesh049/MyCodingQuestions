import java.util.*;
public class firstNonRepeatinCharacters {




        public static int solution(String s) {
            // write your code here
            HashMap<Character ,Integer> map = new HashMap<>();
            for(char ch:s.toCharArray()){
                map.put(ch , map.getOrDefault(ch, 0) + 1);
            }
            for(int i = 0 ; i < s.length() ; i++){
                char ch = s.charAt(i);
                if(map.get(ch) ==1){
                    return i;
                }
            }
            return -1;
        }

        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            String s= scn.next();
            System.out.print(solution(s));
        }

    }

//gfg answer
//{ Driver Code Starts
//Initial Template for Java
//
//import java.io.*;
//        import java.lang.*;
//        import java.util.*;
//
//class Driverclass
//{
//    public static void main(String args[])
//    {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        while(t-- > 0)
//        {
//            String st = sc.next();
//
//            char ans=new Solution().nonrepeatingCharacter(st);
//
//            if(ans!='$')
//                System.out.println(ans);
//            else
//                System.out.println(-1);
//        }
//    }
//}
//
//// } Driver Code Ends
//
//
////User function Template for Java
//
//class Solution
//{
//    //Function to find the first non-repeating character in a string.
//    static char nonrepeatingCharacter(String S)
//    {
//        //Your code here
//        // char neglectedreturnans = '$';
//
//        HashMap<Character ,Integer> map = new HashMap<>();
//        for(int i = 0 ; i< S.length() ;i++){
//            char ch = S.charAt(i);
//            int chf = map.getOrDefault(ch , 0);
//            map.put(ch , chf + 1);
//
//        }
//
//        for(int i = 0 ; i <S.length() ;i++){
//            char ch = S.charAt(i);
//            if(map.get(ch) == 1){
//                return ch;
//            }
//        }
//        // return neglectedreturnans;
//        return '$';
//    }
//}
//link->https://practice.geeksforgeeks.org/problems/non-repeating-character-1587115620/1
