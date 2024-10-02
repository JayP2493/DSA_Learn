import java.util.Arrays;

public class Frequency_Of_The_Most_Frequent_Element_Sliding_1838 {
    public static int maxFrequency(int[] nums, int k) {
        int windowStart = 0;
        int windowEnd = 0;

        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int target = nums[i];
            currentSum += nums[i];
            int ops = currentSum - ((i - windowStart + 1) * nums[i]);

            while (ops > k) {
                currentSum -= nums[windowStart];
                windowStart++;
                ops = currentSum - ((i - windowStart + 1) * nums[i]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(maxFrequency(new int[] {1,2,4}, 5) == 3);
        System.out.println(maxFrequency(new int[] {1,4,8,13},5) == 2);
        System.out.println(maxFrequency(new int[] {3,9,6},2));
    }
}
