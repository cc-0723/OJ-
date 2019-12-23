package 数据结构.二叉树;

//另一棵树的子树
public class Solution2 {
    public boolean isSameTree(TreeNode s, TreeNode t) {
        if(s == null && t == null)
            return true;
        if(s == null || t == null)
            return false;
        if(s.val == t.val) {
            return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
        }else {
            return false;
        }
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null)
            return false;
        if(isSameTree(s,t))
            return true;
        if(isSubtree(s.left,t))
            return true;
        return isSubtree(s.right,t);
    }
}
