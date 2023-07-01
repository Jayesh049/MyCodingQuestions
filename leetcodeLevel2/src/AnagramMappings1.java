import java.util.*;
public class AnagramMappings1 {

    public static  int[] anagramMappings(int[] A, int[] B) {
        if (A == null || B == null || A.length == 0) {
            return null;
        }

        int[] result = new int[A.length];
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        // Prepare the map
        for (int i = 0; i < B.length; i++) {
            map.putIfAbsent(B[i], new ArrayList<>());
            map.get(B[i]).add(i);
        }

        for (int i = 0; i < A.length; i++) {
            ArrayList<Integer> list = map.get(A[i]);
            result[i] = list.get(0);
            list.remove(0);
        }
        return result;


    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        for (int j = 0; j < b.length; j++) {
            b[j] = s.nextInt();
        }
        int[] res = anagramMappings(a, b);
        for (int j = 0; j < res.length; j++) {
            System.out.print(res[j] + " ");
        }
    }

}
