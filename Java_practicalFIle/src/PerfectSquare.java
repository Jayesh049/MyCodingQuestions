import java.util.Scanner;

public class PerfectSquare {



        public static void main(String[] args) {
            Scanner scn=new Scanner(System.in);

            System.out.println("enter the no: ");

            int n=scn.nextInt();

            int i=1;
            int cube=i*i*i;
            int squ=1;
            boolean cub =false;
            boolean sq =false;
            while (i*i<= n) {
                if (i*i== n) {
                    squ=i;
                    sq=true;
                    break;
                }
                if (cube == n) {
                    squ=i;
                    cub =true;
                    break;
                }
                i++;
                cube =i*i*i;
            }

            if (sq) {
                System.out.println("square : " + sq + " of " + squ);
            }
            if (cub) {
                System.out.println("cube : " + cub + " of " + squ);
            }
        }
    }


