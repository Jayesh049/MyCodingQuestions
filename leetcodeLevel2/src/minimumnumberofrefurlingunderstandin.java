import java.io.*;
public class minimumnumberofrefurlingunderstandin {
    // Java code for the above approach





        // Function to find minimum refuel stops
        static int minRefuelStops(int T, int F, int[][] S)
        {
            int n = S.length;
            int[][] t = new int[n + 1][n + 1];
            for (int i = 0; i < n + 1; i++)
                t[i][0] = F;


            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j <= i; j++) {
                    t[i][j] = t[i - 1][j];
                    if (t[i - 1][j - 1] >= S[i - 1][0]) {
                        t[i][j] = Math.max(t[i][j],
                                t[i - 1][j - 1]
                                        + S[i - 1][1]);
                    }
                }
            }
            for (int j = 0; j < n + 1; j++) {
                if (t[n][j] >= T)
                    return j;
            }
            return -1;
        }

        public static void main(String[] args)
        {
            int target = 100;
            int M = 10;
            int[][] stations = {
                    { 10, 60 }, { 20, 30 }, { 30, 30 }, { 60, 40 }
            };

            // Function call
            System.out.print(
                    minRefuelStops(target, M, stations));
        }
    }


