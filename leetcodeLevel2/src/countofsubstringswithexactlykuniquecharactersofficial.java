import java.util.*;
public class countofsubstringswithexactlykuniquecharactersofficial {

//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/hashmap-and-heaps/count-of-substrings-with-exactly-k-unique-characters-official/ojquestion

        public static int solutionfork1(String str){
            int ans = 0;

            HashMap<Character ,Integer> map = new HashMap<>();
            int i = -1 ;
            int j = -1 ;
            while(true){
                boolean f1 =false;
                boolean f2 = false;
                while( i < str.length() - 1){
                    f1= true;
                    i++;
                    char ch = str.charAt(i);
                    map.put(ch , map.getOrDefault(ch  , 0) + 1);

                    if(map.size() == 2){
                        removeInMap(map, ch);
                        i--;
                        break;

                    }
                }
                while(j < i){
                    f2 = true;
                    if(map.size() == 1){
                        ans += i - j;

                    }
                    j++;
                    char ch = str.charAt(j);
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

        public static int solution(String str, int k) {
            int ans = 0;


            if(k == 1){
                return solutionfork1(str);
            }
            HashMap<Character ,Integer> mapb = new HashMap<>();
            HashMap<Character ,Integer> maps = new HashMap<>();

            int is = -1 ;
            int ib = -1;
            int j =   -1;
            // write your code here
            while (true) {
                boolean f1 = false;
                boolean f2 = false;
                boolean f3 = false;

                while (ib < str.length() - 1 ) {
                    f1 = true;

                    ib++;
                    char ch = str.charAt(ib);
                    mapb.put(ch, mapb.getOrDefault(ch, 0 ) + 1);

                    if (mapb.size() == k + 1 ) {
                        removeInMap(mapb, ch);
                        ib--;
                        break;
                    }
                    System.out.println(mapb.keySet());
                }

                while (is < ib) {
                    f2 = true;

                    is++;
                    char ch = str.charAt(is);
                    maps.put(ch, maps.getOrDefault(ch, 0) + 1);

                    if (maps.size() ==  k ) {
                        removeInMap(maps, ch);
                        is--;
                        break;
                    }
                    System.out.println(maps.keySet());

                }

                while (j < is) {
                    f3 = true;

                    if (mapb.size() == k && maps.size() == k - 1) {
                        ans += ib - is;
                        System.out.print(ans + " ");
                    }

                    j++;
                    char ch = str.charAt(j);
                    removeInMap(maps, ch);
                    removeInMap(mapb, ch);

                    if (maps.size() < k - 1 || mapb.size() < k) {
                        break;
                    }
                }


                if(f1 == false && f2 == false && f2 == false){
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
                map.put(ch , map.get(ch) -1 );
            }
        }


        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String str = scn.next();
            int k = scn.nextInt();
            System.out.println(solution(str, k));
        }

    }


//2nd approach



//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        String str = scn.next();
//        int k = scn.nextInt();
//        System.out.println(solution(str,k) - solution(str,k-1));
//    }
//
//    public static int solution(String str, int K){
//        int j = 0, res = 0;
//        Map<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (map.getOrDefault(ch, 0) == 0) K--;
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//            while (K < 0) {
//                char chj = str.charAt(j);
//                map.put(chj, map.get(chj) - 1);
//                if (map.get(chj) == 0) K++;
//                j++;
//            }
//            res += i - j + 1;
//        }
//        return res;
//    }
//
//}



