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
        if(listNode == null)
            return list;
        
        Stack<Integer> st = new Stack<>(); 
        while(listNode != null) {
            st.push(listNode.val);
            listNode = listNode.next;
        }
        while(!st.empty()) {
            list.add(st.pop());
        }
        return list;
    }
}