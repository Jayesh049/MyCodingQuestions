import java.io.*;
import java.util.*;
public class Permutations1 {



        public static void permutations(int[] boxes, int ci, int ti){
            // write your code here
            if(ci > ti){
                for(int val : boxes){
                    System.out.print(val +"");
                }
                System.out.println();
                return;
            }

            //for making oppurtinity for 1
            for(int i  =0 ; i < boxes.length; i++){
                if(boxes[i] ==0){
                    boxes[i] = ci;
                    permutations(boxes , ci + 1 , ti);
                    //jab hum waapas aa rahe honge toh backtracking ke liye um boxes  jo print ho chukke hai usse 0 kar denge
                    boxes[i] = 0;//use for backtracking
                }
            }

        }

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int nboxes = Integer.parseInt(br.readLine());
            int ritems = Integer.parseInt(br.readLine());
            permutations(new int[nboxes], 1, ritems);
        }


}
