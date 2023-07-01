import java.io.*;
import java.util.*;
public class AbbreviationUsingBacktracking {



        public static void solution(String str, String asf,int count, int chpos){
            //write your code here
            if(chpos == str.length()){
                if(count > 0){
                    System.out.println(asf + count);
                }   else{
                    System.out.println(asf);
                }
                return;
            }





            if(count > 0){
                solution(str ,  asf + count + str.charAt(chpos), 0,  chpos + 1);
            }else{
                solution(str ,  asf + str.charAt(chpos), 0,  chpos + 1);
            }


            solution(str ,  asf, count + 1,  chpos + 1);

        }
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String str = scn.nextLine();
            solution(str,"",0,0);
        }



    }
    /*
    1. You are given a word.
2. You have to generate all abbrevations of that word.
Sample Input
pep
Sample Output
pep
pe1
p1p
p2
1ep
1e1
2p
3
     */
