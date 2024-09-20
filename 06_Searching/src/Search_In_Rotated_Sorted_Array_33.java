public class Search_In_Rotated_Sorted_Array_33 {
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && nums[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] < target && nums[end] >= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[] {1,3},3));
        System.out.println(search(new int[] {4,5,6,7,8,9,0,1,2},9));
        System.out.println(search(new int[] {4,5,6,7,0,1,2},0));
        System.out.println(search(new int[] {4,5,6,7,0,1,2},3));
        System.out.println(search(new int[] {1},0));
    }
}
