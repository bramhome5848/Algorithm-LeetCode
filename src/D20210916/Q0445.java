package D20210916;

/**
 * 445. Add Two Numbers II
 */
public class Q0445 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head1 = reverse(l1);
        ListNode head2 = reverse(l2);
        ListNode head = new ListNode(-1);
        ListNode curr = head;
        int carry = 0;

        while(head1 != null || head2 != null || carry != 0) {
            if(head1 != null){
                carry += head1.val;
                head1 = head1.next;
            }
            if(head2 != null){
                carry += head2.val;
                head2 = head2.next;
            }

            curr.next = new ListNode(carry % 10);
            carry /= 10;
            curr = curr.next;
        }

        return reverse(head.next);
    }

    private ListNode reverse(ListNode head){

        ListNode prev = null;

        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}
