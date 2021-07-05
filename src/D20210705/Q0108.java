package D20210705;

/**
 * 108. Convert Sorted Array to Binary Search Tree
 */
public class Q0108 {

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

    public TreeNode sortedArrayToBST(int[] nums) {
        return bst(nums, 0, nums.length-1);
    }

    public TreeNode bst(int[] nums, int s, int e) {

        if(e < s) return null;

        int mid = (s+e) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = bst(nums, s, mid-1);
        root.right = bst(nums, mid+1, e);
        return root;
    }
}
