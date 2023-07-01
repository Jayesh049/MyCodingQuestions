import java.util.Scanner;

public class printAllPermutationOfStringIteratively {



        public static void solution(String str) {
            int n = str.length();//this is we are denoting string ki length
            int f = factorial(n);

                for (int i = 0; i < f; i++) {
                    StringBuilder sb = new StringBuilder(str);
                    int temp = i;

                    for (int div = str.length(); div >= 1; div--) {
                        int quotient = temp / div;
                        int remainder = temp % div;

                        System.out.print(sb.charAt(remainder));
                        sb.deleteCharAt(remainder);

                        temp = quotient;
                    }
                    System.out.println();

                }
            }
        public static int factorial(int n) {
            int val = 1;
            for (int i = 2; i <= n; i++) {
                val = val * i;
            }
            return val;
        }
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String str = scn.next();
            solution(str);
        }

    }

