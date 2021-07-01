package D20210701;

/**
 * 83. Remove Duplicates from Sorted List
 */
public class Q0083 {

    public static class  ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while(current != null) {
            ListNode next = current.next;
            while(next != null && current.val == next.val) {
                next = next.next;
            }
            current.next = next;
            current = current.next;
        }

        return head;
    }
}
