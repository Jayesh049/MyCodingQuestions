import java.util.*;
public class MaxFreqStack {
// Leetcode 895
        HashMap<Integer,Stack<Integer>> map = new HashMap<>();
        HashMap<Integer , Integer> fmap = new HashMap<>();
        int maxFreq = 0;

        public MaxFreqStack() {
            map = new HashMap<>();
            fmap = new HashMap<>();

        }

        public void push(int val) {
//frequency map making
            fmap.put(val,fmap.getOrDefault(val,0)+1);
//getting frequency of particular value from frequency map
            int freq=fmap.get(val);
//finding maxFreq
            maxFreq = Math.max(freq , maxFreq);


            //making new universal stack
            Stack<Integer> s=new Stack();
//if map contains freq of val in stackmap
            if(map.containsKey(freq)){
                s=map.get(freq);//getting frequency in stack
                System.out.println(s + " ");
            }

//adding values in stack
            //and putting frequency in front of stack

            s.push(val);
            map.put(freq,s);




        }
        public int pop() {

            Stack<Integer> s=map.get(maxFreq);
            int ans=s.pop();
            fmap.put(ans,fmap.get(ans)-1);
            if(map.get(maxFreq).size()==0){
                map.remove(maxFreq);
                maxFreq--;
            }
            return ans;
        }
    }

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */

