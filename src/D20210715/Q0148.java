package D20210715;

/**
 * 148. Sort List
 */
public class Q0148 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }

    //O(n log n) time and O(1) memory...
    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode middle = getMiddleNode(head);
        ListNode nextOfMiddle = middle.next;

        middle.next = null;

        ListNode firstPart = sortList(head);
        ListNode secondPart = sortList(nextOfMiddle);

        return merge(firstPart, secondPart);
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        if(l1.val <= l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }

    private ListNode getMiddleNode(ListNode node) {

        ListNode slow = node;
        ListNode fast = node;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
