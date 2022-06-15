class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
          if (numbers.length == 2){
                return new int[] {1, 2};
        }
        
        int counter = 0;
        int i = 0;
        System.out.println(numbers.length);
        
          
            //[5,25,75] , 100
            int curr = numbers[i];
            counter = numbers.length - 1;
           
            int checking = numbers[counter];
            
            System.out.println(counter);

            while(i <= counter) {
                checking = numbers[counter];
                 curr = numbers[i];
                
                System.out.println("i: "  + i + "counter: "  + counter );
                if(checking + curr == target){
                 int result[] = new int[] {++i, ++counter};
                 return result;
                }
                
                if (checking + curr < target){
                    i++;
                } else {
                    counter--;
                }
            }
        
       return new int[2];

    }
}