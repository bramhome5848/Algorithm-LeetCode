package D20210705;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 112. Path Sum
 */
public class Q0112 {

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

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root == null) return false;

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()) {
            TreeNode node = que.poll();

            if(node.left == null && node.right == null) {
                if(node.val == targetSum) return true;
                else continue;
            }

            if(node.left != null) {
                node.left.val += node.val;
                que.add(node.left);
            }

            if(node.right != null) {
                node.right.val += node.val;
                que.add(node.right);
            }
        }
        return false;
    }
}
