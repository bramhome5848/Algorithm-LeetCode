package D20210629;

/**
 * 61. Rotate List
 */
public class Q0061 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || k == 0) return head;

        int l = getLength(head);
        k = k % l;

        while(k-- > 0) head = shift(head);

        return head;
    }

    public ListNode shift(ListNode head) {

        ListNode cur = head;

        while(cur.next.next != null) {
            cur = cur.next;
        }

        ListNode result = cur.next;
        cur.next = null;
        result.next = head;
        return result;
    }

    public int getLength(ListNode head) {
        ListNode cur = head;
        int count = 0;

        while(cur != null) {
            count++;
            cur = cur.next;
        }

        return count;
    }
}
