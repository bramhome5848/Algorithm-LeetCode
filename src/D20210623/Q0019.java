package D20210623;

/**
 * 19. Remove Nth Node From End of List
 */
public class Q0019 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        n = getSequence(head) - n + 1;
        ListNode start = head;
        int cnt = 1;

        if(cnt == n) head = head.next;

        while(cnt < n) {
            cnt++;
            if(cnt == n) {
                start.next = start.next.next;
                break;
            } else {
                start = start.next;
            }
        }
        return head;
    }

    public int getSequence(ListNode head) {
        int cnt = 1;
        while(head.next != null) {
            head = head.next;
            cnt++;
        }
        return cnt;
    }
}
