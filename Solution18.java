/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.*;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
       ArrayList<Integer> list = new ArrayList<>();
       print(listNode, list);
       return list;
    }
    
    public void print(ListNode listNode, ArrayList<Integer> list) {
        if(listNode == null)
            return;
        print(listNode.next, list);
        list.add(listNode.val);
    }
}