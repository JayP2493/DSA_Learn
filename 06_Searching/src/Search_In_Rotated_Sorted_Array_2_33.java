public class Search_In_Rotated_Sorted_Array_2_33 {
    public static int search(int[] nums, int target) {
        int pivotVal = pivot (nums);

        if (pivotVal == -1) {
            return b_Search (0,nums.length-1,nums,target);
        } else if (nums[pivotVal] == target) {
            return pivotVal;
        } else if (nums[0] <= target) {
            return b_Search (0,pivotVal-1,nums,target);
        } else {
            return b_Search (pivotVal+1,nums.length-1,nums,target);
        }
    }

    public static int pivot(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if(mid < end && nums[mid] > nums[mid+1]) {
                return mid;
            } else if (mid > start && nums[mid] < nums[mid-1]) {
                return mid-1;
            } else if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static int b_Search(int start, int end, int[] arr, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[] {3,1},3));
        System.out.println(search(new int[] {3,5,1},3));
        System.out.println(search(new int[] {4,5,6,7,8,9,0,1,2},9));
        System.out.println(search(new int[] {4,5,6,7,0,1,2},0));
        System.out.println(search(new int[] {4,5,6,7,0,1,2},3));
        System.out.println(search(new int[] {1},0));
    }
}
