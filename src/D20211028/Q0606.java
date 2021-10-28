package D20211028;

/**
 * 606. Construct String from Binary Tree
 */
public class Q0606 {

    public class TreeNode {
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

    public String tree2str(TreeNode root) {

        StringBuilder sb = new StringBuilder();
        dfsSearch(root, sb);
        return sb.toString();
    }

    public void dfsSearch(TreeNode root, StringBuilder sb) {
        if(root == null) return;

        sb.append(root.val);    //pre
        if(root.left == null && root.right == null) return; //둘다 null
        
        //왼쪽은 right 만 있던 left 만 있던 표시해야함
        sb.append("(");
        dfsSearch(root.left, sb);
        sb.append(")");

        if(root.right != null) {
            sb.append("(");
            dfsSearch(root.right, sb);
            sb.append(")");
        }
    }
}
