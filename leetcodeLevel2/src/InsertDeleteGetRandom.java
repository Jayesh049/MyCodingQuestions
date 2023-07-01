import java.util.*;
public class InsertDeleteGetRandom {
//Leetcode 380



        Random r;
        HashMap<Integer , Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        public InsertDeleteGetRandom() {
            r = new Random();
            list = new ArrayList<>();
            map = new HashMap<>();

        }

        public boolean insert(int val) {
            if(map.containsKey(val)){
                return false;
            }
            list.add(val);
            map.put(val , list.size() - 1);//addlast waala kaam kar diya humne arraylist ke andar
            //matlab jo bhi value aayi list ke last me add kar ke map me put kar diya

            return true;
        }

        public boolean remove(int val) {
            if(!map.containsKey(val)){
                return false;
            }
            int vidx = map.get(val);//currentvalueIndex
            int lidx = list.size() -1 ;//last index mil gaya
            int lval = list.get(lidx);//last value mil gaya


            //swap In List
            list.set(vidx , lval);//currentvalue ki index par lastvalue daal di jisse swipe karna tha
            list.set(lidx , val);//last index par value daal di
            //swap in map
            map.put(val , lidx);//currentvalue ki index par lastvalue daal di jisse swipe karna tha
            map.put(lval ,vidx);//last index par value daal di

            //remove last element in list O(1)
            list.remove(list.size() -1 );//last element list se remove kar diya
            map.remove(val);

            return true;

        }

        public int getRandom() {
            int idx = r.nextInt(list.size());
            return list.get(idx);
        }
    }

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

