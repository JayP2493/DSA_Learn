import java.util.Arrays;

public class BuildArrayFromPermutation_1920_2 {
    public static void main(String[] args) {
        int[] a = {0,2,1,5,3,4};
        int[] b = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(a)));
        System.out.println(Arrays.toString(buildArray(b)));
    }
    public static int[] buildArray(int[] nums) {
        permutation(nums,0);
        return nums;
    }
    public static void permutation(int[] nums,int start){
        if(start < nums.length) {
            int ans = nums[nums[start]];
            permutation(nums,start+1);
            nums[start] = ans;
        }
    }
}
