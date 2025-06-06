class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> minst;
    public MinStack() {
        st=new Stack<>();
        minst=new Stack<>();
        
        
    }
    
    public void push(int val) {
        if(minst.isEmpty()==true)
        {
            st.push(val);
            minst.push(val);
        }
        else
        {   
            st.push(val);
            minst.push(Math.min(minst.peek(),val));
        }
        
    }
    
    public void pop() {
        st.pop();
        minst.pop();
        
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return minst.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */