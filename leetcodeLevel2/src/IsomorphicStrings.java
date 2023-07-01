import java.util.*;
public class IsomorphicStrings {

        public boolean isIsomorphic(String s, String t) {

            if(s.length() != t.length()){
                return false;
            }

            HashMap<Character , Character> map1 = new HashMap<>();
            HashMap<Character , Boolean> map2 = new HashMap<>();

            for(int i = 0 ;i <s.length() ; i++){
                char ch1 = s.charAt(i);
                char ch2 = t.charAt(i);

                if(map1.containsKey(ch1) == true){//agar map1 ke andar character1 pehle se hi padaa hai
                    if(map1.get(ch1) != ch2){//agar character1 character2 ke saath mapped nahi hai
                        return false;//toh return false kar do


                    }
                }
                else{
                    if(map2.containsKey(ch2) == true){//character2 pehle se hi used hai
                        return false;//toh return false kar do
                    }
                    else{//agar map2 pehle se used nahi hai toh
                        map1.put(ch1 , ch2);//character1 ke saamne character2 daal do
                        map2.put(ch2, true);//character 2 ke saamne daal do ki wo true hai
                    }
                }
            }
            return true;//sab se bach ke aagya toh true return kar do
        }
    }

