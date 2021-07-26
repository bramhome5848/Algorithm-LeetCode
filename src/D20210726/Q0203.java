package D20210726;

/**
 * 203. Remove Linked List Elements
 */
public class Q0203 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val =val; }
        ListNode(int val, ListNode next) {this.val = val; this.next = next; }
    }
    public ListNode removeElements(ListNode head, int val) {

        if(head == null) return head;

        ListNode curr = head;

        while(curr.next != null) {
            if(curr.next.val == val) curr.next = curr.next.next;
            else curr = curr.next;
        }

        if(head.val == val) return head.next;
        return head;
    }
}
