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
    }

    public static void main(String[] args) {
        System.out.println(minAbsoluteSumDiff(new int[] {1,7,5}, new int[] {2,3,5}));
        System.out.println(minAbsoluteSumDiff(new int[] {2,4,6,8,10}, new int[] {2,4,6,8,10}));
        System.out.println(minAbsoluteSumDiff(new int[] {1,10,4,4,2,7}, new int[] {9,3,5,1,7,4}));
    }
}
