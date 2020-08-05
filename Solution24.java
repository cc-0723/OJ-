/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public boolean IsSame(TreeNode start, TreeNode startSub) {
        if(startSub == null)
            return true;
        if(start == null)
            return false;
        if(start.val != startSub.val)
            return false;
        return IsSame(start.left, startSub.left) && IsSame(start.right, startSub.right);
    }
    
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null)
            return false;
        boolean result = false;
        if(root1.val == root2.val) {
            result = IsSame(root1, root2);
        }
        if(result != true)
            result = HasSubtree(root1.left, root2);
        if(result != true)
            result = HasSubtree(root1.right, root2);
        return result;
    }
}