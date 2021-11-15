package D20211115;


import java.util.LinkedList;
import java.util.Queue;

/**
 * 993. Cousins in Binary Tree
 */
public class Q0993 {

    public static class TreeNode {
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

    public boolean isCousins(TreeNode root, int x, int y) {

        if(root == null) return false;

        TreeNode parentX = null;
        TreeNode parentY = null;

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()) {
            int size = que.size();

            while(size-- > 0) {
                TreeNode node = que.poll();

                assert node != null;
                if(node.left != null) {
                    if(node.left.val == x) parentX = node;
                    if(node.left.val == y) parentY = node;
                    que.add(node.left);
                }

                if(node.right != null) {
                    if(node.right.val == x) parentX = node;
                    if(node.right.val == y) parentY = node;
                    que.add(node.right);
                }

                if(parentX != null && parentY != null) break;
            }

            if(parentX != null && parentY != null) return parentX != parentY;
            if(parentX != null || parentY != null) return false;
        }

        return false;
    }
}
