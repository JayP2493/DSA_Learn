import java.util.Arrays;

public class Spiral_Matrix_III_885 {
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] directions = new int[][] {
                {0,1}, // east
                {1,0}, //south
                {0,-1}, // west
                {-1,0} // north
        };

        int[][] ansArr = new int[rows*cols][2];
        ansArr[0][0] = rStart;
        ansArr[0][1] = cStart;

        int step = 0;
        int dir = 0;
        int[] cPos = new int[] {rStart,cStart};
        int cPosAns = 1;

        while (cPosAns < (rows*cols)) {
            if (dir %2 == 0) step++;

            for (int i = 0; i < step; i++) {
                cPos[0] += directions[dir][0];
                cPos[1] += directions[dir][1];

                if ((cPos[0] >= 0 && cPos[0] < rows) && (cPos[1] >= 0 && cPos[1] < cols)) {
                    ansArr[cPosAns][0] = cPos[0];
                    ansArr[cPosAns][1] = cPos[1];
                    cPosAns++;
                }
            }

            dir = (dir +1)%4;
        }

        return ansArr;
    }

    public static void main(String[] args) {
        print(1,4,0,0);
        print(5,6,1,4);
    }

    public static void print (int rows, int cols, int rStart, int cStart) {
        int[][] ans = spiralMatrixIII(rows,cols,rStart,cStart);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(Arrays.toString(ans[i]));
            System.out.print(",");
        }

        System.out.println("End");
    }
}
