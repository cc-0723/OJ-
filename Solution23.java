/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        
        ListNode start = null;
        ListNode end = null;
        while(list1 != null && list2 != null) {
            ListNode p = list1.val < list2.val ? list1 : list2;
            if(p == list1) {
                list1 = list1.next;
            } else {
                list2 = list2.next;
            }
            if(start == null) {
                start = p;
                end = p;
            } else {
                end.next = p;
                end = p;
            }
        }
        if(list1 == null) {
            end.next = list2;
        } else {
            end.next = list1;
        }
        return start;
    }
}