import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i<str.length() ;i++){
            char ch = str.charAt(i);

            if(ch == ')'){
                 if(st.peek() == '('){
                     System.out.println(true);
                     return;
                 }
                 else{
                     while( st.size()> 0 && st.peek() != '('){
                         st.pop();
                     }
                     st.pop();//for extra brackets
                 }
            }
            else{
                st.push(ch);
            }
        }
        System.out.println(false);
    }
}

//Time complexity
//push is for o(1);
//        pop is for also o(1);
//        each character is pushing and popping only for 1 time
//        1 ch is push and pop
//        means n character is pushed and n character is popping
//        so complexity of this code is  o(n)
