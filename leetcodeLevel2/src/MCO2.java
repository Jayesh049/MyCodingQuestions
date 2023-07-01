import java.util.*;
public class MCO2 {
    //approachByMe
//https://practice.geeksforgeeks.org/problems/maximum-consecutive-ones/1?page=1&sortBy=newest&query=page1sortBynewest
    //https://practice.geeksforgeeks.org/problems/maximize-number-of-1s0905/1



        public static int solution(int[] arr, int k) {

            int tl = 0;
            int ans = 0;
            for (int i = 0 , j = 0; i < arr.length ; i++) {
                if (arr[i] == 0) {
                    tl++;
                    while (tl > k) {
                        if (arr[j] == 0) {
                            tl--;
                        }
                        j++;
                    }
                }
                ans = Math.max(ans, i - j + 1);

            }
            return ans;
        }


        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0 ; i  < n; i++) {
                arr[i] = scn.nextInt();
            }
            int k = scn.nextInt();
            System.out.println(solution(arr, k));
        }

    }
