package D20210812;

/**
 *
 */
public class Q0328 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode first = head;
        ListNode second = head.next;
        ListNode temp = head.next;

        while(second != null && second.next != null) {

            first.next = second.next;
            second.next = second.next.next;
            first = first.next;
            second = second.next;
        }

        first.next = temp;
        return head;
    }
}
