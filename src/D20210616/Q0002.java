package D20210616;

/**
 * 2. Add Two Numbers
 */
public class Q0002 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode current = result;
        int sum = 0;

        while(l1 != null || l2 != null) {

            sum = sum/10;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        if(sum/10 == 1) {
            current.next = new ListNode(1);
        }

        return result.next;
    }
}
