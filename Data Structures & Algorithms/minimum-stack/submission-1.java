class MinStack {

    Stack<Integer> min = new Stack<>();
    Stack<Integer> st = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(val);
            min.push(val);
            return;
        }
        
        st.push(val);
        if(val<=min.peek()){
            min.push(val);
        }else{
            min.push(min.peek());
        }
    }
    
    public void pop() {
        st.pop();
        min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
