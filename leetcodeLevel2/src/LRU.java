import java.util.HashMap;

public class LRU    {
    //leetcode 146
    class LRUCache {

        static class Node{
            Node prev;
            Node next;
            int key;
            int value;
        }
        Node head;
        Node tail;
        int cap ;
        int size;

        HashMap<Integer , Node> map = new HashMap<>();

        void addFront(int key , int value){
            Node node = new Node();
            node.key = key;//uski key
            node.value = value;//uski value

            if(size == 0){//agar size 0 hai toh
                head = tail = node; //head bhi yahi hai tail bhi yahi hai node bhi yahi hai
            }else{
                node.next = head;//node ka agla head (node -> head)
                head.prev  = node;//head ka pichla node(head -> node)
                head = node; //node humaara head ban gya
            }
            size++;

        }
        void remove(Node node){
            if(head == null){//head null hai toh return kar do
                return;
            } else if(head == tail){//agar head tail baraabar hai
                head = tail = null;//head tail ko null kardo
            } else if(node == head){//agar ye pehla node hai toh
                head = head.next;//head ka agla head ho jayega (2 - > 3(head))
                head.prev = null;//head ka pichla null kar denge(2(null) - > 3(head))
            } else if(node == tail){//agar node tail hai
                Node nm1 = tail.prev;//tail ka pichla 2 ->4(tail) = 2(tail) -> 4
                nm1.next = null;//2(tail) -> 4(null)
                tail = nm1;//toh naya tail 2 ho jayega
            } else {//agar beech me hai kahi
                Node np1 = node.next;//2->4->5(np1)
                Node nm1 = node.prev;//2(nm1) ->4 ->5

                nm1.next = np1;//2(nm1)->5(np1)
                np1.prev = nm1;//2(nm1)<-5(np1)
            }
            size--;
        }


        public LRUCache(int capacity) {
            this.cap = capacity;
            this.size = 0;

        }

        public int get(int key) {
            if(map.containsKey(key)){
                Node node =map.get(key);
                remove(node);
                addFront(key ,node.value);
                map.put(key ,head);
                return node.value;
            }else{
                return -1;
            }

        }

        public void put(int key, int value) {
            if(map.containsKey(key) == true){
                Node node =map.get(key);
                remove(node);
                addFront(key , value);
                map.put(key , head);
            }else{
                if(cap == size){
                    map.remove(tail.key);//map se remove karenge tail ki key ko
                    remove(tail);//dll ke andar se remove karenge uski tail ko
                    //fir dll ke andar add karo
                    addFront(key , value);
                    //fir map ke andar add
                    map.put(key , head);
                }
                else{//if capacity smaller than size
                    addFront(key , value);
                    map.put(key , head);
                }
            }


        }
    }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
}
