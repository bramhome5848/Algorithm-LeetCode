package D20210730;

/**
 * 236. Lowest Common Ancestor of a Binary Tree
 */
public class Q0236 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null) return null;
        if(root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null) return root;  //find
        if(left == null && right == null) return null;  //leaf

        return left != null ? left : right;
    }
}
