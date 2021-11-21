package D20211121;

/**
 * 1290. Convert Binary Number in a Linked List to Integer
 */
public class Q1290 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public int getDecimalValue1(ListNode head) {

        StringBuilder sb = new StringBuilder();
        int result = 0;

        while(head != null) {
            sb.append(head.val);
            head = head.next;
        }

        sb.reverse();

        for(int i=0 ; i<sb.length() ; i++) {
            result += Math.pow(2, i) * (sb.charAt(i) - '0');
        }

        return result;
    }

    public int getDecimalValue2(ListNode head) {

        ListNode iter = head;
        int count = 0;
        int result = 0;

        while(iter != null) {
            count++;
            iter = iter.next;
        }

        while(head != null) {
            result += head.val * Math.pow(2, count-- -1);
            head = head.next;
        }

        return result;
    }
}
