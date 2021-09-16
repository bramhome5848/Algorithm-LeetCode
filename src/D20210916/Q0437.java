package D20210916;

/**
 * 437. Path Sum III
 */
public class Q0437 {

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

    public int pathSum(TreeNode root, int targetSum) {

        if(root == null) return 0;
        return pathSumRootToNode(root, targetSum);
    }

    public int pathSumRootToNode(TreeNode root, int targetSum) {

        if(root == null) return 0;

        int count = 0;

        if(root.val-targetSum == 0) count++;
        if(root.left != null) count += pathSumRootToNode(root.left, targetSum-root.val);
        if(root.right != null) count += pathSumRootToNode(root.right, targetSum-root.val);

        return count;
    }
}
