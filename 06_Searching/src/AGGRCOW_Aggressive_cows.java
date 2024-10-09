import java.util.Arrays;

public class AGGRCOW_Aggressive_cows {
    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        Arrays.sort(stalls);

        int start = 1;
        int end = stalls [stalls.length - 1];

        while (start < end) {
            int mid = start + (end-start)/2;

            if (canfit(stalls,k,mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return end;
    }

    public static boolean canfit (int[] arr, int cows, int psAns) {
        
        int lastCow = arr[0];
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - lastCow >= psAns) {
                lastCow = arr[i];
                count++;
            }
        }

        if (count == cows) {
            return true;
        } else {
            return false;
        }
    }
}
