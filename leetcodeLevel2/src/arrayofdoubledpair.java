import java.util.Arrays;
import java.util.HashMap;

public class arrayofdoubledpair {

        public boolean canReorderDoubled(int[] arr) {


            HashMap<Integer, Integer> map = new HashMap<>();

            Arrays.sort(arr);
            for(int val : arr){
                if(val != 0 ){
                    int valfreq = map.getOrDefault(val , 0);
                    map.put(val , valfreq + 1);
                }

            }







            for(int val: arr){
                // if(val == 0){
                //     continue;
                // }

                if(map.containsKey(val)&& map.containsKey(2 * val)){

                    int vf = map.getOrDefault(val , 0);
                    if(vf > 1){
                        map.put(val , vf - 1);
                    }
                    else{
                        map.remove(val);
                    }

                    int dvf = map.getOrDefault(2 * val , 0);
                    if(dvf > 1){
                        map.put(2 *val , dvf -1);
                    }
                    else{
                        map.remove(2 * val);
                    }


                }

            }
            if(map.size() == 0){
                return true;
            }
            // else if( map.size() == 1 && map.containsKey(0)){
            //     return true;
            // }
            else{
                return false;
            }
        }

    }


