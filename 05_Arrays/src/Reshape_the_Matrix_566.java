public class Reshape_the_Matrix_566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if ((mat.length * mat[0].length) == (r*c)) {
            int[][] ansArr = new int[r][c];
            int row = 0;
            int col = 0;
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    ansArr[row][col] = mat[i][j];
                    col++;
                    if (col == c) {
                        col = 0;
                        row++;
                    }
                }
            }

            return ansArr;

        } else {
            return mat;
        }
    }

    public static void main(String[] args) {
    }
}
