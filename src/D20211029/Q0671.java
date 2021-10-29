package D20211029;

import java.util.*;

/**
 * 671. Second Minimum Node In a Binary Tree
 */
public class Q0671 {

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

    public int findSecondMinimumValue1(TreeNode root) {

        TreeSet<Integer> set = new TreeSet<>(Comparator.comparingInt(s -> s));

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()) {
            TreeNode node = que.poll();
            set.add(node.val);

            if(node.left != null) que.add(node.left);
            if(node.right != null) que.add(node.right);
        }

        if(set.size() < 2) return -1;

        set.remove(set.first());
        return set.first();
    }

    public int findSecondMinimumValue2(TreeNode root) {

        TreeSet<Integer> set = new TreeSet<>();
        inOrder(root, set);

        if(set.size() == 1) return -1;

        List<Integer> result = new ArrayList<>(set);
        return result.get(1);
    }

    private void inOrder(TreeNode root, Set<Integer> set) {
        if(root == null) return;

        inOrder(root.left, set);
        set.add(root.val);
        inOrder(root.right, set);
    }
}
