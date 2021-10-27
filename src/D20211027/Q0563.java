package D20211027;

/**
 * 563. Binary Tree Tilt
 */
public class Q0563 {

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


    public int findTilt(TreeNode root) {
        return findTiltDfs(root)[1];
    }

    //int[0] = sum
    //int[1] = tilt
    public int[] findTiltDfs(TreeNode root) {
        if(root == null) return new int[]{0, 0};

        int[] left = findTiltDfs(root.left);
        int[] right = findTiltDfs(root.right);

        return new int[]{left[0] + right[0] + root.val,
                Math.abs(left[0] - right[0]) +left[1] + right[1]};
    }
}
