import java.util.*;
public class EquivalentSubarrays {

//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/hashmap-and-heaps/equivalent-subarrays-official/ojquestion

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            HashSet<Integer> set = new HashSet<>();//kitne unique elements hai
            for (int i = 0 ; i  < n; i++) {
                arr[i] = scn.nextInt();
                set.add(arr[i]);
            }
            //write your code here

            int k = set.size();

            int j = -1 ;
            int i = - 1;
            int ans = 0;

            HashMap<Integer, Integer> map = new HashMap<>();
            while (true) {
                boolean f1 = false;
                boolean f2 = false;
                while (i < arr.length - 1) {
                    f1 = true;


                    i++;
                    map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

                    if (map.size() == k) {
                        ans += arr.length - i;
                        break;
                    }

                }
                while ( j < i) {
                    f2 = true;


                    j++;
                    if (map.get(arr[j]) == 1) {
                        map.remove(arr[j]);

                    } else {
                        map.put(arr[j], map.get(arr[j]) - 1);
                    }

                    if (map.size() == k) {
                        ans += arr.length - i;
                    } else {
                        break;
                    }

                }

                if (f1 == false && f2 == false) {
                    break;
                }
            }
            System.out.println(ans);

        }


    }


