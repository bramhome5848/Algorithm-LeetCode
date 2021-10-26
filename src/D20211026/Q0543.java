package D20211026;

/**
 * 543. Diameter of Binary Tree
 */
public class Q0543 {

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

    public int diameterOfBinaryTree(TreeNode root) {

        TreeNode result = new TreeNode();
        search(root, result);
        return result.val;
    }

    private int search(TreeNode root, TreeNode result) {

        if(root == null) return 0;

        int left = search(root.left, result);
        int right = search(root.right, result);
        result.val = Math.max(result.val, left+right);

        return Math.max(left, right) + 1;
    }
}
