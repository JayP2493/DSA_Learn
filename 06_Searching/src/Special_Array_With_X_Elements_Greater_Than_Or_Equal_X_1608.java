import java.util.Arrays;

public class Special_Array_With_X_Elements_Greater_Than_Or_Equal_X_1608 {
    public static int specialArray(int[] nums) {
        Arrays.sort(nums);

        int start = 1;
        int end = nums.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (countBigger(nums,mid) > mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }

    public static int countBigger (int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end -start) / 2;

            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return nums.length - end;
    }
}
