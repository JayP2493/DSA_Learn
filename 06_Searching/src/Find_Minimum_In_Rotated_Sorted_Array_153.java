public class Find_Minimum_In_Rotated_Sorted_Array_153 {
    public int findMin(int[] nums) {
        int pivotVal = pivot(nums);
        return nums[pivotVal+1];
    }

    public int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if (start < mid && arr[mid] < arr[mid-1]) {
                return mid-1;
            }

            if (end > mid && arr[mid] > arr[mid+1]) {
                return mid;
            }

            if (arr[start] < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}