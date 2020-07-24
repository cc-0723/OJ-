import java.util.*;

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array == null)
            return 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++) {
            if(map.containsKey(array[i])) {
                int count = map.get(array[i]);
                count++;
                map.put(array[i], count);
            } else {
                map.put(array[i], 1);
            }
            if(map.get(array[i]) > array.length / 2) {
                return array[i];
            }
        }
        return 0;
    }
}