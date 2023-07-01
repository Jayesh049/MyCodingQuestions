import java.io.BufferedReader;
import java.io.InputStreamReader;

public class reverseDataRecursive {
    public static class Node {
        int data;
        ReverseLinkedList.Node next;
    }

    public static class LinkedList {
        ReverseLinkedList.Node head;
        ReverseLinkedList.Node tail;
        int size;

        void addLast(int val) {
            ReverseLinkedList.Node temp = new ReverseLinkedList.Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public int size() {
            return size;
        }

        public void display() {
            for (ReverseLinkedList.Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

        public int getFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return head.data;
            }
        }

        public int getLast() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return tail.data;
            }
        }

        public int getAt(int idx) {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else if (idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");
                return -1;
            } else {
                ReverseLinkedList.Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
        }

        public void addFirst(int val) {
            ReverseLinkedList.Node temp = new ReverseLinkedList.Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if (size == 0) {
                tail = temp;
            }

            size++;
        }

        public void addAt(int idx, int val) {
            if (idx < 0 || idx > size) {
                System.out.println("Invalid arguments");
            } else if (idx == 0) {
                addFirst(val);
            } else if (idx == size) {
                addLast(val);
            } else {
                ReverseLinkedList.Node node = new ReverseLinkedList.Node();
                node.data = val;

                ReverseLinkedList.Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                node.next = temp.next;

                temp.next = node;
                size++;
            }
        }

        public void removeLast() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                ReverseLinkedList.Node temp = head;
                for (int i = 0; i < size - 2; i++) {
                    temp = temp.next;
                }

                tail = temp;
                tail.next = null;
                size--;
            }
        }

        public void removeAt(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");
            } else if (idx == 0) {
                removeFirst();
            } else if (idx == size - 1) {
                removeLast();
            } else {
                ReverseLinkedList.Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }

                temp.next = temp.next.next;
                size--;
            }
        }

        private ReverseLinkedList.Node getNodeAt(int idx) {
            ReverseLinkedList.Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp;
        }

        public void reverseDI() {
            int li = 0;
            int ri = size - 1;
            while (li < ri) {
                ReverseLinkedList.Node left = getNodeAt(li);
                ReverseLinkedList.Node right = getNodeAt(ri);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;

                li++;
                ri--;
            }
        }

        public void reversePI() {
            if (size <= 1) {
                return;
            }

            ReverseLinkedList.Node prev = null;
            ReverseLinkedList.Node curr = head;
            while (curr != null) {
                ReverseLinkedList.Node next = curr.next;

                curr.next = prev;
                prev = curr;
                curr = next;
            }

            ReverseLinkedList.Node temp = head;
            head = tail;
            tail = temp;
        }

        public int kthFromLast(int k) {
            ReverseLinkedList.Node slow = head;
            ReverseLinkedList.Node fast = head;
            for (int i = 0; i < k; i++) {
                fast = fast.next;
            }

            while (fast != tail) {
                slow = slow.next;
                fast = fast.next;
            }

            return slow.data;
        }

        public int mid() {
            ReverseLinkedList.Node f = head;
            ReverseLinkedList.Node s = head;

            while (f.next != null && f.next.next != null) {
                f = f.next.next;
                s = s.next;
            }

            return s.data;
        }

        public static ReverseLinkedList.LinkedList mergeTwoSortedLists(ReverseLinkedList.LinkedList l1, ReverseLinkedList.LinkedList l2) {
            ReverseLinkedList.LinkedList ml = new ReverseLinkedList.LinkedList();

            ReverseLinkedList.Node one = l1.head;
            ReverseLinkedList.Node two = l2.head;
            while (one != null && two != null) {
                if (one.data < two.data) {
                    ml.addLast(one.data);
                    one = one.next;
                } else {
                    ml.addLast(two.data);
                    two = two.next;
                }
            }

            while (one != null) {
                ml.addLast(one.data);
                one = one.next;
            }

            while (two != null) {
                ml.addLast(two.data);
                two = two.next;
            }

            return ml;
        }

        public static ReverseLinkedList.Node midNode(ReverseLinkedList.Node head, ReverseLinkedList.Node tail) {
            ReverseLinkedList.Node f = head;
            ReverseLinkedList.Node s = head;

            while (f != tail && f.next != tail) {
                f = f.next.next;
                s = s.next;
            }

            return s;
        }

        public static ReverseLinkedList.LinkedList mergeSort(ReverseLinkedList.Node head, ReverseLinkedList.Node tail) {
            if (head == tail) {
                ReverseLinkedList.LinkedList br = new ReverseLinkedList.LinkedList();
                br.addLast(head.data);
                return br;
            }

            ReverseLinkedList.Node mid = midNode(head, tail);
            ReverseLinkedList.LinkedList fsh = mergeSort(head, mid);
            ReverseLinkedList.LinkedList ssh = mergeSort(mid.next, tail);
            ReverseLinkedList.LinkedList sl = mergeTwoSortedLists(fsh, ssh);
            return sl;
        }

        public void removeDuplicates() {
            ReverseLinkedList.LinkedList res = new ReverseLinkedList.LinkedList();

            while (this.size() > 0) {
                int val = this.getFirst();
                this.removeFirst();

                if (res.size() == 0 || val != res.tail.data) {
                    res.addLast(val);
                }
            }

            this.head = res.head;
            this.tail = res.tail;
            this.size = res.size;
        }

        public void oddEven() {
            ReverseLinkedList.LinkedList odd = new ReverseLinkedList.LinkedList();
            ReverseLinkedList.LinkedList even = new ReverseLinkedList.LinkedList();

            while (this.size > 0) {
                int val = this.getFirst();
                this.removeFirst();

                if (val % 2 == 0) {
                    even.addLast(val);
                } else {
                    odd.addLast(val);
                }
            }

            if (odd.size > 0 && even.size > 0) {
                odd.tail.next = even.head;

                this.head = odd.head;
                this.tail = even.tail;
                this.size = odd.size + even.size;
            } else if (odd.size > 0) {
                this.head = odd.head;
                this.tail = odd.tail;
                this.size = odd.size;
            } else if (even.size > 0) {
                this.head = even.head;
                this.tail = even.tail;
                this.size = even.size;
            }
        }

        public void kReverse(int k) {
            ReverseLinkedList.LinkedList prev = null;

            while (this.size > 0) {
                ReverseLinkedList.LinkedList curr = new ReverseLinkedList.LinkedList();

                if (this.size >= k) {
                    for (int i = 0; i < k; i++) {
                        int val = this.getFirst();
                        this.removeFirst();
                        curr.addFirst(val);
                    }
                } else {
                    int sz = this.size;
                    for (int i = 0; i < sz; i++) {
                        int val = this.getFirst();
                        this.removeFirst();
                        curr.addLast(val);
                    }
                }

                if (prev == null) {
                    prev = curr;
                } else {
                    prev.tail.next = curr.head;
                    prev.tail = curr.tail;
                    prev.size += curr.size;
                }
            }

            this.head = prev.head;
            this.tail = prev.tail;
            this.size = prev.size;
        }

        private void displayReverseHelper(ReverseLinkedList.Node node){
            if(node == null){
                return;
            }
            displayReverseHelper(node.next);
            System.out.print(node.data + " ");
        }

        public void displayReverse(){
            displayReverseHelper(head);
            System.out.println();
        }

      private  void reverseDRHelper(Node right , int floor) {
          if (right == null) {
              return;
          }
      //    reverseDRHelper(right.next, floor + 1);
          if (floor >= size / 2) {
             int temp = left.data;
              left.data = right.data;
              right.data = temp;
           //   left = left.next;
          }
      }

           Node left = null;
            public void reverseDR(){
              //  left = head;
               // reverseDRHelper(head , 0);
          }
      }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());
        ReverseLinkedList.LinkedList l1 = new ReverseLinkedList.LinkedList();
        String[] values1 = br.readLine().split(" ");
        for (int i = 0; i < n1; i++) {
            int d = Integer.parseInt(values1[i]);
            l1.addLast(d);
        }

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        l1.display();
        l1.reversePR();
        l1.addLast(a);
        l1.addFirst(b);
        l1.display();
    }
}

