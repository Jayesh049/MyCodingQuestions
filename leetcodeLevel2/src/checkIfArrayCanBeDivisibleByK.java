import java.util.*;
public class checkIfArrayCanBeDivisibleByK {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        solution(arr, k);
    }

    public static void solution(int[] arr, int k) {
        //write your code here
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int val : arr){
            int rem = val % k;
            if(map.containsKey(rem)){
                map.put(rem , map.get(rem) + 1);

            }
            else{
                map.put(rem , 1);
            }
        }



        for(int val : arr){
            int rem = val %k ;
            if( 2 * rem == k){ // k = rem / 2; ke baraabar nahi likh skte
                //agar remainder even hai
                // jo center waala hai usse hum aise likh skte hai 2 * rem == k
                int remvalFreq = map.getOrDefault(rem , 0);
                if( remvalFreq % 2 == 0){
                    //uski frequency ke andar even numbers nahi hai toh false print karke return kar do
                    System.out.println("true");
                    return ;
                }
            } else if( rem == 0){
                //jiski remainder 0 aayi hai
                int remvalFreq= map.get(rem);
                if(remvalFreq % 2 != 0){
                    //uski frequency ke andar even numbers nahi  hai toh false print karke return kar do
                    System.out.println("false");
                    return;
                }
                else{//agar har remainder ki frequency k-remainder ki frequency ke saath equal nahi hai toh false print and return
                    if(map.get(rem)!= map.get(k -rem)){
                        System.out.println("false");
                        return;
                    }
                }
            }//sab ke paas se bachne ke baad koi pair aata hai toh true print kar do
            System.out.println("true");

        }
    }




}


