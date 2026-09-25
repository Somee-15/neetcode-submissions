class MinStack {
    List<Integer> stack;
    int top;

    public MinStack() {
        stack = new ArrayList();
        top=-1;
    }
    
    public void push(int val) {
        stack.add(val);
        top++;

    }
    
    public void pop() {
        if(top>=0){
            stack.remove(top);
            top--;
        }

    }
    
    public int top() {
        return stack.get(top);
    }
    
    public int getMin() {
        return Collections.min(stack);
    }
}
