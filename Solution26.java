import java.util.Stack;

public class Solution {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    
    public void push(int node) {
        st1.push(node);
        if(st2.empty() || node < st2.peek()) {
            st2.push(node);
        } else {
            st2.push(st2.peek());
        }
    }
    
    public void pop() {
        st1.pop();
        st2.pop();
    }
    
    public int top() {
        return st1.peek();
    }
    
    public int min() {
        return st2.peek();
    }
}