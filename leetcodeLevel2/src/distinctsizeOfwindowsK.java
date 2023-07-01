//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class distinctsizeOfwindowsK {
//
//    public static ArrayList<String> solution(String[] str, int k) {
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for(int i= 0; i < k; i++){
//            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
//        }
//
//        System.out.println(map.size());
//
//        int j = 0;
//        for(int i = k; i < str.length(); i++){
//            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
//
//            if(map.get(str.charAt(j)) == 1){
//                map.remove(str.charAt(j));
//            } else {
//                map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0) - 1);
//            }
//            j++;
//
//            System.out.println(map.size());
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        String[] arr = new String[scn.nextInt()];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scn.nextLine();
//        }
//        int k = scn.nextInt();
//        ArrayList<String> ans = solution(arr,k);
//        for(int i = 0 ; i < ans.length() ;i++){
//            int a = ans.charAt(i);
//            System.out.print(a + " ");
//        }
//    }
//}
