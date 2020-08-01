public class Solution {
    public int Fibonacci(int n) {
        if(n == 0)
            return 0;
        int first = 1;
        int second = 1;
        int third = 1;
        while(n > 2) {
            third = second + first;
            first = second;
            second = third;
            n--;
        }
        return third;
    }
}