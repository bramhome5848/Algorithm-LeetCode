package D20211027;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q0559 {

    public static class Node {
        public int val;
        public List<Node> children;

        public Node() {}
        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public int maxDepth1(Node root) {

        if(root == null) return 0;

        Queue<Node> que = new LinkedList<>();
        que.add(root);
        int depth = 0;

        while(!que.isEmpty()) {

            int size = que.size();
            for(int i=0 ; i<size ; i++) {
                Node node = que.poll();
                assert node != null;
                que.addAll(node.children);
            }
            depth++;
        }

        return depth;
    }

    public int maxDepth2(Node root) {

        if(root == null) return 0;

        int maxD = 0;
        for(Node child : root.children) maxD = Math.max(maxD, maxDepth2(child));
        return maxD+1;
    }
}
