public class Matrix_Diagonal_Sum_1572 {

    public static void main(String[] args) {
        System.out.println(diagonalSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int col = 0;

        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][col];
            sum += mat[i][mat[i].length-1-col];
            col++;
        }

        if (mat.length%2 == 1) {
            sum -= mat[mat.length/2][mat.length/2];
        }

        return sum;
    }
}
