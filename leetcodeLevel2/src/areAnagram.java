import java.util.*;

public class areAnagram {
    //wrong approach

    public static void findAnagrams(String s, String p) {
            HashMap<Character , Integer> smap = new HashMap<>();
            HashMap<Character , Integer> pmap = new HashMap<>();

            ArrayList<Integer> ans = new ArrayList<>();

            if(s.length() < p.length()){
                System.out.println(ans);;
            }
            //step 1
            for(int i = 0 ; i < p.length() ; i++){
                char chp = p.charAt(i);
                int chpf = pmap.getOrDefault(chp , 0);
                pmap.put(chp , chpf + 1);
            }
            //step 2
            for(int i = 0 ; i< p.length() ; i++){
                char chs = s.charAt(i);
                int chsf = smap.getOrDefault(chs , 0);
                smap.put(chs , chsf + 1);
            }


            if(areAnagram(smap , pmap) == true ){
                ans.add(0);
            }


            int i = p.length();
            int j = 0;
            while(i < s.length()) {
                //i ki frequency hum badhaenge
                char chi = s.charAt(i);
                int chif = smap.getOrDefault(chi, 0);
                    smap.put(chi, chif + 1);

                //j ki frequency hum ghataenge
                char chj = s.charAt(j);
                int chjf = smap.getOrDefault(chj, 0);
                smap.put(chj, chjf - 1);

               if(areAnagram(smap , pmap) == true){
                   ans.add(j + 1);
               }
              i++;j++;
            }

//            System.out.println("count of anagrams " + ans.size());
            for(int val : ans){
                System.out.println(val +" ");
            }
        }



        public static boolean areAnagram(HashMap<Character , Integer> smap ,HashMap<Character , Integer> pmap) {
            for (char sch : smap.keySet()) {
                int chs = smap.getOrDefault(sch , 0);
                int chp = pmap.getOrDefault(sch , 0);
                if (!Objects.equals(chs , chp)) {
                    return false;
                }
            }
            return true;
        }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        String p = scn.next();
        findAnagrams(s, p);
    }

}




