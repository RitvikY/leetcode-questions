class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
              
        # we can use default dicts to check if there is a number in each square
        rows = defaultdict(set)
        cols = defaultdict(set)
        square = defaultdict(set)
        
        
        for r in range(9):
            for c in range(9):
                
                if board[r][c] == '.': continue # indicating its empty
                
                if (board[r][c] in rows[r]) or (board[r][c] in cols[c]) or (board[r][c] in square[(r//3, c//3)]): #checking if its there
                    return False
                
                rows[r].add(board[r][c]) 
                cols[c].add(board[r][c])
                square[(r//3, c//3)].add(board[r][c])
        
        return True
        