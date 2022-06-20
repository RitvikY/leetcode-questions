class MinStack {
    /* the best way to implement this min stack was to use an arrayList. 
     * The reason for this was becuase an arrayList allows for dynamic adding amd removing similar
     * to a stack */
     ArrayList<Integer> list=new ArrayList<>();
     int size=0;

    public MinStack() {
        
    }
    
    public void push(int val) {
         list.add(val);
        size++;
    
        
    }
    
    public void pop() {
         list.remove(size-1);
        size--;
    }
    
    public int top() {
          return list.get(size-1); 
    }
    
    public int getMin() {
          int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min > list.get(i))
                min = list.get(i);
        }
        return min;
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