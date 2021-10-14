package D20211014;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q0515 {

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

    public List<Integer> largestValues(TreeNode root) {

        if(root == null) return new ArrayList<>();

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        List<Integer> result = new ArrayList<>();

        while(que.size() > 0) {

            int size = que.size();
            int value = Integer.MIN_VALUE;
            for(int i=0 ; i<size ; i++) {
                TreeNode node = que.poll();
                assert node != null;
                value = Math.max(value, node.val);

                if(node.left != null) que.add(node.left);
                if(node.right != null) que.add(node.right);
            }

            result.add(value);
        }
        return result;
    }
}
