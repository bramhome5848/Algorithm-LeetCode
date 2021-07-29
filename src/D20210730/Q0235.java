package D20210730;

public class Q0235 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null) return null;
        
        //둘 다 왼쪽에 있을 경우
        if(p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
        //둘 다 오른쪽에 있을 경우
        if(p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);

        //나머지는 결국 root
        return root;
    }
}
