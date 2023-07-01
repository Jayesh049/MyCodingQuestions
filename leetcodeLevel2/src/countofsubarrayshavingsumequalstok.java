import java.util.*;
public class countofsubarrayshavingsumequalstok {
    public static int solution(int[] arr, int target){

        // code here
        int ans = 0;
        int sum = 0;
        HashMap<Integer ,Integer > map = new HashMap<>();
        map.put(sum , 1);

        for(int i = 0 ; i < arr.length ; i++){
            int val = arr[i];

            sum += val;

            if(map.containsKey(sum - target)){
                int smkg = map.get(sum - target);
                ans+= smkg;
            }
            if(map.containsKey(sum)){
                int val1 = map.get(sum);
                map.put(sum ,  val1+ 1);
            }
            else{
                map.put(sum , 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        System.out.println(solution(arr,target));
    }


}
