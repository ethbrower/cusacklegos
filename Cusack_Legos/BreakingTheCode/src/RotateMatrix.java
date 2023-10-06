package Cusack_Legos.BreakingTheCode.src;

public class RotateMatrix {
    // function to rotate the matrix by 90 degrees clockwise
   public static int[][] rightRotate(int matrix[][], int n) {
        // determines the transpose of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // then we reverse the elements of each row
        for (int i = 0; i < n; i++) {
            // logic to reverse each row i.e 1D Array.
            int low = 0, high = n - 1;
            while (low < high) {
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++;
                high--;
            }
        }

        return matrix.clone();
    }
}