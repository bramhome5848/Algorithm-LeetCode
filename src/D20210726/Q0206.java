package D20210726;

/**
 * 206. Reverse Linked List
 */
public class Q0206 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val =val; }
        ListNode(int val, ListNode next) {this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode next = head.next;

        while(next != null) {
            head.next = prev;
            prev = head;
            head = next;
            next = next.next;
        }

        head.next = prev;
        return head;
    }
}
