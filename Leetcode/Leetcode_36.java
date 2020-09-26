class Solution {
    public boolean isValidSudoku(char[][] board) {
        // https://www.youtube.com/watch?v=Pl7mMcBm2b8
        
        HashSet<String> seen = new HashSet();
        
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0; j < 9; j++){
                char current_val = board[i][j];
                
                if(current_val != '.'){
                    if(!seen.add(current_val + " found in row" + i) ||
                      !seen.add(current_val + " found in column" + j) ||
                      !seen.add(current_val + " found in sub box" + i/3 + j/3))
                        return false;
                }  
            }     
        }
        return true;
    }
}
