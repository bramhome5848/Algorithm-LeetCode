package D20211116;

/**
 * 1022. Sum of Root To Leaf Binary Numbers
 */
public class Q1022 {

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

    public int sumRootToLeaf(TreeNode root) {
        return preOrder(root, 0);
    }

    private int preOrder(TreeNode root, int sum) {
        if(root == null) return 0;

        sum = 2 * sum + root.val;
        if(root.left == null && root.right ==null) return sum;
        return preOrder(root.left, sum) + preOrder(root.right, sum);
    }
}
