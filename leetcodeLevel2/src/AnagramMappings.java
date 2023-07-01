import java.util.*;
public class AnagramMappings {

    public static int[] anagramMappings(int[] arr1, int[] arr2) {
        // write your code here
        int [] result = new int [arr1.length];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for( int i = 0; i < arr2.length; i++){
            int val  = arr2[i];
            map.computeIfAbsent(val, k->new ArrayList<>()).add(i);
//            System.out.println("New HashMap:\n "                    + map);
        }
//        4 3 2 1 5 2  ->{1=[3], 2=[2, 5], 3=[1], 4=[0], 5=[4]}

        for( int i = 0; i < arr1.length; i++){
            int val = arr1[i];

//            int idx = map.get(val).size();

            int getIndex = map.get(val).size() - 1;
            //dikkat ye aa rahi hai ki arraylist se remove first se karna hai

            result[i] = map.get(val).remove(getIndex);//map.get(val).size() - 1

            System.out.println( " " + map);
//            {1=[], 2=[2, 5], 3=[1], 4=[0], 5=[4]}
//            {1=[], 2=[2], 3=[1], 4=[0], 5=[4]}
//            {1=[], 2=[2], 3=[], 4=[0], 5=[4]}
//            {1=[], 2=[2], 3=[], 4=[], 5=[4]}
//            {1=[], 2=[2], 3=[], 4=[], 5=[]}
//            {1=[], 2=[], 3=[], 4=[], 5=[]}
           getIndex--;
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
