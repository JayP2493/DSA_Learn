import java.util.Arrays;

public class BuildArrayFromPermutation_1920 {
    public static void main(String[] args) {
        int[] a = {0,2,1,5,3,4};
        int[] b = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(a)));
        System.out.println(Arrays.toString(buildArray(b)));
    }
    public static int[] buildArray(int[] nums) {
        int[] ansArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ansArr[i] = nums[nums[i]];
        }
        return ansArr;
    }
}
