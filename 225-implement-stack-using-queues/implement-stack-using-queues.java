class MyStack {
    Queue<Integer> que;
    Queue<Integer> que2;

    public MyStack() {
        que=new LinkedList<>();
        que2=new LinkedList<>();

        
    }
    
    public void push(int x) {
        que2.offer(x);
        while(!que.isEmpty()){
            que2.offer(que.poll());
        }
            que=que2;
            que2=new LinkedList<>();
        
        
        
    }
    
    public int pop() {
        return que.poll();
        
    }
    
    public int top() {
        return que.peek();
        
    }
    
    public boolean empty() {
        return que.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */