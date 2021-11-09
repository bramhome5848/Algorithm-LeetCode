package D20211109;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 872. Leaf-Similar Trees
 */
public class Q0872 {

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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();

        searchLeaves(root1, result1);
        searchLeaves(root2, result2);

        if(result1.size() != result2.size()) return false;

        for(int i=0 ; i<result1.size() ; i++) {
            if(!result1.get(i).equals(result2.get(i))) return false;
        }
        return true;
    }

    private void searchLeaves(TreeNode root, List<Integer> result) {

        if(root == null) return;
        if(root.left == null && root.right == null) {
            result.add(root.val);
            return;
        }

        searchLeaves(root.left, result);
        searchLeaves(root.right, result);
    }
}
