package D20210706;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 129. Sum Root to Leaf Numbers
 */
public class Q0129 {

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

    public int sumNumbers(TreeNode root) {

        if(root == null) return 0;
        if(root.left == null && root.right == null) return root.val;

        int result = 0;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()) {
            TreeNode node = que.poll();
            int befV = node.val * 10;

            if(node.left == null && node.right == null) {
                result += node.val;
                continue;
            }

            if(node.left != null) {
                node.left.val += befV;
                que.add(node.left);
            }

            if(node.right != null) {
                node.right.val += befV;
                que.add(node.right);
            }
        }

        return result;
    }
}
