import java.util.ArrayDeque;
import java.util.Queue;

public class QueueBasics {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println(queue);//10,20,30
        System.out.println(queue.peek());//10
        queue.remove();//20 , 30

        System.out.println(queue);//20,30
        System.out.println(queue.peek());//20
        queue.remove();//20

        System.out.println(queue);//30
        System.out.println(queue.peek());//30
        queue.remove();//null

//        System.out.println(queue);
//        System.out.println(queue.peek());
//        queue.remove(); // will give error cause queue is empty

    }
}
