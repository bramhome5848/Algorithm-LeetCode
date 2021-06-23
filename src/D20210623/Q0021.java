package D20210623;

/**
 * 21. Merge Two Sorted Lists
 */
public class Q0021 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode resultCurrent = result;

        while(l1 != null || l2 != null) {

            if(l1 != null && l2 != null) {
                if(l1.val < l2.val) {
                    resultCurrent.next = new ListNode(l1.val);
                    l1 = l1.next;
                } else if(l1.val > l2.val) {
                    resultCurrent.next = new ListNode(l2.val);
                    l2 = l2.next;
                } else {
                    resultCurrent.next = new ListNode(l1.val);
                    resultCurrent = resultCurrent.next;
                    resultCurrent.next = new ListNode(l2.val);
                    l1 = l1.next;
                    l2 = l2.next;
                }
            } else {
                if(l1 != null) {
                    resultCurrent.next = new ListNode(l1.val);
                    l1 = l1.next;
                } else {
                    resultCurrent.next = new ListNode(l2.val);
                    l2 = l2.next;
                }
            }
            resultCurrent = resultCurrent.next;
        }
        return result.next;
    }
}
