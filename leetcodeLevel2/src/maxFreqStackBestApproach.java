import java.util.*;
public class maxFreqStackBestApproach {

        private Map<Integer, Integer> frequencies;
        private Map<Integer, Stack<Integer>> stacks;
        private int maxFrequency;

        public maxFreqStackBestApproach() {
            frequencies = new HashMap<>();
            stacks = new HashMap<>();
            maxFrequency = -1;
        }

        public void push(int val) {
            if (!frequencies.containsKey(val)) {
                frequencies.put(val, 0);
            }

            frequencies.put(val, frequencies.get(val) + 1);

            maxFrequency = Math.max(maxFrequency, frequencies.get(val));

            if (!stacks.containsKey(frequencies.get(val))) {
                stacks.put(frequencies.get(val), new Stack<>());
            }

            stacks.get(frequencies.get(val)).push(val);
        }

        public int pop() {
            int result = stacks.get(maxFrequency).pop();
            frequencies.put(result, frequencies.get(result) - 1);
            if (stacks.get(maxFrequency).isEmpty()) {
                stacks.remove(maxFrequency);
                maxFrequency--;
            }
            return result;
        }
    }

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */

