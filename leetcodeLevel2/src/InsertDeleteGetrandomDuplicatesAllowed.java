import java.util.*;
public class InsertDeleteGetrandomDuplicatesAllowed {


        HashMap<Integer, HashSet<Integer>> map;
        ArrayList<Integer> list;
        Random rand;

        public InsertDeleteGetrandomDuplicatesAllowed() {
            map = new HashMap<>();
            list = new ArrayList<>();
            rand = new Random();
        }

        public boolean insert(int val) {
//            list.add(val);
//            int lidx = list.size() - 1;

            if(map.containsKey(val)){
                HashSet<Integer> set = map.get(val);

                list.add(val);
                set.add(list.size() - 1);

                return false;
            } else {
                HashSet<Integer> set = new HashSet<>();
                list.add(val);
                set.add(list.size() - 1);
                map.put(val, set);

                return true;
            }
        }

        public boolean remove(int val) {
            if(map.containsKey(val) == false){
                return false;
            }

            int lidx = list.size() - 1;
            int lval = list.get(lidx);
            //for getting first value of the hashset
            //iterator.next jo hota hai wo hashset se first value nikal kar de deta hai
            int vidx = map.get(val).iterator().next();

            //swapping inside the arraylist
            list.set(lidx, val);
            list.set(vidx, lval);

       //removing from the list and hashmap
            list.remove(lidx);

            //map ke andar se value get karke uski idx ko remove kar denge
            map.get(val).remove(vidx);

            //agar map ka size 0 hai
            if(map.get(val).size() == 0){
                map.remove(val);
            }

            if(map.containsKey(lval)){
                map.get(lval).remove(lidx);
                map.get(lval).add(vidx);
            }
            return true;
        }

        public int getRandom() {
            int idx = rand.nextInt(list.size());
            return list.get(idx);
        }
    }

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

