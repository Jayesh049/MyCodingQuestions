import java.util.ArrayList;
import java.util.Scanner;

public class getMazePaths {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        ArrayList<String>  path= getMazePaths(1 ,1 , rows , cols);
        System.out.println(path);
    }
    public static ArrayList<String> getMazePaths(int sr , int sc ,int dr ,int dc){
           if( sr == dr && sc == dc ){
               ArrayList<String> bres = new ArrayList<>();
               bres.add("");
               return bres;
           }
           else if(sr> dr || sc > dc){
               ArrayList<String> bres = new ArrayList<>();
               return bres;
           }

        ArrayList<String> mypaths = new ArrayList<>();//first we will make empty string

        ArrayList<String> hpaths = getMazePaths(sr , sc+1 , dr , dc);//for hpaths source column will increase
        for(String hpath: hpaths){//we will define hpath new string here
            mypaths.add("h"  + hpath);//we will add in empty string(mypaths) h + all the route pf elements

        }

        ArrayList<String> vpaths = getMazePaths(sr+1 , sc , dr , dc);
        for( String vpath: vpaths){
            mypaths.add("v" + vpath);
        }

        return mypaths;
    }
}
