package D20210701;

/**
 * 82. Remove Duplicates from Sorted List II
 */
public class Q0082 {
    public static class  ListNode {
            int val;
            Q0082.ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode result = new ListNode(-101);
        result.next = head;
        ListNode cur = result;

        while(cur.next != null && cur.next.next != null) {
            if(cur.next.val == cur.next.next.val) {
                int value = cur.next.val;
                cur.next = cur.next.next.next;
                while(cur.next != null && cur.next.val == value) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }
        return result.next;
    }
}
