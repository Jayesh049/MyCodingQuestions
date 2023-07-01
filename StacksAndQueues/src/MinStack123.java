import java.io.*;
import java.util.*;
public class MinStack123 {



        public static class MinStack {
            Stack<Integer> allData;
            Stack<Integer> minData;

            public MinStack() {
                allData = new Stack<>();
                minData = new Stack<>();
            }


            int size() {
                // write your code here
                return allData.size();//ye correct kiya
            }

            void push(int val) {
                // write your code here
                //initially
                //{ yaha par changes nahi laa paaya mai baaki poora code sahi hai
                if(allData.size() ==0){
                    minData.push(val);
                }
                allData.push(val);
                //}
                //after filling some data into the array
                if( allData.peek() <=       minData.peek()){
                    minData.push(val);
                }
            }

            int pop() {//pop code is right
                // write your code here
                if(allData.peek() == -1 ){// jaha jaha pr maine peek par -1 daal kar error daalna chaha waha pr wo work kyu nahi kiya which is (allData.peek = -1)
                    System.out.println("Stack underflow");
                    return -1;
                }

                else{//yaha pr else lgana bhul gya
                    //after filling some stack
                    if(allData.peek() == minData.peek()){//yaha par sab sahi kiya tha bas

                        int val = allData.pop(); // naya val initialise karna bhul gya tha jaise int val =allData.pop();
                        minData.pop();
                        return val;
                    }
                    else {//if(allData.peek() > minData.peek())
                        int val =allData.pop();
                        return val;
                    }

                }
            }

            int top() {
                // write your code here
                if(allData.peek() == -1){
                    System.out.println("Stack underflow");
                    return -1;
                }else{//mai else lagana bhul gya tha agar hum else use kar rahe hai toh ye ho jaata hai ya toh ye(if) ho ya wo(else) ho
                    return allData.peek();
                }
            }

            int min(){
                // write your code here
                if(minData.size() == 0){
                    System.out.println("Stack underflow");
                    return -1;
                }else{
                    return minData.peek();
                }
            }
        }

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            MinStack st = new MinStack();

            String str = br.readLine();
            while(str.equals("quit") == false){
                if(str.startsWith("push")){
                    int val = Integer.parseInt(str.split(" ")[1]);
                    st.push(val);
                } else if(str.startsWith("pop")){
                    int val = st.pop();
                    if(val != -1){
                        System.out.println(val);
                    }
                } else if(str.startsWith("top")){
                    int val = st.top();
                    if(val != -1){
                        System.out.println(val);
                    }
                } else if(str.startsWith("size")){
                    System.out.println(st.size());
                } else if(str.startsWith("min")){
                    int val = st.min();
                    if(val != -1){
                        System.out.println(val);
                    }
                }
                str = br.readLine();
            }
        }
    }

