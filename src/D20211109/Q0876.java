package D20211109;

/**
 * 876. Middle of the Linked List
 */
public class Q0876 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head) {

        ListNode curr = head;
        int length = 0;

        while(curr != null) {
            length++;
            curr = curr.next;
        }

        curr = head;
        for(int i=1 ; i<length/2+1 ; i++) curr = curr.next;
        return curr;
    }
}
