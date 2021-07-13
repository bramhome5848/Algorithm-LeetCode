package D20210713;

import java.util.HashSet;
import java.util.Set;

/**
 * 142. Linked List Cycle II
 */
public class Q0142 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode detectCycle(ListNode head) {

        ListNode cur = head;

        while(cur != null) {
            if(cur.val == 100001) return cur;

            cur.val = 100001;
            cur = cur.next;
        }

        return null;
    }
}
