public class Stack {

    /* Java program to implement basic stack
    operations */

        static final int MAX = 1000;
        int top;
        int a[] = new int[MAX]; // Maximum size of Stack

        boolean booleanisEmpty()
        {
            return (top < 0);
        }
        Stack()
        {
            top = -1;
        }

        boolean push(int x)
        {
            if (top >= (MAX - 1)) {
                System.out.println("Stack Overflow");
                return false;
            }
            else {
                a[++top] = x;
                System.out.println(x + " pushed into stack");
                return true;
            }
        }

        int pop()
        {
            if (top < 0) {
                System.out.println("Stack Underflow");
                return 0;
            }
            else {
                int x = a[top--];
                return x;
            }
        }

        int peek()
        {
            if (top < 0) {
                System.out.println("Stack Underflow");
                return 0;
            }
            else {
                int x = a[top];
                return x;
            }
        }

        void print(){
            for(int i = top;i>-1;i--){
                System.out.print(" "+ a[i]);
            }
        }


    // Driver code

        public static void main(String args[])
        {
            Stack s = new Stack();
            s.push(10);
            s.push(20);
            s.push(30);
            System.out.println(s.pop() + " Popped from stack");
            System.out.println("Top element is :" + s.peek());
            System.out.print("Elements present in stack :");
            s.print();
        }



    // Java program to implement a queue using an array
    static class Queue {
        private static int front, rear, capacity;
        private static int queue[];

        Queue(int c)
        {
            front = rear = 0;
            capacity = c;
            queue = new int[capacity];
        }

        // function to insert an element
        // at the rear of the queue
        static void queueEnqueue(int data)
        {
            // check queue is full or not
            if (capacity == rear) {
                System.out.println("Queue is full");
                return;
            }

            // insert element at the rear
            else {
                queue[rear] = data;
                rear++;
            }
            return;
        }

        // function to delete an element
        // from the front of the queue
        static void queueDequeue()
        {
            // if queue is empty
            if (front == rear) {
                System.out.printf("\nQueue is empty\n");
                return;
            }

            // shift all the elements from index 2 till rear
            // to the right by one
            else {
                for (int i = 0; i< rear - 1; i++) {
                    queue[i] = queue[i + 1];
                }

                // store 0 at rear indicating there's no element
                if (rear < capacity)
                    queue[rear] = 0;

                // decrement rear
                rear--;
            }
            return;
        }

        // print queue elements
        static void queueDisplay()
        {
            int i;
            if (front == rear) {
                System.out.printf("Queue is Empty");
                return;
            }

            // traverse front to rear and print elements
            for (i = front; i< rear; i++) {
                System.out.printf(" %d <-- ", queue[i]);
            }
            return;
        }

        // print front of queue
        static void queueFront()
        {
            if (front == rear) {
                System.out.printf("Queue is Empty");
                return;
            }
            System.out.printf("Front Element is: %d", queue[front]);
            return;
        }
    }

    class StaticQueueinjava {

        // Driver code
        public static void main(String[] args)
        {
            // Create a queue of capacity 4
            Queue q = new Queue(4);

            // print Queue elements
            q.queueDisplay();

            // inserting elements in the queue
            q.queueEnqueue(20);
            q.queueEnqueue(30);
            q.queueEnqueue(40);
            q.queueEnqueue(50);

            // print Queue elements
            q.queueDisplay();

            // insert element in the queue
            q.queueEnqueue(60);

            // print Queue elements
            q.queueDisplay();

            q.queueDequeue();
            q.queueDequeue();
            System.out.println("after two node deletion");

            // print Queue elements
            q.queueDisplay();

            // print front of the queue
            q.queueFront();
        }
    }

}
