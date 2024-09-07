import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix_54 {
    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println(spiralOrder(new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int rStart = 0;
        int rEnd = matrix.length-1;
        int cStart = 0;
        int cEnd = matrix[0].length-1;

        int count = matrix.length * matrix[0].length;
        List<Integer> ansArr = new ArrayList<>();

        while (count > 0) {

            for (int i = cStart; i <= cEnd; i++) {
                ansArr.add(matrix[rStart][i]);
                count--;
            }
            rStart++;

            if (!(count > 0)) break;

            for (int i = rStart; i <= rEnd; i++) {
                ansArr.add(matrix[i][cEnd]);
                count--;
            }
            cEnd--;

            if (!(count > 0)) break;

            for (int i = cEnd; i >= cStart; i--) {
                ansArr.add(matrix[rEnd][i]);
                count--;
            }
            rEnd--;

            if (!(count > 0)) break;

            for (int i = rEnd; i >= rStart; i--) {
                ansArr.add(matrix[i][cStart]);
                count--;
            }
            cStart++;

            if (!(count > 0)) break;
        }

        return ansArr;
    }
}
