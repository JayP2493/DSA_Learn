public class Cells_with_Odd_Values_in_a_Matrix_1252 {
    public static void main(String[] args) {
        System.out.println(oddCells(2,3,new int[][] {{0,1},{1,1}}));
    }
    public static int oddCells(int m, int n, int[][] indices) {

        int[][] ansArray = new int[m][n];

        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];

            for (int j = 0; j < ansArray[0].length; j++) {
                ansArray[row][j]++;
            }

            for (int j = 0; j < ansArray.length; j++) {
                ansArray[j][col]++;
            }
        }

        int ans = 0;

        for (int i = 0; i < ansArray.length; i++) {
            for (int j = 0; j < ansArray[i].length; j++) {
                if (ansArray[i][j]%2 != 0) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
