class MinStack {
    int[] a;
    int top;
    int capacity=100000;

    public MinStack() {
        a = new int[capacity];
        top=-1;
    }
    
    public void push(int val) {
        top++;
        a[top] = val;
    }
    
    public void pop() {
        if(top>=0){
            top--;
        }
    }
    
    public int top() {
        return a[top];
    }
    
    public int getMin() {
        int i=top;
        int min=Integer.MAX_VALUE;

        while(i>=0){
            min = Math.min(min,a[i]);
            i--;
        }

        return min;
    }
}
