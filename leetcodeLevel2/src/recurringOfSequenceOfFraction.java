import java.util.*;
public class recurringOfSequenceOfFraction {
    //leetocode 166
        public String fractionToDecimal(int numerator, int denominator) {

            StringBuilder ans = new StringBuilder();
            if ((numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0))
                ans.append("-");

            long num = (long) Math.abs((long) numerator);
            long den = (long) Math.abs((long) denominator);


            long q = num / den;
            long r = num % den;
            // ans += to_string(q);
            ans.append(String.valueOf(q));

            if(r == 0){
                return ans.toString();
            }

            ans.append(".");
            HashMap<Long , Integer> map =new HashMap<>();
            while(r != 0){
                if(map.containsKey(r)){
                    int len = map.get(r);
                    ans.insert(len , "(");
                    ans.append(")");
                    return ans.toString();
                }else{
                    map.put(r , ans.length());
                    r  *= 10;
                    q = r / den;
                    r %= den;
                    ans.append(String.valueOf(q));
                }
            }

            return ans.toString();
        }
    }