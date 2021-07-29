package D20210730;

/**
 * 237. Delete Node in a Linked List
 */
public class Q0237 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * You will not be given access to the head of the list,
     * instead you will be given access to the node to be deleted directly.
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
