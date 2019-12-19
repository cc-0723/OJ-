package 数据结构.二叉树;

public class minDepth {
    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }else {
            int m = minDepth(root.left);
            int n = minDepth(root.right);
            return root.left == null || root.right == null ? m + n + 1 : Math.min(m,n) + 1;
        }
    }
}
