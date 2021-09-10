package D20210910;

import java.util.ArrayList;
import java.util.List;

/**
 * 430. Flatten a Multilevel Doubly Linked List
 */
public class Q0430 {

    public static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }

    public Node flatten(Node head) {
        if (head == null) return null;

        List<Node> list = new ArrayList<>();
        Node prev = null;

        flatten(head, list);
        for(Node node : list) {
            if (prev != null) prev.next = node;
            node.prev = prev;
            node.child = null;
            prev = node;
        }

        return head;
    }

    private void flatten(Node head, List<Node> list) {
        if (head == null) return;
        list.add(head);
        if (head.child != null) flatten(head.child, list);
        flatten(head.next, list);
    }
}



