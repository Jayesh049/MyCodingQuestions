import java.util.*;
import java.io.*;
import java.lang.*;
public class countPairsInArrayDivisibleByK {
    //{ Driver Code Starts



        public static void main (String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
            while(t-->0){

                int n = Integer.parseInt(br.readLine().trim());
                String inputLine[] = br.readLine().trim().split(" ");
                int arr[] = new int[n];
                for(int i=0; i<n; i++){
                    arr[i] = Integer.parseInt(inputLine[i]);
                }

                int k = Integer.parseInt(br.readLine().trim());

                Solution ob= new Solution();
                System.out.println(ob.countKdivPairs(arr, n, k));
            }
        }
    }
// } Driver Code Ends


//User function Template for Java


//User function Template for Java

    class Solution
    {
        public static long countKdivPairs(int arr[], int n, int k)
        {
            //code here
            long ans = 0;
            HashMap<Long,Long> hm = new HashMap<>();
            for(long i = 0; i < k; i++){
                hm.put(i,0L);
            }
            for(long v:arr){


                if(v<0){
                    v+=k;
                }
                long rem = v%k;
                if(hm.containsKey(rem)){
                    hm.put(rem,hm.get(rem)+1);
                }
            }
            //for non0 and non mid
            long i = 1,j = k-1;
            while(i<j){
                long fi = hm.get(i);
                long fj = hm.get(j);
                ans += fi*fj;
                i++;j--;
            }
            //for mid
            if(k%2 == 0){
                long mid = hm.get(k/2);
                ans+= (mid*(mid-1))/2;
            }
            //for 0
            long f = hm.get(0);
            ans += (f*(f-1))/2;


            return ans;
        }
    }

