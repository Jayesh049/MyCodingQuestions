import java.util.*;
import java.io.*;

public class LexicoGraphicalOrderLeetCode {

        public List<Integer> lexicalOrder(int n) {
            List<Integer> list = new ArrayList<>();

            for(int i = 1 ; i <= 9 ; i++){
                lexico(i , n , list);
            }
            return list;

        }

        public  void lexico(int curr , int n , List<Integer> list){
            if(curr > n){
                return;
            }
            list.add(curr);
            for(int i = 0 ; i <=  9 ; i++){
                lexico(curr * 10 + i , n , list);
            }
        }
    }
