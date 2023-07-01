import java.util.*;
public class IsAPowerOf4 {


  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    //write your code here
    if(n == 0 || n == Integer.MIN_VALUE){
         System.out.println(false);
    }
      if(!isPowerOfTwo(n)){
          System.out.println(false);
      }
      int count = 0;
      while(n != 1){
          count++;
          System.out.print("count ->" + count);
          n >>>= 1;//shift 1 by 3
//          System.out.println(n);
      }

      System.out.println((count & 1) ==0);

  }



    public static boolean isPowerOfTwo(int n){
        return n > 0 && (n & (n- 1)) ==0;
    }

}


