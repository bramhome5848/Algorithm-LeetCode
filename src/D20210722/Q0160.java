package D20210722;

/**
 * 160. Intersection of Two Linked Lists
 */
public class Q0160 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode l1 = headA;
        ListNode l2 = headB;

        int lengthA = getLength(headA);
        int lengthB = getLength(headB);

        int gap = Math.abs(lengthA - lengthB);

        if(lengthA > lengthB) {
            while(gap-- > 0) l1 = l1.next;
        } else {
            while(gap-- > 0) l2 = l2.next;
        }

        while(l1 != l2) {
            l1 = l1.next;
            l2 = l2.next;
        }

        return l1;
    }

    private int getLength(ListNode head) {
        int length = 0;
        while(head != null) {
            head = head.next;
            length++;
        }
        return length;
    }
}
