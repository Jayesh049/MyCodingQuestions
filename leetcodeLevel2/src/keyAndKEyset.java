import java.util.*;
public class keyAndKEyset {




        public static void main(String[] args) {
            HashMap<Integer , Integer> map = new HashMap<>();


            map.put(5 , 1);
            map.put(10 , 2);
            map.put(17 , 2);
            map.put(20 , 2);
            map.put(60 , 2);
            map.put(75 , 1);

            for (int key : map.keySet()) {
                long keyFreq = (long) map.getOrDefault(key, 0);
                System.out.println(key + " " + keyFreq);
            }


        }
    }

