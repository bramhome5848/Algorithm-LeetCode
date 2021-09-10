package D20210910;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 429. N-ary Tree Level Order Traversal
 */
public class Q0429 {

    public List<List<Integer>> levelOrder(Node root) {

        if(root == null) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        Queue<Node> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()) {
            int size = que.size();
            List<Integer> level = new ArrayList<>();

            for(int i=0 ; i<size ; i++) {
                Node node = que.poll();
                level.add(node.val);
                que.addAll(node.children);
            }
            result.add(level);
        }
        return result;
    }
}

class Node {
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