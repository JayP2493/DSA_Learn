public class Find_Minimum_In_Rotated_Sorted_Array_II_154 {
    public static int findMin(int[] nums) {
        int ans = bSearch (nums);
        return nums[ans+1];
    }

    public static int bSearch (int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid+1]) {
                return  mid;
            } else if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            } else if (arr[mid] > arr[start] && arr[mid] >= arr[end]) {
                start = mid + 1;
            } else if (arr[mid] < arr[start] && arr[mid] < arr[end]) {
                end = mid - 1;
            } else {
                if (start < end && arr[start] > arr[start+1]) {
                    return start;
                } else {
                    start++;
                }

                if (end > start && arr[end] < arr[end-1]) {
                    return end-1;
                } else {
                    end--;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[] {1,3,5}));
        System.out.println(findMin(new int[] {1}));
        System.out.println(findMin(new int[] {10,10,5,10}));
    }
}
