import java.util.*;
public class SnapshotArray {


        private Map<Integer , Integer> [] snapshotHistoryMap;
        //ye hashmap ka array banaa liya ,jitni length hongi utni hashmap banaa liye
        private Integer snapId;
        //snapId ko initialise kar liya

        public SnapshotArray(int length) {
            //stARTING ME  snap id ko 0 kar diya baad me badhate jaayenge jab jab snap karne ke liye bolega
            snapId = 0;

            snapshotHistoryMap = new HashMap[length];
            //aur kitna badaa array bnaa liya jtni length humein given hai
            //matlab har index ke liye ek ek banaa liya
            for(int i = 0 ;i < length ;i++){
                //by default jo array hota hai usme sab null padaa hota hai
                snapshotHistoryMap[i] = new HashMap<>();
                //saare hashmap new karke rakh liye
            }
        }

        public void set(int index, int val) {
            //jo humaara hashmap hai uspr jaao uski index me snapId ke saamne value put kar do
            //for example set(2(index) , 4(val)) -> 0(snapid) ke saamne (val)val put kar do{0 ,4}
            snapshotHistoryMap[index].put(snapId, val);

        }

        public int snap() {
            return snapId++;
            //snap ke andar snapId badhaa do
        }
        //check for the latest snap id and keep on decreasing it if is not found ,else return zero
        public int get(int index, int snap_id) {
            while(snap_id >= 0){
                //dekho uss paricular index me hashmap me snap_id padi hai ki nahi padi hai
                if(snapshotHistoryMap[index].containsKey(snap_id)){
                    //agar padi hai toh value utha kar dedo
                    return snapshotHistoryMap[index].get(snap_id);
                }
                //nahi padi hui toh snap id ek kam kar do
                snap_id--;
                //jab tak 0 nahi ho jaate
            }
            //agar 0 hote bhi nahi milta toh snap id kabhi mila hi nahi toh return 0 kar do

            return 0;
        }
    }

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */
