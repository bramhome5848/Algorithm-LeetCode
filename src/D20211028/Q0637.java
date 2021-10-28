package D20211028;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 */
public class Q0637 {

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

    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> result = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()) {
            int size = que.size();
            double sum = 0;

            for(int i=0 ; i<size ; i++) {
                TreeNode node = que.poll();
                assert node != null;
                sum += node.val;

                if(node.left != null) que.add(node.left);
                if(node.right != null) que.add(node.right);
            }
            result.add(sum/size);
        }

        return result;
    }
}
