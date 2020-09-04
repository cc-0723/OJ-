import java.util.*;

public class Solution {
    public void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    
    public boolean isExist(ArrayList<String> result, char[] str) {
        return result.contains(String.valueOf(str));
    }
    
    public void PermutationHelper(char[] str, int start, ArrayList<String> result) {
        if(start == str.length - 1) {
            if(!isExist(result, str)) {
                result.add(new String(str));
            }
            return;
        }
        for(int i = start; i < str.length; i++) {
            swap(str, start, i);
            PermutationHelper(str, start + 1, result);
            swap(str, start, i);
        }
    }
    
    public ArrayList<String> Permutation(String str) {
       ArrayList<String> result = new ArrayList<>();
       if(str != null && str.length() > 0) {
           PermutationHelper(str.toCharArray(), 0, result);
           Collections.sort(result);
       } 
        return result;
    }
}