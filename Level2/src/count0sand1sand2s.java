//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GFG{
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0){
            String str = read.readLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.getSubstringWithEqual012(str));
        }
    }
}
// } Driver Code Ends https://practice.geeksforgeeks.org/problems/equal-0-1-and-23208/1


//User function Template for Java
class Solution
{
    long getSubstringWithEqual012(String str)
    {
        // code here
        long ans = 0;

        int c0 = 0;
        int c1 = 0;
        int c2 = 0;

        String key ="0#0";

        HashMap<String , Integer> map = new HashMap<>();

        map.put(key , 1);


        for(int i = 0 ; i < str.length() ; i++){

            char ch = str.charAt(i);

            if(ch == '0'){
                c0++;
            }
            else if(ch == '1'){
                c1++;
            }
            else{
                c2++;
            }

            //baad me key nikaal lo
            key = (c1 - c0) +"#" + (c2 - c1);

            if(map.containsKey(key)){
                int val = map.get(key);//get karaa
                ans += val;//ans ke andar add kara get kiya hua element
                map.put(key , val + 1);//fir key ke saath  ek value badha di
            }
            else{
                map.put(key , 1);//naya key hai toh key ke saath naya fresh maal 1 daal diya
            }

        }
        return ans;
    }
}