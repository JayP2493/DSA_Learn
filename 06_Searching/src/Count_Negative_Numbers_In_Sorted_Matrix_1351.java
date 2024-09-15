public class Count_Negative_Numbers_In_Sorted_Matrix_1351 {
    public static int countNegatives(int[][] grid) {
        int ans = 0;

        for (int i = 0; i < grid.length; i++) {
            ans += negatives(grid[i]);
        }

        return ans;        
    }

    public static int negatives(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while ( start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < 0) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return arr.length - end - 1;
    }

    public static void main(String[] args) {
        System.out.println(countNegatives(new int[][] {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        }));
    }
}
