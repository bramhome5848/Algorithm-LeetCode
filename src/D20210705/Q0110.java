package D20210705;

/**
 * 110. Balanced Binary Tree
 */
public class Q0110 {

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

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        int lHeight = height(root.left);
        int rHeight = height(root.right);

        if(Math.abs(lHeight - rHeight) <= 1
                && isBalanced(root.left) && isBalanced(root.right)) return true;

        return false;
    }

    public int height(TreeNode root) {
        if(root == null) return 0;

        int lHeight = height(root.left);
        int rHeight = height(root.right);

        return Math.max(lHeight, rHeight) + 1;
    }
}
