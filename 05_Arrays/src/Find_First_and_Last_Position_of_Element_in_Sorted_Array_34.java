import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array_34 {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums,target);
        result[1] = findLast(nums,target);

        return result;
    }

    public static int findFirst(int[] nums, int target) {
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + ((end-start)/2);

            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            if (nums[mid] == target) ans = mid;
        }
        return ans;
    }

    public static int findLast(int[] nums, int target) {
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + ((end-start)/2);

            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            if (nums[mid] == target) ans = mid;
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[] {5,7,7,8,8,10},8)));
        System.out.println(Arrays.toString(searchRange(new int[] {5,7,7,8,8,10},6)));
        System.out.println(Arrays.toString(searchRange(new int[] {},0)));
        System.out.println(Arrays.toString(searchRange(new int[] {1},0)));
        System.out.println(Arrays.toString(searchRange(new int[] {1},1)));
    }
}
