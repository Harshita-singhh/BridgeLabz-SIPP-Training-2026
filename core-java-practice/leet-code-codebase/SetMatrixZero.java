// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]

// Approach:
// 1. Use the first row and first column as markers.
// 2. If matrix[i][j] == 0, mark its row and column by setting
//    matrix[i][0] = 0 and matrix[0][j] = 0.
// 3. Keep track of whether the first row or first column originally
//    contained a zero using two boolean variables.
// 4. Traverse the matrix again and set matrix[i][j] = 0 whenever
//    its row or column is marked.
// 5. Finally, zero out the first row and/or first column if needed.

// Pseudocode:
//
// func setMatrixZero(matrix):
//     m = number of rows
//     n = number of columns
//
//     firstRowZero = false
//     firstColZero = false
//
//     check if first row contains a zero
//     check if first column contains a zero
//
//     for i = 1 to m-1:
//         for j = 1 to n-1:
//             if matrix[i][j] == 0:
//                 matrix[i][0] = 0
//                 matrix[0][j] = 0
//
//     for i = 1 to m-1:
//         for j = 1 to n-1:
//             if matrix[i][0] == 0 or matrix[0][j] == 0:
//                 matrix[i][j] = 0
//
//     if firstRowZero:
//         set entire first row to 0
//
//     if firstColZero:
//         set entire first column to 0



class SetMatrixZero {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        SetMatrixZero obj = new SetMatrixZero();
        obj.setZeroes(matrix);

        // Print the modified matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Check first row
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Check first column
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Mark rows and columns
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set cells to zero
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero first row
        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Zero first column
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}