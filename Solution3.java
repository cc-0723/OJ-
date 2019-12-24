package 数据结构.二叉树;

//树的最大深度
public class Solution3 {
    public int maxDepth(TreeNode root) {
        return root== null ? 0 : Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
}
