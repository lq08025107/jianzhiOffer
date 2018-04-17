package C4;

import java.util.Stack;

class MinStack {
    Stack<Integer> dataStack = new Stack<>();
    Stack<Integer> helpStack = new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        dataStack.push(x);
        if(helpStack.size() == 0 || x <= helpStack.peek())
            helpStack.push(x);
        else
            helpStack.push(helpStack.peek());
    }

    public void pop() {
        dataStack.pop();
        helpStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return helpStack.peek();
    }
}
