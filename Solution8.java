package 数据结构.二叉树;

//输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
//先用中序遍历得到这棵树的有序的序列，然后修改树的指针的指向，即改成一个双向的链表。
public class Solution8 {
    static TreeNode prev = null;
    public void _Convert(TreeNode root){
        if(root == null)
            return;
        //中序遍历
        _Convert(root.left);
        //处理当前节点
        root.left = prev;
        if(prev != null)
            prev.right = root;
        prev = root;
        _Convert(root.right);
    }
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null)
            return null;
        //重置
        prev = null;
        _Convert(pRootOfTree);
        //返回头， 左边的最后一个非空节点
        while(pRootOfTree.left != null){
            pRootOfTree = pRootOfTree.left;
        }
        return pRootOfTree;
    }
}
