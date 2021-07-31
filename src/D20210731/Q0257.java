package D20210731;

import java.util.ArrayList;
import java.util.List;

/**
 * 257. Binary Tree Paths
 */
public class Q0257 {

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

    public List<String> binaryTreePaths(TreeNode root) {

        if(root == null) return null;
        
        List<String> result = new ArrayList<>();
        preOrder(root, new StringBuilder(), result);
        return result;
    }

    private void preOrder(TreeNode root, StringBuilder sub, List<String> result) {

        if(root == null) return;

        int length = sub.length();
        sub.append(root.val);
        if(root.left == null && root.right == null) {
            result.add(sub.toString());
        } else {
            sub.append("->");
            if(root.left != null) preOrder(root.left, sub, result);
            if(root.right != null) preOrder(root.right, sub, result);
        }

        sub.setLength(length);
    }
}
