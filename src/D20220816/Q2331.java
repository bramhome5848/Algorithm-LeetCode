package D20220816;

/**
 * 2331. Evaluate Boolean Binary Tree
 */
public class Q2331 {

    public boolean evaluateTree(TreeNode root) {

        if(root == null) return true;

        if(root.val == 0) return false;
        else if(root.val == 1) return true;
        else if(root.val == 2) return evaluateTree(root.left) || evaluateTree(root.right);
        else return evaluateTree(root.left) && evaluateTree(root.right);
    }
}

class TreeNode {
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