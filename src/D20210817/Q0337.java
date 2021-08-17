package D20210817;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 337. House Robber III
 */
public class Q0337 {

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

    public static class Pair {
        int withRob;
        int withoutRob;

        public Pair(int withRob, int withoutRob) {
            this.withRob = withRob;
            this.withoutRob = withoutRob;
        }
    }

    public int rob(TreeNode root) {
        Pair result = robHouse(root);
        return Math.max(result.withRob, result.withoutRob);
    }

    private Pair robHouse(TreeNode root) {

        if(root == null) return new Pair(0, 0);

        Pair left = robHouse(root.left);
        Pair right = robHouse(root.right);

        return new Pair(root.val + left.withoutRob + right.withoutRob,
                Math.max(left.withRob, left.withoutRob) + Math.max(right.withRob, right.withoutRob));
    }
}
