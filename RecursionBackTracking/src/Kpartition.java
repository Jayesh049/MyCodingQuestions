import java.io.*;
import java.util.*;
public class Kpartition {


        static int counter = 0;
        public static void solution(int i, int n, int emptySet, ArrayList<ArrayList<Integer>> ans) {

            if ( i == n + 1) {
                if (emptySet == 0) {
                    counter++;
                    System.out.print(counter + ". ");

                    for (ArrayList<Integer> set : ans) {

                        System.out.print(set + " ");
                    }
                    System.out.println();
                }
                return;
            }


            for (int k = 0 ; k < ans.size(); k++) {
                ArrayList<Integer> list = ans.get(k);

                if (list.size() == 0) {
                    list.add(i);
                    solution( i + 1, n, emptySet - 1 , ans);
                    int lastelement = list.size() - 1;
                    list.remove(lastelement);
                    break;
                }
                else {
                    list.add(i);
                    solution( i + 1, n, emptySet, ans);
                    int lastelement = list.size() - 1 ;
                    list.remove(lastelement);

                }
            }
        }
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int k = scn.nextInt();
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            for (int i  = 0; i < k; i++) {
                ans.add(new ArrayList<>());
            }
            solution(1, n, k, ans);

        }

    }

