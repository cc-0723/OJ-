package 数据结构.二叉树;

//根据一棵树的前序遍历与中序遍历构造二叉树。
public class Solution9 {
    static int curIdex = 0;
    public TreeNode _buildTree(int[] pre, int[] in, int inStar, int inEnd) {
        if(inStar > inEnd)
            return null;
        int rootValue = pre[curIdex];
        curIdex++;
        TreeNode root = new TreeNode(rootValue);
        if(inStar == inEnd)
            return root;
        int i;
        for(i = inStar; i < inEnd; i++) {
            if(in[i] == rootValue)
                break;
        }
        root.left = _buildTree(pre, in, inStar, i - 1);
        root.right = _buildTree(pre, in, i + 1, inEnd);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        curIdex = 0;
        return _buildTree(preorder,inorder,0,preorder.length - 1);
    }
}
