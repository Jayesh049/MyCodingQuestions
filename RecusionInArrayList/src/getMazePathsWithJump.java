
import java.util.ArrayList;
import java.util.Scanner;

public class getMazePathsWithJump {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        ArrayList<String> paths = getMazePathsWithJump1(1 , 1 ,rows , cols);
        System.out.println(paths);
    }

    public static ArrayList<String> getMazePathsWithJump1(int sr , int  sc , int dr , int dc ){
        if(sr == dr && sc ==dc ){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }


        ArrayList<String> mypaths = new ArrayList<>();
          //ms =move size
        //for horizontal path
        for(int ms = 1 ; ms <= sc - dc ; ms++) {
            ArrayList<String> hpaths = getMazePathsWithJump1(sr, sc + ms, dr, dc);
            for (String hpath : hpaths) {
                mypaths.add("h" + ms + hpath);
            }

        }
        //for vertical path
            for(int ms = 1 ; ms<= dc-sc ; ms++) {
                ArrayList<String> vpaths = getMazePathsWithJump1(sr + ms, sc, dr, dc);
                for (String vpath : vpaths) {
                    mypaths.add("v" + ms + vpath);
                }
            }
                for(int ms = 1 ; ms<= dc-sc  && ms <=dr-sr; ms++) {
                    ArrayList<String> dpaths = getMazePathsWithJump1(sr + ms, sc + ms, dr, dc);
                    for (String dpath : dpaths) {
                        mypaths.add("d" + ms + dpath);
                    }
                }
                return mypaths;


        }
    }

