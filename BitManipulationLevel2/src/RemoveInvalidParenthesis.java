import java.io.*;
import java.util.*;

public class RemoveInvalidParenthesis {



        public static void solution(String str, int minRemoval, HashSet<String> ans) {
            //write your code here
            if(minRemoval == 0){
                int minRemovalCurrent = getMin(str);
                if(minRemovalCurrent  == 0){
                    if(!ans.contains(str)){
                        System.out.println(str);
                        ans.add(str);
                    }
                }
                return;
            }


            for(int i = 0 ; i < str.length() ;i++){
                //to remove i
                String left = str.substring(0 , i );
                System.out.print("left " + left);
                System.out.println();
                String right = str.substring(i + 1);
                System.out.print("right ->" + right);
                System.out.println();
                solution( left + right ,minRemoval - 1, ans);
                System.out.println("sum" + left + right);
            }
        }

        public static int getMin(String str){
            //write your code here
            Stack<Character> st = new Stack<>();

            for(int i = 0 ; i < str.length();i++){
                char ch = str.charAt(i);
                if(ch == '('){
                    st.push(ch);
                }
                else if(ch == ')'){
                    if(st.size() == 0){
                        st.push(ch);
                    }else if(st.peek()== ')'){
                        st.push(ch);
                    }else if(st.peek() == '('){
                        st.pop();
                    }
                }
            }
            return st.size();

        }
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String str = scn.next();

            solution(str, getMin(str),new HashSet<>());
        }

    }
