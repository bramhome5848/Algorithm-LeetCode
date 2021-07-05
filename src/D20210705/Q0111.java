package D20210705;

/**
 * 111. Minimum Depth of Binary Tree
 */
public class Q0111 {

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

    public int minDepth(TreeNode root) {
        if(root == null) return 0;

        int lHeight = -1;
        int rHeight = -1;

        if(root.left != null) lHeight = minDepth(root.left);
        if(root.right != null) rHeight = minDepth(root.right);

        if(lHeight != -1 && rHeight != -1) return Math.min(lHeight, rHeight) + 1;
        else if(lHeight == -1 && rHeight != -1) return rHeight + 1;
        else if(lHeight != -1 && rHeight == -1) return lHeight + 1;

        return 1;
    }
}
