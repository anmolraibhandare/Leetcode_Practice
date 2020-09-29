class Solution {
    public void setZeroes(int[][] matrix) {
      
        // Approach 1 - additional memory
        // Time complexity - O(h*w)
        
//         int R_length = matrix.length;
//         int C_length = matrix[0].length;
        
//         Set<Integer> rows = new HashSet<Integer>();
//         Set<Integer> cols = new HashSet<Integer>();
        
//         // Essentially, we mark the rows and columns that are to be made zero
        
//         for(int i=0; i< R_length; i++){
//             for(int j=0; j<C_length; j++){
//                 if(matrix[i][j] == 0){
//                     rows.add(i);
//                     cols.add(i);
//                 }
//             }
//         }
        
//         // Iterate over the array once again and using the rows and cols sets, update the elements.
        
//         for(int i=0; i< R_length; i++){
//             for(int j=0; j<C_length; j++){
//                 if(rows.contains(i) || cols.contains(j))
//                     matrix[i][j] = 0;
//             }
//         }
        
        
        
        
        
        
        // Approach 2 - 'do it in place'
        // no extra memory or use constant memory
        
        Boolean isCol = false;
        int R = matrix.length;
        int C = matrix[0].length;
        
        for(int i=0; i<R ; i++){
            if (matrix[i][0] == 0) {
                isCol = true;
            }
            for (int j = 1; j < C; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        // Iterate over the array once again and using the first row and first column, update the elements.
        for (int i = 1; i < R; i++) {
          for (int j = 1; j < C; j++) {
            if (matrix[i][0] == 0 || matrix[0][j] == 0) {
              matrix[i][j] = 0;
            }
          }
        }
        
        // See if the first row needs to be set to zero as well
        if (matrix[0][0] == 0) {
          for (int j = 0; j < C; j++) {
            matrix[0][j] = 0;
          }
        }

        // See if the first column needs to be set to zero as well
        if (isCol) {
          for (int i = 0; i < R; i++) {
            matrix[i][0] = 0;
          }
        }  
        
    }
}
