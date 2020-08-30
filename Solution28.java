public class Solution {
    public boolean VerifySquenceOfBSTTest(int [] sequence, int start, int end) {
        if(start >= end)
            return true;
        
        int root = sequence[end];
        int i = start;
        while(i < end && sequence[i] < root) {
            i++;
        }
        for(int j = i; j < end; j++) {
            if(sequence[j] < root)
                return false;
        }
        return VerifySquenceOfBSTTest(sequence, start, i - 1) && VerifySquenceOfBSTTest(sequence, i, end - 1);
    }
    
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length == 0)
            return false;
        return VerifySquenceOfBSTTest(sequence, 0, sequence.length - 1);
    }
}