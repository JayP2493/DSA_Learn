import java.util.Arrays;

public class Special_Array_With_X_Elements_Greater_Than_Or_Equal_X_1608 {
    public static int specialArray(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i <= nums.length; i++) {
            if (i == countBigger(nums,i)) {
                return i;
            }
        }

        return -1;
    }

    public static int countBigger (int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end -start) / 2;

            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return nums.length - start;
    }

    public static void main(String[] args) {
        System.out.println(specialArray(new int[] {3,5}));
        System.out.println(specialArray(new int[] {0,0}));
        System.out.println(specialArray(new int[] {0,4,3,0,4}));
    }
}
