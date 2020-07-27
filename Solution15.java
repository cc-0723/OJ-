import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array == null || array.length == 0)
            return 0;
        
        int left = 0; 
        int right = array.length - 1;
        int mid = 0;
        while(array[left] >= array[right]) {
            if(right - left == 1) {
                mid = right;
                break;
            }
            mid = (left + right) >> 1;
            if(array[left] == array[right] && array[mid] == array[left]) {
                int tmp = array[left];
                for(int i = left + 1; i < right; i++) {
                    if(array[i] < tmp)
                        return array[i];
                }
                return tmp;
            }
            if(array[mid] >= array[left]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return array[mid];
    }
}