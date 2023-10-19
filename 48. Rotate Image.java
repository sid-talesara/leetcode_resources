// Approach
// step 1: Transpose -> columns to rows and vice versa
// step 2: Reverse each row

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // Transpose of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                // Swap function
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }

        // Reverse of the matrix array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;

            }
        }

    }

}