package a0155minStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class first0155 {
    class MinStack {
        Stack<Integer> main,support;
        /** initialize your data structure here. */
        public MinStack() {
            main=new Stack<>();
            support=new Stack<>();
        }

        public void push(int x) {
            main.push(x);
            if (support.empty()||x<support.peek())
                support.push(x);
            else
                support.push(support.peek());
        }

        public void pop() {
            main.pop();
            support.pop();
        }

        public int top() {
            return main.peek();
        }

        public int getMin() {
            return support.peek();
        }
    }
}
