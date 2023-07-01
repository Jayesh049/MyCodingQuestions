import java.util.*;

public class MinimumNumberofRefuelingStops {

        public int minRefuelStops(int target, int startFuel, int[][] stations) {
            PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
//jo bade number pehle nikalti hai


            int range = startFuel;
            int i = 0;
            int pumpsstop = 0;

            while(range < target){
                //jab tak range target ke choti hai toh kaam chalta rahega
                while( i < stations.length){
                    //ab station ke upar loop lagaana shuru kar diya
                    if(stations[i][0] <= range){
                        //kya ith station range ke andar hai
                        queue.add(stations[i][1]);
                        //iska oil add kar lo
                    } else{//jab range ka number of oil enough nahi hai aage waale pump me pahuchne ke toh kahi pahuch nahi paega toh  break kar denge
                        break;
                    }
                    i++;
                }
                //queue ka size 0 reh jaega toh -1 return kar denge
                if(queue.size() == 0){
                    return -1;
                }

                range += queue.remove();//queue me sabse zyada nikal kar range badhaa liya

                pumpsstop++;

            }
            return pumpsstop;
        }
    }
