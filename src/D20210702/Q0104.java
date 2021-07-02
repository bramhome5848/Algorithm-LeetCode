package D20210702;

/**
 * 104. Maximum Depth of Binary Tree
 */
public class Q0104 {

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

    public int maxDepth(TreeNode root) {

        if(root == null) return 0;

        int result = maxDepth(root.left);
        result = Math.max(result, maxDepth(root.right));
        return result+1;
    }
}
