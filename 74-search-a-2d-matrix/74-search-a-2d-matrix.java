class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
         int len, left, right, middle = 0;
        int rowlen = matrix.length;
        int collen = matrix[0].length;
        left = 0;
        right = rowlen-1;
        
        if (rowlen == 0) {return false;}
        
        //first perform Binary search with Columns
        while (left < right) {
            middle = left + (right-left) / 2;
            if(matrix[middle][collen - 1] < target) { //looking to see if element is in the rows > middle
                left = middle+1;
            } else if (matrix[middle][0] > target) { // looking to see if the element is in the rows < middle
                right = middle- 1;
            } else {  // this mean that the target is located in the middle row
                left = middle; 
                break; // if left and right have a difference of 1 this loop will keep going, this break statement prevents that
            }
        }
        
        // correct row number is now stored in 'left'
        
      
        
        int arrLeft = 0, arrRight = collen - 1, arrMid;
        
          // now do basic binary search in this row
        while(arrLeft <= arrRight) {
            arrMid  = arrLeft + (arrRight - arrLeft) / 2;
            if (matrix[left][arrMid] < target) {
                arrLeft = arrMid+1;
            } else if (matrix[left][arrMid] > target) {
                arrRight = arrMid -1;
            } else { return true;}
        }
        
        return false;
        
        
    }
}