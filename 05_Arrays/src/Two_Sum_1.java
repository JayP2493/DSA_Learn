import java.util.Arrays;

public class Two_Sum_1 {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {0,0};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] {2,7,11,15},9)));
        System.out.println(Arrays.toString(twoSum(new int[] {3,2,4},6)));
        System.out.println(Arrays.toString(twoSum(new int[] {3,3},6)));
    }
}
