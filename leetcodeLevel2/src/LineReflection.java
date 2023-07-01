import java.util.*;
public class LineReflection {
    public class Solution {
        /**
         * @param points: n points on a 2D plane
         * @return: if there is such a line parallel to y-axis that reflect the given points
         */
        public boolean isReflected(int[][] points) {
            if (points == null || points.length == 0 || points[0] == null || points[0].length == 0) return true;
            // Write your code here
            HashSet<String> set = new HashSet<>();

            long xmin = points[0][0];
            long xmax = points[0][0];

            set.add(points[0][0] + "#" + points[0][1]);
            //adding into the HashSet
            for(int i = 1; i < points.length; i++){
                set.add(points[i][0] + "#" +points[i][1]);
                xmin = Math.min(xmin , points[i][0]);
                xmax = Math.max(xmax , points[i][0]);
            }

            //checking this is present in the hashset or not
            long twiceMirr = xmin + xmax;
            for(int i = 0 ;i< points.length ;i++){
                long x = points[i][0];
                long y = points[i][1];
                long ximg = twiceMirr - x;
                long yimg = y;
                if(set.contains(ximg + "#"+ yimg) == false){
                    return false;
                }
            }
            return true;
        }
    }
}
