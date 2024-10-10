import java.util.Arrays;

public class AGGRCOW_Aggressive_cows {
    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        Arrays.sort(stalls);

        int start = 1;
        int end = stalls[stalls.length-1] - stalls[0];
        int ans = 1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if (searching(stalls,k,mid)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

    public static boolean searching(int[] stalls, int k, int mid) {
        int lastPosition = stalls[0];
        int count = 1;

        for (int i = 1; i < stalls.length; i++) {
            if ((stalls[i]-lastPosition) >= mid) {
                count++;
                lastPosition = stalls[i];
            }
        }

        return count >= k;
    }

    public static void main(String[] args) {
        System.out.println(aggressiveCows(new int[] {1, 2, 3}, 2));
    }
}
