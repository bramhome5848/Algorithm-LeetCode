package D20210831;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 382. Linked List Random Node
 */
public class Q0382 {
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {

    private final List<Integer> data;
    private final Random random;

    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        data = new ArrayList<>();
        random = new Random();
        listToData(head);
    }

    /** Returns a random node's value. */
    public int getRandom() {
        return data.get(random.nextInt(data.size()));
    }

    private void listToData(ListNode head) {

        while(head != null) {
            data.add(head.val);
            head = head.next;
        }
    }
}
