package D20210713;

import java.util.HashMap;
import java.util.Map;

/**
 * 138. Copy List with Random Pointer
 */
public class Q0138 {

    public static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {

        if(head == null) return null;

        Map<Node, Node> data = new HashMap<>();
        Node cur = head;

        while(cur != null) {
            Node node = new Node(cur.val);
            data.put(cur, node);
            cur = cur.next;
        }

        cur = head;
        while(cur != null) {
            Node node = data.get(cur);
            node.next = data.get(cur.next);
            node.random = data.get(cur.random);
            cur = cur.next;
        }

        return data.get(head);
    }
}
