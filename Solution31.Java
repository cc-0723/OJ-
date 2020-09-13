import java.util.*;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(k > input.length || k <= 0 || input == null)
            return list;
        PriorityQueue<Integer> q = new PriorityQueue<>(k, Collections.reverseOrder());
        for(int i = 0; i < input.length; i++) {
            if(i < k) {
                q.offer(input[i]);
            } else {
                if(input[i] < q.peek()) {
                    q.poll();
                    q.offer(input[i]);
                }
            }
        }
        
        for(int i = 0; i < k; i++) {
            list.add(q.poll());
        }
        return list;
    }
}