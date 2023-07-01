import java.io.*;
import java.util.*;
public class JosephusSpeciall {



        public static int solution(int n){
            int tworaisetopowerm = xpowermaxlessthanequalston(n);
            int l = n - tworaisetopowerm;
            return 2 * l + 1;
        }
        public static int xpowermaxlessthanequalston(int n ){
            int p = 1;//2 ^ 0 =1
            while( p * 2 <= n){
                p = p * 2;
            }
            return p;
        }
        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            System.out.println(solution(n));
        }


    }
