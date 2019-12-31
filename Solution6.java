package 数据结构.二叉树;

public class Solution6 {
    //二叉树的最近公共祖先
    public boolean find(TreeNode root, TreeNode node) {
        if(root == null) {
            return false;
        }
        if(root == node) {
            return true;
        }
        if(find(root.left, node)) {
            return true;
        }
        return find(root.right,node);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        boolean pL = false, pR = false, qL = false, qR = false;
        if(root == p || root == q)
            return root;
        if(find(root.left,p)) {
            pL = true;
        }else {
            pR = true;
        }
        if(find(root.left,q)) {
            qL = true;
        }else {
            qR = true;
        }
        if(pL && qL) {
            return lowestCommonAncestor(root.left,p,q);
        }else if(pR && qR) {
            return lowestCommonAncestor(root.right,p,q);
        }else {
            return root;
        }
    }
}
