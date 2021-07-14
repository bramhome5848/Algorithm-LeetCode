package D20210714;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 */
public class Q0145 {

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

    public List<Integer> postorderTraversal(TreeNode root) {

        if(root == null) return new ArrayList<>();

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode node = stack.peek();
            if(node.left != null) {
                stack.push(node.left);
                node.left = null;
            } else if(node.right != null) {
                stack.push(node.right);
                node.right = null;
            } else {
                stack.pop();
                result.add(node.val);
            }
        }

        return result;
    }
}
