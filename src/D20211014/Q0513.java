package D20211014;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 */
public class Q0513 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int findBottomLeftValue(TreeNode root) {

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        int result = 0;

        while(que.size() > 0) {

            int size = que.size();
            for(int i=0 ; i<size ; i++) {
                TreeNode node = que.poll();

                if(i == 0) result = node.val;

                assert node != null;
                if(node.left != null) que.add(node.left);
                if(node.right != null) que.add(node.right);
            }
        }

        return result;
    }
}
