package D20210714;

import java.util.Stack;

/**
 * 143. Reorder List
 */
public class Q0143 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }

    public void reorderList(ListNode head) {

        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;
        int length = 0;

        while(cur != null) {
            stack.push(cur);
            cur = cur.next;
            length++;
        }

        cur = head;

        for(int i=0 ; i<length/2 ; i++) {
            ListNode node = cur.next;

            cur.next = stack.peek();
            stack.pop().next = node;

            cur = cur.next.next;
        }

        cur.next = null;
    }
}
