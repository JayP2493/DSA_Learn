public class temp {
    public static int findMin(int[] nums) {
        // [4,5,6,7,0,1,4]
        int start = 0;
        int end = nums.length-1;
        int ans = -1;

        while (start < end) {
            int mid = start + (end-start)/2;

            if (nums[mid] > nums[mid+1]) {
                ans = mid;
                break;
            } else if (nums[mid] < nums[mid-1]) {
                ans = mid - 1;
                break;
            } else if (nums[mid] > nums[start] && nums[mid] > nums[end]) {
                start = mid;
            } else if (nums[mid] < nums[end] && nums[mid] < nums[start]) {
                end = mid - 1;
            } else {
                if (start < end && nums[start] > nums[start+1]) {
                    ans = start;
                    break;
                }
                start ++;

                if (end > start && nums[end] < nums[end-1]) {
                    ans = end-1;
                    break;
                }
                end--;
            }
        }

        return nums[ans+1];
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[] {1,1}));
    }
}
