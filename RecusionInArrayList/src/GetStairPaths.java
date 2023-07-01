import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPaths {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        ArrayList<String> paths =getStairPaths(n);
        System.out.println(paths);
    }
    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String>bres = new ArrayList<>();
            bres.add("");
            return bres; //[""] ->1
        }
        else if(n <0){
            ArrayList<String> bres = new ArrayList<>();
            return bres; //[] -> 0
        }

        ArrayList<String>pathsfromnm1 = getStairPaths(n-1);
        ArrayList<String>pathsfromnm2 = getStairPaths(n-2);
        ArrayList<String>pathsfromnm3 = getStairPaths(n-3);

        ArrayList<String> pathsfromn = new ArrayList<>();

        for(String pathfromnm1 :pathsfromnm1){//pathfromnm1 ko get kiya hai
            String pathfromn = "1" +pathfromnm1;//pathfromn ko get kiya {n-1 ,me 1 add karke}
            pathsfromn.add(pathfromn);//fir humne pathsfromn to add kar diya pathfromn me there is minor difference of s
        }
        for(String pathfromnm2 :pathsfromnm2){//pathfromnm2 ko get kiya hai
            String pathfromn = "2" +pathfromnm2;//pathfromn ko get kiya {n-2 ,me 2 add karke}
            pathsfromn.add(pathfromn);//fir humne pathsfromn to add kar diya pathfromn me there is minor difference of s
        }
        for(String pathfromnm3 :pathsfromnm3){//pathfromnm3 ko get kiya hai
            String pathfromn = "3" +pathfromnm3;//pathfromn ko get kiya {n-3 ,me 3 add karke}
            pathsfromn.add(pathfromn);//fir humne pathsfromn to add kar diya pathfromn me there is minor difference of s
        }

        return pathsfromn;//fir return kardiya easy
    }
}
