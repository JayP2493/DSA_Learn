public class Maximum_Value_At_A_Given_Index_In_A_Bounded_Array_1802 {
    public static int maxValue(int n, int index, int maxSum) {
        long start = 1;
        long end = (long) maxSum;

        long ans = 0;

        while (start <= end) {
            long mid = start + (end-start)/2;
            long totalSum = sum(index,mid) + sum(n-1-index,mid) + mid;

            if (totalSum <= maxSum) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return (int) ans;
    }
    public static long sum (long count, long val) {
        long x = Math.min(count,val-1);
        long sum = (x*val) - (x * (x+1)) / 2;

        sum += Math.max(0, (count - (val-1)));

        return sum;
    }
}
