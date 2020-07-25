import java.util.*;

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array == null)
            return 0;

        int target = array[0];
        int times = 1;
        for(int i = 0; i < array.length; i++) {
            if(times == 0) {
                target = array[i];
                times = 1;
            } else if(array[i] == target) {
                times++;
            } else {
                times--;
            }
        }
        times = 0;
        for(int i = 0; i < array.length; i++) {
            if(target == array[i])
                times++;
        }
        return times > array.length / 2 ? target : 0;
    }
}