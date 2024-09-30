import java.util.Arrays;

public class Minimum_Absolute_Sum_Difference_1818 {
    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int[] initialAbsoluteDiff = new int[nums1.length];
        int initialTotalSum = 0;

        for (int i = 0; i < initialAbsoluteDiff.length; i++) {
            initialAbsoluteDiff[i] = Math.abs(nums1[i] - nums2[i]);
            initialTotalSum += initialAbsoluteDiff[i];
        }

        Arrays.sort(nums1);

        int[] lowestDiff = new int[nums2.length];
        int maxDiff = 0;

        for (int i = 0; i < nums2.length; i++) {
            int temp = lowerBound(nums2[i], nums1);
            int tempDiff = Math.abs(nums2[i] - temp);

            if (tempDiff < initialAbsoluteDiff[i]) {
                maxDiff = Math.abs(tempDiff-initialAbsoluteDiff[i]);
            }
        }

        return initialTotalSum - maxDiff;
    }

    public static int lowerBound (int target, int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        int ans = Math.min()

        return arr[end];
    }

    public static void main(String[] args) {
        System.out.println(minAbsoluteSumDiff(new int[] {1,7,5}, new int[] {2,3,5}));
        System.out.println(minAbsoluteSumDiff(new int[] {2,4,6,8,10}, new int[] {2,4,6,8,10}));
        System.out.println(minAbsoluteSumDiff(new int[] {1,10,4,4,2,7}, new int[] {9,3,5,1,7,4}));
    }
}
