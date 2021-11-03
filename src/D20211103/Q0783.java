package D20211103;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 783. Minimum Distance Between BST Nodes
 */
public class Q0783 {

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

    public int minDiffInBST(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        int result = Integer.MAX_VALUE;

        inOrder(root, list);

        for(int i=1 ; i<list.size() ; i++) {
            result = Math.min(result, list.get(i) - list.get(i-1));
        }
        return result;
    }

    private void inOrder(TreeNode root, List<Integer> list) {
        if(root == null) return;

        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
}
