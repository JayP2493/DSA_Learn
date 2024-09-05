public class Maximum_Subarray_53 {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSubArray(new int[] {1}));
        System.out.println(maxSubArray(new int[] {5,4,-1,7,8}));
    }
    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else {
            int maxSum = Integer.MIN_VALUE;
            int currentSum = 0;
            for (int i = 0; i < nums.length; i++) {
                currentSum += nums[i];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }

                if (currentSum < 0) {
                    currentSum = 0;
                }
            }
            return maxSum;
        }
    }
}
