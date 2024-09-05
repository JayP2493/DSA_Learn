import java.util.ArrayList;
import java.util.List;

public class Lucky_Numbers_in_a_Matrix_1380 {
    public static void main(String[] args) {
        System.out.println(luckyNumbers(new int[][] {{3,7,8},{9,11,13},{15,16,17}}));
        System.out.println(luckyNumbers(new int[][] {{1,10,4,2},{9,3,8,7},{15,16,17,12}}));
        System.out.println(luckyNumbers(new int[][] {{7,8},{1,2}}));
    }
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {

            int[] min = new int[] {Integer.MAX_VALUE,0};

            for (int j = 0; j < matrix[0].length; j++) {
                if (min[0] > matrix[i][j]) {
                    min[0] = matrix[i][j];
                    min[1] = j;
                }
            }

            if (check(min,matrix)) {
                ans.add(min[0]);
            }
        }

        return ans;
    }

    public static boolean check (int[] min,int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][min[1]] > min[0]) {
                return false;
            }
        }

        return true;
    }
}
