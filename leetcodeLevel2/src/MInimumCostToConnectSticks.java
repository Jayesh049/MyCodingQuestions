import java.util.*;
public class MInimumCostToConnectSticks {
    //lintcode 1872

        /**
         * @param sticks: the length of sticks
         * @return: Minimum Cost to Connect Sticks
         */
        public int minimumCost(List<Integer> sticks) {
            // write your code here
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            //PriorityQueue ke andar saare stick nikaal li sticks ke andar loop lagaa lagaa karke
            for(int stick: sticks){
                pq.add(stick);//fir pq me add kar li ek ek karke stick
            }
            //ab jo stick add honge pq me  wo sorted order me honge

            //ab cost nikalte hai
            int cost = 0;

            //jab tak pq ki size 1 se jyada hai toh
            //do chote elements nikal lenge pq ke andar se
            while(pq.size() > 1){
                int s1 = pq.remove();
                int s2 = pq.remove();

                //cost ke andar add kar denge do chote elements nikaale hue
                cost += s1 + s2;

                //unn do chote elements ka sum add kar denge pq ke andar
                pq.add(s1 + s2);

            }
            //pq ka size jaise hi 1 hoga return kr denge cost
            return cost;
        }

    }

