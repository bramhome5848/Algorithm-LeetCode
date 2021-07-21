package D20210715;

/**
 * 147. Insertion Sort List
 */
public class Q0147 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }

    public ListNode insertionSortList(ListNode head) {

        if(head == null || head.next == null) return head;
        ListNode sorted = new ListNode(0);
        ListNode iter = head;
        ListNode inserted = null;

        while (iter != null) {
            inserted = iter;
            iter = iter.next;
            insert(sorted, inserted);
        }
        return sorted.next;
    }

    private void insert(ListNode sorted, ListNode inserted) {
        ListNode prev = sorted;
        ListNode curr = sorted.next;

        while (curr != null && curr.val < inserted.val) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = inserted;
        inserted.next = curr;
    }
}
