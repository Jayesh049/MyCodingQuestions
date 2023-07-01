import java.io.*;
import java.util.*;
public class gfgcountofsubstrinexactlyequalstok {
    //{ Driver Code Starts
//Initial Template for Java



        public static void main (String[] args)
        {

            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while(t-- > 0)
            {
                String s = sc.next ();
                int k = sc.nextInt();
                System.out.println (new gfgcountofsubstrinexactlyequalstok().substrCount (s, k));
            }

        }

// } Driver Code Ends


//User function Template for Java




        public static int getValuefork1(String S){
            HashMap<Character , Integer> map =new HashMap<>();
            int i = -1;
            int j = -1;
            int ans = 0;
            while(true){
                boolean f1 =false;
                boolean f2 =false;
                while(i < S.length() -1){
                    i++;
                    char ch = S.charAt(i);
                    map.put(ch , map.getOrDefault(ch , 0) + 1);

                    if(map.size() == 2){
                        f1 =true;
                        removeInMap(map , ch);
                        i--;
                        break;
                    }
                }
                while( j < i){
                    if(map.size() == 1){
                        ans += i - j;

                    }
                    f2 =true;
                    j++;
                    char ch = S.charAt(j);
                    removeInMap(map , ch);
                    if(map.size() == 0){
                        break;
                    }
                }
                if(f1 == false && f2 == false){
                    break;
                }
            }
            return ans;

        }

        long substrCount (String S, int K) {
            // your code here
            HashMap<Character , Integer> bmap = new HashMap<>();
            HashMap<Character ,Integer> smap = new HashMap<>();
            int ib = -1;
            int is = -1;
            int j = -1;
            int ans = 0;

            if(K ==1){
                return getValuefork1(S);
            }
            while(true){
                boolean f1 = true;
                boolean f2 = true;
                boolean f3 = true;
                while(ib < S.length() -1 ){
                    f1 = true;
                    ib++;
                    char ch = S.charAt(ib);
                    bmap.put(ch , bmap.getOrDefault(ch, 0) + 1);

                    if(bmap.size() == K+ 1){
                        removeInMap(bmap , ch);
                        ib--;
                        break;
                    }

                }

                while(is < ib){
                    f2 = true;
                    is++;
                    char ch = S.charAt(is);
                    smap.put(ch ,smap.getOrDefault(ch ,0) + 1);


                    if(smap.size() == K){
                        removeInMap(smap , ch);
                        is--;
                        break;
                    }
                }

                while(j < is){
                    f3 =true;
                    if(bmap.size() == K && smap.size() == K -1){
                        ans += ib - is;
                    }

                    j++;
                    char ch = S.charAt(j);
                    removeInMap(bmap ,ch);
                    removeInMap(smap ,ch);

                    if(bmap.size() < K && smap.size() < K -1){
                        break;
                    }
                }
                if(f1 == false && f2 == false && f3 == false){
                    break;
                }
            }
            return ans;

        }
        public static void removeInMap(HashMap<Character , Integer> map , char ch){

            if(map.get(ch) == 1){
                map.remove(ch);
            }
            else{
                map.put(ch , map.get(ch) - 1);
            }
        }
    }
