package 数据结构.二叉树;

import java.util.Stack;

//二叉树的最近公共祖先,用栈，先获得他的存储根节点的栈，然后区比较栈元素，也就是比较祖先序列是否相同，
//相同的第一个元素即是他们的最近公共祖先
public class Solution7 {
    public boolean getPath(TreeNode root, TreeNode node, Stack<TreeNode> st) {
        if(root == null)
            return false;
        st.push(root);
        if(root == node)
            return true;
        if(getPath(root.left,node,st))
            return true;
        if(getPath(root.right,node,st))
            return true;
        st.pop();
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> path1 = new Stack<>();
        Stack<TreeNode> path2 = new Stack<>();
        getPath(root,p,path1);
        getPath(root,q,path2);
        //裁剪
        while(path1.size() != path2.size()) {
            if(path1.size() > path2.size()) {
                path1.pop();
            }else {
                path2.pop();
            }
        }
        //匹配
        while(path1.size() != 0) {
            if(path1.peek() == path2.peek()) {
                break;
            }else {
                path1.pop();
                path2.pop();
            }
        }
        return path1.peek();
    }
}
