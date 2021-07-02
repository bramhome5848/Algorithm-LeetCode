package D20210702;

import D20210701.Q0086;

import java.util.HashMap;
import java.util.Map;

/**
 * 92. Reverse Linked List II
 */
public class Q0092 {

    public static class  ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(left == right || head == null || head.next == null) return head;
        ListNode cur = head;
        ListNode prevLeft = null;
        ListNode prev = null;
        ListNode temp = null;
        int count = 0;

        do {
            count++;
            if(left <= count && count <= right) {
                temp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = temp;
            } else {
                prevLeft = cur;
                cur = cur.next;
            }
        } while(count < right);


        if(prevLeft != null){
            if(prevLeft.next != null){
                prevLeft.next.next = temp;
            }
            prevLeft.next = prev;
        } else{
            head.next = temp;
            head = prev;
        }
        return head;
    }
}
