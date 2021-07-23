package D20210723;

import java.util.ArrayList;
import java.util.List;

/**
 * 173. Binary Search Tree Iterator
 */
public class Q0173 {

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

    public static class BSTIterator {

        private List<Integer> list = new ArrayList<>();
        private int index;

        //make Binary Tree
        public BSTIterator(TreeNode root) {
            index = -1;
            inorder(root);
        }

        //search next
        public int next() {
            return list.get(++index);
        }

        public boolean hasNext() {
            return index < list.size() - 1;
        }

        private void inorder(TreeNode root){
            if(root == null) return;

            inorder(root.left);
            list.add(root.val);
            inorder(root.right);
        }
    }
}
