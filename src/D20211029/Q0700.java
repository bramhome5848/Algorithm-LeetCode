package D20211029;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 700. Search in a Binary Search Tree
 */
public class Q0700 {

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

    public TreeNode searchBST1(TreeNode root, int val) {

        if(root == null || root.val == val) return root;

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()) {
            TreeNode node = que.poll();
            if(node.val == val) return node;

            if(node.left != null) que.add(node.left);
            if(node.right != null) que.add(node.right);
        }

        return null;
    }

    public TreeNode searchBST2(TreeNode root, int val) {
        if(root == null || root.val == val) return root;
        if(root.val > val) return searchBST2(root.left, val);
        return searchBST2(root.right, val);
    }
}
