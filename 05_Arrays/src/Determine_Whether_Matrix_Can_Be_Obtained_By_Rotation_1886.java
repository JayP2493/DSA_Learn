public class Determine_Whether_Matrix_Can_Be_Obtained_By_Rotation_1886 {
    public static void main(String[] args) {
        System.out.println(findRotation(new int[][] {{0, 1}, {1, 0}}, new int[][] {{1, 0}, {0, 1}}));
        System.out.println(findRotation(new int[][] {{0, 1}, {1, 1}}, new int[][] {{1, 0}, {0, 1}}));
        System.out.println(findRotation(new int[][] {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}}, new int[][] {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}}));
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            mat = rotate(mat);
            if (check(mat,target)) {
                return true;
            }
        }
        return false;
    }

    public static int[][] rotate (int[][] mat) {
        int[][] ans = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                ans[i][j] = mat[j][mat.length-1-i];
            }
        }

        return ans;
    }

    public static boolean check (int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (!(target[i][j] == mat[i][j])) {
                    return false;
                }
            }
        }

        return true;
    }
}
