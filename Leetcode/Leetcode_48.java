class Solution {
    public void rotate(int[][] matrix) {
        // https://www.youtube.com/watch?v=SA867FvqHrM
        
        int N = matrix.length;
        
        // transpose the matrix
        for(int i=0; i<N; i++){
            for(int j=i; j<N;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // flip horizontally
        for(int i=0; i<N; i++){
            for(int j=0; j<N/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][N-j-1];
                matrix[i][N-j-1] = temp;
            }
        }
    }
}
