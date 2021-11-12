package D20211112;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 938. Range Sum of BST
 */
public class Q0938 {

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

    public int rangeSumBST1(TreeNode root, int low, int high) {

        int sum = 0;

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()) {
            TreeNode node = que.poll();
            if(low <= node.val && node.val <= high) sum += node.val;

            if(node.left != null) que.add(node.left);
            if(node.right != null) que.add(node.right);
        }

        return sum;
    }

    public int rangeSumBST2(TreeNode root, int low, int high) {

        if(root == null) return 0;
        if(low <= root.val && root.val <= high) {
            return root.val + rangeSumBST2(root.left, low, high) + rangeSumBST2(root.right, low, high);
        } else {
            if(root.val >= high) return rangeSumBST2(root.left, low, high);
            else return rangeSumBST2(root.right, low, high);
        }
    }
}
