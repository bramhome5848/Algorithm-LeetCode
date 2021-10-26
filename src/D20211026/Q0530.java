package D20211026;

import java.util.*;

/**
 * 530. Minimum Absolute Difference in BST
 */
public class Q0530 {

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

    //bfs + sort
    public int getMinimumDifference(TreeNode root) {

        List<Integer> data = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        int result = Integer.MAX_VALUE;

        while(!que.isEmpty()) {
            TreeNode node = que.poll();

            data.add(node.val);
            if(node.left != null) que.add(node.left);
            if(node.right != null) que.add(node.right);
        }

        data.sort(Comparator.comparingInt(s -> s));

        for(int i=0 ; i<data.size()-1 ; i++) {
            result = Math.min(result, data.get(i+1) - data.get(i));
        }
        return result;
    }


}
