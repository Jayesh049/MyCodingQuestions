import java.util.*;
import java.io.*;
public class basicsOfBitManipulation {



        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int i = scn.nextInt();
            int j = scn.nextInt();
            int k = scn.nextInt();
            int m = scn.nextInt();

            //write your code here


            //bitmask for on
            int bitmask = 1 << i;
            int on = bitmask | n;
            System.out.println(on);

            //bitmask for off
            int bitmaskj = 1 << j;
            int togglebitmask = ~bitmaskj;
            int off = n & togglebitmask;
            System.out.println(off);

            //bitmask for toggle
            //k value me kuch bhi ho upar ki taraf wo usse toggle kar dega
            int bitmaskforToggle = 1 << k;
            int xor = bitmaskforToggle ^ n;
            System.out.println(xor);

            //for checking bit on and off
            int bitmaskm = 1 << m;
            int check = bitmaskm & n;
            if(check == 0){
                System.out.println(false);
            }else{
                System.out.println(true);
            }





        }

    }
