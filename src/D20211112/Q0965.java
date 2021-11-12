package D20211112;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 965. Univalued Binary Tree
 */
public class Q0965 {

    public class TreeNode {
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

    public boolean isUnivalTree(TreeNode root) {

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()) {
            TreeNode node = que.poll();

            if(root.val != node.val) return false;
            if(node.left != null) que.add(node.left);
            if(node.right != null) que.add(node.right);
        }

        return true;
    }
}
