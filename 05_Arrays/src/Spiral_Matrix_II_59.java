import java.util.Arrays;

public class Spiral_Matrix_II_59 {
    public static void main(String[] args) {
        print(3);
        print(5);
        print(1);
    }
    public static int[][] generateMatrix(int n) {
        int[][] ansArr = new int[n][n];
        int count = 1;

        int rStart = 0;
        int rEnd = n-1;
        int cStart = 0;
        int cEnd = n-1;

        while (count <= (n*n)) {

            for (int i = cStart; i <= cEnd ; i++) {
                ansArr[rStart][i] = count;
                count++;
            }
            rStart++;

            if (!(count <= (n*n))) break;

            for (int i = rStart; i <= rEnd ; i++) {
                ansArr[i][rEnd] = count;
                count++;
            }
            cEnd--;

            if (!(count <= (n*n))) break;

            for (int i = cEnd; i >= cStart ; i--) {
                ansArr[rEnd][i] = count;
                count++;
            }
            rEnd--;

            if (!(count <= (n*n))) break;

            for (int i = rEnd; i >= rStart; i--) {
                ansArr[i][cStart] = count;
                count++;
            }
            cStart++;

            if (!(count <= (n*n))) break;
        }

        return ansArr;
    }
    public static void print(int n) {
        int[][] ans = generateMatrix(n);

        for (int[] temp : ans) {
            System.out.println(Arrays.toString(temp));
        }
    }
}
