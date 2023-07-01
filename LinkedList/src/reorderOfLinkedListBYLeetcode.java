///*
//import java.util.*;
//import java.io.*;
//
//public class reorderOfLinkedListBYLeetcode {
//
//    public ListNode middleNode(ListNode head) {
//        if(head == null || head.next == null){
//            return head;
//        }
//        ListNode slow = head;
//        ListNode fast = head;
//
//        while(fast != null && fast.next !=null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
//
//    }
//    public ListNode reverseList(ListNode head) {
//        if(head == null || head.next == null){
//            return head;
//        }
//        ListNode previous = null;
//        ListNode current = head;
//
//        while(current != null){
//            //backup
//            ListNode forward = current.next;
//
//            //Linkup;
//
//            current.next = previous;
//            //move
//            previous = current;
//            current = forward;
//        }
//        return previous;
//    }
//    public void reorderList(ListNode head) {
//        if(head == null || head.next == null){
//            return;
//        }
//        //finding middleNode
//        ListNode midNode = middleNode(head);
//        //finding middleNode next and creating nhead
//        ListNode nhead = midNode.next;
//        //breaking the link between sorted list middle of list and nhead
//        midNode.next = null;
//
//        //reversing the new list
//        nhead = reverseList(nhead);
//
//        //Main component of this code
//        ListNode c1 = head;
//        ListNode c2 = nhead;
//
//        while( c2 != null){
//            //backup
//            ListNode  f1 = c1.next  ;
//            ListNode  f2 = c2.next ;
//
//            //linkup
//            c1.next = c2;
//            c2.next = f1;
//
//            //move;
//            c1 = f1;
//            c2 = f2;
//
//        }
//
//
//    }
//}
//}
//*/
