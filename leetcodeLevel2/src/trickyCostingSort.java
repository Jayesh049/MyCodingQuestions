import java.io.*;
import java.util.*;
public class trickyCostingSort {



        public static int sortingCost(int arr[]) {
            // code here
            int max = 0;
            HashMap<Integer , Integer> map = new HashMap<>();

            for(int val : arr ){
                if(map.containsKey(val - 1)){
                    map.put(val , map.get(val - 1) + 1);
                }
                else{
                    map.put(val , 1);
                }

                int newmx =map.get(val);
                if(newmx > max){
                    max = newmx;
                }
            }
            return arr.length - max;

        }

        public static void main(String args[]) throws IOException {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(sortingCost(arr));
        }
    }
