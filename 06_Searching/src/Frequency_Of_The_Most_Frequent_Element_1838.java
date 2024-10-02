import java.util.Arrays;

public class Frequency_Of_The_Most_Frequent_Element_1838 {
    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int result = 1;
        int[] preSum = new int[nums.length];
        preSum[0] = nums[0];


        for (int i = 1; i < preSum.length; i++) {
            preSum[i] += preSum[i-1]+nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int freq = bSearch(i,nums,k,preSum);
            result = Math.max(freq,result);
        }

        return result;
    }

    public static int bSearch(int i, int[] arr, int k, int[] preSum) {
        int start = 0;
        int end = i;
        int ans = i;

        while (start <= end) {
            int mid = start + ((end-start)/2);
            int windowSum = (i-mid+1) * arr[i];
            int origenalSum = preSum[i] - preSum[mid] + arr[mid];
            int opsRequire = windowSum - origenalSum;

            if (opsRequire > k) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }

        return (i-ans+1);
    }

    public static void main(String[] args) {
        System.out.println(maxFrequency(new int[] {1,2,4}, 5) == 3);
        System.out.println(maxFrequency(new int[] {1,4,8,13},5) == 2);
        System.out.println(maxFrequency(new int[] {3,9,6},2));
    }
}
