import java.io.*;
import java.util.*;

public class leetcodeAnagramMappings {
    public static int[] anagramMappings(int[] A, int[] B) {

        int [] result = new int [A.length];
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for( int i = 0; i < B.length; i++){
            map.computeIfAbsent(B[i], k->new ArrayList<>()).add(i);
        }

        for( int i = 0; i < A.length; i++){
            ArrayList<Integer> res = map.get(A[i]);
            result[i] =res.get(0);
            res.remove(0);
//            result[i] = map.get(A[i]).remove(map.get(A[i]).size() - 1);//ye ulta return karne ke liye
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.nextInt();
        }
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = s.nextInt();
        }
        int[] res = anagramMappings(arr1, arr2);
        for (int j = 0; j < res.length; j++) {
            System.out.print(res[j] + " ");
        }
    }
}

