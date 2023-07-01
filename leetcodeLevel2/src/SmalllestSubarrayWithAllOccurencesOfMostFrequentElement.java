import java.util.*;
public class SmalllestSubarrayWithAllOccurencesOfMostFrequentElement {




        public static void solution(int[] arr) {
            // write your code here
            HashMap<Integer , Integer > fmap =new HashMap<>();
            HashMap<Integer , Integer>  smap = new HashMap<>();

            int hfreq = 0;
            int si = 0;
            int li = 0;
            int len = li - si + 1;
            for(int i = 0 ; i <arr.length ;i++){
                int val = arr[i];
                if(fmap.containsKey(val)){
                    fmap.put(val ,fmap.get(val) + 1);
                }
                else{
                    fmap.put(val , 1);
                    smap.put(val , i);
                }

                int sifromsmap = smap.get(val);
                int currentFreq = fmap.get(val);

                if(currentFreq > hfreq){
                    hfreq = currentFreq;
                    si = sifromsmap;
                    li = i ;
                    len  = li - si + 1;
                }
                else if(currentFreq == hfreq){
                    int challengelength = i - sifromsmap + 1;
                    if(challengelength < len){
                        hfreq = currentFreq;
                        si = sifromsmap;
                        li = i ;
                        len  = li - si + 1;
                    }
                }
            }
            System.out.println(arr[si]);
            System.out.println(si);
            System.out.println(li);


        }

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n; i++){
                arr[i] = scn.nextInt();
            }
            solution(arr);
        }

    }


