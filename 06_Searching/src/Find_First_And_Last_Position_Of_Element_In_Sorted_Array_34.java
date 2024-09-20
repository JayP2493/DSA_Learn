public class Find_First_And_Last_Position_Of_Element_In_Sorted_Array_34 {
    public int[] searchRange(int[] nums, int target) {
        return new int[] { search(nums, target, true), search(nums, target, false) };
    }

    public int search(int[] nums, int target, boolean dir) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (dir) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
