package D20211014;

import java.util.*;

/**
 * 508. Most Frequent Subtree Sum
 */
public class Q0508 {

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

    public int[] findFrequentTreeSum(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> data = new HashMap<>();

        solve(root, data);
        int freq = data.values().stream().max(Comparator.comparingInt(s -> s)).orElse(0);

        for(Map.Entry<Integer, Integer> entry : data.entrySet()) {
           if(entry.getValue() == freq) result.add(entry.getKey());
        }
        return result.stream().mapToInt(s -> s).toArray();
    }

    private int solve(TreeNode root, Map<Integer, Integer> data) {

        if(root == null) return 0;
        int sum = root.val + solve(root.left, data) + solve(root.right, data);

        data.put(sum, data.getOrDefault(sum, 0) + 1);

        return sum;
    }
}
