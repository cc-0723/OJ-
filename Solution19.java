/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode reConstructBinaryTreeHelper(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        if(preStart > preEnd || inStart > inEnd) 
            return null;
        TreeNode root = new TreeNode(pre[preStart]);
        int i = inStart;
        for(; i <= inEnd; i++) {
            if(in[i] == pre[preStart]) {
                root.left = reConstructBinaryTreeHelper(pre, preStart + 1, i - inStart + preStart, in, inStart, i - 1);
                root.right = reConstructBinaryTreeHelper(pre, i - inStart + preStart + 1, preEnd, in, i + 1, inEnd);
                break;
            }
        }
        return root;
    }
    
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0 || in.length == 0) 
            return null;
        return reConstructBinaryTreeHelper(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }
}