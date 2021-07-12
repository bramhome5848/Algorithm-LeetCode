package D20210712;

import java.util.*;

/**
 * 133. Clone Graph
 */
public class Q0133 {

    public static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node cloneGraph(Node node) {

        if(node == null) return null;

        Map<Integer, Node> data = new HashMap<>();
        Queue<Node> que = new LinkedList<>();

        data.put(node.val, new Node(node.val));
        que.add(node);

        while(!que.isEmpty()) {

            Node cur = que.poll();
            List<Node> cloneNeighbors = new ArrayList<>();

            for(Node neighbor : cur.neighbors) {
                if(!data.containsKey(neighbor.val)) {
                    Node next = new Node(neighbor.val);
                    data.put(next.val, next);
                    que.add(neighbor);
                }

                cloneNeighbors.add(data.get(neighbor.val));
            }

            data.get(cur.val).neighbors = cloneNeighbors;
        }
        return data.get(node.val);
    }
}
