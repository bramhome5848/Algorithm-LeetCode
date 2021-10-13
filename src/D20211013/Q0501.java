package D20211013;

import java.util.*;

/**
 * 501. Find Mode in Binary Search Tree
 */
public class Q0501 {

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

    public int[] findMode(TreeNode root) {

        if(root == null) return new int[]{};

        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()) {
            TreeNode curr = que.poll();

            map.put(curr.val, map.getOrDefault(curr.val, 0) + 1);
            if(curr.left != null) que.add(curr.left);
            if(curr.right != null) que.add(curr.right);
        }

        int max = map.values().stream().max(Comparator.comparingInt(v -> v)).orElse(0);
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
           if(entry.getValue() == max) result.add(entry.getKey());
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
