import java.util.Arrays;

public class Minimum_Absolute_Sum_Difference_1818 {
    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int mod = 1000000007;
        int totalSum = 0;
        int MaxImprovement = 0;

        int[] copyNum1 = Arrays.copyOf(nums1,nums1.length);
        Arrays.sort(copyNum1);

        for (int i = 0; i < nums1.length; i++) {
            int cDiff = Math.abs(nums1[i] - nums2[i]);
            totalSum = (totalSum + cDiff) % mod;

            int temp = find(copyNum1,nums2[i]);

            if (temp < nums1.length) {
                int nDiff = Math.abs(copyNum1[temp] - nums2[i]);
                MaxImprovement = Math.max(MaxImprovement,(cDiff-nDiff));
            }

            if (temp > 0) {
                int nDiff = Math.abs(copyNum1[temp-1] - nums2[i]);
                MaxImprovement = Math.max(MaxImprovement,(cDiff-nDiff));
            }
        }

        return totalSum - MaxImprovement;
    }

    public static int find (int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {

            int mid = start + (end-start)/2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }

        return end;
    }

    public static void main(String[] args) {
        System.out.println(minAbsoluteSumDiff(new int[] {1,7,5}, new int[] {2,3,5}));
        System.out.println(minAbsoluteSumDiff(new int[] {2,4,6,8,10}, new int[] {2,4,6,8,10}));
        System.out.println(minAbsoluteSumDiff(new int[] {1,10,4,4,2,7}, new int[] {9,3,5,1,7,4}));
    }
}
