public class Strings {

    public static void main(String[] args) {


        long start = System.currentTimeMillis();

//        String s = "";
//        for (int i = 0; i < 100000; i++) {//o(n^2) 1 + 2 + 3+ 4 +...+n = n(n+1)/2
//            s = s + i;
//        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < 100000; i++){
            sb.append(i);
        }

        long end = System.currentTimeMillis();
        long duration = end - start;
//        System.out.println(duration);
//        System.out.println(s);
//      System.out.println(sb);
    }

}
