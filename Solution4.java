package 数据结构.二叉树;

import java.util.ArrayList;
import java.util.List;

//中序遍历
public class Solution {
    public void inOrder(TreeNode root, List<Integer> list) {
        if(root != null){
            inOrder(root.left,list);
            list.add(root.val);
            inOrder(root.right,list);
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root,list);
        return list;
    }
}
