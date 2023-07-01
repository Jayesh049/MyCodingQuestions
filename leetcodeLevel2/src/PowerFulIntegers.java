import java.util.*;
public class PowerFulIntegers {
    //Leetcode 970

        public List<Integer> powerfulIntegers(int x, int y, int bound) {
            HashSet<Integer> set = new HashSet<>();
            ArrayList<Integer> list = new ArrayList<>();

            //agar bound hi less than ya baraabar hai 1 ke toh khaali list return kar do
            if(bound <= 1){
                return list;
            }

            //agar x bhi 1 hai y bhi 1 hai toh power me kitne bhi value daal lo dono ki power 1 hi rahegi
            else if(x == 1 && y ==1){
                list.add(2);//dono x aur y ko add karke
                return list;//return kar do
            }
            //agar x = 1 ho toh sirf y ka loop chalega find karne ke liye power
            else if(x == 1){
                for(int vy = 1; 1 + vy <= bound ; vy *= y)//vy *=y ka mtlb y ko y ke saath multiply kar rahe hai taaki power yki power n ban sake
                {
                    int val = 1 + vy;
                    if(set.contains(val) == false){
                        list.add(val);
                        set.add(val);
                    }
                }
                return list;
            }
            else if(y == 1){
                for(int vx = 1;  vx + 1<= bound ; vx *= x){
                    int val = vx + 1;
                    if(set.contains(val) == false){
                        list.add(val);
                        set.add(val);
                    }
                }
                return list;
            }

            else{
                //last and main part of the code when we have both x and y are present in our input
                for(int vx = 1 ; vx <= bound ; vx *= x){
                    for(int vy = 1; vx + vy <= bound ; vy *= y){
                        int val  = vx + vy;
                        if(set.contains(val) == false){
                            list.add(val);
                            set.add(val);
                        }
                    }

                }
            }
            return list;

        }
    }
