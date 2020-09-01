import java.util.ArrayList;
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
    public void FindPathDFS(TreeNode root, int target, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list) {
        if(root == null)
            return;
        list.add(root.val);
        target -= root.val;
        if(root.left == null && root.right == null && target == 0) {
            result.add(new ArrayList<Integer>(list));
        }
        FindPathDFS(root.left, target, result, list);
        FindPathDFS(root.right, target, result, list);
        list.remove(list.size() - 1);
    }
    
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<>();
        FindPathDFS(root, target, result, list);
        return result;
    }
}