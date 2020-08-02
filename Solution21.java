import java.util.*;

public class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    public int Fibonacci(int n) {
        if(n == 0 || n == 1)
            return n;
        int pre = 0;
        if(map.containsKey(n - 1)) {
            pre = map.get(n - 1);
        } else {
            pre = Fibonacci(n - 1);
            map.put(n - 1, pre);
        }
        int ppre = 0;
        if(map.containsKey(n - 2)) {
            ppre = map.get(n - 2);
        } else {
            ppre = Fibonacci(n - 2);
            map.put(n - 2, ppre);
        }
        return pre + ppre;
    }
}