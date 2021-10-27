package D20211027;

import java.util.ArrayList;
import java.util.List;

/**
 * 590. N-ary Tree Postorder Traversal
 */
public class Q0590 {

    public static class Node {
        public int val;
        public List<Node> children;
        public Node() {}
        public Node(int _val) {val = _val;}
        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        dfsSearch(root, result);
        return result;
    }

    private void dfsSearch(Node root, List<Integer> result) {

        if(root == null) return;

        for(Node child : root.children) dfsSearch(child, result);
        result.add(root.val);
    }
}
