import java.util.Arrays;

public class Running_Sum_of_1d_Array_1480 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[] {1,2,3,4})));
        System.out.println(Arrays.toString(runningSum(new int[] {1,1,1,1,1})));
        System.out.println(Arrays.toString(runningSum(new int[] {3,1,2,10,1})));
    }
    public static int[] runningSum(int[] nums) {
        arr(nums,0,0);
        return nums;
    }
    public static void arr(int[] nums, int sum, int i) {
        if (nums.length > i) {
            int ans = sum + nums[i];
            arr(nums,ans,i+1);
            nums[i] = ans;
        }
    }
}
