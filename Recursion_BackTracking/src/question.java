import java.awt.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class question {
    static class Novel{
        String name;
        boolean avaiable;
        Novel(String name, boolean avaiable){
            this.name = name;
            this.avaiable = avaiable;
        }
    }
    static Queue<Integer> inputQueue;
    public static void main(String[] args){
        Novel n1 = new Novel("xyz", true);
        Novel n3 = n1;
    }
                //inputQueue (Front -> Rear): [2 ,7 , 4 ,6, 5, 1 ,23 ,20 ,12 ,2];

//    public static Queue obtainQueue(Queue inputQueue) {
//  ;
//  Queue outputQueue = new Queue(20);
//        while(!(inputQueue().isEmpty())){
//            int element1 = inputQueue().dequeue();
//            int element2 = inputQueue().dequeue();
//            if(!(inputQueue().isEmpty())){
//                int element3 = inputQueue().dequeue();
//                if(element2 > (element1 + element3)){
//                    outputQueue.enqueue(element1 + element2);
//                    outputQueue.enqueue(element3);
//                    inputQueue().enqueue(element1 *2);
//                }else{
//                    outputQueue.enqueue(element1 - element2);
//                    outputQueue.enqueue(element2);
//                }
//
//            }
//            else{
//                outputQueue.enqueue(element1);
//            }
//        }
//            return outputQueue;
//
//    }
}
