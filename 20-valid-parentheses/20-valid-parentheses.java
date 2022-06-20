class Solution {
    public boolean isValid(String s) {
        
        /* the best way to go about this problem is to implement the solution using a stack. 
         * By doing this, we are able to pop check if the next character will complete the parenthesis or not */
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i= 0; i < s.length(); i++) {
            
            char c = s.charAt(i);
            
            // we will push onto the stack all the valid starting characters
            if(c == '(' || c == '{' || c == '['){ 
                
                stack.push(c);
                
            } else if (stack.isEmpty() == true) {return false;} 
              else {
                  
                  char peek = stack.peek();
                  
                  // this will check if the current top of the stack will complete the current character;
                  if ((peek == '(' && c != ')') 
                      ||(peek == '{' && c != '}')
                      ||(peek == '[' && c != ']')) {
                        return false;
                  }
                  
                    stack.pop();       
                  
                  
              }

            
        }
        
        return stack.isEmpty();
        
    }
}