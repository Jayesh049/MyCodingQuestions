import java.util.*;
public class minimumWindowSubstring {

        public static String minWindow(String s, String t) {
            if(t.length() > s.length()){
                return "";

            }

            HashMap<Character ,Integer > tmap = new HashMap<>();
            for(int i = 0 ; i < t.length() ;i++){
                char ch = t.charAt(i);
                tmap.put(ch , tmap.getOrDefault(ch , 0) +  1);
            }

            int mmc = t.length();//mixmatchcharacter
            int i = 0;
            int j = -1;

            HashMap<Character , Integer> smap = new HashMap<>();
            String ans = "";

            while(true){
                while(mmc  > 0 && i< s.length()){
                    char ch = s.charAt(i);
                    smap.put(ch , smap.getOrDefault(ch , 0) + 1);

                    int sfreq = smap.getOrDefault(ch , 0);
                    int tfreq = tmap.getOrDefault(ch , 0);
                    if(sfreq <= tfreq ){
                        mmc--;
                    }
                    i++;
                }
                while(mmc ==0 && j < i){
                    String pans = s.substring(j  + 1, i);

                    if(ans.length() == 0){
                        ans = pans;
                    }
                    else if( pans.length() < ans.length()){
                        ans = pans;
                    }
                    j++;


                    char ch  = s.charAt(j);
                    smap.put(ch , smap.getOrDefault(ch,0) - 1);

                    int sfreq = smap.getOrDefault(ch , 0);
                    int tfreq = tmap.getOrDefault(ch , 0);

                    if(sfreq < tfreq ){
                        mmc++;
                    }
                }

                if(i == s.length()){
                    break;
                }
            }
            return ans;
        }
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String s1 = scn.next();
            String s2 = scn.next();
            System.out.println(minWindow(s1,s2));
        }
}
