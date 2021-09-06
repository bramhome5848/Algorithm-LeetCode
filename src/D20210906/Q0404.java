package D20210906;

import java.util.Stack;

/**
 * 404. Sum of Left Leaves
 */
public class Q0404 {

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

    //return the sum of all left leaves
    public int sumOfLeftLeaves(TreeNode root) {

        if(root == null) return 0;

        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        int sum = 0;

        while(!st.isEmpty()){
            TreeNode current = st.pop();

            if(current.left != null){
                if(current.left.left == null && current.left.right == null) sum += current.left.val;
                else st.push(current.left);
            }

            if(current.right != null){
                if(current.right.right != null || current.right.left != null) st.push(current.right);
            }
        }

        return sum;
    }
}
