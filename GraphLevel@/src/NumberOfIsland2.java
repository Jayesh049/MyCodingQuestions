import java.util.*;
import java.io.*;
public class NumberOfIsland2 {


        public static void main(String[] args) throws NumberFormatException, IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] st = br.readLine().split(" ");
            int m = Integer.parseInt(st[0]);
            int n = Integer.parseInt(st[1]);
            int q = Integer.parseInt(st[2]);

            int[][] pos = new int[q][2];
            for (int i = 0; i < q; i++) {
                st = br.readLine().split(" ");
                pos[i][0] = Integer.parseInt(st[0]);
                pos[i][1] = Integer.parseInt(st[1]);
            }

            System.out.println(numIslands2(m, n, pos));
        }
        static int count;
        static int[] parent;
        static int[] rank;
        public static List<Integer> numIslands2(int m, int n, int[][] positions) {
            // write your code here
            int[][] grid = new int[m][n];
            parent = new int[n * m];
            rank   = new int[n * m];

            for(int i = 0 ; i < m * n ; i++){
                parent[i] = i;
                rank[i] = 0;
            }

            ArrayList<Integer> res = new ArrayList<>();
            count = 0;

            for(int[] pos: positions){
                //jis bhi position ki baat hoti hai uska x y nikaal leta hu for suppose [1, 3] hai first position array ke andar toh x humara 1 ho jaega jo ki 0 position par hai aur y humaara 3 ho jaega 1 position par
                int x = pos[0];
                int y = pos[1];

                //grid me x y par 1 daal diya
                grid[x][y] = 1;
                //aur maan liya ki ek naya land ban gaya count badha diya
                count++;

                //ab north west south east par koi bhi merge ho raha hai toh count ghataa diya
                handle(x , y , x + 1 , y , m , n , grid);
                handle(x , y , x - 1 , y , m , n , grid);
                handle(x , y , x , y + 1 , m , n , grid);
                handle(x , y , x , y - 1 , m , n , grid);

//last me humaara count jo ki number of island hai usko nikaal liya
                res.add(count);
            }
            //result return kar diya
            return res;
        }

        //   x aur y jiss box me humne 1 daala hai jiss box me hum dekh rahe hai ki union hogaa ki nahi hoga , m and n uski dimension and grid
        static void handle(int x , int y , int xx , int yy , int m , int n , int[][] grid ){
            //agar wo bahar hai ya box me 0 padaa hai toh return kar do
            if(xx < 0 || yy < 0 || xx >= m || yy >= m || grid[xx][yy] == 0){
                return;
            }


            //xy waale cell ka box number nikaal liya
            int xyCell = x * n + y;
            //jiss box par hum jaa rhe hai uska box number nikaal liya
            int xxyyCell = xx * n + yy;

            //unke lead mangaaye
            int xyLead = find(xyCell);
            int xxyyLead = find(xxyyCell);

            //agar unke lead same nahi hai toh count(number of island) ghataa do aur union kar do
            if(xyLead != xxyyLead){
                count--;
                union(xyLead , xxyyLead);
            }
        }


        static int find(int i){
            if(parent[i] == i){
                return i;
            } else {
                parent[i] = find(parent[i]);
                return parent[i];
            }
        }

        static void union(int i, int j){
            if(rank[i] < rank[j]){
                parent[i] = j;
            } else if(rank[j] < rank[i]){
                parent[j] = i;
            } else {
                parent[i] = j;
                rank[j]++;

            }
        }
    }
/*
Given an m*n matrix mat, Originally, the 2D matrix is all 0 which means there is only sea in the matrix. The list pair has k operator and each operator has two integer A[i].x, A[i].y means that you can change the grid mat[A[i].x][A[i].y] from sea to island. Return how many island are there in the matrix after each operator.You need to return an array of size K.
Input Format
First line contains three integers m and n and k.
Each of next k lines contain 2 numbers denoting row and col to change into 1.
Output Format
print number of island after each operation.

Constraints
1<= m,n <= 10000
1<= k <= 10^6
Sample Input
3 3 4
0 0
0 1
1 2
2 1
Sample Output
[1, 1, 2, 3]
 */