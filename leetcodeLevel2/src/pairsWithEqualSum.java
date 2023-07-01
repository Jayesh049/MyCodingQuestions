import java.util.*;
public class pairsWithEqualSum {


    public class Main {

        public static boolean solution(int[] arr) {
            // write your code here
            //nc2 = n( n- 1)/2 banane ka common trick
            HashSet<Integer> set = new HashSet<>();

            for(int i = 0 ; i < arr.length ;i++){
                for(int j = i+ 1 ; j < arr.length ; j++){
                    // int sum =arr[i] + arr[j] ;
                    if(set.contains(arr[i] + arr[j])){
                        return true;
                    }else{//set ke andar agar nahi padaa ho toh set ke andar add kar do dono values ko matlab sum ko
                        set.add(arr[i] + arr[j]);
                    }

                }
            }


            return false;
        }

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            System.out.println(solution(arr));
        }

    }

}
