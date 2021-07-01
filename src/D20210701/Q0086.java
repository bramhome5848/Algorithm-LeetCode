package D20210701;

/**
 * 86. Partition List
 */
public class Q0086 {
    public static class  ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        ListNode leftCur = left;
        ListNode rightCur = right;

        while(head != null) {
            if(head.val <  x) {
                leftCur.next = head;
                leftCur = leftCur.next;
            } else {
                rightCur.next = head;
                rightCur = rightCur.next;
            }
            head = head.next;
        }
        rightCur.next = null;
        leftCur.next = right.next;
        return left.next;
    }
}
