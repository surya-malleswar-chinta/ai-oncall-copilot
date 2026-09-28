class MinStack {

    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        mainStack.push(val);
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            int min = minStack.peek();
            if (val <= min) {
                minStack.push(val);
            }
        }
    }
    
    public void pop() {
        if (!mainStack.isEmpty()){
            int pop = mainStack.pop();
            if (pop == minStack.peek()) {
                minStack.pop();
            }
        }
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

