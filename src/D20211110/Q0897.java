package D20211110;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

/**
 * 897. Increasing Order Search Tree
 */
public class Q0897 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode increasingBST(TreeNode root) {

        TreeMap<Integer, TreeNode> map = new TreeMap<>();
        TreeNode result = new TreeNode();
        TreeNode curr = result;

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()) {
            TreeNode node = que.poll();
            map.put(node.val, node);

            if(node.left != null) que.add(node.left);
            if(node.right != null) que.add(node.right);

            node.left = null;
            node.right = null;
        }

        for(Map.Entry<Integer, TreeNode> e : map.entrySet()) {
            curr.right = e.getValue();
            curr = curr.right;
        }

        return result.right;
    }
}
