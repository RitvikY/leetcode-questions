class Solution {
    public int evalRPN(String[] tokens) {
        
        
        /* The approach I used for this solution was to implement a stack. 
         * By using a stack, we are able to pop off the numbers used to calculate and
         * push the new result back onto the stack, that way we can do reverse polish notation */
        
        Stack<Integer> stack = new Stack<>();
        
         for(int i = 0; i < tokens.length; i++) {
             
             int firstnum = 0, secondnum = 0;
             
             // these conditionals will make sure our stack only contains numbers
             
             if(tokens[i].equals("+") ) {
                  firstnum = stack.pop();
                 secondnum = stack.pop();
                 
                 stack.push(firstnum + secondnum);
                 
             } else if(tokens[i].equals("-") ){
                  firstnum = stack.pop();
                   secondnum = stack.pop();
                 
                 stack.push(secondnum - firstnum);
                 
                 
             } else if(tokens[i].equals("*") ){
                 firstnum = stack.pop();
                 secondnum = stack.pop();
                 
                 stack.push(firstnum * secondnum);
                 
                 
             } else if(tokens[i].equals( "/") ) {
                 
                 firstnum = stack.pop();
                 secondnum = stack.pop();
                 
                 stack.push(secondnum / firstnum);
                 
             } else {
                 stack.push(Integer.parseInt(tokens[i])); // parseInt will convert the string into an int. 
             }
             
         }
        
          return stack.pop();
    }
}