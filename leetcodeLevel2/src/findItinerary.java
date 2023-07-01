import java.util.*;
public class findItinerary {

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int noofpairs_src_des = scn.nextInt();
            HashMap<String, String> map = new HashMap<>();
            for (int i = 0; i < noofpairs_src_des; i++) {
                String s1 = scn.next();
                String s2 = scn.next();
                map.put(s1, s2);
            }

            System.out.println(map.keySet());
            HashMap<String, Boolean> psrc = new HashMap<>();

            for (String src : map.keySet()) {

//                System.out.println("this is src " +src);
                String dest = map.get(src);
//                System.out.println("this is dest " + dest);
                psrc.put(dest, false);
//                System.out.print(psrc);
                if (psrc.containsKey(src) == false) {
                    psrc.put(src, true);
                }
                System.out.println("After gettingn psrc true" +psrc+ "@");
            }

            String src = "";
            for (String pot : psrc.keySet()) {
                Boolean val = psrc.get(pot);
                if (val == true) {
                    src = pot;
                    break;
                }
            }


            while (true) {
                if (map.containsKey(src) == true) {
                    System.out.print(src + " -> ");
                    src = map.get(src);
                }
                else {
                    System.out.print(src + ".");
                    break;
                }
            }
        }
    }





