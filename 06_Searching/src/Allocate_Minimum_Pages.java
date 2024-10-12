import java.util.Arrays;

public class Allocate_Minimum_Pages {
    public static long findPages(int n, int[] arr, int m) {
        // Your code here
        if (n < m) {
            return -1;
        }

        int start = Arrays.stream(arr).max().getAsInt();
        int end = Arrays.stream(arr).sum();
        long ans = -1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if (isPossible (n,arr,m,mid)) {
                ans = (long) mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static boolean isPossible (int n, int[] arr, int m, int mid) {
        int studentCount = 1;
        int currentPages = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentPages += arr[i];

            if (currentPages > mid) {
                currentPages = arr[i];
                studentCount++;
            }
        }

        return studentCount <= m;
    }

    public static void main(String[] args) {
        System.out.println(findPages(4,new int[] {12, 34, 67, 90},2) == 113);
        System.out.println(findPages(3,new int[] {15, 17, 20},5) == -1);
        System.out.println(findPages(11,new int[] {13,31,37,45,46,54,55,63,73,84,85},9) == 85);
    }
}
