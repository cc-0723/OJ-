package 数据结构.二叉树;

//平衡二叉树，一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1
public class Solution5 {
    public int getHeight(TreeNode root) {
        return root == null ? 0 : Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return Math.abs(left - right) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }
}
