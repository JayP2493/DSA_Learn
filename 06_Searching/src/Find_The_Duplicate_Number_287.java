import java.util.Arrays;

public class Find_The_Duplicate_Number_287 {
    public static int findDuplicate_HTMethod(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        slow = nums[slow];
        fast = nums[nums[fast]];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return fast;
    }

    public static int findDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length-1;

        while (low < high) {
            int mid = low + (high-low)/2;
            int count = 0;
            for(int x : nums) {
                if (x <= mid) {
                    count++;
                }
            }

            if (count > mid) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[] {1,3,4,2,2}) == 2);
        System.out.println(findDuplicate(new int[] {3,1,3,4,2}) == 3);
        System.out.println(findDuplicate(new int[] {3,3,3,3,3}) == 3);
        System.out.println(findDuplicate(new int[] {2,1,1,1,4}) == 1);
        System.out.println(findDuplicate(new int[] {7,9,7,4,2,8,7,7,1,5}) == 7);
    }
}
