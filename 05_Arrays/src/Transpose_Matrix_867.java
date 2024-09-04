import java.util.Arrays;

public class Transpose_Matrix_867 {
    public static void main(String[] args) {
        int[][] ans = transpose(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        for (int[] arr : ans) {
            System.out.println(Arrays.toString(arr));
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                ans[i][j] = matrix[j][i];
            }
        }

        return ans;
    }
}
