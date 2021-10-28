package D20211028;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 653. Two Sum IV - Input is a BST
 */
public class Q0653 {

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

    public boolean findTarget(TreeNode root, int k) {

        Queue<TreeNode> que = new LinkedList<>();
        Set<Integer> set = new HashSet<>();

        que.add(root);

        while(!que.isEmpty()) {
            TreeNode node = que.poll();
            if(set.contains(k-node.val)) return true;

            set.add(node.val);

            if(node.left != null) que.add(node.left);
            if(node.right != null) que.add(node.right);
        }

        return false;
    }
}
